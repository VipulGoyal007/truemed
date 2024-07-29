package com.intellihealth.truemeds.di;

import android.content.Context;
import com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RoomDbModule_ProvideAppDaoFactory implements Factory<TruemedsDao> {
  private final RoomDbModule module;

  private final Provider<Context> contextProvider;

  public RoomDbModule_ProvideAppDaoFactory(RoomDbModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public TruemedsDao get() {
    return provideAppDao(module, contextProvider.get());
  }

  public static RoomDbModule_ProvideAppDaoFactory create(RoomDbModule module,
      Provider<Context> contextProvider) {
    return new RoomDbModule_ProvideAppDaoFactory(module, contextProvider);
  }

  public static TruemedsDao provideAppDao(RoomDbModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDao(context));
  }
}
