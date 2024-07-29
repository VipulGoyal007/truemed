package com.intellihealth.truemeds.presentation.viewmodel;

import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.LoginUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.ProductDetailUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase;
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
public final class ProductDetailViewModel_Factory implements Factory<ProductDetailViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<ProductDetailUseCase> productDetailUseCaseProvider;

  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public ProductDetailViewModel_Factory(Provider<Context> contextProvider,
      Provider<ProductDetailUseCase> productDetailUseCaseProvider,
      Provider<LoginUseCase> loginUseCaseProvider, Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.productDetailUseCaseProvider = productDetailUseCaseProvider;
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  @Override
  public ProductDetailViewModel get() {
    ProductDetailViewModel instance = newInstance(contextProvider.get(), productDetailUseCaseProvider.get(), loginUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    ProductDetailViewModel_MembersInjector.injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
    return instance;
  }

  public static ProductDetailViewModel_Factory create(Provider<Context> contextProvider,
      Provider<ProductDetailUseCase> productDetailUseCaseProvider,
      Provider<LoginUseCase> loginUseCaseProvider, Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new ProductDetailViewModel_Factory(contextProvider, productDetailUseCaseProvider, loginUseCaseProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider, firebaseEventUseCaseProvider);
  }

  public static ProductDetailViewModel newInstance(Context context,
      ProductDetailUseCase productDetailUseCase, LoginUseCase loginUseCase) {
    return new ProductDetailViewModel(context, productDetailUseCase, loginUseCase);
  }
}
