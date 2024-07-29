package com.intellihealth.truemeds.data.model.doctordetails;

/**
 * This is used to showing doctor details against particular order
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\br\b\u0086\b\u0018\u00002\u00020\u0001B\u00df\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0016\u0012\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0001\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020\'\u00a2\u0006\u0002\u0010(J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010w\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u001d\u0010|\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0016H\u00c6\u0003J\u001d\u0010}\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0016H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020%H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\'H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0094\u0003\u0010\u0094\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00162\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\'H\u00c6\u0001J\u0015\u0010\u0095\u0001\u001a\u00020\'2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0098\u0001\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010!\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00106\"\u0004\b>\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u00106\"\u0004\bN\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010.\"\u0004\bP\u00100R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010.\"\u0004\bR\u00100R\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010.\"\u0004\bX\u00100R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010#\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u00106\"\u0004\b^\u00108R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010.\"\u0004\bd\u00100R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010.\"\u0004\bj\u00100R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010.\"\u0004\bl\u00100R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010.\"\u0004\bn\u00100R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010.\"\u0004\bp\u00100R.\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010`\"\u0004\br\u0010bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010.\"\u0004\bt\u00100\u00a8\u0006\u0099\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/model/doctordetails/DoctorDetails;", "", "id", "", "doctorId", "customerCount", "doctorName", "", "image", "healthMantra", "experience", "emailId", "degreeCertificate", "doctorSignature", "rating", "", "dob", "mobileNo", "registrationNo", "doctorInvoiceName", "specialist", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "qualification", "specialistId", "qualificationId", "imgData", "certificateImg", "signatureImg", "imgType", "certificateImgType", "signatureImgType", "imgName", "certificateImgName", "signatureImgName", "orderRating", "orderId", "", "approved", "", "(IIILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;DLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IJZ)V", "getApproved", "()Z", "setApproved", "(Z)V", "getCertificateImg", "()Ljava/lang/Object;", "setCertificateImg", "(Ljava/lang/Object;)V", "getCertificateImgName", "setCertificateImgName", "getCertificateImgType", "setCertificateImgType", "getCustomerCount", "()I", "setCustomerCount", "(I)V", "getDegreeCertificate", "setDegreeCertificate", "getDob", "setDob", "getDoctorId", "setDoctorId", "getDoctorInvoiceName", "setDoctorInvoiceName", "getDoctorName", "()Ljava/lang/String;", "setDoctorName", "(Ljava/lang/String;)V", "getDoctorSignature", "setDoctorSignature", "getEmailId", "setEmailId", "getExperience", "setExperience", "getHealthMantra", "setHealthMantra", "getId", "setId", "getImage", "setImage", "getImgData", "setImgData", "getImgName", "setImgName", "getImgType", "setImgType", "getMobileNo", "setMobileNo", "getOrderId", "()J", "setOrderId", "(J)V", "getOrderRating", "setOrderRating", "getQualification", "()Ljava/util/ArrayList;", "setQualification", "(Ljava/util/ArrayList;)V", "getQualificationId", "setQualificationId", "getRating", "()D", "setRating", "(D)V", "getRegistrationNo", "setRegistrationNo", "getSignatureImg", "setSignatureImg", "getSignatureImgName", "setSignatureImgName", "getSignatureImgType", "setSignatureImgType", "getSpecialist", "setSpecialist", "getSpecialistId", "setSpecialistId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
public final class DoctorDetails {
    private int id;
    
    /**
     * This is used when submit rating for doctor
     */
    private int doctorId;
    
    /**
     * This is used for showing number of customer count that consulted by doctor
     */
    private int customerCount;
    
    /**
     * This is used for showing name of doctor
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String doctorName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object image;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String healthMantra;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String experience;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object emailId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object degreeCertificate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object doctorSignature;
    
    /**
     * This is used to show rating of doctor eg five star, two star etc
     */
    private double rating;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object dob;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object mobileNo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object registrationNo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object doctorInvoiceName;
    
    /**
     * This contains multiple speciality, used first item for showing doctor speciality
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> specialist;
    
    /**
     * This contains multiple qualification, used first item for showing doctor qualification
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> qualification;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object specialistId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object qualificationId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object imgData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object certificateImg;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object signatureImg;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object imgType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object certificateImgType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object signatureImgType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object imgName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object certificateImgName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object signatureImgName;
    
    /**
     * This is used to show rating or experience about doctor against that order
     */
    private int orderRating;
    private long orderId;
    private boolean approved;
    
    public DoctorDetails(int id, int doctorId, int customerCount, @org.jetbrains.annotations.Nullable()
    java.lang.String doctorName, @org.jetbrains.annotations.Nullable()
    java.lang.Object image, @org.jetbrains.annotations.Nullable()
    java.lang.String healthMantra, @org.jetbrains.annotations.Nullable()
    java.lang.String experience, @org.jetbrains.annotations.Nullable()
    java.lang.Object emailId, @org.jetbrains.annotations.Nullable()
    java.lang.Object degreeCertificate, @org.jetbrains.annotations.Nullable()
    java.lang.Object doctorSignature, double rating, @org.jetbrains.annotations.Nullable()
    java.lang.Object dob, @org.jetbrains.annotations.Nullable()
    java.lang.Object mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.Object registrationNo, @org.jetbrains.annotations.Nullable()
    java.lang.Object doctorInvoiceName, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> specialist, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> qualification, @org.jetbrains.annotations.Nullable()
    java.lang.Object specialistId, @org.jetbrains.annotations.Nullable()
    java.lang.Object qualificationId, @org.jetbrains.annotations.Nullable()
    java.lang.Object imgData, @org.jetbrains.annotations.Nullable()
    java.lang.Object certificateImg, @org.jetbrains.annotations.Nullable()
    java.lang.Object signatureImg, @org.jetbrains.annotations.Nullable()
    java.lang.Object imgType, @org.jetbrains.annotations.Nullable()
    java.lang.Object certificateImgType, @org.jetbrains.annotations.Nullable()
    java.lang.Object signatureImgType, @org.jetbrains.annotations.Nullable()
    java.lang.Object imgName, @org.jetbrains.annotations.Nullable()
    java.lang.Object certificateImgName, @org.jetbrains.annotations.Nullable()
    java.lang.Object signatureImgName, int orderRating, long orderId, boolean approved) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    /**
     * This is used when submit rating for doctor
     */
    public final int getDoctorId() {
        return 0;
    }
    
    /**
     * This is used when submit rating for doctor
     */
    public final void setDoctorId(int p0) {
    }
    
    /**
     * This is used for showing number of customer count that consulted by doctor
     */
    public final int getCustomerCount() {
        return 0;
    }
    
    /**
     * This is used for showing number of customer count that consulted by doctor
     */
    public final void setCustomerCount(int p0) {
    }
    
    /**
     * This is used for showing name of doctor
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDoctorName() {
        return null;
    }
    
    /**
     * This is used for showing name of doctor
     */
    public final void setDoctorName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHealthMantra() {
        return null;
    }
    
    public final void setHealthMantra(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExperience() {
        return null;
    }
    
    public final void setExperience(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEmailId() {
        return null;
    }
    
    public final void setEmailId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDegreeCertificate() {
        return null;
    }
    
    public final void setDegreeCertificate(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDoctorSignature() {
        return null;
    }
    
    public final void setDoctorSignature(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    /**
     * This is used to show rating of doctor eg five star, two star etc
     */
    public final double getRating() {
        return 0.0;
    }
    
    /**
     * This is used to show rating of doctor eg five star, two star etc
     */
    public final void setRating(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDob() {
        return null;
    }
    
    public final void setDob(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMobileNo() {
        return null;
    }
    
    public final void setMobileNo(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRegistrationNo() {
        return null;
    }
    
    public final void setRegistrationNo(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDoctorInvoiceName() {
        return null;
    }
    
    public final void setDoctorInvoiceName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    /**
     * This contains multiple speciality, used first item for showing doctor speciality
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getSpecialist() {
        return null;
    }
    
    /**
     * This contains multiple speciality, used first item for showing doctor speciality
     */
    public final void setSpecialist(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    /**
     * This contains multiple qualification, used first item for showing doctor qualification
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getQualification() {
        return null;
    }
    
    /**
     * This contains multiple qualification, used first item for showing doctor qualification
     */
    public final void setQualification(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSpecialistId() {
        return null;
    }
    
    public final void setSpecialistId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQualificationId() {
        return null;
    }
    
    public final void setQualificationId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImgData() {
        return null;
    }
    
    public final void setImgData(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCertificateImg() {
        return null;
    }
    
    public final void setCertificateImg(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSignatureImg() {
        return null;
    }
    
    public final void setSignatureImg(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImgType() {
        return null;
    }
    
    public final void setImgType(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCertificateImgType() {
        return null;
    }
    
    public final void setCertificateImgType(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSignatureImgType() {
        return null;
    }
    
    public final void setSignatureImgType(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImgName() {
        return null;
    }
    
    public final void setImgName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCertificateImgName() {
        return null;
    }
    
    public final void setCertificateImgName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSignatureImgName() {
        return null;
    }
    
    public final void setSignatureImgName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    /**
     * This is used to show rating or experience about doctor against that order
     */
    public final int getOrderRating() {
        return 0;
    }
    
    /**
     * This is used to show rating or experience about doctor against that order
     */
    public final void setOrderRating(int p0) {
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    public final void setOrderId(long p0) {
    }
    
    public final boolean getApproved() {
        return false;
    }
    
    public final void setApproved(boolean p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component10() {
        return null;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component19() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component28() {
        return null;
    }
    
    public final int component29() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final long component30() {
        return 0L;
    }
    
    public final boolean component31() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.doctordetails.DoctorDetails copy(int id, int doctorId, int customerCount, @org.jetbrains.annotations.Nullable()
    java.lang.String doctorName, @org.jetbrains.annotations.Nullable()
    java.lang.Object image, @org.jetbrains.annotations.Nullable()
    java.lang.String healthMantra, @org.jetbrains.annotations.Nullable()
    java.lang.String experience, @org.jetbrains.annotations.Nullable()
    java.lang.Object emailId, @org.jetbrains.annotations.Nullable()
    java.lang.Object degreeCertificate, @org.jetbrains.annotations.Nullable()
    java.lang.Object doctorSignature, double rating, @org.jetbrains.annotations.Nullable()
    java.lang.Object dob, @org.jetbrains.annotations.Nullable()
    java.lang.Object mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.Object registrationNo, @org.jetbrains.annotations.Nullable()
    java.lang.Object doctorInvoiceName, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> specialist, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> qualification, @org.jetbrains.annotations.Nullable()
    java.lang.Object specialistId, @org.jetbrains.annotations.Nullable()
    java.lang.Object qualificationId, @org.jetbrains.annotations.Nullable()
    java.lang.Object imgData, @org.jetbrains.annotations.Nullable()
    java.lang.Object certificateImg, @org.jetbrains.annotations.Nullable()
    java.lang.Object signatureImg, @org.jetbrains.annotations.Nullable()
    java.lang.Object imgType, @org.jetbrains.annotations.Nullable()
    java.lang.Object certificateImgType, @org.jetbrains.annotations.Nullable()
    java.lang.Object signatureImgType, @org.jetbrains.annotations.Nullable()
    java.lang.Object imgName, @org.jetbrains.annotations.Nullable()
    java.lang.Object certificateImgName, @org.jetbrains.annotations.Nullable()
    java.lang.Object signatureImgName, int orderRating, long orderId, boolean approved) {
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