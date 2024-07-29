package com.intellihealth.truemeds.data.model.helpfaqtnc;

/**
 * This is used to both help category and details of help category for customer
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u00c6\u0003J?\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse;", "", "message", "", "statusValue", "statusCode", "", "responseData", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse$CategoryList;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getResponseData", "()Ljava/util/List;", "setResponseData", "(Ljava/util/List;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "getStatusValue", "setStatusValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "CategoryList", "app_prodDebug"})
public final class HelpCategoryResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String statusValue;
    private int statusCode;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> responseData;
    
    public HelpCategoryResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> responseData) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatusValue() {
        return null;
    }
    
    public final void setStatusValue(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    public final void setStatusCode(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> getResponseData() {
        return null;
    }
    
    public final void setResponseData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String statusValue, int statusCode, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> responseData) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\nH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010\'\u001a\u00020\u000eH\u00c6\u0003J\u0080\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001b\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013\u00a8\u0006."}, d2 = {"Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse$CategoryList;", "", "categoryId", "", "categoryName", "", "description", "icon", "answers", "helpCategoryDetailsDTOs", "", "issues", "issuesId", "isFilterApplied", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getAnswers", "()Ljava/lang/String;", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCategoryName", "getDescription", "getHelpCategoryDetailsDTOs", "()Ljava/util/List;", "getIcon", "()Z", "setFilterApplied", "(Z)V", "getIssues", "getIssuesId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/intellihealth/truemeds/data/model/helpfaqtnc/HelpCategoryResponse$CategoryList;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
    public static final class CategoryList {
        
        /**
         * This is used for fetching next level category
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer categoryId = null;
        
        /**
         * This is used for showing category name
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String categoryName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String icon = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String answers = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> helpCategoryDetailsDTOs = null;
        
        /**
         * This is used for showing details of help category
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String issues = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer issuesId = null;
        private boolean isFilterApplied;
        
        public CategoryList(@org.jetbrains.annotations.Nullable()
        java.lang.Integer categoryId, @org.jetbrains.annotations.Nullable()
        java.lang.String categoryName, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String icon, @org.jetbrains.annotations.Nullable()
        java.lang.String answers, @org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> helpCategoryDetailsDTOs, @org.jetbrains.annotations.Nullable()
        java.lang.String issues, @org.jetbrains.annotations.Nullable()
        java.lang.Integer issuesId, boolean isFilterApplied) {
            super();
        }
        
        /**
         * This is used for fetching next level category
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCategoryId() {
            return null;
        }
        
        /**
         * This is used for showing category name
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCategoryName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAnswers() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> getHelpCategoryDetailsDTOs() {
            return null;
        }
        
        /**
         * This is used for showing details of help category
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIssues() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getIssuesId() {
            return null;
        }
        
        public final boolean isFilterApplied() {
            return false;
        }
        
        public final void setFilterApplied(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        public final boolean component9() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer categoryId, @org.jetbrains.annotations.Nullable()
        java.lang.String categoryName, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String icon, @org.jetbrains.annotations.Nullable()
        java.lang.String answers, @org.jetbrains.annotations.Nullable()
        java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse.CategoryList> helpCategoryDetailsDTOs, @org.jetbrains.annotations.Nullable()
        java.lang.String issues, @org.jetbrains.annotations.Nullable()
        java.lang.Integer issuesId, boolean isFilterApplied) {
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