package com.intellihealth.truemeds.domain.usecase;

import android.content.Context;
import com.intellihealth.truemeds.domain.repository.HelpFaqAndTnCRepository;
import com.intellihealth.truemeds.domain.repository.HomePageRepository;
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository;
import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository;
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class HomePageUseCase_Factory implements Factory<HomePageUseCase> {
  private final Provider<HomePageRepository> homePageRepositoryProvider;

  private final Provider<OrderFlowRepository> orderFlowRepositoryProvider;

  private final Provider<ProductListAndDetailsRepository> productListAndDetailsRepositoryProvider;

  private final Provider<LocalDbUseCase> dbUseCaseProvider;

  private final Provider<HelpFaqAndTnCRepository> helpFaqAndTnCRepositoryProvider;

  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  private final Provider<Context> contextProvider;

  public HomePageUseCase_Factory(Provider<HomePageRepository> homePageRepositoryProvider,
      Provider<OrderFlowRepository> orderFlowRepositoryProvider,
      Provider<ProductListAndDetailsRepository> productListAndDetailsRepositoryProvider,
      Provider<LocalDbUseCase> dbUseCaseProvider,
      Provider<HelpFaqAndTnCRepository> helpFaqAndTnCRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider, Provider<Context> contextProvider) {
    this.homePageRepositoryProvider = homePageRepositoryProvider;
    this.orderFlowRepositoryProvider = orderFlowRepositoryProvider;
    this.productListAndDetailsRepositoryProvider = productListAndDetailsRepositoryProvider;
    this.dbUseCaseProvider = dbUseCaseProvider;
    this.helpFaqAndTnCRepositoryProvider = helpFaqAndTnCRepositoryProvider;
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public HomePageUseCase get() {
    return newInstance(homePageRepositoryProvider.get(), orderFlowRepositoryProvider.get(), productListAndDetailsRepositoryProvider.get(), dbUseCaseProvider.get(), helpFaqAndTnCRepositoryProvider.get(), sdkEventUseCaseProvider.get(), contextProvider.get());
  }

  public static HomePageUseCase_Factory create(
      Provider<HomePageRepository> homePageRepositoryProvider,
      Provider<OrderFlowRepository> orderFlowRepositoryProvider,
      Provider<ProductListAndDetailsRepository> productListAndDetailsRepositoryProvider,
      Provider<LocalDbUseCase> dbUseCaseProvider,
      Provider<HelpFaqAndTnCRepository> helpFaqAndTnCRepositoryProvider,
      Provider<SdkEventUseCase> sdkEventUseCaseProvider, Provider<Context> contextProvider) {
    return new HomePageUseCase_Factory(homePageRepositoryProvider, orderFlowRepositoryProvider, productListAndDetailsRepositoryProvider, dbUseCaseProvider, helpFaqAndTnCRepositoryProvider, sdkEventUseCaseProvider, contextProvider);
  }

  public static HomePageUseCase newInstance(HomePageRepository homePageRepository,
      OrderFlowRepository orderFlowRepository,
      ProductListAndDetailsRepository productListAndDetailsRepository, LocalDbUseCase dbUseCase,
      HelpFaqAndTnCRepository helpFaqAndTnCRepository, SdkEventUseCase sdkEventUseCase,
      Context context) {
    return new HomePageUseCase(homePageRepository, orderFlowRepository, productListAndDetailsRepository, dbUseCase, helpFaqAndTnCRepository, sdkEventUseCase, context);
  }
}
