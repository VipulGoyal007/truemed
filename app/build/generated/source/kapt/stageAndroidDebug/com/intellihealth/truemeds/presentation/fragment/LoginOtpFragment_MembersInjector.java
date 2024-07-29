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
public final class LoginOtpFragment_MembersInjector implements MembersInjector<LoginOtpFragment> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public LoginOtpFragment_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<LoginOtpFragment> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new LoginOtpFragment_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(LoginOtpFragment instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.fragment.LoginOtpFragment.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(LoginOtpFragment instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
