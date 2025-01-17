package com.intellihealth.truemeds.presentation.utils;

public class Event<T> {

    private final T mContent;
    private boolean hasBeenHandled = false;

    public Event(T content) {
        if (content == null) {
            throw new IllegalArgumentException("null values in Event are not allowed.");
        }
        mContent = content;
    }

    public T getContentIfNotHandled() {
        if (hasBeenHandled) {
            return null;
        } else {
            hasBeenHandled = true;
            return mContent;
        }
    }

    public T peekContent() {
        return mContent;
    }

    public boolean hasBeenHandled() {
        return hasBeenHandled;
    }
}