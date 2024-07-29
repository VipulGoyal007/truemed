package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u009c\u00022\u00020\u0001:\u0004\u009c\u0002\u009d\u0002B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J \u0010\u00b7\u0001\u001a\u00030\u00b3\u00012\r\u0010\u00b8\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086@\u00a2\u0006\u0003\u0010\u00b9\u0001Ja\u0010\u00ba\u0001\u001a\u00030\u00bb\u00012\u0007\u0010\u00bc\u0001\u001a\u00020\u001f2\u0007\u0010\u00bd\u0001\u001a\u00020\u00152\u0007\u0010\u00be\u0001\u001a\u00020\u00052\n\u0010\u00bf\u0001\u001a\u0005\u0018\u00010\u00c0\u00012\t\b\u0002\u0010\u00c1\u0001\u001a\u00020\u00052\u000b\b\u0002\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0002\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0002\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0013J!\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0013H\u0016J8\u0010\u00c8\u0001\u001a\u00030\u00bb\u00012\f\b\u0002\u0010\u00c9\u0001\u001a\u0005\u0018\u00010\u00ca\u00012\t\b\u0002\u0010\u00cb\u0001\u001a\u00020\u00132\f\b\u0002\u0010\u00cc\u0001\u001a\u0005\u0018\u00010\u00cd\u00012\u0007\u0010\u00ce\u0001\u001a\u00020`J\b\u0010\u00cf\u0001\u001a\u00030\u00bb\u0001J\u001b\u0010\u00d0\u0001\u001a\u0005\u0018\u00010\u00d1\u00012\t\u0010\u00d2\u0001\u001a\u0004\u0018\u00010`\u00a2\u0006\u0003\u0010\u00d3\u0001J\u0014\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0013J$\u0010\u00d6\u0001\u001a\t\u0012\u0004\u0012\u00020`0\u00d7\u00012\u0007\u0010\u00d8\u0001\u001a\u00020`2\t\b\u0002\u0010\u00d9\u0001\u001a\u00020`H\u0002J\u0013\u0010\u00da\u0001\u001a\u0005\u0018\u00010\u00db\u00012\u0007\u0010\u00d2\u0001\u001a\u00020`J\n\u0010\u00dc\u0001\u001a\u00030\u00bb\u0001H\u0002J\u0013\u0010\u00dd\u0001\u001a\u0005\u0018\u00010\u00de\u00012\u0007\u0010\u00df\u0001\u001a\u00020\u0013J\u0010\u0010\u00e0\u0001\u001a\u00020\u00052\u0007\u0010\u00e1\u0001\u001a\u00020\u0013J-\u0010\u00e2\u0001\u001a\u00030\u00bb\u00012\b\u0010\u00e3\u0001\u001a\u00030\u00e4\u00012\u0007\u0010\u00ce\u0001\u001a\u00020`2\u0007\u0010\u00e5\u0001\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0003\u0010\u00e6\u0001J!\u0010\u00e7\u0001\u001a\u00020\u00052\r\u0010\u00e8\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0007\u0010\u00e9\u0001\u001a\u00020\u0013H\u0002J!\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\u001f2\r\u0010\u00b8\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0007\u0010\u00eb\u0001\u001a\u00020\u0013J\u000e\u0010\u00ec\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u00ed\u0001J\b\u0010\u00ee\u0001\u001a\u00030\u00bb\u0001J\u0007\u0010u\u001a\u00030\u00bb\u0001J\u0007\u0010y\u001a\u00030\u00bb\u0001J\u0011\u0010\u00ef\u0001\u001a\u00030\u00bb\u00012\u0007\u0010\u00f0\u0001\u001a\u00020\u0013J\b\u0010\u00f1\u0001\u001a\u00030\u00bb\u0001J$\u0010\u00f2\u0001\u001a\u00020\u00152\u0007\u0010\u00bc\u0001\u001a\u00020\u001f2\u0007\u0010\u00bd\u0001\u001a\u00020\u00152\t\b\u0002\u0010\u00f3\u0001\u001a\u00020\u0013J\u0011\u0010\u00f4\u0001\u001a\u00030\u00bb\u0001H\u0086@\u00a2\u0006\u0003\u0010\u00f5\u0001Jy\u0010\u00f6\u0001\u001a\u00030\u00bb\u00012\t\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\u001f2\t\u0010\u00f8\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010\u00f9\u0001\u001a\u0004\u0018\u00010\u00132\b\u0010\u00bf\u0001\u001a\u00030\u00c0\u00012\u0007\u0010\u00bd\u0001\u001a\u00020\u00152\u000b\b\u0002\u0010\u00fa\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0002\u0010\u00fb\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0002\u0010\u00fc\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0002\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0005H\u0086@\u00a2\u0006\u0003\u0010\u00fd\u0001J\u0081\u0001\u0010\u00fe\u0001\u001a\u00030\u00bb\u00012\u0007\u0010\u00f7\u0001\u001a\u00020\u001f2\t\u0010\u00ff\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010\u00f0\u0001\u001a\u0004\u0018\u00010\u00132\t\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u00052\t\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00132\t\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u00052\t\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u00052\t\u0010\u0084\u0002\u001a\u0004\u0018\u00010\n2\u000b\b\u0002\u0010\u00fc\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0002\u0010\u00fa\u0001\u001a\u0004\u0018\u00010\u0013H\u0086@\u00a2\u0006\u0003\u0010\u0085\u0002J,\u0010\u0086\u0002\u001a\u00030\u00bb\u00012\n\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0088\u00022\r\u0010\u00b8\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0087@\u00a2\u0006\u0003\u0010\u0089\u0002J\u0012\u0010\u008a\u0002\u001a\u00030\u00bb\u00012\b\u0010\u008b\u0002\u001a\u00030\u008c\u0002J\b\u0010\u008d\u0002\u001a\u00030\u00bb\u0001J\u001b\u0010\u008e\u0002\u001a\u00030\u00bb\u00012\b\u0010\u008f\u0002\u001a\u00030\u0090\u0002H\u0086@\u00a2\u0006\u0003\u0010\u0091\u0002J\b\u0010\u0092\u0002\u001a\u00030\u00bb\u0001J\u0011\u0010\u0093\u0002\u001a\u00030\u00bb\u00012\u0007\u0010\u0094\u0002\u001a\u00020\u0013J3\u0010\u0095\u0002\u001a\u00030\u00bb\u00012\u0007\u0010\u0096\u0002\u001a\u00020\u00132\t\b\u0002\u0010\u0097\u0002\u001a\u00020`2\u0015\u0010\u0098\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0005\u0012\u00030\u00bb\u00010\u0099\u0002J\b\u0010\u009a\u0002\u001a\u00030\u00bb\u0001J%\u0010\u009b\u0002\u001a\u00030\u00bb\u00012\u0007\u0010\u00bc\u0001\u001a\u00020\u001f2\u0007\u0010\u00be\u0001\u001a\u00020\u00052\t\b\u0002\u0010\u00bd\u0001\u001a\u00020\u0015R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00130\u00130\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00150\u00150\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00150\u00150\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0019\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u001cR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u001cR\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000fR\u001e\u00101\u001a\u0002028\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010=\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00130\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u000f\"\u0004\b?\u0010\u0011R(\u0010@\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00130\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u000f\"\u0004\bB\u0010\u0011R(\u0010C\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00130\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010\u0011R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bH\u0010\u001cR\u001d\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010\u001cR\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bL\u0010\u001cR\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bN\u0010\u001cR\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bP\u0010\u001cR\u001d\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bR\u0010\u001cR\u001d\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bT\u0010\u001cR\u001d\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bV\u0010\u001cR\u001d\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bX\u0010\u001cR\u001d\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\bZ\u0010\u001cR\u001d\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\\\u0010\u001cR\u001d\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b^\u0010\u001cR\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020`0\u001a8F\u00a2\u0006\u0006\u001a\u0004\ba\u0010\u001cR\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8F\u00a2\u0006\u0006\u001a\u0004\bc\u0010\u001cR\u001d\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001a8F\u00a2\u0006\u0006\u001a\u0004\be\u0010\u001cR\u001d\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010\u000fR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020j0i\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001d\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010\u000fR\u000e\u0010t\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010\u000fR\u001d\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010\u000fR\u001d\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010\u000fR(\u0010{\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00150\u00150\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u000f\"\u0004\b}\u0010\u0011R\"\u0010~\u001a\u00020\u007f8\u0004@\u0004X\u0085.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F\u00a2\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u001cR\u001f\u0010\u0086\u0001\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u000fR\u001f\u0010\u008d\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u000fR\u001f\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u000fR\u001f\u0010\u0091\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u000fR\u001f\u0010\u0093\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u000fR$\u0010\u0095\u0001\u001a\u00030\u0096\u00018\u0004@\u0004X\u0085.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8F\u00a2\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\u001cR\u001f\u0010\u009d\u0001\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u0088\u0001\"\u0006\b\u009f\u0001\u0010\u008a\u0001R$\u0010\u00a0\u0001\u001a\u00030\u00a1\u00018\u0004@\u0004X\u0085.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a2\u0001\u0010\u00a3\u0001\"\u0006\b\u00a4\u0001\u0010\u00a5\u0001R\u0019\u0010\u00a6\u0001\u001a\b\u0012\u0004\u0012\u00020`0\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a7\u0001\u0010\u000fR\u0019\u0010\u00a8\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8F\u00a2\u0006\u0007\u001a\u0005\b\u00a9\u0001\u0010\u001cR\u001f\u0010\u00aa\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0-0\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ab\u0001\u0010\u000fR\u001b\u0010\u00ac\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u00ad\u0001\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00130\u00130\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ae\u0001\u0010\u000fR)\u0010\u00af\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130-0\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b0\u0001\u0010\u000f\"\u0005\b\u00b1\u0001\u0010\u0011R\u0012\u0010\u00b2\u0001\u001a\u0005\u0018\u00010\u00b3\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u00b4\u0001\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00130\u00130\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u0010\u000f\"\u0005\b\u00b6\u0001\u0010\u0011\u00a8\u0006\u009e\u0002"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_cartItemCount", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_cartModel", "Lcom/intellihealth/salt/models/CartModel;", "_cartSellingPrice", "", "_cartTotalMedDiscount", "_cartTotalMrp", "_medicineTotalSellingPrice", "get_medicineTotalSellingPrice", "()Landroidx/lifecycle/MutableLiveData;", "set_medicineTotalSellingPrice", "(Landroidx/lifecycle/MutableLiveData;)V", "_reloadDataAfterDelete", "", "_showApiCallLoader", "", "anyOrderTab", "getAnyOrderTab", "setAnyOrderTab", "cartItemCount", "Landroidx/lifecycle/LiveData;", "getCartItemCount", "()Landroidx/lifecycle/LiveData;", "cartMedicineListResponse", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "getCartMedicineListResponse", "()Ljava/util/List;", "setCartMedicineListResponse", "(Ljava/util/List;)V", "cartModel", "getCartModel", "cartSellingPrice", "getCartSellingPrice", "cartTotalMedDiscount", "getCartTotalMedDiscount", "cartTotalMrp", "getCartTotalMrp", "closeReorderBottomSheet", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "couponTimer", "getCouponTimer", "couponUseCase", "Lcom/intellihealth/truemeds/domain/usecase/CouponUseCase;", "getCouponUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/CouponUseCase;", "setCouponUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/CouponUseCase;)V", "customerDetail", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;", "getCustomerDetail", "()Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;", "setCustomerDetail", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;)V", "customerEmail", "getCustomerEmail", "setCustomerEmail", "customerMobile", "getCustomerMobile", "setCustomerMobile", "customerName", "getCustomerName", "setCustomerName", "eventBaseMessage", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventBaseMessage", "eventCloseReorderBottomSheet", "getEventCloseReorderBottomSheet", "eventFinishActivity", "getEventFinishActivity", "eventInitiateLogin", "getEventInitiateLogin", "eventLaunchOrderSummary", "getEventLaunchOrderSummary", "eventLaunchPrescription", "getEventLaunchPrescription", "eventLaunchSearch", "getEventLaunchSearch", "eventOpenCartActivity", "getEventOpenCartActivity", "eventOpenErrorDialog", "getEventOpenErrorDialog", "eventOpenOrderSummaryActivity", "getEventOpenOrderSummaryActivity", "eventOpenPrescriptionActivity", "getEventOpenPrescriptionActivity", "eventOpenWalletActivity", "getEventOpenWalletActivity", "eventSendFtcCounterStarted", "", "getEventSendFtcCounterStarted", "eventShowInternalServerError", "getEventShowInternalServerError", "eventShowToast", "getEventShowToast", "finishActivity", "getFinishActivity", "footerList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/FooterBillItem;", "getFooterList", "()Ljava/util/ArrayList;", "fromSummary", "getFromSummary", "()Z", "setFromSummary", "(Z)V", "initiateLogin", "getInitiateLogin", "isCouponTimerRunning", "launchOrderSummary", "getLaunchOrderSummary", "launchPrescription", "getLaunchPrescription", "launchSearch", "getLaunchSearch", "loaderValue", "getLoaderValue", "setLoaderValue", "localDbUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;", "getLocalDbUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;", "setLocalDbUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;)V", "medicineTotalSellingPrice", "getMedicineTotalSellingPrice", "mrpEventValueFromBaseVM", "getMrpEventValueFromBaseVM", "()D", "setMrpEventValueFromBaseVM", "(D)V", "openCartActivity", "getOpenCartActivity", "openErrorDialog", "getOpenErrorDialog", "openOrderSummaryActivity", "getOpenOrderSummaryActivity", "openPrescriptionActivity", "getOpenPrescriptionActivity", "openWalletActivity", "getOpenWalletActivity", "orderFlowUseCase", "Lcom/intellihealth/truemeds/domain/usecase/OrderFlowUseCase;", "getOrderFlowUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/OrderFlowUseCase;", "setOrderFlowUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/OrderFlowUseCase;)V", "reloadDataAfterDelete", "getReloadDataAfterDelete", "salesPriceEventValueFromBaseVM", "getSalesPriceEventValueFromBaseVM", "setSalesPriceEventValueFromBaseVM", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "getSdkEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "setSdkEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;)V", "sendFtcCounterStarted", "getSendFtcCounterStarted", "showApiCallLoader", "getShowApiCallLoader", "showBaseMessage", "getShowBaseMessage", "showCustomToast", "showInternalServerError", "getShowInternalServerError", "stepperMessage", "getStepperMessage", "setStepperMessage", "timerJob", "Lkotlinx/coroutines/Job;", "userSaved", "getUserSaved", "setUserSaved", "addSubsMedicineToDB", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToCart", "", "productModel", "isSubs", "qty", "itemAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAdded;", "suggestionTermClickedPosition", "suggestion_term_clicked", "term_searched", "clicked_suggestion_type", "calculatePackSizeDiff", "originalPack", "subsPack", "callCouponRemovedEventForOfflineCouponCase", "billDetailsData", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "clickedOnPag", "coupon", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "orderId", "callEventApplyCouponClickedFromBaseVM", "convertMillisToDate", "Ljava/util/Date;", "millis", "(Ljava/lang/Long;)Ljava/util/Date;", "convertMillisToDateFormat", "date", "emitCouponTimer", "Lkotlinx/coroutines/flow/Flow;", "timestamp", "delayInSeconds", "getCalendarDataBase", "Ljava/util/Calendar;", "getCustomerOrderDetails", "getDeepLinkType", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel$DeepLinkTypes;", "strDeepLink", "getDeliveryDateDaysDifference", "delDate", "getMedicineOrderDetailsList", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "redirectToCart", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrgMedicineIndexFromCartList", "cartList", "switchBackCode", "getProductInfoDetails", "productCode", "getRemoteListProductCode", "", "getUserData", "onViewCartClicked", "pageSection", "onWalletClicked", "removeItemFromCart", "featureName", "removeMedsWhichAreNotInAPI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendItemAddedEvent", "productInfoModel", "qc", "rt", "termSearched", "clickedSuggestionType", "suggestionTermClicked", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAdded;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendItemImpressionEvent", "clickedOnPage", "resultPosition", "sectionHeading", "sectionIndex", "sectionRow", "freeDeliveryRequiredAmount", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendItemOrderPlacedToMixPanel", "array", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPaymentPendingSheetViewed", "mxPaymentPendingViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxPaymentPendingViewed;", "sendProceedToCartToFirebaseEvent", "sendSubstituteItemAddedEvent", "afSubsItemAdded", "Lcom/intellihealth/truemeds/mvvm/data/appsflyer/AFSubsItemAdded;", "(Lcom/intellihealth/truemeds/mvvm/data/appsflyer/AFSubsItemAdded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCartCount", "showStepperMessageToast", "msg", "startTimer", "prefixText", "endTimestamp", "notify", "Lkotlin/Function1;", "stopCouponTimer", "updateQuantity", "Companion", "DeepLinkTypes", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job timerJob;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openErrorDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> sendFtcCounterStarted = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _reloadDataAfterDelete = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showApiCallLoader = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> showCustomToast = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> showInternalServerError = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartMedicineListResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> launchOrderSummary = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> launchPrescription = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> launchSearch = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> couponTimer = null;
    private boolean isCouponTimerRunning = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _cartItemCount;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> _cartSellingPrice;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> _cartTotalMrp;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> _cartTotalMedDiscount;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> _medicineTotalSellingPrice;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> _cartModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> cartModel = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> customerName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> customerEmail;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> customerMobile;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> userSaved;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> anyOrderTab;
    public com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails customerDetail;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> loaderValue;
    @javax.inject.Inject()
    protected com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase;
    @javax.inject.Inject()
    protected com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase orderFlowUseCase;
    @javax.inject.Inject()
    protected com.intellihealth.truemeds.domain.usecase.CouponUseCase couponUseCase;
    @javax.inject.Inject()
    protected com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase;
    private boolean fromSummary = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> finishActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openPrescriptionActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openOrderSummaryActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openCartActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> initiateLogin = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openWalletActivity = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> stepperMessage;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showBaseMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> closeReorderBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.intellihealth.salt.models.FooterBillItem> footerList = null;
    private static boolean hasCouponTimerStopped = false;
    private double mrpEventValueFromBaseVM = 0.0;
    private double salesPriceEventValueFromBaseVM = 0.0;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel.Companion Companion = null;
    
    @javax.inject.Inject()
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getOpenErrorDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventOpenErrorDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getSendFtcCounterStarted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getEventSendFtcCounterStarted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getReloadDataAfterDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowApiCallLoader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventShowToast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShowInternalServerError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getEventShowInternalServerError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getCartMedicineListResponse() {
        return null;
    }
    
    public final void setCartMedicineListResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getLaunchOrderSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventLaunchOrderSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getLaunchPrescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventLaunchPrescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getLaunchSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventLaunchSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCouponTimer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCartItemCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> get_medicineTotalSellingPrice() {
        return null;
    }
    
    public final void set_medicineTotalSellingPrice(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Double> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getCartSellingPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getCartTotalMrp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getCartTotalMedDiscount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getMedicineTotalSellingPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> getCartModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCustomerName() {
        return null;
    }
    
    public final void setCustomerName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCustomerEmail() {
        return null;
    }
    
    public final void setCustomerEmail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCustomerMobile() {
        return null;
    }
    
    public final void setCustomerMobile(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUserSaved() {
        return null;
    }
    
    public final void setUserSaved(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAnyOrderTab() {
        return null;
    }
    
    public final void setAnyOrderTab(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails getCustomerDetail() {
        return null;
    }
    
    public final void setCustomerDetail(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoaderValue() {
        return null;
    }
    
    public final void setLoaderValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.intellihealth.truemeds.domain.usecase.LocalDbUseCase getLocalDbUseCase() {
        return null;
    }
    
    protected final void setLocalDbUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LocalDbUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase getOrderFlowUseCase() {
        return null;
    }
    
    protected final void setOrderFlowUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.intellihealth.truemeds.domain.usecase.CouponUseCase getCouponUseCase() {
        return null;
    }
    
    protected final void setCouponUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.CouponUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase getSdkEventUseCase() {
        return null;
    }
    
    protected final void setSdkEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase p0) {
    }
    
    public final boolean getFromSummary() {
        return false;
    }
    
    public final void setFromSummary(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getFinishActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventFinishActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getOpenPrescriptionActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventOpenPrescriptionActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getOpenOrderSummaryActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventOpenOrderSummaryActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getOpenCartActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventOpenCartActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getInitiateLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventInitiateLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getOpenWalletActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventOpenWalletActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> getStepperMessage() {
        return null;
    }
    
    public final void setStepperMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getShowBaseMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventBaseMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventCloseReorderBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.FooterBillItem> getFooterList() {
        return null;
    }
    
    public final double getMrpEventValueFromBaseVM() {
        return 0.0;
    }
    
    public final void setMrpEventValueFromBaseVM(double p0) {
    }
    
    public final double getSalesPriceEventValueFromBaseVM() {
        return 0.0;
    }
    
    public final void setSalesPriceEventValueFromBaseVM(double p0) {
    }
    
    /**
     * This will start count down timer for coupon
     */
    public final void startTimer(@org.jetbrains.annotations.NotNull()
    java.lang.String prefixText, long endTimestamp, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> notify) {
    }
    
    /**
     * This will emit remaining time for a coupon
     */
    private final kotlinx.coroutines.flow.Flow<java.lang.Long> emitCouponTimer(long timestamp, long delayInSeconds) {
        return null;
    }
    
    /**
     * Invoke this to Stop coupon timer
     */
    public final void stopCouponTimer() {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productModel, boolean isSubs, int qty, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded itemAdded, int suggestionTermClickedPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestion_term_clicked, @org.jetbrains.annotations.Nullable()
    java.lang.String term_searched, @org.jetbrains.annotations.Nullable()
    java.lang.String clicked_suggestion_type) {
    }
    
    public final void updateQuantity(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productModel, int qty, boolean isSubs) {
    }
    
    public final boolean removeItemFromCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productModel, boolean isSubs, @org.jetbrains.annotations.NotNull()
    java.lang.String featureName) {
        return false;
    }
    
    public final void setCartCount() {
    }
    
    /**
     * 1) If user access token and user id is not null in shared preference then go to cart else show login bottomsheet else follow below steps
     * 2) If isReOrder is true in shared preference, then redirect to order summary page else redirect to cart page
     * 3) If Search page is opened from cart or order summary page, then on finish search page activity
     * and handle added products data update in Cart and OrderSummary page onResume section. This need to be done to avoid multiple stack of SearchActivity
     */
    public final void onViewCartClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String pageSection) {
    }
    
    public final void onWalletClicked() {
    }
    
    public final void showStepperMessageToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void getUserData() {
    }
    
    /**
     * *
     * This method will add only SUBS medicine mapping to orgSubsInfo table
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addSubsMedicineToDB(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> $completion) {
        return null;
    }
    
    private final int getOrgMedicineIndexFromCartList(java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartList, java.lang.String switchBackCode) {
        return 0;
    }
    
    public final void launchSearch() {
    }
    
    public final void launchOrderSummary() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMedicineOrderDetailsList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, boolean redirectToCart, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void getCustomerOrderDetails() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeMedsWhichAreNotInAPI(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRemoteListProductCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendItemAddedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfoModel, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded itemAdded, boolean isSubs, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.Integer suggestionTermClickedPosition, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendSubstituteItemAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.appsflyer.AFSubsItemAdded afSubsItemAdded, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void sendPaymentPendingSheetViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxPaymentPendingViewed mxPaymentPendingViewed) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendItemImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfoModel, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String sectionHeading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionRow, @org.jetbrains.annotations.Nullable()
    java.lang.Double freeDeliveryRequiredAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String calculatePackSizeDiff(@org.jetbrains.annotations.Nullable()
    java.lang.String originalPack, @org.jetbrains.annotations.Nullable()
    java.lang.String subsPack) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendItemOrderPlacedToMixPanel(@org.jetbrains.annotations.Nullable()
    org.json.JSONArray array, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getProductInfoDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> list, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
        return null;
    }
    
    public final void callCouponRemovedEventForOfflineCouponCase(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPag, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon coupon, long orderId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Calendar getCalendarDataBase(long millis) {
        return null;
    }
    
    public final void callEventApplyCouponClickedFromBaseVM() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date convertMillisToDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long millis) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String convertMillisToDateFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String date) {
        return null;
    }
    
    public final int getDeliveryDateDaysDifference(@org.jetbrains.annotations.NotNull()
    java.lang.String delDate) {
        return 0;
    }
    
    public final void sendProceedToCartToFirebaseEvent() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel.DeepLinkTypes getDeepLinkType(@org.jetbrains.annotations.NotNull()
    java.lang.String strDeepLink) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel$Companion;", "", "()V", "hasCouponTimerStopped", "", "getHasCouponTimerStopped", "()Z", "setHasCouponTimerStopped", "(Z)V", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getHasCouponTimerStopped() {
            return false;
        }
        
        public final void setHasCouponTimerStopped(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel$DeepLinkTypes;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "PAYMENT_LINK", "DEFAULT", "app_stageAndroidDebug"})
    public static enum DeepLinkTypes {
        /*public static final*/ PAYMENT_LINK /* = new PAYMENT_LINK(null) */,
        /*public static final*/ DEFAULT /* = new DEFAULT(null) */;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String type = null;
        
        DeepLinkTypes(java.lang.String type) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel.DeepLinkTypes> getEntries() {
            return null;
        }
    }
}