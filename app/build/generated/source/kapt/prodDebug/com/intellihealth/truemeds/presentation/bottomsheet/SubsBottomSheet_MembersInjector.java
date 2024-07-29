package com.intellihealth.truemeds.presentation.bottomsheet;

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
public final class SubsBottomSheet_MembersInjector implements MembersInjector<SubsBottomSheet> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public SubsBottomSheet_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<SubsBottomSheet> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new SubsBottomSheet_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(SubsBottomSheet instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(SubsBottomSheet instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
