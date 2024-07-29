package com.intellihealth.truemeds.presentation.utils

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.constants.PaymentOptionRadioConstants
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.presentation.model.Product
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Response
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit
import kotlin.math.roundToInt


object CommonFunc {
    private var toast: Toast? = null
    fun isDateInBetweenIncludingEndPoints(min: Date?, max: Date?, date: Date): Boolean {
        return !(date.before(min) || date.after(max))
    }

    fun getAppVersionName(): String = BuildConfig.VERSION_NAME
    fun getSourceVersionName(): String = "TM_ANDROID_V${getAppVersionName()}"

    fun openErrorDialog(context: Context, message: String) {
        val alertDialogBuilder = AlertDialog.Builder(context)
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setPositiveButton("OK") { dialog: DialogInterface?, which: Int ->
            dialog?.dismiss()
        }
        val alertDialog: AlertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }


    fun getJsonResponseFromRaw(response: Response<ResponseBody?>?): JSONObject? {
        return try {
            JSONObject(getStringResponseFromRaw(response))
        } catch (ex: Exception) {
            null
        }
    }

    private fun getStringResponseFromRaw(response: Response<ResponseBody?>?): String {
        var reader: BufferedReader? = null
        val sb = StringBuilder()
        try {
            if (response != null) {
                reader = BufferedReader(InputStreamReader(response.body()!!.byteStream()))
            }
            var line: String?
            try {
                if (reader != null) {
                    while (reader.readLine().also { line = it } != null) {
                        sb.append(line)
                    }
                }
            } catch (e: IOException) {
                //e.printStackTrace();
            }
        } catch (e: java.lang.Exception) {
            //e.printStackTrace();
        }
        var finalText = sb.toString()
        val char1 = finalText.substring(0, 1)
        if (char1.equals("[", ignoreCase = true)) {
            finalText = "{\"array\": $finalText}"
        }
        //Constants.printText("finalText: " + finalText);
        return finalText
    }

    fun getNumberFormat(): DecimalFormat {
        val symbols = DecimalFormatSymbols(Locale.US)
        return DecimalFormat("#0.00", symbols)
    }

    fun getCategoryTypeForEnum(paymentCategory: String): PaymentOptionRadioConstants? {
        return when (paymentCategory) {
            "UPI" -> PaymentOptionRadioConstants.UPI
            "Wallets" -> PaymentOptionRadioConstants.WALLETS
            "Credit / Debit Cards" -> PaymentOptionRadioConstants.CREDIT_DEBIT_CARDS
            "Net banking" -> PaymentOptionRadioConstants.NETBANKING
            "Pay later" -> PaymentOptionRadioConstants.PAY_LATER
            "Cash on delivery" -> PaymentOptionRadioConstants.COD
            else -> null
        }
    }

    fun dpToPixel(context: Context?, dp: Float): Int {
        return if (context != null) {
            val density = context.resources.displayMetrics.density
            val pixel = dp * density
            Log.i("dpToPixel",""+pixel.toInt())
            pixel.toInt()
        } else {
            dp.toInt()
        }
    }

    fun Long.formatMillisInTime() = if (TimeUnit.MILLISECONDS.toHours(this) > 0) String.format(
        "%02dh:%02dm:%02ds",
        TimeUnit.MILLISECONDS.toHours(this),
        TimeUnit.MILLISECONDS.toMinutes(this) % 60,
        TimeUnit.MILLISECONDS.toSeconds(this) % 60
    )
    else String.format(
        "%02dm:%02ds",
        TimeUnit.MILLISECONDS.toMinutes(this) % 60,
        TimeUnit.MILLISECONDS.toSeconds(this) % 60
    )


    fun removeViewBg(view: View) {
        view.background = null
    }

    fun highlightView(view: View, drawable: Drawable) {
        view.background = drawable
    }

    fun changeBackgroundView(context: Context, position: Int, view: View, drawable: Drawable) {
        val wrappedDrawable = DrawableCompat.wrap(drawable)
        when (position) {
            0 -> {
                DrawableCompat.setTint(
                    wrappedDrawable,
                    ContextCompat.getColor(
                        context,
                        com.intellihealth.salt.R.color.tm_semantic_color_bg_accent_5
                    )
                )
                highlightView(view, drawable)
            }

            1 -> {
                DrawableCompat.setTint(
                    wrappedDrawable,
                    ContextCompat.getColor(
                        context,
                        com.intellihealth.salt.R.color.tm_semantic_color_bg_accent_4
                    )
                )
                highlightView(view, drawable)
            }

            2 -> {
                DrawableCompat.setTint(
                    wrappedDrawable,
                    ContextCompat.getColor(
                        context,
                        com.intellihealth.salt.R.color.tm_semantic_color_bg_accent_3
                    )
                )
                highlightView(view, drawable)
            }

            3 -> {
                DrawableCompat.setTint(
                    wrappedDrawable,
                    ContextCompat.getColor(
                        context,
                        com.intellihealth.salt.R.color.tm_semantic_color_bg_accent_4
                    )
                )
                highlightView(view, drawable)
            }

            else -> {
                DrawableCompat.setTint(
                    wrappedDrawable,
                    ContextCompat.getColor(
                        context,
                        com.intellihealth.salt.R.color.tm_semantic_color_bg_primary
                    )
                )
                highlightView(view, drawable)
            }
        }

    }

    fun RecyclerView.smoothSnapToPosition(
        position: Int,
        snapMode: Int = LinearSmoothScroller.SNAP_TO_START
    ) {
        val smoothScroller = object : LinearSmoothScroller(this.context) {
            override fun getVerticalSnapPreference(): Int = snapMode
            override fun getHorizontalSnapPreference(): Int = snapMode
        }
        smoothScroller.targetPosition = position
        this.layoutManager?.startSmoothScroll(smoothScroller)
    }

    fun getStatusNameFromId(id: Int): String {
        return if (id == 1 || id == 2) {
            "Pharmacist call pending"
        } else if (id == 3 || id == 4) {
            "Order missing details"
        } else if (id == 39) {
            "Doctor call pending"
        } else if (id == 49) {
            "Incomplete order"
        } else if (id == 55) {
            "Order delivered"
        } else if (id == 56 || id == 200) {
            "Return received. Refund pending"
        } else if (id == 57) {
            "Order cancelled"
        } else if (id == 58) {
            "Payment pending"
        } else if (id == 59 || id == 66) {
            "Ready to ship order"
        } else if (id == 60) {
            "Order shipped"
        } else if (id == 81) {
            "Order on hold"
        } else if (id == 121) {
            "Return In-transit"
        } else if (id == 124) {
            "Return received"
        } else if (id == 142) {
            "Processing order"
        } else if (id == 174) {
            "Discarded order"
        } else if (id == 190) {
            "Return request pending approval "
        } else if (id == 191) {
            "Return generated"
        } else if (id == 192) {
            "Return request declined"
        } else if (id == 199) {
            "Refund processed"
        } else if (id == 201) {
            "Partial refund processed"
        } else ""
    }

    fun NestedScrollView.notifyMeOnBottomReached(
        pageCount: Int,
        listSize: Int,
        callNextPage: (Int) -> Unit
    ) {
        this.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener
        { v, _, scrollY, _, _ ->

            if (scrollY == v.getChildAt(0).measuredHeight - v.measuredHeight) {
                val nextPage: Double = listSize.toDouble() / pageCount.toDouble()
                callNextPage.invoke(nextPage.roundToInt())
            }
        })
    }

    fun convertToBillDetails(
        billModel: BillDetailResponse.ResponseData,
        billDetailsTitle: String,
        totalPayable: String,
        gst: String,
        sellerPackagingCharge: String,
        saveOrderPrice: String,
        savedOrderMessage: String,
        strikePackagingCharge: Double
    ): BillDetailsModel = BillDetailsModel(
        orderId = billModel.orderId ?: 0,
        billDetailsTitle = billDetailsTitle,
        savedOrderMessage = savedOrderMessage,
        savedOrderPrice = saveOrderPrice,
        mrpValue = billModel.mrp,
        discountValue = billModel.discount,
        couponName = billModel.couponCode,
        couponValue = billModel.couponDiscountAmt,
        taxesAndChargesValue = billModel.packagingCharge,
        deliveryChargesValue = billModel.deliveryCharge,
        waiveOffDeliveryCharge = billModel.waiveOffDeliveryCharge,
        tmCreditValue = billModel.tmCredit,
        tmRewardValue = billModel.tmCash,
        isTypePharmacistPaymentOn = false,
        isTypePharmacistPaymentOff = false,
        estimatedPayableValue = billModel.payableAmt,
        paymentModeValue = SharedPrefManager.getInstance().selectedPaymentMethod,
        isTooltipForDeliveryCharges = !billModel.deliveryChargeTooltipMessage.isNullOrEmpty(),
        //tooltipDeliveryChargeValue = "Add items worth ₹" + billModel.addMoreForFreeDelivery + " more to get free delivery",
        tooltipDeliveryChargeValue = billModel.deliveryChargeTooltipMessage,
        tooltipEstimatedPayableValue = totalPayable,
        isTooltipForEstimatedPayable = false,
        isTooltipForTaxesCharges = true,
        tooltipTaxesChargesHeaderLeft = gst, //context.getString(R.string.gst)
        tooltipTaxesChargesBodyLeft = sellerPackagingCharge, //context.getString(R.string.seller_packaging_charges),
        tooltipTaxesChargesBodyRight = "₹" + formatDecimal(billModel.packagingCharge!!),
        tooltipTaxesChargesBodyRightStroked = "₹${formatDecimal(strikePackagingCharge)}",
        tooltipTaxesChargesHeaderRight = "Included in MRP",
        isFreeDelivery = (billModel.deliveryCharge == 0.0),
        deliveryChargeMessage = billModel.deliveryChargeMessage,
        sellingPrice = billModel.sellingPrice,
        cashHandlingApplicableInfoModel = billModel.cashHandlingApplicableInfo,
        cashHandlingInfoModel = billModel.cashHandlingInfo,
        pspViewed = billModel.pspViewed
    )

    fun expand(v: View, speed: Int, initialHeight: Int) {
        val matchParentMeasureSpec =
            View.MeasureSpec.makeMeasureSpec((v.parent as View).width, View.MeasureSpec.EXACTLY)
        val wrapContentMeasureSpec =
            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
        v.measure(matchParentMeasureSpec, wrapContentMeasureSpec)
        val targetHeight = v.measuredHeight

        // Older versions of android (pre API 21) cancel animations for views with a height of 0.
        v.layoutParams.height = initialHeight
        val a: Animation = object : Animation() {
            override fun applyTransformation(interpolatedTime: Float, t: Transformation?) {
                var interpolatedTime = interpolatedTime
                if (interpolatedTime < 0.2) {
                    interpolatedTime = initialHeight.toFloat() * 100 / targetHeight.toFloat() / 100
                }
                v.layoutParams.height =
                    if (interpolatedTime == 1f) ConstraintLayout.LayoutParams.WRAP_CONTENT else Math.max(
                        (targetHeight * interpolatedTime).toInt(),
                        initialHeight
                    )
                v.requestLayout()
                if (v.layoutParams.height > 1) v.visibility = View.VISIBLE
            }

            override fun willChangeBounds(): Boolean {
                return true
            }
        }

        // Expansion speed of 1dp/ms
        a.duration =
            (targetHeight / v.context.resources.displayMetrics.density / speed).toInt().toLong()
        v.startAnimation(a)
    }

    fun Activity.runMeOnUiThread(render: () -> Unit){
        this.runOnUiThread {
            render.invoke()
        }
    }
    fun freeMemory() {
        try {
            System.runFinalization()
            Runtime.getRuntime().gc()
            System.gc()
        } catch (ex: java.lang.Exception) {
        }
    }

    fun getPaymentMethodIgnoringCasing(selectedPaymentMethod: String?): String {
        var paymentMethod = ""
        return if (selectedPaymentMethod != null) {
            if (selectedPaymentMethod == BundleConstants.PAYMENT_DEFAULT_OPTION) {
                paymentMethod = BundleConstants.PAYMENT_DEFAULT_OPTION
            } else if (selectedPaymentMethod == "WALLET") {
                paymentMethod = "Wallets"
            } else if (selectedPaymentMethod == "NB") {
                paymentMethod = "Net banking"
            } else if (selectedPaymentMethod == "CARD") {
                paymentMethod = "Credit / Debit Cards"
            } else if (selectedPaymentMethod == "PAY_LATER") {
                paymentMethod = "Pay later"
            }
            paymentMethod
        } else ""
    }

    fun getPaymentMethodForCashfree(selectedPaymentMethod: String?): String {
        var paymentMethod = ""
        return if (selectedPaymentMethod != null) {
            if (selectedPaymentMethod == BundleConstants.PAYMENT_DEFAULT_OPTION) {
                paymentMethod = BundleConstants.PAYMENT_DEFAULT_OPTION
            } else if (selectedPaymentMethod == "Wallets") {
                paymentMethod = "WALLET"
            } else if (selectedPaymentMethod == "Net banking") {
                paymentMethod = "NB"
            } else if (selectedPaymentMethod == "Credit / Debit Cards") {
                paymentMethod = "CARD"
            } else if (selectedPaymentMethod == "PAY_LATER") {
                paymentMethod = "Pay later"
            }
            paymentMethod
        } else ""
    }


    fun List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>.toSdkProductModelList(): ArrayList<ProductInfoModel> {
        val productList = arrayListOf<com.intellihealth.salt.models.ProductInfoModel>()
        this.map { model ->
            productList.add(
                com.intellihealth.salt.models.ProductInfoModel(
                    product = model.product.toSdkObject(),
                    suggestion = model.suggestion?.toSdkObject(),
                )
            )
        }
        return productList
    }

    fun ProductInfoModel.toAppProductModel(): com.intellihealth.truemeds.presentation.model.ProductInfoModel {
        return com.intellihealth.truemeds.presentation.model.ProductInfoModel(
            cardType = FullWidthProductCardConstants.SEARCH,
            isReplaced = false,
            isOrgAddedToCart = false,
            isAutoReplaced = false,
            isSubsAddedToCart = false,
            sectionHeading= this.sectionHeading,
            crossSellingItemClickPosition= this.itemClickPosition,

            product = Product(
                productCode = this.product.productCode ?: "",
                skuName = this.product.skuName ?: "",
                manufacturerName = this.product.manufacturerName ?: "",
                discount = this.product.discount ?: 0.0,
                mrp = this.product.mrp ?: 0.0,
                sellingPrice = this.product.sellingPrice ?: 0.0,
                pricePerUnitLabel = this.product.pricePerUnitLabel ?: "",
                packSize = this.product.packSize ?: "",
                maxCappedQty = this.product.maxCappedQty ?: 0,
                productImageUrl = this.product.productImageUrl,
                availabilityStatus = this.product.availabilityStatus ?: "",
                availabilityMessage = this.product.availabilityMessage ?: "",
                qty = this.product.qty ?: 0,
                composition = this.product.composition ?: "",
                isAvailable = this.product.isAvailable,
                suppliedByTm = this.product.suppliedByTm ?: false,
                unit = this.product.unit ?: "",
                packForm = this.product.packForm ?: "",
                cxAcceptedSubs = this.product.cxAcceptedSubs,
                switchBackSkuName = this.product.switchBackSkuName ?: "",
                switchBackProductCode = this.product.switchBackProductCode ?: "",
                switchBackImageUrl = this.product.switchBackImageUrl ?: "",
                preSubsSkuName = this.product.preSubsSkuName ?: "",
                preSubsProductCode = this.product.preSubsProductCode ?: "",
                prevOrderId = 0L,
                prevOrgProductId = 0L,
                productDetailsId = 0,
                subsSavingPercentage = this.product.subsSavingsPercentage ?: "",
                manufacturerAddr = this.product.manufacturerAddress ?: "",
                replacedSavingPercentage = this.product.replacedSavingPercentage,
                motherBrand = this.product.motherBrand,
                isOtc = this.product.isOtc?:false,
                isChronic = this.product.isChronic?:false,
            ),
            suggestion = if (this.suggestion == null) null
            else {
                Product(
                productCode = this.suggestion?.productCode ?: "",
                skuName = this.suggestion?.skuName ?: "",
                manufacturerName = this.suggestion?.manufacturerName ?: "",
                discount = this.suggestion?.discount ?: 0.0,
                mrp = this.suggestion?.mrp ?: 0.0,
                sellingPrice = this.suggestion?.sellingPrice ?: 0.0,
                pricePerUnitLabel = this.suggestion?.pricePerUnitLabel ?: "",
                packSize = this.suggestion?.packSize ?: "",
                maxCappedQty = this.suggestion?.maxCappedQty ?: 0,
                productImageUrl = this.suggestion?.productImageUrl,
                availabilityStatus = this.suggestion?.availabilityStatus ?: "",
                qty = this.suggestion?.qty ?: 0,
                composition = this.suggestion?.composition ?: "",
                isAvailable = this.suggestion?.isAvailable?:false,
                suppliedByTm = this.suggestion?.suppliedByTm ?: false,
                unit = this.suggestion?.unit ?: "",
                packForm = this.suggestion?.packForm ?: "",
                cxAcceptedSubs = this.suggestion?.cxAcceptedSubs?:false,
                switchBackSkuName = this.suggestion?.switchBackSkuName ?: "",
                switchBackProductCode = this.suggestion?.switchBackProductCode ?: "",
                switchBackImageUrl = this.suggestion?.switchBackImageUrl ?: "",
                preSubsSkuName = this.suggestion?.preSubsSkuName ?: "",
                preSubsProductCode = this.suggestion?.preSubsProductCode ?: "",
                prevOrderId = 0L,
                prevOrgProductId = 0L,
                productDetailsId = 0,
                subsSavingPercentage = this.suggestion?.subsSavingsPercentage ?: "",
                manufacturerAddr = this.suggestion?.manufacturerAddress ?: "",
                replacedSavingPercentage = this.suggestion?.replacedSavingPercentage,
                motherBrand = this.suggestion?.motherBrand,
                isOtc = this.suggestion?.isOtc?:false,
                isChronic = this.suggestion?.isChronic?:false,
            )
            }
        )
    }

    fun showCustomToastMessage(context: Context?, message: String?) {
        try {
            //if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            if (toast != null) {
                toast?.cancel()
            }
            toast = Toast(context)
            val view: View = LayoutInflater.from(context).inflate(R.layout.custom_toast, null)
            val tvMessage = view.findViewById<AppCompatTextView>(R.id.points_text)
            tvMessage.text = message
            toast?.setView(view)
            toast?.setGravity(Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL, 0, 0)
            toast?.setDuration(Toast.LENGTH_SHORT)
            toast?.show()
            /*} else {
                Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            }*/
        } catch (ignore: java.lang.Exception) {
        }
    }

    fun Double.wrapInTwoDigit() = "%.2f".format(this)


    fun getDefaultPlaceHolderDrawable(drugTypeOrProductName: String=""): Int {
        val drugTypeOrProductName1 =  drugTypeOrProductName.uppercase(Locale.getDefault())
        val drugTypeOrProductName=  drugTypeOrProductName1.split("\\s+".toRegex())
        return try {
            if (drugTypeOrProductName.contains("BALM") ||
                drugTypeOrProductName.contains("BANDAGE") ||
                drugTypeOrProductName.contains("CREAM") ||
                drugTypeOrProductName.contains("EYE OINTMENT") ||
                drugTypeOrProductName.contains("FACE PACK") ||
                drugTypeOrProductName.contains("FOAM") ||
                drugTypeOrProductName.contains("GEL") ||
                drugTypeOrProductName.contains("GUM") ||
                drugTypeOrProductName.contains("GUM PAINT") ||
                drugTypeOrProductName.contains("GUMMIES") ||
                drugTypeOrProductName.contains("LINIMENT") ||
                drugTypeOrProductName.contains("NANOGEL") ||
                drugTypeOrProductName.contains("OINTMENT") ||
                drugTypeOrProductName.contains("PAINT") ||
                drugTypeOrProductName.contains("PASTE") ||
                drugTypeOrProductName.contains("PESSARIES") ||
                drugTypeOrProductName.contains("TOOTHPASTE") ||
                drugTypeOrProductName.contains("TUBE")
            ) {
                return com.intellihealth.truemeds.R.drawable.ic_placeholder_personal_care
            } else if (drugTypeOrProductName.contains("AUTOHALER") ||
                drugTypeOrProductName.contains("INHALER") ||
                drugTypeOrProductName.contains("MULTIHALER") ||
                drugTypeOrProductName.contains("NEBULISER") ||
                drugTypeOrProductName.contains("RESPULES") ||
                drugTypeOrProductName.contains("RHEOCAP")
            ) {
                return com.intellihealth.truemeds.R.drawable.ic_placeholder_personal_care
            } else if(drugTypeOrProductName.contains("DEVICE")){
                return com.intellihealth.truemeds.R.drawable.ic_placeholder_devices
            }
            else if (drugTypeOrProductName.contains("ANAESTHETIC") ||
                drugTypeOrProductName.contains("AUTOPEN") ||
                drugTypeOrProductName.contains("CARTRIDGE") ||
                drugTypeOrProductName.contains("DISPOSABLE PEN") ||
                drugTypeOrProductName.contains("FLEXPEN") ||
                drugTypeOrProductName.contains("INFUSION") ||
                drugTypeOrProductName.contains("INJECTION") ||
                drugTypeOrProductName.contains("NEEDLE") ||
                drugTypeOrProductName.contains("PEN") ||
                drugTypeOrProductName.contains("PEN NEEDLE") ||
                drugTypeOrProductName.contains("PENFILL") ||
                drugTypeOrProductName.contains("PREFILLED SYRINGE") ||
                drugTypeOrProductName.contains("SOLVENT FOR INJECTION") ||
                drugTypeOrProductName.contains("VACCINE") ||
                drugTypeOrProductName.contains("VIAL")
            ) {
                return R.drawable.ic_placeholder_injection
            } else if (drugTypeOrProductName.contains("BISCUIT") ||
                drugTypeOrProductName.contains("BRUSH") ||
                drugTypeOrProductName.contains("CHOCO BITE") ||
                drugTypeOrProductName.contains("CONDOM") ||
                drugTypeOrProductName.contains("DIAPER") ||
                drugTypeOrProductName.contains("DISKETTE") ||
                drugTypeOrProductName.contains("DOUCHE") ||
                drugTypeOrProductName.contains("ELECTRODE PADS") ||
                drugTypeOrProductName.contains("HEALTHCARE") ||
                drugTypeOrProductName.contains("KIT") ||
                drugTypeOrProductName.contains("MASK") ||
                drugTypeOrProductName.contains("PACK") ||
                drugTypeOrProductName.contains("PAD") ||
                drugTypeOrProductName.contains("PAD FOR DRESSING") ||
                drugTypeOrProductName.contains("PATCH") ||
                drugTypeOrProductName.contains("PLAST") ||
                drugTypeOrProductName.contains("POUCH") ||
                drugTypeOrProductName.contains("SCRUB") ||
                drugTypeOrProductName.contains("SOAP") ||
                drugTypeOrProductName.contains("SPACER") ||
                drugTypeOrProductName.contains("STRAW") ||
                drugTypeOrProductName.contains("TESTKIT") ||
                drugTypeOrProductName.contains("TRANSDERMAL PATCH") ||
                drugTypeOrProductName.contains("VAPOUR") ||
                drugTypeOrProductName.contains("WIPE")
            ) {
                return R.drawable.ic_placeholder_personal_care
            } else if (drugTypeOrProductName.contains("DUSTING POWDER") ||
                drugTypeOrProductName.contains("GRANULES") ||
                drugTypeOrProductName.contains("POWDER") ||
                drugTypeOrProductName.contains("SACHET")
            ) {
                return R.drawable.ic_placeholder_personal_care
            } else if (drugTypeOrProductName.contains("AQUANASE") ||
                drugTypeOrProductName.contains("BOTTLE") ||
                drugTypeOrProductName.contains("DROPS") ||
                drugTypeOrProductName.contains("DRY SYRUP") ||
                drugTypeOrProductName.contains("EAR DROPS") ||
                drugTypeOrProductName.contains("ELIXIR") ||
                drugTypeOrProductName.contains("EMULSION") ||
                drugTypeOrProductName.contains("EXPECTORANT") ||
                drugTypeOrProductName.contains("EYE DROPS") ||
                drugTypeOrProductName.contains("EYE/EAR DROPS") ||
                drugTypeOrProductName.contains("FACEWASH") ||
                drugTypeOrProductName.contains("GARGLE") ||
                drugTypeOrProductName.contains("GEL EYE DROPS") ||
                drugTypeOrProductName.contains("JELLY") ||
                drugTypeOrProductName.contains("LINCTUS") ||
                drugTypeOrProductName.contains("LIQUID") ||
                drugTypeOrProductName.contains("LIQUIGEL") ||
                drugTypeOrProductName.contains("LOTION") ||
                drugTypeOrProductName.contains("MOUTH WASH") ||
                drugTypeOrProductName.contains("NAIL LACQUER") ||
                drugTypeOrProductName.contains("NASAL DROPS") ||
                drugTypeOrProductName.contains("NASAL SPRAY") ||
                drugTypeOrProductName.contains("OIL") ||
                drugTypeOrProductName.contains("ORAL DROPS") ||
                drugTypeOrProductName.contains("ORAL SOLUTION") ||
                drugTypeOrProductName.contains("ORAL SUSPENSION") ||
                drugTypeOrProductName.contains("PREMIX") ||
                drugTypeOrProductName.contains("REDIMIX") ||
                drugTypeOrProductName.contains("REDIUSE") ||
                drugTypeOrProductName.contains("RINSE") ||
                drugTypeOrProductName.contains("SHAMPOO") ||
                drugTypeOrProductName.contains("SOLUTION") ||
                drugTypeOrProductName.contains("SPRAY") ||
                drugTypeOrProductName.contains("SUSPENSION") ||
                drugTypeOrProductName.contains("SYRUP") ||
                drugTypeOrProductName.contains("TETRAPACK") ||
                drugTypeOrProductName.contains("TRANSHALER") ||
                drugTypeOrProductName.contains("VAGINAL WASH")
            ) {
                return R.drawable.ic_placegholder_syrup
            } else if (drugTypeOrProductName.contains("CAPSULE") ||
                drugTypeOrProductName.contains("CAPSULE CR") ||
                drugTypeOrProductName.contains("CAPSULE ER") ||
                drugTypeOrProductName.contains("CAPSULE MR") ||
                drugTypeOrProductName.contains("CAPSULE SR") ||
                drugTypeOrProductName.contains("CAPSULE TR")
            ) {
                return com.intellihealth.truemeds.R.drawable.ic_placeholder_capsule_bottle
            } else if (drugTypeOrProductName.contains("APLICAP") ||
                drugTypeOrProductName.contains("CAPLET") ||
                drugTypeOrProductName.contains("CAPSUEL DR") ||
                drugTypeOrProductName.contains("CAPTAB") ||
                drugTypeOrProductName.contains("COMBI KIT") ||
                drugTypeOrProductName.contains("DISINTEGRATING STRIP") ||
                drugTypeOrProductName.contains("FILM") ||
                drugTypeOrProductName.contains("GELATIN COATED TABLET") ||
                drugTypeOrProductName.contains("LOZENGES") ||
                drugTypeOrProductName.contains("NEXCAP") ||
                drugTypeOrProductName.contains("NEXPULE") ||
                drugTypeOrProductName.contains("NOVOCART") ||
                drugTypeOrProductName.contains("OCTACAP") ||
                drugTypeOrProductName.contains("OPTICOPS") ||
                drugTypeOrProductName.contains("OVULES") ||
                drugTypeOrProductName.contains("PASTILLES") ||
                drugTypeOrProductName.contains("PELLETS") ||
                drugTypeOrProductName.contains("REDICAPS") ||
                drugTypeOrProductName.contains("RESPICAP") ||
                drugTypeOrProductName.contains("ROTACAP") ||
                drugTypeOrProductName.contains("SOFLETS") ||
                drugTypeOrProductName.contains("SOFTGEL") ||
                drugTypeOrProductName.contains("SOFTGEL CAPSULE") ||
                drugTypeOrProductName.contains("SOFTULES") ||
                drugTypeOrProductName.contains("STRIPS") ||
                drugTypeOrProductName.contains("SUPPOSITORY") ||
                drugTypeOrProductName.contains("TABCAP") ||
                drugTypeOrProductName.contains("TABLET") ||
                drugTypeOrProductName.contains("TABLET CR") ||
                drugTypeOrProductName.contains("TABLET DR") ||
                drugTypeOrProductName.contains("TABLET DT") ||
                drugTypeOrProductName.contains("TABLET ER") ||
                drugTypeOrProductName.contains("TABLET IPR") ||
                drugTypeOrProductName.contains("TABLET IR") ||
                drugTypeOrProductName.contains("TABLET LA") ||
                drugTypeOrProductName.contains("TABLET MD") ||
                drugTypeOrProductName.contains("TABLET MR") ||
                drugTypeOrProductName.contains("TABLET SR") ||
                drugTypeOrProductName.contains("TABLET TR") ||
                drugTypeOrProductName.contains("TABLET XL") ||
                drugTypeOrProductName.contains("TRANSCAPS") ||
                drugTypeOrProductName.contains("TRANSPULES")
            ) {
                return com.intellihealth.truemeds.R.drawable.ic_placeholder_tablet
            }
            com.intellihealth.truemeds.R.drawable.ic_placeholder_personal_care
        } catch (ex: java.lang.Exception) {
            R.drawable.ic_placeholder_personal_care
        }
    }


    fun <T> Iterable<T>.forEachUntil(block: (T) -> Boolean) {
        for (item in this) {
            if (block(item)) {
                break
            }
        }
    }

    private var mLastClickTime = 0L
    private const val MIN_DELAY_MS: Long = 2000L
    private const val MIN_DELAY_MS500: Long = 500L
    fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this.mLastClickTime = now
        return now - lastClickTime >= MIN_DELAY_MS
    }
    fun isSingleClickParam(minDelay: Long = 1000L): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        Log.d("TAG", "isSingleClickParam1: $mLastClickTime")
        this.mLastClickTime = now
        Log.d("TAG", "isSingleClickParam2: $lastClickTime")
        Log.d("TAG", "isSingleClickParam3: $now")
        Log.d("TAG", "isSingleClickParam4: ${now - lastClickTime}")
        return now - lastClickTime >= minDelay
    }

    fun List<com.intellihealth.salt.models.HealthArticleChipCategoryData>.mapToHealthArticle(): ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData> {
        var articles = arrayListOf<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
        this.forEachIndexed { index, article ->
            articles.add(
                com.intellihealth.salt.models.HealthArticleChipCategoryData(
                    id = article.id,
                    category = article.category,
                )
            )
        }
        return articles
    }

    fun convertJsonToHashmap(jsonObj: String?): Map<String?, Any?>? {
        var hashMap: Map<String?, Any?>? = HashMap()
        try {
            hashMap = Gson().fromJson<Map<*, *>>(jsonObj, MutableMap::class.java) as Map<String?, Any?>?
        } catch (ex: Exception) {
        }
        return hashMap
    }

    fun getPaymentMethod(selectedPaymentMethod: String?): String? {
        var paymentMethod = ""
        return if (selectedPaymentMethod != null) {
            if (selectedPaymentMethod == BundleConstants.PAYMENT_DEFAULT_OPTION) {
                paymentMethod = BundleConstants.PAYMENT_DEFAULT_OPTION
            } else if (selectedPaymentMethod == "Wallets") {
                paymentMethod = "WALLET"
            } else if (selectedPaymentMethod == "Net banking") {
                paymentMethod = "NB"
            } else if (selectedPaymentMethod == "Credit / Debit Cards") {
                paymentMethod = "CARD"
            } else if (selectedPaymentMethod == "Pay later") {
                paymentMethod = "PAY_LATER"
            }
            paymentMethod
        } else ""
    }

    /**
     *
     * This function is used to calculate margin based on device density
     * **/
    fun calculateMargin(pxValue: Int, context: Context): Int {
        val dpRatio: Float = context.resources.displayMetrics.density
        return (pxValue as Int * dpRatio).toInt()
    }

    fun getSourceVersion() = "TM_ANDROID_V_" + BuildConfig.VERSION_NAME

    fun getApplicableCashHandlingCharger(billDetailsData: BillDetailResponse.ResponseData?) : Double {
        var applicableCharge = 0.0

        if (billDetailsData != null && billDetailsData.cashHandlingInfo != null) {
            applicableCharge = billDetailsData.cashHandlingInfo!!.charge ?: 0.0
        } else if (billDetailsData != null && billDetailsData.cashHandlingApplicableInfo != null) {
            if (billDetailsData.pspViewed) applicableCharge = billDetailsData.cashHandlingApplicableInfo!!.charge ?: 0.0
        }
        return applicableCharge
    }
    
    
    fun getApplicableCashHandlingCharger(billDetailsData: BillDetailsModel?) : Double {
        var applicableCharge = 0.0
        
        if (billDetailsData != null && billDetailsData.cashHandlingInfoModel != null) {
            applicableCharge = billDetailsData.cashHandlingInfoModel!!.charge ?: 0.0
        } else if (billDetailsData != null && billDetailsData.cashHandlingApplicableInfoModel != null) {
            if (billDetailsData.pspViewed) applicableCharge = billDetailsData.cashHandlingApplicableInfoModel!!.charge ?: 0.0
        }
        return applicableCharge
    }
}