package com.intellihealth.truemeds.presentation.fragment;

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
public final class LoginMobileNumberFragment_MembersInjector implements MembersInjector<LoginMobileNumberFragment> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public LoginMobileNumberFragment_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<LoginMobileNumberFragment> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new LoginMobileNumberFragment_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(LoginMobileNumberFragment instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.fragment.LoginMobileNumberFragment.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(LoginMobileNumberFragment instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
