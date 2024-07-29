package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.AddPatientUseCase;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.EditPatientUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
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
public final class ManagePatientViewModel_Factory implements Factory<ManagePatientViewModel> {
  private final Provider<ManagePatientUseCase> userDataUseCaseProvider;

  private final Provider<EditPatientUseCase> editPatientUseCaseProvider;

  private final Provider<AddPatientUseCase> addPatientUseCaseProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public ManagePatientViewModel_Factory(Provider<ManagePatientUseCase> userDataUseCaseProvider,
      Provider<EditPatientUseCase> editPatientUseCaseProvider,
      Provider<AddPatientUseCase> addPatientUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.userDataUseCaseProvider = userDataUseCaseProvider;
    this.editPatientUseCaseProvider = editPatientUseCaseProvider;
    this.addPatientUseCaseProvider = addPatientUseCaseProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public ManagePatientViewModel get() {
    ManagePatientViewModel instance = newInstance(userDataUseCaseProvider.get(), editPatientUseCaseProvider.get(), addPatientUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    return instance;
  }

  public static ManagePatientViewModel_Factory create(
      Provider<ManagePatientUseCase> userDataUseCaseProvider,
      Provider<EditPatientUseCase> editPatientUseCaseProvider,
      Provider<AddPatientUseCase> addPatientUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new ManagePatientViewModel_Factory(userDataUseCaseProvider, editPatientUseCaseProvider, addPatientUseCaseProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static ManagePatientViewModel newInstance(ManagePatientUseCase userDataUseCase,
      EditPatientUseCase editPatientUseCase, AddPatientUseCase addPatientUseCase) {
    return new ManagePatientViewModel(userDataUseCase, editPatientUseCase, addPatientUseCase);
  }
}
