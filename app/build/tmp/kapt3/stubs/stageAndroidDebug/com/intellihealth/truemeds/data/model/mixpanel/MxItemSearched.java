package com.intellihealth.truemeds.data.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b@\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0010\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u0010I\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00ca\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\u00072\b\u0010S\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010T\u001a\u00020\u0005H\u00d6\u0001J\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010VJ\u0006\u0010W\u001a\u00020XJ\t\u0010Y\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b\'\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010#\"\u0004\b(\u0010%R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010=\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0018\"\u0004\b?\u0010\u001a\u00a8\u0006Z"}, d2 = {"Lcom/intellihealth/truemeds/data/model/mixpanel/MxItemSearched;", "", "clickedSuggestionType", "", "clickedSuggestionsPosition", "", "didYouMeanTriggered", "", "exitAction", "isPreviouslyViewed", "qc", "resultFoundCount", "rt", "suggestionTermClicked", "termSearched", "termSearchedCharCount", "timeTaken", "whId", "pastSearchTermClicked", "clickedPastSearchType", "timestamp", "", "(Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getClickedPastSearchType", "()Ljava/lang/String;", "setClickedPastSearchType", "(Ljava/lang/String;)V", "getClickedSuggestionType", "setClickedSuggestionType", "getClickedSuggestionsPosition", "()Ljava/lang/Integer;", "setClickedSuggestionsPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDidYouMeanTriggered", "()Z", "setDidYouMeanTriggered", "(Z)V", "getExitAction", "setExitAction", "setPreviouslyViewed", "getPastSearchTermClicked", "setPastSearchTermClicked", "getQc", "setQc", "getResultFoundCount", "setResultFoundCount", "getRt", "setRt", "getSuggestionTermClicked", "setSuggestionTermClicked", "getTermSearched", "setTermSearched", "getTermSearchedCharCount", "setTermSearchedCharCount", "getTimeTaken", "setTimeTaken", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getWhId", "setWhId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/intellihealth/truemeds/data/model/mixpanel/MxItemSearched;", "equals", "other", "hashCode", "toAppsFlyer", "", "toCleverTap", "Lcom/intellihealth/truemeds/data/model/clevertap/CtItemSearched;", "toString", "app_stageAndroidDebug"})
public final class MxItemSearched {
    @com.google.gson.annotations.SerializedName(value = "clicked_suggestion_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedSuggestionType;
    @com.google.gson.annotations.SerializedName(value = "clicked_suggestions_position")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer clickedSuggestionsPosition;
    @com.google.gson.annotations.SerializedName(value = "did_you_mean_triggered")
    private boolean didYouMeanTriggered;
    @com.google.gson.annotations.SerializedName(value = "exit_action")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String exitAction;
    @com.google.gson.annotations.SerializedName(value = "is_previously_viewed")
    private boolean isPreviouslyViewed;
    @com.google.gson.annotations.SerializedName(value = "_qc")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String qc;
    @com.google.gson.annotations.SerializedName(value = "result_found_count")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer resultFoundCount;
    @com.google.gson.annotations.SerializedName(value = "_rt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rt;
    @com.google.gson.annotations.SerializedName(value = "suggestion_term_clicked")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestionTermClicked;
    @com.google.gson.annotations.SerializedName(value = "term_searched")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String termSearched;
    @com.google.gson.annotations.SerializedName(value = "term_searched_char_count")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer termSearchedCharCount;
    @com.google.gson.annotations.SerializedName(value = "time_taken")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer timeTaken;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    @com.google.gson.annotations.SerializedName(value = "past_search_term_clicked")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pastSearchTermClicked;
    @com.google.gson.annotations.SerializedName(value = "clicked_past_search_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedPastSearchType;
    @com.google.gson.annotations.SerializedName(value = "$mp_api_timestamp_ms")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long timestamp;
    
    public MxItemSearched(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer clickedSuggestionsPosition, boolean didYouMeanTriggered, @org.jetbrains.annotations.Nullable()
    java.lang.String exitAction, boolean isPreviouslyViewed, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultFoundCount, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.Integer termSearchedCharCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer timeTaken, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String pastSearchTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedPastSearchType, @org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp) {
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
    public final java.lang.Integer getClickedSuggestionsPosition() {
        return null;
    }
    
    public final void setClickedSuggestionsPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getDidYouMeanTriggered() {
        return false;
    }
    
    public final void setDidYouMeanTriggered(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExitAction() {
        return null;
    }
    
    public final void setExitAction(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isPreviouslyViewed() {
        return false;
    }
    
    public final void setPreviouslyViewed(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQc() {
        return null;
    }
    
    public final void setQc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getResultFoundCount() {
        return null;
    }
    
    public final void setResultFoundCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
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
    public final java.lang.String getTermSearched() {
        return null;
    }
    
    public final void setTermSearched(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Integer getTimeTaken() {
        return null;
    }
    
    public final void setTimeTaken(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPastSearchTermClicked() {
        return null;
    }
    
    public final void setPastSearchTermClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedPastSearchType() {
        return null;
    }
    
    public final void setClickedPastSearchType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTimestamp() {
        return null;
    }
    
    public final void setTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.clevertap.CtItemSearched toCleverTap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> toAppsFlyer() {
        return null;
    }
    
    public MxItemSearched() {
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
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
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
    public final com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer clickedSuggestionsPosition, boolean didYouMeanTriggered, @org.jetbrains.annotations.Nullable()
    java.lang.String exitAction, boolean isPreviouslyViewed, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultFoundCount, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.Integer termSearchedCharCount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer timeTaken, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String pastSearchTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedPastSearchType, @org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp) {
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