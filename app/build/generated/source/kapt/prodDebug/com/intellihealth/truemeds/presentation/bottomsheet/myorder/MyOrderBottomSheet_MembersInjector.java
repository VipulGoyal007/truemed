package com.intellihealth.truemeds.presentation.bottomsheet.myorder;

import androidx.lifecycle.ViewModelProvider;
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
public final class MyOrderBottomSheet_MembersInjector implements MembersInjector<MyOrderBottomSheet> {
  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public MyOrderBottomSheet_MembersInjector(Provider<ViewModelProvider.Factory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<MyOrderBottomSheet> create(
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return new MyOrderBottomSheet_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(MyOrderBottomSheet instance) {
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("com.intellihealth.truemeds.presentation.bottomsheet.myorder.MyOrderBottomSheet.factory")
  public static void injectFactory(MyOrderBottomSheet instance, ViewModelProvider.Factory factory) {
    instance.factory = factory;
  }
}
