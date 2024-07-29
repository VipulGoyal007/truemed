package com.intellihealth.truemeds.domain.enums;

@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/intellihealth/truemeds/domain/enums/OrderInState;", "", "Companion", "app_stageAndroidDebug"})
@androidx.annotation.StringDef(value = {"Active", "NonActive", "InComplete"})
public abstract @interface OrderInState {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTIVE = "Active";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NON_ACTIVE = "NonActive";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IN_COMPLETE = "InComplete";
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.domain.enums.OrderInState.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/intellihealth/truemeds/domain/enums/OrderInState$Companion;", "", "()V", "ACTIVE", "", "IN_COMPLETE", "NON_ACTIVE", "app_stageAndroidDebug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACTIVE = "Active";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NON_ACTIVE = "NonActive";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IN_COMPLETE = "InComplete";
        
        private Companion() {
            super();
        }
    }
}