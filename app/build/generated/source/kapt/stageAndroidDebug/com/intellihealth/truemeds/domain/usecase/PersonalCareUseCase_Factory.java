package com.intellihealth.truemeds.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class PersonalCareUseCase_Factory implements Factory<PersonalCareUseCase> {
  @Override
  public PersonalCareUseCase get() {
    return newInstance();
  }

  public static PersonalCareUseCase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PersonalCareUseCase newInstance() {
    return new PersonalCareUseCase();
  }

  private static final class InstanceHolder {
    private static final PersonalCareUseCase_Factory INSTANCE = new PersonalCareUseCase_Factory();
  }
}
