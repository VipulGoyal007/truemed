package com.intellihealth.truemeds.presentation.bindingadapter

import android.graphics.Paint
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.salt.views.cards.BillDetails
import com.intellihealth.salt.views.payments.StickyPaymentContainer
import com.intellihealth.truemeds.domain.enums.PinCodeServiceability
import com.intellihealth.truemeds.presentation.adapter.ReorderOtcProductAdapter
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.utils.CommonFunc.getNumberFormat
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Arrays
import java.util.Locale

@BindingAdapter("setStickyContainerPatientName")
fun setStickyContainerPatientName(
    view: StickyPaymentContainer,
    patientName: String?,
) {
    patientName?.let {
        view.setPatientName(it)
    }
}

@BindingAdapter("setStickyContainerAddress","clubAddress")
fun setStickyContainerAddress(
    view: StickyPaymentContainer,
    pinCode: String?,
    clubAddress: String?,
) {

    if (pinCode==null) return
    if (clubAddress==null) return

    view.setAddress(pinCode, clubAddress)

}

@BindingAdapter("setStickyContainerDeliveryDate")
fun setStickyContainerDeliveryDate(
    view: StickyPaymentContainer,
    deliveryDate:String?,
) {
    if (deliveryDate==null) return
    view.setDeliveryDateRange(deliveryDate)

}

@BindingAdapter("setStickyContainerServiceable")
fun setStickyContainerServiceable(
    view: StickyPaymentContainer,
    isServiceable: PinCodeServiceability,
) = view.showServiceable(isServiceable == PinCodeServiceability.SERVICEABLE)



@BindingAdapter("setStickyContainerPaymentData","paymentMode","payUsing","total")
fun setStickyContainerPaymentData(
    view: StickyPaymentContainer,
    paymentMethod: String,
    paymentMode: String,
    payUsing: String,
    total:String

) = view.setPaymentData(paymentMethod,paymentMode,payUsing,total)


@BindingAdapter("setUpBill")
fun setUpBill(
    view: BillDetails,
    billData: BillDetailsModel?
) {
    billData?.let {
        view.setUpBillDetailsData(it)
    }
}

@BindingAdapter("otcList", "viewmodel")
fun setOtcList(
    view: RecyclerView,
    items: List<ProductInfoModel>,
    viewModel: CartViewModel
) {
    if (view == null) {
        return
    }
    if (view.adapter != null) {
        try {
            view.adapter?.let {
                it as ReorderOtcProductAdapter
                it.mList = items
                it.viewModel = viewModel
                it.notifyDataSetChanged()
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
        //}
    } else {
        val adapter = ReorderOtcProductAdapter(items, viewModel)
        view.adapter = adapter
    }
}


@BindingAdapter("product")
fun setDiscountDetail(view: AppCompatTextView?, item: ProductInfoModel?) {
    try {
        if (view != null && item != null) {
            if (item.product.productCode
                    .equals(item.suggestion?.productCode)
            ) {
                var percentage = 0.0
                try {
                    percentage =
                        item.product.discount//.replace("%", "").toDouble()
                } catch (ignore: java.lang.Exception) {
                }
                if (percentage > 0) {
                    view.visibility = View.VISIBLE
                    view.setText(
                        trimPercentage(
                            item.product.discount.toString()
                        ) + " OFF"
                    )
                    //                        view.setText(CommonFunc.getNumberFormat().format(item.get_source().getSavings_percentage()) + " OFF");
                } else {
                    view.visibility = View.GONE
                }
            } else {
                val numberFormat: DecimalFormat = getNumberFormat()
                if (item.product.discount > 0) {
                    val amount: String =
                        numberFormat.format(item.product.discount)
                    view.setText(trimPercentage(amount) + " OFF")
                    //                        view.setText(CommonFunc.getNumberFormat().format(amount) + " OFF");
                    view.visibility = View.VISIBLE
                } else {
                    view.visibility = View.GONE
                }
            }
        }
    } catch (ex: java.lang.Exception) {
        view!!.visibility = View.GONE
    }
}

fun trimPercentage(percentage: String?): String? {
    var percentage = percentage
    var data = ""
    if (percentage != null) {
        if (percentage.contains("%")) {
            percentage = percentage.replace("%", "")
        }
        if (percentage.contains(".")) {
            val separated = percentage.split("\\.".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
            val wholeNumber = separated[0]
            var decimalNumber = separated[1]
            decimalNumber =
                if (decimalNumber.length > 2) decimalNumber.substring(0, 1) else decimalNumber
            val num = decimalNumber.toInt()
            data = if (num > 0) {
                if (decimalNumber.startsWith("0")) {
                    "$wholeNumber.0$num%"
                } else {
                    "$wholeNumber.$num%"
                }
            } else {
                "$wholeNumber%"
            }
        } else {
            data = "$percentage%"
        }
    }
    return data
}

@BindingAdapter("medicineNameOtc", "medicineUrl", "drugType", "viewmodel")
fun setImageUrlOtc(
    imageView: AppCompatImageView?,
    name: String?,
    image_url: String?,
    drug_type: String?,
    viewmodel: CartViewModel
) {
    var image_url = image_url
    var drug_type = drug_type
    try {
        if (imageView != null) {
            try {
                image_url = image_url ?: ""
                drug_type = drug_type ?: ""
                if (image_url == "null" || image_url == "") {
                    if (drug_type == "null" || drug_type == "") {
                        //Glide.with(viewmodel.getApplication().getApplicationContext()).load(Uri.parse(CommonFunc.getDefaultDrawable(name))).into(imageView);

                        //todo
                    //                        Glide.with(imageView.context)
//                            .load(CommonFunc.getDefaultDrawable(name)).into(imageView)
                    } else {
                        //Glide.with(viewmodel.getApplication().getApplicationContext()).load(Uri.parse(CommonFunc.getDefaultDrawable(drug_type))).into(imageView);

                        //todo
                    //                        Glide.with(imageView.context)
//                            .load(CommonFunc.getDefaultDrawable(drug_type)).into(imageView)
                    }
                } else {
                    val imag = image_url.split(",".toRegex()).dropLastWhile { it.isEmpty() }
                        .toTypedArray()
                    Arrays.sort(imag)
                    Glide.with(imageView.context)
                        .load(imag[0] + "?tr=cm-pad_resize,lo-true,w-240")
                        .apply(RequestOptions().override(320, 320))
                        .into(imageView)
                }
            } catch (ex: NullPointerException) {
                ex.printStackTrace()
            }
        }
    } catch (ignore: java.lang.Exception) {
    }
}

@BindingAdapter("medicineNameOtc", "medicineUrlOtc", "drugType")
fun setImageUrl(
    imageView: AppCompatImageView?,
    name: String?,
    imageUrl: String?,
    drugType: String?
) {
//    var image_url = image_url
//    var drug_type = drug_type
    if (imageView != null) {
        try {
            var image_url = imageUrl ?: ""
            var drug_type = drugType ?: ""
            if (image_url == "null" || image_url == "") {
                if (drug_type == "null" || drug_type == "") {
                    if (name != null) {
                        /*Glide.with(viewmodel.getApplication<Application>().applicationContext).load(
                            Uri.parse(CommonFunc.getDefaultDrawable(name))
                        ).into(imageView)*/
                       //todo
                        /* Glide.with(imageView.context).load(CommonFunc.getDefaultDrawable(name))
                            .into(imageView)*/
                    }
                } else {
                    /*Glide.with(viewmodel.getApplication<Application>().applicationContext)
                        .load(Uri.parse(CommonFunc.getDefaultDrawable(drug_type))).into(imageView)*/
                    //todo
                    /*Glide.with(imageView.context)
                        .load(CommonFunc.getDefaultDrawable(drug_type)).into(imageView)*/

                }
            } else {
                val imag = image_url.split(",".toRegex()).dropLastWhile { it.isEmpty() }
                    .toTypedArray()
                Arrays.sort(imag)
                Glide.with(imageView.context).load(
                    imag[0] + "?tr=cm-pad_resize,lo-true,w-240"
                ).into(imageView)
            }
        } catch (ex: NullPointerException) {
            ex.printStackTrace()
        }
    }
}

@BindingAdapter("strikeThroughPrice")
fun setPriceWithStrikethrough(textView: AppCompatTextView?, price: String) {
    if (textView != null) {
        val formatListPrice = SpannableString(price)
        formatListPrice.setSpan(
            StrikethroughSpan(),
            0,
            price.length,
            Spanned.SPAN_INCLUSIVE_EXCLUSIVE
        )
        textView.text = formatListPrice
    }
}

@BindingAdapter("setPriceWithStrike")
fun setPriceWithStrike(textView: AppCompatTextView?, price: Double) {
    if (textView != null) {
        val formattedPrice = formatDecimal(price)
        val formatListPrice = SpannableString(formattedPrice)
        formatListPrice.setSpan(
            StrikethroughSpan(),
            0,
            formattedPrice.length,
            Spanned.SPAN_INCLUSIVE_EXCLUSIVE
        )
        textView.text = "₹" +formatListPrice
    }
}

@BindingAdapter("setStrikeThroughPrice")
fun setStrikeThroughPrice(appCompatTextView: AppCompatTextView, ipText: Double) {
    val symbols = DecimalFormatSymbols(Locale.US)
    val formatter = DecimalFormat("##.00", symbols)
    formatter.roundingMode = RoundingMode.CEILING
    appCompatTextView.text = "₹ " + formatter.format(ipText.toDouble())
    appCompatTextView.paintFlags = appCompatTextView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
}

@BindingAdapter("sellingPrice")
fun setSellingPrice(textView: AppCompatTextView?, sellingPrice: Double) {
    try {
        if (textView != null) {
            val numberFormat: DecimalFormat = getNumberFormat()
            val amount = String.format("₹%s", numberFormat.format(sellingPrice))
            textView.text = amount
        }
    } catch (ignore: java.lang.Exception) {
    }
}






