package com.intellihealth.truemeds.presentation.bindingadapter

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.Slide
import androidx.transition.Transition
import androidx.transition.TransitionManager
import com.intellihealth.salt.callbacks.ProductCardCallback
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.salt.views.TextView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.ChooseLocationCallback
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.adapter.ChildOtcCategoryAdapter
import com.intellihealth.truemeds.presentation.adapter.PersonalCareBannerAdapter
import com.intellihealth.truemeds.presentation.adapter.PersonalCareCategoryAdapter
import com.intellihealth.truemeds.presentation.adapter.PersonalCareProductAdapter
import com.intellihealth.truemeds.presentation.adapter.SavedAddressAdapter
import com.intellihealth.truemeds.presentation.adapter.SuperOtcCategoryAdapter
import com.intellihealth.truemeds.presentation.callbacks.GenericCallback
import com.intellihealth.truemeds.presentation.model.HomeBanner
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel
import org.jetbrains.annotations.NotNull

@BindingAdapter("setPersonalCareList", "setCategoryCallback", "highlightProduct")
fun setPersonalCareList(
    view: RecyclerView,
    list: List<ChildCategoryModel>,
    setCategoryCallback: GenericCallback,
    highlightProduct: Int,
) {
    view.adapter?.run {
        if (this is PersonalCareCategoryAdapter) {
            this.items = list
            this.highlightProduct = highlightProduct
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter =
            PersonalCareCategoryAdapter(list, view.context, setCategoryCallback, highlightProduct)
    }
}

@BindingAdapter("setBanner", "viewModel")
fun setBanner(
    view: RecyclerView,
    list: List<SuperCategoryModel.BannersItem>,
    viewModel: MyOrderViewModel,
) {
    view.adapter?.run {
        if (this is PersonalCareBannerAdapter) {
            this.items = list
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = PersonalCareBannerAdapter(list, viewModel)
    }
}

@BindingAdapter("setProductGrid", "callbackProduct", "viewModel", "fragmentManager")
fun setProductGrid(
    view: RecyclerView,
    list: List<ProductInfoModel>,
    callback: ProductCardCallback,
    viewModel: MyOrderViewModel,
    fragmentManager: FragmentManager,
) {
    view.adapter?.run {
        if (this is PersonalCareProductAdapter) {
            this.items = list
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = PersonalCareProductAdapter(list, callback, viewModel,fragmentManager)
    }
}

@BindingAdapter("setSuperCategories", "viewModel")
fun setSuperCategories(
    view: RecyclerView,
    items: List<SuperCategoryModel>,
    homeViewModel: HomeViewModel
) {
    view.adapter?.run {
        if (this is SuperOtcCategoryAdapter) {
            this.item = items
            this.viewModel = homeViewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        val adapter = SuperOtcCategoryAdapter(items, homeViewModel)
        adapter.setHasStableIds(true)
        view.adapter = adapter
    }
}

@BindingAdapter("setCategories", "setBanners", "superCategoryId", "viewModel")
fun setCategories(
    view: RecyclerView,
    items: List<ChildCategoryModel>,
    banners: List<SuperCategoryModel.BannersItem>,
    superCategoryId: Int,
    homeViewModel: HomeViewModel
) {
    view.adapter?.run {
        if (this is ChildOtcCategoryAdapter) {
            this.categoryModelList = items
            this.banners = banners
            this.superCategoryId = superCategoryId
            this.viewModel = homeViewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        val adapter = ChildOtcCategoryAdapter(items,banners, homeViewModel,superCategoryId)
        adapter.setHasStableIds(true)
        view.adapter = adapter
    }
}

@BindingAdapter("setSavedAddressList", "callbackLocation")
fun setSavedAddressList(
    view: RecyclerView,
    list: List<GetAllAddressResponse.ResponseObj?>?,
    callbackLocation: ChooseLocationCallback
) {
    view.adapter?.run {
        //notify
        if (this is SavedAddressAdapter) {
            if(!list.isNullOrEmpty())   {
                this.list = list
                this.notifyDataSetChanged()
            }

        }
    } ?: run {
        view.adapter?.setHasStableIds(true)
        view.adapter = list?.let { SavedAddressAdapter(it, callbackLocation) }
    }

    @BindingAdapter("setTimer")
    fun setTimer(view: TextView, viewModel: CountDownTimerViewModel) {

    }

    @BindingAdapter(
        "setViewCartVisibility",
        "isActiveOrderClosed",
        "activeBottomNav",
        "cartItemCount"
    )
    fun setViewCartVisibility(
        view: View,
        activeOrderCount: Int,
        isActiveOrderClosed: Boolean,
        activeBottomNav: String,
        cartItemCount: Int
    ) {
        val transition: Transition = Slide(Gravity.BOTTOM)
        transition.duration = 300
        transition.addTarget(view)
        TransitionManager.beginDelayedTransition((view.parent as ViewGroup), transition)
        if (!isActiveOrderClosed && activeOrderCount > 0) {
            view.visibility = View.GONE
        } else if (cartItemCount > 0 && activeBottomNav == "Home") {
            view.visibility = View.VISIBLE
        } else {
            view.visibility = View.GONE
        }
    }
}


@BindingAdapter("setMRPTwoDecimalFormat")
fun setMRPTwoDecimalFormat(textView: com.intellihealth.salt.views.TextView, mrp: Double?) {
    textView.text =textView.context.getString(R.string.Rs) +formatDecimal(mrp?:0.0)
}

@BindingAdapter("setFooterHeight", "cartItemCount", "isOrderTrackerVisible")
fun setFooterHeight(view: View, homeViewModel: HomeViewModel, cartItemCount: LiveData<Int>, isActiveOrderClosed : MutableLiveData<Boolean>) {
    var newHeightInPixels = 12

    var isCartVisible = cartItemCount.value!! != 0 || SharedPrefManager.getInstance().prescriptionCount != 0
    var isOrderTrackerVisible = isActiveOrderClosed.value == true

    if (isCartVisible && !isOrderTrackerVisible){
        newHeightInPixels = view.resources.getDimensionPixelSize(R.dimen.d84)
        homeViewModel.isRoundedCornerBottomSheet.value = false
    }else if (isCartVisible){
        newHeightInPixels = view.resources.getDimensionPixelSize(R.dimen.d30)
        homeViewModel.isRoundedCornerBottomSheet.value = true
    }else if (!isOrderTrackerVisible){
        newHeightInPixels = view.resources.getDimensionPixelSize(R.dimen.d30)
        homeViewModel.isRoundedCornerBottomSheet.value = false
    }else{
        homeViewModel.isRoundedCornerBottomSheet.value = true
    }

//    // Set padding for bottom of the ImageView
//    if (view is AppCompatImageView) {
//        view.setPadding(0, 0,0, newHeightInPixels)
//    }

    val layoutParams = view.layoutParams
    layoutParams.height = newHeightInPixels
    view.layoutParams = layoutParams
}
