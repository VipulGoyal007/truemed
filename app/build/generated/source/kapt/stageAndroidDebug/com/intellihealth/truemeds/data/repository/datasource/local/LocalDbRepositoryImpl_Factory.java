package com.intellihealth.truemeds.data.repository.datasource.local;

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
public final class LocalDbRepositoryImpl_Factory implements Factory<LocalDbRepositoryImpl> {
  private final Provider<TruemedsDao> appDaoProvider;

  public LocalDbRepositoryImpl_Factory(Provider<TruemedsDao> appDaoProvider) {
    this.appDaoProvider = appDaoProvider;
  }

  @Override
  public LocalDbRepositoryImpl get() {
    return newInstance(appDaoProvider.get());
  }

  public static LocalDbRepositoryImpl_Factory create(Provider<TruemedsDao> appDaoProvider) {
    return new LocalDbRepositoryImpl_Factory(appDaoProvider);
  }

  public static LocalDbRepositoryImpl newInstance(TruemedsDao appDao) {
    return new LocalDbRepositoryImpl(appDao);
  }
}
