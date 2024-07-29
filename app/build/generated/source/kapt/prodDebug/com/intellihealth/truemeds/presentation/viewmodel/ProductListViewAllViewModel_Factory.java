package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.LoginUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.ProductListAndDetailsUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
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
public final class ProductListViewAllViewModel_Factory implements Factory<ProductListViewAllViewModel> {
  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<ProductListAndDetailsUseCase> productListAndDetailsUseCaseProvider;

  private final Provider<HomePageUseCase> homePageUseCaseProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public ProductListViewAllViewModel_Factory(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<ProductListAndDetailsUseCase> productListAndDetailsUseCaseProvider,
      Provider<HomePageUseCase> homePageUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.productListAndDetailsUseCaseProvider = productListAndDetailsUseCaseProvider;
    this.homePageUseCaseProvider = homePageUseCaseProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public ProductListViewAllViewModel get() {
    ProductListViewAllViewModel instance = newInstance(loginUseCaseProvider.get(), productListAndDetailsUseCaseProvider.get(), homePageUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    return instance;
  }

  public static ProductListViewAllViewModel_Factory create(
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<ProductListAndDetailsUseCase> productListAndDetailsUseCaseProvider,
      Provider<HomePageUseCase> homePageUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new ProductListViewAllViewModel_Factory(loginUseCaseProvider, productListAndDetailsUseCaseProvider, homePageUseCaseProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static ProductListViewAllViewModel newInstance(LoginUseCase loginUseCase,
      ProductListAndDetailsUseCase productListAndDetailsUseCase, HomePageUseCase homePageUseCase) {
    return new ProductListViewAllViewModel(loginUseCase, productListAndDetailsUseCase, homePageUseCase);
  }
}
