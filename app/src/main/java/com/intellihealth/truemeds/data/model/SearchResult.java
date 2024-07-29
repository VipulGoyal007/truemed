package com.intellihealth.truemeds.data.model;



public class SearchResult {

    String name;
    String productCode;
    int iconType;
    boolean showHistoryIcon;
    String keyName, keyValue = "";

    String productImage;

    String drugType;

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getName() {
        //return CommonFunc.toTitleCase(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIconType() {
        return iconType;
    }

    public void setIconType(int iconType) {
        this.iconType = iconType;
    }

    public boolean isShowHistoryIcon() {
        return showHistoryIcon;
    }

    public void setShowHistoryIcon(boolean showHistoryIcon) {
        this.showHistoryIcon = showHistoryIcon;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }
}