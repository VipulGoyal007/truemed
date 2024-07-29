package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.Manifest
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.net.Uri
import android.os.Bundle
import android.os.Looper
import android.provider.Settings
import android.text.Editable
import android.text.TextWatcher
import android.util.DisplayMetrics
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.location.LocationManagerCompat
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationAvailability
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.gms.location.LocationSettingsResponse
import com.google.android.gms.location.LocationSettingsStatusCodes
import com.google.android.gms.tasks.Task
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.ChooseLocationCallback
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.BottomsheetLocationBinding
import com.intellihealth.truemeds.domain.navigation.navigateToManageAddressActivity
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.activity.ManageAddressActivity
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.fragment.HomeFragment
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import java.io.IOException
import java.util.Locale


class LocationBottomSheet() : BottomSheetDialogFragment() {
    private lateinit var binding: BottomsheetLocationBinding
    private var bottomSheetDialog: BottomSheetDialog? = null

    //private var header: Boolean = true
    private var isUserLoggedIn = false
    private var fusedLocationProvider: FusedLocationProviderClient? = null
    private val locationRequest: LocationRequest = LocationRequest.create().apply {
        interval = 30
        fastestInterval = 10
        priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
        maxWaitTime = 60
    }
    private lateinit var viewModel: HomeViewModel
    private var behavior: BottomSheetBehavior<*>? = null
    private var callback: ChooseLocationCallback?=null

    constructor(callback: ChooseLocationCallback) : this(){
        this.callback = callback
    }

    fun setUpHomeViewModel(viewModel: HomeViewModel) {
        this.viewModel = viewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.bottomsheet_location, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        if(::viewModel.isInitialized) {
            binding.viewModel = viewModel
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpData()
        clickListeners()
        //  setObservers()
        fusedLocationProvider = LocationServices.getFusedLocationProviderClient(requireActivity());
        binding.clLocationNudge.setOnClickListener {

            checkLocationPermission()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener { dialogInterface: DialogInterface? ->
            bottomSheetDialog = dialogInterface as BottomSheetDialog
            bottomSheetDialog?.let { setupFullHeight(it) }
        }

        (dialog as BottomSheetDialog).behavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                Log.i("onStateChanged", "" + newState)
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                Log.i("onSlide", "" + slideOffset)
                val drawerHeight = bottomSheet.height * slideOffset
                Log.i("drawerHeight", "" + drawerHeight)
            }

        })

        isUserLoggedIn = SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()
        return dialog
    }

    private fun setUpData() {
        binding.callbackLocation = callback
        binding.isUserLoggedIn = isUserLoggedIn
        if (isUserLoggedIn && ::viewModel.isInitialized) {
            /**
             * If user is logged In then only call getSavedAddressList API
             */

            this.viewModel.isLoadingView.postValue(true)
            this.viewModel.getSavedAddressesList(SharedPrefManager.getInstance().loggedInUserId.toLong())

            this.viewModel.getAddressList.observe(viewLifecycleOwner) {
                if (!viewModel.getAddressList.value.isNullOrEmpty() && bottomSheetDialog != null) {
                    setupFullHeight(bottomSheetDialog)
                }
            }
            this.viewModel.pincodeData.postValue(
                ErrorMessageData(
                    "",
                    InputFieldConstants.STATE_DEFAULT
                )
            )
        }
    }

    private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog?) {
        /*val bottomSheet =
            bottomSheetDialog?.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
        val behavior: BottomSheetBehavior<*> = BottomSheetBehavior.from(bottomSheet!!)
        with(behavior){
            isDraggable = true
            isHideable = true
            //skipCollapsed = true
            //peekHeight = bottomSheet.height
            //peekHeight = 50
            state = BottomSheetBehavior.STATE_EXPANDED
        }*/
        val bottomSheet =
            bottomSheetDialog!!.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)
        behavior = BottomSheetBehavior.from(bottomSheet!!)
        val layoutParams = bottomSheet.layoutParams

        val windowHeight = getWindowHeight()
        if (layoutParams != null) {
            layoutParams.height = windowHeight
        }
        bottomSheet.layoutParams = layoutParams
        //(behavior as BottomSheetBehavior<FrameLayout>).isDraggable = true
        (behavior as BottomSheetBehavior<FrameLayout>).isHideable = true
        (behavior as BottomSheetBehavior<FrameLayout>).skipCollapsed = true
        (behavior as BottomSheetBehavior<FrameLayout>).peekHeight = 50
        (behavior as BottomSheetBehavior<FrameLayout>).state = BottomSheetBehavior.STATE_EXPANDED
    }

    private fun getWindowHeight(): Int {
        // Calculate window height for fullscreen use
        var size = 500
        try {
            if (requireActivity() != null) {
                size =

                    if (viewModel.getAddressList.value == null) {
                        binding.viewDragHandle.visibility = View.GONE
                        (behavior as BottomSheetBehavior<FrameLayout>).isDraggable = false
                        binding.nestedScrollView.isNestedScrollingEnabled = false
                        val displayMetrics = DisplayMetrics()
                        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
                        (displayMetrics.heightPixels * 0.37).toInt()
                    } else {
                        if (SharedPrefManager.getInstance().loggedInUserAccessToken == null || viewModel.getAddressList.value!!.isEmpty()) {
                            binding.viewDragHandle.visibility = View.GONE
                            (behavior as BottomSheetBehavior<FrameLayout>).isDraggable = false
                            binding.nestedScrollView.isNestedScrollingEnabled = false
                            val displayMetrics = DisplayMetrics()
                            requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
                            (displayMetrics.heightPixels * 0.37).toInt()
                        }
                        //dpToPixel(requireActivity(), 340f)
                        else if (viewModel.getAddressList.value!!.size <= 2) {
                            binding.viewDragHandle.visibility = View.GONE
                            (behavior as BottomSheetBehavior<FrameLayout>).isDraggable = false
                            binding.nestedScrollView.isNestedScrollingEnabled = true
                            val displayMetrics = DisplayMetrics()
                            requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
                            (displayMetrics.heightPixels * 0.68).toInt()
                        }
                        //dpToPixel(requireActivity(), 340f)
                        else {
                            binding.viewDragHandle.visibility = View.VISIBLE
                            (behavior as BottomSheetBehavior<FrameLayout>).isDraggable = true
                            binding.nestedScrollView.isNestedScrollingEnabled = true
                            val displayMetrics = DisplayMetrics()
                            requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
                            (displayMetrics.heightPixels * 0.9).toInt()
                        }
                    }

            }
        }catch (_:Exception){}
        return size
    }

    private fun clickListeners() {
        binding.tvManageAddress.setOnClickListener {
            dismiss()
            navigateToManageAddressActivity()
        }
        binding.tvLoginToView.setOnClickListener {
            dismiss()
            viewModel.initiateLogin.value = Event("location_popup")
        }
        binding.imageClose.setOnClickListener {

            // viewModel.fetchPinCode("400079")
            if (SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) {
                this.viewModel.isLoadingView.postValue(true)
                viewModel.isDefaultPinCode = true
                callPinCodeApi("400079", false)
                dismiss()
            } else {
                viewModel.pincodeData.postValue(
                    ErrorMessageData(
                        "",
                        InputFieldConstants.STATE_DEFAULT
                    )
                )
                dismiss()

            }
            //  dismiss()
        }

        binding.etInputFieldPinCode.setInputFieldCallback({ etData ->

            viewModel.sendLocationClickToFirebaseEvent(
                FirebaseEventModel(
                    mobile = if (SharedPrefManager.getInstance().loggedInUserMobile.isNullOrEmpty()) null else SharedPrefManager.getInstance().loggedInUserMobile,
                    customerId = if (SharedPrefManager.getInstance().loggedInUserId.isNullOrEmpty()) null else SharedPrefManager.getInstance().loggedInUserId
                )
            )
            if (etData.isEmpty()) {
                updateErrorState(
                    requireContext().getString(R.string.enterValidPinCode),
                    InputFieldConstants.STATE_ERROR
                )
                return@setInputFieldCallback
            }

            if (etData.length < 6) {
                updateErrorState(
                    requireContext().getString(R.string.enterValidPinCode),
                    InputFieldConstants.STATE_ERROR
                )
                return@setInputFieldCallback
            }
            this.viewModel.isLoadingView.postValue(true)
            viewModel.isDefaultPinCode = false
            callPinCodeApi(etData, false)
            viewModel.pincodeSelectedMethod = "pincode_entered"
        }, object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                s?.let {
                    binding.etInputFieldPinCode.setActionButtonEnabled(it.length == 6)
                }
            }

        }) { v, actionId, event ->
            actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL
            false
        }
    }


    fun updateErrorState(msg: String, stateError: InputFieldConstants) {
        with(binding.etInputFieldPinCode) {
            setUpState(stateError)
            setHelperText(msg, stateError)

        }
    }

    fun checkLocationPermission() {
        try {
            if (ActivityCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(
                        requireActivity(),
                        Manifest.permission.ACCESS_FINE_LOCATION
                    )
                ) {
                    if (context != null) {
                        AlertDialog.Builder(requireContext())
                            .setTitle("Permissions Required")
                            .setMessage("You have denied location permission which is required for this action. Please open settings, go to permissions and allow them.")
                            .setPositiveButton(android.R.string.ok) { dialog, which ->
                                dialog.dismiss()
                                val intent = Intent(
                                    Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                                    Uri.fromParts("package", context?.packageName, null)
                                )
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                startActivity(intent)
                            }
                            .setCancelable(false)
                            .show()
                    }
                } else {
                    requestLocationPermission()
                }
            } else {
                checkLocationEnablePopup()
            }
        } catch (e: Exception) {
        }
    }


    private val locationCallback: LocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            super.onLocationResult(locationResult)
            val list: List<Location> = locationResult.locations
            val location: Location? = if (list.isNotEmpty()) {
                list[list.size - 1]
            } else {
                locationResult.lastLocation
            }

            getLocalityName(location?.latitude!!, location.longitude)

        }

        override fun onLocationAvailability(locationAvailability: LocationAvailability) {
            super.onLocationAvailability(locationAvailability)
        }
    }

    private fun showEnableLocationPopup() {
        val mLocationRequest = LocationRequest.create()
        mLocationRequest.setInterval(10)
        mLocationRequest.setSmallestDisplacement(10f)
        mLocationRequest.setFastestInterval(10)
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
        val builder = LocationSettingsRequest.Builder()
        builder.addLocationRequest(mLocationRequest)
        val task: Task<LocationSettingsResponse> =
            LocationServices.getSettingsClient(this.requireActivity())
                .checkLocationSettings(builder.build())
        task.addOnSuccessListener { response ->
            try {
//                val response: LocationSettingsResponse = task1.getResult(ApiException::class.java)
                var status = response.locationSettingsStates
                Log.d("TAG", "showEnableLocationPopup: ${response.locationSettingsStates}")
                if (status!!.isLocationPresent) {
                    Log.d(
                        "TAG",
                        "showEnableLocationPopup: device is ready to get location ${response.locationSettingsStates}"
                    )
                }

                // All location settings are satisfied. The client can initialize location
                // requests here.
            } catch (exception: ApiException) {
                when (exception.statusCode) {
                    LocationSettingsStatusCodes.RESOLUTION_REQUIRED ->                         // Location settings are not satisfied. But could be fixed by showing the
                        // user a dialog.
                        try {
                            // Cast to a resolvable exception.
                            val resolvable = exception as ResolvableApiException
                            // Show the dialog by calling startResolutionForResult(),
                            // and check the result in onActivityResult().
                            resolvable.startResolutionForResult(
                                requireActivity(),
                                HomeSectionConstants.REQUEST_CHECK_SETTINGS
                            )
                        } catch (e: IntentSender.SendIntentException) {
                            // Ignore the error.
                        } catch (e: ClassCastException) {
                            // Ignore, should be an impossible error.
                        }

                    LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE -> {}
                }
            }
        }
            .addOnFailureListener { e -> //invoked if gps is disable and of
                val statusCode = (e as ResolvableApiException).statusCode
                if (statusCode == LocationSettingsStatusCodes.RESOLUTION_REQUIRED) {
                    try {
                        Log.d("TAG", "showEnableLocationPopup: gps is off")
                        e.startResolutionForResult(
                            requireActivity(),
                            HomeSectionConstants.REQUEST_CHECK_SETTINGS
                        )
                    } catch (sendEx: IntentSender.SendIntentException) {
                        e.printStackTrace()
                    }
                }


            }
    }

    private fun isLocationEnabled(context: Context): Boolean {
        val locationManager =
            context.getSystemService(AppCompatActivity.LOCATION_SERVICE) as LocationManager
        return LocationManagerCompat.isLocationEnabled(locationManager)
    }

    fun getCurrentGPSLocation() {
        this.viewModel.isLoadingView.postValue(true)
        fusedLocationProvider?.requestLocationUpdates(
            locationRequest,
            locationCallback,
            Looper.getMainLooper()
        )
        if (isAdded) {
            fusedLocationProvider?.lastLocation?.addOnSuccessListener(requireActivity()) { location: Location? ->
                if (location != null) {
                    getLocalityName(location?.latitude!!, location.longitude)
                }
            }?.addOnFailureListener {
                viewModel.sendUseLocationClickedEvent(
                        MxUseLocationClicked(
                                addressLine2 = "",
                                city = "",
                                clickedOnPage = "homepage",
                                pincode = "",
                                pincodeFetched = false,
                                pincodeFetchedResponse = "failed",
                                serviceable = false,
                                state = "",
                                order_id = if (SharedPrefManager.getInstance().incompleteOrderId > 0) SharedPrefManager.getInstance().incompleteOrderId.toString() else null
                        )
                )
            }
        }
    }


    fun callPinCodeApi(value: String, locationClicked: Boolean) {

        if (isNetworkAvailable(requireContext())) {
            viewModel.fetchPinCode(value, locationClicked)
        } else {
            this.viewModel.isLoadingView.postValue(false)
            (activity as BaseActivity).showDialogBox(
                popUpType = PopUpType.INTERNET_FAILURE,
                object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {}
                    override fun onCloseButtonClicked() {
                    }
                }, true
            )

        }

    }

    private fun getLocalityName(lat: Double, lng: Double) {
        try {
            val gcd = Geocoder(requireContext(), Locale.getDefault())
            var addresses: List<Address>? = null
            try {
                addresses = gcd.getFromLocation(lat, lng, 1)
            } catch (e: IOException) {
                e.printStackTrace()
            }
            if (!addresses.isNullOrEmpty()) {
                fusedLocationProvider!!.removeLocationUpdates(locationCallback)
                if (addresses[0].postalCode == null) {
                    this.viewModel.isLoadingView.postValue(false)
                    viewModel.pincodeData.postValue(
                        ErrorMessageData(
                            requireActivity().getString(R.string.unableToFetchLocation),
                            InputFieldConstants.STATE_WARNING
                        )
                    )
                    binding.etInputFieldPinCode.setInputFieldData("")
                } else {
                    binding.etInputFieldPinCode.setInputFieldData(addresses[0].postalCode)
                    val streetAddressLines: String = addresses[0].getAddressLine(0)
                    Log.d(
                        "TAG",
                        "getCurrentGPSLocation: getLocalityName streetAddressLines $streetAddressLines"
                    )

                    //performing check button click over here also
                    viewModel.isDefaultPinCode = false
                    callPinCodeApi(addresses[0].postalCode, true)

                    val addressArray =
                        streetAddressLines.split(",".toRegex()).dropLastWhile { it.isEmpty() }
                            .toTypedArray()
                    var streetAddress = StringBuilder()
                    if (addressArray.size > 3) {
                        for (i in 1 until addressArray.size - 3) {
                            if (streetAddress.isEmpty()) {
                                streetAddress = StringBuilder(addressArray[i])
                                continue
                            }
                            streetAddress.append(", ").append(addressArray[i])
                        }
                    } else {
                        Log.e("TAG", "getLocalityName: size is 3 : address: $streetAddressLines")
                    }
                }
                viewModel.pincodeSelectedMethod = "use_current_location";
            } else {
                this.viewModel.isLoadingView.postValue(false)
                fusedLocationProvider!!.removeLocationUpdates(locationCallback)

            }
        } catch (ignore: Exception) {
            this.viewModel.isLoadingView.postValue(false)
            ignore.message
        }


    }


    private fun requestLocationPermission() {
        ActivityCompat.requestPermissions(
            requireActivity(),
            arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION),
            HomeSectionConstants.LOCATION_PERMISSIONS_REQUEST
        )
    }

    override fun getTheme() = R.style.BottomSheetDialog

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == HomeSectionConstants.REQUEST_CHECK_SETTINGS) {
            Log.d("TAG", "onActivityResult: called ")
        }
    }

    fun checkLocationEnablePopup() {
        if (isLocationEnabled(requireActivity())) {
            //access location here
//                manageAddressViewModel.isPincodeServicable.postValue(false)
            getCurrentGPSLocation()
//                manageAddressViewModel.isLocationPermissionGranted.postValue(false)
        } else {
            showEnableLocationPopup()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        // android.widget.Toast.makeText(requireActivity(), "Location permission request by user from bottomsheet!", android.widget.Toast.LENGTH_LONG).show()
    }

    override fun onDismiss(dialog: DialogInterface) {
        if (SharedPrefManager.getInstance().selectedWarehouseID.isEmpty()) {
            viewModel.isDefaultPinCode = true
            callPinCodeApi("400079", false)
        }
        HomeFragment.isLocationBottomSheetOpened = false
        viewModel.pincodeData.postValue(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))
        super.onDismiss(dialog)
    }

    /*
        private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog?) {
            val bottomSheet =
                bottomSheetDialog?.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)

            //Retrieve bottom sheet parameters

    //        val bottomSheetLayoutParams = bottomSheet?.layoutParams
    //        bottomSheetLayoutParams?.height = getBottomSheetDialogDefaultHeight()
    //        Log.i("default height",""+getBottomSheetDialogDefaultHeight())
    //
    //        val expandedHeight = bottomSheetLayoutParams?.height
    //        Log.i("expandedHeight",""+expandedHeight)
    //        val peekHeight =
    //            (expandedHeight?.div(1.5)) //Peek height to 70% of expanded height (Change based on your view)
    //        Log.i("expandedHeight",""+peekHeight)

            //Setup bottom sheet
            //bottomSheet.layoutParams = bottomSheetLayoutParams
            BottomSheetBehavior.from(bottomSheet!!).state = BottomSheetBehavior.STATE_HALF_EXPANDED
            BottomSheetBehavior.from(bottomSheet).skipCollapsed = true
            BottomSheetBehavior.from(bottomSheet).peekHeight =bottomSheet.height
    //        BottomSheetBehavior.from(bottomSheet).isFitToContents = false
            BottomSheetBehavior.from(bottomSheet).isHideable = true
            BottomSheetBehavior.from(bottomSheet).isDraggable = true
    //        BottomSheetBehavior.from(bottomSheet).expandedOffset = 90
        }
    */

    /*  private fun getWindowHeight(): Int {
          val displayMetrics = DisplayMetrics()
          requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
          Log.i("window height",""+(displayMetrics.heightPixels).toInt())
          return (displayMetrics.heightPixels).toInt()
      }
  */
    private fun getBottomSheetDialogDefaultHeight(): Int {
        Log.i("bottomsheetheight", "" + (getWindowHeight() * (95 / 100)))
        return getWindowHeight() * 75 / 100

    }

}