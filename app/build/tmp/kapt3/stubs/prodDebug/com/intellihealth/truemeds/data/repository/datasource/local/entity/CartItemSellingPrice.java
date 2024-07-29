package com.intellihealth.truemeds.data.repository.datasource.local.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartItemSellingPrice;", "", "productCode", "", "sellingPrice", "", "(Ljava/lang/String;D)V", "getProductCode", "()Ljava/lang/String;", "getSellingPrice", "()D", "app_prodDebug"})
@androidx.room.Entity(tableName = "cart_item_price")
public final class CartItemSellingPrice {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "productCode")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productCode = null;
    @androidx.room.ColumnInfo(name = "sellingPrice")
    private final double sellingPrice = 0.0;
    
    public CartItemSellingPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, double sellingPrice) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductCode() {
        return null;
    }
    
    public final double getSellingPrice() {
        return 0.0;
    }
}