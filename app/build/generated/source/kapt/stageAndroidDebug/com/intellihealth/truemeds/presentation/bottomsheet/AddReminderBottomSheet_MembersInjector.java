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
public final class AddReminderBottomSheet_MembersInjector implements MembersInjector<AddReminderBottomSheet> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public AddReminderBottomSheet_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<AddReminderBottomSheet> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new AddReminderBottomSheet_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(AddReminderBottomSheet instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.bottomsheet.AddReminderBottomSheet.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(AddReminderBottomSheet instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
