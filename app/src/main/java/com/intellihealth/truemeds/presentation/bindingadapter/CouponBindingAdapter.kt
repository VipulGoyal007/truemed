package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.salt.views.StickyNonStickyNotification
import com.intellihealth.salt.views.TextView
import com.intellihealth.salt.views.cards.CouponCtaCards
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.presentation.adapter.CouponAdapter
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel


@BindingAdapter(value = ["setCouponListData", "viewModel","currentCartValue"])
fun setCouponList(
    view: RecyclerView?,
    couponList: MutableList<CouponCodeResponse.Coupon>,
    viewModel: CouponViewModel,
    currentCartValue:Double
) {
    view?.adapter?.run {
        //notify
        if (this is CouponAdapter) {
            this.couponList = couponList
            this.couponViewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view?.adapter = CouponAdapter(couponList, viewModel,currentCartValue)
    }
}

@BindingAdapter("setErrorMessage")
fun setErrorMessage(textView: TextView, cartValue: Double) {
    val errorMessage =
        textView.context.applicationContext.resources.getString(R.string.couponErrorMsg_without_dot) + cartValue + textView.context.applicationContext.resources.getString(
            R.string.couponErrorMsgAvailable
        )
    textView.text = errorMessage

}
@BindingAdapter("observeTimerValue","couponModel")
fun observeTimerValue(view: CouponCtaCards, viewModel: CouponViewModel, couponModel:CouponCodeResponse.Coupon) {
    if(couponModel.isCouponApplied == true) {
        viewModel.ftcCounterTime.observe(view.context as LifecycleOwner) { timerValue ->
            view.setTimer(timerValue)
        }
    }
}

@BindingAdapter("setStickyData","couponModel","lifeCycleOwner")
fun setStickyData(stickyNonStickyNotification: StickyNonStickyNotification, viewModel: CouponViewModel,
                  couponModel: CouponCodeResponse.Coupon, lifeCycleOwner:LifecycleOwner){
    var timerValueUpdate=""
    var stickyMessage = couponModel.promoCode.toString() + " Applied"
    /*if(couponModel.showFtcCounter==true) {*/
        viewModel.ftcCounterTime.observe(lifeCycleOwner) { timerValue ->
            timerValueUpdate=timerValue
            stickyMessage = couponModel.promoCode.toString() + " Applied"

        }
        val data = StickyNonStickyNotificationModel(
            message = stickyMessage,
            amount = 0.0,
            subTitle = "",
            timer = if(couponModel.showFtcCounter==true)"Ends in $timerValueUpdate" else "",
            buttonText = "",
            drawableLeft = ContextCompat.getDrawable(
                stickyNonStickyNotification.context,
                R.drawable.ic_coupon_applied
            ),
            buttonIcon = null,
            drawableRight = null
        )
        stickyNonStickyNotification.setStickyNonStickyNotificationData(data)
    //}



}

@BindingAdapter("setTermsAndCondition")
fun setTermsAndCondition(view: TextView,list: List<CouponCodeResponse.Coupon.TermsAndCondition>){
    if(list.isNotEmpty()) {
        val tncDescription = list[0].description
        if (tncDescription != "") {
            view.text = tncDescription
        }
    }

}