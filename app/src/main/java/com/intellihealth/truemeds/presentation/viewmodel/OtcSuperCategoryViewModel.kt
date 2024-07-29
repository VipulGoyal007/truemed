package com.intellihealth.truemeds.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.JsonArray
import com.intellihealth.truemeds.domain.usecase.analytics.AppsFlyerEventUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject

class OtcSuperCategoryViewModel @Inject constructor(
    private val mixPanelEventUseCase: MixPanelEventUseCase,
    private val cleverTapEventUseCase: CleverTapEventUseCase,
    private val appsFlyerEventUseCase: AppsFlyerEventUseCase,
) : ViewModel(), DefaultLifecycleObserver {

    /**
     * 1) Fetch products list based on category selected
     * 2) We will have pagination on scroll where data will come as follows : 1st page will have total 16 products,
     * 6 products and then top deals sections
     * and then later 10 products, after that on every load more there will be 10 products on every page
     * 3) Also we check if any product is added to the local db, if yes then show quantity stepper for that product and post the list again
     * 4) We will also check for brands list coming from deeplink as well as from the API
     * 5) Process Top deals list from the API response - processOtcList()
     * **/
    private fun fetchProductsForCategoriesTopSix(){

    }

    /**
     * 1) This function is used to fetch the brands list on selection of category/sub category from filter bottomsheet
     * 2) Accepts 2 parameters categoryId and subcategoryId
     * 3) Call the same API which is used to fetch fetchProductsForCategoriesTopSix()
     * 4) For brandlist we need to pass isBrandOnly True where we will get only brandslist
     * **/
    private fun callApiForBrandsList(categoryId: Int, subCategoryId: Int) = viewModelScope.launch(IO) {

    }

    /**
     * 1) Here we process top deals list
     * 2) Top deals is a horizontal scrolling products list with infinite scrolling
     * 3) We will always show the first top deal as selected
     * 4) Also we check if any top deal product is added to the local db, if yes then show quantity stepper for that product and post the list again
     * **/
    private fun processTopDealsList(){

    }

    /**
     * 1) Whenever we add a top deal product we show a quantity stepper for that product
     * 2) Example - If we click on that product we show a PD bottomsheet and if we increase/decrease the quantity from PD bottomsheet,
     * quantity gets updated on PD bottomsheet but once we close
     * the bottomsheet the same quantity should also get reflected in the top deals section of that top deal product
     * **/
    private fun processTopDealsListOnResume(){

    }

    /**
     * 1) Call this function from activity eventlistener 'show OTC list event'
     * 2) Call refreshTopDealCardData function
     * **/
    private fun setUpTopDealsList() {

    }

    /**
     *
     * **/
    private fun refreshTopDealCardData(){

    }

    /**
     * 1) This function accepts MedicineListDataModel, qty as parameters
     * 2) This function is used to add the top deal product to the local db
     * 3) For adding item call addItemToCart()
     * **/
    private fun onAddTopDealProduct(){

    }

    /**
     * 1) on click of Top deal horizontal list item
     * 2) smoothSnapToPosition event called
     * 3) update selected top deal product position
     * 4) accept 2 parameters item: MedicineListDataModel, position: Int
     * **/
    fun onItemClickTopDeal() {

    }

    /**
     * After adding item to local db, setCartCount is called to update the cart count at the top right corner of the screen
     * **/
    private fun addItemToCart(){

    }

    /**
     * 1) Set Banner, horizontal list of categories, we are adding 'All' as the first item for every super categories category list
     * as 'All' is not coming from the API response
     * 2) Store the previous selected category id, collectionid and level as this will be helpful when user clears the filter
     * 3)
     * **/
    private fun setCategoryListData(){

    }

    /**
     * Every category will have a sub category list, we will set that subcategorylist here
     * */
    private fun setSubCategoryListData() {

    }

    /**
     * 1) This function accepts CategoryList model as a  parameter
     * 2) fetchCategoryData event is fired which accepts FetchCategoryEventModel as a parameter,
     * this event will call the fetchProductsForCategoriesTopSix() to fetch the category products
     * **/
    fun getCategoryProducts() = viewModelScope.launch(IO) {

    }

    /**
     * 1) This function is called from the activity after processing the intent data of homepagecategories response
     * 2) This function accepts clickType Int as a parameter, based on clickType fetchCategoryData event is fired
     * 3) fetchCategoryData event accepts FetchCategoryEventModel as a parameter,
     * this event will call the fetchProductsForCategoriesTopSix() to fetch the category products
     * **/
    fun getCategoryProducts(clickType : Int) = viewModelScope.launch(IO) {

    }

    /**
     * 1) This function is called whenever we change the category
     * 2) We pass model item and the position to this function
     * 3) If at all any filter is applied then on change the filter will also be removed
     * 4) Loop the categoryList and post its value again so that the list contains updated selected values like categoryId,
     * collectionid, level, clickType and position
     * 5) API will be called to fetch the products for the selected category
     * **/
    private fun onCategoryItemClick(){

    }

    /**
     * 1) This function is used to add the otc product on click of Add button
     * 2) This function accepts 3 parameters SearchedMedicine item, position, isPagingItem- boolean
     * 3) setCartCount() is called after adding item to update the cart count
     * **/
    private fun addMedicineClick() {

    }

    /**
     * 1) Open PD bottomsheet for OTC product
     * 2) This event is observed in activity
     * 3) This function accepts position: Int, item: SearchedMedicine parameters
     * **/
    private fun openPdBottomSheet(){

    }

    /**
     * 1) Open PD bottomsheet for Top deal product
     * 2) This event is observed in activity
     * 3) This function accepts MedicineListDataModel parameter
     * **/
    fun openPdPageBottomSheetForTopDeal() {

    }

    /**
     * 1) This function is used to increase the medicine count
     * 2) This function accepts 3 parameters SearchedMedicine item, position, isPagingItem- boolean
     * 3) setCartCount() is called after increasing item count to update the cart count
     * **/
    private fun onOriginalCountIncreasedFromList() {

    }

    /**
     * 1) This function is used to decrease the medicine count
     * 2) This function accepts 3 parameters SearchedMedicine item, position, isPagingItem- boolean
     * 3) if the qty is decreased by 1 then we give the user a confirmation popup to remove the item
     * 4) setCartCount() is called after decreasing any item count to update the cart count
     * **/
    private fun onOriginalCountDecreasedFromList() {

    }

    /**
     * 1) This function is used to increase the medicine count of Top Deal product
     * 2) This function accepts 1 parameter MedicineListDataModel item
     * 3) setCartCount() is called after increasing item count to update the cart count
     * **/
    private fun increaseTopDealProductCount() {

    }

    /**
     * 1) This function is used to decrease the medicine count of Top Deal product
     * 2) This function accepts 1 parameter MedicineListDataModel item
     * 3) if the qty is decreased by 1 then we give the user a confirmation popup to remove the item
     * 4) setCartCount() is called after decreasing any item count to update the cart count
     * **/
    private fun decreaseTopDealProductCount() {

    }

    /**
     * 1) This function is executed whenever there is only single count of item for OTC product and the user wants to remove it completely
     * 2) This function accepts 2 parameters SearchedMedicine item, isPagingItem Boolean
     * 3) item.qty = 0 before removal of medicine
     * 4) remove medicine from cart
     * 5) call api removeItemFromServer()
     * 6) setCartCount() is called after to update the cart count
     * **/
    private fun removeLastItem() {

    }

    /**
     * 1) This function is executed whenever there is only single count of item for Top deal product and the user wants to remove it completely
     * 2) This function accepts 2 parameters MedicineListDataModel item, isPagingItem Boolean
     * 3) item.qty = 0 before removal of medicine
     * 4) remove medicine from cart
     * 5) call api removeItemFromServer()
     * 6) setCartCount() is called after to update the cart count
     * **/
    private fun removeLastItemForTopDeal() {

    }

    /**
     * 1) This function accepts 2 parameters medicineName and originalProductCode
     * 2) editMedicine API is called inside this function
     * 3) setCartCount() is called after to update the cart count
     * **/
    private fun removeItemFromServer(medicineName: String?,original_product_code: String?) {

    }

    /**
     * 1) Update the cart count
     * 2) call setCartTotalSellingPrice()
     * **/
    fun setCartCount() {

    }

    /**
     * 1) This function is used to set the cart total selling price
     * 2) Check for checkCartAndPrescription()- if prescription is added we don't show any cart count we just show a big red dot
     *  in the cart icon to denote only prescription is added
     */
    private fun setCartTotalSellingPrice(){

    }

    /**
     * 1) SharedPrefManager.getInstance().prescriptionCount > 0 -> return
     * 2) cart < 1 || c.minValue > sellingPrice -> remove
     */
    private fun checkCartAndPrescription() {

    }


    /**
     * 1) This function is called from the filter bottomsheet whenever we select sub category
     * 2) store the selected values in a local mutable variable
     * 3) Update the position of category because if sub category is selected, the particular category is shown as selected in OTC screen
     * 4) Accepts 1 parameter item: SubCategoryList
     * **/
    fun onSelectedSubCategoryItemClick() {

    }

    /**
     * 1) This function is called from the filter bottomsheet whenever we select brands
     * 2) store the selected values in a local mutable variable
     * 3) this function accepts 1 parameter the selected value as string
     * **/
    fun onSelectedBrandsItemChecked(item: String) {

    }

    /**
     * Filter clicked state maintain for brands selection
     * **/
    fun onBrandsCheckBoxClicked(name: String, checked: Boolean) {

    }

    /**
     * 1) on click of apply filter button in Filter Bottomsheet call this function and call API to load the list based on filter values
     * 2) fetchProductsForCategoriesTopSix()
     * 3) the api will only be called only if there is any selection in the filter bottomsheet
     * **/
    private fun applyFilterValues() {

    }

    /**
     * 1) Clear the values of filter which were already applied
     * 2) Reset the category selected position
     * 3) call fetchProductsForCategoriesTopSix()
     * 4) onApplyFilterCategoryChange() - user gets back 0th position category
     * **/
    private fun clearFilterValues() {

    }

    /**
     * 1) Call this function on close of filter bottomsheet
     * 2) fetchProductsForCategoriesTopSix() - pass previousid, previouscollectionid, previouslevel
     * 3) clearLocalSelectedValues()
     * **/
    private fun clearSelection() {

    }

    /**
     * Clear all the local selected values - categoryid, subcategoryid, brandsfilter, filtercount, tempfiltercount, jsonarray for brands which is used as a body request
     * **/
    private fun clearLocalSelectedValues() {

    }

    /**
     * 1) Call this function onResume of activity
     * 2) This function is used to check whether any product is already added in cart so that quantity stepper will be shown for that product
     * **/
    private fun fetchCartItems() {

    }

}