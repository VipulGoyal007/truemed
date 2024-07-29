package com.intellihealth.truemeds.presentation.stickyscrollview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/stickyscrollview/IStickyScrollPresentation;", "", "currentScrollYPos", "", "getCurrentScrollYPos", "()I", "freeFooter", "", "freeHeader", "initFooterView", "id", "initHeaderView", "stickFooter", "translationY", "stickHeader", "app_prodDebug"})
public abstract interface IStickyScrollPresentation {
    
    public abstract int getCurrentScrollYPos();
    
    public abstract void freeHeader();
    
    public abstract void freeFooter();
    
    public abstract void stickHeader(int translationY);
    
    public abstract void stickFooter(int translationY);
    
    public abstract void initHeaderView(int id);
    
    public abstract void initFooterView(int id);
}