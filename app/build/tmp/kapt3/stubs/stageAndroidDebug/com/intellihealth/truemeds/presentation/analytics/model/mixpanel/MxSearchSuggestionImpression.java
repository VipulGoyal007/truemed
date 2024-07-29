package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b8\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010:\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010;\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00103J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010@\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010A\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00aa\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\bH\u00d6\u0001J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\u0010\u0010!\"\u0004\b\"\u0010#R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\u000e\u0010!\"\u0004\b%\u0010#R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b\'\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u0006J"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxSearchSuggestionImpression;", "", "termSearched", "", "suggestionTermClicked", "clickedSuggestionType", "exitAction", "termSearchedCharCount", "", "clickedSuggestionPosition", "resultFoundCount", "impressionType", "rt", "qc", "isRecentlySearched", "", "isPreviouslyViewed", "timeTaken", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getClickedSuggestionPosition", "()Ljava/lang/Integer;", "setClickedSuggestionPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getClickedSuggestionType", "()Ljava/lang/String;", "setClickedSuggestionType", "(Ljava/lang/String;)V", "getExitAction", "setExitAction", "getImpressionType", "setImpressionType", "()Ljava/lang/Boolean;", "setPreviouslyViewed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setRecentlySearched", "getQc", "setQc", "getResultFoundCount", "setResultFoundCount", "getRt", "setRt", "getSuggestionTermClicked", "setSuggestionTermClicked", "getTermSearched", "setTermSearched", "getTermSearchedCharCount", "setTermSearchedCharCount", "getTimeTaken", "()Ljava/lang/Long;", "setTimeTaken", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxSearchSuggestionImpression;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
public final class MxSearchSuggestionImpression {
    @com.google.gson.annotations.SerializedName(value = "term_searched")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String termSearched;
    @com.google.gson.annotations.SerializedName(value = "suggestion_term_clicked")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestionTermClicked;
    @com.google.gson.annotations.SerializedName(value = "clicked_suggestion_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedSuggestionType;
    @com.google.gson.annotations.SerializedName(value = "exit_action")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String exitAction;
    @com.google.gson.annotations.SerializedName(value = "term_searched_char_count")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer termSearchedCharCount;
    @com.google.gson.annotations.SerializedName(value = "clicked_suggestion_position")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer clickedSuggestionPosition;
    @com.google.gson.annotations.SerializedName(value = "result_found_count")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer resultFoundCount;
    @com.google.gson.annotations.SerializedName(value = "impression_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String impressionType;
    @com.google.gson.annotations.SerializedName(value = "_rt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rt;
    @com.google.gson.annotations.SerializedName(value = "_qc")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String qc;
    @com.google.gson.annotations.SerializedName(value = "is_recently_searched")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isRecentlySearched;
    @com.google.gson.annotations.SerializedName(value = "is_previously_viewed")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isPreviouslyViewed;
    @com.google.gson.annotations.SerializedName(value = "time_taken")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long timeTaken;
    
    public MxSearchSuggestionImpression(@org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.String exitAction, @org.jetbrains.annotations.Nullable()
    java.lang.Integer termSearchedCharCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer clickedSuggestionPosition, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultFoundCount, @org.jetbrains.annotations.Nullable()
    java.lang.String impressionType, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isRecentlySearched, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPreviouslyViewed, @org.jetbrains.annotations.Nullable()
    java.lang.Long timeTaken) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTermSearched() {
        return null;
    }
    
    public final void setTermSearched(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getClickedSuggestionType() {
        return null;
    }
    
    public final void setClickedSuggestionType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExitAction() {
        return null;
    }
    
    public final void setExitAction(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTermSearchedCharCount() {
        return null;
    }
    
    public final void setTermSearchedCharCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getClickedSuggestionPosition() {
        return null;
    }
    
    public final void setClickedSuggestionPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getResultFoundCount() {
        return null;
    }
    
    public final void setResultFoundCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImpressionType() {
        return null;
    }
    
    public final void setImpressionType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRt() {
        return null;
    }
    
    public final void setRt(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Boolean isRecentlySearched() {
        return null;
    }
    
    public final void setRecentlySearched(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isPreviouslyViewed() {
        return null;
    }
    
    public final void setPreviouslyViewed(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTimeTaken() {
        return null;
    }
    
    public final void setTimeTaken(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public MxSearchSuggestionImpression() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component13() {
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
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
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
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxSearchSuggestionImpression copy(@org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.String exitAction, @org.jetbrains.annotations.Nullable()
    java.lang.Integer termSearchedCharCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer clickedSuggestionPosition, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultFoundCount, @org.jetbrains.annotations.Nullable()
    java.lang.String impressionType, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isRecentlySearched, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPreviouslyViewed, @org.jetbrains.annotations.Nullable()
    java.lang.Long timeTaken) {
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