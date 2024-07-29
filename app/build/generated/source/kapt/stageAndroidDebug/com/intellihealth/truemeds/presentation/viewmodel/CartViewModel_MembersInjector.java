package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.CartUseCase;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
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
public final class CartViewModel_MembersInjector implements MembersInjector<CartViewModel> {
  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  private final Provider<FirebaseEventUseCase> firebaseEventProvider;

  private final Provider<CartUseCase> cartUseCaseProvider;

  public CartViewModel_MembersInjector(Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventProvider,
      Provider<CartUseCase> cartUseCaseProvider) {
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
    this.firebaseEventProvider = firebaseEventProvider;
    this.cartUseCaseProvider = cartUseCaseProvider;
  }

  public static MembersInjector<CartViewModel> create(
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventProvider,
      Provider<CartUseCase> cartUseCaseProvider) {
    return new CartViewModel_MembersInjector(localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider, firebaseEventProvider, cartUseCaseProvider);
  }

  @Override
  public void injectMembers(CartViewModel instance) {
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    PrescriptionViewModel_MembersInjector.injectFirebaseEvent(instance, firebaseEventProvider.get());
    PrescriptionViewModel_MembersInjector.injectCartUseCase(instance, cartUseCaseProvider.get());
  }
}
