package com.intellihealth.truemeds.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.intellihealth.truemeds.data.api.CancelOrderApi;
import com.intellihealth.truemeds.data.api.CashFreeApi;
import com.intellihealth.truemeds.data.api.HelpFaqTncApi;
import com.intellihealth.truemeds.data.api.HomePageApi;
import com.intellihealth.truemeds.data.api.LoginApi;
import com.intellihealth.truemeds.data.api.OrderFlowApi;
import com.intellihealth.truemeds.data.api.OrderReminderApi;
import com.intellihealth.truemeds.data.api.OrderStatusApi;
import com.intellihealth.truemeds.data.api.ProductListAndDetailsApi;
import com.intellihealth.truemeds.data.api.SplashScreenApi;
import com.intellihealth.truemeds.data.api.UserDataApi;
import com.intellihealth.truemeds.data.api.WalletAndReferralApi;
import com.intellihealth.truemeds.data.repository.CancelOrderRepositoryImpl;
import com.intellihealth.truemeds.data.repository.CashFreeRepositoryImpl;
import com.intellihealth.truemeds.data.repository.HelpFaqAndTnCRepositoryImpl;
import com.intellihealth.truemeds.data.repository.HomePageRepositoryImpl;
import com.intellihealth.truemeds.data.repository.LoginRepositoryImpl;
import com.intellihealth.truemeds.data.repository.OrderFlowRepositoryImpl;
import com.intellihealth.truemeds.data.repository.OrderReminderRepositoryImpl;
import com.intellihealth.truemeds.data.repository.OrderStatusRepositoryImpl;
import com.intellihealth.truemeds.data.repository.ProductListAndDetailsRepositoryImpl;
import com.intellihealth.truemeds.data.repository.SearchRepositoryImpl;
import com.intellihealth.truemeds.data.repository.SplashScreenRepositoryImpl;
import com.intellihealth.truemeds.data.repository.TmWalletRepositoryImpl;
import com.intellihealth.truemeds.data.repository.UserDataRepositoryImpl;
import com.intellihealth.truemeds.data.repository.datasource.local.LocalDbRepositoryImpl;
import com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao;
import com.intellihealth.truemeds.data.repository.datasource.remote.CancelOrderRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasource.remote.CashFreeRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasource.remote.HelpFaqAndTnCRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasource.remote.HomePageRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderFlowRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderReminderRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderStatusRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasource.remote.ProductListAndDetailsRemoteDataSource;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.CancelOrderRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.CashFreeRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.ElasticMedicineRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.HelpFaqAndTnCRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.HomePageRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.LoginRemoteDataImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderFlowRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderReminderRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderStatusRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.ProductListAndDetailsRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.SplashScreenRemoteDataImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.TmWalletRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.repository.datasourceimpl.remote.UserRemoteDataSourceImpl;
import com.intellihealth.truemeds.data.utils.ApiCallInitClass;
import com.intellihealth.truemeds.di.ApiModule;
import com.intellihealth.truemeds.di.ApiModule_ProvidesLoginApiFactory;
import com.intellihealth.truemeds.di.ApiModule_ProvidesRetrofitFactory;
import com.intellihealth.truemeds.di.ApiModule_ProvidesUserDataApiFactory;
import com.intellihealth.truemeds.di.CancelOrderNetworkModule;
import com.intellihealth.truemeds.di.CancelOrderNetworkModule_ProvidesCancelOrderApiFactory;
import com.intellihealth.truemeds.di.CashFreeNetworkModule;
import com.intellihealth.truemeds.di.CashFreeNetworkModule_ProvidesCashFreeApiFactory;
import com.intellihealth.truemeds.di.HelpFaqTncNetworkModule;
import com.intellihealth.truemeds.di.HelpFaqTncNetworkModule_ProvidesHelpFaqTncApiFactory;
import com.intellihealth.truemeds.di.HomePageNetworkModule;
import com.intellihealth.truemeds.di.HomePageNetworkModule_ProvidesHomePageApiFactory;
import com.intellihealth.truemeds.di.OkHttpClientModule;
import com.intellihealth.truemeds.di.OkHttpClientModule_CacheFactory;
import com.intellihealth.truemeds.di.OkHttpClientModule_FileFactory;
import com.intellihealth.truemeds.di.OkHttpClientModule_HttpLoggingInterceptorFactory;
import com.intellihealth.truemeds.di.OkHttpClientModule_ProvidesOkHttpClientFactory;
import com.intellihealth.truemeds.di.OrderFlowNetworkModule;
import com.intellihealth.truemeds.di.OrderFlowNetworkModule_ProvidesOrderFlowApiFactory;
import com.intellihealth.truemeds.di.OrderReminderNetworkModule;
import com.intellihealth.truemeds.di.OrderReminderNetworkModule_ProvidesOrderReminderApiFactory;
import com.intellihealth.truemeds.di.OrderStatusNetworkModule;
import com.intellihealth.truemeds.di.OrderStatusNetworkModule_ProvidesOrderStatusApiFactory;
import com.intellihealth.truemeds.di.ProductListAndDetailsNetworkModule;
import com.intellihealth.truemeds.di.ProductListAndDetailsNetworkModule_ProvidesProductListAndDetailsApiFactory;
import com.intellihealth.truemeds.di.RoomDbModule;
import com.intellihealth.truemeds.di.RoomDbModule_ProvideAppDaoFactory;
import com.intellihealth.truemeds.di.SplashScreenNetworkModule;
import com.intellihealth.truemeds.di.SplashScreenNetworkModule_ProvidesSplashScreenApiFactory;
import com.intellihealth.truemeds.di.ValueProviderModule;
import com.intellihealth.truemeds.di.ValueProviderModule_GetContentTypeFactory;
import com.intellihealth.truemeds.di.VideoFAQModule;
import com.intellihealth.truemeds.di.WalletAndReferralNetworkModule;
import com.intellihealth.truemeds.di.WalletAndReferralNetworkModule_ProvidesWalletAndReferralApiFactory;
import com.intellihealth.truemeds.domain.usecase.AddPatientUseCase;
import com.intellihealth.truemeds.domain.usecase.CancelOrderUseCase;
import com.intellihealth.truemeds.domain.usecase.CartUseCase;
import com.intellihealth.truemeds.domain.usecase.CashFreeUseCase;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.EditPatientUseCase;
import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase;
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.LoginUseCase;
import com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderStatusUseCase;
import com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase;
import com.intellihealth.truemeds.domain.usecase.PersonalCareUseCase;
import com.intellihealth.truemeds.domain.usecase.ProductDetailUseCase;
import com.intellihealth.truemeds.domain.usecase.ProductListAndDetailsUseCase;
import com.intellihealth.truemeds.domain.usecase.ReminderUseCase;
import com.intellihealth.truemeds.domain.usecase.ReorderUseCase;
import com.intellihealth.truemeds.domain.usecase.SearchUseCase;
import com.intellihealth.truemeds.domain.usecase.SplashScreenUseCase;
import com.intellihealth.truemeds.domain.usecase.TmWalletUseCase;
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.AppsFlyerEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.FacebookEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
import com.intellihealth.truemeds.presentation.activity.AddAddressActivity;
import com.intellihealth.truemeds.presentation.activity.AddPatientActivity;
import com.intellihealth.truemeds.presentation.activity.CancelOrderActivity;
import com.intellihealth.truemeds.presentation.activity.CancelOrderSubActivity;
import com.intellihealth.truemeds.presentation.activity.CartActivity;
import com.intellihealth.truemeds.presentation.activity.CartActivity_MembersInjector;
import com.intellihealth.truemeds.presentation.activity.CouponActivity;
import com.intellihealth.truemeds.presentation.activity.DeliveryDetailsActivity;
import com.intellihealth.truemeds.presentation.activity.EditProfileActivity;
import com.intellihealth.truemeds.presentation.activity.FaqViewAllActivity;
import com.intellihealth.truemeds.presentation.activity.HealthArticleDetailActivity;
import com.intellihealth.truemeds.presentation.activity.HealthArticleDetailActivity_MembersInjector;
import com.intellihealth.truemeds.presentation.activity.HealthArticlesActivity;
import com.intellihealth.truemeds.presentation.activity.HelpActivity;
import com.intellihealth.truemeds.presentation.activity.HelpSubCategoryActivity;
import com.intellihealth.truemeds.presentation.activity.HelpSubCategoryDetailActivity;
import com.intellihealth.truemeds.presentation.activity.HomePageActivity;
import com.intellihealth.truemeds.presentation.activity.LoginActivity;
import com.intellihealth.truemeds.presentation.activity.LoginActivity_MembersInjector;
import com.intellihealth.truemeds.presentation.activity.ManageAddressActivity;
import com.intellihealth.truemeds.presentation.activity.ManagePatientActivity;
import com.intellihealth.truemeds.presentation.activity.MyOrdersActivity;
import com.intellihealth.truemeds.presentation.activity.NonActiveOrderStatusActivity;
import com.intellihealth.truemeds.presentation.activity.OrderStatusActivity;
import com.intellihealth.truemeds.presentation.activity.OrderStatusActivity_MembersInjector;
import com.intellihealth.truemeds.presentation.activity.OrderSummaryActivity;
import com.intellihealth.truemeds.presentation.activity.OtcCategoryActivity;
import com.intellihealth.truemeds.presentation.activity.PatientReminderActivity;
import com.intellihealth.truemeds.presentation.activity.PaymentActivity;
import com.intellihealth.truemeds.presentation.activity.PaymentOptionActivity;
import com.intellihealth.truemeds.presentation.activity.PoliciesPageActivity;
import com.intellihealth.truemeds.presentation.activity.PoliciesPageActivity_MembersInjector;
import com.intellihealth.truemeds.presentation.activity.PolicyDetailActivity;
import com.intellihealth.truemeds.presentation.activity.PrescriptionActivity;
import com.intellihealth.truemeds.presentation.activity.ProductDetailActivity;
import com.intellihealth.truemeds.presentation.activity.ProductListViewAllActivity;
import com.intellihealth.truemeds.presentation.activity.ReferAndEarnActivity;
import com.intellihealth.truemeds.presentation.activity.ReferAndEarnActivity_MembersInjector;
import com.intellihealth.truemeds.presentation.activity.SearchResultActivity;
import com.intellihealth.truemeds.presentation.activity.SearchSuggestionActivity;
import com.intellihealth.truemeds.presentation.activity.SplashScreen;
import com.intellihealth.truemeds.presentation.activity.SubstitutesActivity;
import com.intellihealth.truemeds.presentation.activity.VideoFaqActivity;
import com.intellihealth.truemeds.presentation.activity.WalletActivity;
import com.intellihealth.truemeds.presentation.activity.WalletTransactionsActivity;
import com.intellihealth.truemeds.presentation.activity.WalletTransactionsActivity_MembersInjector;
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent;
import com.intellihealth.truemeds.presentation.analytics.CleverTapEvent;
import com.intellihealth.truemeds.presentation.analytics.FacebookEvent;
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent;
import com.intellihealth.truemeds.presentation.analytics.MixPanelEvent;
import com.intellihealth.truemeds.presentation.bottomsheet.AddReminderBottomSheet;
import com.intellihealth.truemeds.presentation.bottomsheet.AddReminderBottomSheet_MembersInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.PastPrescriptionBottomSheet;
import com.intellihealth.truemeds.presentation.bottomsheet.PaymentChangeSelectionBottomSheet;
import com.intellihealth.truemeds.presentation.bottomsheet.PaymentUnsuccessfulBottomsheet;
import com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet;
import com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet_MembersInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet;
import com.intellihealth.truemeds.presentation.bottomsheet.ViewBillDetailsBottomSheet;
import com.intellihealth.truemeds.presentation.fragment.AccountFragment;
import com.intellihealth.truemeds.presentation.fragment.HomeFragment;
import com.intellihealth.truemeds.presentation.fragment.HomeFragment_MembersInjector;
import com.intellihealth.truemeds.presentation.fragment.LoginMobileNumberFragment;
import com.intellihealth.truemeds.presentation.fragment.LoginMobileNumberFragment_MembersInjector;
import com.intellihealth.truemeds.presentation.fragment.LoginOtpFragment;
import com.intellihealth.truemeds.presentation.fragment.LoginOtpFragment_MembersInjector;
import com.intellihealth.truemeds.presentation.fragment.MyOrdersFragment;
import com.intellihealth.truemeds.presentation.fragment.MyReferralsFragment;
import com.intellihealth.truemeds.presentation.fragment.ProductDetailFragment;
import com.intellihealth.truemeds.presentation.fragment.ReferAndEarnFragment;
import com.intellihealth.truemeds.presentation.fragment.ReferEarnFragment;
import com.intellihealth.truemeds.presentation.fragment.ReferNowFragment;
import com.intellihealth.truemeds.presentation.fragment.ReferNowFragment_MembersInjector;
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.AddAddressViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.AddAddressViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.AddAddressViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.AddPatientDetailsViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.AddPatientDetailsViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.AddPatientDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.AddPatientViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.AddPatientViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel_MembersInjector;
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.OtcCategoryViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.OtcCategoryViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.OtcCategoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel_MembersInjector;
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel_MembersInjector;
import com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.SubstitutePageViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.SubstitutePageViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.SubstitutePageViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.VideoFaqViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.VideoFaqViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.VideoFaqViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel_HiltModules_KeyModule_ProvideFactory;
import com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel_Factory;
import com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.io.File;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerApplicationClass_HiltComponents_SingletonC {
  private DaggerApplicationClass_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApiModule apiModule;

    private ApplicationContextModule applicationContextModule;

    private CancelOrderNetworkModule cancelOrderNetworkModule;

    private CashFreeNetworkModule cashFreeNetworkModule;

    private HelpFaqTncNetworkModule helpFaqTncNetworkModule;

    private HomePageNetworkModule homePageNetworkModule;

    private OkHttpClientModule okHttpClientModule;

    private OrderFlowNetworkModule orderFlowNetworkModule;

    private OrderReminderNetworkModule orderReminderNetworkModule;

    private OrderStatusNetworkModule orderStatusNetworkModule;

    private ProductListAndDetailsNetworkModule productListAndDetailsNetworkModule;

    private RoomDbModule roomDbModule;

    private SplashScreenNetworkModule splashScreenNetworkModule;

    private ValueProviderModule valueProviderModule;

    private WalletAndReferralNetworkModule walletAndReferralNetworkModule;

    private Builder() {
    }

    public Builder apiModule(ApiModule apiModule) {
      this.apiModule = Preconditions.checkNotNull(apiModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder cancelOrderNetworkModule(CancelOrderNetworkModule cancelOrderNetworkModule) {
      this.cancelOrderNetworkModule = Preconditions.checkNotNull(cancelOrderNetworkModule);
      return this;
    }

    public Builder cashFreeNetworkModule(CashFreeNetworkModule cashFreeNetworkModule) {
      this.cashFreeNetworkModule = Preconditions.checkNotNull(cashFreeNetworkModule);
      return this;
    }

    public Builder helpFaqTncNetworkModule(HelpFaqTncNetworkModule helpFaqTncNetworkModule) {
      this.helpFaqTncNetworkModule = Preconditions.checkNotNull(helpFaqTncNetworkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public Builder homePageNetworkModule(HomePageNetworkModule homePageNetworkModule) {
      this.homePageNetworkModule = Preconditions.checkNotNull(homePageNetworkModule);
      return this;
    }

    public Builder okHttpClientModule(OkHttpClientModule okHttpClientModule) {
      this.okHttpClientModule = Preconditions.checkNotNull(okHttpClientModule);
      return this;
    }

    public Builder orderFlowNetworkModule(OrderFlowNetworkModule orderFlowNetworkModule) {
      this.orderFlowNetworkModule = Preconditions.checkNotNull(orderFlowNetworkModule);
      return this;
    }

    public Builder orderReminderNetworkModule(
        OrderReminderNetworkModule orderReminderNetworkModule) {
      this.orderReminderNetworkModule = Preconditions.checkNotNull(orderReminderNetworkModule);
      return this;
    }

    public Builder orderStatusNetworkModule(OrderStatusNetworkModule orderStatusNetworkModule) {
      this.orderStatusNetworkModule = Preconditions.checkNotNull(orderStatusNetworkModule);
      return this;
    }

    public Builder productListAndDetailsNetworkModule(
        ProductListAndDetailsNetworkModule productListAndDetailsNetworkModule) {
      this.productListAndDetailsNetworkModule = Preconditions.checkNotNull(productListAndDetailsNetworkModule);
      return this;
    }

    public Builder roomDbModule(RoomDbModule roomDbModule) {
      this.roomDbModule = Preconditions.checkNotNull(roomDbModule);
      return this;
    }

    public Builder splashScreenNetworkModule(SplashScreenNetworkModule splashScreenNetworkModule) {
      this.splashScreenNetworkModule = Preconditions.checkNotNull(splashScreenNetworkModule);
      return this;
    }

    public Builder valueProviderModule(ValueProviderModule valueProviderModule) {
      this.valueProviderModule = Preconditions.checkNotNull(valueProviderModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder videoFAQModule(VideoFAQModule videoFAQModule) {
      Preconditions.checkNotNull(videoFAQModule);
      return this;
    }

    public Builder walletAndReferralNetworkModule(
        WalletAndReferralNetworkModule walletAndReferralNetworkModule) {
      this.walletAndReferralNetworkModule = Preconditions.checkNotNull(walletAndReferralNetworkModule);
      return this;
    }

    public ApplicationClass_HiltComponents.SingletonC build() {
      if (apiModule == null) {
        this.apiModule = new ApiModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (cancelOrderNetworkModule == null) {
        this.cancelOrderNetworkModule = new CancelOrderNetworkModule();
      }
      if (cashFreeNetworkModule == null) {
        this.cashFreeNetworkModule = new CashFreeNetworkModule();
      }
      if (helpFaqTncNetworkModule == null) {
        this.helpFaqTncNetworkModule = new HelpFaqTncNetworkModule();
      }
      if (homePageNetworkModule == null) {
        this.homePageNetworkModule = new HomePageNetworkModule();
      }
      if (okHttpClientModule == null) {
        this.okHttpClientModule = new OkHttpClientModule();
      }
      if (orderFlowNetworkModule == null) {
        this.orderFlowNetworkModule = new OrderFlowNetworkModule();
      }
      if (orderReminderNetworkModule == null) {
        this.orderReminderNetworkModule = new OrderReminderNetworkModule();
      }
      if (orderStatusNetworkModule == null) {
        this.orderStatusNetworkModule = new OrderStatusNetworkModule();
      }
      if (productListAndDetailsNetworkModule == null) {
        this.productListAndDetailsNetworkModule = new ProductListAndDetailsNetworkModule();
      }
      if (roomDbModule == null) {
        this.roomDbModule = new RoomDbModule();
      }
      if (splashScreenNetworkModule == null) {
        this.splashScreenNetworkModule = new SplashScreenNetworkModule();
      }
      if (valueProviderModule == null) {
        this.valueProviderModule = new ValueProviderModule();
      }
      if (walletAndReferralNetworkModule == null) {
        this.walletAndReferralNetworkModule = new WalletAndReferralNetworkModule();
      }
      return new SingletonCImpl(apiModule, applicationContextModule, cancelOrderNetworkModule, cashFreeNetworkModule, helpFaqTncNetworkModule, homePageNetworkModule, okHttpClientModule, orderFlowNetworkModule, orderReminderNetworkModule, orderStatusNetworkModule, productListAndDetailsNetworkModule, roomDbModule, splashScreenNetworkModule, valueProviderModule, walletAndReferralNetworkModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements ApplicationClass_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ApplicationClass_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements ApplicationClass_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public ApplicationClass_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements ApplicationClass_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public ApplicationClass_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements ApplicationClass_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ApplicationClass_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements ApplicationClass_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public ApplicationClass_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements ApplicationClass_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public ApplicationClass_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements ApplicationClass_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ApplicationClass_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends ApplicationClass_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends ApplicationClass_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectAddReminderBottomSheet(AddReminderBottomSheet addReminderBottomSheet) {
      injectAddReminderBottomSheet2(addReminderBottomSheet);
    }

    @Override
    public void injectPastPrescriptionBottomSheet(
        PastPrescriptionBottomSheet pastPrescriptionBottomSheet) {
    }

    @Override
    public void injectPaymentChangeSelectionBottomSheet(
        PaymentChangeSelectionBottomSheet paymentChangeSelectionBottomSheet) {
    }

    @Override
    public void injectPaymentUnsuccessfulBottomsheet(
        PaymentUnsuccessfulBottomsheet paymentUnsuccessfulBottomsheet) {
    }

    @Override
    public void injectSubsBottomSheet(SubsBottomSheet subsBottomSheet) {
      injectSubsBottomSheet2(subsBottomSheet);
    }

    @Override
    public void injectUploadPrescriptionBottomSheet(
        UploadPrescriptionBottomSheet uploadPrescriptionBottomSheet) {
    }

    @Override
    public void injectViewBillDetailsBottomSheet(
        ViewBillDetailsBottomSheet viewBillDetailsBottomSheet) {
    }

    @Override
    public void injectAccountFragment(AccountFragment accountFragment) {
    }

    @Override
    public void injectHomeFragment(HomeFragment homeFragment) {
      injectHomeFragment2(homeFragment);
    }

    @Override
    public void injectLoginMobileNumberFragment(
        LoginMobileNumberFragment loginMobileNumberFragment) {
      injectLoginMobileNumberFragment2(loginMobileNumberFragment);
    }

    @Override
    public void injectLoginOtpFragment(LoginOtpFragment loginOtpFragment) {
      injectLoginOtpFragment2(loginOtpFragment);
    }

    @Override
    public void injectMyOrdersFragment(MyOrdersFragment myOrdersFragment) {
    }

    @Override
    public void injectMyReferralsFragment(MyReferralsFragment myReferralsFragment) {
    }

    @Override
    public void injectProductDetailFragment(ProductDetailFragment productDetailFragment) {
    }

    @Override
    public void injectReferAndEarnFragment(ReferAndEarnFragment referAndEarnFragment) {
    }

    @Override
    public void injectReferEarnFragment(ReferEarnFragment referEarnFragment) {
    }

    @Override
    public void injectReferNowFragment(ReferNowFragment referNowFragment) {
      injectReferNowFragment2(referNowFragment);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @CanIgnoreReturnValue
    private AddReminderBottomSheet injectAddReminderBottomSheet2(AddReminderBottomSheet instance) {
      AddReminderBottomSheet_MembersInjector.injectFirebaseEventUseCase(instance, activityCImpl.firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private SubsBottomSheet injectSubsBottomSheet2(SubsBottomSheet instance) {
      SubsBottomSheet_MembersInjector.injectFirebaseEventUseCase(instance, activityCImpl.firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private HomeFragment injectHomeFragment2(HomeFragment instance) {
      HomeFragment_MembersInjector.injectFirebaseEventUseCase(instance, activityCImpl.firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginMobileNumberFragment injectLoginMobileNumberFragment2(
        LoginMobileNumberFragment instance) {
      LoginMobileNumberFragment_MembersInjector.injectFirebaseEventUseCase(instance, activityCImpl.firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginOtpFragment injectLoginOtpFragment2(LoginOtpFragment instance) {
      LoginOtpFragment_MembersInjector.injectFirebaseEventUseCase(instance, activityCImpl.firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private ReferNowFragment injectReferNowFragment2(ReferNowFragment instance) {
      ReferNowFragment_MembersInjector.injectFirebaseEventUseCase(instance, activityCImpl.firebaseEventUseCase());
      return instance;
    }
  }

  private static final class ViewCImpl extends ApplicationClass_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends ApplicationClass_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    private FirebaseEvent firebaseEvent() {
      return new FirebaseEvent(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    private FirebaseEventUseCase firebaseEventUseCase() {
      return new FirebaseEventUseCase(firebaseEvent());
    }

    @Override
    public void injectAddAddressActivity(AddAddressActivity addAddressActivity) {
    }

    @Override
    public void injectAddPatientActivity(AddPatientActivity addPatientActivity) {
    }

    @Override
    public void injectCancelOrderActivity(CancelOrderActivity cancelOrderActivity) {
    }

    @Override
    public void injectCancelOrderSubActivity(CancelOrderSubActivity cancelOrderSubActivity) {
    }

    @Override
    public void injectCartActivity(CartActivity cartActivity) {
      injectCartActivity2(cartActivity);
    }

    @Override
    public void injectCouponActivity(CouponActivity couponActivity) {
    }

    @Override
    public void injectDeliveryDetailsActivity(DeliveryDetailsActivity deliveryDetailsActivity) {
    }

    @Override
    public void injectEditProfileActivity(EditProfileActivity editProfileActivity) {
    }

    @Override
    public void injectFaqViewAllActivity(FaqViewAllActivity faqViewAllActivity) {
    }

    @Override
    public void injectHealthArticleDetailActivity(
        HealthArticleDetailActivity healthArticleDetailActivity) {
      injectHealthArticleDetailActivity2(healthArticleDetailActivity);
    }

    @Override
    public void injectHealthArticlesActivity(HealthArticlesActivity healthArticlesActivity) {
    }

    @Override
    public void injectHelpActivity(HelpActivity helpActivity) {
    }

    @Override
    public void injectHelpSubCategoryActivity(HelpSubCategoryActivity helpSubCategoryActivity) {
    }

    @Override
    public void injectHelpSubCategoryDetailActivity(
        HelpSubCategoryDetailActivity helpSubCategoryDetailActivity) {
    }

    @Override
    public void injectHomePageActivity(HomePageActivity homePageActivity) {
    }

    @Override
    public void injectLoginActivity(LoginActivity loginActivity) {
      injectLoginActivity2(loginActivity);
    }

    @Override
    public void injectManageAddressActivity(ManageAddressActivity manageAddressActivity) {
    }

    @Override
    public void injectManagePatientActivity(ManagePatientActivity managePatientActivity) {
    }

    @Override
    public void injectMyOrdersActivity(MyOrdersActivity myOrdersActivity) {
    }

    @Override
    public void injectNonActiveOrderStatusActivity(
        NonActiveOrderStatusActivity nonActiveOrderStatusActivity) {
    }

    @Override
    public void injectOrderStatusActivity(OrderStatusActivity orderStatusActivity) {
      injectOrderStatusActivity2(orderStatusActivity);
    }

    @Override
    public void injectOrderSummaryActivity(OrderSummaryActivity orderSummaryActivity) {
    }

    @Override
    public void injectOtcCategoryActivity(OtcCategoryActivity otcCategoryActivity) {
    }

    @Override
    public void injectPatientReminderActivity(PatientReminderActivity patientReminderActivity) {
    }

    @Override
    public void injectPaymentActivity(PaymentActivity paymentActivity) {
    }

    @Override
    public void injectPaymentOptionActivity(PaymentOptionActivity paymentOptionActivity) {
    }

    @Override
    public void injectPoliciesPageActivity(PoliciesPageActivity policiesPageActivity) {
      injectPoliciesPageActivity2(policiesPageActivity);
    }

    @Override
    public void injectPolicyDetailActivity(PolicyDetailActivity policyDetailActivity) {
    }

    @Override
    public void injectPrescriptionActivity(PrescriptionActivity prescriptionActivity) {
    }

    @Override
    public void injectProductDetailActivity(ProductDetailActivity productDetailActivity) {
    }

    @Override
    public void injectProductListViewAllActivity(
        ProductListViewAllActivity productListViewAllActivity) {
    }

    @Override
    public void injectReferAndEarnActivity(ReferAndEarnActivity referAndEarnActivity) {
      injectReferAndEarnActivity2(referAndEarnActivity);
    }

    @Override
    public void injectSearchResultActivity(SearchResultActivity searchResultActivity) {
    }

    @Override
    public void injectSearchSuggestionActivity(SearchSuggestionActivity searchSuggestionActivity) {
    }

    @Override
    public void injectSplashScreen(SplashScreen splashScreen) {
    }

    @Override
    public void injectSubstitutesActivity(SubstitutesActivity substitutesActivity) {
    }

    @Override
    public void injectVideoFaqActivity(VideoFaqActivity videoFaqActivity) {
    }

    @Override
    public void injectWalletActivity(WalletActivity walletActivity) {
    }

    @Override
    public void injectWalletTransactionsActivity(
        WalletTransactionsActivity walletTransactionsActivity) {
      injectWalletTransactionsActivity2(walletTransactionsActivity);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(AccountTabViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddAddressViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddPatientDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddPatientViewModel_HiltModules_KeyModule_ProvideFactory.provide(), BaseViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CancelOrderViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CartViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CouponViewModel_HiltModules_KeyModule_ProvideFactory.provide(), DeliveryDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), EditProfileDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), HealthArticlesViewModel_HiltModules_KeyModule_ProvideFactory.provide(), HelpViewModel_HiltModules_KeyModule_ProvideFactory.provide(), HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ManageAddressViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ManagePatientViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MyOrderViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderStatusViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderSummaryViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrdersTabViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OtcCategoryViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PaymentOptionsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PaymentStatusViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PolicyTncViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PrescriptionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductListViewAllViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ReferNEarnViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ReminderViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SearchViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SplashScreenViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SubstitutePageViewModel_HiltModules_KeyModule_ProvideFactory.provide(), VideoFaqViewModel_HiltModules_KeyModule_ProvideFactory.provide(), VideoViewModel_HiltModules_KeyModule_ProvideFactory.provide(), WalletViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @CanIgnoreReturnValue
    private CartActivity injectCartActivity2(CartActivity instance) {
      CartActivity_MembersInjector.injectFirebaseEvent(instance, firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private HealthArticleDetailActivity injectHealthArticleDetailActivity2(
        HealthArticleDetailActivity instance) {
      HealthArticleDetailActivity_MembersInjector.injectFirebaseEventUseCase(instance, firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginActivity injectLoginActivity2(LoginActivity instance) {
      LoginActivity_MembersInjector.injectFirebaseEventUseCase(instance, firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderStatusActivity injectOrderStatusActivity2(OrderStatusActivity instance) {
      OrderStatusActivity_MembersInjector.injectFirebaseEventUseCase(instance, firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private PoliciesPageActivity injectPoliciesPageActivity2(PoliciesPageActivity instance) {
      PoliciesPageActivity_MembersInjector.injectFirebaseEventUseCase(instance, firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private ReferAndEarnActivity injectReferAndEarnActivity2(ReferAndEarnActivity instance) {
      ReferAndEarnActivity_MembersInjector.injectFirebaseEventUseCase(instance, firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private WalletTransactionsActivity injectWalletTransactionsActivity2(
        WalletTransactionsActivity instance) {
      WalletTransactionsActivity_MembersInjector.injectFirebaseEventUseCase(instance, firebaseEventUseCase());
      return instance;
    }
  }

  private static final class ViewModelCImpl extends ApplicationClass_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AccountTabViewModel> accountTabViewModelProvider;

    private Provider<AddAddressViewModel> addAddressViewModelProvider;

    private Provider<AddPatientDetailsViewModel> addPatientDetailsViewModelProvider;

    private Provider<AddPatientViewModel> addPatientViewModelProvider;

    private Provider<BaseViewModel> baseViewModelProvider;

    private Provider<CancelOrderViewModel> cancelOrderViewModelProvider;

    private Provider<CartViewModel> cartViewModelProvider;

    private Provider<CouponViewModel> couponViewModelProvider;

    private Provider<DeliveryDetailsViewModel> deliveryDetailsViewModelProvider;

    private Provider<EditProfileDetailViewModel> editProfileDetailViewModelProvider;

    private Provider<HealthArticlesViewModel> healthArticlesViewModelProvider;

    private Provider<HelpViewModel> helpViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<ManageAddressViewModel> manageAddressViewModelProvider;

    private Provider<ManagePatientViewModel> managePatientViewModelProvider;

    private Provider<MyOrderViewModel> myOrderViewModelProvider;

    private Provider<OrderStatusViewModel> orderStatusViewModelProvider;

    private Provider<OrderSummaryViewModel> orderSummaryViewModelProvider;

    private Provider<OrdersTabViewModel> ordersTabViewModelProvider;

    private Provider<OtcCategoryViewModel> otcCategoryViewModelProvider;

    private Provider<PaymentOptionsViewModel> paymentOptionsViewModelProvider;

    private Provider<PaymentStatusViewModel> paymentStatusViewModelProvider;

    private Provider<PolicyTncViewModel> policyTncViewModelProvider;

    private Provider<PrescriptionViewModel> prescriptionViewModelProvider;

    private Provider<ProductDetailViewModel> productDetailViewModelProvider;

    private Provider<ProductListViewAllViewModel> productListViewAllViewModelProvider;

    private Provider<ReferNEarnViewModel> referNEarnViewModelProvider;

    private Provider<ReminderViewModel> reminderViewModelProvider;

    private Provider<SearchViewModel> searchViewModelProvider;

    private Provider<SplashScreenViewModel> splashScreenViewModelProvider;

    private Provider<SubstitutePageViewModel> substitutePageViewModelProvider;

    private Provider<VideoFaqViewModel> videoFaqViewModelProvider;

    private Provider<VideoViewModel> videoViewModelProvider;

    private Provider<WalletViewModel> walletViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    private LocalDbUseCase localDbUseCase() {
      return new LocalDbUseCase(singletonCImpl.localDbRepositoryImpl());
    }

    private HomePageUseCase homePageUseCase() {
      return new HomePageUseCase(singletonCImpl.homePageRepositoryImpl(), singletonCImpl.orderFlowRepositoryImpl(), singletonCImpl.productListAndDetailsRepositoryImpl(), localDbUseCase(), singletonCImpl.helpFaqAndTnCRepositoryImpl(), singletonCImpl.sdkEventUseCase(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    private OrderFlowUseCase orderFlowUseCase() {
      return new OrderFlowUseCase(singletonCImpl.orderFlowRepositoryImpl(), singletonCImpl.userDataRepositoryImpl(), localDbUseCase(), singletonCImpl.sdkEventUseCase(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    private CouponUseCase couponUseCase() {
      return new CouponUseCase(singletonCImpl.orderFlowRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private UserDataUseCase userDataUseCase() {
      return new UserDataUseCase(localDbUseCase(), singletonCImpl.userDataRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private CancelOrderUseCase cancelOrderUseCase() {
      return new CancelOrderUseCase(singletonCImpl.cancelOrderRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private TmWalletUseCase tmWalletUseCase() {
      return new TmWalletUseCase(singletonCImpl.tmWalletRepositoryImpl(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    private LoginUseCase loginUseCase() {
      return new LoginUseCase(singletonCImpl.loginRepositoryImpl(), singletonCImpl.sdkEventUseCase(), localDbUseCase(), userDataUseCase(), tmWalletUseCase());
    }

    private ManagePatientUseCase managePatientUseCase() {
      return new ManagePatientUseCase(localDbUseCase(), singletonCImpl.userDataRepositoryImpl());
    }

    private CartUseCase cartUseCase() {
      return new CartUseCase(singletonCImpl.orderFlowRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private HelpFaqTncUseCase helpFaqTncUseCase() {
      return new HelpFaqTncUseCase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.helpFaqAndTnCRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private ReorderUseCase reorderUseCase() {
      return new ReorderUseCase(singletonCImpl.orderFlowRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private ProductListAndDetailsUseCase productListAndDetailsUseCase() {
      return new ProductListAndDetailsUseCase(singletonCImpl.productListAndDetailsRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private EditPatientUseCase editPatientUseCase() {
      return new EditPatientUseCase(singletonCImpl.userDataRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private AddPatientUseCase addPatientUseCase() {
      return new AddPatientUseCase(singletonCImpl.userDataRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private OrderStatusUseCase orderStatusUseCase() {
      return new OrderStatusUseCase(singletonCImpl.orderStatusRepositoryImpl(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.sdkEventUseCase());
    }

    private ReminderUseCase reminderUseCase() {
      return new ReminderUseCase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.orderReminderRepositoryImpl(), singletonCImpl.userDataRepositoryImpl(), singletonCImpl.sdkEventUseCase());
    }

    private PaymentOptionsUseCase paymentOptionsUseCase() {
      return new PaymentOptionsUseCase(singletonCImpl.orderFlowRepositoryImpl(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.sdkEventUseCase());
    }

    private CashFreeUseCase cashFreeUseCase() {
      return new CashFreeUseCase(singletonCImpl.cashFreeRepositoryImpl());
    }

    private ProductDetailUseCase productDetailUseCase() {
      return new ProductDetailUseCase(singletonCImpl.productListAndDetailsRepositoryImpl(), singletonCImpl.orderFlowRepositoryImpl());
    }

    private SearchUseCase searchUseCase() {
      return new SearchUseCase(singletonCImpl.searchRepositoryImpl(), localDbUseCase(), singletonCImpl.sdkEventUseCase());
    }

    private SplashScreenUseCase splashScreenUseCase() {
      return new SplashScreenUseCase(singletonCImpl.splashScreenRepositoryImpl(), localDbUseCase(), singletonCImpl.sdkEventUseCase());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.accountTabViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.addAddressViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.addPatientDetailsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.addPatientViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.baseViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.cancelOrderViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.cartViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.couponViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.deliveryDetailsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
      this.editProfileDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 9);
      this.healthArticlesViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 10);
      this.helpViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 11);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 12);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 13);
      this.manageAddressViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 14);
      this.managePatientViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 15);
      this.myOrderViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 16);
      this.orderStatusViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 17);
      this.orderSummaryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 18);
      this.ordersTabViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 19);
      this.otcCategoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 20);
      this.paymentOptionsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 21);
      this.paymentStatusViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 22);
      this.policyTncViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 23);
      this.prescriptionViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 24);
      this.productDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 25);
      this.productListViewAllViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 26);
      this.referNEarnViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 27);
      this.reminderViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 28);
      this.searchViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 29);
      this.splashScreenViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 30);
      this.substitutePageViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 31);
      this.videoFaqViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 32);
      this.videoViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 33);
      this.walletViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 34);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>builderWithExpectedSize(35).put("com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel", ((Provider) accountTabViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.AddAddressViewModel", ((Provider) addAddressViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.AddPatientDetailsViewModel", ((Provider) addPatientDetailsViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.AddPatientViewModel", ((Provider) addPatientViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel", ((Provider) baseViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel", ((Provider) cancelOrderViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.CartViewModel", ((Provider) cartViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel", ((Provider) couponViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel", ((Provider) deliveryDetailsViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel", ((Provider) editProfileDetailViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel", ((Provider) healthArticlesViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel", ((Provider) helpViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel", ((Provider) homeViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel", ((Provider) loginViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel", ((Provider) manageAddressViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel", ((Provider) managePatientViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel", ((Provider) myOrderViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel", ((Provider) orderStatusViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel", ((Provider) orderSummaryViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel", ((Provider) ordersTabViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.OtcCategoryViewModel", ((Provider) otcCategoryViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel", ((Provider) paymentOptionsViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel", ((Provider) paymentStatusViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel", ((Provider) policyTncViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel", ((Provider) prescriptionViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel", ((Provider) productDetailViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel", ((Provider) productListViewAllViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel", ((Provider) referNEarnViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel", ((Provider) reminderViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel", ((Provider) searchViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel", ((Provider) splashScreenViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.SubstitutePageViewModel", ((Provider) substitutePageViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.VideoFaqViewModel", ((Provider) videoFaqViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel", ((Provider) videoViewModelProvider)).put("com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel", ((Provider) walletViewModelProvider)).build();
    }

    @CanIgnoreReturnValue
    private AccountTabViewModel injectAccountTabViewModel(AccountTabViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddAddressViewModel injectAddAddressViewModel(AddAddressViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddPatientDetailsViewModel injectAddPatientDetailsViewModel(
        AddPatientDetailsViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private BaseViewModel injectBaseViewModel(BaseViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private CancelOrderViewModel injectCancelOrderViewModel(CancelOrderViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private CartViewModel injectCartViewModel(CartViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      PrescriptionViewModel_MembersInjector.injectFirebaseEvent(instance, singletonCImpl.firebaseEventUseCase());
      PrescriptionViewModel_MembersInjector.injectCartUseCase(instance, cartUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private CouponViewModel injectCouponViewModel(CouponViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private DeliveryDetailsViewModel injectDeliveryDetailsViewModel(
        DeliveryDetailsViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private EditProfileDetailViewModel injectEditProfileDetailViewModel(
        EditProfileDetailViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private HomeViewModel injectHomeViewModel(HomeViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private ManageAddressViewModel injectManageAddressViewModel(ManageAddressViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private ManagePatientViewModel injectManagePatientViewModel(ManagePatientViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private MyOrderViewModel injectMyOrderViewModel(MyOrderViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderStatusViewModel injectOrderStatusViewModel(OrderStatusViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderSummaryViewModel injectOrderSummaryViewModel(OrderSummaryViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrdersTabViewModel injectOrdersTabViewModel(OrdersTabViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private OtcCategoryViewModel injectOtcCategoryViewModel(OtcCategoryViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private PaymentOptionsViewModel injectPaymentOptionsViewModel(
        PaymentOptionsViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private PolicyTncViewModel injectPolicyTncViewModel(PolicyTncViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private PrescriptionViewModel injectPrescriptionViewModel(PrescriptionViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      PrescriptionViewModel_MembersInjector.injectFirebaseEvent(instance, singletonCImpl.firebaseEventUseCase());
      PrescriptionViewModel_MembersInjector.injectCartUseCase(instance, cartUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductDetailViewModel injectProductDetailViewModel(ProductDetailViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      ProductDetailViewModel_MembersInjector.injectFirebaseEventUseCase(instance, singletonCImpl.firebaseEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductListViewAllViewModel injectProductListViewAllViewModel(
        ProductListViewAllViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private ReferNEarnViewModel injectReferNEarnViewModel(ReferNEarnViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private ReminderViewModel injectReminderViewModel(ReminderViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private SearchViewModel injectSearchViewModel(SearchViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private SplashScreenViewModel injectSplashScreenViewModel(SplashScreenViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private SubstitutePageViewModel injectSubstitutePageViewModel(
        SubstitutePageViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private VideoFaqViewModel injectVideoFaqViewModel(VideoFaqViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private VideoViewModel injectVideoViewModel(VideoViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    @CanIgnoreReturnValue
    private WalletViewModel injectWalletViewModel(WalletViewModel instance) {
      BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCase());
      BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCase());
      BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCase());
      BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, singletonCImpl.sdkEventUseCase());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel 
          return (T) viewModelCImpl.injectAccountTabViewModel(AccountTabViewModel_Factory.newInstance(viewModelCImpl.homePageUseCase()));

          case 1: // com.intellihealth.truemeds.presentation.viewmodel.AddAddressViewModel 
          return (T) viewModelCImpl.injectAddAddressViewModel(AddAddressViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule)));

          case 2: // com.intellihealth.truemeds.presentation.viewmodel.AddPatientDetailsViewModel 
          return (T) viewModelCImpl.injectAddPatientDetailsViewModel(AddPatientDetailsViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), viewModelCImpl.userDataUseCase()));

          case 3: // com.intellihealth.truemeds.presentation.viewmodel.AddPatientViewModel 
          return (T) new AddPatientViewModel(viewModelCImpl.userDataUseCase());

          case 4: // com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel 
          return (T) viewModelCImpl.injectBaseViewModel(BaseViewModel_Factory.newInstance());

          case 5: // com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel 
          return (T) viewModelCImpl.injectCancelOrderViewModel(CancelOrderViewModel_Factory.newInstance(viewModelCImpl.cancelOrderUseCase(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule)));

          case 6: // com.intellihealth.truemeds.presentation.viewmodel.CartViewModel 
          return (T) viewModelCImpl.injectCartViewModel(CartViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), viewModelCImpl.loginUseCase(), viewModelCImpl.managePatientUseCase(), viewModelCImpl.userDataUseCase()));

          case 7: // com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel 
          return (T) viewModelCImpl.injectCouponViewModel(CouponViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule)));

          case 8: // com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel 
          return (T) viewModelCImpl.injectDeliveryDetailsViewModel(DeliveryDetailsViewModel_Factory.newInstance(viewModelCImpl.userDataUseCase(), viewModelCImpl.homePageUseCase()));

          case 9: // com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel 
          return (T) viewModelCImpl.injectEditProfileDetailViewModel(EditProfileDetailViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), viewModelCImpl.userDataUseCase(), singletonCImpl.mixPanelEventUseCase(), singletonCImpl.cleverTapEventUseCase()));

          case 10: // com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel 
          return (T) new HealthArticlesViewModel(viewModelCImpl.homePageUseCase(), singletonCImpl.sdkEventUseCase());

          case 11: // com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel 
          return (T) new HelpViewModel(viewModelCImpl.helpFaqTncUseCase());

          case 12: // com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel 
          return (T) viewModelCImpl.injectHomeViewModel(HomeViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), viewModelCImpl.homePageUseCase(), viewModelCImpl.loginUseCase(), viewModelCImpl.userDataUseCase(), viewModelCImpl.reorderUseCase(), viewModelCImpl.tmWalletUseCase(), viewModelCImpl.productListAndDetailsUseCase()));

          case 13: // com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel 
          return (T) viewModelCImpl.injectLoginViewModel(LoginViewModel_Factory.newInstance(viewModelCImpl.loginUseCase()));

          case 14: // com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel 
          return (T) viewModelCImpl.injectManageAddressViewModel(ManageAddressViewModel_Factory.newInstance(viewModelCImpl.userDataUseCase(), viewModelCImpl.homePageUseCase()));

          case 15: // com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel 
          return (T) viewModelCImpl.injectManagePatientViewModel(ManagePatientViewModel_Factory.newInstance(viewModelCImpl.managePatientUseCase(), viewModelCImpl.editPatientUseCase(), viewModelCImpl.addPatientUseCase()));

          case 16: // com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel 
          return (T) viewModelCImpl.injectMyOrderViewModel(MyOrderViewModel_Factory.newInstance(viewModelCImpl.userDataUseCase(), viewModelCImpl.loginUseCase()));

          case 17: // com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel 
          return (T) viewModelCImpl.injectOrderStatusViewModel(OrderStatusViewModel_Factory.newInstance(viewModelCImpl.orderStatusUseCase(), viewModelCImpl.reminderUseCase(), viewModelCImpl.reorderUseCase(), viewModelCImpl.paymentOptionsUseCase(), viewModelCImpl.loginUseCase(), viewModelCImpl.homePageUseCase(), viewModelCImpl.userDataUseCase(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule)));

          case 18: // com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel 
          return (T) viewModelCImpl.injectOrderSummaryViewModel(OrderSummaryViewModel_Factory.newInstance());

          case 19: // com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel 
          return (T) viewModelCImpl.injectOrdersTabViewModel(OrdersTabViewModel_Factory.newInstance(viewModelCImpl.homePageUseCase(), viewModelCImpl.managePatientUseCase(), viewModelCImpl.reorderUseCase()));

          case 20: // com.intellihealth.truemeds.presentation.viewmodel.OtcCategoryViewModel 
          return (T) viewModelCImpl.injectOtcCategoryViewModel(OtcCategoryViewModel_Factory.newInstance(new PersonalCareUseCase()));

          case 21: // com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel 
          return (T) viewModelCImpl.injectPaymentOptionsViewModel(PaymentOptionsViewModel_Factory.newInstance(viewModelCImpl.paymentOptionsUseCase(), viewModelCImpl.helpFaqTncUseCase(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonCImpl.applicationContextModule), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule)));

          case 22: // com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel 
          return (T) new PaymentStatusViewModel(viewModelCImpl.cashFreeUseCase(), viewModelCImpl.orderFlowUseCase(), singletonCImpl.sdkEventUseCase(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 23: // com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel 
          return (T) viewModelCImpl.injectPolicyTncViewModel(PolicyTncViewModel_Factory.newInstance(viewModelCImpl.helpFaqTncUseCase()));

          case 24: // com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel 
          return (T) viewModelCImpl.injectPrescriptionViewModel(PrescriptionViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), viewModelCImpl.loginUseCase(), viewModelCImpl.userDataUseCase()));

          case 25: // com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel 
          return (T) viewModelCImpl.injectProductDetailViewModel(ProductDetailViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), viewModelCImpl.productDetailUseCase(), viewModelCImpl.loginUseCase()));

          case 26: // com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel 
          return (T) viewModelCImpl.injectProductListViewAllViewModel(ProductListViewAllViewModel_Factory.newInstance(viewModelCImpl.loginUseCase(), viewModelCImpl.productListAndDetailsUseCase(), viewModelCImpl.homePageUseCase()));

          case 27: // com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel 
          return (T) viewModelCImpl.injectReferNEarnViewModel(ReferNEarnViewModel_Factory.newInstance(viewModelCImpl.tmWalletUseCase(), viewModelCImpl.helpFaqTncUseCase(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule)));

          case 28: // com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel 
          return (T) viewModelCImpl.injectReminderViewModel(ReminderViewModel_Factory.newInstance(viewModelCImpl.reminderUseCase(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule)));

          case 29: // com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel 
          return (T) viewModelCImpl.injectSearchViewModel(SearchViewModel_Factory.newInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), viewModelCImpl.searchUseCase(), viewModelCImpl.loginUseCase(), viewModelCImpl.userDataUseCase(), viewModelCImpl.tmWalletUseCase()));

          case 30: // com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel 
          return (T) viewModelCImpl.injectSplashScreenViewModel(SplashScreenViewModel_Factory.newInstance(viewModelCImpl.splashScreenUseCase()));

          case 31: // com.intellihealth.truemeds.presentation.viewmodel.SubstitutePageViewModel 
          return (T) viewModelCImpl.injectSubstitutePageViewModel(SubstitutePageViewModel_Factory.newInstance(viewModelCImpl.loginUseCase()));

          case 32: // com.intellihealth.truemeds.presentation.viewmodel.VideoFaqViewModel 
          return (T) viewModelCImpl.injectVideoFaqViewModel(VideoFaqViewModel_Factory.newInstance());

          case 33: // com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel 
          return (T) viewModelCImpl.injectVideoViewModel(VideoViewModel_Factory.newInstance(viewModelCImpl.homePageUseCase()));

          case 34: // com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel 
          return (T) viewModelCImpl.injectWalletViewModel(WalletViewModel_Factory.newInstance(viewModelCImpl.tmWalletUseCase(), viewModelCImpl.helpFaqTncUseCase()));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends ApplicationClass_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends ApplicationClass_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends ApplicationClass_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final HomePageNetworkModule homePageNetworkModule;

    private final ApiModule apiModule;

    private final OkHttpClientModule okHttpClientModule;

    private final ValueProviderModule valueProviderModule;

    private final OrderFlowNetworkModule orderFlowNetworkModule;

    private final ProductListAndDetailsNetworkModule productListAndDetailsNetworkModule;

    private final RoomDbModule roomDbModule;

    private final HelpFaqTncNetworkModule helpFaqTncNetworkModule;

    private final CancelOrderNetworkModule cancelOrderNetworkModule;

    private final WalletAndReferralNetworkModule walletAndReferralNetworkModule;

    private final OrderStatusNetworkModule orderStatusNetworkModule;

    private final OrderReminderNetworkModule orderReminderNetworkModule;

    private final CashFreeNetworkModule cashFreeNetworkModule;

    private final SplashScreenNetworkModule splashScreenNetworkModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<File> fileProvider;

    private Provider<Cache> cacheProvider;

    private Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

    private Provider<OkHttpClient> providesOkHttpClientProvider;

    private Provider<Retrofit> providesRetrofitProvider;

    private Provider<HomePageApi> providesHomePageApiProvider;

    private Provider<String> getContentTypeProvider;

    private Provider<HomePageRemoteDataSourceImpl> homePageRemoteDataSourceImplProvider;

    private Provider<HomePageRemoteDataSource> bindHomePageRemoteDataProvider;

    private Provider<OrderFlowApi> providesOrderFlowApiProvider;

    private Provider<OrderFlowRemoteDataSourceImpl> orderFlowRemoteDataSourceImplProvider;

    private Provider<OrderFlowRemoteDataSource> bindOrderFlowRemoteDataProvider;

    private Provider<ProductListAndDetailsApi> providesProductListAndDetailsApiProvider;

    private Provider<ProductListAndDetailsRemoteDataSourceImpl> productListAndDetailsRemoteDataSourceImplProvider;

    private Provider<ProductListAndDetailsRemoteDataSource> bindProductListAndDetailsRemoteDataProvider;

    private Provider<HelpFaqAndTnCRemoteDataSourceImpl> helpFaqAndTnCRemoteDataSourceImplProvider;

    private Provider<HelpFaqAndTnCRemoteDataSource> bindHelpFaqTncRemoteDataProvider;

    private Provider<UserDataApi> providesUserDataApiProvider;

    private Provider<CancelOrderRemoteDataSourceImpl> cancelOrderRemoteDataSourceImplProvider;

    private Provider<CancelOrderRemoteDataSource> bindCancelOrderRemoteDataProvider;

    private Provider<LoginApi> providesLoginApiProvider;

    private Provider<WalletAndReferralApi> providesWalletAndReferralApiProvider;

    private Provider<OrderStatusApi> providesOrderStatusApiProvider;

    private Provider<OrderStatusRemoteDataSourceImpl> orderStatusRemoteDataSourceImplProvider;

    private Provider<OrderStatusRemoteDataSource> bindOrderStatusRemoteDataProvider;

    private Provider<OrderReminderApi> providesOrderReminderApiProvider;

    private Provider<OrderReminderRemoteDataSourceImpl> orderReminderRemoteDataSourceImplProvider;

    private Provider<OrderReminderRemoteDataSource> bindOrderReminderRemoteDataProvider;

    private Provider<CashFreeRemoteDataSourceImpl> cashFreeRemoteDataSourceImplProvider;

    private Provider<CashFreeRemoteDataSource> bindCashFreeRemoteDataProvider;

    private SingletonCImpl(ApiModule apiModuleParam,
        ApplicationContextModule applicationContextModuleParam,
        CancelOrderNetworkModule cancelOrderNetworkModuleParam,
        CashFreeNetworkModule cashFreeNetworkModuleParam,
        HelpFaqTncNetworkModule helpFaqTncNetworkModuleParam,
        HomePageNetworkModule homePageNetworkModuleParam,
        OkHttpClientModule okHttpClientModuleParam,
        OrderFlowNetworkModule orderFlowNetworkModuleParam,
        OrderReminderNetworkModule orderReminderNetworkModuleParam,
        OrderStatusNetworkModule orderStatusNetworkModuleParam,
        ProductListAndDetailsNetworkModule productListAndDetailsNetworkModuleParam,
        RoomDbModule roomDbModuleParam, SplashScreenNetworkModule splashScreenNetworkModuleParam,
        ValueProviderModule valueProviderModuleParam,
        WalletAndReferralNetworkModule walletAndReferralNetworkModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      this.homePageNetworkModule = homePageNetworkModuleParam;
      this.apiModule = apiModuleParam;
      this.okHttpClientModule = okHttpClientModuleParam;
      this.valueProviderModule = valueProviderModuleParam;
      this.orderFlowNetworkModule = orderFlowNetworkModuleParam;
      this.productListAndDetailsNetworkModule = productListAndDetailsNetworkModuleParam;
      this.roomDbModule = roomDbModuleParam;
      this.helpFaqTncNetworkModule = helpFaqTncNetworkModuleParam;
      this.cancelOrderNetworkModule = cancelOrderNetworkModuleParam;
      this.walletAndReferralNetworkModule = walletAndReferralNetworkModuleParam;
      this.orderStatusNetworkModule = orderStatusNetworkModuleParam;
      this.orderReminderNetworkModule = orderReminderNetworkModuleParam;
      this.cashFreeNetworkModule = cashFreeNetworkModuleParam;
      this.splashScreenNetworkModule = splashScreenNetworkModuleParam;
      initialize(apiModuleParam, applicationContextModuleParam, cancelOrderNetworkModuleParam, cashFreeNetworkModuleParam, helpFaqTncNetworkModuleParam, homePageNetworkModuleParam, okHttpClientModuleParam, orderFlowNetworkModuleParam, orderReminderNetworkModuleParam, orderStatusNetworkModuleParam, productListAndDetailsNetworkModuleParam, roomDbModuleParam, splashScreenNetworkModuleParam, valueProviderModuleParam, walletAndReferralNetworkModuleParam);

    }

    private MixPanelEvent mixPanelEvent() {
      return new MixPanelEvent(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private MixPanelEventUseCase mixPanelEventUseCase() {
      return new MixPanelEventUseCase(mixPanelEvent());
    }

    private AppsFlyerEvent appsFlyerEvent() {
      return new AppsFlyerEvent(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private AppsFlyerEventUseCase appsFlyerEventUseCase() {
      return new AppsFlyerEventUseCase(appsFlyerEvent());
    }

    private CleverTapEvent cleverTapEvent() {
      return new CleverTapEvent(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private CleverTapEventUseCase cleverTapEventUseCase() {
      return new CleverTapEventUseCase(cleverTapEvent());
    }

    private FirebaseEvent firebaseEvent() {
      return new FirebaseEvent(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private FirebaseEventUseCase firebaseEventUseCase() {
      return new FirebaseEventUseCase(firebaseEvent());
    }

    private FacebookEvent facebookEvent() {
      return new FacebookEvent(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private FacebookEventUseCase facebookEventUseCase() {
      return new FacebookEventUseCase(facebookEvent());
    }

    private SdkEventUseCase sdkEventUseCase() {
      return new SdkEventUseCase(mixPanelEventUseCase(), appsFlyerEventUseCase(), cleverTapEventUseCase(), firebaseEventUseCase(), facebookEventUseCase());
    }

    private ApiCallInitClass apiCallInitClass() {
      return new ApiCallInitClass(sdkEventUseCase());
    }

    private HomePageRepositoryImpl homePageRepositoryImpl() {
      return new HomePageRepositoryImpl(bindHomePageRemoteDataProvider.get(), apiCallInitClass());
    }

    private ElasticMedicineRemoteDataSourceImpl elasticMedicineRemoteDataSourceImpl() {
      return new ElasticMedicineRemoteDataSourceImpl(providesProductListAndDetailsApiProvider.get(), getContentTypeProvider.get());
    }

    private OrderFlowRepositoryImpl orderFlowRepositoryImpl() {
      return new OrderFlowRepositoryImpl(bindOrderFlowRemoteDataProvider.get(), elasticMedicineRemoteDataSourceImpl(), apiCallInitClass());
    }

    private ProductListAndDetailsRepositoryImpl productListAndDetailsRepositoryImpl() {
      return new ProductListAndDetailsRepositoryImpl(bindProductListAndDetailsRemoteDataProvider.get(), apiCallInitClass());
    }

    private TruemedsDao truemedsDao() {
      return RoomDbModule_ProvideAppDaoFactory.provideAppDao(roomDbModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private LocalDbRepositoryImpl localDbRepositoryImpl() {
      return new LocalDbRepositoryImpl(truemedsDao());
    }

    private HelpFaqTncApi helpFaqTncApi() {
      return HelpFaqTncNetworkModule_ProvidesHelpFaqTncApiFactory.providesHelpFaqTncApi(helpFaqTncNetworkModule, providesRetrofitProvider.get());
    }

    private HelpFaqAndTnCRepositoryImpl helpFaqAndTnCRepositoryImpl() {
      return new HelpFaqAndTnCRepositoryImpl(bindHelpFaqTncRemoteDataProvider.get(), apiCallInitClass());
    }

    private UserRemoteDataSourceImpl userRemoteDataSourceImpl() {
      return new UserRemoteDataSourceImpl(providesUserDataApiProvider.get(), getContentTypeProvider.get());
    }

    private UserDataRepositoryImpl userDataRepositoryImpl() {
      return new UserDataRepositoryImpl(userRemoteDataSourceImpl(), apiCallInitClass());
    }

    private CancelOrderApi cancelOrderApi() {
      return CancelOrderNetworkModule_ProvidesCancelOrderApiFactory.providesCancelOrderApi(cancelOrderNetworkModule, providesRetrofitProvider.get());
    }

    private CancelOrderRepositoryImpl cancelOrderRepositoryImpl() {
      return new CancelOrderRepositoryImpl(bindCancelOrderRemoteDataProvider.get(), apiCallInitClass());
    }

    private LoginRemoteDataImpl loginRemoteDataImpl() {
      return new LoginRemoteDataImpl(providesLoginApiProvider.get(), getContentTypeProvider.get());
    }

    private LoginRepositoryImpl loginRepositoryImpl() {
      return new LoginRepositoryImpl(loginRemoteDataImpl(), apiCallInitClass());
    }

    private TmWalletRemoteDataSourceImpl tmWalletRemoteDataSourceImpl() {
      return new TmWalletRemoteDataSourceImpl(providesWalletAndReferralApiProvider.get(), getContentTypeProvider.get());
    }

    private TmWalletRepositoryImpl tmWalletRepositoryImpl() {
      return new TmWalletRepositoryImpl(tmWalletRemoteDataSourceImpl(), apiCallInitClass());
    }

    private OrderStatusRepositoryImpl orderStatusRepositoryImpl() {
      return new OrderStatusRepositoryImpl(bindOrderStatusRemoteDataProvider.get(), apiCallInitClass());
    }

    private OrderReminderRepositoryImpl orderReminderRepositoryImpl() {
      return new OrderReminderRepositoryImpl(bindOrderReminderRemoteDataProvider.get(), apiCallInitClass());
    }

    private CashFreeApi cashFreeApi() {
      return CashFreeNetworkModule_ProvidesCashFreeApiFactory.providesCashFreeApi(cashFreeNetworkModule, providesRetrofitProvider.get());
    }

    private CashFreeRepositoryImpl cashFreeRepositoryImpl() {
      return new CashFreeRepositoryImpl(bindCashFreeRemoteDataProvider.get(), apiCallInitClass());
    }

    private SearchRepositoryImpl searchRepositoryImpl() {
      return new SearchRepositoryImpl(truemedsDao(), elasticMedicineRemoteDataSourceImpl(), apiCallInitClass());
    }

    private SplashScreenApi splashScreenApi() {
      return SplashScreenNetworkModule_ProvidesSplashScreenApiFactory.providesSplashScreenApi(splashScreenNetworkModule, providesRetrofitProvider.get());
    }

    private SplashScreenRemoteDataImpl splashScreenRemoteDataImpl() {
      return new SplashScreenRemoteDataImpl(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule), splashScreenApi(), getContentTypeProvider.get());
    }

    private SplashScreenRepositoryImpl splashScreenRepositoryImpl() {
      return new SplashScreenRepositoryImpl(splashScreenRemoteDataImpl(), apiCallInitClass());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApiModule apiModuleParam,
        final ApplicationContextModule applicationContextModuleParam,
        final CancelOrderNetworkModule cancelOrderNetworkModuleParam,
        final CashFreeNetworkModule cashFreeNetworkModuleParam,
        final HelpFaqTncNetworkModule helpFaqTncNetworkModuleParam,
        final HomePageNetworkModule homePageNetworkModuleParam,
        final OkHttpClientModule okHttpClientModuleParam,
        final OrderFlowNetworkModule orderFlowNetworkModuleParam,
        final OrderReminderNetworkModule orderReminderNetworkModuleParam,
        final OrderStatusNetworkModule orderStatusNetworkModuleParam,
        final ProductListAndDetailsNetworkModule productListAndDetailsNetworkModuleParam,
        final RoomDbModule roomDbModuleParam,
        final SplashScreenNetworkModule splashScreenNetworkModuleParam,
        final ValueProviderModule valueProviderModuleParam,
        final WalletAndReferralNetworkModule walletAndReferralNetworkModuleParam) {
      this.fileProvider = DoubleCheck.provider(new SwitchingProvider<File>(singletonCImpl, 5));
      this.cacheProvider = DoubleCheck.provider(new SwitchingProvider<Cache>(singletonCImpl, 4));
      this.httpLoggingInterceptorProvider = DoubleCheck.provider(new SwitchingProvider<HttpLoggingInterceptor>(singletonCImpl, 6));
      this.providesOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 3));
      this.providesRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 2));
      this.providesHomePageApiProvider = DoubleCheck.provider(new SwitchingProvider<HomePageApi>(singletonCImpl, 1));
      this.getContentTypeProvider = DoubleCheck.provider(new SwitchingProvider<String>(singletonCImpl, 7));
      this.homePageRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 0);
      this.bindHomePageRemoteDataProvider = DoubleCheck.provider((Provider) homePageRemoteDataSourceImplProvider);
      this.providesOrderFlowApiProvider = DoubleCheck.provider(new SwitchingProvider<OrderFlowApi>(singletonCImpl, 9));
      this.orderFlowRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 8);
      this.bindOrderFlowRemoteDataProvider = DoubleCheck.provider((Provider) orderFlowRemoteDataSourceImplProvider);
      this.providesProductListAndDetailsApiProvider = DoubleCheck.provider(new SwitchingProvider<ProductListAndDetailsApi>(singletonCImpl, 10));
      this.productListAndDetailsRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 11);
      this.bindProductListAndDetailsRemoteDataProvider = DoubleCheck.provider((Provider) productListAndDetailsRemoteDataSourceImplProvider);
      this.helpFaqAndTnCRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 12);
      this.bindHelpFaqTncRemoteDataProvider = DoubleCheck.provider((Provider) helpFaqAndTnCRemoteDataSourceImplProvider);
      this.providesUserDataApiProvider = DoubleCheck.provider(new SwitchingProvider<UserDataApi>(singletonCImpl, 13));
      this.cancelOrderRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 14);
      this.bindCancelOrderRemoteDataProvider = DoubleCheck.provider((Provider) cancelOrderRemoteDataSourceImplProvider);
      this.providesLoginApiProvider = DoubleCheck.provider(new SwitchingProvider<LoginApi>(singletonCImpl, 15));
      this.providesWalletAndReferralApiProvider = DoubleCheck.provider(new SwitchingProvider<WalletAndReferralApi>(singletonCImpl, 16));
      this.providesOrderStatusApiProvider = DoubleCheck.provider(new SwitchingProvider<OrderStatusApi>(singletonCImpl, 18));
      this.orderStatusRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 17);
      this.bindOrderStatusRemoteDataProvider = DoubleCheck.provider((Provider) orderStatusRemoteDataSourceImplProvider);
      this.providesOrderReminderApiProvider = DoubleCheck.provider(new SwitchingProvider<OrderReminderApi>(singletonCImpl, 20));
      this.orderReminderRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 19);
      this.bindOrderReminderRemoteDataProvider = DoubleCheck.provider((Provider) orderReminderRemoteDataSourceImplProvider);
      this.cashFreeRemoteDataSourceImplProvider = new SwitchingProvider<>(singletonCImpl, 21);
      this.bindCashFreeRemoteDataProvider = DoubleCheck.provider((Provider) cashFreeRemoteDataSourceImplProvider);
    }

    @Override
    public void injectApplicationClass(ApplicationClass applicationClass) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.intellihealth.truemeds.data.repository.datasourceimpl.remote.HomePageRemoteDataSourceImpl 
          return (T) new HomePageRemoteDataSourceImpl(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.providesHomePageApiProvider.get(), singletonCImpl.getContentTypeProvider.get());

          case 1: // com.intellihealth.truemeds.data.api.HomePageApi 
          return (T) HomePageNetworkModule_ProvidesHomePageApiFactory.providesHomePageApi(singletonCImpl.homePageNetworkModule, singletonCImpl.providesRetrofitProvider.get());

          case 2: // retrofit2.Retrofit 
          return (T) ApiModule_ProvidesRetrofitFactory.providesRetrofit(singletonCImpl.apiModule, singletonCImpl.providesOkHttpClientProvider.get());

          case 3: // okhttp3.OkHttpClient 
          return (T) OkHttpClientModule_ProvidesOkHttpClientFactory.providesOkHttpClient(singletonCImpl.okHttpClientModule, singletonCImpl.cacheProvider.get(), singletonCImpl.httpLoggingInterceptorProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 4: // okhttp3.Cache 
          return (T) OkHttpClientModule_CacheFactory.cache(singletonCImpl.okHttpClientModule, singletonCImpl.fileProvider.get());

          case 5: // java.io.File 
          return (T) OkHttpClientModule_FileFactory.file(singletonCImpl.okHttpClientModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 6: // okhttp3.logging.HttpLoggingInterceptor 
          return (T) OkHttpClientModule_HttpLoggingInterceptorFactory.httpLoggingInterceptor(singletonCImpl.okHttpClientModule);

          case 7: // @javax.inject.Named("content_type") java.lang.String 
          return (T) ValueProviderModule_GetContentTypeFactory.getContentType(singletonCImpl.valueProviderModule);

          case 8: // com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderFlowRemoteDataSourceImpl 
          return (T) new OrderFlowRemoteDataSourceImpl(singletonCImpl.providesOrderFlowApiProvider.get(), singletonCImpl.getContentTypeProvider.get());

          case 9: // com.intellihealth.truemeds.data.api.OrderFlowApi 
          return (T) OrderFlowNetworkModule_ProvidesOrderFlowApiFactory.providesOrderFlowApi(singletonCImpl.orderFlowNetworkModule, singletonCImpl.providesRetrofitProvider.get());

          case 10: // com.intellihealth.truemeds.data.api.ProductListAndDetailsApi 
          return (T) ProductListAndDetailsNetworkModule_ProvidesProductListAndDetailsApiFactory.providesProductListAndDetailsApi(singletonCImpl.productListAndDetailsNetworkModule, singletonCImpl.providesRetrofitProvider.get());

          case 11: // com.intellihealth.truemeds.data.repository.datasourceimpl.remote.ProductListAndDetailsRemoteDataSourceImpl 
          return (T) new ProductListAndDetailsRemoteDataSourceImpl(singletonCImpl.providesProductListAndDetailsApiProvider.get(), singletonCImpl.getContentTypeProvider.get());

          case 12: // com.intellihealth.truemeds.data.repository.datasourceimpl.remote.HelpFaqAndTnCRemoteDataSourceImpl 
          return (T) new HelpFaqAndTnCRemoteDataSourceImpl(singletonCImpl.helpFaqTncApi(), singletonCImpl.getContentTypeProvider.get());

          case 13: // com.intellihealth.truemeds.data.api.UserDataApi 
          return (T) ApiModule_ProvidesUserDataApiFactory.providesUserDataApi(singletonCImpl.apiModule, singletonCImpl.providesRetrofitProvider.get());

          case 14: // com.intellihealth.truemeds.data.repository.datasourceimpl.remote.CancelOrderRemoteDataSourceImpl 
          return (T) new CancelOrderRemoteDataSourceImpl(singletonCImpl.cancelOrderApi(), singletonCImpl.getContentTypeProvider.get());

          case 15: // com.intellihealth.truemeds.data.api.LoginApi 
          return (T) ApiModule_ProvidesLoginApiFactory.providesLoginApi(singletonCImpl.apiModule, singletonCImpl.providesRetrofitProvider.get());

          case 16: // com.intellihealth.truemeds.data.api.WalletAndReferralApi 
          return (T) WalletAndReferralNetworkModule_ProvidesWalletAndReferralApiFactory.providesWalletAndReferralApi(singletonCImpl.walletAndReferralNetworkModule, singletonCImpl.providesRetrofitProvider.get());

          case 17: // com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderStatusRemoteDataSourceImpl 
          return (T) new OrderStatusRemoteDataSourceImpl(singletonCImpl.providesOrderStatusApiProvider.get(), singletonCImpl.getContentTypeProvider.get());

          case 18: // com.intellihealth.truemeds.data.api.OrderStatusApi 
          return (T) OrderStatusNetworkModule_ProvidesOrderStatusApiFactory.providesOrderStatusApi(singletonCImpl.orderStatusNetworkModule, singletonCImpl.providesRetrofitProvider.get());

          case 19: // com.intellihealth.truemeds.data.repository.datasourceimpl.remote.OrderReminderRemoteDataSourceImpl 
          return (T) new OrderReminderRemoteDataSourceImpl(singletonCImpl.providesOrderReminderApiProvider.get(), singletonCImpl.getContentTypeProvider.get());

          case 20: // com.intellihealth.truemeds.data.api.OrderReminderApi 
          return (T) OrderReminderNetworkModule_ProvidesOrderReminderApiFactory.providesOrderReminderApi(singletonCImpl.orderReminderNetworkModule, singletonCImpl.providesRetrofitProvider.get());

          case 21: // com.intellihealth.truemeds.data.repository.datasourceimpl.remote.CashFreeRemoteDataSourceImpl 
          return (T) new CashFreeRemoteDataSourceImpl(singletonCImpl.cashFreeApi(), singletonCImpl.getContentTypeProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
