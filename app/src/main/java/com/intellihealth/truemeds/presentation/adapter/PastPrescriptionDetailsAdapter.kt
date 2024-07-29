package com.intellihealth.truemeds.presentation.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.salt.constants.CheckFieldConstants
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.prescription.ActiveRx
import com.intellihealth.truemeds.databinding.ManageAddressCardItemBinding
import com.intellihealth.truemeds.databinding.PastPrescriptionAllPatientItemBinding
import com.intellihealth.truemeds.databinding.PastPrescriptionDetailsBinding
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event


class PastPrescriptionDetailsAdapter(var parentIndex: Int,
                                     var prescriptionDetailList: List<ActiveRx>,
                                     var viewModel: PrescriptionViewModel) : RecyclerView.Adapter<PastPrescriptionDetailsAdapter.MyViewHolder>() {
    lateinit var binding : PastPrescriptionDetailsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PastPrescriptionDetailsAdapter.MyViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.past_prescription_details, parent, false
        )
        viewModel.setUpUploadButtonVisibility()
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return prescriptionDetailList.size
    }

    init {
        setHasStableIds(true)
    }
    override fun onBindViewHolder(holder: PastPrescriptionDetailsAdapter.MyViewHolder, position: Int) {



      //  holder.bind(prescriptionDetailList[position], viewModel, parentIndex, position)

        //temporary binding the different image id with each view holder
      //  holder.pastPrescriptionBinding.uploadedImageIdTxt.text= viewModel.pastPrescription.value?.get(parentIndex)?.activeRxList?.get(position)?.imageId.toString()



        with(holder.binding) {

          //  var currentItem=   viewModel.pastPrescription.value?.get(parentIndex)?.activeRxList?.get(position)!!
            var currentItem=   prescriptionDetailList[position]

            model = currentItem
            index = parentIndex
            viewmodel = viewModel
            childIndex = position

            uploadedImageIdTxt.text= currentItem?.uniqueId.toString()

            if (viewModel.uploadedPastRx.contains(currentItem.imageId)) {
                Log.e("all_itemsss:::","111:::"+position+":::"+currentItem.toString())
                uploadedTxt.visibility = View.VISIBLE
                customCheckBox.visibility = View.INVISIBLE
                uploadedTxt.text = "Uploaded"

            } else {
                customCheckBox.visibility = View.VISIBLE
                uploadedTxt.visibility = View.INVISIBLE
                Log.e("all_itemsss:::","000:::"+parentIndex+"::::"+position+":::"+
                        uploadedImageIdTxt.text.toString())

                //this logic is commented for now
                // if (viewModel.currentSelectedPrescriptionList.containsKey( binding.uploadedImageIdTxt.text.toString().toLong())) {

                if (viewModel.currentSelectedPrescriptionList.containsKey( uploadedImageIdTxt.text.toString().toLong())) {
                    // if (viewModel.currentSelectedPrescriptionList.containsKey( uploadedImageIdTxt.text.toString().toLong())) {
                    //  Log.e("all_itemsss:::","222:::"+childPosition+":::"+item.toString())
                    customCheckBox.updateLabel("Selected")
                    prescriptionDetailList[position].selected=true
                    customCheckBox.setState(CheckFieldConstants.STATE_SELECTED)
                } else {
                    //    Log.e("all_itemsss:::","333:::"+childPosition+":::"+item.toString())
                    customCheckBox.updateLabel("Select")
                    prescriptionDetailList[position].selected=false
                    customCheckBox.setState(CheckFieldConstants.STATE_UNSELECTED)
                }

            }




        }

       // holder.pastPrescriptionBinding.customCheckBox.setOnClickListener(View.OnClickListener {
        holder.binding.customCheckBox.setOnClickListener(View.OnClickListener {

            var tempKey=holder.binding.uploadedImageIdTxt.text.toString().toLong()


            if (viewModel.currentSelectedPrescriptionList.isNullOrEmpty() || !viewModel.currentSelectedPrescriptionList.containsKey(tempKey))  {

                    holder.binding.customCheckBox.updateLabel("Selected")
                    holder.binding.customCheckBox.setState(CheckFieldConstants.STATE_SELECTED)
                viewModel.pastPrescription.value?.get(parentIndex)?.activeRxList?.get(position)?.selected=true

                Log.e("clickeddd:::","111:::"+parentIndex.toString()+":::::"+position.toString()+":::"+
                        holder.binding.uploadedImageIdTxt.text.toString())
                viewModel.eventUploadPrescriptionPrescriptionSelected()

                } else {

                    holder.binding.customCheckBox.updateLabel("Select")
                    holder.binding.customCheckBox.setState(CheckFieldConstants.STATE_UNSELECTED)
                viewModel.pastPrescription.value?.get(parentIndex)?.activeRxList?.get(position)?.selected=false

                Log.e("clickeddd:::","222:::"+parentIndex.toString()+":::::"+position.toString()+":::"+
                        holder.binding.uploadedImageIdTxt.text.toString())
                }
                callButtonLogicCLick(viewModel.pastPrescription.value?.get(parentIndex)?.activeRxList?.get(position)!!,parentIndex,position)


        })

        holder.binding.uploadPrescriptionImgCard.setOnClickListener(View.OnClickListener {
            var tempId=parentIndex.toString()+"_"+position.toString()
            var item=   viewModel.pastPrescription.value?.get(parentIndex)?.activeRxList?.get(position)!!

            callImageLogicCLick(tempId,item)
          //  viewModel.pastRXClicked.postValue(Event(Pair(tempId, item?.imageUrl!!)))
        })


    }
    fun callImageLogicCLick(tempId:String, item:ActiveRx)
    {
        Log.e("parent_pos","000:::"+tempId+":::"+item)
        viewModel.onPastImageClicked(tempId,item?.imageUrl!!)
    }


    fun callButtonLogicCLick(item: ActiveRx,parentIndex:Int,position:Int)
    {
        viewModel.onPastCheckboxClicked(item,parentIndex,position)
    }

    class MyViewHolder(binding: PastPrescriptionDetailsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: PastPrescriptionDetailsBinding

        init {
            this.binding = binding
        }
    }



/* inner class MyViewHolder(itemView: PastPrescriptionDetailsBinding) : RecyclerView.ViewHolder(itemView.root) {
     var pastPrescriptionBinding: PastPrescriptionDetailsBinding = itemView
     @SuppressLint("SetTextI18n")
     fun bind(item: ActiveRx, viewModel: PrescriptionViewModel, parentIndex: Int, childPosition: Int)  = with(binding) {
         Log.d("TAG", "bind: $item")
         model = item
         index = parentIndex
         viewmodel = viewModel
         childIndex = childPosition

        // uploadedImageIdTxt.text= viewModel.pastPrescription.value?.get(parentIndex)?.activeRxList?.get(childPosition)?.uniqueKey.toString()
         uploadedImageIdTxt.text= item?.imageId.toString()


         if (viewModel.uploadedPastRx.contains(item.imageId)) {
              Log.e("all_itemsss:::","111:::"+childPosition+":::"+item.toString())
             binding.uploadedTxt.visibility = View.VISIBLE
             binding.customCheckBox.visibility = View.INVISIBLE
             binding.uploadedTxt.text = "Uploaded"

         } else {
             binding.customCheckBox.visibility = View.VISIBLE
             binding.uploadedTxt.visibility = View.INVISIBLE
             Log.e("all_itemsss:::","000:::"+parentIndex+"::::"+childPosition+":::"+
                     binding.uploadedImageIdTxt.text.toString())

             //this logic is commented for now
            // if (viewModel.currentSelectedPrescriptionList.containsKey( binding.uploadedImageIdTxt.text.toString().toLong())) {

             if (viewModel.currentSelectedPrescriptionList.containsKey( uploadedImageIdTxt.text.toString().toLong())) {
                 // if (viewModel.currentSelectedPrescriptionList.containsKey( uploadedImageIdTxt.text.toString().toLong())) {
               //  Log.e("all_itemsss:::","222:::"+childPosition+":::"+item.toString())
                 binding.customCheckBox.updateLabel("Selected")
                 prescriptionDetailList[childPosition].selected=true
                 binding.customCheckBox.setState(CheckFieldConstants.STATE_SELECTED)
             } else {
             //    Log.e("all_itemsss:::","333:::"+childPosition+":::"+item.toString())
                 binding.customCheckBox.updateLabel("Select")
                 prescriptionDetailList[childPosition].selected=false
                 binding.customCheckBox.setState(CheckFieldConstants.STATE_UNSELECTED)
             }

         }


       /*  uploadPrescriptionImgCard.setOnClickListener {
             viewModel.pastRXClicked.postValue(Event(Pair(childPosition, item.imageUrl)))
         }*/

     }
 } */

 override fun getItemId(position: Int): Long {
     return prescriptionDetailList[position].imageId
 }

}