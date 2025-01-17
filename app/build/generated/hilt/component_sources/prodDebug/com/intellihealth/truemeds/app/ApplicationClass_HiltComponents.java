package com.intellihealth.truemeds.app;

import com.intellihealth.truemeds.di.ApiModule;
import com.intellihealth.truemeds.di.CancelOrderDataModule;
import com.intellihealth.truemeds.di.CancelOrderNetworkModule;
import com.intellihealth.truemeds.di.CancelOrderRepositoryModule;
import com.intellihealth.truemeds.di.CashFreeDataModule;
import com.intellihealth.truemeds.di.CashFreeNetworkModule;
import com.intellihealth.truemeds.di.CashFreeRepositoryModule;
import com.intellihealth.truemeds.di.HelpFaqAndTnModule;
import com.intellihealth.truemeds.di.HelpFaqTncModule;
import com.intellihealth.truemeds.di.HelpFaqTncNetworkModule;
import com.intellihealth.truemeds.di.HelpFaqTncRepositoryModule;
import com.intellihealth.truemeds.di.HomePageNetworkModule;
import com.intellihealth.truemeds.di.HomePageRemoteDataModule;
import com.intellihealth.truemeds.di.HomePageRepositoryModule;
import com.intellihealth.truemeds.di.OkHttpClientModule;
import com.intellihealth.truemeds.di.OrderFlowDataModule;
import com.intellihealth.truemeds.di.OrderFlowNetworkModule;
import com.intellihealth.truemeds.di.OrderFlowRepositoryModule;
import com.intellihealth.truemeds.di.OrderReminderNetworkModule;
import com.intellihealth.truemeds.di.OrderReminderRemoteDataModule;
import com.intellihealth.truemeds.di.OrderReminderRepositoryModule;
import com.intellihealth.truemeds.di.OrderStatusDataModule;
import com.intellihealth.truemeds.di.OrderStatusNetworkModule;
import com.intellihealth.truemeds.di.OrderStatusRepositoryModule;
import com.intellihealth.truemeds.di.ProductListAndDetailsDataModule;
import com.intellihealth.truemeds.di.ProductListAndDetailsNetworkModule;
import com.intellihealth.truemeds.di.ProductListAndDetailsRepositoryModule;
import com.intellihealth.truemeds.di.RemoteDataModule;
import com.intellihealth.truemeds.di.RepositoryModule;
import com.intellihealth.truemeds.di.RoomDbModule;
import com.intellihealth.truemeds.di.SplashScreenNetworkModule;
import com.intellihealth.truemeds.di.SplashScreenRemoteDataModule;
import com.intellihealth.truemeds.di.SplashScreenRepositoryModule;
import com.intellihealth.truemeds.di.ValueProviderModule;
import com.intellihealth.truemeds.di.VideoFAQModule;
import com.intellihealth.truemeds.di.VideoFAQRemoteDataModule;
import com.intellihealth.truemeds.di.VideoFAQRepositoryModule;
import com.intellihealth.truemeds.di.WalletAndReferralNetworkModule;
import com.intellihealth.truemeds.presentation.activity.AddAddressActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.AddPatientActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.CancelOrderActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.CancelOrderSubActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.CartActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.CouponActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.DeliveryDetailsActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.EditProfileActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.FaqViewAllActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.HealthArticleDetailActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.HealthArticlesActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.HelpActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.HelpSubCategoryActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.HelpSubCategoryDetailActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.HomePageActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.LoginActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.ManageAddressActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.ManagePatientActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.MyOrdersActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.NonActiveOrderStatusActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.OrderStatusActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.OrderSummaryActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.OtcCategoryActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.PatientReminderActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.PaymentActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.PaymentOptionActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.PoliciesPageActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.PolicyDetailActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.PrescriptionActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.ProductDetailActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.ProductListViewAllActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.ReferAndEarnActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.SearchResultActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.SearchSuggestionActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.SplashScreen_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.SubstitutesActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.VideoFaqActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.WalletActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.activity.WalletTransactionsActivity_GeneratedInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.AddReminderBottomSheet_GeneratedInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.PastPrescriptionBottomSheet_GeneratedInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.PaymentChangeSelectionBottomSheet_GeneratedInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.PaymentUnsuccessfulBottomsheet_GeneratedInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet_GeneratedInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet_GeneratedInjector;
import com.intellihealth.truemeds.presentation.bottomsheet.ViewBillDetailsBottomSheet_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.AccountFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.HomeFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.LoginMobileNumberFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.LoginOtpFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.MyOrdersFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.MyReferralsFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.ProductDetailFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.ReferAndEarnFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.ReferEarnFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.fragment.ReferNowFragment_GeneratedInjector;
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.AddAddressViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.AddPatientDetailsViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.AddPatientViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.OtcCategoryViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.PaymentStatusViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.PolicyTncViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.SubstitutePageViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.VideoFaqViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.VideoViewModel_HiltModules;
import com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.processing.Generated;
import javax.inject.Singleton;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class ApplicationClass_HiltComponents {
  private ApplicationClass_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ApiModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          ApplicationContextModule.class,
          CancelOrderDataModule.class,
          CancelOrderNetworkModule.class,
          CancelOrderRepositoryModule.class,
          CashFreeDataModule.class,
          CashFreeNetworkModule.class,
          CashFreeRepositoryModule.class,
          HelpFaqAndTnModule.class,
          HelpFaqTncModule.class,
          HelpFaqTncNetworkModule.class,
          HelpFaqTncRepositoryModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
          HomePageNetworkModule.class,
          HomePageRemoteDataModule.class,
          HomePageRepositoryModule.class,
          OkHttpClientModule.class,
          OrderFlowDataModule.class,
          OrderFlowNetworkModule.class,
          OrderFlowRepositoryModule.class,
          OrderReminderNetworkModule.class,
          OrderReminderRemoteDataModule.class,
          OrderReminderRepositoryModule.class,
          OrderStatusDataModule.class,
          OrderStatusNetworkModule.class,
          OrderStatusRepositoryModule.class,
          ProductListAndDetailsDataModule.class,
          ProductListAndDetailsNetworkModule.class,
          ProductListAndDetailsRepositoryModule.class,
          RemoteDataModule.class,
          RepositoryModule.class,
          RoomDbModule.class,
          SplashScreenNetworkModule.class,
          SplashScreenRemoteDataModule.class,
          SplashScreenRepositoryModule.class,
          ValueProviderModule.class,
          VideoFAQModule.class,
          VideoFAQRemoteDataModule.class,
          VideoFAQRepositoryModule.class,
          WalletAndReferralNetworkModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements ApplicationClass_GeneratedInjector,
      FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AccountTabViewModel_HiltModules.KeyModule.class,
          AddAddressViewModel_HiltModules.KeyModule.class,
          AddPatientDetailsViewModel_HiltModules.KeyModule.class,
          AddPatientViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          BaseViewModel_HiltModules.KeyModule.class,
          CancelOrderViewModel_HiltModules.KeyModule.class,
          CartViewModel_HiltModules.KeyModule.class,
          CouponViewModel_HiltModules.KeyModule.class,
          DeliveryDetailsViewModel_HiltModules.KeyModule.class,
          EditProfileDetailViewModel_HiltModules.KeyModule.class,
          HealthArticlesViewModel_HiltModules.KeyModule.class,
          HelpViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HomeViewModel_HiltModules.KeyModule.class,
          LoginViewModel_HiltModules.KeyModule.class,
          ManageAddressViewModel_HiltModules.KeyModule.class,
          ManagePatientViewModel_HiltModules.KeyModule.class,
          MyOrderViewModel_HiltModules.KeyModule.class,
          OrderStatusViewModel_HiltModules.KeyModule.class,
          OrderSummaryViewModel_HiltModules.KeyModule.class,
          OrdersTabViewModel_HiltModules.KeyModule.class,
          OtcCategoryViewModel_HiltModules.KeyModule.class,
          PaymentOptionsViewModel_HiltModules.KeyModule.class,
          PaymentStatusViewModel_HiltModules.KeyModule.class,
          PolicyTncViewModel_HiltModules.KeyModule.class,
          PrescriptionViewModel_HiltModules.KeyModule.class,
          ProductDetailViewModel_HiltModules.KeyModule.class,
          ProductListViewAllViewModel_HiltModules.KeyModule.class,
          ReferNEarnViewModel_HiltModules.KeyModule.class,
          ReminderViewModel_HiltModules.KeyModule.class,
          SearchViewModel_HiltModules.KeyModule.class,
          SplashScreenViewModel_HiltModules.KeyModule.class,
          SubstitutePageViewModel_HiltModules.KeyModule.class,
          VideoFaqViewModel_HiltModules.KeyModule.class,
          VideoViewModel_HiltModules.KeyModule.class,
          WalletViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements AddAddressActivity_GeneratedInjector,
      AddPatientActivity_GeneratedInjector,
      CancelOrderActivity_GeneratedInjector,
      CancelOrderSubActivity_GeneratedInjector,
      CartActivity_GeneratedInjector,
      CouponActivity_GeneratedInjector,
      DeliveryDetailsActivity_GeneratedInjector,
      EditProfileActivity_GeneratedInjector,
      FaqViewAllActivity_GeneratedInjector,
      HealthArticleDetailActivity_GeneratedInjector,
      HealthArticlesActivity_GeneratedInjector,
      HelpActivity_GeneratedInjector,
      HelpSubCategoryActivity_GeneratedInjector,
      HelpSubCategoryDetailActivity_GeneratedInjector,
      HomePageActivity_GeneratedInjector,
      LoginActivity_GeneratedInjector,
      ManageAddressActivity_GeneratedInjector,
      ManagePatientActivity_GeneratedInjector,
      MyOrdersActivity_GeneratedInjector,
      NonActiveOrderStatusActivity_GeneratedInjector,
      OrderStatusActivity_GeneratedInjector,
      OrderSummaryActivity_GeneratedInjector,
      OtcCategoryActivity_GeneratedInjector,
      PatientReminderActivity_GeneratedInjector,
      PaymentActivity_GeneratedInjector,
      PaymentOptionActivity_GeneratedInjector,
      PoliciesPageActivity_GeneratedInjector,
      PolicyDetailActivity_GeneratedInjector,
      PrescriptionActivity_GeneratedInjector,
      ProductDetailActivity_GeneratedInjector,
      ProductListViewAllActivity_GeneratedInjector,
      ReferAndEarnActivity_GeneratedInjector,
      SearchResultActivity_GeneratedInjector,
      SearchSuggestionActivity_GeneratedInjector,
      SplashScreen_GeneratedInjector,
      SubstitutesActivity_GeneratedInjector,
      VideoFaqActivity_GeneratedInjector,
      WalletActivity_GeneratedInjector,
      WalletTransactionsActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AccountTabViewModel_HiltModules.BindsModule.class,
          AddAddressViewModel_HiltModules.BindsModule.class,
          AddPatientDetailsViewModel_HiltModules.BindsModule.class,
          AddPatientViewModel_HiltModules.BindsModule.class,
          BaseViewModel_HiltModules.BindsModule.class,
          CancelOrderViewModel_HiltModules.BindsModule.class,
          CartViewModel_HiltModules.BindsModule.class,
          CouponViewModel_HiltModules.BindsModule.class,
          DeliveryDetailsViewModel_HiltModules.BindsModule.class,
          EditProfileDetailViewModel_HiltModules.BindsModule.class,
          HealthArticlesViewModel_HiltModules.BindsModule.class,
          HelpViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          HomeViewModel_HiltModules.BindsModule.class,
          LoginViewModel_HiltModules.BindsModule.class,
          ManageAddressViewModel_HiltModules.BindsModule.class,
          ManagePatientViewModel_HiltModules.BindsModule.class,
          MyOrderViewModel_HiltModules.BindsModule.class,
          OrderStatusViewModel_HiltModules.BindsModule.class,
          OrderSummaryViewModel_HiltModules.BindsModule.class,
          OrdersTabViewModel_HiltModules.BindsModule.class,
          OtcCategoryViewModel_HiltModules.BindsModule.class,
          PaymentOptionsViewModel_HiltModules.BindsModule.class,
          PaymentStatusViewModel_HiltModules.BindsModule.class,
          PolicyTncViewModel_HiltModules.BindsModule.class,
          PrescriptionViewModel_HiltModules.BindsModule.class,
          ProductDetailViewModel_HiltModules.BindsModule.class,
          ProductListViewAllViewModel_HiltModules.BindsModule.class,
          ReferNEarnViewModel_HiltModules.BindsModule.class,
          ReminderViewModel_HiltModules.BindsModule.class,
          SearchViewModel_HiltModules.BindsModule.class,
          SplashScreenViewModel_HiltModules.BindsModule.class,
          SubstitutePageViewModel_HiltModules.BindsModule.class,
          VideoFaqViewModel_HiltModules.BindsModule.class,
          VideoViewModel_HiltModules.BindsModule.class,
          WalletViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements AddReminderBottomSheet_GeneratedInjector,
      PastPrescriptionBottomSheet_GeneratedInjector,
      PaymentChangeSelectionBottomSheet_GeneratedInjector,
      PaymentUnsuccessfulBottomsheet_GeneratedInjector,
      SubsBottomSheet_GeneratedInjector,
      UploadPrescriptionBottomSheet_GeneratedInjector,
      ViewBillDetailsBottomSheet_GeneratedInjector,
      AccountFragment_GeneratedInjector,
      HomeFragment_GeneratedInjector,
      LoginMobileNumberFragment_GeneratedInjector,
      LoginOtpFragment_GeneratedInjector,
      MyOrdersFragment_GeneratedInjector,
      MyReferralsFragment_GeneratedInjector,
      ProductDetailFragment_GeneratedInjector,
      ReferAndEarnFragment_GeneratedInjector,
      ReferEarnFragment_GeneratedInjector,
      ReferNowFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
