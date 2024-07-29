package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.UserDataRepository;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
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
public final class AddPatientUseCase_Factory implements Factory<AddPatientUseCase> {
  private final Provider<UserDataRepository> userDataRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public AddPatientUseCase_Factory(Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.userDataRepositoryProvider = userDataRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public AddPatientUseCase get() {
    return newInstance(userDataRepositoryProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static AddPatientUseCase_Factory create(
      Provider<UserDataRepository> userDataRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new AddPatientUseCase_Factory(userDataRepositoryProvider, sdkEventUseCaseProvider);
  }

  public static AddPatientUseCase newInstance(UserDataRepository userDataRepository,
      SdkEventUseCase sdkEventUseCase) {
    return new AddPatientUseCase(userDataRepository, sdkEventUseCase);
  }
}
