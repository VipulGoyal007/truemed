package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\bK\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u00cc\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00ce\u0001\u001a\u00020\u00102\u0007\u0010\u00cf\u0001\u001a\u00020{J\b\u0010\u00d0\u0001\u001a\u00030\u00cd\u0001J\b\u0010\u00d1\u0001\u001a\u00030\u00cd\u0001J\u001c\u0010\u00d2\u0001\u001a\u00030\u00cd\u00012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00102\u0007\u0010\u00d3\u0001\u001a\u00020\'J\f\u0010\u00d4\u0001\u001a\u0005\u0018\u00010\u00d5\u0001H\u0002J\t\u0010\u00d6\u0001\u001a\u00020\u0010H\u0002J\u0010\u0010V\u001a\u00030\u00d7\u00012\u0007\u0010\u00cf\u0001\u001a\u00020{J\b\u0010\u008d\u0001\u001a\u00030\u00cd\u0001J\b\u0010\u00d8\u0001\u001a\u00030\u00cd\u0001J\u0011\u0010\u00d9\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00da\u0001\u001a\u00020QJ\t\u0010\u00db\u0001\u001a\u00020\'H\u0002J\u0011\u0010\u00dc\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00da\u0001\u001a\u00020QJ\n\u0010\u00dd\u0001\u001a\u00030\u00cd\u0001H\u0016J%\u0010\u00de\u0001\u001a\u00030\u00cd\u00012\u0007\u0010\u00df\u0001\u001a\u00020{2\u0007\u0010\u00ce\u0001\u001a\u00020{2\u0007\u0010\u00cf\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010\u00e0\u0001\u001a\u00030\u00cd\u00012\b\u0010\u00e1\u0001\u001a\u00030\u00e2\u0001J\u0012\u0010\u00e3\u0001\u001a\u00030\u00cd\u00012\b\u0010\u00e4\u0001\u001a\u00030\u00e5\u0001J\u0012\u0010\u00e6\u0001\u001a\u00030\u00cd\u00012\b\u0010\u00e7\u0001\u001a\u00030\u00e8\u0001J\u0012\u0010\u00e9\u0001\u001a\u00030\u00cd\u00012\b\u0010\u00ea\u0001\u001a\u00030\u00eb\u0001J\b\u0010\u00ec\u0001\u001a\u00030\u00cd\u0001J\u0012\u0010\u00ed\u0001\u001a\u00030\u00cd\u00012\b\u0010\u00ee\u0001\u001a\u00030\u00ef\u0001J*\u0010\u00f0\u0001\u001a\u00030\u00cd\u00012\n\u0010\u00f1\u0001\u001a\u0005\u0018\u00010\u00f2\u00012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00102\u0007\u0010\u00d3\u0001\u001a\u00020\'H\u0002R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\u0019\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0#8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R!\u0010/\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u0001000\t\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\fR\u001a\u00102\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR \u0010>\u001a\b\u0012\u0004\u0012\u0002030\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000eR \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR \u0010D\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\f\"\u0004\bF\u0010\u000eR\u001a\u0010G\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+R\u001a\u0010J\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001c\"\u0004\bL\u0010\u001eR\u001a\u0010M\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001c\"\u0004\bO\u0010\u001eR\u000e\u0010P\u001a\u00020QX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0#8F\u00a2\u0006\u0006\u001a\u0004\bU\u0010%R!\u0010V\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u0001000#8F\u00a2\u0006\u0006\u001a\u0004\bW\u0010%R \u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\f\"\u0004\b[\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\\\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010)\"\u0004\b]\u0010+R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\'0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010\fR\u001a\u0010_\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010)\"\u0004\b`\u0010+R\u001f\u0010a\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010\'0\'0\t\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010\fR(\u0010c\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010\'0\'0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\f\"\u0004\bd\u0010\u000eR\u001a\u0010e\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010)\"\u0004\bf\u0010+R\u001a\u0010g\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010)\"\u0004\bh\u0010+R(\u0010i\u001a\u0010\u0012\f\u0012\n b*\u0004\u0018\u00010\'0\'0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\f\"\u0004\bj\u0010\u000eR \u0010k\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\f\"\u0004\bm\u0010\u000eR \u0010n\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\f\"\u0004\bp\u0010\u000eR\u001a\u0010q\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010)\"\u0004\bs\u0010+R\u001a\u0010t\u001a\u00020uX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001a\u0010z\u001a\u00020{X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001d\u0010\u0080\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u001c\"\u0005\b\u0082\u0001\u0010\u001eR\u001d\u0010\u0083\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u001c\"\u0005\b\u0085\u0001\u0010\u001eR#\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\f\"\u0005\b\u0088\u0001\u0010\u000eR#\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\f\"\u0005\b\u008b\u0001\u0010\u000eR#\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\f\"\u0005\b\u008e\u0001\u0010\u000eR\u001d\u0010\u008f\u0001\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010)\"\u0005\b\u0091\u0001\u0010+R#\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\f\"\u0005\b\u0094\u0001\u0010\u000eR#\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010\f\"\u0005\b\u0097\u0001\u0010\u000eR\u001d\u0010\u0098\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u001c\"\u0005\b\u009a\u0001\u0010\u001eR\u0019\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u0002030\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010\fR#\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\'0\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\f\"\u0005\b\u009f\u0001\u0010\u000eR#\u0010\u00a0\u0001\u001a\b\u0012\u0004\u0012\u00020\'0\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\f\"\u0005\b\u00a2\u0001\u0010\u000eR\u001f\u0010\u00a3\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a4\u0001\u0010\fR#\u0010\u00a5\u0001\u001a\b\u0012\u0004\u0012\u00020\'0\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0001\u0010\f\"\u0005\b\u00a7\u0001\u0010\u000eR\u0019\u0010\u00a8\u0001\u001a\b\u0012\u0004\u0012\u00020\'0#8F\u00a2\u0006\u0007\u001a\u0005\b\u00a9\u0001\u0010%R#\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ab\u0001\u0010\f\"\u0005\b\u00ac\u0001\u0010\u000eR#\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ae\u0001\u0010\f\"\u0005\b\u00af\u0001\u0010\u000eR\u001d\u0010\u00b0\u0001\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b1\u0001\u0010)\"\u0005\b\u00b2\u0001\u0010+R\u001d\u0010\u00b3\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b4\u0001\u0010\u001c\"\u0005\b\u00b5\u0001\u0010\u001eR\u001d\u0010\u00b6\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b7\u0001\u0010\u001c\"\u0005\b\u00b8\u0001\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b9\u0001\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u00ba\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bb\u0001\u0010\u001c\"\u0005\b\u00bc\u0001\u0010\u001eR\u001d\u0010\u00bd\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00be\u0001\u0010\u001c\"\u0005\b\u00bf\u0001\u0010\u001eR\u001d\u0010\u00c0\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0001\u0010\u001c\"\u0005\b\u00c2\u0001\u0010\u001eR\u001d\u0010\u00c3\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c4\u0001\u0010\u001c\"\u0005\b\u00c5\u0001\u0010\u001eR \u0010\u00c6\u0001\u001a\u00030\u00c7\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c8\u0001\u0010\u00c9\u0001\"\u0006\b\u00ca\u0001\u0010\u00cb\u0001\u00a8\u0006\u00f3\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/ManageAddressViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "useCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "homePageUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;)V", "_addressItemList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "get_addressItemList", "()Landroidx/lifecycle/MutableLiveData;", "set_addressItemList", "(Landroidx/lifecycle/MutableLiveData;)V", "address", "", "getAddress", "setAddress", "address2", "getAddress2", "setAddress2", "address2Data", "Lcom/intellihealth/truemeds/data/model/errormessage/ErrorMessageData;", "getAddress2Data", "setAddress2Data", "addressChangedFrom", "getAddressChangedFrom", "()Ljava/lang/String;", "setAddressChangedFrom", "(Ljava/lang/String;)V", "addressData", "getAddressData", "setAddressData", "addressItemList", "Landroidx/lifecycle/LiveData;", "getAddressItemList", "()Landroidx/lifecycle/LiveData;", "addressLine1Edited", "", "getAddressLine1Edited", "()Z", "setAddressLine1Edited", "(Z)V", "addressLine2Edited", "getAddressLine2Edited", "setAddressLine2Edited", "addressList", "", "getAddressList", "apiType", "", "getApiType", "()I", "setApiType", "(I)V", "callSaveAddress", "getCallSaveAddress", "setCallSaveAddress", "chipData", "getChipData", "setChipData", "chipTypeSelected", "getChipTypeSelected", "setChipTypeSelected", "city", "getCity", "setCity", "cityData", "getCityData", "setCityData", "cityEdited", "getCityEdited", "setCityEdited", "cityTxt", "getCityTxt", "setCityTxt", "clickedOnPage", "getClickedOnPage", "setClickedOnPage", "context", "Landroid/content/Context;", "eventMessage", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "Lcom/intellihealth/truemeds/data/utils/MessageConstant;", "getEventMessage", "getManageAddressData", "getGetManageAddressData", "headerType", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "getHeaderType", "setHeaderType", "isEditAddress", "setEditAddress", "isEditClick", "isHomeAddressAdded", "setHomeAddressAdded", "isLoading", "kotlin.jvm.PlatformType", "isLocationPermissionGranted", "setLocationPermissionGranted", "isOfficeAddressAdded", "setOfficeAddressAdded", "isPinCodeGet", "setPinCodeGet", "isPincodeServicable", "setPincodeServicable", "landMark", "getLandMark", "setLandMark", "landMarkData", "getLandMarkData", "setLandMarkData", "landmarkEdited", "getLandmarkEdited", "setLandmarkEdited", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "newlyCreatedAddId", "", "getNewlyCreatedAddId", "()J", "setNewlyCreatedAddId", "(J)V", "ogCity", "getOgCity", "setOgCity", "ogState", "getOgState", "setOgState", "other", "getOther", "setOther", "otherError", "getOtherError", "setOtherError", "patientExperiment", "getPatientExperiment", "setPatientExperiment", "pinCodeEdited", "getPinCodeEdited", "setPinCodeEdited", "pincode", "getPincode", "setPincode", "pincodeData", "getPincodeData", "setPincodeData", "pincodeFillType", "getPincodeFillType", "setPincodeFillType", "requestFocus", "getRequestFocus", "showManageAddressListView", "getShowManageAddressListView", "setShowManageAddressListView", "showManageAddressView", "getShowManageAddressView", "setShowManageAddressView", "showMessage", "getShowMessage", "showShimmer", "getShowShimmer", "setShowShimmer", "showShimmerLiveData", "getShowShimmerLiveData", "state", "getState", "setState", "stateData", "getStateData", "setStateData", "stateEdited", "getStateEdited", "setStateEdited", "stateTxt", "getStateTxt", "setStateTxt", "typeOfAddress", "getTypeOfAddress", "setTypeOfAddress", "userLocationClick", "userTypeAddressLine2", "getUserTypeAddressLine2", "setUserTypeAddressLine2", "userTypeCity", "getUserTypeCity", "setUserTypeCity", "userTypePinCode", "getUserTypePinCode", "setUserTypePinCode", "userTypeState", "getUserTypeState", "setUserTypeState", "validator", "Lcom/intellihealth/truemeds/presentation/utils/Validator;", "getValidator", "()Lcom/intellihealth/truemeds/presentation/utils/Validator;", "setValidator", "(Lcom/intellihealth/truemeds/presentation/utils/Validator;)V", "deleteAddress", "", "addressId", "customerId", "deleteAddressApiCalling", "doSaveButtonClickApiCalling", "fetchPincodeAvailablility", "fromLocationClick", "getAddressJsonObj", "Lcom/google/gson/JsonObject;", "getAddressTransition", "Lkotlinx/coroutines/Job;", "hideLoader", "initContext", "mContext", "isAllFieldsValidate", "onSaveButtonClicked", "onSelectLocationClicked", "saveAddressForOrder", "orderId", "sendAddAddressClickedEvent", "mxAddAddressClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAddAddressClicked;", "sendAddressAddedEvent", "mxAddressAdded", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAddressAdded;", "sendAddressEditedEvent", "mxAddressEdited", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAddressEdited;", "sendUseLocationClickedEvent", "mxModel", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxUseLocationClicked;", "showLoader", "updateAddressType", "type", "Lcom/intellihealth/truemeds/domain/enums/AddressType;", "updateData", "response", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public class ManageAddressViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase useCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> addressList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> _addressItemList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cityTxt = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String stateTxt = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEditClick = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLocationPermissionGranted;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showManageAddressView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showManageAddressListView;
    private boolean userLocationClick = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userTypeCity = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userTypeState = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userTypeAddressLine2 = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userTypePinCode = "";
    private boolean isPinCodeGet = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPincodeServicable;
    private int apiType = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> address;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> address2;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> pincode;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> landMark;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> city;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> state;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> other;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> chipTypeSelected;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.utils.Validator validator;
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientExperiment;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> addressData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> address2Data;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> otherError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> pincodeData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> cityData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> stateData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> chipData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> landMarkData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> headerType;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    private boolean callSaveAddress = false;
    private boolean isHomeAddressAdded = false;
    private boolean isOfficeAddressAdded = false;
    private boolean isEditAddress = false;
    private long newlyCreatedAddId = -1L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> requestFocus = null;
    private boolean addressLine1Edited = false;
    private boolean addressLine2Edited = false;
    private boolean landmarkEdited = false;
    private boolean cityEdited = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    private boolean pinCodeEdited = true;
    private boolean stateEdited = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String typeOfAddress = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ogState = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ogCity = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addressChangedFrom = "";
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pincodeFillType = "Pincode typed";
    
    @javax.inject.Inject()
    public ManageAddressViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase useCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> getAddressList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> getGetManageAddressData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> get_addressItemList() {
        return null;
    }
    
    public final void set_addressItemList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityTxt() {
        return null;
    }
    
    public final void setCityTxt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStateTxt() {
        return null;
    }
    
    public final void setStateTxt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> getAddressItemList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> getShowMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEditClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLocationPermissionGranted() {
        return null;
    }
    
    public final void setLocationPermissionGranted(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmer() {
        return null;
    }
    
    public final void setShowShimmer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowManageAddressView() {
        return null;
    }
    
    public final void setShowManageAddressView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowManageAddressListView() {
        return null;
    }
    
    public final void setShowManageAddressListView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserTypeCity() {
        return null;
    }
    
    public final void setUserTypeCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserTypeState() {
        return null;
    }
    
    public final void setUserTypeState(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserTypeAddressLine2() {
        return null;
    }
    
    public final void setUserTypeAddressLine2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserTypePinCode() {
        return null;
    }
    
    public final void setUserTypePinCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isPinCodeGet() {
        return false;
    }
    
    public final void setPinCodeGet(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPincodeServicable() {
        return null;
    }
    
    public final void setPincodeServicable(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final int getApiType() {
        return 0;
    }
    
    public final void setApiType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAddress2() {
        return null;
    }
    
    public final void setAddress2(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPincode() {
        return null;
    }
    
    public final void setPincode(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLandMark() {
        return null;
    }
    
    public final void setLandMark(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOther() {
        return null;
    }
    
    public final void setOther(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getChipTypeSelected() {
        return null;
    }
    
    public final void setChipTypeSelected(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.utils.Validator getValidator() {
        return null;
    }
    
    public final void setValidator(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.utils.Validator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientExperiment() {
        return null;
    }
    
    public final void setPatientExperiment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getAddressData() {
        return null;
    }
    
    public final void setAddressData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getAddress2Data() {
        return null;
    }
    
    public final void setAddress2Data(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getOtherError() {
        return null;
    }
    
    public final void setOtherError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getPincodeData() {
        return null;
    }
    
    public final void setPincodeData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getCityData() {
        return null;
    }
    
    public final void setCityData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getStateData() {
        return null;
    }
    
    public final void setStateData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getChipData() {
        return null;
    }
    
    public final void setChipData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getLandMarkData() {
        return null;
    }
    
    public final void setLandMarkData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> getHeaderType() {
        return null;
    }
    
    public final void setHeaderType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final boolean getCallSaveAddress() {
        return false;
    }
    
    public final void setCallSaveAddress(boolean p0) {
    }
    
    public final boolean isHomeAddressAdded() {
        return false;
    }
    
    public final void setHomeAddressAdded(boolean p0) {
    }
    
    public final boolean isOfficeAddressAdded() {
        return false;
    }
    
    public final void setOfficeAddressAdded(boolean p0) {
    }
    
    public final boolean isEditAddress() {
        return false;
    }
    
    public final void setEditAddress(boolean p0) {
    }
    
    public final long getNewlyCreatedAddId() {
        return 0L;
    }
    
    public final void setNewlyCreatedAddId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRequestFocus() {
        return null;
    }
    
    public final boolean getAddressLine1Edited() {
        return false;
    }
    
    public final void setAddressLine1Edited(boolean p0) {
    }
    
    public final boolean getAddressLine2Edited() {
        return false;
    }
    
    public final void setAddressLine2Edited(boolean p0) {
    }
    
    public final boolean getLandmarkEdited() {
        return false;
    }
    
    public final void setLandmarkEdited(boolean p0) {
    }
    
    public final boolean getCityEdited() {
        return false;
    }
    
    public final void setCityEdited(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getPinCodeEdited() {
        return false;
    }
    
    public final void setPinCodeEdited(boolean p0) {
    }
    
    public final boolean getStateEdited() {
        return false;
    }
    
    public final void setStateEdited(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypeOfAddress() {
        return null;
    }
    
    public final void setTypeOfAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOgState() {
        return null;
    }
    
    public final void setOgState(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOgCity() {
        return null;
    }
    
    public final void setOgCity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressChangedFrom() {
        return null;
    }
    
    public final void setAddressChangedFrom(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getPincodeFillType() {
        return null;
    }
    
    public final void setPincodeFillType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getManageAddressData(long customerId) {
        return null;
    }
    
    public final void onSaveButtonClicked(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
    }
    
    public final void doSaveButtonClickApiCalling() {
    }
    
    public final void deleteAddressApiCalling() {
    }
    
    public final void deleteAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String addressId, long customerId) {
    }
    
    public final void initContext(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
    }
    
    private final boolean isAllFieldsValidate() {
        return false;
    }
    
    public void onSelectLocationClicked() {
    }
    
    public final void fetchPincodeAvailablility(@org.jetbrains.annotations.Nullable()
    java.lang.String pincode, boolean fromLocationClick) {
    }
    
    private final void updateData(com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse response, java.lang.String pincode, boolean fromLocationClick) {
    }
    
    public final void showLoader() {
    }
    
    public final void hideLoader() {
    }
    
    private final void saveAddressForOrder(long orderId, long addressId, java.lang.String customerId) {
    }
    
    private final com.google.gson.JsonObject getAddressJsonObj() {
        return null;
    }
    
    public final void getPatientExperiment() {
    }
    
    public final void sendAddressAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAddressAdded mxAddressAdded) {
    }
    
    public final void sendAddressEditedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAddressEdited mxAddressEdited) {
    }
    
    public final void sendUseLocationClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked mxModel) {
    }
    
    public final void sendAddAddressClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked mxAddAddressClicked) {
    }
    
    public final void updateAddressType(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.enums.AddressType type) {
    }
    
    private final java.lang.String getAddressTransition() {
        return null;
    }
}