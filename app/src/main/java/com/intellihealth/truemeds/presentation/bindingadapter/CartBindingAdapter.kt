package com.intellihealth.truemeds.presentation.bindingadapter

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.RelativeSizeSpan
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.utils.compressImageSize
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.salt.views.buttons.QuantityStepper
import com.intellihealth.salt.views.cards.FullWidthProductCard
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.presentation.adapter.CartAdapter
import com.intellihealth.truemeds.presentation.adapter.DoctorPrescriptionAdapter
import com.intellihealth.truemeds.presentation.adapter.RxPrescriptionAdapter
import com.intellihealth.truemeds.presentation.adapter.ViewPrescriptionAdapter
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.model.CartMedicineModel
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import java.time.temporal.TemporalAmount
import java.util.Locale

@BindingAdapter("setCartList", "viewmodel", "fragmentManager")
fun setCartList(
    view: RecyclerView,
    list: List<CartMedicineModel>,
    viewModel: CartViewModel,
    fragmentManager: FragmentManager
) {
    view.adapter?.run {
        if (this is CartAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        val adapter = CartAdapter(list, viewModel, fragmentManager)
        adapter.setHasStableIds(true)
        view.adapter = adapter
    }
}

@BindingAdapter("setPrescriptionList", "prescriptionCallback", "isCloseButtonShow", "isUpload")
fun setPrescriptionList(
    view: RecyclerView,
    list: List<OrderRxInfo>?,
    callback: ViewPrescriptionCallback,
    isCloseButtonShow: Boolean,
    isUpload: Boolean,
) {
    Log.d("TAG", "setPrescriptionList: $list")
    view.adapter?.run {
        if (this is DoctorPrescriptionAdapter) {
            if (list != null) {
                this.items = list
            }
            Log.d("TAG", "setPrescriptionList: $list")
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter =
            list?.let { DoctorPrescriptionAdapter(it, callback, isCloseButtonShow, isUpload) }
    }
}

@BindingAdapter("setViewPrescriptionList", "prescriptionCallback", "index","isFromPDPage","title")
fun setViewPrescriptionList(
    view: RecyclerView,
    list: List<String>?,
    callback: ViewPrescriptionCallback,
    index: Int,
    isFromPDPage:Boolean = false, title:String?=""
) {
    view.adapter?.run {
        if (this is ViewPrescriptionAdapter) {
            if (list != null) {
                this.items = list
            }
            updateSelectedItemIndex(index)
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = list?.let { ViewPrescriptionAdapter(it, callback, view.context, index, isFromPDPage, title) }
    }
}

@BindingAdapter("setRxPrescriptionList", "prescriptionCallback", "index")
fun setRxPrescriptionList(
    view: RecyclerView,
    list: List<OrderRxInfo>?,
    callback: ViewPrescriptionCallback,
    index: Int
) {
    view.adapter?.run {
        if (this is RxPrescriptionAdapter) {
            if (list != null) {
                this.items = list
            }
            updateSelectedItemIndex(index)
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = list?.let { RxPrescriptionAdapter(it, callback, view.context, index) }
    }
}

@BindingAdapter("setUrl","placeHolder","isFromPDPage","title", requireAll = false)
fun setUrl(view: ImageView?, url: String?, placeHolder: Drawable?, isFromPDPage:Boolean=false, title: String?="") = url?.let {
    if (isFromPDPage && !title.isNullOrEmpty()) {
        val customPlaceHolder = view?.context?.getDrawable(CommonFunc.getDefaultPlaceHolderDrawable(title))
        Glide.with(view!!.context).load(url.compressImageSize(0, 160))
            .placeholder(customPlaceHolder ?: view?.context?.getDrawable(R.drawable.ic_prescription_placeholder)).diskCacheStrategy(DiskCacheStrategy.ALL)
            .error(customPlaceHolder)
            .into(view)
    }else{
        Glide.with(view!!.context).load(url.compressImageSize(0, 160))
            .placeholder(placeHolder ?: view?.context?.getDrawable(R.drawable.ic_prescription_placeholder)).diskCacheStrategy(DiskCacheStrategy.ALL)
            .error( view?.context?.getDrawable(R.drawable.ic_prescription_placeholder))
            .into(view)
    }

}

@SuppressLint("SetTextI18n")
@BindingAdapter("setNudgeSavingAmount")
fun setNudgeSavingAmount(view: com.intellihealth.salt.views.TextView, savingAmount: Double?) {
    savingAmount?.let {
        view.text = "You Saved ₹${formatDecimal(savingAmount)}"
    }
}

@BindingAdapter("setNumberFormatPriceRupeeSymbolTxt")
fun setNumberFormatPriceRupeeSymbolTxt(appCompatTextView: AppCompatTextView, ipText: String) {
    if (ipText.isNullOrEmpty()) return
    val spannableStringBuilder = SpannableStringBuilder()
    val formattedInput = String.format(Locale.ENGLISH, "%.2f", ipText.toDouble())
    spannableStringBuilder.append("₹")
    spannableStringBuilder.append(formattedInput)
    val dotIndex = spannableStringBuilder.toString().indexOf('.')
    val lastIndex = spannableStringBuilder.length
    val sizeSpan = RelativeSizeSpan(0.75f) // Adjust the size as needed
    spannableStringBuilder.setSpan(
        sizeSpan,
        dotIndex,
        lastIndex,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    appCompatTextView.text = spannableStringBuilder
}

@BindingAdapter("setDataReplaceFullwidthCard", "productInfoModel")
fun setDataReplaceFullwidthCard(fullWidthProductCard: FullWidthProductCard, productInfoModelReplaced: com.intellihealth.salt.models.ProductInfoModel?,
                                productInfoModel: com.intellihealth.salt.models.ProductInfoModel?) {
    if (productInfoModelReplaced == null || productInfoModel == null) return

    productInfoModelReplaced.cardType = FullWidthProductCardConstants.CART
    productInfoModelReplaced.isAutoReplaced = true
    productInfoModelReplaced.product.replacedSavingPercentage = productInfoModel.product.subsSavingsPercentage?.replace("%", "")?.toDouble() ?: productInfoModelReplaced.product.replacedSavingPercentage
    productInfoModelReplaced.product.qty = productInfoModel.product.recommendedQty
//    productInfoModelReplaced.product.mrp = productInfoModel.suggestion?.mrp!! * productInfoModel.product.recommendedQty!!.toDouble()

    productInfoModelReplaced.product.mrp = productInfoModel.suggestion?.mrp!! * (productInfoModel.product.recommendedQty ?: 1.0).toDouble()

    productInfoModelReplaced.product.sellingPrice = (productInfoModel.suggestion?.sellingPrice ?: productInfoModelReplaced.product.sellingPrice) * (productInfoModel.product.recommendedQty ?: 1.0).toDouble()

    productInfoModelReplaced.product.discount = productInfoModelReplaced.product.discount
    productInfoModelReplaced.product.switchBackImageUrl = productInfoModel.product.switchBackImageUrl


//    if (productInfoModel.product.recommendedQty != null) {
//        val mrp = productInfoModelReplaced.product.mrp ?: 0
//        if (productInfoModel.product.recommendedQty!! > 1) {
//            productInfoModelReplaced.product.mrp = productInfoModel.suggestion?.mrp ?: productInfoModelReplaced.product.mrp
//        } else {
//            productInfoModelReplaced.product.mrp = (productInfoModel.suggestion?.mrp ?: mrp) * (productInfoModel.product.recommendedQty ?: 1).toDouble()
//        }
//    } else {
//
//    }

    fullWidthProductCard.setCrossSellingData(productInfoModelReplaced)
}
