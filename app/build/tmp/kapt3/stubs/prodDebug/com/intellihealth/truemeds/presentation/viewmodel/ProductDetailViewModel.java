package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a2\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u00cc\u0002\u001a\u00030\u00cd\u00022\n\u0010\u00ce\u0002\u001a\u0005\u0018\u00010\u008e\u0001J\u001b\u0010\u00cf\u0002\u001a\u00030\u008f\u00012\b\u0010\u00d0\u0002\u001a\u00030\u00d1\u00022\u0007\u0010\u00d2\u0002\u001a\u00020sJ\u0012\u0010\u00d3\u0002\u001a\u00030\u00d4\u00022\b\u0010\u00d0\u0002\u001a\u00030\u00d1\u0002J\u001d\u0010\u00d5\u0002\u001a\u00030\u00cd\u00022\n\u0010\u00ce\u0002\u001a\u0005\u0018\u00010\u008e\u00012\u0007\u0010\u00d6\u0002\u001a\u000204J\u001b\u0010\u00d7\u0002\u001a\u00020 2\u0007\u0010\u00d8\u0002\u001a\u00020:2\u0007\u0010\u00d9\u0002\u001a\u00020:H\u0002J\u0012\u0010\u00da\u0002\u001a\u00020 2\u0007\u0010\u00db\u0002\u001a\u00020:H\u0002J\u0012\u0010\u00dc\u0002\u001a\u00020 2\u0007\u0010\u00db\u0002\u001a\u00020:H\u0002J\u0012\u0010\u00dd\u0002\u001a\u00020 2\u0007\u0010\u00db\u0002\u001a\u00020:H\u0002JB\u0010\u00de\u0002\u001a\u00030\u00cd\u00022\b\u0010\u00d0\u0002\u001a\u00030\u00d1\u00022\u000f\u0010\u00df\u0002\u001a\n\u0012\u0005\u0012\u00030\u00e0\u00020\u00a4\u00012\u0007\u0010\u00e1\u0002\u001a\u00020 2\t\b\u0002\u0010\u00e2\u0002\u001a\u00020:2\t\b\u0002\u0010\u00c9\u0001\u001a\u00020 J*\u0010\u00e3\u0002\u001a\n\u0012\u0005\u0012\u00030\u00e0\u00020\u00a4\u00012\u0007\u0010\u00e4\u0002\u001a\u00020 2\u0007\u0010\u00e5\u0002\u001a\u00020 H\u0082@\u00a2\u0006\u0003\u0010\u00e6\u0002J\u001a\u0010\u00e7\u0002\u001a\n\u0012\u0005\u0012\u00030\u00e8\u00020\u00a4\u00012\u0007\u0010\u00db\u0002\u001a\u00020:H\u0002J\u0011\u0010\u00e9\u0002\u001a\u00030\u00cd\u00022\u0007\u0010\u00db\u0002\u001a\u00020:J\u0015\u0010\u00ea\u0002\u001a\u0005\u0018\u00010\u00eb\u00022\u0007\u0010\u00db\u0002\u001a\u00020:H\u0002J!\u0010\u00ec\u0002\u001a\n\u0012\u0005\u0012\u00030\u00e0\u00020\u00a4\u00012\u0007\u0010\u00db\u0002\u001a\u00020:2\u0007\u0010\u00ed\u0002\u001a\u00020sJ\b\u0010\u00ee\u0002\u001a\u00030\u00d4\u0002J\u0010\u0010\u00ef\u0002\u001a\u00020s2\u0007\u0010\u00db\u0002\u001a\u00020:J\u0012\u0010\u00f0\u0002\u001a\u00020s2\u0007\u0010\u00db\u0002\u001a\u00020:H\u0002J\u0011\u0010\u00f1\u0002\u001a\u00030\u00cd\u00022\u0007\u0010\u00f2\u0002\u001a\u00020\u001aJ\u0011\u0010\u00f3\u0002\u001a\u00030\u00cd\u00022\u0007\u0010\u00f4\u0002\u001a\u00020:J\n\u0010\u00f5\u0002\u001a\u00030\u00d1\u0002H\u0002J,\u0010\u00f6\u0002\u001a\u00030\u00cd\u00022\u0007\u0010\u00f7\u0002\u001a\u00020:2\u0007\u0010\u00f8\u0002\u001a\u00020:2\u0007\u0010\u00f9\u0002\u001a\u00020 H\u0086@\u00a2\u0006\u0003\u0010\u00fa\u0002J\u001e\u0010\u00fb\u0002\u001a\u0005\u0018\u00010\u00fc\u00022\u0007\u0010\u00fd\u0002\u001a\u00020:2\u0007\u0010\u00fe\u0002\u001a\u00020:H\u0002J\u001a\u0010\u00ff\u0002\u001a\u00030\u00cd\u00022\u0007\u0010\u00db\u0002\u001a\u00020:H\u0086@\u00a2\u0006\u0003\u0010\u0080\u0003J\u0011\u0010\u0081\u0003\u001a\u00030\u00cd\u00022\u0007\u0010\u00f2\u0002\u001a\u00020\u001aJ\u0011\u0010\u0082\u0003\u001a\u00030\u00cd\u00022\u0007\u0010\u00f2\u0002\u001a\u00020\u001aJ\u0011\u0010\u0083\u0003\u001a\u00030\u00cd\u00022\u0007\u0010\u00db\u0002\u001a\u00020:J\u0012\u0010\u0084\u0003\u001a\u00030\u00cd\u00022\b\u0010\u0085\u0003\u001a\u00030\u0086\u0003J\u0012\u0010\u0087\u0003\u001a\u00030\u00cd\u00022\b\u0010\u0088\u0003\u001a\u00030\u0089\u0003J\b\u0010\u008a\u0003\u001a\u00030\u00cd\u0002J\u0014\u0010\u008b\u0003\u001a\u00030\u00cd\u00022\n\u0010\u00ce\u0002\u001a\u0005\u0018\u00010\u008e\u0001Je\u0010\u008c\u0003\u001a\u0005\u0018\u00010\u008d\u00032\u0007\u0010\u008e\u0003\u001a\u00020:2\b\u0010\u00d0\u0002\u001a\u00030\u00d1\u00022\u000f\u0010\u008f\u0003\u001a\n\u0012\u0005\u0012\u00030\u00e0\u00020\u00a4\u00012\u0007\u0010\u00d2\u0002\u001a\u00020:2\u0007\u0010\u0090\u0003\u001a\u00020 2\u0007\u0010\u0091\u0003\u001a\u00020 2\b\u0010\u0092\u0003\u001a\u00030\u00d1\u00022\n\u0010\u0093\u0003\u001a\u0005\u0018\u00010\u00d1\u0002\u00a2\u0006\u0003\u0010\u0094\u0003J\u0012\u0010\u0095\u0003\u001a\u00030\u00cd\u00022\b\u0010\u0096\u0003\u001a\u00030\u00d1\u0002J\u0011\u0010\u0097\u0003\u001a\u00030\u00cd\u00022\u0007\u0010\u0098\u0003\u001a\u00020:J\b\u0010\u0099\u0003\u001a\u00030\u00cd\u0002J\u001e\u0010\u009a\u0003\u001a\u00030\u00cd\u00022\t\u0010\u009b\u0003\u001a\u0004\u0018\u00010:2\t\u0010\u009c\u0003\u001a\u0004\u0018\u00010:J\u0012\u0010\u009d\u0003\u001a\u00030\u00cd\u00022\b\u0010\u009e\u0003\u001a\u00030\u009f\u0003J2\u0010\u00a0\u0003\u001a\u00030\u00cd\u00022\u0007\u0010\u00a1\u0003\u001a\u00020\u001a2\u0007\u0010\u00f9\u0002\u001a\u00020 2\t\u0010\u00a2\u0003\u001a\u0004\u0018\u00010:2\u000b\b\u0002\u0010\u00a3\u0003\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u00a4\u0003\u001a\u00030\u00cd\u0002J=\u0010\u00a5\u0003\u001a\u00030\u00cd\u00022\u0007\u0010\u00a1\u0003\u001a\u00020\u001a2\u0007\u0010\u00a6\u0003\u001a\u00020 2\u000b\b\u0002\u0010\u00a2\u0003\u001a\u0004\u0018\u00010:2\u000b\b\u0002\u0010\u00a3\u0003\u001a\u0004\u0018\u00010\u001aH\u0086@\u00a2\u0006\u0003\u0010\u00a7\u0003J\b\u0010\u00e3\u0001\u001a\u00030\u00cd\u0002J\u0012\u0010\u00a8\u0003\u001a\u00030\u00cd\u00022\b\u0010\u0088\u0003\u001a\u00030\u0089\u0003J\u0012\u0010\u00a9\u0003\u001a\u00030\u00cd\u00022\b\u0010\u00aa\u0003\u001a\u00030\u00ab\u0003J\u0012\u0010\u00ac\u0003\u001a\u00030\u00cd\u00022\b\u0010\u00aa\u0003\u001a\u00030\u00ab\u0003J$\u0010\u00ad\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`&2\u0007\u0010\u00db\u0002\u001a\u00020:J%\u0010\u00ae\u0003\u001a\u00030\u00cd\u00022\u0007\u0010\u00af\u0003\u001a\u00020:2\u0007\u0010\u00b0\u0003\u001a\u00020:2\u0007\u0010\u00db\u0002\u001a\u00020:H\u0002J\u0014\u0010\u00b1\u0003\u001a\u00030\u00cd\u00022\n\u0010\u00b2\u0003\u001a\u0005\u0018\u00010\u008e\u0001J\u0012\u0010\u00b3\u0003\u001a\u00030\u00cd\u00022\b\u0010\u00b2\u0003\u001a\u00030\u008e\u0001R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020%\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020%\u0018\u0001`&0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010/\u001a\u000200\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u001c\u0010B\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R\u000e\u0010E\u001a\u00020FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010N\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR \u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u001c\"\u0004\bS\u0010TR0\u0010U\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020V0\u000bj\b\u0012\u0004\u0012\u00020V`&0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001c\"\u0004\bX\u0010TR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u001c\u0010[\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010<\"\u0004\b]\u0010>R\u001d\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100_\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001c\u0010g\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010<\"\u0004\bi\u0010>R\u001d\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100\n\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010\u001cR\u001a\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010m\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020s0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010\u001cR\u001d\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010\u001cR\u0019\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010x0\n\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010\u001cR(\u0010z\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u001c\"\u0004\b|\u0010TR\u001c\u0010}\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010<\"\u0004\b\u007f\u0010>R\u001f\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00100_8F\u00a2\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010aR\u001f\u0010\u0082\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100_8F\u00a2\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010aR \u0010\u0084\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010\u00100_8F\u00a2\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010aR \u0010\u0087\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010\u00100_8F\u00a2\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010aR \u0010\u0089\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010\u00100_8F\u00a2\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010aR2\u0010\u008c\u0001\u001a!\u0012\u001d\u0012\u001b\u0012\u0017\u0012\u0015\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00010\u008d\u00010\u00100_8F\u00a2\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010aR0\u0010\u0091\u0001\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0015\u0012\u0013\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u0001\u0012\u0005\u0012\u00030\u0092\u00010\u008d\u00010\u00100_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010aR \u0010\u0094\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00010\u00100_8F\u00a2\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010aR$\u0010\u0097\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010\u009d\u0001\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010<\"\u0005\b\u009f\u0001\u0010>R&\u0010\u00a0\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\u001c\"\u0005\b\u00a2\u0001\u0010TR)\u0010\u00a3\u0001\u001a\f\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u00a4\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a5\u0001\u0010\u00a6\u0001\"\u0006\b\u00a7\u0001\u0010\u00a8\u0001R-\u0010\u00a9\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020%\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020%\u0018\u0001`&0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00aa\u0001\u0010aR-\u0010\u00ab\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`&0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ac\u0001\u0010aR\u001b\u0010\u00ad\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ae\u0001\u0010aR(\u0010v\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a0\u000bj\b\u0012\u0004\u0012\u00020\u001a`&0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00af\u0001\u0010aR\u001b\u0010\u00b0\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010x0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b1\u0001\u0010aR\u001c\u0010\u00b2\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00b3\u00010_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b4\u0001\u0010aR\u001c\u0010\u00b5\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00b3\u00010_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b6\u0001\u0010aR\u001b\u0010\u00b7\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b8\u0001\u0010aR\u001f\u0010\u00b9\u0001\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b9\u0001\u0010<\"\u0005\b\u00ba\u0001\u0010>R$\u0010\u00bb\u0001\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00bf\u0001\u001a\u0006\b\u00bb\u0001\u0010\u00bc\u0001\"\u0006\b\u00bd\u0001\u0010\u00be\u0001R\u001f\u0010\u00c0\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00100\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c0\u0001\u0010\u001cR\u001d\u0010\u00c1\u0001\u001a\u00020 X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0001\u0010d\"\u0005\b\u00c2\u0001\u0010fR#\u0010\u00c3\u0001\u001a\b\u0012\u0004\u0012\u00020 0\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c3\u0001\u0010\u001c\"\u0005\b\u00c4\u0001\u0010TR$\u0010\u00c5\u0001\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00bf\u0001\u001a\u0006\b\u00c5\u0001\u0010\u00bc\u0001\"\u0006\b\u00c6\u0001\u0010\u00be\u0001R\u001d\u0010\u00c7\u0001\u001a\u00020 X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c7\u0001\u0010d\"\u0005\b\u00c8\u0001\u0010fR\u001d\u0010\u00c9\u0001\u001a\u00020 X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c9\u0001\u0010d\"\u0005\b\u00ca\u0001\u0010fR\u0018\u0010\u00cb\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00cc\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u00cd\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00cc\u00010_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cd\u0001\u0010aR\u001f\u0010\u00ce\u0001\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cf\u0001\u0010<\"\u0005\b\u00d0\u0001\u0010>R\u001f\u0010\u00d1\u0001\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d2\u0001\u0010<\"\u0005\b\u00d3\u0001\u0010>R\u001f\u0010\u00d4\u0001\u001a\u00020sX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d5\u0001\u0010\u00d6\u0001\"\u0006\b\u00d7\u0001\u0010\u00d8\u0001R\u0019\u0010\u00d9\u0001\u001a\b\u0012\u0004\u0012\u00020 0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00da\u0001\u0010\u001cR\u001c\u0010\u00db\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u00dc\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u00dd\u0001\u001a\b\u0012\u0004\u0012\u00020 0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u00de\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00b3\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b2\u0001\u0010\u001c\"\u0005\b\u00df\u0001\u0010TR/\u0010\u00e0\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u00e1\u00010\u000bj\t\u0012\u0005\u0012\u00030\u00e1\u0001`&X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e2\u0001\u0010o\"\u0005\b\u00e3\u0001\u0010qR \u0010\u00e4\u0001\u001a\u00030\u00e5\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e6\u0001\u0010\u00e7\u0001\"\u0006\b\u00e8\u0001\u0010\u00e9\u0001R\u001f\u0010\u00ea\u0001\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00eb\u0001\u0010<\"\u0005\b\u00ec\u0001\u0010>R&\u0010\u00ed\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u00ee\u0001\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ef\u0001\u0010\u001c\"\u0005\b\u00f0\u0001\u0010TR\u001b\u0010\u00f1\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00f2\u0001\u0010aR.\u0010\u00f3\u0001\u001a!\u0012\u001d\u0012\u001b\u0012\u0017\u0012\u0015\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00010\u008d\u00010\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u00f4\u0001\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0015\u0012\u0013\u0012\u0007\u0012\u0005\u0018\u00010\u008e\u0001\u0012\u0005\u0012\u00030\u0092\u00010\u008d\u00010\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u00f5\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f6\u0001\u0010\u001c\"\u0005\b\u00f7\u0001\u0010TR\u0019\u0010\u00f8\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00f9\u0001\u0010aR!\u0010\u00fa\u0001\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00fb\u0001\u0010\u00fc\u0001\"\u0006\b\u00fd\u0001\u0010\u00fe\u0001R\u001f\u0010\u00ff\u0001\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0002\u0010<\"\u0005\b\u0081\u0002\u0010>R\u001f\u0010\u0082\u0002\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0002\u0010<\"\u0005\b\u0084\u0002\u0010>R\u001f\u0010\u0085\u0002\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0002\u0010<\"\u0005\b\u0087\u0002\u0010>R\u0013\u0010\u0088\u0002\u001a\u00020H\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0002\u0010JR\u0019\u0010\u008a\u0002\u001a\b\u0012\u0004\u0012\u00020\u00170_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0002\u0010aR\u0019\u0010\u008c\u0002\u001a\b\u0012\u0004\u0012\u00020\u00170_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008d\u0002\u0010aR \u0010\u008e\u0002\u001a\u00030\u008f\u0002X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002\"\u0006\b\u0092\u0002\u0010\u0093\u0002R\u001b\u0010\u0094\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0002\u0010aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0096\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00b3\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u0010\u001c\"\u0005\b\u0097\u0002\u0010TR\u000f\u0010\u0098\u0002\u001a\u00020FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0099\u0002\u001a\u00020HX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0002\u0010J\"\u0005\b\u009b\u0002\u0010LR#\u0010\u009c\u0002\u001a\b\u0012\u0004\u0012\u00020s0\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0002\u0010\u001c\"\u0005\b\u009e\u0002\u0010TR\u001f\u0010\u009f\u0002\u001a\u00020sX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a0\u0002\u0010\u00d6\u0001\"\u0006\b\u00a1\u0002\u0010\u00d8\u0001R%\u0010\u00a2\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0002\u0010\u001c\"\u0005\b\u00a4\u0002\u0010TR\u0015\u0010\u00a5\u0002\u001a\u00030\u00a6\u0002\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00a7\u0002\u0010\u00a8\u0002R\u001f\u0010\u00a9\u0002\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0002\u0010<\"\u0005\b\u00ab\u0002\u0010>R\u001f\u0010\u00ac\u0002\u001a\u00020sX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0002\u0010\u00d6\u0001\"\u0006\b\u00ae\u0002\u0010\u00d8\u0001R\u001f\u0010\u00af\u0002\u001a\u00020sX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b0\u0002\u0010\u00d6\u0001\"\u0006\b\u00b1\u0002\u0010\u00d8\u0001R\u001c\u0010\u00b2\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00010\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u00b3\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u00b4\u0002\u001a\b\u0012\u0004\u0012\u00020 0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b5\u0002\u0010aR#\u0010\u00b6\u0002\u001a\b\u0012\u0004\u0012\u00020 0\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b7\u0002\u0010\u001c\"\u0005\b\u00b8\u0002\u0010TR\u0019\u0010\u00b9\u0002\u001a\b\u0012\u0004\u0012\u00020 0_8F\u00a2\u0006\u0007\u001a\u0005\b\u00ba\u0002\u0010aR#\u0010\u00bb\u0002\u001a\b\u0012\u0004\u0012\u00020 0\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bc\u0002\u0010\u001c\"\u0005\b\u00bd\u0002\u0010TR\u0019\u0010\u00be\u0002\u001a\b\u0012\u0004\u0012\u00020 0_8F\u00a2\u0006\u0007\u001a\u0005\b\u00bf\u0002\u0010aR\u0019\u0010\u00c0\u0002\u001a\b\u0012\u0004\u0012\u00020#0_\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c1\u0002\u0010aR\u000f\u0010\u00c2\u0002\u001a\u00020FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u00c3\u0002\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c4\u0002\u0010<\"\u0005\b\u00c5\u0002\u0010>R\u001f\u0010\u00c6\u0002\u001a\u00020sX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c7\u0002\u0010\u00d6\u0001\"\u0006\b\u00c8\u0002\u0010\u00d8\u0001R\u001f\u0010\u00c9\u0002\u001a\u0004\u0018\u00010:X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ca\u0002\u0010<\"\u0005\b\u00cb\u0002\u0010>\u00a8\u0006\u00b4\u0003"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/ProductDetailViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModelWithLogin;", "context", "Landroid/content/Context;", "productDetailUseCase", "Lcom/intellihealth/truemeds/domain/usecase/ProductDetailUseCase;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "(Landroid/content/Context;Lcom/intellihealth/truemeds/domain/usecase/ProductDetailUseCase;Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;)V", "_bannerData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/BannerItemModel;", "_compositionCardData", "Lcom/intellihealth/salt/models/CompositionCardModel;", "_crosssellingClick", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "Lcom/intellihealth/salt/models/ProductInfoModel;", "_notificationDetailData", "Lcom/intellihealth/truemeds/data/model/orderflow/CouponCodeDataModel;", "_orgCount", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/OrgQtyUpdate;", "_pdpHeader", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "_pdpStickyHeader", "_productDetail", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "get_productDetail", "()Landroidx/lifecycle/MutableLiveData;", "_recommendedData", "Lcom/intellihealth/salt/models/RecommendedSubUpsellModel;", "_showPlusIconForAddButton", "", "kotlin.jvm.PlatformType", "_subsCount", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/SubsQtyUpdate;", "authorListLiveData", "Lcom/intellihealth/salt/models/AuthorCardModel;", "Lkotlin/collections/ArrayList;", "billDetailsData", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "getBillDetailsData", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "setBillDetailsData", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;)V", "callPharmacist", "", "cartIconClickCallback", "Lcom/intellihealth/salt/callbacks/CartIconClickCallback;", "getCartIconClickCallback", "()Lcom/intellihealth/salt/callbacks/CartIconClickCallback;", "cartTotal", "", "getCartTotal", "()D", "setCartTotal", "(D)V", "clickedOnPage", "", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "clickedOnPageNameForCouponEvent", "getClickedOnPageNameForCouponEvent", "setClickedOnPageNameForCouponEvent", "clicked_suggsetion_type", "getClicked_suggsetion_type", "setClicked_suggsetion_type", "compareChooseOrgProductCardCallBack", "Lcom/intellihealth/salt/callbacks/FullWidthProductCardCallback;", "compareChooseOrgcallback", "Lcom/intellihealth/salt/callbacks/StepperCallback;", "getCompareChooseOrgcallback", "()Lcom/intellihealth/salt/callbacks/StepperCallback;", "setCompareChooseOrgcallback", "(Lcom/intellihealth/salt/callbacks/StepperCallback;)V", "compareChooseSubsProductCardCallBack", "compareChooseSubscallback", "getCompareChooseSubscallback", "setCompareChooseSubscallback", "compareNChooseSubs", "getCompareNChooseSubs", "setCompareNChooseSubs", "(Landroidx/lifecycle/MutableLiveData;)V", "compositionDetailsData", "Lcom/intellihealth/truemeds/data/model/home/CompositionBSDataModel;", "getCompositionDetailsData", "setCompositionDetailsData", "getContext", "()Landroid/content/Context;", "crossSellingSectionHeader", "getCrossSellingSectionHeader", "setCrossSellingSectionHeader", "crosssellingClick", "Landroidx/lifecycle/LiveData;", "getCrosssellingClick", "()Landroidx/lifecycle/LiveData;", "customerAlsoBoughtViewed", "getCustomerAlsoBoughtViewed", "()Z", "setCustomerAlsoBoughtViewed", "(Z)V", "deepLinkActionType", "getDeepLinkActionType", "setDeepLinkActionType", "deleteProductEventListener", "getDeleteProductEventListener", "dismissBottomSheet", "doubleStackApiResponseData", "getDoubleStackApiResponseData", "()Ljava/util/ArrayList;", "setDoubleStackApiResponseData", "(Ljava/util/ArrayList;)V", "doubleStackDeleteData", "", "getDoubleStackDeleteData", "doubleStackListLiveData", "getDoubleStackListLiveData", "doubleStackSectionMutableLiveData", "Lcom/intellihealth/salt/models/ProductCardSectionModel;", "getDoubleStackSectionMutableLiveData", "editMedicineApiSuccess", "getEditMedicineApiSuccess", "setEditMedicineApiSuccess", "elastic_search_type", "getElastic_search_type", "setElastic_search_type", "eventCallPharmacist", "getEventCallPharmacist", "eventDismissBottomSheet", "getEventDismissBottomSheet", "eventLaunchPDPage", "Lcom/intellihealth/truemeds/data/model/search/ProductOrgSubsModel;", "getEventLaunchPDPage", "eventLaunchPDPageForSub", "getEventLaunchPDPageForSub", "eventMessage", "Lcom/intellihealth/truemeds/data/utils/MessageConstant;", "getEventMessage", "eventOpenCouponPopup", "Lkotlin/Pair;", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "getEventOpenCouponPopup", "eventOpenCouponPopupOffline", "Lcom/intellihealth/truemeds/data/model/coupon/CouponResponse;", "getEventOpenCouponPopupOffline", "eventShowError", "Lcom/intellihealth/truemeds/data/utils/ERRORS;", "getEventShowError", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "fromOrderSummarySkuNameForSubs", "getFromOrderSummarySkuNameForSubs", "setFromOrderSummarySkuNameForSubs", "ftcCouponData", "getFtcCouponData", "setFtcCouponData", "ftcCouponResponse", "", "getFtcCouponResponse", "()Ljava/util/List;", "setFtcCouponResponse", "(Ljava/util/List;)V", "getAuthorListLiveData", "getGetAuthorListLiveData", "getBannerLiveData", "getGetBannerLiveData", "getCompositionUILiveData", "getGetCompositionUILiveData", "getGetDoubleStackListLiveData", "getDoubleStackSectionLiveData", "getGetDoubleStackSectionLiveData", "getManufacturerDetailLiveData", "Lcom/intellihealth/salt/models/FaqModel;", "getGetManufacturerDetailLiveData", "getProductInfoLiveData", "getGetProductInfoLiveData", "getRecommendedLiveData", "getGetRecommendedLiveData", "isAlreadyAddedToCartFromSearch", "setAlreadyAddedToCartFromSearch", "isChronicAdded", "()Ljava/lang/Boolean;", "setChronicAdded", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isDelete", "isFromCrossSelling", "setFromCrossSelling", "isFromOrderStatus", "setFromOrderStatus", "isOtcAdded", "setOtcAdded", "isReload", "setReload", "isSubs", "setSubs", "isSubsViewComparison", "Lcom/intellihealth/salt/models/ProductComparisonModel;", "isSubsViewComparisonLiveData", "item_qc", "getItem_qc", "setItem_qc", "item_rt", "getItem_rt", "setItem_rt", "lastScrollPosition", "getLastScrollPosition", "()I", "setLastScrollPosition", "(I)V", "launchOrgSubsBottomSheet", "getLaunchOrgSubsBottomSheet", "launchPDPage", "launchPDPageForSub", "launchPdBottomSheet", "manufacturerDetailLiveData", "setManufacturerDetailLiveData", "medicineListDataReceived", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineListDetailsSent;", "getMedicineListDataReceived", "setMedicineListDataReceived", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "notForSaleMessage", "getNotForSaleMessage", "setNotForSaleMessage", "notificationData", "Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;", "getNotificationData", "setNotificationData", "notificationDetailData", "getNotificationDetailData", "openCouponPopup", "openCouponPopupOffline", "orgBottomSheet", "getOrgBottomSheet", "setOrgBottomSheet", "orgCount", "getOrgCount", "orgProductForSubs", "getOrgProductForSubs", "()Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "setOrgProductForSubs", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;)V", "otcCategoryName", "getOtcCategoryName", "setOtcCategoryName", "otcSubCategoryName", "getOtcSubCategoryName", "setOtcSubCategoryName", "otcSuperCategoryName", "getOtcSuperCategoryName", "setOtcSuperCategoryName", "pdBottomSheetQuantityStepperCallback", "getPdBottomSheetQuantityStepperCallback", "pdpHeader", "getPdpHeader", "pdpStickyHeader", "getPdpStickyHeader", "productCardSectionCallBack", "Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "getProductCardSectionCallBack", "()Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "setProductCardSectionCallBack", "(Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;)V", "productDetailLiveData", "getProductDetailLiveData", "productInfoLiveData", "setProductInfoLiveData", "recommendedFullwidthProductCardCallBack", "recommendedStepperCallBack", "getRecommendedStepperCallBack", "setRecommendedStepperCallBack", "recommenededUpdatedCount", "getRecommenededUpdatedCount", "setRecommenededUpdatedCount", "resultPosition", "getResultPosition", "setResultPosition", "sbsBottomSheet", "getSbsBottomSheet", "setSbsBottomSheet", "searchBarCallback", "Lcom/intellihealth/salt/callbacks/SearchBarCallback;", "getSearchBarCallback", "()Lcom/intellihealth/salt/callbacks/SearchBarCallback;", "section", "getSection", "setSection", "sectionIndex", "getSectionIndex", "setSectionIndex", "sectionRow", "getSectionRow", "setSectionRow", "showErrorPd", "showMessage", "showPlusIconForAddButton", "getShowPlusIconForAddButton", "showProductPage", "getShowProductPage", "setShowProductPage", "showProductPageLiveData", "getShowProductPageLiveData", "showShimmer", "getShowShimmer", "setShowShimmer", "showShimmerLiveData", "getShowShimmerLiveData", "subsCount", "getSubsCount", "subsProductCardCallBack", "suggestion_term_clicked", "getSuggestion_term_clicked", "setSuggestion_term_clicked", "suggestion_term_clicked_position", "getSuggestion_term_clicked_position", "setSuggestion_term_clicked_position", "term_searched", "getTerm_searched", "setTerm_searched", "applyCouponClick", "", "couponCodeResponse", "applyCouponCode", "orderId", "", "offerId", "calculateBillDetailsAfterCouponApplied", "Lkotlinx/coroutines/Job;", "calculateSavingAmount", "currentPayableAmount", "checkAlreadyAddedAsSubs", "orgProductCode", "subsProductCode", "checkAlreadyAddedSubsAsOrg", "productCode", "checkProductAsReplaceInReorder", "checkProductReplacedInReorder", "editMedicine", "list", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "removeMed", "page", "getAddedMedicinesFromCart", "newOrder", "isReplaceAll", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddedSubsInfoByOrg", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "getCrossSellingDataForProductDetail", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "getEditOrderRequestData", "qty", "getFtcCouponsData", "getMedicineCount", "getOrgCountFromSubsMed", "getOrgList", "model", "getPDCompositionBSData", "compositionDetails", "getPaymentMode", "getProductDetailData", "text", "type", "isBottomSheetBahaviour", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductDetails", "Lcom/intellihealth/truemeds/presentation/model/SearchResultElasticResponse;", "query", "elasticSearchType", "getProductInfoAndWrittenReviewBy", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubsBottomSheet", "getSubsList", "getSuggestionRecommendedDBCount", "insertRecentlySearchMedicineInDB", "recentMedicine", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;", "pdPageSubView", "fbSubsView", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FbSubsView;", "preapareDataForDoubleStack", "removeCouponClick", "replaceMedsForIncompleteOrder", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveMedsCreateEditOrderResponse;", "loggedInUserId", "medsList", "checkAutoConfirmEligibility", "newAlgo", "srcType", "variantId", "(Ljava/lang/String;JLjava/util/List;Ljava/lang/String;ZZJLjava/lang/Long;)Lcom/intellihealth/truemeds/data/model/orderflow/SaveMedsCreateEditOrderResponse;", "sendFtcCounterStarted", "timestamp", "sendMedicineDetailsViewedViewedEvent", "productDetailsSection", "sendPDPViewedFirebaseEvent", "sendPdPageDeleteEvent", "productCodeToDelete", "skuName", "sendPdpImageViewedEvent", "mxPdpImageViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpImageViewed;", "sendPdpViewedEvent", "productInfo", "subsFoundOrderSummary", "eventOrgProductForThisPage", "sendViewCartClickFirebaseEvent", "setMedicineDetailsInfoBannerComposition", "isBottomSheet", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;ZLjava/lang/String;Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subsPopup", "substituteDropdownClosed", "firebaseEventModel", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FirebaseEventModel;", "substituteDropdownViewed", "updateCrossSellingRecommendedProducts", "updateImageAndTimeInRecentlySearchMedicine", "image", "drugType", "urgencyStickyClickedEvent", "couponResponse", "urgencyStickyViewedEvent", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public class ProductDetailViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModelWithLogin {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.ProductDetailUseCase productDetailUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase = null;
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase;
    private int lastScrollPosition = 0;
    private boolean customerAlsoBoughtViewed = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showPlusIconForAddButton = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showPlusIconForAddButton = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> _productDetail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> productDetailLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel>> _bannerData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel>> getBannerLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.RecommendedSubUpsellModel> _recommendedData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.RecommendedSubUpsellModel> getRecommendedLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CompositionCardModel> _compositionCardData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.CompositionCardModel> getCompositionUILiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.intellihealth.truemeds.data.model.home.CompositionBSDataModel>> compositionDetailsData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> orgBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> sbsBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmer;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> showErrorPd = null;
    
    /**
     * To dismiss PD bottom sheet from cart page
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> dismissBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.ProductOrgSubsModel>> launchPDPage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.ProductOrgSubsModel>> launchPDPageForSub = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.intellihealth.salt.models.AuthorCardModel>> authorListLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.salt.models.AuthorCardModel>> getAuthorListLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.FaqModel> productInfoLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel> getProductInfoLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductCardSectionModel> doubleStackSectionMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductCardSectionModel> getDoubleStackSectionLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> doubleStackListLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> getDoubleStackListLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> doubleStackApiResponseData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductComparisonModel> isSubsViewComparison = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductComparisonModel> isSubsViewComparisonLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.FaqModel> manufacturerDetailLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel> getManufacturerDetailLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> _pdpHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> pdpHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> _pdpStickyHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> pdpStickyHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchOrgSubsBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchPdBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> _crosssellingClick = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> crosssellingClick = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> notificationData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel> _notificationDetailData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel> notificationDetailData = null;
    private boolean isReload = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> callPharmacist = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> compareNChooseSubs;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> deleteProductEventListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> isDelete = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProductPage;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.productlistanddetails.OrgQtyUpdate> _orgCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.productlistanddetails.OrgQtyUpdate> orgCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.productlistanddetails.SubsQtyUpdate> _subsCount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.productlistanddetails.SubsQtyUpdate> subsCount = null;
    private double cartTotal = 0.0;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel orgProductForSubs;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> recommenededUpdatedCount;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> editMedicineApiSuccess;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> doubleStackDeleteData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> ftcCouponData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse>>> openCouponPopup = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponResponse>>> openCouponPopupOffline = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponResponse>>> eventOpenCouponPopupOffline = null;
    private boolean isSubs = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fromOrderSummarySkuNameForSubs;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFromOrderStatus;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isAlreadyAddedToCartFromSearch;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> ftcCouponResponse;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage = "product_detail_page";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPageNameForCouponEvent = "product_detail_page";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String item_qc = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String item_rt = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String term_searched = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestion_term_clicked = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clicked_suggsetion_type = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String elastic_search_type = "";
    private int suggestion_term_clicked_position = 0;
    private int resultPosition = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String section = "";
    private int sectionIndex = 0;
    private int sectionRow = 0;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> medicineListDataReceived;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String crossSellingSectionHeader = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isChronicAdded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String notForSaleMessage = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isOtcAdded;
    private boolean isFromCrossSelling = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String otcSuperCategoryName = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String otcCategoryName = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String otcSubCategoryName = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String deepLinkActionType = "";
    
    /**
     * ***** PD Page Call backs
     */
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.salt.callbacks.SearchBarCallback searchBarCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.salt.callbacks.CartIconClickCallback cartIconClickCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.salt.callbacks.StepperCallback pdBottomSheetQuantityStepperCallback = null;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.callbacks.StepperCallback recommendedStepperCallBack;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.callbacks.FullWidthProductCardCallback recommendedFullwidthProductCardCallBack;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.callbacks.StepperCallback compareChooseOrgcallback;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.callbacks.FullWidthProductCardCallback compareChooseOrgProductCardCallBack;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.callbacks.StepperCallback compareChooseSubscallback;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.callbacks.FullWidthProductCardCallback compareChooseSubsProductCardCallBack;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.callbacks.FullWidthProductCardCallback subsProductCardCallBack;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback productCardSectionCallBack;
    
    @javax.inject.Inject()
    public ProductDetailViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.ProductDetailUseCase productDetailUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEventUseCase() {
        return null;
    }
    
    public final void setFirebaseEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    public final int getLastScrollPosition() {
        return 0;
    }
    
    public final void setLastScrollPosition(int p0) {
    }
    
    public final boolean getCustomerAlsoBoughtViewed() {
        return false;
    }
    
    public final void setCustomerAlsoBoughtViewed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowPlusIconForAddButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> get_productDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getProductDetailLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel>> getGetBannerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.RecommendedSubUpsellModel> getGetRecommendedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.CompositionCardModel> getGetCompositionUILiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.intellihealth.truemeds.data.model.home.CompositionBSDataModel>> getCompositionDetailsData() {
        return null;
    }
    
    public final void setCompositionDetailsData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.intellihealth.truemeds.data.model.home.CompositionBSDataModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> getOrgBottomSheet() {
        return null;
    }
    
    public final void setOrgBottomSheet(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> getSbsBottomSheet() {
        return null;
    }
    
    public final void setSbsBottomSheet(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmer() {
        return null;
    }
    
    public final void setShowShimmer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> getEventShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventDismissBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.ProductOrgSubsModel>> getEventLaunchPDPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.ProductOrgSubsModel>> getEventLaunchPDPageForSub() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.salt.models.AuthorCardModel>> getGetAuthorListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.FaqModel> getProductInfoLiveData() {
        return null;
    }
    
    public final void setProductInfoLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.FaqModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel> getGetProductInfoLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductCardSectionModel> getDoubleStackSectionMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductCardSectionModel> getGetDoubleStackSectionLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> getDoubleStackListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> getGetDoubleStackListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getDoubleStackApiResponseData() {
        return null;
    }
    
    public final void setDoubleStackApiResponseData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductComparisonModel> isSubsViewComparisonLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.FaqModel> getManufacturerDetailLiveData() {
        return null;
    }
    
    public final void setManufacturerDetailLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.FaqModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel> getGetManufacturerDetailLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> getPdpHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> getPdpStickyHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLaunchOrgSubsBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> getCrosssellingClick() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> getNotificationData() {
        return null;
    }
    
    public final void setNotificationData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel> getNotificationDetailData() {
        return null;
    }
    
    public final boolean isReload() {
        return false;
    }
    
    public final void setReload(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventCallPharmacist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> getCompareNChooseSubs() {
        return null;
    }
    
    public final void setCompareNChooseSubs(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getDeleteProductEventListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> isDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowProductPage() {
        return null;
    }
    
    public final void setShowProductPage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowProductPageLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.productlistanddetails.OrgQtyUpdate> getOrgCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.productlistanddetails.SubsQtyUpdate> getSubsCount() {
        return null;
    }
    
    public final double getCartTotal() {
        return 0.0;
    }
    
    public final void setCartTotal(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getOrgProductForSubs() {
        return null;
    }
    
    public final void setOrgProductForSubs(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRecommenededUpdatedCount() {
        return null;
    }
    
    public final void setRecommenededUpdatedCount(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEditMedicineApiSuccess() {
        return null;
    }
    
    public final void setEditMedicineApiSuccess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDoubleStackDeleteData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> getFtcCouponData() {
        return null;
    }
    
    public final void setFtcCouponData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponResponse>>> getEventOpenCouponPopupOffline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse>>> getEventOpenCouponPopup() {
        return null;
    }
    
    public final boolean isSubs() {
        return false;
    }
    
    public final void setSubs(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFromOrderSummarySkuNameForSubs() {
        return null;
    }
    
    public final void setFromOrderSummarySkuNameForSubs(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFromOrderStatus() {
        return null;
    }
    
    public final void setFromOrderStatus(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String isAlreadyAddedToCartFromSearch() {
        return null;
    }
    
    public final void setAlreadyAddedToCartFromSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> getFtcCouponResponse() {
        return null;
    }
    
    public final void setFtcCouponResponse(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPageNameForCouponEvent() {
        return null;
    }
    
    public final void setClickedOnPageNameForCouponEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItem_qc() {
        return null;
    }
    
    public final void setItem_qc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItem_rt() {
        return null;
    }
    
    public final void setItem_rt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTerm_searched() {
        return null;
    }
    
    public final void setTerm_searched(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuggestion_term_clicked() {
        return null;
    }
    
    public final void setSuggestion_term_clicked(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClicked_suggsetion_type() {
        return null;
    }
    
    public final void setClicked_suggsetion_type(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getElastic_search_type() {
        return null;
    }
    
    public final void setElastic_search_type(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getSuggestion_term_clicked_position() {
        return 0;
    }
    
    public final void setSuggestion_term_clicked_position(int p0) {
    }
    
    public final int getResultPosition() {
        return 0;
    }
    
    public final void setResultPosition(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSection() {
        return null;
    }
    
    public final void setSection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getSectionIndex() {
        return 0;
    }
    
    public final void setSectionIndex(int p0) {
    }
    
    public final int getSectionRow() {
        return 0;
    }
    
    public final void setSectionRow(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData getBillDetailsData() {
        return null;
    }
    
    public final void setBillDetailsData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> getMedicineListDataReceived() {
        return null;
    }
    
    public final void setMedicineListDataReceived(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCrossSellingSectionHeader() {
        return null;
    }
    
    public final void setCrossSellingSectionHeader(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isChronicAdded() {
        return null;
    }
    
    public final void setChronicAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotForSaleMessage() {
        return null;
    }
    
    public final void setNotForSaleMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isOtcAdded() {
        return null;
    }
    
    public final void setOtcAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final boolean isFromCrossSelling() {
        return false;
    }
    
    public final void setFromCrossSelling(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOtcSuperCategoryName() {
        return null;
    }
    
    public final void setOtcSuperCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOtcCategoryName() {
        return null;
    }
    
    public final void setOtcCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOtcSubCategoryName() {
        return null;
    }
    
    public final void setOtcSubCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeepLinkActionType() {
        return null;
    }
    
    public final void setDeepLinkActionType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Initialize Login
     * If TrueCaller bottomsheet can't be shown(this is returned by TrueCaller SDK), then open OTP based login bottomsheet
     */
    public final void insertRecentlySearchMedicineInDB(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine recentMedicine) {
    }
    
    public final void setMedicineListDataReceived() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductDetailData(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String type, boolean isBottomSheetBahaviour, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setMedicineDetailsInfoBannerComposition(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfo, boolean isBottomSheet, @org.jetbrains.annotations.Nullable()
    java.lang.String subsFoundOrderSummary, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel eventOrgProductForThisPage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final int getOrgCountFromSubsMed(java.lang.String productCode) {
        return 0;
    }
    
    private final java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> getAddedSubsInfoByOrg(java.lang.String productCode) {
        return null;
    }
    
    public final void getPDCompositionBSData(@org.jetbrains.annotations.NotNull()
    java.lang.String compositionDetails) {
    }
    
    public final void getOrgList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model) {
    }
    
    /**
     * triggers when ORG SUBS bottom sheet is launched and creates a data for SUBS medicine
     */
    public final void getSubsList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model) {
    }
    
    public final void getSubsBottomSheet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductInfoAndWrittenReviewBy(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void getCrossSellingDataForProductDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
    }
    
    public final void preapareDataForDoubleStack() {
    }
    
    /**
     * ***** PD Page Call backs
     */
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.callbacks.SearchBarCallback getSearchBarCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.callbacks.CartIconClickCallback getCartIconClickCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.callbacks.StepperCallback getPdBottomSheetQuantityStepperCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.callbacks.StepperCallback getRecommendedStepperCallBack() {
        return null;
    }
    
    public final void setRecommendedStepperCallBack(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.callbacks.StepperCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.callbacks.StepperCallback getCompareChooseOrgcallback() {
        return null;
    }
    
    public final void setCompareChooseOrgcallback(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.callbacks.StepperCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.callbacks.StepperCallback getCompareChooseSubscallback() {
        return null;
    }
    
    public final void setCompareChooseSubscallback(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.callbacks.StepperCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback getProductCardSectionCallBack() {
        return null;
    }
    
    public final void setProductCardSectionCallBack(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback p0) {
    }
    
    private final com.intellihealth.truemeds.presentation.model.SearchResultElasticResponse getProductDetails(java.lang.String query, java.lang.String elasticSearchType) {
        return null;
    }
    
    private final void updateImageAndTimeInRecentlySearchMedicine(java.lang.String image, java.lang.String drugType, java.lang.String productCode) {
    }
    
    public final int getMedicineCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
        return 0;
    }
    
    private final boolean checkAlreadyAddedAsSubs(java.lang.String orgProductCode, java.lang.String subsProductCode) {
        return false;
    }
    
    private final boolean checkAlreadyAddedSubsAsOrg(java.lang.String productCode) {
        return false;
    }
    
    private final boolean checkProductAsReplaceInReorder(java.lang.String productCode) {
        return false;
    }
    
    private final boolean checkProductReplacedInReorder(java.lang.String productCode) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse applyCouponCode(long orderId, int offerId) {
        return null;
    }
    
    private final com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse getCrossSellingRecommendedProducts(java.lang.String productCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.intellihealth.salt.models.ProductInfoModel> updateCrossSellingRecommendedProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
        return null;
    }
    
    public final void getSuggestionRecommendedDBCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
    }
    
    public final void editMedicine(long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> list, boolean removeMed, @org.jetbrains.annotations.NotNull()
    java.lang.String page, boolean isSubs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> getEditOrderRequestData(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int qty) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getFtcCouponsData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse replaceMedsForIncompleteOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medsList, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, boolean checkAutoConfirmEligibility, boolean newAlgo, long srcType, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId) {
        return null;
    }
    
    public final void applyCouponClick(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponCodeResponse) {
    }
    
    public final void removeCouponClick(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponCodeResponse) {
    }
    
    private final java.lang.Object getAddedMedicinesFromCart(boolean newOrder, boolean isReplaceAll, kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto>> $completion) {
        return null;
    }
    
    private final long getPaymentMode() {
        return 0L;
    }
    
    public final void calculateSavingAmount(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponCodeResponse, double currentPayableAmount) {
    }
    
    /**
     * *
     *  setting MixPanel SDK event for sticky_strip_viewed
     */
    public final void urgencyStickyViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse) {
    }
    
    /**
     * *
     *  setting MixPanel SDK event for sticky_strip_clicked
     */
    public final void urgencyStickyClickedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse) {
    }
    
    public final void sendPdpImageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpImageViewed mxPdpImageViewed) {
    }
    
    public final void sendMedicineDetailsViewedViewedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String productDetailsSection) {
    }
    
    public final void sendPdpViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfo, boolean isBottomSheetBahaviour, @org.jetbrains.annotations.Nullable()
    java.lang.String subsFoundOrderSummary, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel eventOrgProductForThisPage) {
    }
    
    public final void sendFtcCounterStarted(long timestamp) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job calculateBillDetailsAfterCouponApplied(long orderId) {
        return null;
    }
    
    public final void pdPageSubView(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
    }
    
    public final void subsPopup(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView fbSubsView) {
    }
    
    public final void substituteDropdownViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
    }
    
    public final void substituteDropdownClosed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
    }
    
    public final void sendViewCartClickFirebaseEvent() {
    }
    
    public final void sendPDPViewedFirebaseEvent() {
    }
    
    public final void sendPdPageDeleteEvent(@org.jetbrains.annotations.Nullable()
    java.lang.String productCodeToDelete, @org.jetbrains.annotations.Nullable()
    java.lang.String skuName) {
    }
}