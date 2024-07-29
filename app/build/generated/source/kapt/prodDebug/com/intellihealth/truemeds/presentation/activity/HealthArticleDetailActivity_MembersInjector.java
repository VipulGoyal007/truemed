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
public final class HealthArticleDetailActivity_MembersInjector implements MembersInjector<HealthArticleDetailActivity> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public HealthArticleDetailActivity_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<HealthArticleDetailActivity> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new HealthArticleDetailActivity_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(HealthArticleDetailActivity instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.activity.HealthArticleDetailActivity.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(HealthArticleDetailActivity instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
