package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.LocalDbRepository;
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
public final class LocalDbUseCase_Factory implements Factory<LocalDbUseCase> {
  private final Provider<LocalDbRepository> localDbRepositoryProvider;

  public LocalDbUseCase_Factory(Provider<LocalDbRepository> localDbRepositoryProvider) {
    this.localDbRepositoryProvider = localDbRepositoryProvider;
  }

  @Override
  public LocalDbUseCase get() {
    return newInstance(localDbRepositoryProvider.get());
  }

  public static LocalDbUseCase_Factory create(
      Provider<LocalDbRepository> localDbRepositoryProvider) {
    return new LocalDbUseCase_Factory(localDbRepositoryProvider);
  }

  public static LocalDbUseCase newInstance(LocalDbRepository localDbRepository) {
    return new LocalDbUseCase(localDbRepository);
  }
}
