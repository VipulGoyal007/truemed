package com.intellihealth.truemeds.presentation.utils;

import androidx.lifecycle.Observer;
import org.jetbrains.annotations.NotNull;
import com.intellihealth.truemeds.presentation.listener.EventHandler;

public class EventObserver<T> implements Observer<Event<T>> {
    private EventHandler<T> onEventUnhandledContent;

    public EventObserver(@NotNull EventHandler<T> onEventUnhandledContent) {
        this.onEventUnhandledContent = onEventUnhandledContent;
    }

    @Override
    public void onChanged(Event<T> event) {
        if(event != null){
                onEventUnhandledContent.onEventUnHandled(event.getContentIfNotHandled());
        }
    }
}