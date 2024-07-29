package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.SearchRepository;
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
public final class SearchUseCase_Factory implements Factory<SearchUseCase> {
  private final Provider<SearchRepository> searchRepositoryProvider;

  private final Provider<LocalDbUseCase> localDbUseCaseProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public SearchUseCase_Factory(Provider<SearchRepository> searchRepositoryProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.searchRepositoryProvider = searchRepositoryProvider;
    this.localDbUseCaseProvider = localDbUseCaseProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public SearchUseCase get() {
    return newInstance(searchRepositoryProvider.get(), localDbUseCaseProvider.get(), sdkEventUseCaseProvider.get());
  }

  public static SearchUseCase_Factory create(Provider<SearchRepository> searchRepositoryProvider,
      Provider<LocalDbUseCase> localDbUseCaseProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new SearchUseCase_Factory(searchRepositoryProvider, localDbUseCaseProvider, sdkEventUseCaseProvider);
  }

  public static SearchUseCase newInstance(SearchRepository searchRepository,
      LocalDbUseCase localDbUseCase, SdkEventUseCase sdkEventUseCase) {
    return new SearchUseCase(searchRepository, localDbUseCase, sdkEventUseCase);
  }
}
