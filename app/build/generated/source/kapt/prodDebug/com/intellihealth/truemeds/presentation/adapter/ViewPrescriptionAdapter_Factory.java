package com.intellihealth.truemeds.presentation.adapter;

import android.content.Context;
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
public final class ViewPrescriptionAdapter_Factory implements Factory<ViewPrescriptionAdapter> {
  private final Provider<List<String>> listProvider;

  private final Provider<ViewPrescriptionCallback> callbackProvider;

  private final Provider<Context> contextProvider;

  private final Provider<Integer> indexProvider;

  private final Provider<Boolean> isFromPDPageProvider;

  private final Provider<String> titleProvider;

  public ViewPrescriptionAdapter_Factory(Provider<List<String>> listProvider,
      Provider<ViewPrescriptionCallback> callbackProvider, Provider<Context> contextProvider,
      Provider<Integer> indexProvider, Provider<Boolean> isFromPDPageProvider,
      Provider<String> titleProvider) {
    this.listProvider = listProvider;
    this.callbackProvider = callbackProvider;
    this.contextProvider = contextProvider;
    this.indexProvider = indexProvider;
    this.isFromPDPageProvider = isFromPDPageProvider;
    this.titleProvider = titleProvider;
  }

  @Override
  public ViewPrescriptionAdapter get() {
    return newInstance(listProvider.get(), callbackProvider.get(), contextProvider.get(), indexProvider.get(), isFromPDPageProvider.get(), titleProvider.get());
  }

  public static ViewPrescriptionAdapter_Factory create(Provider<List<String>> listProvider,
      Provider<ViewPrescriptionCallback> callbackProvider, Provider<Context> contextProvider,
      Provider<Integer> indexProvider, Provider<Boolean> isFromPDPageProvider,
      Provider<String> titleProvider) {
    return new ViewPrescriptionAdapter_Factory(listProvider, callbackProvider, contextProvider, indexProvider, isFromPDPageProvider, titleProvider);
  }

  public static ViewPrescriptionAdapter newInstance(List<String> list,
      ViewPrescriptionCallback callback, Context context, int index, boolean isFromPDPage,
      String title) {
    return new ViewPrescriptionAdapter(list, callback, context, index, isFromPDPage, title);
  }
}
