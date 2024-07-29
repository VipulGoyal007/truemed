package com.intellihealth.truemeds.presentation.viewmodel;

import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
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
public final class AddPatientDetailsViewModel_Factory implements Factory<AddPatientDetailsViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<UserDataUseCase> dataUseCaseProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public AddPatientDetailsViewModel_Factory(Provider<Context> contextProvider,
      Provider<UserDataUseCase> dataUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.dataUseCaseProvider = dataUseCaseProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public AddPatientDetailsViewModel get() {
    AddPatientDetailsViewModel instance = newInstance(contextProvider.get(), dataUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    return instance;
  }

  public static AddPatientDetailsViewModel_Factory create(Provider<Context> contextProvider,
      Provider<UserDataUseCase> dataUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new AddPatientDetailsViewModel_Factory(contextProvider, dataUseCaseProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static AddPatientDetailsViewModel newInstance(Context context,
      UserDataUseCase dataUseCase) {
    return new AddPatientDetailsViewModel(context, dataUseCase);
  }
}
