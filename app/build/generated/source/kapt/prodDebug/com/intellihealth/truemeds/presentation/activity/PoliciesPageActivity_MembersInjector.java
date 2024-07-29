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
public final class PoliciesPageActivity_MembersInjector implements MembersInjector<PoliciesPageActivity> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public PoliciesPageActivity_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<PoliciesPageActivity> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new PoliciesPageActivity_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(PoliciesPageActivity instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.activity.PoliciesPageActivity.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(PoliciesPageActivity instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
