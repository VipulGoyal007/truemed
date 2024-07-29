package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\n\u0010\u00ca\u0002\u001a\u00030\u00cb\u0002H\u0002J5\u0010\u00cc\u0002\u001a\u00030\u00cb\u00022\u0007\u0010\u00cd\u0002\u001a\u00020\u00192\u0007\u0010\u00ce\u0002\u001a\u00020\u00132\u0007\u0010\u00cf\u0002\u001a\u00020n2\u0007\u0010\u00d0\u0002\u001a\u00020Q2\u0007\u0010\u00d1\u0002\u001a\u00020\u0013J\b\u0010\u00d2\u0002\u001a\u00030\u00cb\u0002J\n\u0010\u00d3\u0002\u001a\u00030\u00cb\u0002H\u0002J\u001b\u0010\u00d4\u0002\u001a\u00020.2\u0007\u0010\u00d5\u0002\u001a\u0002072\u0007\u0010\u00d6\u0002\u001a\u00020\u0013H\u0002J\u0016\u0010\u00d7\u0002\u001a\u00030\u00cb\u00022\n\u0010\u00d8\u0002\u001a\u0005\u0018\u00010\u00d9\u0002H\u0002J\n\u0010\u00da\u0002\u001a\u00030\u00cb\u0002H\u0002J\u0019\u0010\u00db\u0002\u001a\u00030\u00cb\u00022\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0003\u0010\u00dc\u0002J\n\u0010\u00dd\u0002\u001a\u00030\u00cb\u0002H\u0002J5\u0010\u00de\u0002\u001a\u00030\u00cb\u00022\u0007\u0010\u00c9\u0001\u001a\u00020W2\u0007\u0010\u00df\u0002\u001a\u00020\u00192\u0007\u0010\u00e0\u0002\u001a\u00020\r2\u0007\u0010\u00e1\u0002\u001a\u00020\u00192\u0007\u0010\u00e2\u0002\u001a\u00020\rJ\u0013\u0010\u00e3\u0002\u001a\u00030\u00cb\u00022\u0007\u0010\u00e4\u0002\u001a\u00020QH\u0002J\u0013\u0010\u00e5\u0002\u001a\u00030\u00cb\u00022\u0007\u0010\u00c9\u0001\u001a\u00020WH\u0002J\n\u0010\u00e6\u0002\u001a\u00030\u00cb\u0002H\u0002J\t\u0010\u00e7\u0002\u001a\u00020WH\u0002J\b\u0010\u00e8\u0002\u001a\u00030\u00cb\u0002J\u001a\u0010\u00e9\u0002\u001a\u00030\u00cb\u00022\u0007\u0010\u00cf\u0002\u001a\u00020n2\u0007\u0010\u00d0\u0002\u001a\u00020QJ#\u0010\u00ea\u0002\u001a\u00030\u00cb\u00022\u0007\u0010\u00cf\u0002\u001a\u00020n2\u0007\u0010\u00d0\u0002\u001a\u00020Q2\u0007\u0010\u00cd\u0002\u001a\u00020\u0019J\b\u0010\u00eb\u0002\u001a\u00030\u00cb\u0002J\b\u0010\u00ec\u0002\u001a\u00030\u00cb\u0002J\b\u0010\u00ed\u0002\u001a\u00030\u00cb\u0002J\n\u0010\u00ee\u0002\u001a\u00030\u00cb\u0002H\u0002J\u0011\u0010\u00ef\u0002\u001a\u00030\u00cb\u0002H\u0086@\u00a2\u0006\u0003\u0010\u00f0\u0002J\b\u0010\u00f1\u0002\u001a\u00030\u00cb\u0002J\b\u0010\u00f2\u0002\u001a\u00030\u00cb\u0002J\"\u0010\u00f3\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0082\u00012\u0010\u0010\u00f4\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0082\u0001J\b\u0010\u00f5\u0002\u001a\u00030\u00cb\u0002J\u001f\u0010\u00f6\u0002\u001a\u0004\u0018\u00010B2\t\u0010\u00cd\u0002\u001a\u0004\u0018\u00010\u00192\t\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0019J\b\u0010\u00f7\u0002\u001a\u00030\u00cb\u0002J\n\u0010\u00f8\u0002\u001a\u00030\u00cb\u0002H\u0002J\u0012\u0010\u00f9\u0002\u001a\u00030\u00cb\u00022\b\u0010\u00fa\u0002\u001a\u00030\u00fb\u0002J\b\u0010\u00fc\u0002\u001a\u00030\u00cb\u0002J\u0011\u0010\u00fd\u0002\u001a\u00030\u00cb\u00022\u0007\u0010\u00cf\u0002\u001a\u00020nJ\u0011\u0010\u00fe\u0002\u001a\u00030\u00cb\u00022\u0007\u0010\u00ff\u0002\u001a\u00020WJ\b\u0010\u0080\u0003\u001a\u00030\u00cb\u0002J\b\u0010\u0081\u0003\u001a\u00030\u00cb\u0002J\u001a\u0010\u0082\u0003\u001a\u00030\u00cb\u00022\u0007\u0010\u0083\u0003\u001a\u00020W2\u0007\u0010\u0084\u0003\u001a\u00020\u0019R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00130\u00130\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010(\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00190\u00190\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010<\u001a\b\u0012\u0004\u0012\u00020.0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R&\u0010?\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0A0@0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010C\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0A0@0D8F\u00a2\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010\u001dR(\u0010J\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00190\u00190\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010*\"\u0004\bL\u0010,R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010M\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001b\"\u0004\bO\u0010\u001dR\u001a\u0010P\u001a\u00020QX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010V\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010W0W0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010*\"\u0004\bY\u0010,R\u001a\u0010Z\u001a\u00020QX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010S\"\u0004\b\\\u0010UR\u001e\u0010]\u001a\u0004\u0018\u00010QX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010b\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR(\u0010c\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00130\u00130\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010*\"\u0004\be\u0010,R\u001d\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0@0D8F\u00a2\u0006\u0006\u001a\u0004\bg\u0010FR\u001a\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0@0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0@0D8F\u00a2\u0006\u0006\u001a\u0004\bj\u0010FR\u001d\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0@0D8F\u00a2\u0006\u0006\u001a\u0004\bl\u0010FR)\u0010m\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020Q0A0@0D8F\u00a2\u0006\u0006\u001a\u0004\bo\u0010FR\u001d\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0@0D8F\u00a2\u0006\u0006\u001a\u0004\bq\u0010FR\u001d\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0@0D8F\u00a2\u0006\u0006\u001a\u0004\bs\u0010FR\u001d\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0@0D8F\u00a2\u0006\u0006\u001a\u0004\bu\u0010FR\u001d\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0@0D8F\u00a2\u0006\u0006\u001a\u0004\bw\u0010FR(\u0010x\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010W0W0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010*\"\u0004\bz\u0010,R(\u0010{\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\r0\r0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010*\"\u0004\b}\u0010,R)\u0010~\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00190\u00190\u001fX\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010*\"\u0005\b\u0080\u0001\u0010,R;\u0010\u0081\u0001\u001a \u0012\u001c\u0012\u001a\u0012\u0005\u0012\u00030\u0083\u0001  *\f\u0012\u0005\u0012\u00030\u0083\u0001\u0018\u00010\u0082\u00010\u0082\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010*\"\u0005\b\u0085\u0001\u0010,R\u001f\u0010\u0086\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0@0D8F\u00a2\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010FR\u001b\u0010\u0088\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0@0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0089\u0001\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008d\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001d\u0010\u008e\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u000f\"\u0005\b\u008f\u0001\u0010\u0011R+\u0010\u0090\u0001\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\r0\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010*\"\u0005\b\u0091\u0001\u0010,R\u001d\u0010\u0092\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u000f\"\u0005\b\u0093\u0001\u0010\u0011R$\u0010\u0094\u0001\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008d\u0001\u001a\u0006\b\u0094\u0001\u0010\u008a\u0001\"\u0006\b\u0095\u0001\u0010\u008c\u0001R\u001d\u0010\u0096\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010\u000f\"\u0005\b\u0097\u0001\u0010\u0011R\u001d\u0010\u0098\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\u000f\"\u0005\b\u0099\u0001\u0010\u0011R\u001d\u0010\u009a\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u000f\"\u0005\b\u009b\u0001\u0010\u0011R+\u0010\u009c\u0001\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\r0\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010*\"\u0005\b\u009d\u0001\u0010,R+\u0010\u009e\u0001\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\r0\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010*\"\u0005\b\u009f\u0001\u0010,R\u001d\u0010\u00a0\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\u000f\"\u0005\b\u00a2\u0001\u0010\u0011R&\u0010\u00a3\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u00a4\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a5\u0001\u0010\u00a6\u0001\"\u0006\b\u00a7\u0001\u0010\u00a8\u0001R#\u0010\u00a9\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0001\u0010*\"\u0005\b\u00ab\u0001\u0010,R#\u0010\u00ac\u0001\u001a\b\u0012\u0004\u0012\u00020W0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010*\"\u0005\b\u00ae\u0001\u0010,R%\u0010\u00af\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b0\u0001\u0010*\"\u0005\b\u00b1\u0001\u0010,R+\u0010\u00b2\u0001\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\r0\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b3\u0001\u0010*\"\u0005\b\u00b4\u0001\u0010,R+\u0010\u00b5\u0001\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\r0\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b6\u0001\u0010*\"\u0005\b\u00b7\u0001\u0010,R\u001f\u0010\u00b8\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0@0\u001f\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b9\u0001\u0010*R\u001d\u0010\u00ba\u0001\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010Q0Q0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u00bb\u0001\u001a\u00030\u00bc\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00bd\u0001\u0010\u00be\u0001\"\u0006\b\u00bf\u0001\u0010\u00c0\u0001R\u001d\u0010\u00c1\u0001\u001a\u00020QX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c2\u0001\u0010S\"\u0005\b\u00c3\u0001\u0010UR\u001d\u0010\u00c4\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c5\u0001\u0010\u000f\"\u0005\b\u00c6\u0001\u0010\u0011R\u001b\u0010\u00c7\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0@0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u00c8\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020Q0A0@0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u00c9\u0001\u001a\u00020WX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ca\u0001\u0010\u00cb\u0001\"\u0006\b\u00cc\u0001\u0010\u00cd\u0001R#\u0010\u00ce\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cf\u0001\u0010*\"\u0005\b\u00d0\u0001\u0010,R\u001f\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d2\u0001\u0010\u001b\"\u0005\b\u00d3\u0001\u0010\u001dR#\u0010\u00d4\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d5\u0001\u0010*\"\u0005\b\u00d6\u0001\u0010,R\u001f\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d8\u0001\u0010\u001b\"\u0005\b\u00d9\u0001\u0010\u001dR\u001f\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00db\u0001\u0010\u001b\"\u0005\b\u00dc\u0001\u0010\u001dR\u001f\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00de\u0001\u0010\u001b\"\u0005\b\u00df\u0001\u0010\u001dR\u001d\u0010\u00e0\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e1\u0001\u0010\u001b\"\u0005\b\u00e2\u0001\u0010\u001dR\u001d\u0010\u00e3\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e4\u0001\u0010\u001b\"\u0005\b\u00e5\u0001\u0010\u001dR\u001d\u0010\u00e6\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e7\u0001\u0010\u001b\"\u0005\b\u00e8\u0001\u0010\u001dR\u001d\u0010\u00e9\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ea\u0001\u0010\u001b\"\u0005\b\u00eb\u0001\u0010\u001dR\u001d\u0010\u00ec\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ed\u0001\u0010\u001b\"\u0005\b\u00ee\u0001\u0010\u001dR\u001d\u0010\u00ef\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f0\u0001\u0010\u001b\"\u0005\b\u00f1\u0001\u0010\u001dR\u001d\u0010\u00f2\u0001\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f3\u0001\u0010\u000f\"\u0005\b\u00f4\u0001\u0010\u0011R\u001d\u0010\u00f5\u0001\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00130\u00130\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u00f6\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0@0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u00f7\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0@0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u00f8\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0@0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u00f9\u0001\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010Q0Q0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u00fa\u0001\u001a\t\u0012\u0004\u0012\u00020n0\u00a4\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\u00fb\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020n\u0018\u00010\u0082\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00fc\u0001\u0010*\"\u0005\b\u00fd\u0001\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u00fe\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020n\u0018\u00010\u0082\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ff\u0001\u0010*\"\u0005\b\u0080\u0002\u0010,R\u001d\u0010\u0081\u0002\u001a\u00020QX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0002\u0010S\"\u0005\b\u0083\u0002\u0010UR\u001d\u0010\u0084\u0002\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0002\u0010\u000f\"\u0005\b\u0086\u0002\u0010\u0011R\u001d\u0010\u0087\u0002\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0002\u0010\u001b\"\u0005\b\u0089\u0002\u0010\u001dR\u001d\u0010\u008a\u0002\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0002\u0010\u001b\"\u0005\b\u008c\u0002\u0010\u001dR\u001d\u0010\u008d\u0002\u001a\u00020QX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0002\u0010S\"\u0005\b\u008f\u0002\u0010UR%\u0010\u0090\u0002\u001a\n\u0012\u0005\u0012\u00030\u0091\u00020\u0082\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0002\u0010%\"\u0005\b\u0093\u0002\u0010\'R\u001d\u0010\u0094\u0002\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00130\u00130\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0095\u0002\u001a\t\u0012\u0004\u0012\u00020\u00190\u00a4\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0002\u0010\u00a6\u0001\"\u0006\b\u0097\u0002\u0010\u00a8\u0001R\u001d\u0010\u0098\u0002\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0002\u0010\u000f\"\u0005\b\u009a\u0002\u0010\u0011R$\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00a0\u0002\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002\"\u0006\b\u009e\u0002\u0010\u009f\u0002R#\u0010\u00a1\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a2\u0002\u0010*\"\u0005\b\u00a3\u0002\u0010,R\u0019\u0010\u00a4\u0002\u001a\b\u0012\u0004\u0012\u00020\r0D8F\u00a2\u0006\u0007\u001a\u0005\b\u00a5\u0002\u0010FR\u001d\u0010\u00a6\u0002\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\r0\r0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u00a7\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u00a8\u0002\u001a\b\u0012\u0004\u0012\u00020\r0D8F\u00a2\u0006\u0007\u001a\u0005\b\u00a9\u0002\u0010FR\u001d\u0010\u00aa\u0002\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ab\u0002\u0010\u001b\"\u0005\b\u00ac\u0002\u0010\u001dR\u001d\u0010\u00ad\u0002\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00130\u00130\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000RO\u0010\u00ae\u0002\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0019\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00190\u0082\u00010\u00af\u0002j\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00190\u0082\u0001`\u00b0\u00020\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b1\u0002\u0010*\"\u0005\b\u00b2\u0002\u0010,R9\u0010\u00b3\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0019  *\u000b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0082\u00010\u0082\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b4\u0002\u0010*\"\u0005\b\u00b5\u0002\u0010,R\u001d\u0010\u00b6\u0002\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00130\u00130\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u00b7\u0002\u001a\u00020QX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b8\u0002\u0010S\"\u0005\b\u00b9\u0002\u0010UR+\u0010\u00ba\u0002\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00190\u00190\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bb\u0002\u0010*\"\u0005\b\u00bc\u0002\u0010,R&\u0010\u00bd\u0002\u001a\t\u0012\u0004\u0012\u00020n0\u00a4\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00be\u0002\u0010\u00a6\u0001\"\u0006\b\u00bf\u0002\u0010\u00a8\u0001R\u001d\u0010\u00c0\u0002\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0002\u0010\u001b\"\u0005\b\u00c2\u0002\u0010\u001dR\u001b\u0010\u00c3\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0@0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u00c4\u0002\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\r0\r0\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c5\u0002\u0010*\"\u0005\b\u00c6\u0002\u0010,R+\u0010\u00c7\u0002\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00190\u00190\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c8\u0002\u0010*\"\u0005\b\u00c9\u0002\u0010,\u00a8\u0006\u0085\u0003"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "paymentOptionsUseCase", "Lcom/intellihealth/truemeds/domain/usecase/PaymentOptionsUseCase;", "helpFaqTncUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;", "application", "Landroid/app/Application;", "context", "Landroid/content/Context;", "(Lcom/intellihealth/truemeds/domain/usecase/PaymentOptionsUseCase;Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;Landroid/app/Application;Landroid/content/Context;)V", "addCOD", "", "getAddCOD", "()Z", "setAddCOD", "(Z)V", "addMoreForCod", "", "getAddMoreForCod", "()D", "setAddMoreForCod", "(D)V", "addressType", "", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "apiFinalCalcMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "apiMedicineList", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "getApiMedicineList", "()Ljava/util/List;", "setApiMedicineList", "(Ljava/util/List;)V", "appliedCouponCode", "getAppliedCouponCode", "()Landroidx/lifecycle/MutableLiveData;", "setAppliedCouponCode", "(Landroidx/lifecycle/MutableLiveData;)V", "billData", "Lcom/intellihealth/salt/models/BillDetailsModel;", "getBillData", "()Lcom/intellihealth/salt/models/BillDetailsModel;", "setBillData", "(Lcom/intellihealth/salt/models/BillDetailsModel;)V", "billDetails", "getBillDetails", "setBillDetails", "billDetailsResponse", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "getBillDetailsResponse", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "setBillDetailsResponse", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;)V", "cartBillDetails", "getCartBillDetails", "setCartBillDetails", "changeToCodEvent", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "Lkotlin/Pair;", "", "changeToCodEventLiveData", "Landroidx/lifecycle/LiveData;", "getChangeToCodEventLiveData", "()Landroidx/lifecycle/LiveData;", "cityName", "getCityName", "setCityName", "clickedOnPageMutableLiveData", "getClickedOnPageMutableLiveData", "setClickedOnPageMutableLiveData", "currentOrderStatus", "getCurrentOrderStatus", "setCurrentOrderStatus", "currentOrderStatusId", "", "getCurrentOrderStatusId", "()I", "setCurrentOrderStatusId", "(I)V", "currentServerFtcTime", "", "getCurrentServerFtcTime", "setCurrentServerFtcTime", "cxAcceptedSubsCount", "getCxAcceptedSubsCount", "setCxAcceptedSubsCount", "deliveryDays", "getDeliveryDays", "()Ljava/lang/Integer;", "setDeliveryDays", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "estimatedPayableValueMutableLiveData", "getEstimatedPayableValueMutableLiveData", "setEstimatedPayableValueMutableLiveData", "eventButtonViewMoreClicked", "getEventButtonViewMoreClicked", "eventButtonViewMoreClickedMutableLiveData", "eventLaunchOrderStatus", "getEventLaunchOrderStatus", "eventOpenBillDetailsBs", "getEventOpenBillDetailsBs", "eventOpenPaymentMethodChangePopup", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "getEventOpenPaymentMethodChangePopup", "eventPaymentChange", "getEventPaymentChange", "eventPaymentChangeCloseBS", "getEventPaymentChangeCloseBS", "eventPaymentFailed", "getEventPaymentFailed", "eventUpdateFtcCouponUi", "getEventUpdateFtcCouponUi", "expiryServerFtcTime", "getExpiryServerFtcTime", "setExpiryServerFtcTime", "faqLoaded", "getFaqLoaded", "setFaqLoaded", "ftcCounterTime", "getFtcCounterTime", "setFtcCounterTime", "ftcCouponListMutableLiveData", "", "Lcom/intellihealth/truemeds/data/model/orderflow/CouponCodeDataModel;", "getFtcCouponListMutableLiveData", "setFtcCouponListMutableLiveData", "goToPaymentActivityEvent", "getGoToPaymentActivityEvent", "goToPaymentActivityMutableLiveData", "isChronicAdded", "()Ljava/lang/Boolean;", "setChronicAdded", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isDisableBackPress", "setDisableBackPress", "isFtcCouponApplied", "setFtcCouponApplied", "isGenericAdded", "setGenericAdded", "isOtcAdded", "setOtcAdded", "isPaymentSpecificCoupon", "setPaymentSpecificCoupon", "isReorder", "setReorder", "isRxRequired", "setRxRequired", "isShowFtc", "setShowFtc", "isShowFtcTimer", "setShowFtcTimer", "isbackbuttonEnabled", "getIsbackbuttonEnabled", "setIsbackbuttonEnabled", "itemNames", "Ljava/util/ArrayList;", "getItemNames", "()Ljava/util/ArrayList;", "setItemNames", "(Ljava/util/ArrayList;)V", "lastPaymentMethodSelectedIconUrlMutableLiveData", "getLastPaymentMethodSelectedIconUrlMutableLiveData", "setLastPaymentMethodSelectedIconUrlMutableLiveData", "lastPaymentMethodSelectedIdMutableLiveData", "getLastPaymentMethodSelectedIdMutableLiveData", "setLastPaymentMethodSelectedIdMutableLiveData", "lastPaymentMethodSelectedMutableLiveData", "getLastPaymentMethodSelectedMutableLiveData", "setLastPaymentMethodSelectedMutableLiveData", "launchOrderIsBeingPlaced", "getLaunchOrderIsBeingPlaced", "setLaunchOrderIsBeingPlaced", "launchOrderIsBeingPlacedCaseFailed", "getLaunchOrderIsBeingPlacedCaseFailed", "setLaunchOrderIsBeingPlacedCaseFailed", "launchOrderStatus", "getLaunchOrderStatus", "listDataHeaderSize", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "noOfItems", "getNoOfItems", "setNoOfItems", "onlyPrescription", "getOnlyPrescription", "setOnlyPrescription", "openBillDetailsBsMutableLiveData", "openPaymentMethodChangePopupMutableLiveData", "orderId", "getOrderId", "()J", "setOrderId", "(J)V", "orderIsBeingPlacedView", "getOrderIsBeingPlacedView", "setOrderIsBeingPlacedView", "orderPageSection", "getOrderPageSection", "setOrderPageSection", "orderPlacedView", "getOrderPlacedView", "setOrderPlacedView", "orderPreviousStage", "getOrderPreviousStage", "setOrderPreviousStage", "orderSubsId", "getOrderSubsId", "setOrderSubsId", "orderTypeId", "getOrderTypeId", "setOrderTypeId", "pageSection", "getPageSection", "setPageSection", "patientAge", "getPatientAge", "setPatientAge", "patientGender", "getPatientGender", "setPatientGender", "patientID", "getPatientID", "setPatientID", "patientName", "getPatientName", "setPatientName", "patientType", "getPatientType", "setPatientType", "payableAmountButtonText", "getPayableAmountButtonText", "setPayableAmountButtonText", "payableAmountLiveData", "paymentChange", "paymentChangeCloseBS", "paymentFailed", "paymentModeMutableLiveData", "paymentOptionsList", "paymentOptionsMutableLiveData", "getPaymentOptionsMutableLiveData", "setPaymentOptionsMutableLiveData", "paymentOptionsVisibleMutableLiveData", "getPaymentOptionsVisibleMutableLiveData", "setPaymentOptionsVisibleMutableLiveData", "paymentRestrictedType", "getPaymentRestrictedType", "setPaymentRestrictedType", "paymentUnsuccessful", "getPaymentUnsuccessful", "setPaymentUnsuccessful", "pinCode", "getPinCode", "setPinCode", "placeOrderSubsIdValue", "getPlaceOrderSubsIdValue", "setPlaceOrderSubsIdValue", "prescUploadedCount", "getPrescUploadedCount", "setPrescUploadedCount", "prescriptions", "Lcom/intellihealth/truemeds/data/model/orderflow/OrderRxInfo;", "getPrescriptions", "setPrescriptions", "processingFeeMutableLiveData", "productIds", "getProductIds", "setProductIds", "restrictCod", "getRestrictCod", "setRestrictCod", "sellingPrice", "getSellingPrice", "()Ljava/lang/Double;", "setSellingPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "setMainDataView", "getSetMainDataView", "setSetMainDataView", "showLoader", "getShowLoader", "showLoaderMutableLiveData", "showShimmerPaymentMethods", "showShimmerPaymentMethodsLiveData", "getShowShimmerPaymentMethodsLiveData", "stateName", "getStateName", "setStateName", "tmCreditMutableLiveData", "tmListDataChildMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getTmListDataChildMap", "setTmListDataChildMap", "tmListDataHeader", "getTmListDataHeader", "setTmListDataHeader", "tmRewardMutableLiveData", "totalOutOfStockCount", "getTotalOutOfStockCount", "setTotalOutOfStockCount", "totalPayableAmountMutableLiveData", "getTotalPayableAmountMutableLiveData", "setTotalPayableAmountMutableLiveData", "totalPaymentOptionsList", "getTotalPaymentOptionsList", "setTotalPaymentOptionsList", "trackPurchaseEvents", "getTrackPurchaseEvents", "setTrackPurchaseEvents", "updateFtcCouponUi", "viewExpandedMutableLiveData", "getViewExpandedMutableLiveData", "setViewExpandedMutableLiveData", "viewOtherPaymentOptions", "getViewOtherPaymentOptions", "setViewOtherPaymentOptions", "calculateBillDetailsOnBillUpdate", "", "calculateFinalBillDetailsAfterCouponRemove", "clickedOnPage", "couponDiscount", "item", "position", "estimatedPayableValue", "closePaymentMethodChangeBottomSheetEvent", "confirmOrder", "convertToBillDetails", "billModel", "strikePackagingCharge", "convertToCalculateBillDetailModel", "calculateBillDetail", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "fetchFtcCoupons", "fetchPaymentMethods", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFAQCategory", "getCustomerOrderDetails", "customerId", "initialLoad", "className", "callFetchMeds", "getFaqByCategory", "categoryId", "getMedicineOrderDetailsList", "getOrderDetails", "getPaymentMode", "onBtnViewMoreClicked", "onPaymentMethodChanged", "onPaymentMethodSelected", "openBillDetailsBottomSheetEvent", "paymentAgain", "paymentMethodChangeBottomSheetEvent", "placeOrder", "placeOrderMP", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processBillDetails", "removeCoupon", "removeDuplicates", "listWithDuplicates", "sendEventChangeToCod", "sendPaymentPageVisitedEventToMixpanel", "sendPspViewedEvent", "sendPspViewedMixPanelEvent", "sendViewBillClickedEvent", "mxViewBillClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxViewBillClicked;", "setDataBasedOnPspVariant", "setDataForPlaceOrder", "setOfferIdForOrderId", "offerId", "setPSPViewedByCustomer", "setPaymentSelectionMethod", "setPaymentSelectionMethodForPlaceOrder", "placeOrderViaPaymentMethodId", "paymentMethod", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class PaymentOptionsViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase paymentOptionsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase helpFaqTncUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    /**
     * This is the list into which we fetch all the payment options coming from API response
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> paymentOptionsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> totalPaymentOptionsList;
    
    /**
     * This is used to store the last selected payment method
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> lastPaymentMethodSelectedMutableLiveData;
    
    /**
     * This is used to store the last selected payment method id
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> lastPaymentMethodSelectedIdMutableLiveData;
    
    /**
     * This is used to store the last selected payment method url
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> lastPaymentMethodSelectedIconUrlMutableLiveData;
    
    /**
     * This is used to store the payment mode whether online or cash on delivery
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> paymentModeMutableLiveData = null;
    
    /**
     * This is used to show only all payment methods, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> paymentOptionsMutableLiveData;
    
    /**
     * This is used to show only visible payment methods, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> paymentOptionsVisibleMutableLiveData;
    
    /**
     * This is used to store information whether the view is full expanded or half expanded
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewExpandedMutableLiveData;
    
    /**
     * This is used to store whether we want to show loader or not, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showLoaderMutableLiveData = null;
    
    /**
     * This is used to store the header data of faq
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> tmListDataHeader;
    
    /**
     * This is used to store the information data of mapped to the header faq
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>> tmListDataChildMap;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> listDataHeaderSize;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> faqLoaded;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> processingFeeMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> apiFinalCalcMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> tmRewardMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> tmCreditMutableLiveData;
    
    /**
     * used to store ftc coupon list
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel>> ftcCouponListMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> updateFtcCouponUi;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFtcCouponApplied;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowFtc;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowFtcTimer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> currentServerFtcTime;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> expiryServerFtcTime;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> ftcCounterTime;
    
    /**
     * This value is used to display amount in bill details bottomsheet
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> payableAmountLiveData;
    
    /**
     * This value is used to display amount above View Bill display text
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> totalPayableAmountMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> clickedOnPageMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> goToPaymentActivityMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> eventButtonViewMoreClickedMutableLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> paymentFailed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> paymentChange = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<java.lang.Object, java.lang.Object>>> changeToCodEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Integer>> paymentChangeCloseBS = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> launchOrderStatus = null;
    
    /**
     * Open View Bill Details Bottomsheet
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.BillDetailsModel>> openBillDetailsBsMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData, java.lang.Integer>>> openPaymentMethodChangePopupMutableLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmerPaymentMethods;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> appliedCouponCode;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> viewOtherPaymentOptions;
    private boolean isPaymentSpecificCoupon = false;
    private boolean isDisableBackPress = false;
    private boolean payableAmountButtonText = false;
    private long orderId = 0L;
    private boolean paymentUnsuccessful = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double sellingPrice;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.models.BillDetailsModel billDetails;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel> cartBillDetails;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> estimatedPayableValueMutableLiveData;
    
    /**
     * Needs for Mix Panel Events
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientID = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientAge = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientGender = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cityName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String stateName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pinCode = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addressType = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isOtcAdded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isChronicAdded;
    private boolean isGenericAdded = false;
    private int noOfItems = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentOrderStatus = "";
    private int currentOrderStatusId = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pageSection = "";
    private int totalOutOfStockCount = 0;
    private int prescUploadedCount = 0;
    private boolean isRxRequired = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> productIds;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> itemNames;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String trackPurchaseEvents = "";
    private double addMoreForCod = 0.0;
    private boolean addCOD = false;
    private int paymentRestrictedType = 0;
    private boolean restrictCod = false;
    private boolean onlyPrescription = false;
    private boolean isReorder = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> orderIsBeingPlacedView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> orderPlacedView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> setMainDataView;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> apiMedicineList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> prescriptions;
    private boolean isbackbuttonEnabled = true;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderTypeId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderSubsId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderPageSection;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderPreviousStage;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String placeOrderSubsIdValue = "";
    private int cxAcceptedSubsCount = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer deliveryDays = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchOrderIsBeingPlaced;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchOrderIsBeingPlacedCaseFailed;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.models.BillDetailsModel billData;
    
    @javax.inject.Inject()
    public PaymentOptionsViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase paymentOptionsUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase helpFaqTncUseCase, @org.jetbrains.annotations.NotNull()
    android.app.Application application, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> getTotalPaymentOptionsList() {
        return null;
    }
    
    public final void setTotalPaymentOptionsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> p0) {
    }
    
    /**
     * This is used to store the last selected payment method
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLastPaymentMethodSelectedMutableLiveData() {
        return null;
    }
    
    /**
     * This is used to store the last selected payment method
     */
    public final void setLastPaymentMethodSelectedMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    /**
     * This is used to store the last selected payment method id
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getLastPaymentMethodSelectedIdMutableLiveData() {
        return null;
    }
    
    /**
     * This is used to store the last selected payment method id
     */
    public final void setLastPaymentMethodSelectedIdMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    /**
     * This is used to store the last selected payment method url
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLastPaymentMethodSelectedIconUrlMutableLiveData() {
        return null;
    }
    
    /**
     * This is used to store the last selected payment method url
     */
    public final void setLastPaymentMethodSelectedIconUrlMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    /**
     * This is used to show only all payment methods, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> getPaymentOptionsMutableLiveData() {
        return null;
    }
    
    /**
     * This is used to show only all payment methods, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     */
    public final void setPaymentOptionsMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> p0) {
    }
    
    /**
     * This is used to show only visible payment methods, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> getPaymentOptionsVisibleMutableLiveData() {
        return null;
    }
    
    /**
     * This is used to show only visible payment methods, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     */
    public final void setPaymentOptionsVisibleMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> p0) {
    }
    
    /**
     * This is used to store information whether the view is full expanded or half expanded
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getViewExpandedMutableLiveData() {
        return null;
    }
    
    /**
     * This is used to store information whether the view is full expanded or half expanded
     */
    public final void setViewExpandedMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowLoader() {
        return null;
    }
    
    /**
     * This is used to store the header data of faq
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getTmListDataHeader() {
        return null;
    }
    
    /**
     * This is used to store the header data of faq
     */
    public final void setTmListDataHeader(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
    }
    
    /**
     * This is used to store the information data of mapped to the header faq
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>> getTmListDataChildMap() {
        return null;
    }
    
    /**
     * This is used to store the information data of mapped to the header faq
     */
    public final void setTmListDataChildMap(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFaqLoaded() {
        return null;
    }
    
    public final void setFaqLoaded(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    /**
     * used to store ftc coupon list
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel>> getFtcCouponListMutableLiveData() {
        return null;
    }
    
    /**
     * used to store ftc coupon list
     */
    public final void setFtcCouponListMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventUpdateFtcCouponUi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFtcCouponApplied() {
        return null;
    }
    
    public final void setFtcCouponApplied(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowFtc() {
        return null;
    }
    
    public final void setShowFtc(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowFtcTimer() {
        return null;
    }
    
    public final void setShowFtcTimer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getCurrentServerFtcTime() {
        return null;
    }
    
    public final void setCurrentServerFtcTime(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getExpiryServerFtcTime() {
        return null;
    }
    
    public final void setExpiryServerFtcTime(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFtcCounterTime() {
        return null;
    }
    
    public final void setFtcCounterTime(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    /**
     * This value is used to display amount above View Bill display text
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTotalPayableAmountMutableLiveData() {
        return null;
    }
    
    /**
     * This value is used to display amount above View Bill display text
     */
    public final void setTotalPayableAmountMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getClickedOnPageMutableLiveData() {
        return null;
    }
    
    public final void setClickedOnPageMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getGoToPaymentActivityEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventButtonViewMoreClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventPaymentFailed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventPaymentChange() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<java.lang.Object, java.lang.Object>>> getChangeToCodEventLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Integer>> getEventPaymentChangeCloseBS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getLaunchOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventLaunchOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.BillDetailsModel>> getEventOpenBillDetailsBs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData, java.lang.Integer>>> getEventOpenPaymentMethodChangePopup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerPaymentMethodsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAppliedCouponCode() {
        return null;
    }
    
    public final void setAppliedCouponCode(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getViewOtherPaymentOptions() {
        return null;
    }
    
    public final void setViewOtherPaymentOptions(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final boolean isPaymentSpecificCoupon() {
        return false;
    }
    
    public final void setPaymentSpecificCoupon(boolean p0) {
    }
    
    public final boolean isDisableBackPress() {
        return false;
    }
    
    public final void setDisableBackPress(boolean p0) {
    }
    
    public final boolean getPayableAmountButtonText() {
        return false;
    }
    
    public final void setPayableAmountButtonText(boolean p0) {
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    public final void setOrderId(long p0) {
    }
    
    public final boolean getPaymentUnsuccessful() {
        return false;
    }
    
    public final void setPaymentUnsuccessful(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSellingPrice() {
        return null;
    }
    
    public final void setSellingPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.BillDetailsModel getBillDetails() {
        return null;
    }
    
    public final void setBillDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.BillDetailsModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData getBillDetailsResponse() {
        return null;
    }
    
    public final void setBillDetailsResponse(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel> getCartBillDetails() {
        return null;
    }
    
    public final void setCartBillDetails(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getEstimatedPayableValueMutableLiveData() {
        return null;
    }
    
    public final void setEstimatedPayableValueMutableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Double> p0) {
    }
    
    /**
     * Needs for Mix Panel Events
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientName() {
        return null;
    }
    
    /**
     * Needs for Mix Panel Events
     */
    public final void setPatientName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientID() {
        return null;
    }
    
    public final void setPatientID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientType() {
        return null;
    }
    
    public final void setPatientType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientAge() {
        return null;
    }
    
    public final void setPatientAge(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientGender() {
        return null;
    }
    
    public final void setPatientGender(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityName() {
        return null;
    }
    
    public final void setCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStateName() {
        return null;
    }
    
    public final void setStateName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPinCode() {
        return null;
    }
    
    public final void setPinCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isOtcAdded() {
        return null;
    }
    
    public final void setOtcAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isChronicAdded() {
        return null;
    }
    
    public final void setChronicAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final boolean isGenericAdded() {
        return false;
    }
    
    public final void setGenericAdded(boolean p0) {
    }
    
    public final int getNoOfItems() {
        return 0;
    }
    
    public final void setNoOfItems(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentOrderStatus() {
        return null;
    }
    
    public final void setCurrentOrderStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCurrentOrderStatusId() {
        return 0;
    }
    
    public final void setCurrentOrderStatusId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTotalOutOfStockCount() {
        return 0;
    }
    
    public final void setTotalOutOfStockCount(int p0) {
    }
    
    public final int getPrescUploadedCount() {
        return 0;
    }
    
    public final void setPrescUploadedCount(int p0) {
    }
    
    public final boolean isRxRequired() {
        return false;
    }
    
    public final void setRxRequired(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getProductIds() {
        return null;
    }
    
    public final void setProductIds(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getItemNames() {
        return null;
    }
    
    public final void setItemNames(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackPurchaseEvents() {
        return null;
    }
    
    public final void setTrackPurchaseEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getAddMoreForCod() {
        return 0.0;
    }
    
    public final void setAddMoreForCod(double p0) {
    }
    
    public final boolean getAddCOD() {
        return false;
    }
    
    public final void setAddCOD(boolean p0) {
    }
    
    public final int getPaymentRestrictedType() {
        return 0;
    }
    
    public final void setPaymentRestrictedType(int p0) {
    }
    
    public final boolean getRestrictCod() {
        return false;
    }
    
    public final void setRestrictCod(boolean p0) {
    }
    
    public final boolean getOnlyPrescription() {
        return false;
    }
    
    public final void setOnlyPrescription(boolean p0) {
    }
    
    public final boolean isReorder() {
        return false;
    }
    
    public final void setReorder(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOrderIsBeingPlacedView() {
        return null;
    }
    
    public final void setOrderIsBeingPlacedView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOrderPlacedView() {
        return null;
    }
    
    public final void setOrderPlacedView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetMainDataView() {
        return null;
    }
    
    public final void setSetMainDataView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> getApiMedicineList() {
        return null;
    }
    
    public final void setApiMedicineList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> getPrescriptions() {
        return null;
    }
    
    public final void setPrescriptions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> p0) {
    }
    
    public final boolean getIsbackbuttonEnabled() {
        return false;
    }
    
    public final void setIsbackbuttonEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderTypeId() {
        return null;
    }
    
    public final void setOrderTypeId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderSubsId() {
        return null;
    }
    
    public final void setOrderSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderPageSection() {
        return null;
    }
    
    public final void setOrderPageSection(@org.jetbrains.annotations.Nullable()
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
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaceOrderSubsIdValue() {
        return null;
    }
    
    public final void setPlaceOrderSubsIdValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCxAcceptedSubsCount() {
        return 0;
    }
    
    public final void setCxAcceptedSubsCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDeliveryDays() {
        return null;
    }
    
    public final void setDeliveryDays(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLaunchOrderIsBeingPlaced() {
        return null;
    }
    
    public final void setLaunchOrderIsBeingPlaced(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLaunchOrderIsBeingPlacedCaseFailed() {
        return null;
    }
    
    public final void setLaunchOrderIsBeingPlacedCaseFailed(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.BillDetailsModel getBillData() {
        return null;
    }
    
    public final void setBillData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.models.BillDetailsModel p0) {
    }
    
    /**
     * 1) API call FetchIconMaster is processed here. Here we fetch different payment methods like UPI, Wallets, Netbanking, Cards etc
     * with their displaying icons.
     * addCOD is a parameter we get from Intent data, where if the payment gets failed by any of the online payment methods
     * addCOD parameter is returned true
     * addCOD is a  boolean value passed to this method to show COD(Cash on Delivery), if isAddCod - true show COD else dont show
     * 2) if payment specific coupon applied is also checked in this function if true then only show View More Button, if UPI coupon applied then only show one item
     * i.e UPI as selected and rest will be inside Show More Options if other than UPI payment specific coupon applied then show that selected payment method
     * in 2nd option with UPI at top and others will be inside View more options
     * 3) API call getAllFAQCategory()
     * 4) API call fetchFtcCoupons() - Whether the user is FTC or NFTC is checked from SharedPrefManager.getInstance().isFtc, if FTC then only we call this API
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchPaymentMethods(boolean addCOD, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * 1) Payment options screen displays a section at the bottom of the screen for FAQ's.
     * 2) This API call is used to fetch all FAQ category is processed here based on id and name
     * if name = 'Payment Screen' we get the Id of that name and call another API getFaqByCategory
     * where the API expects categoryId
     */
    private final void getAllFAQCategory() {
    }
    
    /**
     * This function needs to be called inside getAllFAQCategory() on successfull response where we will pass the categoryId from the
     * getAllFAQCategory response and based on that we will call another API getFaqByCategory where we will get the question and answer in response
     * to be displayed on the screen
     */
    private final void getFaqByCategory(int categoryId) {
    }
    
    /**
     * 1) If FTC then we execute this function which will call the getFtcCouponExpiryDate API to return the list of coupons( for example FIRST25, FIRST23) which are available for FTC users only
     * 2) If the size of list of couponList == 1, we assign the promoCode value to Constants.FTC_COUPON_CODE
     * 3) If the size of list of couponList == 2, we assign the 1st promoCode value to Constants.FTC_COUPON_CODE and
     * 2nd promoCode value to Constants.FTC_COUPON_CODE_1
     */
    private final void fetchFtcCoupons() {
    }
    
    /**
     * 1) This method is called from PaymentMethodChangeBottomSheet on click of change mode button
     * 2) If any payment specific coupon method is already selected in PSP screen, and if we want to change the payment method
     * we remove the coupon by calling API savePaymentAndCouponForOrder inside this function by passing the following parameters
     * orderid, paymentid, offerid
     * offerid is always passed 0
     * paymentid is whether COD or Online
     * 3) Code Snippet - if SharedPrefManager.getInstance().couponPaymentMode == "online") - 16
     * else if (SharedPrefManager.getInstance().couponPaymentMode == "cod" - 17
     * else if SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1) 17
     * else SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
     * orderid - for which orderid we are removing the coupon
     * 4) if response of this API call is success we call getOrderDetails() API to get the bill details inside finalCalcAmt json object
     */
    public final void setOfferIdForOrderId(long offerId) {
    }
    
    /**
     * This function is executed on click of Place Order button
     *
     * Note : Current working flow is where we create orderid by calling saveMedsAndCreateOrder but this will be decided as per discussion whether to directly call
     *   confirmOrder() API inside placeOrder() which is used to confirm the order
     *
     *
     * 1) Pass PaymentOptionsResponse.PaymentOptionsResponseItem as a parameter
     * 2) Check payableAmountButtonText true or not
     * 3) if payableAmountButtonText true then check the paymentCategory inside PaymentOptionsResponseItem
     * inside check if paymentCategory = COD if yes then call changeToCodApiCall() else setPaymentSelectionMethod() API call and go to Payment Activity
     * 4) if payableAmountButtonText false check
     * if paymentCategory = COD
     * inside check  if(clickedPage = "OrderSummary" || clickedPage="ReOrder")), if yes then call placeOrder() else changeToCodApiCall()
     * 5) if paymentCategory is other than COD then call placeOrder()
     */
    public final void setDataForPlaceOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData item) {
    }
    
    public final void setPaymentSelectionMethod() {
    }
    
    public final void setPSPViewedByCustomer() {
    }
    
    public final void setPaymentSelectionMethodForPlaceOrder(long placeOrderViaPaymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod) {
    }
    
    /**
     * call confirmOrder()
     */
    private final void placeOrder() {
    }
    
    /**
     * OrderFlowUseCase call confirmOrder
     */
    private final void confirmOrder() {
    }
    
    /**
     * 1) OrderFlowUseCase call getOrderDetails
     * 2) calculateBillDetailsOnBillUpdate() inside finalCalcAmt from API Response
     */
    private final void getOrderDetails() {
    }
    
    /**
     * 1) This method accepts 3 parameters (item: PaymentOptionsResponse.PaymentOptionsResponseItem,position: Int,clickedOnPage:String)
     * 2) This function is for Payment selection change on PSP screen, the method is used when user comes from OrderSummary or ReOrder screen.
     * 3) If the coupon is applied while placing order and if the user selected payment specific coupon method
     * we put the selected method in session also and if the session payment method does not equals to the payment method selected
     * on the psp screen
     * then change of payment method selection bottomsheet is shown, where user will be asked to change the payment selection method,
     * once confirm the existing coupon will be removed and payment selection on psp screen will be changed
     * 4) if clickedOnPage = ReOrder/OrderSummary - We set SharedPrefManager.getInstance().selectedPaymentMethodIconUrl and
     * SharedPrefManager.getInstance().selectedPaymentMethod
     * 5) And also based on the payment method selection we determine whether the payment option is COD or Online
     * 6) There is one more value which we check inside this function - isPaymentSpecificCoupon which is a boolean value
     * 7) The importance of isPaymentSpecificCoupon is to show ViewMore button or not, the value is passed through intent and
     * the value is checked true only when we come from HomeScreen/OrderStatus to PSP Screen.
     */
    public final void onPaymentMethodChanged(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData item, int position) {
    }
    
    /**
     * This method accepts 3 parameters (item: PaymentOptionsResponse.PaymentOptionsResponseItem,position: Int,clickedOnPage:String)
     * We call this function inside onPaymentMethodChanged() to show the selected payment method.
     */
    public final void onPaymentMethodSelected(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData item, int position, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage) {
    }
    
    /**
     * Case 1: If any payment specific coupon has been applied while placing the order (eg. UPI)
     * The PSP screen will have UPI selected and the rest payment methods will be inside the accordion with the button View More visible
     * If you click on View more, the other payment methods will be visible.
     * Case 2: If any payment specific coupon other than UPI has been applied while placing the order then by default UPI will always
     * be present in the first position of PSP screen and the selected payment method with which you placed order
     * will be at position 2nd, while the rest payment methods will be inside the accordion with button View More visible
     */
    public final void onBtnViewMoreClicked() {
    }
    
    /**
     * This is an on click event fired from Payment Method Change Bottomsheet
     * This function is called when the user clicks on change mode button
     */
    public final void paymentMethodChangeBottomSheetEvent() {
    }
    
    /**
     * This is an on click event fired from Payment Method Change Bottomsheet
     * This function is called when the user clicks on don't remove button
     */
    public final void closePaymentMethodChangeBottomSheetEvent() {
    }
    
    /**
     * Process the bill details which we got from intent here, this processed data will be used to show in the bill details bottomsheet
     * 1) Create a payableAmountLiveData double variable and assign the value from billDetails.totalPayableAmount
     * 2) Create a totalPayableAmountLiveData string variable and assign the value from billDetails.totalPayableAmount which is used in xml to display amount with rupee symbol
     * totalPayableAmountLiveData.value = String.format("₹%s", numberFormat.format(billDetails.totalPayableAmount))
     * 3) Create a cartBillDetails mutablelivedata object and pass the billDetails as a parameter
     * cartBillDetails = MutableLiveData(billDetails)
     */
    public final void processBillDetails() {
    }
    
    /**
     * 1) check for PSP variant B or C
     * 2) check for if user is FTC and NFTC
     * 3) check for coupon applied or not for both FTC and NFTC
     * 4) If FTC and if coupon applied we will have a boolean variable showFtcCouponTimer and assign it to true
     * 5) If showFtcCouponTimer == true then we will show timer for the based on variants
     * NOTE : For NFTC there will be no timers
     */
    public final void setDataBasedOnPspVariant() {
    }
    
    /**
     * 1) This function is called inside getOrderDetails API onSuccess callback and inside finalCalcAmt json object
     * where we override the processingFee, tmcash, tmreward values
     * 2) override the values of billdetails object
     * 3) assign the updated values of billdetails to cartBillDetails which will automatically show the updated values in Bill Details Bottomsheet
     */
    private final void calculateBillDetailsOnBillUpdate() {
    }
    
    /**
     * When user tries to change the payment method selection with already coupon applied
     * PaymentChangeSelectionBottomSheet is launched with 2 options, to remove coupon / dont remove
     * if user clicks on remove this method is called
     */
    public final void calculateFinalBillDetailsAfterCouponRemove(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, double couponDiscount, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData item, int position, double estimatedPayableValue) {
    }
    
    /**
     * 1) This event is fired when we click on View Bill or on the Total Bill Amount text
     * 2) The event will be observed in the PaymentOptionActivity which will call the showBillDetailsBottomSheet()
     */
    public final void openBillDetailsBottomSheetEvent() {
    }
    
    public final void paymentAgain() {
    }
    
    /**
     * TODO
     * This event is fired whenever we visit the PSP screen
     */
    private final void sendPspViewedMixPanelEvent() {
    }
    
    private final void getMedicineOrderDetailsList(long orderId) {
    }
    
    public final void removeCoupon() {
    }
    
    private final long getPaymentMode() {
        return 0L;
    }
    
    public final void sendPspViewedEvent() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object placeOrderMP(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void sendViewBillClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxViewBillClicked mxViewBillClicked) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPaymentPageVisitedEventToMixpanel(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection) {
        return null;
    }
    
    /**
     * 61 - Medicine has subs and cx opted for subs
     * 62 - Medicine has subs and cx opted for org
     * 211 -
     */
    public final void sendEventChangeToCod() {
    }
    
    public final void getCustomerOrderDetails(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, boolean initialLoad, @org.jetbrains.annotations.NotNull()
    java.lang.String className, boolean callFetchMeds) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> removeDuplicates(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> listWithDuplicates) {
        return null;
    }
    
    private final com.intellihealth.salt.models.BillDetailsModel convertToBillDetails(com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billModel, double strikePackagingCharge) {
        return null;
    }
    
    private final void convertToCalculateBillDetailModel(com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse calculateBillDetail) {
    }
}