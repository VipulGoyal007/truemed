package com.intellihealth.truemeds.data.model.home;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@Keep
public class fetchTruemedsContactResponse {
    @SerializedName("contactName")
    @Expose
    public String contactName;
    @SerializedName("ids")
    @Expose
    public ArrayList<Integer> ids;
    @SerializedName("contactNumber")
    @Expose
    public ArrayList<String> contactNumber;
    @SerializedName("version")
    @Expose
    public double version;
}
