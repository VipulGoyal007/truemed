package com.intellihealth.truemeds.presentation.bottomsheet.productdetail


import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.gson.Gson
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.ProductBottomSheetCallback
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.utils.PopUpManager
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.BottomsheetProductDetailBinding
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.fragment.InternalServerErrorCallback
import com.intellihealth.truemeds.presentation.fragment.ProductDetailFragment
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel
import kotlin.math.roundToInt


class ProductDetailBottomSheet() : BottomSheetDialogFragment(),
    InternalServerErrorCallback {
    private lateinit var binding: BottomsheetProductDetailBinding
    private lateinit var viewModel: ProductDetailViewModel
    private var productDetailFragment: Fragment? = null
    private lateinit var pdBottomSheetCallback: ProductBottomSheetCallback
    private var isFromOrderStatus=false
    private var isFromOTC=false
    private var orgProductForThis:String?= null
    private var eventOrgProductForThis:String?= null
    var mBottomSheetListener: CrossSellingProductBSCallback?=null
    var productCode:String?=""
    var isSubs:Boolean= false
    var isFromCrossSelling:Boolean= false
    var switchBackSkuNameForBottomSheetSubs:String?=""
    var orgProductOfSubs:String?=""
    var isMRPSellingDivideByQty:Boolean = true
    var clickedOnPage:String?=""
    var pageSection:String?=""
    var subsFoundEventOrderSummary:String= ""
    var otcSuperCategoryName:String?=null
    var otcSubCategoryName:String?=null
    var otcCategoryName:String?=null
    var crossSellingHeading:String?= null
    var crossSellingItemClickPos:Int?=0
    private var isHideToolbar:Boolean= false
    private var isHideCart:Boolean= false
    private var isBottomSheetBehaviour:Boolean= false

    constructor(productCode:String?="",
                 isSubs:Boolean= false,
                 isFromCrossSelling:Boolean= false,
                 listener: CrossSellingProductBSCallback?=null,
                 switchBackSkuNameForBottomSheetSubs:String?="",
                 orgProductOfSubs:String?="",
                 isMRPSellingDivideByQty:Boolean = true,
                 clickedOnPage:String,
                 pageSection:String,
                 subsFoundEventOrderSummary:String= "",
                 otcSuperCategoryName:String?=null,
                 otcSubCategoryName:String?=null,
                 otcCategoryName:String?=null,
                 crossSellingHeading:String?= null,
                 crossSellingItemClickPos:Int?=0,
                isHideToolbar:Boolean= false,
                isHideCart:Boolean= false,
                isBottomSheetBehaviour:Boolean= false) : this(){
        this.productCode = productCode
        this.isSubs = isSubs
        this.isFromCrossSelling=isFromCrossSelling
        this.mBottomSheetListener=listener
        this.switchBackSkuNameForBottomSheetSubs=switchBackSkuNameForBottomSheetSubs
        this.orgProductOfSubs=orgProductOfSubs
        this.isMRPSellingDivideByQty=isMRPSellingDivideByQty
        this.clickedOnPage=clickedOnPage
        this.pageSection=pageSection
        this.subsFoundEventOrderSummary=subsFoundEventOrderSummary
        this.otcSuperCategoryName=otcSuperCategoryName
        this.otcSubCategoryName=otcSubCategoryName
        this.otcCategoryName=otcCategoryName
        this.crossSellingHeading=crossSellingHeading
        this.crossSellingItemClickPos=crossSellingItemClickPos
        this.isHideToolbar=isHideToolbar
        this.isHideCart=isHideCart
        this.isBottomSheetBehaviour=isBottomSheetBehaviour
    }


    /*init {
        this.mBottomSheetListener = listener
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    fun dataFromOrderStatus(b: Boolean, orgProductForThisPage: com.intellihealth.truemeds.presentation.model.ProductInfoModel?= null, isOTC: Boolean = false,
                            eventOrgProductForThisPage: com.intellihealth.truemeds.presentation.model.ProductInfoModel?= null) {
        isFromOrderStatus=b
        isFromOTC=isOTC
        if(orgProductForThisPage != null){
            val model = Gson().toJson(orgProductForThisPage)
            orgProductForThis= model
        }
        if(eventOrgProductForThisPage != null){
            val model = Gson().toJson(eventOrgProductForThisPage)
            eventOrgProductForThis= model
        }
    }
    
    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        if (::pdBottomSheetCallback.isInitialized) {
            pdBottomSheetCallback.closeClick()
        }
    }
    
    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        if (::pdBottomSheetCallback.isInitialized) {
        pdBottomSheetCallback.closeClick()}
    }
    
    override fun onDestroy() {
        super.onDestroy()
        if(isFromCrossSelling){
            mBottomSheetListener?.dismissProductDetailBottomsheet(productCode?:"")
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
       /** attach listener from parent fragment */
        try {
            mBottomSheetListener = context as CrossSellingProductBSCallback
        }
        catch (e: ClassCastException){
            e.printStackTrace()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.bottomsheet_product_detail, container, false)
        viewModel = ViewModelProvider(requireActivity())[ProductDetailViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpData()
        setListeners()
       /*dialog?.let {
            val sheet = it as BottomSheetDialog
           sheet.behavior.peekHeight=1500
           sheet.behavior.skipCollapsed = false
            sheet.behavior.state = BottomSheetBehavior.STATE_COLLAPSED
       }*/
    }

    private fun setUpData() {

        productDetailFragment = ProductDetailFragment.getInstance(
            isSubs,
            isBottomSheetBahaviour = true,
            searchType = ElasticSearchType.FETCH_PRODUCT_DETAILS.name,
            productCode = productCode ?: "",
            isFromCrossSelling = isFromCrossSelling,
            isFromOrderStatus = isFromOrderStatus,
            orgProductForThisPage = orgProductForThis,
            switchBackSkuNameForBottomSheetSubs = switchBackSkuNameForBottomSheetSubs,
            isFromOTC = isFromOTC,
            orgProductOfSubs = orgProductOfSubs,
            isDivideMRPSellingWithQty = isMRPSellingDivideByQty,
            clickedOnPage=clickedOnPage,
            section =pageSection,
            subsFoundEventOrderSummary = subsFoundEventOrderSummary?:"",
            eventOrgProductForThisPage = eventOrgProductForThis?:null,
            otcSuperCategoryName = otcSuperCategoryName,
            otcCategoryName = otcCategoryName,
            otcSubCategoryName = otcSubCategoryName,
            crossSellingSectionHeadingEvent = crossSellingHeading, sectionRow = 1, sectionIndex = crossSellingItemClickPos
        )
        (productDetailFragment as ProductDetailFragment)?.setInternalServerErrorCallback(this)
        this.childFragmentManager
            .beginTransaction()
            .add(
                com.intellihealth.truemeds.R.id.fragProductDetail,
                productDetailFragment!!,
                "PRODUCT_DETAIL_FRAGMENT"
            )
            .commit()

    }

    private fun setListeners() {
        binding.ivClose.setOnClickListener {
            dismiss()
        }
        
        viewModel.eventDismissBottomSheet.observe(this, com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver {
            if (::pdBottomSheetCallback.isInitialized) {
                pdBottomSheetCallback.closeClick()
            }
        })
    }

    @SuppressLint("RestrictedApi")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)


        /*(dialog as BottomSheetDialog).behavior.peekHeight=1500
        (dialog as BottomSheetDialog).behavior.skipCollapsed = false
        (dialog as BottomSheetDialog).behavior.state = BottomSheetBehavior.STATE_COLLAPSED*/
        Log.i("dialog created","dialog created")

        dialog.setOnShowListener { dialogInterface: DialogInterface? ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog?
            setupFullHeight(bottomSheetDialog!!)
        }

        (dialog as BottomSheetDialog).behavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                Log.i("onStateChanged",""+newState)
            }
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                Log.i("onSlide",""+slideOffset)
                val drawerHeight = bottomSheet.height * slideOffset
                Log.i("drawerHeight",""+drawerHeight)
            }
        })
        return dialog
    }

    private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog?) {
        val bottomSheet =
            bottomSheetDialog?.findViewById<FrameLayout>(com.google.android.material.R.id.design_bottom_sheet)

        //Retrieve bottom sheet parameters

        val bottomSheetLayoutParams = bottomSheet?.layoutParams
        bottomSheetLayoutParams?.height = getBottomSheetDialogDefaultHeight()
        val expandedHeight = bottomSheetLayoutParams?.height
        /*val peekHeight =
            (expandedHeight?.div(1.5))
        Log.i("expandedHeight",""+peekHeight)*/

        //Setup bottom sheet
        //bottomSheet.layoutParams = bottomSheetLayoutParams
        BottomSheetBehavior.from(bottomSheet!!).state = BottomSheetBehavior.STATE_COLLAPSED
        BottomSheetBehavior.from(bottomSheet).skipCollapsed = false
        BottomSheetBehavior.from(bottomSheet).peekHeight = (getWindowHeight() * 0.75).toInt()
        BottomSheetBehavior.from(bottomSheet).isFitToContents = false
        BottomSheetBehavior.from(bottomSheet).isHideable = true
        BottomSheetBehavior.from(bottomSheet).expandedOffset = 130

    }

    /*private fun getWindowHeight(): Int {
        return WindowManager.LayoutParams.MATCH_PARENT
    }*/

    private fun getWindowHeight(): Int {
        try {
            val displayMetrics = DisplayMetrics()
            if(isAdded) {
                requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
            }
            return (displayMetrics.heightPixels).toInt()
        }catch (_:Exception){
            return 50
        }
    }

    private fun getBottomSheetDialogDefaultHeight(): Int {
        return getWindowHeight() * 99 / 100

    }

    override fun getTheme() = R.style.BottomSheetDialog

    interface CrossSellingProductBSCallback {
        fun dismissProductDetailBottomsheet(productCode:String)
    }
    
    
    fun setCallback(pdBottomSheetCallback: ProductBottomSheetCallback) {
        this.pdBottomSheetCallback = pdBottomSheetCallback
    }

    override fun showInternalServerErrorDialogActivity() {
        //do nothing
    }

    override fun showInternalServerErrorDialogBottomsheet() {
        showInternalServerError()
    }

    private fun showInternalServerError(){
        if (!isAdded) return
        PopUpManager.showPopUp(
            fragmentManager = requireActivity().supportFragmentManager,
            popUpType = PopUpType.API_FAILURE,
            object : PopUpDialogCallback {
                override fun onActionButtonClicked() { dismiss()}
                override fun onCloseButtonClicked() { dismiss()}
                override fun onDismissOutside() {
                    super.onDismissOutside()
                    dismiss()
                }
            }, false
        )
    }



}