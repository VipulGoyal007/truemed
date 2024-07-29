package com.intellihealth.truemeds.presentation.pref;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class SharedPrefStorageInitialize {
    private final SharedPreferences sharedPreferences;

    public SharedPrefStorageInitialize(Context context, String prefName) {
        sharedPreferences = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
    }

    SharedPreferences getPrefs() {
        return sharedPreferences;
    }

    public void clearPrefs() {
        SharedPreferences.Editor editor = getPrefs().edit();
        editor.clear();
        editor.commit();
    }

    public void removeKey(String key) {
        getPrefs().edit().remove(key).commit();
    }

    public boolean containsKey(String key) {
        return getPrefs().contains(key);
    }

    public String getString(String key, String defValue) {
        return getPrefs().getString(key, defValue);
    }

    public String getString(String key) {
        return getString(key, null);
    }

    public void setString(String key, String value) {
        getPrefs().edit().putString(key, value).apply();
    }

    public boolean setStringSync(String key, String value) {
        return getPrefs().edit().putString(key, value).commit();
    }

    public int getInt(String key, int defValue) {
        return getPrefs().getInt(key, defValue);
    }

    public float getFloat(String key, float defValue) {
        try {
            return getPrefs().getFloat(key, defValue);
        } catch (Exception ignore) {
            return 0;
        }
    }

    public int getInt(String key) {
        return getInt(key, 0);
    }

    public int getInteger(String key) {
        return getInt(key, 0);
    }

    public void setInt(String key, int value) {
        getPrefs().edit().putInt(key, value).apply();
    }

    public void setFloat(String key, float value) {
        getPrefs().edit().putFloat(key, value).apply();
    }

    public long getLong(String key, long defValue) {
        return getPrefs().getLong(key, defValue);
    }

    public void setList(String key, Set<String> listData) {
        getPrefs().edit().putStringSet(key, listData).commit();
    }

    public Set<String> getSetData(String key) {
        return getPrefs().getStringSet(key, new HashSet<String>());
    }

    public long getLong(String key) {
        return getLong(key, 0L);
    }

    public void setLong(String key, long value) {
        getPrefs().edit().putLong(key, value).apply();
    }

    public boolean getBoolean(String key, boolean defValue) {
        return getPrefs().getBoolean(key, defValue);
    }

    public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }

    public void setBoolean(String key, boolean value) {
        getPrefs().edit().putBoolean(key, value).apply();
    }

    public float getFloat(String key) {
        return getPrefs().getFloat(key, 0f);
//        return getFloat(key, 0f);
    }

    /*private float getFloat(String key, float defValue) {
        return getFloat(key, defValue);
    }*/

    public void setFloat(String key, Float value) {
        getPrefs().edit().putFloat(key, value).apply();
    }

    public SharedPreferences.Editor getEditor() {
        return getPrefs().edit();
    }
}