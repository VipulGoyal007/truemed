package com.intellihealth.truemeds.presentation.listner;

public interface EventHandler<V> {
    void onEventUnHandled(V object);
}