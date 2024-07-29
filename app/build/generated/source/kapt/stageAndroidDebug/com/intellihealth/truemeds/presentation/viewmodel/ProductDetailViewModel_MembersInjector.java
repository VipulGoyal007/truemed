package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class ProductDetailViewModel_MembersInjector implements MembersInjector<ProductDetailViewModel> {
  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public ProductDetailViewModel_MembersInjector(Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<ProductDetailViewModel> create(
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new ProductDetailViewModel_MembersInjector(localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider, firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(ProductDetailViewModel instance) {
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(ProductDetailViewModel instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
