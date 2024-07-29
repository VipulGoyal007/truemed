package com.intellihealth.truemeds.presentation.viewmodel;

import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase;
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
public final class HelpViewModel_Factory implements Factory<HelpViewModel> {
  private final Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider;

  public HelpViewModel_Factory(Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider) {
    this.helpFaqTncUseCaseProvider = helpFaqTncUseCaseProvider;
  }

  @Override
  public HelpViewModel get() {
    return newInstance(helpFaqTncUseCaseProvider.get());
  }

  public static HelpViewModel_Factory create(
      Provider<HelpFaqTncUseCase> helpFaqTncUseCaseProvider) {
    return new HelpViewModel_Factory(helpFaqTncUseCaseProvider);
  }

  public static HelpViewModel newInstance(HelpFaqTncUseCase helpFaqTncUseCase) {
    return new HelpViewModel(helpFaqTncUseCase);
  }
}
