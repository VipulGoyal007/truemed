package com.intellihealth.truemeds.data.model.orderflow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\'B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u00c6\u0003JK\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013\u00a8\u0006("}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel;", "", "rating", "", "ratingName", "", "ratingReasonHeader", "remarks", "ratingReasonsList", "", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel$RatingReasonDataModel;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getRating", "()I", "setRating", "(I)V", "getRatingName", "()Ljava/lang/String;", "setRatingName", "(Ljava/lang/String;)V", "getRatingReasonHeader", "setRatingReasonHeader", "getRatingReasonsList", "()Ljava/util/List;", "setRatingReasonsList", "(Ljava/util/List;)V", "getRemarks", "setRemarks", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "RatingReasonDataModel", "app_prodDebug"})
public final class SaveRatingDetailsRequestDataModel {
    private int rating;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ratingName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ratingReasonHeader;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String remarks;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel.RatingReasonDataModel> ratingReasonsList;
    
    public SaveRatingDetailsRequestDataModel(int rating, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingName, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingReasonHeader, @org.jetbrains.annotations.Nullable()
    java.lang.String remarks, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel.RatingReasonDataModel> ratingReasonsList) {
        super();
    }
    
    public final int getRating() {
        return 0;
    }
    
    public final void setRating(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingName() {
        return null;
    }
    
    public final void setRatingName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRatingReasonHeader() {
        return null;
    }
    
    public final void setRatingReasonHeader(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    public final void setRemarks(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel.RatingReasonDataModel> getRatingReasonsList() {
        return null;
    }
    
    public final void setRatingReasonsList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel.RatingReasonDataModel> p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel.RatingReasonDataModel> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel copy(int rating, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingName, @org.jetbrains.annotations.Nullable()
    java.lang.String ratingReasonHeader, @org.jetbrains.annotations.Nullable()
    java.lang.String remarks, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel.RatingReasonDataModel> ratingReasonsList) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003JA\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/intellihealth/truemeds/data/model/orderflow/SaveRatingDetailsRequestDataModel$RatingReasonDataModel;", "", "reasonName", "", "activeUrl", "inactiveUrl", "reasonPlacementPosition", "", "reasonId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getActiveUrl", "()Ljava/lang/String;", "setActiveUrl", "(Ljava/lang/String;)V", "getInactiveUrl", "setInactiveUrl", "getReasonId", "()I", "setReasonId", "(I)V", "getReasonName", "setReasonName", "getReasonPlacementPosition", "setReasonPlacementPosition", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_prodDebug"})
    public static final class RatingReasonDataModel {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String reasonName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String activeUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String inactiveUrl;
        private int reasonPlacementPosition;
        private int reasonId;
        
        public RatingReasonDataModel(@org.jetbrains.annotations.Nullable()
        java.lang.String reasonName, @org.jetbrains.annotations.Nullable()
        java.lang.String activeUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String inactiveUrl, int reasonPlacementPosition, int reasonId) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReasonName() {
            return null;
        }
        
        public final void setReasonName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getActiveUrl() {
            return null;
        }
        
        public final void setActiveUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getInactiveUrl() {
            return null;
        }
        
        public final void setInactiveUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final int getReasonPlacementPosition() {
            return 0;
        }
        
        public final void setReasonPlacementPosition(int p0) {
        }
        
        public final int getReasonId() {
            return 0;
        }
        
        public final void setReasonId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel.RatingReasonDataModel copy(@org.jetbrains.annotations.Nullable()
        java.lang.String reasonName, @org.jetbrains.annotations.Nullable()
        java.lang.String activeUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String inactiveUrl, int reasonPlacementPosition, int reasonId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}