package com.intellihealth.truemeds.data.model;

public class KeyValuePair {
    private String key;
    private String strVal;
    private int intVal;
    private boolean booleanVal;

    public KeyValuePair(String key, String strVal) {
        this.key = key;
        this.strVal = strVal;
    }

    public KeyValuePair(String key, int intVal) {
        this.key = key;
        this.intVal = intVal;
    }

    public KeyValuePair(String key, boolean booleanVal) {
        this.key = key;
        this.booleanVal = booleanVal;
    }

    public String getKey() {
        return key;
    }

    public String getStrVal() {
        return strVal;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setStrVal(String strVal) {
        this.strVal = strVal;
    }

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public boolean isBooleanVal() {
        return booleanVal;
    }

    public void setBooleanVal(boolean booleanVal) {
        this.booleanVal = booleanVal;
    }
}