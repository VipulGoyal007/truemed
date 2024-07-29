package com.intellihealth.truemeds.presentation.adapter;

import android.content.Context;
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo;
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
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
public final class RxPrescriptionAdapter_Factory implements Factory<RxPrescriptionAdapter> {
  private final Provider<List<OrderRxInfo>> listProvider;

  private final Provider<ViewPrescriptionCallback> callbackProvider;

  private final Provider<Context> contextProvider;

  private final Provider<Integer> indexProvider;

  public RxPrescriptionAdapter_Factory(Provider<List<OrderRxInfo>> listProvider,
      Provider<ViewPrescriptionCallback> callbackProvider, Provider<Context> contextProvider,
      Provider<Integer> indexProvider) {
    this.listProvider = listProvider;
    this.callbackProvider = callbackProvider;
    this.contextProvider = contextProvider;
    this.indexProvider = indexProvider;
  }

  @Override
  public RxPrescriptionAdapter get() {
    return newInstance(listProvider.get(), callbackProvider.get(), contextProvider.get(), indexProvider.get());
  }

  public static RxPrescriptionAdapter_Factory create(Provider<List<OrderRxInfo>> listProvider,
      Provider<ViewPrescriptionCallback> callbackProvider, Provider<Context> contextProvider,
      Provider<Integer> indexProvider) {
    return new RxPrescriptionAdapter_Factory(listProvider, callbackProvider, contextProvider, indexProvider);
  }

  public static RxPrescriptionAdapter newInstance(List<OrderRxInfo> list,
      ViewPrescriptionCallback callback, Context context, int index) {
    return new RxPrescriptionAdapter(list, callback, context, index);
  }
}
