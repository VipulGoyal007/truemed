package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00f8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\u00a9\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ab\u0001\u001a\u00020\r2\u0007\u0010\u00ac\u0001\u001a\u00020\u0019J\u0011\u0010\u00ad\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ac\u0001\u001a\u00020\u0019J\b\u0010\u00ae\u0001\u001a\u00030\u00aa\u0001J2\u0010\u00af\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ac\u0001\u001a\u00020\u00192\u0007\u0010\u00b0\u0001\u001a\u00020S2\r\u0010\u00b1\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0007\u0010\u00ab\u0001\u001a\u00020\rJ\u0011\u0010\u00b2\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00b3\u0001\u001a\u00020\rJ\b\u0010\u00b4\u0001\u001a\u00030\u00aa\u0001J\b\u0010\u00b5\u0001\u001a\u00030\u00aa\u0001J\b\u0010\u00b6\u0001\u001a\u00030\u00aa\u0001J\u0011\u0010\u00b6\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00b8\u0001\u001a\u00020\rJ\b\u0010\u00b9\u0001\u001a\u00030\u00aa\u0001J\u0011\u0010\u00ba\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00bb\u0001\u001a\u00020\u0013J\b\u0010\u00bc\u0001\u001a\u00030\u00aa\u0001J\u0011\u0010\u00bd\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00be\u0001\u001a\u00020\u0019J$\u0010\u00bf\u0001\u001a\u00030\u00aa\u00012\t\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u00192\u0007\u0010\u00ab\u0001\u001a\u00020\rH\u0002\u00a2\u0006\u0003\u0010\u00c0\u0001J\u0007\u0010\u00c1\u0001\u001a\u00020\u0019J\u0011\u0010\u00c2\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00ac\u0001\u001a\u00020\u0019J\b\u0010\u00c3\u0001\u001a\u00030\u00aa\u0001J\b\u0010\u00c4\u0001\u001a\u00030\u00aa\u0001J#\u0010\u00c5\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00c6\u0001\u001a\u0002052\u0007\u0010\u00c7\u0001\u001a\u00020\u00132\u0007\u0010\u00c8\u0001\u001a\u00020\u0013J\u001a\u0010\u00c9\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ca\u0001\u001a\u00020\r2\u0007\u0010\u00cb\u0001\u001a\u00020\rJ\b\u0010\u00cc\u0001\u001a\u00030\u00aa\u0001J\n\u0010\u00cd\u0001\u001a\u00030\u00aa\u0001H\u0002J-\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u00132\u0007\u0010\u00cf\u0001\u001a\u00020\r2\u0007\u0010\u00ac\u0001\u001a\u00020\u00192\u0007\u0010\u00d0\u0001\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0003\u0010\u00d1\u0001J#\u0010\u00d2\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00cf\u0001\u001a\u00020\r2\u0007\u0010\u00ac\u0001\u001a\u00020\u00192\u0007\u0010\u00bb\u0001\u001a\u00020\u0019J\u0012\u0010\u00d3\u0001\u001a\u00030\u00aa\u00012\b\u0010\u00d4\u0001\u001a\u00030\u00d5\u0001J\b\u0010\u00d6\u0001\u001a\u00030\u00aa\u0001J\u001a\u0010\u00d7\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00d8\u0001\u001a\u00020\r2\u0007\u0010\u00d9\u0001\u001a\u00020\rJ\u0011\u0010\u00da\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00db\u0001\u001a\u00020SJ\b\u0010\u00dc\u0001\u001a\u00030\u00aa\u0001J\b\u0010\u00dd\u0001\u001a\u00030\u00aa\u0001J-\u0010\u00de\u0001\u001a\u00030\u00aa\u00012\b\u0010\u00df\u0001\u001a\u00030\u00e0\u00012\u0007\u0010\u00e1\u0001\u001a\u00020\u00132\u0007\u0010\u00e2\u0001\u001a\u00020\u00192\u0007\u0010\u00e3\u0001\u001a\u00020SJ\u0013\u0010\u00e4\u0001\u001a\u00030\u00aa\u00012\t\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\rJ.\u0010\u00e5\u0001\u001a\u0005\u0018\u00010\u00e6\u00012\b\u0010\u00e7\u0001\u001a\u00030\u00e8\u00012\u000f\u0010\u00e9\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\fH\u0082@\u00a2\u0006\u0003\u0010\u00ea\u0001R&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R(\u0010!\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00130\u00130\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u001e\u0010%\u001a\u00020&8\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R-\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u000205`6\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0:8F\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R\u001d\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0;0:8F\u00a2\u0006\u0006\u001a\u0004\bA\u0010>R-\u0010B\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0C0;0:8F\u00a2\u0006\u0006\u001a\u0004\bD\u0010>R\u001a\u0010E\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0015\"\u0004\bG\u0010\u0017R\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR \u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010\u0011R \u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u000f\"\u0004\bT\u0010\u0011R\u001a\u0010U\u001a\u00020SX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001f\u0010Y\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010S0S0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010\u000fR\u001f\u0010Z\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010S0S0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u000fR(\u0010[\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010S0S0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u000f\"\u0004\b\\\u0010\u0011R \u0010]\u001a\b\u0012\u0004\u0012\u00020\r0^X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR&\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u000f\"\u0004\be\u0010\u0011R\u001a\u0010f\u001a\u00020gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010m\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010-\"\u0004\bo\u0010/R\u001a\u0010p\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010-\"\u0004\br\u0010/R\u001c\u0010s\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010-\"\u0004\bu\u0010/R\u001a\u0010v\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010-\"\u0004\bx\u0010/R&\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u000f\"\u0004\b|\u0010\u0011R-\u0010}\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0C0;0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010\u000fR\'\u0010\u007f\u001a\u000b\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010\u0085\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u001b\"\u0005\b\u0087\u0001\u0010\u001dR&\u0010\u0088\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u000f\"\u0005\b\u008b\u0001\u0010\u0011R\u001d\u0010\u008c\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u0015\"\u0005\b\u008e\u0001\u0010\u0017R\u001f\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u000fR\u001d\u0010\u0091\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u0015\"\u0005\b\u0093\u0001\u0010\u0017R\"\u0010\u0094\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010\f0\u000b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010\u000fR+\u0010\u0097\u0001\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\r0\r0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\u000f\"\u0005\b\u0099\u0001\u0010\u0011R#\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020S0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u000f\"\u0005\b\u009c\u0001\u0010\u0011R#\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020S0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u000f\"\u0005\b\u009f\u0001\u0010\u0011R\u001f\u0010\u00a0\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0;0\u000b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\u000fR#\u0010\u00a2\u0001\u001a\b\u0012\u0004\u0012\u00020S0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0001\u0010\u000f\"\u0005\b\u00a4\u0001\u0010\u0011R&\u0010\u00a5\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u00a6\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a7\u0001\u0010\u0082\u0001\"\u0006\b\u00a8\u0001\u0010\u0084\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00eb\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModelWithLogin;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "userUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "(Landroid/content/Context;Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;)V", "_medicineList", "Landroidx/lifecycle/MutableLiveData;", "", "", "get_medicineList", "()Landroidx/lifecycle/MutableLiveData;", "set_medicineList", "(Landroidx/lifecycle/MutableLiveData;)V", "addressCountRx", "", "getAddressCountRx", "()I", "setAddressCountRx", "(I)V", "addressIdRx", "", "getAddressIdRx", "()J", "setAddressIdRx", "(J)V", "apiType", "getApiType", "setApiType", "cartCountValueFromDB", "kotlin.jvm.PlatformType", "getCartCountValueFromDB", "setCartCountValueFromDB", "cartUseCase", "Lcom/intellihealth/truemeds/domain/usecase/CartUseCase;", "getCartUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/CartUseCase;", "setCartUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/CartUseCase;)V", "clickedOnPage", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "currentPageName", "getCurrentPageName", "setCurrentPageName", "currentSelectedPrescriptionList", "Ljava/util/HashMap;", "Lcom/intellihealth/truemeds/data/model/prescription/ActiveRx;", "Lkotlin/collections/HashMap;", "getCurrentSelectedPrescriptionList", "()Ljava/util/HashMap;", "eventLoginOpenBottomSheet", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "getEventLoginOpenBottomSheet", "()Landroidx/lifecycle/LiveData;", "eventMessageForPrescription", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessageForPrescription", "eventPastRXClicked", "Lkotlin/Pair;", "getEventPastRXClicked", "existingCartItemCount", "getExistingCartItemCount", "setExistingCartItemCount", "firebaseEvent", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEvent", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEvent", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "headerType", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "getHeaderType", "setHeaderType", "isExpandable", "", "setExpandable", "isFirstTimeScreenVisited", "()Z", "setFirstTimeScreenVisited", "(Z)V", "isLoadingForPatient", "isLoadingForPrescriptions", "isPastPrescriptionSelected", "setPastPrescriptionSelected", "list", "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "medicineOgList", "getMedicineOgList", "setMedicineOgList", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "openLoginBottomSheet", "orderIdEvent", "getOrderIdEvent", "setOrderIdEvent", "orderPageSection", "getOrderPageSection", "setOrderPageSection", "orderPreviousStage", "getOrderPreviousStage", "setOrderPreviousStage", "pageSection", "getPageSection", "setPageSection", "pastPrescription", "Lcom/intellihealth/truemeds/data/model/prescription/PastPrescriptions;", "getPastPrescription", "setPastPrescription", "pastRXClicked", "getPastRXClicked", "patientDetails", "Lcom/intellihealth/salt/models/DropDownDefaultModel;", "getPatientDetails", "()Ljava/util/List;", "setPatientDetails", "(Ljava/util/List;)V", "patientIdRx", "getPatientIdRx", "setPatientIdRx", "patientList", "Lcom/intellihealth/truemeds/presentation/model/GetAllPrescriptionDataModel;", "getPatientList", "setPatientList", "patientsCountRx", "getPatientsCountRx", "setPatientsCountRx", "prescriptionList", "getPrescriptionList", "prescriptionUploadedCount", "getPrescriptionUploadedCount", "setPrescriptionUploadedCount", "prescriptions", "Lcom/intellihealth/truemeds/data/model/orderflow/OrderRxInfo;", "getPrescriptions", "proceedButtonTxt", "getProceedButtonTxt", "setProceedButtonTxt", "showDoNotHavePrescription", "getShowDoNotHavePrescription", "setShowDoNotHavePrescription", "showMedicineList", "getShowMedicineList", "setShowMedicineList", "showMessageForPrescription", "getShowMessageForPrescription", "showPastPrescriptionView", "getShowPastPrescriptionView", "setShowPastPrescriptionView", "uploadedPastRx", "", "getUploadedPastRx", "setUploadedPastRx", "autoSelectAddress", "", "customerId", "orderId", "autoSelectPatient", "callEventForPrescriptionUploadPageViewed", "deletePrescription", "edit", "images", "evenSendPrescriptionRemovedEvent", "activePage", "eventOrderPrescriptionUploaded", "eventUploadPrescriptionPrescriptionSelected", "getAddressInfo", "Lkotlinx/coroutines/Job;", "page", "getAllPatientDetails", "getAllPrescriptionDetails", "patientId", "getCartCount", "getDeletePrescriptionApiCalling", "prescriptionImageId", "getPatientInfo", "(Ljava/lang/Long;Ljava/lang/String;)V", "getPaymentMode", "getPrescriptionImages", "getRxPrescriptionImagesApiCalling", "getViewMoreLessList", "onPastCheckboxClicked", "item", "parentIndex", "childIndex", "onPastImageClicked", "tempId", "imageUrl", "proceedToCheckoutClick", "removeCoupon", "saveAddressId", "loggedInUserId", "addressId", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePatientId", "sendAddAddressClickedEventt", "mxAddAddressClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAddAddressClicked;", "setEventForPrescriptionUploadPageViewed", "setEventForUploadPrescriptionClicked", "uploadMethod", "pageName", "setUpUi", "isExpand", "setUpUploadButtonVisibility", "updateProceedButtonText", "uploadImage", "byteArray", "", "uploadedPrescriptionId", "prevOrderId", "isFromCamera", "uploadPastPrescriptionData", "uploadPrescriptionImages", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRxImageForCustomerIdResponse;", "request", "Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;", "imageIds", "(Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public class PrescriptionViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModelWithLogin implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase userUseCase = null;
    private int existingCartItemCount = 0;
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEvent;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.salt.models.DropDownDefaultModel> patientDetails;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showPastPrescriptionView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.prescription.PastPrescriptions>> pastPrescription;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> medicineOgList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _medicineList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel> patientList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isExpandable;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> prescriptionList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> prescriptions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<java.lang.String, java.lang.String>>> pastRXClicked = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.Long, com.intellihealth.truemeds.data.model.prescription.ActiveRx> currentSelectedPrescriptionList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> list;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingForPatient = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingForPrescriptions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessageForPrescription = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> cartCountValueFromDB;
    private int apiType = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openLoginBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPastPrescriptionSelected;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showDoNotHavePrescription;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showMedicineList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> headerType;
    private int addressCountRx = 0;
    private int patientsCountRx = 0;
    private long addressIdRx = 0L;
    private long patientIdRx = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String orderPageSection = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderPreviousStage;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pageSection = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String orderIdEvent = "";
    private int prescriptionUploadedCount = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> proceedButtonTxt;
    private boolean isFirstTimeScreenVisited = true;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Long> uploadedPastRx;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentPageName = "";
    @javax.inject.Inject()
    protected com.intellihealth.truemeds.domain.usecase.CartUseCase cartUseCase;
    
    @javax.inject.Inject()
    public PrescriptionViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase userUseCase) {
        super(null);
    }
    
    public final int getExistingCartItemCount() {
        return 0;
    }
    
    public final void setExistingCartItemCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEvent() {
        return null;
    }
    
    public final void setFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.salt.models.DropDownDefaultModel> getPatientDetails() {
        return null;
    }
    
    public final void setPatientDetails(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.salt.models.DropDownDefaultModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowPastPrescriptionView() {
        return null;
    }
    
    public final void setShowPastPrescriptionView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.prescription.PastPrescriptions>> getPastPrescription() {
        return null;
    }
    
    public final void setPastPrescription(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.prescription.PastPrescriptions>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getMedicineOgList() {
        return null;
    }
    
    public final void setMedicineOgList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> get_medicineList() {
        return null;
    }
    
    public final void set_medicineList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel> getPatientList() {
        return null;
    }
    
    public final void setPatientList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isExpandable() {
        return null;
    }
    
    public final void setExpandable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getPrescriptionList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> getPrescriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<java.lang.String, java.lang.String>>> getPastRXClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<java.lang.String, java.lang.String>>> getEventPastRXClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Long, com.intellihealth.truemeds.data.model.prescription.ActiveRx> getCurrentSelectedPrescriptionList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingForPatient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingForPrescriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getShowMessageForPrescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventMessageForPrescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCartCountValueFromDB() {
        return null;
    }
    
    public final void setCartCountValueFromDB(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final int getApiType() {
        return 0;
    }
    
    public final void setApiType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventLoginOpenBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPastPrescriptionSelected() {
        return null;
    }
    
    public final void setPastPrescriptionSelected(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowDoNotHavePrescription() {
        return null;
    }
    
    public final void setShowDoNotHavePrescription(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowMedicineList() {
        return null;
    }
    
    public final void setShowMedicineList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> getHeaderType() {
        return null;
    }
    
    public final void setHeaderType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> p0) {
    }
    
    public final int getAddressCountRx() {
        return 0;
    }
    
    public final void setAddressCountRx(int p0) {
    }
    
    public final int getPatientsCountRx() {
        return 0;
    }
    
    public final void setPatientsCountRx(int p0) {
    }
    
    public final long getAddressIdRx() {
        return 0L;
    }
    
    public final void setAddressIdRx(long p0) {
    }
    
    public final long getPatientIdRx() {
        return 0L;
    }
    
    public final void setPatientIdRx(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderPageSection() {
        return null;
    }
    
    public final void setOrderPageSection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderPreviousStage() {
        return null;
    }
    
    public final void setOrderPreviousStage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderIdEvent() {
        return null;
    }
    
    public final void setOrderIdEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPrescriptionUploadedCount() {
        return 0;
    }
    
    public final void setPrescriptionUploadedCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getProceedButtonTxt() {
        return null;
    }
    
    public final void setProceedButtonTxt(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final boolean isFirstTimeScreenVisited() {
        return false;
    }
    
    public final void setFirstTimeScreenVisited(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getUploadedPastRx() {
        return null;
    }
    
    public final void setUploadedPastRx(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentPageName() {
        return null;
    }
    
    public final void setCurrentPageName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.intellihealth.truemeds.domain.usecase.CartUseCase getCartUseCase() {
        return null;
    }
    
    protected final void setCartUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.CartUseCase p0) {
    }
    
    public final void getAllPatientDetails() {
    }
    
    public final void getAllPrescriptionDetails(int patientId) {
    }
    
    public final void onPastImageClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String tempId, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl) {
    }
    
    public final void onPastCheckboxClicked(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.prescription.ActiveRx item, int parentIndex, int childIndex) {
    }
    
    public final void getViewMoreLessList() {
    }
    
    public final void setUpUi(boolean isExpand) {
    }
    
    public final void uploadImage(@org.jetbrains.annotations.NotNull()
    byte[] byteArray, int uploadedPrescriptionId, long prevOrderId, boolean isFromCamera) {
    }
    
    public final void setEventForPrescriptionUploadPageViewed() {
    }
    
    public final void callEventForPrescriptionUploadPageViewed() {
    }
    
    public final void setEventForUploadPrescriptionClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String uploadMethod, @org.jetbrains.annotations.NotNull()
    java.lang.String pageName) {
    }
    
    public final void sendAddAddressClickedEventt(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked mxAddAddressClicked) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getPrescriptionImages(long orderId) {
        return null;
    }
    
    public final void deletePrescription(long orderId, boolean edit, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> images, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId) {
    }
    
    public final void uploadPastPrescriptionData(@org.jetbrains.annotations.Nullable()
    java.lang.String patientId) {
    }
    
    private final java.lang.Object uploadPrescriptionImages(com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest request, java.util.List<java.lang.Long> imageIds, kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.SaveRxImageForCustomerIdResponse> $completion) {
        return null;
    }
    
    public final void proceedToCheckoutClick() {
    }
    
    public final void getRxPrescriptionImagesApiCalling() {
    }
    
    public final void getDeletePrescriptionApiCalling(long prescriptionImageId) {
    }
    
    public final void getCartCount() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAddressInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String page) {
        return null;
    }
    
    public final void getAddressInfo() {
    }
    
    private final void getPatientInfo(java.lang.Long orderId, java.lang.String customerId) {
    }
    
    public final void updateProceedButtonText() {
    }
    
    public final void setUpUploadButtonVisibility() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job savePatientId(@org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, long orderId, long patientId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveAddressId(@org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, long orderId, long addressId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final void removeCoupon() {
    }
    
    public final long getPaymentMode() {
        return 0L;
    }
    
    public final void evenSendPrescriptionRemovedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String activePage) {
    }
    
    public final void eventOrderPrescriptionUploaded() {
    }
    
    public final void eventUploadPrescriptionPrescriptionSelected() {
    }
    
    public final void autoSelectAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId) {
    }
    
    public final void autoSelectPatient(long orderId) {
    }
}