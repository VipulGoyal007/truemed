package com.intellihealth.truemeds.presentation.activity;

import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class OrderStatusActivity_MembersInjector implements MembersInjector<OrderStatusActivity> {
  private final Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider;

  public OrderStatusActivity_MembersInjector(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    this.firebaseEventUseCaseProvider = firebaseEventUseCaseProvider;
  }

  public static MembersInjector<OrderStatusActivity> create(
      Provider<FirebaseEventUseCase> firebaseEventUseCaseProvider) {
    return new OrderStatusActivity_MembersInjector(firebaseEventUseCaseProvider);
  }

  @Override
  public void injectMembers(OrderStatusActivity instance) {
    injectFirebaseEventUseCase(instance, firebaseEventUseCaseProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.activity.OrderStatusActivity.firebaseEventUseCase")
  public static void injectFirebaseEventUseCase(OrderStatusActivity instance,
      FirebaseEventUseCase firebaseEventUseCase) {
    instance.firebaseEventUseCase = firebaseEventUseCase;
  }
}
