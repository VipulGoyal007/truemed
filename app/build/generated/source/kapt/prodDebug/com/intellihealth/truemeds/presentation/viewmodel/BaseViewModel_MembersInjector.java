package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
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
public final class BaseViewModel_MembersInjector implements MembersInjector<BaseViewModel> {
  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public BaseViewModel_MembersInjector(Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  public static MembersInjector<BaseViewModel> create(
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new BaseViewModel_MembersInjector(localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  @Override
  public void injectMembers(BaseViewModel instance) {
    injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    injectCouponUseCase(instance, couponUseCaseProvider.get());
    injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel.localDbUseCase")
  public static void injectLocalDbUseCase(BaseViewModel instance, LocalDbUseCase localDbUseCase) {
    instance.localDbUseCase = localDbUseCase;
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel.orderFlowUseCase")
  public static void injectOrderFlowUseCase(BaseViewModel instance,
      OrderFlowUseCase orderFlowUseCase) {
    instance.orderFlowUseCase = orderFlowUseCase;
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel.couponUseCase")
  public static void injectCouponUseCase(BaseViewModel instance, CouponUseCase couponUseCase) {
    instance.couponUseCase = couponUseCase;
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel.sdkEventUseCase")
  public static void injectSdkEventUseCase(BaseViewModel instance,
      SdkEventUseCase sdkEventUseCase) {
    instance.sdkEventUseCase = sdkEventUseCase;
  }
}
