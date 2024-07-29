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
public final class CartActivity_MembersInjector implements MembersInjector<CartActivity> {
  private final Provider<FirebaseEventUseCase> firebaseEventProvider;

  public CartActivity_MembersInjector(Provider<FirebaseEventUseCase> firebaseEventProvider) {
    this.firebaseEventProvider = firebaseEventProvider;
  }

  public static MembersInjector<CartActivity> create(
      Provider<FirebaseEventUseCase> firebaseEventProvider) {
    return new CartActivity_MembersInjector(firebaseEventProvider);
  }

  @Override
  public void injectMembers(CartActivity instance) {
    injectFirebaseEvent(instance, firebaseEventProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.activity.CartActivity.firebaseEvent")
  public static void injectFirebaseEvent(CartActivity instance,
      FirebaseEventUseCase firebaseEvent) {
    instance.firebaseEvent = firebaseEvent;
  }
}
