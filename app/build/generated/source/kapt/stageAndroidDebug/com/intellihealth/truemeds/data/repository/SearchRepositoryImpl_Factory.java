package com.intellihealth.truemeds.data.repository;

import com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao;
import com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource;
import com.intellihealth.truemeds.data.utils.ApiCallInitClass;
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
public final class SearchRepositoryImpl_Factory implements Factory<SearchRepositoryImpl> {
  private final Provider<TruemedsDao> appDaoProvider;

  private final Provider<ElasticMedicineRemoteDataSource> elasticMedicineRemoteDataSourceProvider;

  private final Provider<ApiCallInitClass> apiCallInitClassProvider;

  public SearchRepositoryImpl_Factory(Provider<TruemedsDao> appDaoProvider,
      Provider<ElasticMedicineRemoteDataSource> elasticMedicineRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    this.appDaoProvider = appDaoProvider;
    this.elasticMedicineRemoteDataSourceProvider = elasticMedicineRemoteDataSourceProvider;
    this.apiCallInitClassProvider = apiCallInitClassProvider;
  }

  @Override
  public SearchRepositoryImpl get() {
    return newInstance(appDaoProvider.get(), elasticMedicineRemoteDataSourceProvider.get(), apiCallInitClassProvider.get());
  }

  public static SearchRepositoryImpl_Factory create(Provider<TruemedsDao> appDaoProvider,
      Provider<ElasticMedicineRemoteDataSource> elasticMedicineRemoteDataSourceProvider,
      Provider<ApiCallInitClass> apiCallInitClassProvider) {
    return new SearchRepositoryImpl_Factory(appDaoProvider, elasticMedicineRemoteDataSourceProvider, apiCallInitClassProvider);
  }

  public static SearchRepositoryImpl newInstance(TruemedsDao appDao,
      ElasticMedicineRemoteDataSource elasticMedicineRemoteDataSource,
      ApiCallInitClass apiCallInitClass) {
    return new SearchRepositoryImpl(appDao, elasticMedicineRemoteDataSource, apiCallInitClass);
  }
}
