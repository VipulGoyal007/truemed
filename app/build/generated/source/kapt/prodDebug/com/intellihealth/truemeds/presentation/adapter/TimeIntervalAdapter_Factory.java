package com.intellihealth.truemeds.presentation.adapter;

import android.content.Context;
import com.intellihealth.truemeds.data.callback.TimeIntervalCallback;
import com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel;
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
public final class TimeIntervalAdapter_Factory implements Factory<TimeIntervalAdapter> {
  private final Provider<String> selectedCustomDateProvider;

  private final Provider<List<TimeIntervalBottomSheetModel>> listProvider;

  private final Provider<Context> contextProvider;

  private final Provider<TimeIntervalCallback> customDateCallbackProvider;

  public TimeIntervalAdapter_Factory(Provider<String> selectedCustomDateProvider,
      Provider<List<TimeIntervalBottomSheetModel>> listProvider, Provider<Context> contextProvider,
      Provider<TimeIntervalCallback> customDateCallbackProvider) {
    this.selectedCustomDateProvider = selectedCustomDateProvider;
    this.listProvider = listProvider;
    this.contextProvider = contextProvider;
    this.customDateCallbackProvider = customDateCallbackProvider;
  }

  @Override
  public TimeIntervalAdapter get() {
    return newInstance(selectedCustomDateProvider.get(), listProvider.get(), contextProvider.get(), customDateCallbackProvider.get());
  }

  public static TimeIntervalAdapter_Factory create(Provider<String> selectedCustomDateProvider,
      Provider<List<TimeIntervalBottomSheetModel>> listProvider, Provider<Context> contextProvider,
      Provider<TimeIntervalCallback> customDateCallbackProvider) {
    return new TimeIntervalAdapter_Factory(selectedCustomDateProvider, listProvider, contextProvider, customDateCallbackProvider);
  }

  public static TimeIntervalAdapter newInstance(String selectedCustomDate,
      List<TimeIntervalBottomSheetModel> list, Context context,
      TimeIntervalCallback customDateCallback) {
    return new TimeIntervalAdapter(selectedCustomDate, list, context, customDateCallback);
  }
}
