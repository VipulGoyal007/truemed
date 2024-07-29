package com.intellihealth.truemeds.presentation.activity;

import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase;
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
public final class WalletTransactionsActivity_MembersInjector implements MembersInjector<WalletTransactionsActivity> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public WalletTransactionsActivity_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<WalletTransactionsActivity> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new WalletTransactionsActivity_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(WalletTransactionsActivity instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.activity.WalletTransactionsActivity.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(WalletTransactionsActivity instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
