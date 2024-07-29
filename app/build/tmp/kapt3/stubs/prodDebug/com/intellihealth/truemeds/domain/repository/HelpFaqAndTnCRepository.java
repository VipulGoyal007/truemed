package com.intellihealth.truemeds.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u000bJ*\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00a2\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\u0011J*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\u0011J*\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u00a6@\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006 "}, d2 = {"Lcom/intellihealth/truemeds/domain/repository/HelpFaqAndTnCRepository;", "", "acceptPPOrTNC", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "customerId", "", "type", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIfCustomerAcceptedPPAndTNC", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/AcceptedPPAndTnCResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFAQCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFAQByCategory", "categoryId", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHelpCategory", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse;", "getHelpCategoryDetails", "reasonId", "getPP", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/PrivacyPolicyAndTnCResponse;", "getTNC", "isPrimary", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface HelpFaqAndTnCRepository {
    
    /**
     * This service provides help category list
     * Show help list that contains medicine orders related help,delivery related help etc..
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse>>> $completion);
    
    /**
     * This service provides particular help category details eg medicine order related in details, cancel order something
     * Pass particular reason id that fetch details of category
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHelpCategoryDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String reasonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse>>> $completion);
    
    /**
     * This service provides all FAQ category
     * Fetch Customer related question that customer ask frequently
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllFAQCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse>>> $completion);
    
    /**
     * This service provides FAQ by category ex TM cash wallet related question
     * Pass particular categoryId that returns FAQ of that category
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFAQByCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, int categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse>>> $completion);
    
    /**
     * This service provides application privacy policy data
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPP(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse>>> $completion);
    
    /**
     * This service provides application terms and condition data
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTNC(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, boolean isPrimary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse>>> $completion);
    
    /**
     * This service checks whether new privacy policy is accepted or not
     * independent api call, not dependent on any other api response
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkIfCustomerAcceptedPPAndTNC(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.helpfaqtnc.AcceptedPPAndTnCResponse>>> $completion);
    
    /**
     * This service checks customer pp or tnc accepted
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object acceptPPOrTNC(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion);
}