package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.UserDataRepository;
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
public final class ManagePatientUseCase_Factory implements Factory<ManagePatientUseCase> {
  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<UserDataRepository> userDataRepositoryProvider;

  public ManagePatientUseCase_Factory(Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<UserDataRepository> userDataRepositoryProvider) {
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.userDataRepositoryProvider = userDataRepositoryProvider;
  }

  @Override
  public ManagePatientUseCase get() {
    return newInstance(localDbUseCaseProvider.get(), userDataRepositoryProvider.get());
  }

  public static ManagePatientUseCase_Factory create(Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<UserDataRepository> userDataRepositoryProvider) {
    return new ManagePatientUseCase_Factory(localDbUseCaseProvider, userDataRepositoryProvider);
  }

  public static ManagePatientUseCase newInstance(LocalDbUseCase localDbUseCase,
      UserDataRepository userDataRepository) {
    return new ManagePatientUseCase(localDbUseCase, userDataRepository);
  }
}
