package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.CouponCallback
import com.intellihealth.salt.constants.CouponCtaConstant
import com.intellihealth.salt.models.CouponModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.utils.isSingleClick
import com.intellihealth.truemeds.databinding.AdapterCouponItemBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class CouponAdapter(
    var couponList: List<CouponCodeResponse.Coupon> = ArrayList(),
    var couponViewModel: CouponViewModel,
    var currentCartValue: Double
) : RecyclerView.Adapter<CouponAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterCouponItemBinding

    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_coupon_item,
            parent, false
        )
        binding.viewModel = couponViewModel

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ItemViewHolder,
        position: Int
    ) {
        val item = couponList[position]

        if (item.isCouponApplied) {
            //if(item.currentDate!! > 0) item.currentDate = System.currentTimeMillis()
            if (item.expiryDate!! > 0) item.expiryDate =
                SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
        }

        holder.bindView(item, couponViewModel, currentCartValue)
    }


    class ItemViewHolder(var binding: AdapterCouponItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var lastClickApplyCTA = 0L
        var lastClickApplyBottomSheet = 0L
        var lastClickApplyTNC = 0L

        fun bindView(
            item: CouponCodeResponse.Coupon,
            couponViewModel: CouponViewModel,
            currentCartValue: Double,
            actualExpiryDate: Long? = 0
        ) {

            val couponCallback = object : CouponCallback {
                override fun viewClickCallback(viewType: CouponCtaConstant) {

                    when (viewType) {
                        CouponCtaConstant.APPLY ->
                            item.let {
                                val lastRecordedData = isSingleClick(lastClickApplyCTA)
                                lastClickApplyCTA = lastRecordedData.second
                                if (lastRecordedData.first && !item.isCouponApplied) {
                                    if (SharedPrefManager.getInstance().prescriptionCount > 0 && currentCartValue <= 0.0) {
                                        //only prescription case
                                        couponViewModel.applyCouponClick(item)
                                    } else {
                                        if (currentCartValue >= (item.minCartValue ?: 0)) {
                                            couponViewModel.applyCouponClick(item)
                                        } else {
                                            couponViewModel.openCouponFailed.postValue(Event(item))
                                        }
                                    }
                                }
                            }

                        CouponCtaConstant.TNC ->
                            item.let {

                                val lastRecordedData = isSingleClick(lastClickApplyTNC)
                                lastClickApplyTNC = lastRecordedData.second
                                if (lastRecordedData.first) couponViewModel.openCouponBottomSheet(it)

                            }

                        CouponCtaConstant.COUPON_LAYOUT ->
                            item.let {

                                val lastRecordedData = isSingleClick(lastClickApplyBottomSheet)
                                lastClickApplyBottomSheet = lastRecordedData.second
                                if (lastRecordedData.first) couponViewModel.openCouponBottomSheet(it)

                            }

                        else -> {

                        }
                    }
                }
            }

            binding.couponCard.setCallback(couponCallback)
            val couponModel: CouponModel = item.toSdkObject()

            Log.i("couponModel", "" + item.promoCode+":::"+item.expiryDate)
            binding.couponCard.setApplyCouponData(couponModel)

            //note:- timer logic
            if (item.showFtcCounter == true) {
                if (item.currentDate == null || item.expiryDate == null) return
                Log.i("MillisDate", "" + item.currentDate)
                Log.i("MillisDate", "" + item.expiryDate)
                val millis = DateUtils.convertEpochTimeStampToDateMillis(
                    item.currentDate!!,
                    item.expiryDate!!
                )!!
                //val millis = SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                if (millis > 0) {
                    //couponViewModel.setCountDownTimerTrigger(millis)
                }
            }

            binding.couponModel = item
            binding.couponCard.setUpData(null, couponModel)
            binding.executePendingBindings()


        }

    }

    override fun getItemCount(): Int {
        return couponList.size
    }

    override fun getItemId(position: Int): Long {
        return try {
            if (position < couponList.size && position > -1)
                couponList[position].offerId.toLong()
            else
                0
        } catch (_: Exception) {
            0
        }
        //return couponList[position].offerId.toLong()

    }


}


