package com.intellihealth.truemeds.domain.usecase;

import android.content.Context;
import com.intellihealth.truemeds.domain.repository.TmWalletRepository;
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
public final class TmWalletUseCase_Factory implements Factory<TmWalletUseCase> {
  private final Provider<TmWalletRepository> walletRepositoryProvider;

  private final Provider<Context> appContextProvider;

  public TmWalletUseCase_Factory(Provider<TmWalletRepository> walletRepositoryProvider,
      Provider<Context> appContextProvider) {
    this.walletRepositoryProvider = walletRepositoryProvider;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public TmWalletUseCase get() {
    return newInstance(walletRepositoryProvider.get(), appContextProvider.get());
  }

  public static TmWalletUseCase_Factory create(
      Provider<TmWalletRepository> walletRepositoryProvider, Provider<Context> appContextProvider) {
    return new TmWalletUseCase_Factory(walletRepositoryProvider, appContextProvider);
  }

  public static TmWalletUseCase newInstance(TmWalletRepository walletRepository,
      Context appContext) {
    return new TmWalletUseCase(walletRepository, appContext);
  }
}
