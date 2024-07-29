package com.intellihealth.truemeds.presentation.bottomsheet.home

import android.Manifest
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.app.ApplicationClass
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import com.intellihealth.truemeds.data.utils.checkPermissionsForContact
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.BottomsheetSaveNumberBinding
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.analytics.MixPanelEvent
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc

import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import org.json.JSONObject


class SaveNumberBottomSheet() : BottomSheet() {

    lateinit var viewModel: HomeViewModel
    private var binding: BottomsheetSaveNumberBinding? = null

    constructor(viewModel: HomeViewModel) : this() {
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
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_save_number, container, false)

        binding!!.btnSaveContact.setOnClickListener {
            if(::viewModel.isInitialized) {
                val requiredPermissions = arrayOf(
                    Manifest.permission.WRITE_CONTACTS,
                    Manifest.permission.READ_CONTACTS
                )
                if (checkPermissionsForContact(requireActivity())) {
                    viewModel.showLoadingOnSaveContact.postValue(true)
                    viewModel.fetchTruemedsContact()
                } else {
                    // Request the permissions
                    if (activity != null) {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(
                                requireActivity(),
                                requiredPermissions[0]
                            )
                        ) {
                            showRationalDialog()
                        } else {
                            // No explanation needed, we can request the permission.
                            requestPermissions(requireActivity(), requiredPermissions)
                        }
                    }

                }
                viewModel.sendContactBottomSheetSavedClicked()
            }
        }

        binding!!.imgClose.setOnClickListener {
            closeBottomSheet()
            dismiss()
        }

        if (::viewModel.isInitialized) {
            viewModel.dismissBottomSheetAfterSaveContact.observe(requireActivity()) { aBoolean: Boolean ->
                if (aBoolean) {
                    closeBottomSheet()
                }
            }


            viewModel.isContactPermissionGranted.observe(requireActivity()) { aBoolean: Boolean ->
                if (aBoolean) {
                    viewModel.showLoadingOnSaveContact.postValue(true)
                    viewModel.fetchTruemedsContact()
                }
            }
        }

        return binding!!.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.let {
            if (::viewModel.isInitialized) {
                it.viewmodel = viewModel
                it.lifecycleOwner = activity
            }
        }

        binding?.imgCall?.setOnClickListener {
            View.OnClickListener {
                closeBottomSheet()
                dismiss()
            }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener { dialogInterface: DialogInterface? ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog?
            setupFullHeight(bottomSheetDialog!!)
        }

        return dialog
    }

    var behavior: BottomSheetBehavior<*>? = null
    fun setupFullHeight(bottomSheetDialog: BottomSheetDialog) {

        //this condition is commented for now
        /*    val bottomSheet: FrameLayout? = bottomSheetDialog.findViewById(R.id.design_bottom_sheet)
            if (bottomSheet != null) {
                BottomSheetBehavior.from(bottomSheet).apply {
                    peekHeight = getWindowHeight()
                    state = BottomSheetBehavior.STATE_COLLAPSED
                }


            }*/
    }

    fun getWindowHeight(): Int {
        return (binding!!.clSaveCall.height
                + CommonFunc.dpToPixel(
            context,
            140f
        ))
    }

    override fun getTheme() = R.style.BottomSheetDialog

    private fun checkPermissions(context: Context, permissions: Array<String>): Boolean {
        for (permission in permissions) {
            if (ContextCompat.checkSelfPermission(
                    context,
                    permission
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return false
            }
        }
        return true
    }

    private fun requestPermissions(activity: FragmentActivity, permissions: Array<String>) {
        ActivityCompat.requestPermissions(
            activity,
            permissions,
            ApiEndpointConstants.MY_PERMISSIONS_REQUEST_CONTACT
        )
    }

    /*override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == Constants.MY_PERMISSIONS_REQUEST_CONTACT) {
            if (grantResults.all { it == PackageManager.PERMISSION_GRANTED }) {
                //viewModel.writeSavedContactsInsidePhoneBook()
                //TODO ShowLoader
                viewModel.showLoadingOnSaveContact.postValue(true)
                viewModel.fetchTruemedsContact()
            } else {
                //permission denied
                if (!ActivityCompat.shouldShowRequestPermissionRationale(
                        requireActivity(),
                        Manifest.permission.WRITE_CONTACTS
                    )
                ) {
                    // Do something if permission is not granted and the user has also checked the **"Don't ask again"**
                    showRationalDialog()
                } else if (grantResults.isNotEmpty() && grantResults[0] === PackageManager.PERMISSION_DENIED) {
                    // Do something if permission not granted
                    showRationalDialog()
                }

//                closeBottomSheet()

            }
        }
    }*/

    /*private fun requestContactsPermission() {
        ActivityCompat.requestPermissions(
            requireActivity(), arrayOf(Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_CONTACTS),
            MY_PERMISSIONS_REQUEST_CONTACT
        )
    }*/
    fun closeBottomSheet() {
        try {
            SharedPrefManager.getInstance().isContactSheetClosed = true
            dialog?.dismiss()
        } catch (_: Exception) {
        }
    }

    private fun showRationalDialog() {
        // Show an explanation to the user *asynchronously* -- don't block
        // this thread waiting for the user's response! After the user
        // sees the explanation, try again to request the permission.
        if (isAdded) {
            AlertDialog.Builder(requireContext())
                .setTitle("Permissions Required")
                .setMessage(
                    "You have denied contacts permission which is required " +
                            "for this action. Please open settings, go to permissions and allow them."
                )
                .setPositiveButton(android.R.string.ok) { dialog: DialogInterface, which: Int ->
                    dialog.dismiss()
                    closeBottomSheet()
                    val intent = Intent(
                        Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                        Uri.fromParts("package", requireActivity().packageName, null)
                    )
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                }
                .setCancelable(false)
                .show()
        }
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        SharedPrefManager.getInstance().isContactSheetClosed = true
    }
}
