package com.intellihealth.truemeds.presentation.viewmodel;

import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.LoginUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.ProductListAndDetailsUseCase;
import com.intellihealth.truemeds.domain.usecase.ReorderUseCase;
import com.intellihealth.truemeds.domain.usecase.TmWalletUseCase;
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<HomePageUseCase> homePageUseCaseProvider;

  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<UserDataUseCase> userDataUseCaseProvider;

  private final Provider<ReorderUseCase> reorderUseCaseProvider;

  private final Provider<TmWalletUseCase> tmWalletUseCaseProvider;

  private final Provider<ProductListAndDetailsUseCase> productListAndDetailsUseCaseProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public HomeViewModel_Factory(Provider<Context> contextProvider,
      Provider<HomePageUseCase> homePageUseCaseProvider,
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<UserDataUseCase> userDataUseCaseProvider,
      Provider<ReorderUseCase> reorderUseCaseProvider,
      Provider<TmWalletUseCase> tmWalletUseCaseProvider,
      Provider<ProductListAndDetailsUseCase> productListAndDetailsUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.homePageUseCaseProvider = homePageUseCaseProvider;
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.userDataUseCaseProvider = userDataUseCaseProvider;
    this.reorderUseCaseProvider = reorderUseCaseProvider;
    this.tmWalletUseCaseProvider = tmWalletUseCaseProvider;
    this.productListAndDetailsUseCaseProvider = productListAndDetailsUseCaseProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    HomeViewModel instance = newInstance(contextProvider.get(), homePageUseCaseProvider.get(), loginUseCaseProvider.get(), userDataUseCaseProvider.get(), reorderUseCaseProvider.get(), tmWalletUseCaseProvider.get(), productListAndDetailsUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    return instance;
  }

  public static HomeViewModel_Factory create(Provider<Context> contextProvider,
      Provider<HomePageUseCase> homePageUseCaseProvider,
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<UserDataUseCase> userDataUseCaseProvider,
      Provider<ReorderUseCase> reorderUseCaseProvider,
      Provider<TmWalletUseCase> tmWalletUseCaseProvider,
      Provider<ProductListAndDetailsUseCase> productListAndDetailsUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new HomeViewModel_Factory(contextProvider, homePageUseCaseProvider, loginUseCaseProvider, userDataUseCaseProvider, reorderUseCaseProvider, tmWalletUseCaseProvider, productListAndDetailsUseCaseProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static HomeViewModel newInstance(Context context, HomePageUseCase homePageUseCase,
      LoginUseCase loginUseCase, UserDataUseCase userDataUseCase, ReorderUseCase reorderUseCase,
      TmWalletUseCase tmWalletUseCase, ProductListAndDetailsUseCase productListAndDetailsUseCase) {
    return new HomeViewModel(context, homePageUseCase, loginUseCase, userDataUseCase, reorderUseCase, tmWalletUseCase, productListAndDetailsUseCase);
  }
}
