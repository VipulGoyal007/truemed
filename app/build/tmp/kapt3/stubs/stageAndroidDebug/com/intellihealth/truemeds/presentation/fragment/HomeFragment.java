package com.intellihealth.truemeds.presentation.fragment;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ec\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00d9\u00012\u00020\u00012\u00020\u0002:\u0004\u00d9\u0001\u00da\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001J\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001J\t\u0010\u009d\u0001\u001a\u000209H\u0002J\u0013\u0010\u009e\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020sH\u0016J\b\u0010\u00a0\u0001\u001a\u00030\u009b\u0001J\u001c\u0010\u00a1\u0001\u001a\u00020D2\u0007\u0010\u00a2\u0001\u001a\u0002032\b\u0010\u00a3\u0001\u001a\u00030\u00a4\u0001H\u0002J\n\u0010\u00a5\u0001\u001a\u00030\u009b\u0001H\u0002J\t\u0010\u00a6\u0001\u001a\u00020DH\u0002J\n\u0010\u00a7\u0001\u001a\u00030\u009b\u0001H\u0002J\n\u0010\u00a8\u0001\u001a\u00030\u009b\u0001H\u0016J\u0013\u0010\u00a9\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00aa\u0001\u001a\u00020DH\u0016J\n\u0010\u00ab\u0001\u001a\u00030\u009b\u0001H\u0016J\n\u0010\u00ac\u0001\u001a\u00030\u009b\u0001H\u0016J \u0010\u00ad\u0001\u001a\u00030\u009b\u00012\b\u0010\u00ae\u0001\u001a\u00030\u00af\u00012\n\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u00b1\u0001H\u0016J\n\u0010\u00b2\u0001\u001a\u00030\u009b\u0001H\u0002J\u0015\u0010\u00b3\u0001\u001a\u00030\u009b\u00012\t\u0010\u00b4\u0001\u001a\u0004\u0018\u00010sH\u0002J\u001e\u0010\u00b5\u0001\u001a\u00030\u009b\u00012\t\u0010\u00b6\u0001\u001a\u0004\u0018\u00010s2\u0007\u0010\u00b7\u0001\u001a\u00020DH\u0002J\n\u0010\u00b8\u0001\u001a\u00030\u009b\u0001H\u0002J\n\u0010\u00b9\u0001\u001a\u00030\u009b\u0001H\u0002J \u0010\u00ba\u0001\u001a\u00030\u009b\u00012\t\u0010\u00bb\u0001\u001a\u0004\u0018\u00010s2\t\u0010\u00bc\u0001\u001a\u0004\u0018\u00010sH\u0002J \u0010\u00bd\u0001\u001a\u00030\u009b\u00012\t\u0010\u00be\u0001\u001a\u0004\u0018\u00010s2\t\u0010\u00b4\u0001\u001a\u0004\u0018\u00010sH\u0002J\n\u0010\u00bf\u0001\u001a\u00030\u009b\u0001H\u0002J\u001c\u0010\u00c0\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00c1\u0001\u001a\u00020s2\u0007\u0010\u00c2\u0001\u001a\u00020sH\u0002J\u0013\u0010\u00c3\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00c1\u0001\u001a\u00020sH\u0002J\n\u0010\u00c4\u0001\u001a\u00030\u009b\u0001H\u0002J\n\u0010\u00c5\u0001\u001a\u00030\u009b\u0001H\u0002J\n\u0010\u00c6\u0001\u001a\u00030\u009b\u0001H\u0002J\n\u0010\u00c7\u0001\u001a\u00030\u009b\u0001H\u0002J\n\u0010\u00c8\u0001\u001a\u00030\u009b\u0001H\u0002J\n\u0010\u00c9\u0001\u001a\u00030\u00ca\u0001H\u0002J\n\u0010\u00cb\u0001\u001a\u00030\u009b\u0001H\u0002J\u001b\u0010\u00cc\u0001\u001a\u00030\u009b\u00012\u000f\u0010\u00cd\u0001\u001a\n\u0012\u0005\u0012\u00030\u00cf\u00010\u00ce\u0001H\u0002J\u001c\u0010\u00d0\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009f\u0001\u001a\u00020s2\u0007\u0010\u00d1\u0001\u001a\u00020DH\u0002J\u001d\u0010\u00d2\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u00d3\u0001\u001a\u00020g2\b\u0010\u00d4\u0001\u001a\u00030\u00d5\u0001H\u0002J\b\u0010\u00d6\u0001\u001a\u00030\u009b\u0001J\n\u0010\u00d7\u0001\u001a\u00030\u009b\u0001H\u0002J\n\u0010\u00d8\u0001\u001a\u00030\u009b\u0001H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u00108\u001a\u000209\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010>\u001a\u00020?8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010\u001f\u001a\u0004\b@\u0010AR\u001a\u0010C\u001a\u00020DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010E\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020DX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010I\u001a\u0004\u0018\u00010DX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010JR\u001a\u0010K\u001a\u00020LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010Q\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u00105\"\u0004\bS\u00107R\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020DX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\\X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010]\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u00105\"\u0004\b_\u00107R\u0010\u0010`\u001a\u0004\u0018\u00010aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010f\u001a\u0004\u0018\u00010gX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020iX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010j\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010k\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u00105\"\u0004\bm\u00107R\u0010\u0010n\u001a\u0004\u0018\u00010oX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010p\u001a\u0004\u0018\u00010qX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020sX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010t\u001a\u0004\u0018\u00010sX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010u\u001a\u0004\u0018\u00010vX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010w\u001a\u00020xX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0010\u0010}\u001a\u0004\u0018\u00010~X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0081\u0001\u001a\u00030\u0082\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u0087\u0001\u001a\f\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010\u0088\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0012\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0090\u0001\u001a\u000203X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u00105\"\u0005\b\u0092\u0001\u00107R\u0012\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0094\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0097\u0001\u001a\u000203X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u00105\"\u0005\b\u0099\u0001\u00107\u00a8\u0006\u00db\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/intellihealth/truemeds/presentation/bottomsheet/productdetail/ProductDetailBottomSheet$CrossSellingProductBSCallback;", "ftcViewModel", "Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "(Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;)V", "()V", "actionCardAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/ActionCardAdapter;", "alertAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/AlertAdapter;", "applyCouponCallBack", "Lcom/intellihealth/truemeds/presentation/callbacks/CouponBottomSheetCallback;", "bannerAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/BannerAdapter;", "billDetailsModel", "Lcom/intellihealth/salt/models/BillDetailsModel;", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentHomeBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/FragmentHomeBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/FragmentViewBindingDelegate;", "blogSectionAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/BlogSectionDataAdapter;", "callOrderActionCardAdapter", "cartViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "getCartViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "cartViewModel$delegate", "Lkotlin/Lazy;", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "editDeleteAddressBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/cart/RemoveProductBottomSheet;", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "footerAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/FooterDataAdapter;", "fraudBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/home/DoctorFraudBottomSheet;", "handler", "Landroid/os/Handler;", "healthArticlePosition", "", "getHealthArticlePosition", "()I", "setHealthArticlePosition", "(I)V", "homeDataModel", "Lcom/intellihealth/truemeds/data/model/home/HomeDataModel;", "getHomeDataModel", "()Lcom/intellihealth/truemeds/data/model/home/HomeDataModel;", "homeOtcCategoryAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/HomeOtcCategoryAdapter;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "homeViewModel$delegate", "isBannerVisible", "", "()Z", "setBannerVisible", "(Z)V", "isCategoryImpressionSent", "isFromLimitedOffer", "Ljava/lang/Boolean;", "lastClickSubstitutesPageCTA", "", "getLastClickSubstitutesPageCTA", "()J", "setLastClickSubstitutesPageCTA", "(J)V", "lastVisibleItemPosition", "getLastVisibleItemPosition", "setLastVisibleItemPosition", "locationBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/home/LocationBottomSheet;", "mLastClickTime", "mLocationLastClickTime", "mainAdapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "octCategoryVisible", "orderDetails", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders;", "otcPosition", "getOtcPosition", "setOtcPosition", "otcProductToDeleteFromDB", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "patientListMedicinesListCardStackedAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/PatientListMedicinesListAdapter;", "paymentPendingBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/home/PaymentPendingBottomSheet;", "paymentResponse", "Lcom/intellihealth/truemeds/presentation/model/HomePaymentPendingResponse;", "paymentSelectionInfo", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;", "pdBottomsheetCallbackListener", "posDeleteBSFromProductCardStacked", "getPosDeleteBSFromProductCardStacked", "setPosDeleteBSFromProductCardStacked", "productCardAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/ProductCardAdapter;", "productCardStackedAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/ProductCardStackedAdapter;", "productCodeToDelete", "", "productSectionType", "ratingBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/home/RatingsBottomSheet;", "reOrderCallback", "Lcom/intellihealth/salt/callbacks/ReorderCallback;", "getReOrderCallback", "()Lcom/intellihealth/salt/callbacks/ReorderCallback;", "setReOrderCallback", "(Lcom/intellihealth/salt/callbacks/ReorderCallback;)V", "reorderAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/ReorderAdapter;", "reorderBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/home/ReorderBottomSheet;", "responseApi", "Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;", "getResponseApi", "()Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;", "setResponseApi", "(Lcom/intellihealth/truemeds/data/model/home/ProductCardDataModel;)V", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "saveNumberBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/home/SaveNumberBottomSheet;", "stackedConcatPosition", "getStackedConcatPosition", "setStackedConcatPosition", "substituteInfoCardAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/SubstituteInfoCardAdapter;", "testimonialSectionAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/TestimonialSectionDataAdapter;", "trendingConcatPosition", "getTrendingConcatPosition", "setTrendingConcatPosition", "checkLocationEnablePopup", "", "checkLocationPermission", "createDataForHomePage", "dismissProductDetailBottomsheet", "productCode", "getCurrentGPSLocation", "getIsChildVisibleInConcatAdapter", "position", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "initView", "isSingleClick", "observeBottomSheet", "onDestroyView", "onHiddenChanged", "hidden", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openCartActivity", "openCartPage", "actionType", "openHealthArticleActivity", "slug", "isArticle", "openLocationBottomSheet", "openMyOrdersActivity", "openOrderStatusActivity", "orderId", "orderType", "openPdPage", "pdId", "openReminderActivity", "openSearchActivity", "query", "type", "openSearchSuggestionActivity", "setDataObserver", "setListener", "setMainListAdapter", "setNestedScrollListener", "setScrollListener", "setupApplyCouponData", "Lcom/intellihealth/truemeds/data/model/home/ApplyCouponBottomSheetModel;", "setupDataInRecyclerView", "setupFeatureList", "homepageFeatureList", "", "Lcom/intellihealth/truemeds/presentation/fragment/HomePageFeatureName;", "showConfirmationDialog", "isSubs", "showPendingPaymentDialog", "result", "paymentPendingCallback", "Lcom/intellihealth/truemeds/presentation/callbacks/PaymentPendingCallback;", "showRatingSubmittedPopup", "showRatingsBottomSheet", "showSaveContactBottomSheet", "Companion", "CrossSellingClick", "app_stageAndroidDebug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet.CrossSellingProductBSCallback {
    private com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel ftcViewModel;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.FragmentViewBindingDelegate binding$delegate = null;
    private long lastClickSubstitutesPageCTA = 0L;
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase;
    private boolean isBannerVisible = true;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.BannerAdapter bannerAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.AlertAdapter alertAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.ActionCardAdapter actionCardAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.SubstituteInfoCardAdapter substituteInfoCardAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.ProductCardAdapter productCardAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.ActionCardAdapter callOrderActionCardAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.ProductCardStackedAdapter productCardStackedAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.PatientListMedicinesListAdapter patientListMedicinesListCardStackedAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.BlogSectionDataAdapter blogSectionAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.TestimonialSectionDataAdapter testimonialSectionAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.FooterDataAdapter footerAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.ReorderAdapter reorderAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter homeOtcCategoryAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.CouponBottomSheetCallback applyCouponCallBack;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.ConcatAdapter mainAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.home.LocationBottomSheet locationBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.model.home.HomeDataModel homeDataModel = null;
    @org.jetbrains.annotations.NotNull()
    private final android.util.DisplayMetrics displayMetrics = null;
    public com.intellihealth.salt.callbacks.ReorderCallback reOrderCallback;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet.CrossSellingProductBSCallback pdBottomsheetCallbackListener;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet editDeleteAddressBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cartViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String productCodeToDelete = "";
    private int posDeleteBSFromProductCardStacked = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isFromLimitedOffer = true;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel otcProductToDeleteFromDB;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productSectionType = "";
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncher;
    public com.intellihealth.truemeds.data.model.home.ProductCardDataModel responseApi;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.home.SaveNumberBottomSheet saveNumberBottomSheet;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.home.RatingsBottomSheet ratingBottomSheet;
    private com.intellihealth.salt.models.BillDetailsModel billDetailsModel;
    private com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders orderDetails;
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo paymentSelectionInfo;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.home.PaymentPendingBottomSheet paymentPendingBottomSheet;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.HomePaymentPendingResponse paymentResponse;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.home.DoctorFraudBottomSheet fraudBottomSheet;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.home.ReorderBottomSheet reorderBottomSheet;
    private boolean isCategoryImpressionSent = false;
    private int otcPosition = 0;
    private int trendingConcatPosition = 0;
    private int stackedConcatPosition = 0;
    private int healthArticlePosition = 0;
    public static final long MIN_DELAY_MS = 1000L;
    private static boolean isLocationBottomSheetOpened = false;
    private int lastVisibleItemPosition = 0;
    private boolean octCategoryVisible = false;
    private long mLastClickTime = 0L;
    private long mLocationLastClickTime = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.fragment.HomeFragment.Companion Companion = null;
    
    public HomeFragment() {
        super();
    }
    
    public HomeFragment(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel ftcViewModel) {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final long getLastClickSubstitutesPageCTA() {
        return 0L;
    }
    
    public final void setLastClickSubstitutesPageCTA(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEventUseCase() {
        return null;
    }
    
    public final void setFirebaseEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    public final boolean isBannerVisible() {
        return false;
    }
    
    public final void setBannerVisible(boolean p0) {
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.home.HomeDataModel getHomeDataModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.DisplayMetrics getDisplayMetrics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.callbacks.ReorderCallback getReOrderCallback() {
        return null;
    }
    
    public final void setReOrderCallback(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.callbacks.ReorderCallback p0) {
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.CartViewModel getCartViewModel() {
        return null;
    }
    
    public final int getPosDeleteBSFromProductCardStacked() {
        return 0;
    }
    
    public final void setPosDeleteBSFromProductCardStacked(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultLauncher() {
        return null;
    }
    
    public final void setResultLauncher(@org.jetbrains.annotations.Nullable()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.home.ProductCardDataModel getResponseApi() {
        return null;
    }
    
    public final void setResponseApi(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.ProductCardDataModel p0) {
    }
    
    public final int getOtcPosition() {
        return 0;
    }
    
    public final void setOtcPosition(int p0) {
    }
    
    public final int getTrendingConcatPosition() {
        return 0;
    }
    
    public final void setTrendingConcatPosition(int p0) {
    }
    
    public final int getStackedConcatPosition() {
        return 0;
    }
    
    public final void setStackedConcatPosition(int p0) {
    }
    
    public final int getHealthArticlePosition() {
        return 0;
    }
    
    public final void setHealthArticlePosition(int p0) {
    }
    
    public final int getLastVisibleItemPosition() {
        return 0;
    }
    
    public final void setLastVisibleItemPosition(int p0) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void setListener() {
    }
    
    private final void setupDataInRecyclerView() {
    }
    
    private final void setMainListAdapter() {
    }
    
    private final void setScrollListener() {
    }
    
    private final void setupFeatureList(java.util.List<com.intellihealth.truemeds.presentation.fragment.HomePageFeatureName> homepageFeatureList) {
    }
    
    /**
     * code to open apply coupon bottom sheet
     */
    private final com.intellihealth.truemeds.data.model.home.HomeDataModel createDataForHomePage() {
        return null;
    }
    
    private final void setDataObserver() {
    }
    
    private final boolean getIsChildVisibleInConcatAdapter(int position, androidx.recyclerview.widget.LinearLayoutManager layoutManager) {
        return false;
    }
    
    public final void showRatingSubmittedPopup() {
    }
    
    private final void showRatingsBottomSheet() {
    }
    
    private final void showSaveContactBottomSheet() {
    }
    
    private final com.intellihealth.truemeds.data.model.home.ApplyCouponBottomSheetModel setupApplyCouponData() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void observeBottomSheet() {
    }
    
    private final void showPendingPaymentDialog(com.intellihealth.truemeds.presentation.model.HomePaymentPendingResponse result, com.intellihealth.truemeds.presentation.callbacks.PaymentPendingCallback paymentPendingCallback) {
    }
    
    private final void openLocationBottomSheet() {
    }
    
    public final void getCurrentGPSLocation() {
    }
    
    public final void checkLocationEnablePopup() {
    }
    
    public final void checkLocationPermission() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final boolean isSingleClick() {
        return false;
    }
    
    @java.lang.Override()
    public void dismissProductDetailBottomsheet(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
    }
    
    private final void showConfirmationDialog(java.lang.String productCode, boolean isSubs) {
    }
    
    private final void openPdPage(java.lang.String pdId, java.lang.String actionType) {
    }
    
    private final void openOrderStatusActivity(java.lang.String orderId, java.lang.String orderType) {
    }
    
    private final void openHealthArticleActivity(java.lang.String slug, boolean isArticle) {
    }
    
    private final void openSearchSuggestionActivity(java.lang.String query) {
    }
    
    private final void openCartPage(java.lang.String actionType) {
    }
    
    private final void openReminderActivity() {
    }
    
    private final void openMyOrdersActivity() {
    }
    
    private final void openSearchActivity(java.lang.String query, java.lang.String type) {
    }
    
    private final void openCartActivity() {
    }
    
    /**
     * This is used to pop the bottom sheet from the stack and display if previously not shown
     */
    @java.lang.Override()
    public void onHiddenChanged(boolean hidden) {
    }
    
    private final void setNestedScrollListener() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/HomeFragment$Companion;", "", "()V", "MIN_DELAY_MS", "", "isLocationBottomSheetOpened", "", "()Z", "setLocationBottomSheetOpened", "(Z)V", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isLocationBottomSheetOpened() {
            return false;
        }
        
        public final void setLocationBottomSheetOpened(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/HomeFragment$CrossSellingClick;", "", "(Ljava/lang/String;I)V", "TRENDING_IN_YOUR_CITY", "LIMITED_OFFER", "NEW_ARRIVAL", "app_stageAndroidDebug"})
    public static enum CrossSellingClick {
        /*public static final*/ TRENDING_IN_YOUR_CITY /* = new TRENDING_IN_YOUR_CITY() */,
        /*public static final*/ LIMITED_OFFER /* = new LIMITED_OFFER() */,
        /*public static final*/ NEW_ARRIVAL /* = new NEW_ARRIVAL() */;
        
        CrossSellingClick() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.intellihealth.truemeds.presentation.fragment.HomeFragment.CrossSellingClick> getEntries() {
            return null;
        }
    }
}