package com.intellihealth.truemeds.domain.usecase;

import com.intellihealth.truemeds.domain.repository.CashFreeRepository;
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
public final class CashFreeUseCase_Factory implements Factory<CashFreeUseCase> {
  private final Provider<CashFreeRepository> cashFreeRepositoryProvider;

  public CashFreeUseCase_Factory(Provider<CashFreeRepository> cashFreeRepositoryProvider) {
    this.cashFreeRepositoryProvider = cashFreeRepositoryProvider;
  }

  @Override
  public CashFreeUseCase get() {
    return newInstance(cashFreeRepositoryProvider.get());
  }

  public static CashFreeUseCase_Factory create(
      Provider<CashFreeRepository> cashFreeRepositoryProvider) {
    return new CashFreeUseCase_Factory(cashFreeRepositoryProvider);
  }

  public static CashFreeUseCase newInstance(CashFreeRepository cashFreeRepository) {
    return new CashFreeUseCase(cashFreeRepository);
  }
}
