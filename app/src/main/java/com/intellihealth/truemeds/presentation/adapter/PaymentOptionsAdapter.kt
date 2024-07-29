package com.intellihealth.truemeds.presentation.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.salt.constants.PaymentOptionRadioConstants
import com.intellihealth.salt.views.cards.PaymentOptionRadioCard
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.databinding.PaymentOptionsListItemBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.OnSingleClickListener
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel

class PaymentOptionsAdapter(
    var paymentOptionsList: List<PaymentMethodResponse.ResponseData>,
    var viewModel: PaymentOptionsViewModel
) :
    RecyclerView.Adapter<PaymentOptionsAdapter.MyViewHolder>() {
    private var mLastClickTime = 0L

    class MyViewHolder(binding: PaymentOptionsListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: PaymentOptionsListItemBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): MyViewHolder {
        val binding: PaymentOptionsListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.payment_options_list_item, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val item = paymentOptionsList[position]
        Log.i("payment option item","items : ${Gson().toJson(item)}")
        holder.binding.paymentCardData = item.paymentOptions?.get(0)?.paymentOptionRadioModel
        holder.binding.position = position
        holder.binding.viewModel = viewModel

        holder.binding.PaymentOptionRadioCard.setCallback(tmClickCallback = object:
            PaymentOptionRadioCard.TmPaymentOptionRadioCallback {
            override fun onCardClick() {
                viewModel.onPaymentMethodChanged(item, position)
                Log.i("PSP","Last Payment selected method :"+SharedPrefManager.getInstance().selectedPaymentMethod)
            }

            override fun onPlaceOrderViaClick(placeOrderViaPaymentMethodId: Long) {
                val lastClickTime: Long = mLastClickTime
                val now = System.currentTimeMillis()
                mLastClickTime = now
                if (now - lastClickTime < OnSingleClickListener.MIN_DELAY_MS) {
                    return
                } else {
                    SharedPrefManager.getInstance().setPaymentSelectedMode(16)
                    viewModel.setPaymentSelectionMethodForPlaceOrder(placeOrderViaPaymentMethodId,
                        filterCategoryNameBasedOnPaymentModeUrlId(placeOrderViaPaymentMethodId, paymentOptionsList))
                }
            }

            override fun viewClickListener(types: PaymentOptionRadioConstants) {
                val lastClickTime: Long = mLastClickTime
                val now = System.currentTimeMillis()
                mLastClickTime = now
                if (now - lastClickTime < OnSingleClickListener.MIN_DELAY_MS) {
                    return
                } else {
                    // Register the click
                    viewModel.setDataForPlaceOrder(item)
                }


            }

        })


        //setDataBasedOnPspVariant(holder, item, position)

        /*if (item.paymentOptions != null && item.paymentOptions.isNotEmpty()) {
            if (item.paymentOptions[0]?.iconPath != null || item.paymentOptions[0]?.iconPath != "") {
                Glide.with(holder.binding.ivPaymentOptionsList.context.applicationContext)
                    .load(item.paymentOptions[0]?.iconPath)
                    .into(holder.binding.ivPaymentOptionsList)
            } else {
                Glide.with(holder.binding.ivPaymentOptionsList.context.applicationContext)
                    .load(R.drawable.payment_1)
                    .into(holder.binding.ivPaymentOptionsList)
            }
        }*/

        /*holder.binding.rbItem.setOnClickListener {
            if (viewModel.clickedPage.value == "OrderSummary" || viewModel.clickedPage.value == "ReOrder")
                viewModel.onPaymentMethodChanged(item, position)
            else
                viewModel.onPaymentMethodChangedFromStatus(item, position)
        }

        holder.binding.clPaymentOption.setOnClickListener {

            if (item.paymentCategory == ("Cash on delivery") && viewModel.restrictCod) {
                holder.binding.clPaymentOption.isClickable = false
            } else {
                if (viewModel.clickedPage.value == "OrderSummary" || viewModel.clickedPage.value == "ReOrder")
                    viewModel.onPaymentMethodChanged(item, position)
                else
                    viewModel.onPaymentMethodChangedFromStatus(item, position)
            }
        }

        holder.binding.btnPlaceOrder.setOnClickListener {
            viewModel.setDataForPlaceOrder(item)
        }
        val animMove = AnimationUtils.loadAnimation(
            AppController.getInstance().applicationContext,
            R.anim.move_horizontal
        )
        holder.binding.ivPspShimmer.startAnimation(animMove)*/
    }

    /*private fun setDataBasedOnPspVariant(
        holder: MyViewHolder,
        item: PaymentOptionsResponse.PaymentOptionsResponseItem,
        position: Int
    ) {
        if (SharedPrefManager.getInstance().sessionCouponModel != null && SharedPrefManager.getInstance().sessionCouponModel.paymentMethod == item.paymentCategory) {
            holder.binding.showAppliedCouponBg = true
            holder.binding.couponCode = SharedPrefManager.getInstance().sessionCouponModel.coupon_code
        } else if (viewModel.appliedCouponCode.value?.isNotEmpty() == true && viewModel.lastPaymentMethodSelected.value == item.paymentCategory
            && viewModel.isPaymentSpecificCoupon.value == true) {
            holder.binding.showAppliedCouponBg = true
            holder.binding.couponCode = viewModel.appliedCouponCode.value
        } else {
            holder.binding.showAppliedCouponBg = false
        }

        if (viewModel.payableAmountButtonText) {
            if (item.paymentCategory == viewModel.getApplication<Application>()
                    .getString(R.string.cash_on_delivery_btn_text)) {
                holder.binding.btnPlaceOrder.text = viewModel.getApplication<Application>().getString(R.string.change_to_cod)
            } else {
                holder.binding.btnPlaceOrder.text = "Pay ₹" + (CommonFunc.getNumberFormat().format(viewModel.cartBillDetails.value?.totalPayableAmount))
            }
        } else {
            holder.binding.btnPlaceOrder.text = viewModel.getApplication<Application>().getString(R.string.place_order_small_letter)
        }


    }*/

    override fun getItemCount(): Int {
        return paymentOptionsList.size
    }

    override fun getItemId(position: Int): Long {
        return paymentOptionsList[position].paymentOptions?.get(0)?.iconId!!.toLong()
    }

    fun filterCategoryNameBasedOnPaymentModeUrlId(
        placeOrderViaPaymentMethodId: Long,
        paymentOptionsList: List<PaymentMethodResponse.ResponseData>) : String {
        var selectedPaymentCategoryName = paymentOptionsList.filter {
            it.paymentModeUrlId?.toLong()  == placeOrderViaPaymentMethodId
        }
        return selectedPaymentCategoryName.get(0).paymentCategory ?: ""

    }
}