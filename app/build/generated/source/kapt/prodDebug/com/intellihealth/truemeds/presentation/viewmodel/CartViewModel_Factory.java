package com.intellihealth.truemeds.presentation.viewmodel;

import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CartUseCase;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.LoginUseCase;
import com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase;
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
public final class CartViewModel_Factory implements Factory<CartViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<ManagePatientUseCase> userDataUseCaseProvider;

  private final Provider<UserDataUseCase> userUseCaseProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  private final Provider<FirebaseEventUseCase> firebaseEventProvider;

  private final Provider<CartUseCase> cartUseCaseProvider;

  public CartViewModel_Factory(Provider<Context> contextProvider,
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<ManagePatientUseCase> userDataUseCaseProvider,
      Provider<UserDataUseCase> userUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventProvider,
      Provider<CartUseCase> cartUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.userDataUseCaseProvider = userDataUseCaseProvider;
    this.userUseCaseProvider = userUseCaseProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
    this.firebaseEventProvider = firebaseEventProvider;
    this.cartUseCaseProvider = cartUseCaseProvider;
  }

  @Override
  public CartViewModel get() {
    CartViewModel instance = newInstance(contextProvider.get(), loginUseCaseProvider.get(), userDataUseCaseProvider.get(), userUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    PrescriptionViewModel_MembersInjector.injectFirebaseEvent(instance, firebaseEventProvider.get());
    PrescriptionViewModel_MembersInjector.injectCartUseCase(instance, cartUseCaseProvider.get());
    return instance;
  }

  public static CartViewModel_Factory create(Provider<Context> contextProvider,
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<ManagePatientUseCase> userDataUseCaseProvider,
      Provider<UserDataUseCase> userUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<FirebaseEventUseCase> firebaseEventProvider,
      Provider<CartUseCase> cartUseCaseProvider) {
    return new CartViewModel_Factory(contextProvider, loginUseCaseProvider, userDataUseCaseProvider, userUseCaseProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider, firebaseEventProvider, cartUseCaseProvider);
  }

  public static CartViewModel newInstance(Context context, LoginUseCase loginUseCase,
      ManagePatientUseCase userDataUseCase, UserDataUseCase userUseCase) {
    return new CartViewModel(context, loginUseCase, userDataUseCase, userUseCase);
  }
}