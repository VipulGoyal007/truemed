package com.intellihealth.truemeds.presentation.listener;

public interface EventHandler<V> {
    void onEventUnHandled(V object);
}