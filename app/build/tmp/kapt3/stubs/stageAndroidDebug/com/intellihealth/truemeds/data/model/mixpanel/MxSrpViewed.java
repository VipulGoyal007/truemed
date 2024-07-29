package com.intellihealth.truemeds.data.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006H\u00c6\u0003J\u0013\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u008a\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00062\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u000bH\u00d6\u0001J\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000108J\u0006\u00109\u001a\u00020:J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R(\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012\u00a8\u0006<"}, d2 = {"Lcom/intellihealth/truemeds/data/model/mixpanel/MxSrpViewed;", "", "clickedSuggestionType", "", "qc", "resultList", "", "resultsViewed", "rt", "suggestionTermClicked", "suggestionTermClickedPosition", "", "termSearched", "whId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getClickedSuggestionType", "()Ljava/lang/String;", "setClickedSuggestionType", "(Ljava/lang/String;)V", "getQc", "setQc", "getResultList", "()Ljava/util/List;", "setResultList", "(Ljava/util/List;)V", "getResultsViewed", "setResultsViewed", "getRt", "setRt", "getSuggestionTermClicked", "setSuggestionTermClicked", "getSuggestionTermClickedPosition", "()Ljava/lang/Integer;", "setSuggestionTermClickedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTermSearched", "setTermSearched", "getWhId", "setWhId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/mixpanel/MxSrpViewed;", "equals", "", "other", "hashCode", "toAppsFlyer", "", "toCleverTap", "Lcom/intellihealth/truemeds/presentation/analytics/model/clevertap/CtSrpViewed;", "toString", "app_stageAndroidDebug"})
public final class MxSrpViewed {
    @com.google.gson.annotations.SerializedName(value = "clicked_suggestion_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedSuggestionType;
    @com.google.gson.annotations.SerializedName(value = "_qc")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String qc;
    @com.google.gson.annotations.SerializedName(value = "result_list")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> resultList;
    @com.google.gson.annotations.SerializedName(value = "results_viewed")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> resultsViewed;
    @com.google.gson.annotations.SerializedName(value = "_rt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rt;
    @com.google.gson.annotations.SerializedName(value = "suggestion_term_clicked")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestionTermClicked;
    @com.google.gson.annotations.SerializedName(value = "suggestion_term_clicked_position")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer suggestionTermClickedPosition;
    @com.google.gson.annotations.SerializedName(value = "term_searched")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String termSearched;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    
    public MxSrpViewed(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> resultList, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> resultsViewed, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.Integer suggestionTermClickedPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedSuggestionType() {
        return null;
    }
    
    public final void setClickedSuggestionType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQc() {
        return null;
    }
    
    public final void setQc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getResultList() {
        return null;
    }
    
    public final void setResultList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getResultsViewed() {
        return null;
    }
    
    public final void setResultsViewed(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRt() {
        return null;
    }
    
    public final void setRt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuggestionTermClicked() {
        return null;
    }
    
    public final void setSuggestionTermClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSuggestionTermClickedPosition() {
        return null;
    }
    
    public final void setSuggestionTermClickedPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTermSearched() {
        return null;
    }
    
    public final void setTermSearched(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> toAppsFlyer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtSrpViewed toCleverTap() {
        return null;
    }
    
    public MxSrpViewed() {
        super();
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
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxSrpViewed copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> resultList, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> resultsViewed, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.Integer suggestionTermClickedPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.String whId) {
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