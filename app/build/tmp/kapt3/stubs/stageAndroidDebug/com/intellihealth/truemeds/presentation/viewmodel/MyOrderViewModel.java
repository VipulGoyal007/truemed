package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u00af\u0001\u001a\u00030\u00b0\u00012\b\u0010\u00b1\u0001\u001a\u00030\u00b2\u0001J\u0012\u0010\u00b3\u0001\u001a\u00030\u00b0\u00012\b\u0010\u00b1\u0001\u001a\u00030\u00b2\u0001J\b\u0010\u00b4\u0001\u001a\u00030\u00b0\u0001J-\u0010\u00b5\u0001\u001a\u00030\u00b0\u00012\r\u0010\u00b6\u0001\u001a\b\u0012\u0004\u0012\u00020)0\u000f2\t\u0010\u00b7\u0001\u001a\u0004\u0018\u0001052\t\b\u0002\u0010\u00b8\u0001\u001a\u00020OJ%\u0010\u00b9\u0001\u001a\b\u0012\u0004\u0012\u00020\t022\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\t02H\u0082@\u00a2\u0006\u0003\u0010\u00ba\u0001J\t\u0010\u00bb\u0001\u001a\u00020\u0018H\u0002J\u0010\u0010\u00bc\u0001\u001a\u00020\u00182\u0007\u0010\u00bd\u0001\u001a\u000205Jt\u0010\u00be\u0001\u001a\u00030\u00b0\u00012\u0007\u0010\u00bf\u0001\u001a\u00020\u00182\u0007\u0010\u00c0\u0001\u001a\u00020\u00182\u0007\u0010\u00c1\u0001\u001a\u0002052\u0007\u0010\u00c2\u0001\u001a\u00020\u00182\u0007\u0010\u00c3\u0001\u001a\u00020O2\t\b\u0002\u0010\u00c4\u0001\u001a\u00020O2\u000f\b\u0002\u0010\u00c5\u0001\u001a\b\u0012\u0004\u0012\u000205022\t\b\u0002\u0010\u00c6\u0001\u001a\u00020O2\t\b\u0002\u0010\u00c7\u0001\u001a\u00020O2\u000b\b\u0002\u0010\u00c8\u0001\u001a\u0004\u0018\u000105J\u0014\u0010\u00c9\u0001\u001a\u00030\u00b0\u00012\b\u0010\u00ca\u0001\u001a\u00030\u00cb\u0001H\u0016J\u0011\u0010\u00cc\u0001\u001a\u00030\u00b0\u00012\u0007\u0010\u00cd\u0001\u001a\u00020\u0018J\u0012\u0010\u00ce\u0001\u001a\u00030\u00b0\u00012\b\u0010\u00cf\u0001\u001a\u00030\u00d0\u0001J\u0012\u0010\u00d1\u0001\u001a\u00030\u00b0\u00012\b\u0010\u00d2\u0001\u001a\u00030\u00d3\u0001J\u0011\u0010\u00d4\u0001\u001a\u00030\u00b0\u00012\u0007\u0010\u00cd\u0001\u001a\u00020\u0018J\u0011\u0010\u00d5\u0001\u001a\u00030\u00b0\u00012\u0007\u0010\u00cd\u0001\u001a\u00020\u0018J\u0011\u0010\u00d6\u0001\u001a\u00030\u00b0\u00012\u0007\u0010\u00cd\u0001\u001a\u00020\u0018J\u0011\u0010\u00d7\u0001\u001a\u00030\u00b0\u00012\u0007\u0010\u00cd\u0001\u001a\u00020\u0018J\u0011\u0010\u00d8\u0001\u001a\u00030\u00b0\u00012\u0007\u0010\u00cd\u0001\u001a\u00020\u0018J\u0017\u0010\u00d9\u0001\u001a\u00030\u00b0\u00012\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\t02J\u001b\u0010\u00da\u0001\u001a\u00030\u00b0\u00012\u000f\u0010\u00db\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000fH\u0002J\u0017\u0010\u00dc\u0001\u001a\u00030\u00b0\u00012\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\t02J\n\u0010\u00dd\u0001\u001a\u00030\u00b0\u0001H\u0002J#\u0010\u00de\u0001\u001a\u00030\u00b0\u00012\u0007\u0010\u00df\u0001\u001a\u00020\u00182\u0007\u0010\u00a6\u0001\u001a\u0002052\u0007\u0010\u00c2\u0001\u001a\u00020\u0018J\"\u0010\u00e0\u0001\u001a\u00030\u00b0\u00012\u0018\u0010\u00e1\u0001\u001a\u0013\u0012\u0004\u0012\u0002050uj\t\u0012\u0004\u0012\u000205`\u00e2\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b\'\u0010\u001cR(\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u000f0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001a\u0010,\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001f\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u0001020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001aR\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001a\u0010=\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00107\"\u0004\b?\u00109R&\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001cR\u001d\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0D8F\u00a2\u0006\u0006\u001a\u0004\bG\u0010HR\u001d\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0E0D8F\u00a2\u0006\u0006\u001a\u0004\bK\u0010HR\u001d\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0D8F\u00a2\u0006\u0006\u001a\u0004\bM\u0010HR\u001f\u0010N\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010O0O0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u001aR\u0010\u0010R\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010S\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u00107\"\u0004\bU\u00109R\u0012\u0010V\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010WR\u0010\u0010X\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010Y\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010.\"\u0004\b[\u00100R \u0010\\\u001a\b\u0012\u0004\u0012\u0002050\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u001a\"\u0004\b^\u0010\u001cR\u001c\u0010_\u001a\u0004\u0018\u000105X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u00107\"\u0004\ba\u00109R\u001a\u0010b\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010.\"\u0004\bd\u00100R\u001a\u0010e\u001a\u00020OX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001f\u0010i\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010O0O0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010\u001aR\u001a\u0010j\u001a\u00020OX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010f\"\u0004\bk\u0010hR\u001a\u0010l\u001a\u00020OX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010f\"\u0004\bm\u0010hR\u001a\u0010n\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010.\"\u0004\bp\u00100R\u001a\u0010q\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010.\"\u0004\bs\u00100R\u0014\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00100uX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010v\u001a\u00020wX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001a\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010}\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010.\"\u0004\b\u007f\u00100R\u001d\u0010\u0080\u0001\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010.\"\u0005\b\u0082\u0001\u00100R\u001d\u0010\u0083\u0001\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010.\"\u0005\b\u0085\u0001\u00100R\u001d\u0010\u0086\u0001\u001a\u000205X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u00107\"\u0005\b\u0088\u0001\u00109R#\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u0012\"\u0005\b\u008b\u0001\u0010#R$\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u000102X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0012\"\u0005\b\u008f\u0001\u0010#R#\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\t02X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0012\"\u0005\b\u0092\u0001\u0010#R)\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t020\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u001a\"\u0005\b\u0095\u0001\u0010\u001cR\u001b\u0010\u0096\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0097\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0E0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020O0\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u001a\"\u0005\b\u009a\u0001\u0010\u001cR\u0019\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020O0D8F\u00a2\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010HR+\u0010\u009d\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000f0\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u001a\"\u0005\b\u009f\u0001\u0010\u001cR\u001d\u0010\u00a0\u0001\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010.\"\u0005\b\u00a2\u0001\u00100R\u001d\u0010\u00a3\u0001\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a4\u0001\u0010.\"\u0005\b\u00a5\u0001\u00100R\u001d\u0010\u00a6\u0001\u001a\u000205X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a7\u0001\u00107\"\u0005\b\u00a8\u0001\u00109R\u001d\u0010\u00a9\u0001\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0001\u0010.\"\u0005\b\u00ab\u0001\u00100R)\u0010\u00ac\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t020\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010\u001a\"\u0005\b\u00ae\u0001\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00e3\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/MyOrderViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModelWithLogin;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "userDataUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;)V", "adapterCartModel", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "getAdapterCartModel", "()Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "setAdapterCartModel", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;)V", "allBrandIs", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllBrandsTypeResponse$BrandType;", "getAllBrandIs", "()Ljava/util/List;", "allSubCategoriesId", "Lcom/intellihealth/truemeds/data/model/user/GetAllSubCategoryTypeResponse$SubCategoryType;", "getAllSubCategoriesId", "appliedFilterCount", "Landroidx/lifecycle/MutableLiveData;", "", "getAppliedFilterCount", "()Landroidx/lifecycle/MutableLiveData;", "setAppliedFilterCount", "(Landroidx/lifecycle/MutableLiveData;)V", "brandBottomSheetListTemp", "getBrandBottomSheetListTemp", "setBrandBottomSheetListTemp", "brandsLocal", "getBrandsLocal", "setBrandsLocal", "(Ljava/util/List;)V", "cartData", "Lcom/intellihealth/salt/models/CartModel;", "getCartData", "setCartData", "categoryBottomSheetListTemp", "Lcom/intellihealth/truemeds/data/model/home/ChildCategoryModel;", "getCategoryBottomSheetListTemp", "setCategoryBottomSheetListTemp", "categoryTypePreviousPos", "getCategoryTypePreviousPos", "()I", "setCategoryTypePreviousPos", "(I)V", "childCategoryList", "", "getChildCategoryList", "childCategoryType", "", "getChildCategoryType", "()Ljava/lang/String;", "setChildCategoryType", "(Ljava/lang/String;)V", "clickedOnPage", "getClickedOnPage", "setClickedOnPage", "currentProductCode", "getCurrentProductCode", "setCurrentProductCode", "emptyList", "getEmptyList", "setEmptyList", "eventLoginOpenBottomSheet", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "getEventLoginOpenBottomSheet", "()Landroidx/lifecycle/LiveData;", "eventMessage", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessage", "eventSendItemImpression", "getEventSendItemImpression", "explicitLoading", "", "kotlin.jvm.PlatformType", "getExplicitLoading", "filteredCategoryId", "filteredCategoryName", "getFilteredCategoryName", "setFilteredCategoryName", "filteredCollectionId", "Ljava/lang/Integer;", "filteredLevel", "filteredPostion", "getFilteredPostion", "setFilteredPostion", "filterlistType", "getFilterlistType", "setFilterlistType", "fitteredSubCategoryName", "getFitteredSubCategoryName", "setFitteredSubCategoryName", "highLightPosition", "getHighLightPosition", "setHighLightPosition", "isCategoryFilterOn", "()Z", "setCategoryFilterOn", "(Z)V", "isEmptyData", "isNextPageAvailable", "setNextPageAvailable", "isOTCBannerClicked", "setOTCBannerClicked", "lastScrollPosition", "getLastScrollPosition", "setLastScrollPosition", "lastScrollPosition1", "getLastScrollPosition1", "setLastScrollPosition1", "listOfBrands", "Ljava/util/ArrayList;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "openLoginBottomSheet", "orderTypeActualSelectedPos", "getOrderTypeActualSelectedPos", "setOrderTypeActualSelectedPos", "orderTypePreviousPos", "getOrderTypePreviousPos", "setOrderTypePreviousPos", "otcHighLightedCategoryPosition", "getOtcHighLightedCategoryPosition", "setOtcHighLightedCategoryPosition", "patientTypeValue", "getPatientTypeValue", "setPatientTypeValue", "patientsSelectedListTemp", "getPatientsSelectedListTemp", "setPatientsSelectedListTemp", "personalCareList", "Lcom/intellihealth/truemeds/data/model/home/PersonalCareCategoryModel;", "getPersonalCareList", "setPersonalCareList", "preSyncProducts", "getPreSyncProducts", "setPreSyncProducts", "productList", "getProductList", "setProductList", "sendItemImpression", "showMessage", "showShimmer", "getShowShimmer", "setShowShimmer", "showShimmerLiveData", "getShowShimmerLiveData", "subCategoryBottomSheetListTemp", "getSubCategoryBottomSheetListTemp", "setSubCategoryBottomSheetListTemp", "subCategoryTypePreviousPos", "getSubCategoryTypePreviousPos", "setSubCategoryTypePreviousPos", "superCategoryID", "getSuperCategoryID", "setSuperCategoryID", "superCategoryType", "getSuperCategoryType", "setSuperCategoryType", "topDealPosition", "getTopDealPosition", "setTopDealPosition", "topDeals", "getTopDeals", "setTopDeals", "bottomSheetApplyClick", "", "view", "Landroid/view/View;", "bottomSheetClearClick", "eventCallPharmacistClickedEvent", "filterListClick", "childCategories", "category", "alsoSuperCategoryRequired", "generateProductList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilterCount", "getMedicineCount", "productCode", "getOtcProductsByCategory", "page", "categoryID", "type", "collectionId", "isBrandOnly", "isListPaginating", "brands", "isFilterOn", "isFromRadioOptionClick", "bannerClickedFilterName", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "sendCategoryImpression", "position", "sendFilterClickedEvent", "mxFilterClicked", "Lcom/intellihealth/truemeds/mvvm/data/mixpanel/MXFilterClicked;", "sendHomePageBannerClickedEvent", "mxBannerClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxBannerClicked;", "sendProductItemImpressionEventToMixPanelForLaterTen", "sendProductItemImpressionEventToMixPanelForTopSix", "setCheckboxBrandClicked", "setRadioCategoryClicked", "setRadioSubCategoryClicked", "syncExistingCartProducts", "syncExistingSubCategories", "subCategoryTypes", "syncExistingTopDealsProducts", "syncPreviousSelectedBrands", "updateIds", "id", "updateSelectedBrands", "brand", "Lkotlin/collections/ArrayList;", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MyOrderViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModelWithLogin implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmer;
    private int lastScrollPosition = 0;
    private int lastScrollPosition1 = 0;
    private int orderTypePreviousPos = 0;
    private int orderTypeActualSelectedPos = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> patientsSelectedListTemp;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientTypeValue = "";
    private int highLightPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> filterlistType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> categoryBottomSheetListTemp;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType>> subCategoryBottomSheetListTemp;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType>> brandBottomSheetListTemp;
    private int categoryTypePreviousPos = -1;
    private int subCategoryTypePreviousPos = -1;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType> listOfBrands = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmptyData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> childCategoryList = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel adapterCartModel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String filteredLevel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String filteredCategoryId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer filteredCollectionId = 0;
    private int filteredPostion = -1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filteredCategoryName = "All";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fitteredSubCategoryName;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType> brandsLocal;
    private int otcHighLightedCategoryPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openLoginBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentProductCode = "";
    private int topDealPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType> allBrandIs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType> allSubCategoriesId = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> appliedFilterCount;
    private boolean isCategoryFilterOn = false;
    private boolean isOTCBannerClicked = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String childCategoryType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> sendItemImpression = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> explicitLoading = null;
    private int superCategoryID = 1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String superCategoryType = "";
    private boolean isNextPageAvailable = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.PersonalCareCategoryModel> personalCareList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> productList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> emptyList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> preSyncProducts;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> topDeals;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> cartData;
    
    @javax.inject.Inject()
    public MyOrderViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmer() {
        return null;
    }
    
    public final void setShowShimmer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final int getLastScrollPosition() {
        return 0;
    }
    
    public final void setLastScrollPosition(int p0) {
    }
    
    public final int getLastScrollPosition1() {
        return 0;
    }
    
    public final void setLastScrollPosition1(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    public final int getOrderTypePreviousPos() {
        return 0;
    }
    
    public final void setOrderTypePreviousPos(int p0) {
    }
    
    public final int getOrderTypeActualSelectedPos() {
        return 0;
    }
    
    public final void setOrderTypeActualSelectedPos(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getPatientsSelectedListTemp() {
        return null;
    }
    
    public final void setPatientsSelectedListTemp(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientTypeValue() {
        return null;
    }
    
    public final void setPatientTypeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getHighLightPosition() {
        return 0;
    }
    
    public final void setHighLightPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFilterlistType() {
        return null;
    }
    
    public final void setFilterlistType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> getCategoryBottomSheetListTemp() {
        return null;
    }
    
    public final void setCategoryBottomSheetListTemp(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType>> getSubCategoryBottomSheetListTemp() {
        return null;
    }
    
    public final void setSubCategoryBottomSheetListTemp(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType>> getBrandBottomSheetListTemp() {
        return null;
    }
    
    public final void setBrandBottomSheetListTemp(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType>> p0) {
    }
    
    public final int getCategoryTypePreviousPos() {
        return 0;
    }
    
    public final void setCategoryTypePreviousPos(int p0) {
    }
    
    public final int getSubCategoryTypePreviousPos() {
        return 0;
    }
    
    public final void setSubCategoryTypePreviousPos(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmptyData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel>> getChildCategoryList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getAdapterCartModel() {
        return null;
    }
    
    public final void setAdapterCartModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel p0) {
    }
    
    public final int getFilteredPostion() {
        return 0;
    }
    
    public final void setFilteredPostion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilteredCategoryName() {
        return null;
    }
    
    public final void setFilteredCategoryName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFitteredSubCategoryName() {
        return null;
    }
    
    public final void setFitteredSubCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType> getBrandsLocal() {
        return null;
    }
    
    public final void setBrandsLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType> p0) {
    }
    
    public final int getOtcHighLightedCategoryPosition() {
        return 0;
    }
    
    public final void setOtcHighLightedCategoryPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventLoginOpenBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentProductCode() {
        return null;
    }
    
    public final void setCurrentProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTopDealPosition() {
        return 0;
    }
    
    public final void setTopDealPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse.BrandType> getAllBrandIs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType> getAllSubCategoriesId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAppliedFilterCount() {
        return null;
    }
    
    public final void setAppliedFilterCount(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final boolean isCategoryFilterOn() {
        return false;
    }
    
    public final void setCategoryFilterOn(boolean p0) {
    }
    
    public final boolean isOTCBannerClicked() {
        return false;
    }
    
    public final void setOTCBannerClicked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChildCategoryType() {
        return null;
    }
    
    public final void setChildCategoryType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventSendItemImpression() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getExplicitLoading() {
        return null;
    }
    
    public final int getSuperCategoryID() {
        return 0;
    }
    
    public final void setSuperCategoryID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSuperCategoryType() {
        return null;
    }
    
    public final void setSuperCategoryType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isNextPageAvailable() {
        return false;
    }
    
    public final void setNextPageAvailable(boolean p0) {
    }
    
    /**
     * Initialize Login
     * If TrueCaller bottomsheet can't be shown(this is returned by TrueCaller SDK), then open OTP based login bottomsheet
     */
    public final void bottomSheetClearClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void bottomSheetApplyClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final int getFilterCount() {
        return 0;
    }
    
    public final void filterListClick(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> childCategories, @org.jetbrains.annotations.Nullable()
    java.lang.String category, boolean alsoSuperCategoryRequired) {
    }
    
    public final void setRadioCategoryClicked(int position) {
    }
    
    public final void setRadioSubCategoryClicked(int position) {
    }
    
    public final void setCheckboxBrandClicked(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.PersonalCareCategoryModel> getPersonalCareList() {
        return null;
    }
    
    public final void setPersonalCareList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.PersonalCareCategoryModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> getProductList() {
        return null;
    }
    
    public final void setProductList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> getEmptyList() {
        return null;
    }
    
    public final void setEmptyList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getPreSyncProducts() {
        return null;
    }
    
    public final void setPreSyncProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> getTopDeals() {
        return null;
    }
    
    public final void setTopDeals(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> getCartData() {
        return null;
    }
    
    public final void setCartData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> p0) {
    }
    
    public final void getOtcProductsByCategory(int page, int categoryID, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int collectionId, boolean isBrandOnly, boolean isListPaginating, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> brands, boolean isFilterOn, boolean isFromRadioOptionClick, @org.jetbrains.annotations.Nullable()
    java.lang.String bannerClickedFilterName) {
    }
    
    private final void syncPreviousSelectedBrands() {
    }
    
    /**
     * This function will fetch the local database cart list and compare with the remote list
     */
    public final void syncExistingCartProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> preSyncProducts) {
    }
    
    public final void syncExistingTopDealsProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> preSyncProducts) {
    }
    
    private final void syncExistingSubCategories(java.util.List<com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse.SubCategoryType> subCategoryTypes) {
    }
    
    @java.lang.Override()
    public void onResume(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public final void updateIds(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String superCategoryType, int collectionId) {
    }
    
    /**
     * When user clicks on banner image then this method will be invoked and mark the list item as selected if any
     */
    public final void updateSelectedBrands(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> brand) {
    }
    
    private final java.lang.Object generateProductList(java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> preSyncProducts, kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> $completion) {
        return null;
    }
    
    public final int getMedicineCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
        return 0;
    }
    
    public final void sendHomePageBannerClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxBannerClicked mxBannerClicked) {
    }
    
    public final void sendFilterClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.mixpanel.MXFilterClicked mxFilterClicked) {
    }
    
    public final void sendCategoryImpression(int position) {
    }
    
    public final void sendProductItemImpressionEventToMixPanelForTopSix(int position) {
    }
    
    public final void sendProductItemImpressionEventToMixPanelForLaterTen(int position) {
    }
    
    public final void eventCallPharmacistClickedEvent() {
    }
}