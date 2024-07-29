package com.intellihealth.truemeds.presentation.utils

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Delegate for performing view binding in an AppCompatActivity.
 * Manages the lifecycle of the bound view.
 */
class ActivityViewBindingDelegate<T : ViewBinding>(
    private val bindingInflater: (LayoutInflater) -> T
) : ReadOnlyProperty<AppCompatActivity, T>, LifecycleEventObserver {

    private var binding: T? = null
    private var lifecycleOwner: LifecycleOwner? = null

    override fun getValue(thisRef: AppCompatActivity, property: KProperty<*>): T {
        return binding ?: createBinding(thisRef).also {
            binding = it
            lifecycleOwner = thisRef
            lifecycleOwner?.lifecycle?.addObserver(this)
        }
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        if (event == Lifecycle.Event.ON_DESTROY && source == lifecycleOwner) {
            binding = null
            lifecycleOwner?.lifecycle?.removeObserver(this)
            lifecycleOwner = null
        }
    }

    private fun createBinding(activity: AppCompatActivity): T {
        return bindingInflater.invoke(activity.layoutInflater)
    }

}

fun <T : ViewBinding> AppCompatActivity.viewBinding(bindingInflater: (LayoutInflater) -> T)  =
    ActivityViewBindingDelegate(bindingInflater)
