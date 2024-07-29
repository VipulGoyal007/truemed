package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.UserDataUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class AddPatientViewModel_Factory implements Factory<AddPatientViewModel> {
  private final Provider<UserDataUseCase> userDataUseCaseProvider;

  public AddPatientViewModel_Factory(Provider<UserDataUseCase> userDataUseCaseProvider) {
    this.userDataUseCaseProvider = userDataUseCaseProvider;
  }

  @Override
  public AddPatientViewModel get() {
    return newInstance(userDataUseCaseProvider.get());
  }

  public static AddPatientViewModel_Factory create(
      Provider<UserDataUseCase> userDataUseCaseProvider) {
    return new AddPatientViewModel_Factory(userDataUseCaseProvider);
  }

  public static AddPatientViewModel newInstance(UserDataUseCase userDataUseCase) {
    return new AddPatientViewModel(userDataUseCase);
  }
}
