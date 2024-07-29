package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
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
public final class LoginViewModel_MembersInjector implements MembersInjector<LoginViewModel> {
  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public LoginViewModel_MembersInjector(Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  public static MembersInjector<LoginViewModel> create(
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new LoginViewModel_MembersInjector(localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  @Override
  public void injectMembers(LoginViewModel instance) {
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
  }
}
