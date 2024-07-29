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
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public LoginActivity_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new LoginActivity_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.activity.LoginActivity.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(LoginActivity instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
