package com.intellihealth.truemeds.presentation.viewmodel;

import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.TmWalletUseCase;
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
public final class ReferNEarnViewModel_Factory implements Factory<ReferNEarnViewModel> {
  private final Provider<TmWalletUseCase> walletUseCaseProvider;

  private final Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider;

  private final Provider<Context> appContextProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public ReferNEarnViewModel_Factory(Provider<TmWalletUseCase> walletUseCaseProvider,
      Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider, Provider<Context> appContextProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.walletUseCaseProvider = walletUseCaseProvider;
    this.helpFaqTncUseCaseProvider = helpFaqTncUseCaseProvider;
    this.appContextProvider = appContextProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public ReferNEarnViewModel get() {
    ReferNEarnViewModel instance = newInstance(walletUseCaseProvider.get(), helpFaqTncUseCaseProvider.get(), appContextProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    return instance;
  }

  public static ReferNEarnViewModel_Factory create(Provider<TmWalletUseCase> walletUseCaseProvider,
      Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider, Provider<Context> appContextProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new ReferNEarnViewModel_Factory(walletUseCaseProvider, helpFaqTncUseCaseProvider, appContextProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static ReferNEarnViewModel newInstance(TmWalletUseCase walletUseCase,
      HelpFaqTncUseCase helpFaqTncUseCase, Context appContext) {
    return new ReferNEarnViewModel(walletUseCase, helpFaqTncUseCase, appContext);
  }
}
