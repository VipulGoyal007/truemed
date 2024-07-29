package com.intellihealth.truemeds.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.io.File;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class OkHttpClientModule_FileFactory implements Factory<File> {
  private final OkHttpClientModule module;

  private final Provider<Context> contextProvider;

  public OkHttpClientModule_FileFactory(OkHttpClientModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public File get() {
    return file(module, contextProvider.get());
  }

  public static OkHttpClientModule_FileFactory create(OkHttpClientModule module,
      Provider<Context> contextProvider) {
    return new OkHttpClientModule_FileFactory(module, contextProvider);
  }

  public static File file(OkHttpClientModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.file(context));
  }
}
