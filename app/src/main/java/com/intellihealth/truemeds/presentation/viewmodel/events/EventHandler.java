package com.intellihealth.truemeds.presentation.viewmodel.events;

public interface EventHandler<V> {
    void onEventUnHandled(V object);
}