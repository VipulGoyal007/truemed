package com.intellihealth.truemeds.presentation.bindingadapter


import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.RelativeSizeSpan
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.AuthorCardModel
import com.intellihealth.salt.models.CompositionCardModel
import com.intellihealth.salt.models.FaqModel
import com.intellihealth.salt.models.ProductCardSectionModel
import com.intellihealth.salt.views.MobileSectionHeaders
import com.intellihealth.salt.views.TextView
import com.intellihealth.salt.views.buttons.QuantityStepper
import com.intellihealth.salt.views.cards.CompositionCard
import com.intellihealth.salt.views.cards.Faq
import com.intellihealth.salt.views.section.ProductCardSection
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.presentation.adapter.AuthorCardAdapter
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.NumberFormat
import java.util.Locale


/*
@BindingAdapter("setPackSize")
fun setPackSize(
    view: TextView,
    productCardData: ProductInfoModel?
) {
    view.let {
    var packSize:String="0.0"
        if(productCardData?.isReplaced == false){
            packSize= productCardData.product.packForm?:"0.0"
        }
        else {
            packSize= productCardData?.suggestion?.packForm?:"0.0"
        }
        view.text= packSize
    }

}

*/

@BindingAdapter("setBannerPlaceHolder")
fun setBannerPlaceHolder(
    view: AppCompatImageView,
    imgUrl: String?
) {
    view.let {
        if(!imgUrl.isNullOrEmpty()) {
           view.setImageResource(CommonFunc.getDefaultPlaceHolderDrawable(imgUrl))
        }else {
            view.setImageResource(R.drawable.ic_placeholder_tablet)
        }
    }
}


@BindingAdapter("setPricePerUnit")
fun setPricePerUnit(
    view: TextView,
    pricePerUnitLabel: String?
) {
    view.let {
       it.text= view.context.getString(
            R.string.txt_with_rupee_symbol, pricePerUnitLabel ?: ""
        )
    }

}

@BindingAdapter("setCompositionData")
fun setCompositionData(
    view: CompositionCard,
    compositionModel: CompositionCardModel?
) {
    view.let {
        if (compositionModel != null) {
            it.setUpData(compositionModel)
            it.setBackgroundSelected(false)

        }
    }
}

@BindingAdapter("setProductInfoData")
fun setProductInfoData(view: Faq, faqModel: FaqModel?){
    view.let {
        if (faqModel != null) {
            it.setUpData(faqModel)
        }
    }
}


@BindingAdapter("setDoubleStackData")
fun setDoubleStackData(view: ProductCardSection, model: ProductCardSectionModel?){
    view.let {
        if (model != null) {
            it.setProductCardSectionData(model)
        }
    }
}

@BindingAdapter("setNumberFormatPriceInDouble")
fun setNumberFormatPriceInDouble(appCompatTextView: AppCompatTextView, ipText: Double) {
    val formattedInput = String.format(Locale.ENGLISH, "%.2f", ipText)
    val spannableStringBuilder = SpannableStringBuilder(formattedInput)
    val dotIndex = spannableStringBuilder.toString().indexOf('.')
    val lastIndex = spannableStringBuilder.length
    val sizeSpan = RelativeSizeSpan(0.75f) // Adjust the size as needed
    spannableStringBuilder.setSpan(sizeSpan, dotIndex, lastIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    appCompatTextView.text = spannableStringBuilder
}


@BindingAdapter("setAuthorList")
fun setAuthorList(
    view: RecyclerView,
    list: ArrayList<AuthorCardModel>?
) {
    list?.let {
        view.adapter = AuthorCardAdapter(view.context,list)
    }
}

@BindingAdapter("customMarginBottom")
fun customMarginBottom(view: View, margin: Float) {
    val layoutParams = view.layoutParams as? ViewGroup.MarginLayoutParams ?: return
    layoutParams.bottomMargin = margin.toInt()
    view.layoutParams = layoutParams
}

@BindingAdapter("setNumberFormatPriceInDoubleWithRupee")
fun setNumberFormatPriceInDoubleWithRupee(appCompatTextView: AppCompatTextView, ipText: Double) {
    val formattedInput = String.format(Locale.ENGLISH, "%.2f", ipText)
    val spannableStringBuilder = SpannableStringBuilder("₹")
    spannableStringBuilder.append(formattedInput)
    val dotIndex = spannableStringBuilder.toString().indexOf('.')
    val lastIndex = spannableStringBuilder.length
    val sizeSpan = RelativeSizeSpan(0.75f) // Adjust the size as needed
    spannableStringBuilder.setSpan(sizeSpan, dotIndex, lastIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    appCompatTextView.text = spannableStringBuilder
}

@BindingAdapter("setStrikeThroughPrices")
fun setStrikeThroughPrices(appCompatTextView: AppCompatTextView, ipText: Double) {
    Log.i("::::ipText",""+ipText)
    val formattedInput = String.format(Locale.ENGLISH, "%.2f", ipText)
    appCompatTextView.text = "₹ $formattedInput"
    appCompatTextView.paintFlags = appCompatTextView.paintFlags or 16
}

@BindingAdapter("handleAddPlusIcon","productInfoModel")
fun handleAddPlusIcon(
    view: MobileSectionHeaders,
    isSubs:Boolean,
    model:ProductInfoModel?
) {
    if (isSubs || model?.suggestion == null) {
        view.showStepperAddIcon(isShowIcon = false)
    } else {
        view.showStepperAddIcon(isShowIcon = true)
    }

}

@BindingAdapter("handleAddPlusIconMedicineDetails","isBottomsheetBehaviour","productInfoModel")
fun handleAddPlusIconMedicineDetails(
    view: QuantityStepper,
    isSubs:Boolean,
    isBottomsheetBehaviour:Boolean,
    model:ProductInfoModel?
) {
    if (isSubs || model?.suggestion == null || isBottomsheetBehaviour) {
        view.showStepperAddIcon(isShowIcon = false)
    } else {
        view.showStepperAddIcon(isShowIcon = true)
    }

}

@BindingAdapter("setDiscountValue")
fun setDiscountValue(appCompatTextView: AppCompatTextView, discount: Double) {
    val symbols = DecimalFormatSymbols(Locale.US)
    val nf: NumberFormat =  DecimalFormat("##.###", symbols)
    appCompatTextView.text =nf.format(discount) + "% OFF"
}

@BindingAdapter("handleMedicinDetailsStepperVisibility","isFromOrderStatus")
fun handleMedicinDetailsStepperVisibility(
    view: QuantityStepper,
    model:ProductInfoModel?,
    isFromOrderStatus:Boolean= false
) {
    if((model?.isOrgAddedToCart == true) || (!model?.product?.availabilityStatus.isNullOrEmpty())
            ||(isFromOrderStatus))
    {
        view.visibility= View.GONE
    } else
    {
        view.visibility= View.VISIBLE
    }

}