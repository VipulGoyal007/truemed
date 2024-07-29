package com.intellihealth.truemeds.data.utils;

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
public final class ApiCallInitClass_Factory implements Factory<ApiCallInitClass> {
  private final Provider<SdkEventUseCase> sdkEventUseCaseProvider;

  public ApiCallInitClass_Factory(Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    this.sdkEventUseCaseProvider = sdkEventUseCaseProvider;
  }

  @Override
  public ApiCallInitClass get() {
    return newInstance(sdkEventUseCaseProvider.get());
  }

  public static ApiCallInitClass_Factory create(Provider<SdkEventUseCase> sdkEventUseCaseProvider) {
    return new ApiCallInitClass_Factory(sdkEventUseCaseProvider);
  }

  public static ApiCallInitClass newInstance(SdkEventUseCase sdkEventUseCase) {
    return new ApiCallInitClass(sdkEventUseCase);
  }
}
