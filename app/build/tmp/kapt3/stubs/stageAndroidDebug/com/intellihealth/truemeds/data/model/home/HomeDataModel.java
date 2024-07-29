package com.intellihealth.truemeds.data.model.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0099\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010U\u001a\u00020VH\u00d6\u0001J\t\u0010W\u001a\u00020XH\u00d6\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u00a8\u0006Y"}, d2 = {"Lcom/intellihealth/truemeds/data/model/home/HomeDataModel;", "", "bannerModel", "Lcom/intellihealth/truemeds/data/model/home/BannerDataModel;", "reOrderrModel", "Lcom/intellihealth/truemeds/data/model/home/ReOrderDataModel;", "actionCardModel", "Lcom/intellihealth/truemeds/data/model/home/ActionCardDataModel;", "substituteInfoCardDataModel", "Lcom/intellihealth/truemeds/data/model/home/SubstituteInfoCardDataModel;", "superCategoryModel", "Lcom/intellihealth/truemeds/data/model/home/SuperCategoryDataModel;", "productCardModel", "Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;", "actionCardCallAndOrderModel", "productCardStackedModel", "patientAndMedicineListModel", "Lcom/intellihealth/truemeds/data/model/home/PatientAndMedicineListModel;", "blogSectionModel", "Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;", "testimonialSectionModel", "Lcom/intellihealth/truemeds/data/model/home/TestimonialSectionDataModel;", "footerModel", "Lcom/intellihealth/truemeds/data/model/home/FooterDataModel;", "(Lcom/intellihealth/truemeds/data/model/home/BannerDataModel;Lcom/intellihealth/truemeds/data/model/home/ReOrderDataModel;Lcom/intellihealth/truemeds/data/model/home/ActionCardDataModel;Lcom/intellihealth/truemeds/data/model/home/SubstituteInfoCardDataModel;Lcom/intellihealth/truemeds/data/model/home/SuperCategoryDataModel;Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;Lcom/intellihealth/truemeds/data/model/home/ActionCardDataModel;Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;Lcom/intellihealth/truemeds/data/model/home/PatientAndMedicineListModel;Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;Lcom/intellihealth/truemeds/data/model/home/TestimonialSectionDataModel;Lcom/intellihealth/truemeds/data/model/home/FooterDataModel;)V", "getActionCardCallAndOrderModel", "()Lcom/intellihealth/truemeds/data/model/home/ActionCardDataModel;", "setActionCardCallAndOrderModel", "(Lcom/intellihealth/truemeds/data/model/home/ActionCardDataModel;)V", "getActionCardModel", "setActionCardModel", "getBannerModel", "()Lcom/intellihealth/truemeds/data/model/home/BannerDataModel;", "setBannerModel", "(Lcom/intellihealth/truemeds/data/model/home/BannerDataModel;)V", "getBlogSectionModel", "()Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;", "setBlogSectionModel", "(Lcom/intellihealth/truemeds/data/model/home/BlogSectionDataModel;)V", "getFooterModel", "()Lcom/intellihealth/truemeds/data/model/home/FooterDataModel;", "setFooterModel", "(Lcom/intellihealth/truemeds/data/model/home/FooterDataModel;)V", "getPatientAndMedicineListModel", "()Lcom/intellihealth/truemeds/data/model/home/PatientAndMedicineListModel;", "setPatientAndMedicineListModel", "(Lcom/intellihealth/truemeds/data/model/home/PatientAndMedicineListModel;)V", "getProductCardModel", "()Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;", "setProductCardModel", "(Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;)V", "getProductCardStackedModel", "setProductCardStackedModel", "getReOrderrModel", "()Lcom/intellihealth/truemeds/data/model/home/ReOrderDataModel;", "setReOrderrModel", "(Lcom/intellihealth/truemeds/data/model/home/ReOrderDataModel;)V", "getSubstituteInfoCardDataModel", "()Lcom/intellihealth/truemeds/data/model/home/SubstituteInfoCardDataModel;", "setSubstituteInfoCardDataModel", "(Lcom/intellihealth/truemeds/data/model/home/SubstituteInfoCardDataModel;)V", "getSuperCategoryModel", "()Lcom/intellihealth/truemeds/data/model/home/SuperCategoryDataModel;", "setSuperCategoryModel", "(Lcom/intellihealth/truemeds/data/model/home/SuperCategoryDataModel;)V", "getTestimonialSectionModel", "()Lcom/intellihealth/truemeds/data/model/home/TestimonialSectionDataModel;", "setTestimonialSectionModel", "(Lcom/intellihealth/truemeds/data/model/home/TestimonialSectionDataModel;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_stageAndroidDebug"})
public final class HomeDataModel {
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.BannerDataModel bannerModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.ReOrderDataModel reOrderrModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.ActionCardDataModel actionCardModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.SubstituteInfoCardDataModel substituteInfoCardDataModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.SuperCategoryDataModel superCategoryModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.ProductCardDataModel productCardModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.ActionCardDataModel actionCardCallAndOrderModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.ProductCardDataModel productCardStackedModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel patientAndMedicineListModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.BlogSectionDataModel blogSectionModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel testimonialSectionModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.FooterDataModel footerModel;
    
    public HomeDataModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BannerDataModel bannerModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ReOrderDataModel reOrderrModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ActionCardDataModel actionCardModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.SubstituteInfoCardDataModel substituteInfoCardDataModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.SuperCategoryDataModel superCategoryModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel productCardModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ActionCardDataModel actionCardCallAndOrderModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel productCardStackedModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel patientAndMedicineListModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BlogSectionDataModel blogSectionModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel testimonialSectionModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.FooterDataModel footerModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.BannerDataModel getBannerModel() {
        return null;
    }
    
    public final void setBannerModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BannerDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ReOrderDataModel getReOrderrModel() {
        return null;
    }
    
    public final void setReOrderrModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ReOrderDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ActionCardDataModel getActionCardModel() {
        return null;
    }
    
    public final void setActionCardModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ActionCardDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.SubstituteInfoCardDataModel getSubstituteInfoCardDataModel() {
        return null;
    }
    
    public final void setSubstituteInfoCardDataModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.SubstituteInfoCardDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.SuperCategoryDataModel getSuperCategoryModel() {
        return null;
    }
    
    public final void setSuperCategoryModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.SuperCategoryDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ProductCardDataModel getProductCardModel() {
        return null;
    }
    
    public final void setProductCardModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ActionCardDataModel getActionCardCallAndOrderModel() {
        return null;
    }
    
    public final void setActionCardCallAndOrderModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ActionCardDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ProductCardDataModel getProductCardStackedModel() {
        return null;
    }
    
    public final void setProductCardStackedModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel getPatientAndMedicineListModel() {
        return null;
    }
    
    public final void setPatientAndMedicineListModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.BlogSectionDataModel getBlogSectionModel() {
        return null;
    }
    
    public final void setBlogSectionModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BlogSectionDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel getTestimonialSectionModel() {
        return null;
    }
    
    public final void setTestimonialSectionModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.FooterDataModel getFooterModel() {
        return null;
    }
    
    public final void setFooterModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.FooterDataModel p0) {
    }
    
    public HomeDataModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.BannerDataModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.BlogSectionDataModel component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.FooterDataModel component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ReOrderDataModel component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ActionCardDataModel component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.SubstituteInfoCardDataModel component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.SuperCategoryDataModel component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ProductCardDataModel component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ActionCardDataModel component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.ProductCardDataModel component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.home.HomeDataModel copy(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BannerDataModel bannerModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ReOrderDataModel reOrderrModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ActionCardDataModel actionCardModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.SubstituteInfoCardDataModel substituteInfoCardDataModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.SuperCategoryDataModel superCategoryModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel productCardModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ActionCardDataModel actionCardCallAndOrderModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel productCardStackedModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel patientAndMedicineListModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.BlogSectionDataModel blogSectionModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.TestimonialSectionDataModel testimonialSectionModel, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.home.FooterDataModel footerModel) {
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