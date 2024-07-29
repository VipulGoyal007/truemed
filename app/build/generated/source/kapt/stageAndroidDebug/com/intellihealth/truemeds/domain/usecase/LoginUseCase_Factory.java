package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.LoginRepository;
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
public final class LoginUseCase_Factory implements Factory<LoginUseCase> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<UserDataUseCase> userDataUseCaseProvider;

  private final Provider<TmWalletUseCase> walletUseCaseProvider;

  public LoginUseCase_Factory(Provider<LoginRepository> loginRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<UserDataUseCase> userDataUseCaseProvider,
      Provider<TmWalletUseCase> walletUseCaseProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.userDataUseCaseProvider = userDataUseCaseProvider;
    this.walletUseCaseProvider = walletUseCaseProvider;
  }

  @Override
  public LoginUseCase get() {
    return newInstance(loginRepositoryProvider.get(), sdkEventUseCaseProvider.get(), localDbUseCaseProvider.get(), userDataUseCaseProvider.get(), walletUseCaseProvider.get());
  }

  public static LoginUseCase_Factory create(Provider<LoginRepository> loginRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<UserDataUseCase> userDataUseCaseProvider,
      Provider<TmWalletUseCase> walletUseCaseProvider) {
    return new LoginUseCase_Factory(loginRepositoryProvider, sdkEventUseCaseProvider, localDbUseCaseProvider, userDataUseCaseProvider, walletUseCaseProvider);
  }

  public static LoginUseCase newInstance(LoginRepository loginRepository,
      SdkEventUseCase sdkEventUseCase, LocalDbUseCase localDbUseCase,
      UserDataUseCase userDataUseCase, TmWalletUseCase walletUseCase) {
    return new LoginUseCase(loginRepository, sdkEventUseCase, localDbUseCase, userDataUseCase, walletUseCase);
  }
}
