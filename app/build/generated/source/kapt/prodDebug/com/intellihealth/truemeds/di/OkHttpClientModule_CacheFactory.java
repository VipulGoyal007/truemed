package com.intellihealth.truemeds.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.io.File;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Cache;

@ScopeMetadata("javax.inject.Singleton")
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
public final class OkHttpClientModule_CacheFactory implements Factory<Cache> {
  private final OkHttpClientModule module;

  private final Provider<File> cacheFileProvider;

  public OkHttpClientModule_CacheFactory(OkHttpClientModule module,
      Provider<File> cacheFileProvider) {
    this.module = module;
    this.cacheFileProvider = cacheFileProvider;
  }

  @Override
  public Cache get() {
    return cache(module, cacheFileProvider.get());
  }

  public static OkHttpClientModule_CacheFactory create(OkHttpClientModule module,
      Provider<File> cacheFileProvider) {
    return new OkHttpClientModule_CacheFactory(module, cacheFileProvider);
  }

  public static Cache cache(OkHttpClientModule instance, File cacheFile) {
    return Preconditions.checkNotNullFromProvides(instance.cache(cacheFile));
  }
}
