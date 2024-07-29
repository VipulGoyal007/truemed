package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.gson.Gson
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.UploadPrescriptionBottomsheetBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.roundToInt

@AndroidEntryPoint
class UploadPrescriptionBottomSheet(
    private val onCameraClick: () -> Unit,
    private val onGalleryClick: () -> Unit,
    private val viewModel: PrescriptionViewModel,
    private val fromPage: String
) : BottomSheetDialogFragment(){
    private lateinit var dialog: BottomSheetDialog
    lateinit var binding : UploadPrescriptionBottomsheetBinding
    var bottomSheet : PastPrescriptionBottomSheet? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.upload_prescription_bottomsheet, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        setVisibility()
        setApiCall()
        viewModel.getViewMoreLessList()
        return binding.root
    }

    private fun setVisibility() {
        if (viewModel.medicineOgList.value?.size!! > 2 && viewModel.showMedicineList.value == true) {
           binding.btnLessMore.visibility = View.VISIBLE
        } else {
            binding.btnLessMore.visibility = View.GONE
        }
//        if(viewModel.medicineOgList.value!!.isNotEmpty() && viewModel.showMedicineList.value == true){
//            binding.tvPrescriptionDetail.visibility = View.VISIBLE
//        } else {
//            binding.tvPrescriptionDetail.visibility = View.GONE
//        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        dialog = BottomSheetDialog(requireActivity(), theme)
        (dialog as BottomSheetDialog).behavior.state= BottomSheetBehavior.STATE_EXPANDED

  /*      setUpBottomSheetBehaviour(
            dialog,
            true,
            6,
            if (viewModel.medicineOgList.value!!.isNotEmpty() && viewModel.showMedicineList.value == true) 60 else 35
        )*/
        return dialog
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setEventListeners()
    }

    private fun setEventListeners() {
        binding.imageClose.setOnClickListener(View.OnClickListener {
            if (dialog.isShowing) {
                dialog.dismiss()
            }
        })

        binding.pastPrescriptionCtl.setOnClickListener(View.OnClickListener {

            if(!viewModel.patientDetails.isNullOrEmpty()){
                viewModel.setEventForUploadPrescriptionClicked("past prescriptions",fromPage)
                dialog.dismiss()
                Log.d("TAG", "setEventListeners upload: ${Gson().toJson(viewModel.patientDetails)}")
                bottomSheet = PastPrescriptionBottomSheet(viewModel.patientDetails!!,viewModel)
                bottomSheet!!.isCancelable = true
                if (!bottomSheet!!.isVisible)
                    bottomSheet!!.show(
                        requireActivity().supportFragmentManager, "PastPrescriptionBottomSheet"
                    )
            }
           /* viewModel.patientDetails.observe(requireActivity()) {
                if(!it.isNullOrEmpty()){
                    dialog.dismiss()
                    Log.d("TAG", "setEventListeners upload: ${Gson().toJson(it)}")
                    val bottomSheet = PastPrescriptionBottomSheet(it)
                    bottomSheet.isCancelable = true
                    if (!bottomSheet.isVisible)
                        bottomSheet.show(
                            requireActivity().supportFragmentManager, "PastPrescriptionBottomSheet"
                        )
                }
            }*/

        })

        binding.btnNoPrescription.setOnClickListener {
            dismiss()
            viewModel.setCartCount()
            val bottomSheet = DoNotHavePrescriptionBottomSheet(fromPage)
            bottomSheet.setViewModel(viewModel)
            bottomSheet.isCancelable = true
            if (!bottomSheet.isVisible)
                bottomSheet.show(
                    requireActivity().supportFragmentManager, "DoNotHavePrescriptionBottomSheet"
                )
        }

        binding.cameraCtl.setOnClickListener {
            dismiss()
            onCameraClick.invoke()
        }

        binding.galaryCtl.setOnClickListener {
            dismiss()
            onGalleryClick.invoke()
        }
    }

    override fun getTheme(): Int { return R.style.BottomSheetDialog }

    private fun setApiCall() {
        //get prescription images
        viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)

        //get all patients data for past prescription patient list
        Log.d("TAG", "setApiCallbefore ${SharedPrefManager.getInstance().loggedInUserAccessToken}")
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
            Log.d("TAG", "setApiCall: ${SharedPrefManager.getInstance().loggedInUserAccessToken}")
            viewModel.getAllPatientDetails()
        }
    }
}