package com.intellihealth.truemeds.domain.usecase.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d2\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u0004\u0018\u00010\u0001J\u0010\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010\'\u001a\u00020(J\u0010\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0007J\'\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105\u00a2\u0006\u0002\u00106J\u0010\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u000209J\u0010\u0010:\u001a\u0004\u0018\u00010\u00012\u0006\u0010;\u001a\u00020<J\u0010\u0010=\u001a\u0004\u0018\u00010\u00012\u0006\u0010>\u001a\u00020\u0016J\u0010\u0010?\u001a\u0004\u0018\u00010\u00012\u0006\u0010@\u001a\u00020AJ\u0010\u0010B\u001a\u0004\u0018\u00010\u00012\u0006\u0010C\u001a\u00020DJ\u0010\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020GJ\u0010\u0010H\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020JJ\b\u0010K\u001a\u0004\u0018\u00010\u0001J\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0010\u0010M\u001a\u0004\u0018\u00010\u00012\u0006\u0010N\u001a\u00020OJ\u0010\u0010P\u001a\u0004\u0018\u00010\u00012\u0006\u0010Q\u001a\u00020RJ\b\u0010S\u001a\u0004\u0018\u00010\u0001J\b\u0010T\u001a\u0004\u0018\u00010\u0001J\b\u0010U\u001a\u0004\u0018\u00010\u0001J\u0010\u0010V\u001a\u0004\u0018\u00010\u00012\u0006\u0010W\u001a\u00020XJ\u0010\u0010Y\u001a\u0004\u0018\u00010\u00012\u0006\u0010Z\u001a\u00020[J\u0010\u0010\\\u001a\u0004\u0018\u00010\u00012\u0006\u0010]\u001a\u00020^J\b\u0010_\u001a\u0004\u0018\u00010\u0001J\b\u0010`\u001a\u0004\u0018\u00010\u0001J\u0010\u0010a\u001a\u0004\u0018\u00010\u00012\u0006\u0010b\u001a\u00020\u0016J\u0010\u0010c\u001a\u0004\u0018\u00010\u00012\u0006\u0010d\u001a\u00020eJ\u0010\u0010f\u001a\u0004\u0018\u00010\u00012\u0006\u0010g\u001a\u00020hJ\u0010\u0010i\u001a\u0004\u0018\u00010\u00012\u0006\u0010j\u001a\u00020kJ\u0010\u0010l\u001a\u0004\u0018\u00010\u00012\u0006\u0010m\u001a\u00020nJ\u0010\u0010o\u001a\u0004\u0018\u00010\u00012\u0006\u0010m\u001a\u00020nJ\u0010\u0010p\u001a\u0004\u0018\u00010\u00012\u0006\u0010q\u001a\u00020rJ\u0010\u0010s\u001a\u0004\u0018\u00010\u00012\u0006\u0010t\u001a\u00020uJ\u0010\u0010v\u001a\u0004\u0018\u00010\u00012\u0006\u0010w\u001a\u00020xJ\u0010\u0010y\u001a\u0004\u0018\u00010\u00012\u0006\u0010z\u001a\u00020{J\u0010\u0010|\u001a\u0004\u0018\u00010\u00012\u0006\u0010}\u001a\u00020~J\u001b\u0010\u007f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0018J\u0013\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0013\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001J\u0013\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001J\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001J\u0013\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001J\u0013\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001J\u001d\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010>\u001a\u00020\u00162\u0007\u0010\u0099\u0001\u001a\u00020\u0018J\u001e\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u009e\u0001\u001a\u00020-2\u0007\u0010\u009f\u0001\u001a\u00020\u0016J\u0013\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u0001J\u001c\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00a4\u0001\u001a\u00030\u00a5\u00012\u0007\u0010\u00a6\u0001\u001a\u00020\u0016J\u0013\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00a8\u0001\u001a\u00030\u00a9\u0001J\u0013\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00ab\u0001\u001a\u00030\u00ac\u0001J\u0013\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00ae\u0001\u001a\u00030\u00af\u0001J\u0013\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b1\u0001\u001a\u00030\u00b2\u0001J\u0013\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b4\u0001\u001a\u00030\u00b5\u0001J\u0013\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b7\u0001\u001a\u00030\u00b8\u0001J\u0013\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00ba\u0001\u001a\u00030\u00bb\u0001J\t\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0001J\t\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0001J\u0013\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00bf\u0001\u001a\u00030\u00c0\u0001J\u0013\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00c2\u0001\u001a\u00030\u00c3\u0001J\u0013\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00c5\u0001\u001a\u00030\u00c6\u0001J\u0013\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00c8\u0001\u001a\u00030\u00c9\u0001J\u0013\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00cb\u0001\u001a\u00030\u00cc\u0001J\u0013\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00c2\u0001\u001a\u00030\u00c3\u0001J\u0007\u0010\u00ce\u0001\u001a\u00020-J\u0007\u0010\u00cf\u0001\u001a\u00020-J\u0007\u0010\u00d0\u0001\u001a\u00020-J\u0007\u0010\u00d1\u0001\u001a\u00020-J\u0013\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00d3\u0001\u001a\u00030\u00d4\u0001J\u0013\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00d6\u0001\u001a\u00030\u00d7\u0001J\u001f\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u00d8\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00d9\u0001J\u0013\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00db\u0001\u001a\u00030\u0092\u0001J\u0011\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\u0016J\u0013\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00de\u0001\u001a\u00030\u00df\u0001J\t\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0001J\t\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0001J\u0013\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00e3\u0001\u001a\u00030\u00e4\u0001J\u0013\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00e6\u0001\u001a\u00030\u00e7\u0001J\t\u0010\u00e8\u0001\u001a\u0004\u0018\u00010\u0001J\u0013\u0010\u00e9\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00ea\u0001\u001a\u00030\u00eb\u0001J\u0013\u0010\u00ec\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00ed\u0001\u001a\u00030\u00ee\u0001J\u0013\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00f0\u0001\u001a\u00030\u00f1\u0001J\u0013\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00f3\u0001\u001a\u00030\u00f4\u0001J\u0013\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00f3\u0001\u001a\u00030\u00f4\u0001J\u0013\u0010\u00f6\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00f7\u0001\u001a\u00030\u00f8\u0001J\u0013\u0010\u00f9\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00fa\u0001\u001a\u00030\u00fb\u0001J\u0013\u0010\u00fc\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b4\u0001\u001a\u00030\u00fd\u0001J\u0013\u0010\u00fe\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u00ff\u0001\u001a\u00030\u0080\u0002J\u0013\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0082\u0002\u001a\u00030\u0083\u0002J\"\u0010\u0084\u0002\u001a\u00020-2\b\u0010\u0085\u0002\u001a\u00030\u0086\u00022\u0006\u0010>\u001a\u00020\u00162\u0007\u0010\u0087\u0002\u001a\u00020\u0016J\t\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0001J\u0013\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u008a\u0002\u001a\u00030\u008b\u0002J\u0013\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u008a\u0002\u001a\u00030\u008b\u0002J\u0013\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u008e\u0002\u001a\u00030\u008f\u0002J\t\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u00022\u0007\u0010\u0094\u0002\u001a\u00020\u0016J\u0013\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0096\u0002\u001a\u00030\u0097\u0002J\u0013\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0099\u0002\u001a\u00030\u009a\u0002J\u0013\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u009c\u0002\u001a\u00030\u009d\u0002J\t\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0001J\u0013\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00a0\u0002\u001a\u00030\u00a1\u0002J\u0011\u0010\u00a2\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u00a3\u0002\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u00a4\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u00a5\u0002\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u00a6\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u00a7\u0002\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u00a8\u0002\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u00a9\u0002\u001a\u0004\u0018\u00010\u0001J\t\u0010\u00aa\u0002\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u00ab\u0002\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u001f\u001a\u00030\u00ac\u0002J\u0011\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u00ae\u0002\u001a\u00020-2\b\u0010\u00de\u0001\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020\u0016J\u0013\u0010\u00b1\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b2\u0002\u001a\u00030\u00b3\u0002J\u0013\u0010\u00b4\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b5\u0002\u001a\u00030\u00b6\u0002J\u0013\u0010\u00b7\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b5\u0002\u001a\u00030\u00b6\u0002J\u0013\u0010\u00b8\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b9\u0002\u001a\u00030\u00ba\u0002J\u0013\u0010\u00bb\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b9\u0002\u001a\u00030\u00ba\u0002J\u0013\u0010\u00bc\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00bd\u0002\u001a\u00030\u00be\u0002J\u0013\u0010\u00bf\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b5\u0002\u001a\u00030\u00c0\u0002J\u0013\u0010\u00c1\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00b5\u0002\u001a\u00030\u00b6\u0002J\u0013\u0010\u00c2\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u00c3\u0002\u001a\u00030\u00c4\u0002J\u0011\u0010\u00c5\u0002\u001a\u00020-2\b\u0010\u00c6\u0002\u001a\u00030\u00c7\u0002J\u0011\u0010\u00c8\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u00c9\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0013J\u0011\u0010\u00ca\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u00cb\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u00cc\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00cd\u0002"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "", "mixPanelEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/MixPanelEventUseCase;", "appsFlyerEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/AppsFlyerEventUseCase;", "cleverTapEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/CleverTapEventUseCase;", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "facebookEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FacebookEventUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/MixPanelEventUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/AppsFlyerEventUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/CleverTapEventUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/FacebookEventUseCase;)V", "onUserLoginCleverTap", "orderPrescriptionUploaded", "firebaseEventModel", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FirebaseEventModel;", "pdPageSubView", "fbSubsView", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FbSubsView;", "pushFcmRegistrationId", "fcmId", "", "register", "", "pushProfileCleverTap", "searchViewCart", "sendAddAddressClickedEvent", "mxAddAddressClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAddAddressClicked;", "sendAddAlternateNumberEvent", "orderId", "sendAddPatientClickedEvent", "clickedPage", "sendAddressAddedEvent", "mxAddressAdded", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAddressAdded;", "sendAddressChangedEvent", "sendAddressEditedEvent", "mxAddressEdited", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAddressEdited;", "sendAlternateContactSavedEvent", "mxAlternateContactSaved", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAlternateContactSaved;", "sendAppOpenedEvent", "", "context", "Landroid/content/Context;", "sendAppOrderCancelledEvent", "from", "mxAppOrderCancelled", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAppOrderCancelled;", "sellingPrice", "", "(Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/mixpanel/MxAppOrderCancelled;Ljava/lang/Double;)Ljava/lang/Object;", "sendAppOrderPlacedEvent", "mxAppOrderPlaced", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAppOrderPlaced;", "sendApplyCouponClickedEvent", "mxApplyCouponClick", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxApplyCouponClick;", "sendArticleSectionViewedEvent", "clickedOnPage", "sendArticleSharedEvent", "mxArticleShared", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxArticleShared;", "sendArticleViewedEvent", "mxArticleViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxArticleViewed;", "sendArticlesCategorySectionViewedEvent", "mxArticlesCategorySectionViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxArticlesCategorySectionViewed;", "sendBannerClicked", "mxBannerClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxBannerClicked;", "sendCallPharmacistClickedEvent", "sendCallToOrderToFacebookEvent", "sendCartViewedEvent", "mxCartViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxCartViewed;", "sendCategoryImpression", "mxCategoryImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxCategoryImpression;", "sendContactBottomSheetSaved", "sendContactBottomSheetSavedClicked", "sendContactBottomSheetViewed", "sendCouponAppliedEvent", "mxCouponApplied", "Lcom/intellihealth/truemeds/mvvm/data/mixpanel/MxCouponApplied;", "sendCouponListOpenedEvent", "mxCouponListOpened", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxCouponListOpened;", "sendCouponRemovedEvent", "mxCouponRemoved", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxCouponRemoved;", "sendDeliveryDetailViewedEvent", "sendDoctorConfirmationCardViewedEvent", "sendEditNumberEvent", "mobile", "sendEventChangeToCod", "mxChangeToCodClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxChangeToCodClicked;", "sendExperimentStartedEvent", "mxExperimentStarted", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxExperimentStarted;", "sendFilterClicked", "mxFilterClicked", "Lcom/intellihealth/truemeds/mvvm/data/mixpanel/MXFilterClicked;", "sendFtcStickyStripClickedEvent", "mxStickyStripViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxStickyStripViewed;", "sendFtcStickyStripViewedEvent", "sendFtcTimerStartedEvent", "mxUrgencyTimerStarted", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxUrgencyTimerStarted;", "sendHomePageBannerClickedEvent", "mxHomePageBannerClick", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxHomePageBannerClick;", "sendHomePageBannerImpressionEvent", "mxHomePageBannerImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxHomePageBannerImpression;", "sendHomePageViewedEvent", "mxHomePageViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxHomePageViewed;", "sendInternalErrorOccurred", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "sendItemAddedEvent", "baseItemAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAdded;", "isSubstitutable", "sendItemAppOrderPlacedEvent", "mxItemAppOrderPlaced", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAppOrderPlaced;", "sendItemImpressionEvent", "mxItemImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemImpression;", "sendItemSearchedEvent", "mxItemSearched", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxItemSearched;", "sendLocationBottomSheetViewedEvent", "sendLocationSelectedEvent", "mxLocationSelected", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxLocationSelected;", "sendLogOutEvent", "customerId", "", "sendLoginPageViewedEvent", "mxLoginPageViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxLoginPageViewed;", "afLoginPageViewed", "Lcom/intellihealth/truemeds/mvvm/data/appsflyer/AFLoginPageViewed;", "sendLoginSkippedEvent", "isNewCustomer", "sendMedicineDetailsViewedViewedEvent", "mxPdpMedicineDetailsViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpMedicineDetailsViewed;", "productCode", "sendNavClickToFirebaseEvent", "nav", "sendNotificationClickedEvent", "mxNotificationClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxNotificationClicked;", "sendOTPClickedEvent", "mxOtpClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOtpClicked;", "currentPageNameForSignup", "sendOfferSheetViewedEvent", "mxOfferSheetViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOfferSheetViewed;", "sendOneClickSubstitutionPopupViewedEvent", "mxOneClickSubstitutionPopupViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOneClickSubstitutionPopupViewed;", "sendOrderStatusViewed", "mxOrderStatusViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOrderStatusViewed;", "sendOrderSummaryViewedEvent", "mxOrderSummaryViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxOrderSummaryViewed;", "sendOtcProductListPageViewed", "mxReorderSheetViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxOtcProductListPageViewed;", "sendOtpTypedEvent", "mxOtpTyped", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxOtpTyped;", "sendPatientAddedEvent", "mxPatientAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPatientAdded;", "sendPatientAndReminderSetButtonOrderStatus", "sendPatientChangedEvent", "sendPatientDetailsEditedEvent", "mxPatientDetailsEdited", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MXPatientDetailsEditedImpression;", "sendPaymentFailedEvent", "mxPaymentSuccessAndFailed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPaymentSuccessAndFailed;", "sendPaymentPageVisitedEvent", "mxPaymentPageVisited", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPaymentPageVisited;", "sendPaymentPendingViewedEvent", "mxPaymentPendingViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxPaymentPendingViewed;", "sendPaymentPopupViewedEvent", "mxPaymentPopupViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPaymentPopupViewed;", "sendPaymentSuccessfulEvent", "sendPdPageCartToFacebookEvent", "sendPdPageDeleteToFacebookEvent", "sendPdPageSearchToFacebookEvent", "sendPdPageViewCartToFacebookEvent", "sendPdpImageViewedEvent", "mxPdpImageViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpImageViewed;", "sendPdpViewedEvent", "mxPdpViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpViewed;", "afPdpViewed", "", "sendPincodeUnserviceableEvent", "pincode", "sendPrescriptionRemovedEvent", "sendPrescriptionUploadPageViewedEvent", "mixPannelData", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxPrescriptionUploadPageViewed;", "sendPrescriptionUploadedClickEvent", "sendProceedToCartToFirebaseEvent", "sendProductListPageViewedEvent", "mxProductListPageViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxProductListPageViewed;", "sendPspViewedEvent", "mxPspViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPspViewed;", "sendReferAFriendClickedEvent", "sendReferralScreenViewedEvent", "mxReferralScreenViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReferralScreenViewed;", "sendReminderBottomSheetViewedEvent", "mxReminderBottomSheetViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderBottomSheetViewed;", "sendReminderDeletedEvent", "mxReminderDeleted", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderDeleted;", "sendReminderEditClickedEvent", "mxReminderSuccessfullySet", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderSuccessfullySet;", "sendReminderSuccessfullySetEvent", "sendReminderUpdatedClickedEvent", "mxReminderUpdate", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderUpdate;", "sendReorderClickedEventToCleverTap", "ctReorderClicked", "Lcom/intellihealth/truemeds/data/model/clevertap/CtReorderClicked;", "sendReorderSheetViewedEvent", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxReorderSheetViewed;", "sendSearchSuggestionImpressionEvent", "mxEventSuggestionImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxSearchSuggestionImpression;", "sendSearchViewedEvent", "mxSearchViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSearchViewed;", "sendSignUporLoginSuccessfulEvent", "response", "Lcom/intellihealth/truemeds/data/model/login/LoginVerificationResponse;", "fillType", "sendSkinnyBannerImpressionToMixPanel", "sendSrpAddSubsBottomSheetViewedEvent", "mxSrpAddSubBottomSheetViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSrpAddSubBottomSheetViewed;", "sendSrpViewSubsBottomSheetViewedEvent", "sendSrpViewedEvent", "mxSrpViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSrpViewed;", "sendSubsLearnMoreClickedEvent", "sendSubsVideoPlayedEvent", "mxCommonProperty", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxCommonProperty;", "source", "sendSubstituteItemAddedEvent", "afSubsItemAdded", "Lcom/intellihealth/truemeds/mvvm/data/appsflyer/AFSubsItemAdded;", "sendSubstituteReplaceClickedEvent", "mxSubstituteReplaceClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSubstituteReplaceClicked;", "sendSuperCategorySectionImpression", "mXSuperCategorySectionImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MXSuperCategorySectionImpression;", "sendSuperEventToMixpanel", "sendSwitchBackClickedEvent", "mxSwitchBackClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSwitchBackClicked;", "sendTmWalletBackFirebaseEvent", "sendTmWalletCreditTransactions", "sendTmWalletFaqFirebaseEvent", "sendTmWalletRewardTransactions", "sendTmWalletTermAndConditionFirebaseEvent", "sendTmWalletTransactionFirebaseEvent", "isRewardTransaction", "sendTmWalletViewed", "sendTnCEvent", "sendUndoClickedEvent", "", "sendUpdateProfileSaveEvent", "sendUploadPrescriptionClickEvent", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxUploadPrescriptionClicked;", "pageName", "sendUseLocationClickedEvent", "mxUseLocationClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxUseLocationClicked;", "sendVideoCompletedEvent", "mxVideoPlayed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxVideoContinued;", "sendVideoContinuedEvent", "sendVideoFloaterClickedEvent", "mxVideoFloaterClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxVideoFloaterClicked;", "sendVideoFloaterImpressionEvent", "sendVideoPausedEvent", "mxVideoPaused", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxVideoPaused;", "sendVideoPlayedEvent", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxVideoPlayed;", "sendVideoPlayerClosedEvent", "sendViewBillClickedEvent", "mxViewBillClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxViewBillClicked;", "sendViewDetailsClickedEventToMixpanel", "mxViewDetailsClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxViewDetailsClicked;", "sendocationClickToFirebaseEvent", "subsPopup", "substituteDropdownClosed", "substituteDropdownViewed", "uploadPrescriptionPrescriptionSelected", "app_stageAndroidDebug"})
public final class SdkEventUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase mixPanelEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.AppsFlyerEventUseCase appsFlyerEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase cleverTapEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.FacebookEventUseCase facebookEventUseCase = null;
    
    @javax.inject.Inject()
    public SdkEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase mixPanelEventUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.AppsFlyerEventUseCase appsFlyerEventUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase cleverTapEventUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FacebookEventUseCase facebookEventUseCase) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public final void sendAppOpenedEvent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pushFcmRegistrationId(@org.jetbrains.annotations.NotNull()
    java.lang.String fcmId, boolean register) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendNotificationClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxNotificationClicked mxNotificationClicked) {
        return null;
    }
    
    public final void sendSignUporLoginSuccessfulEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.login.LoginVerificationResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.NotNull()
    java.lang.String fillType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendLoginSkippedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, boolean isNewCustomer) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendLoginPageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed mxLoginPageViewed, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed afLoginPageViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendOTPClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOtpClicked mxOtpClicked, @org.jetbrains.annotations.NotNull()
    java.lang.String currentPageNameForSignup) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendOtpTypedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtpTyped mxOtpTyped) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendTnCEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendEditNumberEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAppOrderCancelledEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled mxAppOrderCancelled, @org.jetbrains.annotations.Nullable()
    java.lang.Double sellingPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendOrderStatusViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOrderStatusViewed mxOrderStatusViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendHomePageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxHomePageViewed mxHomePageViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAddAddressClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked mxAddAddressClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAddPatientClickedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedPage) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendDeliveryDetailViewedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPatientAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPatientAdded mxPatientAdded) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAddressChangedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAddressEditedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAddressEdited mxAddressEdited) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendHomePageBannerImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxHomePageBannerImpression mxHomePageBannerImpression) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendHomePageBannerClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxHomePageBannerClick mxHomePageBannerClick) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendBannerClicked(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxBannerClicked mxBannerClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSkinnyBannerImpressionToMixPanel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAddressAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAddressAdded mxAddressAdded) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPrescriptionUploadPageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxPrescriptionUploadPageViewed mixPannelData) {
        return null;
    }
    
    public final void sendUploadPrescriptionClickEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxUploadPrescriptionClicked mixPannelData, @org.jetbrains.annotations.NotNull()
    java.lang.String pageName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPrescriptionUploadedClickEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendApplyCouponClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxApplyCouponClick mxApplyCouponClick) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendCouponListOpenedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxCouponListOpened mxCouponListOpened) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendCouponAppliedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.mixpanel.MxCouponApplied mxCouponApplied) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendCouponRemovedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxCouponRemoved mxCouponRemoved) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendOfferSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOfferSheetViewed mxOfferSheetViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPincodeUnserviceableEvent(int pincode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReferralScreenViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReferralScreenViewed mxReferralScreenViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendFtcTimerStartedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxUrgencyTimerStarted mxUrgencyTimerStarted) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendFtcStickyStripViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxStickyStripViewed mxStickyStripViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendFtcStickyStripClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxStickyStripViewed mxStickyStripViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendVideoPlayedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxVideoPlayed mxVideoPlayed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendVideoContinuedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued mxVideoPlayed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendVideoCompletedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued mxVideoPlayed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendVideoPlayerClosedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued mxVideoPlayed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendVideoPausedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoPaused mxVideoPaused) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSubsVideoPlayedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCommonProperty mxCommonProperty, @org.jetbrains.annotations.NotNull()
    java.lang.String source) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendItemAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded baseItemAdded, boolean isSubstitutable) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSubstituteItemAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.appsflyer.AFSubsItemAdded afSubsItemAdded) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendUseLocationClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked mxUseLocationClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendProductListPageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxProductListPageViewed mxProductListPageViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendViewBillClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxViewBillClicked mxViewBillClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPspViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPspViewed mxPspViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPaymentPopupViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPopupViewed mxPaymentPopupViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPaymentFailedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentSuccessAndFailed mxPaymentSuccessAndFailed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPaymentSuccessfulEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentSuccessAndFailed mxPaymentSuccessAndFailed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAppOrderPlacedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAppOrderPlaced mxAppOrderPlaced) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendLocationSelectedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxLocationSelected mxLocationSelected) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPatientChangedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendDoctorConfirmationCardViewedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPdpImageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpImageViewed mxPdpImageViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendMedicineDetailsViewedViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpMedicineDetailsViewed mxPdpMedicineDetailsViewed, @org.jetbrains.annotations.Nullable()
    java.lang.String productCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendItemAppOrderPlacedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAppOrderPlaced mxItemAppOrderPlaced) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPaymentPageVisitedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPageVisited mxPaymentPageVisited) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPaymentPendingViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxPaymentPendingViewed mxPaymentPendingViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAddAlternateNumberEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAlternateContactSavedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAlternateContactSaved mxAlternateContactSaved) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendVideoFloaterClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxVideoFloaterClicked mxVideoFloaterClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendVideoFloaterImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxVideoFloaterClicked mxVideoFloaterClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendCartViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxCartViewed mxCartViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendCallPharmacistClickedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSearchViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSearchViewed mxSearchViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendArticleSectionViewedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendArticleViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxArticleViewed mxArticleViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendArticlesCategorySectionViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxArticlesCategorySectionViewed mxArticlesCategorySectionViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendArticleSharedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxArticleShared mxArticleShared) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSrpAddSubsBottomSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSrpAddSubBottomSheetViewed mxSrpAddSubBottomSheetViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSrpViewSubsBottomSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSrpAddSubBottomSheetViewed mxSrpAddSubBottomSheetViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSrpViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSrpViewed mxSrpViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendLogOutEvent(int customerId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReminderBottomSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderBottomSheetViewed mxReminderBottomSheetViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReminderSuccessfullySetEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReminderEditClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReminderUpdatedClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderUpdate mxReminderUpdate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReminderDeletedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderDeleted mxReminderDeleted) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPatientAndReminderSetButtonOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPrescriptionRemovedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedPage) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendOrderSummaryViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOrderSummaryViewed mxOrderSummaryViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendContactBottomSheetSaved() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendContactBottomSheetSavedClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendContactBottomSheetViewed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendOneClickSubstitutionPopupViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOneClickSubstitutionPopupViewed mxOneClickSubstitutionPopupViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSwitchBackClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSwitchBackClicked mxSwitchBackClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendLocationBottomSheetViewedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendUndoClickedEvent(long orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSubstituteReplaceClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSubstituteReplaceClicked mxSubstituteReplaceClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSearchSuggestionImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxSearchSuggestionImpression mxEventSuggestionImpression) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPdpViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpViewed mxPdpViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendUpdateProfileSaveEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchViewCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object orderPrescriptionUploaded(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadPrescriptionPrescriptionSelected(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendItemSearchedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched mxItemSearched) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSubsLearnMoreClickedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReferAFriendClickedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendTmWalletCreditTransactions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendTmWalletRewardTransactions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendTmWalletViewed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendEventChangeToCod(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxChangeToCodClicked mxChangeToCodClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendFilterClicked(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.mixpanel.MXFilterClicked mxFilterClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendCategoryImpression(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCategoryImpression mxCategoryImpression) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSuperCategorySectionImpression(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MXSuperCategorySectionImpression mXSuperCategorySectionImpression) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReorderClickedEventToCleverTap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtReorderClicked ctReorderClicked) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendReorderSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxReorderSheetViewed mxReorderSheetViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPatientDetailsEditedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MXPatientDetailsEditedImpression mxPatientDetailsEdited) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendItemImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemImpression mxItemImpression) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendOtcProductListPageViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtcProductListPageViewed mxReorderSheetViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendExperimentStartedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxExperimentStarted mxExperimentStarted) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPdpViewedEvent(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> afPdpViewed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pdPageSubView(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object subsPopup(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object substituteDropdownViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object substituteDropdownClosed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pushProfileCleverTap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object onUserLoginCleverTap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSuperEventToMixpanel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendCallToOrderToFacebookEvent() {
        return null;
    }
    
    public final void sendPdPageDeleteToFacebookEvent() {
    }
    
    public final void sendPdPageViewCartToFacebookEvent() {
    }
    
    public final void sendPdPageCartToFacebookEvent() {
    }
    
    public final void sendPdPageSearchToFacebookEvent() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendocationClickToFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendTmWalletBackFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendTmWalletFaqFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendTmWalletTransactionFirebaseEvent(boolean isRewardTransaction, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendTmWalletTermAndConditionFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
        return null;
    }
    
    public final void sendNavClickToFirebaseEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String nav) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendProceedToCartToFirebaseEvent() {
        return null;
    }
    
    public final void sendViewDetailsClickedEventToMixpanel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxViewDetailsClicked mxViewDetailsClicked) {
    }
}