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
public final class ReferAndEarnActivity_MembersInjector implements MembersInjector<ReferAndEarnActivity> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public ReferAndEarnActivity_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<ReferAndEarnActivity> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new ReferAndEarnActivity_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(ReferAndEarnActivity instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.activity.ReferAndEarnActivity.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(ReferAndEarnActivity instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
