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
public final class ReferNowFragment_MembersInjector implements MembersInjector<ReferNowFragment> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public ReferNowFragment_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<ReferNowFragment> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new ReferNowFragment_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(ReferNowFragment instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.fragment.ReferNowFragment.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(ReferNowFragment instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
