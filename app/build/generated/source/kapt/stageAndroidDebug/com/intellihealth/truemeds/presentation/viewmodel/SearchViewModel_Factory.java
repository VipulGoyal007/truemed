package com.intellihealth.truemeds.presentation.viewmodel;

import android.content.Context;
import com.intellihealth.truemeds.domain.usecase.CouponUseCase;
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase;
import com.intellihealth.truemeds.domain.usecase.LoginUseCase;
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase;
import com.intellihealth.truemeds.domain.usecase.SearchUseCase;
import com.intellihealth.truemeds.domain.usecase.TmWalletUseCase;
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
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<SearchUseCase> searchUseCaseProvider;

  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<UserDataUseCase> userDataUseCaseProvider;

  private final Provider<TmWalletUseCase> tmWalletUseCaseProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<OrderFlowUseCase> orderFlowUseCaseProvider;

  private final Provider<CouponUseCase> couponUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public SearchViewModel_Factory(Provider<Context> contextProvider,
      Provider<SearchUseCase> searchUseCaseProvider, Provider<LoginUseCase> loginUseCaseProvider,
      Provider<UserDataUseCase> userDataUseCaseProvider,
      Provider<TmWalletUseCase> tmWalletUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.searchUseCaseProvider = searchUseCaseProvider;
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.userDataUseCaseProvider = userDataUseCaseProvider;
    this.tmWalletUseCaseProvider = tmWalletUseCaseProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.orderFlowUseCaseProvider = orderFlowUseCaseProvider;
    this.couponUseCaseProvider = couponUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public SearchViewModel get() {
    SearchViewModel instance = newInstance(contextProvider.get(), searchUseCaseProvider.get(), loginUseCaseProvider.get(), userDataUseCaseProvider.get(), tmWalletUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectLocalDbUseCase(instance, localDbUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectOrderFlowUseCase(instance, orderFlowUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectCouponUseCase(instance, couponUseCaseProvider.get());
    BaseViewModel_MembersInjector.injectSdkEventUseCase(instance, sdkEventUseCaseProvider.get());
    return instance;
  }

  public static SearchViewModel_Factory create(Provider<Context> contextProvider,
      Provider<SearchUseCase> searchUseCaseProvider, Provider<LoginUseCase> loginUseCaseProvider,
      Provider<UserDataUseCase> userDataUseCaseProvider,
      Provider<TmWalletUseCase> tmWalletUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<OrderFlowUseCase> orderFlowUseCaseProvider,
      Provider<CouponUseCase> couponUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new SearchViewModel_Factory(contextProvider, searchUseCaseProvider, loginUseCaseProvider, userDataUseCaseProvider, tmWalletUseCaseProvider, localDbUseCaseProvider, orderFlowUseCaseProvider, couponUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static SearchViewModel newInstance(Context context, SearchUseCase searchUseCase,
      LoginUseCase loginUseCase, UserDataUseCase userDataUseCase, TmWalletUseCase tmWalletUseCase) {
    return new SearchViewModel(context, searchUseCase, loginUseCase, userDataUseCase, tmWalletUseCase);
  }
}
