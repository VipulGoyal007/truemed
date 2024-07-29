package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.SimpleItemAnimator
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.intellihealth.salt.callbacks.DropDownListener
import com.intellihealth.salt.constants.DropDownState
import com.intellihealth.salt.models.DropDownDefaultModel
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.PastPrescriptionBottomsheetBinding
import com.intellihealth.truemeds.presentation.adapter.PastPrescriptionAdapter
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RxPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PastPrescriptionBottomSheet()
    : BottomSheetDialogFragment() {
    private lateinit var dialog: BottomSheetDialog
    lateinit var binding: PastPrescriptionBottomsheetBinding
//    private val viewModel by lazy { ViewModelProvider(requireActivity())[PrescriptionViewModel::class.java] }
    var patientId: Int = 0
    var concatAdapter = ConcatAdapter()
    var dropDownDefaultModelsList: List<DropDownDefaultModel> = emptyList()
    var viewModel: PrescriptionViewModel?=null

    constructor(dropDownDefaultModelsList: List<DropDownDefaultModel>, viewModel: PrescriptionViewModel) : this(){
        this.dropDownDefaultModelsList = dropDownDefaultModelsList
        this.viewModel = viewModel
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.past_prescription_bottomsheet,
            container,
            false
        )
//        this.closeBottomSheetDialog = requireActivity()
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        setUpConcatAdapter()
        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialog = BottomSheetDialog(requireActivity(), theme)
        (dialog as BottomSheetDialog).behavior.state= BottomSheetBehavior.STATE_EXPANDED
        //val dialog = super.onCreateDialog(savedInstanceState)

      /*  setUpBottomSheetBehaviour(
            dialog,
            true,
            6,
            90
        )*/
        return dialog
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setEventListeners()
        setUpDropDown()
        setObserver()
    }

    private fun setObserver() {
        viewModel?.eventMessageForPrescription?.observe(requireActivity(), com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver {
          if(it != null) {
              when {
                  it.equals(MESSAGES.NO_NETWORK) -> {
                      viewModel?.getAllPrescriptionDetails(patientId)
                  }
              }
          }
        })
    }
    private fun setUpDropDown() {

        viewModel?.getAllPrescriptionDetails(dropDownDefaultModelsList[0].id)
        if(dropDownDefaultModelsList?.size == 1){
            binding.dropDownDefault.visibility = View.GONE
            binding.tvPatientNameHeader.visibility = View.VISIBLE
            binding.tvPatientNameHeader.text = dropDownDefaultModelsList[0].title
        } else{
            binding.dropDownDefault.visibility = View.GONE
            binding.dropDownHeader.visibility = View.VISIBLE
            binding.dropDownHeader.setLabel(dropDownDefaultModelsList[0].title/*.substring(0, dropDownDefaultModelsList[0].title.lastIndexOf("("))*/) //comment as per tejas said


            binding.dropDownDefault.setAdapter(
                object : DropDownListener {
                    override fun dropDownData(id: Int, data: String) {
                        binding.dropDownHeader.setLabel(data/*.substring(0, data.lastIndexOf("("))*/) //comment as per tejas said
                        patientId = id
                        binding.patientId = id.toString()
                        viewModel?.getAllPrescriptionDetails(patientId)
                        binding.dropDownDefault.visibility = View.GONE
                        binding.dropDownHeader.setStateOpen(DropDownState.CLOSED)
                    }

                    override fun dropDownCount(count: Int) {
                        binding.dropDownHeader.setStateSelected(count > 0)
                    }
                },
                dropDownDefaultModelsList,false
            )

            binding.dropDownHeader.setStateOpen(DropDownState.CLOSED)



            binding.tvPatientNameHeader.visibility = View.GONE

           // binding.tvPatientNameHeader.text = dropDownDefaultModelsList[0].title


            binding.dropDownHeader.setOnClickListener {

                if (binding.dropDownDefault.isVisible) {
                    binding.dropDownHeader.setStateOpen(DropDownState.CLOSED)
                    binding.dropDownDefault.visibility = View.GONE

                } else if(dropDownDefaultModelsList.size >1) {
                  //  binding.tvPatientNameHeader.visibility = View.GONE
                    binding.dropDownHeader.setStateOpen(DropDownState.OPEN)
                    binding.dropDownDefault.visibility = View.VISIBLE
                }
            }


        }



    }


    private fun setUpConcatAdapter() {
        val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.rvAllPatientPastPrescription.layoutManager = layoutManager
        (binding.rvAllPatientPastPrescription.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        binding.rvAllPatientPastPrescription.setHasFixedSize(true)
        binding.rvAllPatientPastPrescription.itemAnimator?.changeDuration = 0;
        binding.rvAllPatientPastPrescription.adapter = concatAdapter
        val adapter = PastPrescriptionAdapter(viewModel)
        adapter.setHasStableIds(true)
        concatAdapter.addAdapter(adapter)

        activity?.let {
            viewModel?.pastPrescription?.observe(it, Observer {list ->
                adapter.notifyDataSetChanged()
                //var concatAdapter = ConcatAdapter()
//                for (i in list.indices) {
                    /*val adapter = PastPrescriptionAdapter(viewModel)
                    adapter.setHasStableIds(true)
                    concatAdapter.addAdapter(adapter)*/
//                concatAdapter.setHasStableIds(true)
//                }
                /*val layoutManager = LinearLayoutManager(it)
                layoutManager.orientation = LinearLayoutManager.VERTICAL
                binding.rvAllPatientPastPrescription.layoutManager = layoutManager
                (binding.rvAllPatientPastPrescription.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
                binding.rvAllPatientPastPrescription.setHasFixedSize(true)
                binding.rvAllPatientPastPrescription.itemAnimator?.changeDuration = 0;
                binding.rvAllPatientPastPrescription.adapter = concatAdapter*/
            })
        }
    }

    private fun setEventListeners() {
        binding.imageClose.setOnClickListener(View.OnClickListener {
            if (dialog?.isShowing!!) {
                dialog?.dismiss()
            }
        })
    }

    override fun getTheme(): Int {
        return R.style.BottomSheetDialog
    }

    override fun onResume() {
        super.onResume()
    }

}