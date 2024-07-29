package com.intellihealth.truemeds.presentation.utils;

/**
 * Delegate for performing view binding in an AppCompatActivity.
 * Manages the lifecycle of the bound view.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0005B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0096\u0002\u00a2\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "T", "Landroidx/viewbinding/ViewBinding;", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/lifecycle/LifecycleEventObserver;", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "(Lkotlin/jvm/functions/Function1;)V", "binding", "Landroidx/viewbinding/ViewBinding;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "createBinding", "activity", "(Landroidx/appcompat/app/AppCompatActivity;)Landroidx/viewbinding/ViewBinding;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "onStateChanged", "", "source", "event", "Landroidx/lifecycle/Lifecycle$Event;", "app_stageAndroidDebug"})
public final class ActivityViewBindingDelegate<T extends androidx.viewbinding.ViewBinding> implements kotlin.properties.ReadOnlyProperty<androidx.appcompat.app.AppCompatActivity, T>, androidx.lifecycle.LifecycleEventObserver {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<android.view.LayoutInflater, T> bindingInflater = null;
    @org.jetbrains.annotations.Nullable()
    private T binding;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LifecycleOwner lifecycleOwner;
    
    public ActivityViewBindingDelegate(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.LayoutInflater, ? extends T> bindingInflater) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public T getValue(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    @java.lang.Override()
    public void onStateChanged(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner source, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle.Event event) {
    }
    
    private final T createBinding(androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
}