package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u00d4\u0001\u001a\u00030\u00d5\u00012\u0007\u0010\u00d6\u0001\u001a\u00020\fJ\u001b\u0010\u00d7\u0001\u001a\u00030\u00d5\u00012\b\u0010\u00d8\u0001\u001a\u00030\u00d9\u0001H\u0086@\u00a2\u0006\u0003\u0010\u00da\u0001J\b\u0010\u00db\u0001\u001a\u00030\u00d5\u0001J\b\u0010\u00dc\u0001\u001a\u00030\u00d5\u0001J\u0019\u0010\u00dd\u0001\u001a\u00020)2\u0007\u0010\u00de\u0001\u001a\u00020\"H\u0086@\u00a2\u0006\u0003\u0010\u00df\u0001J\b\u0010\u00e0\u0001\u001a\u00030\u00d5\u0001J\b\u0010\u00e1\u0001\u001a\u00030\u00d5\u0001J\b\u0010\u00e2\u0001\u001a\u00030\u00d5\u0001J\b\u0010\u008c\u0001\u001a\u00030\u00d5\u0001J\b\u0010\u00e3\u0001\u001a\u00030\u00d5\u0001J\b\u0010\u00e4\u0001\u001a\u00030\u00d5\u0001J\u001a\u0010\u00e5\u0001\u001a\u00030\u00d5\u00012\u0007\u0010\u00e6\u0001\u001a\u00020)2\u0007\u0010\u00e7\u0001\u001a\u00020\"J\b\u0010\u00e8\u0001\u001a\u00030\u00d5\u0001J\u0011\u0010\u00e9\u0001\u001a\u00030\u00d5\u00012\u0007\u0010\u00ea\u0001\u001a\u00020)J\u0011\u0010\u00eb\u0001\u001a\u00030\u00d5\u00012\u0007\u0010\u00ec\u0001\u001a\u000207J\'\u0010\u00ed\u0001\u001a\u00030\u00d5\u00012\b\u0010\u00ee\u0001\u001a\u00030\u0080\u00012\b\u0010\u00ef\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u00f0\u0001\u001a\u00020\"H\u0002J\u0011\u0010\u00f1\u0001\u001a\u00030\u00d5\u00012\u0007\u0010\u00f2\u0001\u001a\u00020\"J\u0012\u0010\u00f3\u0001\u001a\u00030\u00d5\u00012\b\u0010\u00f4\u0001\u001a\u00030\u00f5\u0001J\u0011\u0010\u009a\u0001\u001a\u00030\u00d5\u00012\u0007\u0010\u00e7\u0001\u001a\u00020\"J\u0011\u0010\u00b0\u0001\u001a\u00030\u00d5\u00012\u0007\u0010\u00e7\u0001\u001a\u00020\"J$\u0010\u00f6\u0001\u001a\u00030\u00d5\u00012\b\u0010\u00f7\u0001\u001a\u00030\u00d9\u00012\n\u0010\u00f0\u0001\u001a\u0005\u0018\u00010\u0080\u0001\u00a2\u0006\u0003\u0010\u00f8\u0001J\u0014\u0010\u00f9\u0001\u001a\u00030\u00d5\u00012\b\u0010\u00d8\u0001\u001a\u00030\u00d9\u0001H\u0002J\u001b\u0010\u00fa\u0001\u001a\u00030\u00d5\u00012\b\u0010\u00d8\u0001\u001a\u00030\u00d9\u0001H\u0082@\u00a2\u0006\u0003\u0010\u00da\u0001J\n\u0010\u00fb\u0001\u001a\u00030\u00d5\u0001H\u0002J\n\u0010\u00fc\u0001\u001a\u00030\u00d5\u0001H\u0002J\n\u0010\u00fd\u0001\u001a\u00030\u00d5\u0001H\u0002R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000e\"\u0004\b\'\u0010\u0010R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R\u001a\u00101\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u000207X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000eR(\u0010:\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010\f0\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010R(\u0010>\u001a\u0010\u0012\f\u0012\n ;*\u0004\u0018\u00010\f0\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000e\"\u0004\b@\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010A\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u000b8F\u00a2\u0006\u0006\u001a\u0004\bG\u0010\u000eR\u001d\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u001a0I8F\u00a2\u0006\u0006\u001a\u0004\bK\u0010LR\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u001a0I8F\u00a2\u0006\u0006\u001a\u0004\bN\u0010LR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0I8F\u00a2\u0006\u0006\u001a\u0004\bP\u0010LR \u0010Q\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u000e\"\u0004\bS\u0010\u0010R \u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\u0010R \u0010X\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000e\"\u0004\bZ\u0010\u0010R \u0010[\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u000e\"\u0004\b]\u0010\u0010R \u0010^\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000e\"\u0004\b`\u0010\u0010R\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001b0I8F\u00a2\u0006\u0006\u001a\u0004\bb\u0010LR \u0010c\u001a\b\u0012\u0004\u0012\u00020d0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u000e\"\u0004\bf\u0010\u0010R\u001d\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010\u000eR\u001a\u0010h\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0013\"\u0004\bi\u0010\u0015R \u0010j\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u000e\"\u0004\bk\u0010\u0010R\u001a\u0010l\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010+\"\u0004\bn\u0010-R \u0010o\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u000e\"\u0004\bq\u0010\u0010R \u0010r\u001a\b\u0012\u0004\u0012\u00020U0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u000e\"\u0004\bt\u0010\u0010R \u0010u\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u000e\"\u0004\bw\u0010\u0010R\u001a\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010y\u001a\u00020zX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001f\u0010\u007f\u001a\u00030\u0080\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R#\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u000e\"\u0005\b\u0087\u0001\u0010\u0010R#\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020U0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u000e\"\u0005\b\u008a\u0001\u0010\u0010R\u001f\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0I8F\u00a2\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010LR#\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u000e\"\u0005\b\u008f\u0001\u0010\u0010R \u0010\u0090\u0001\u001a\u00030\u0080\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0082\u0001\"\u0006\b\u0092\u0001\u0010\u0084\u0001R\u001b\u0010\u0093\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0I8F\u00a2\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010LR \u0010\u0095\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u001b0\u0096\u00010\u000b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u000eR#\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u000e\"\u0005\b\u009a\u0001\u0010\u0010R\u0019\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020)0\u000b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u000eR#\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u000e\"\u0005\b\u009f\u0001\u0010\u0010R#\u0010\u00a0\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010\u000e\"\u0005\b\u00a2\u0001\u0010\u0010R\u001b\u0010\u00a3\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u001a0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u00a4\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u001a0\u000b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a5\u0001\u0010\u000eR#\u0010\u00a6\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a7\u0001\u0010\u000e\"\u0005\b\u00a8\u0001\u0010\u0010R#\u0010\u00a9\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0001\u0010\u000e\"\u0005\b\u00ab\u0001\u0010\u0010R\u0019\u0010\u00ac\u0001\u001a\b\u0012\u0004\u0012\u00020\f0I8F\u00a2\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010LR#\u0010\u00ae\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00af\u0001\u0010\u000e\"\u0005\b\u00b0\u0001\u0010\u0010R\u0019\u0010\u00b1\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b2\u0001\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u00b3\u0001\u001a\u00030\u00b4\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b5\u0001\u0010\u00b6\u0001\"\u0006\b\u00b7\u0001\u0010\u00b8\u0001R#\u0010\u00b9\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ba\u0001\u0010\u000e\"\u0005\b\u00bb\u0001\u0010\u0010R#\u0010\u00bc\u0001\u001a\b\u0012\u0004\u0012\u00020U0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bd\u0001\u0010\u000e\"\u0005\b\u00be\u0001\u0010\u0010R#\u0010\u00bf\u0001\u001a\b\u0012\u0004\u0012\u00020U0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c0\u0001\u0010\u000e\"\u0005\b\u00c1\u0001\u0010\u0010R#\u0010\u00c2\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c3\u0001\u0010\u000e\"\u0005\b\u00c4\u0001\u0010\u0010R#\u0010\u00c5\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c6\u0001\u0010\u000e\"\u0005\b\u00c7\u0001\u0010\u0010R#\u0010\u00c8\u0001\u001a\b\u0012\u0004\u0012\u00020U0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c9\u0001\u0010\u000e\"\u0005\b\u00ca\u0001\u0010\u0010R#\u0010\u00cb\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cc\u0001\u0010\u000e\"\u0005\b\u00cd\u0001\u0010\u0010R#\u0010\u00ce\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cf\u0001\u0010\u000e\"\u0005\b\u00d0\u0001\u0010\u0010R#\u0010\u00d1\u0001\u001a\b\u0012\u0004\u0012\u00020U0\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d2\u0001\u0010\u000e\"\u0005\b\u00d3\u0001\u0010\u0010\u00a8\u0006\u00fe\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/ManagePatientViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "userDataUseCase", "Lcom/intellihealth/truemeds/domain/usecase/ManagePatientUseCase;", "editPatientUseCase", "Lcom/intellihealth/truemeds/domain/usecase/EditPatientUseCase;", "addPatientUseCase", "Lcom/intellihealth/truemeds/domain/usecase/AddPatientUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/ManagePatientUseCase;Lcom/intellihealth/truemeds/domain/usecase/EditPatientUseCase;Lcom/intellihealth/truemeds/domain/usecase/AddPatientUseCase;)V", "_isEditPatient", "Landroidx/lifecycle/MutableLiveData;", "", "get_isEditPatient", "()Landroidx/lifecycle/MutableLiveData;", "set_isEditPatient", "(Landroidx/lifecycle/MutableLiveData;)V", "_isFreshUser", "get_isFreshUser", "()Z", "set_isFreshUser", "(Z)V", "_isMySelf", "get_isMySelf", "set_isMySelf", "_launchEditPatient", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "get_launchEditPatient", "set_launchEditPatient", "_patientItemList", "get_patientItemList", "set_patientItemList", "age", "", "getAge", "setAge", "ageHint", "getAgeHint", "setAgeHint", "apiType", "", "getApiType", "()I", "setApiType", "(I)V", "callSavePatientForOrder", "getCallSavePatientForOrder", "setCallSavePatientForOrder", "clickedOnPage", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "context", "Landroid/content/Context;", "deletePatientEventListener", "getDeletePatientEventListener", "disableFirstName", "kotlin.jvm.PlatformType", "getDisableFirstName", "setDisableFirstName", "disableLastName", "getDisableLastName", "setDisableLastName", "emailHint", "getEmailHint", "setEmailHint", "errorType", "Lcom/intellihealth/truemeds/data/utils/ERRORS;", "eventLaunchAddPatient", "getEventLaunchAddPatient", "eventMessage", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/data/utils/MessageConstant;", "getEventMessage", "()Landroidx/lifecycle/LiveData;", "eventShowError", "getEventShowError", "eventUpdateDbAccountFragment", "getEventUpdateDbAccountFragment", "firstName", "getFirstName", "setFirstName", "firstNameData", "Lcom/intellihealth/truemeds/data/model/errormessage/ErrorMessageData;", "getFirstNameData", "setFirstNameData", "firstNameHint", "getFirstNameHint", "setFirstNameHint", "gender", "getGender", "setGender", "genderValidationStr", "getGenderValidationStr", "setGenderValidationStr", "getSelectedPatientLiveDate", "getGetSelectedPatientLiveDate", "headerType", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "getHeaderType", "setHeaderType", "isDelete", "isOrderSummaryActivityOpened", "setOrderSummaryActivityOpened", "isSomeOneElse", "setSomeOneElse", "itemPosition", "getItemPosition", "setItemPosition", "lastName", "getLastName", "setLastName", "lastNameData", "getLastNameData", "setLastNameData", "lastNameHint", "getLastNameHint", "setLastNameHint", "launchAddPatient", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "newlyCreatedPatientId", "", "getNewlyCreatedPatientId", "()J", "setNewlyCreatedPatientId", "(J)V", "patientAge", "getPatientAge", "setPatientAge", "patientAgeData", "getPatientAgeData", "setPatientAgeData", "patientDetails", "getPatientDetails", "patientExperiment", "getPatientExperiment", "setPatientExperiment", "patientIdFromUpdateProfile", "getPatientIdFromUpdateProfile", "setPatientIdFromUpdateProfile", "patientItemList", "getPatientItemList", "patientsList", "", "getPatientsList", "radioType", "getRadioType", "setRadioType", "requestFocus", "getRequestFocus", "selectedPatient", "getSelectedPatient", "setSelectedPatient", "showAddPatientView", "getShowAddPatientView", "setShowAddPatientView", "showError", "showMessage", "getShowMessage", "showPatientListView", "getShowPatientListView", "setShowPatientListView", "showShimmer", "getShowShimmer", "setShowShimmer", "showShimmerLiveData", "getShowShimmerLiveData", "someOneElseRadioType", "getSomeOneElseRadioType", "setSomeOneElseRadioType", "updateDbAccountFragment", "getUpdateDbAccountFragment", "validator", "Lcom/intellihealth/truemeds/presentation/utils/Validator;", "getValidator", "()Lcom/intellihealth/truemeds/presentation/utils/Validator;", "setValidator", "(Lcom/intellihealth/truemeds/presentation/utils/Validator;)V", "yourAge", "getYourAge", "setYourAge", "yourAgeData", "getYourAgeData", "setYourAgeData", "yourEmailData", "getYourEmailData", "setYourEmailData", "yourEmailId", "getYourEmailId", "setYourEmailId", "yourFirstName", "getYourFirstName", "setYourFirstName", "yourFirstNameData", "getYourFirstNameData", "setYourFirstNameData", "yourGender", "getYourGender", "setYourGender", "yourLastName", "getYourLastName", "setYourLastName", "yourLastNameData", "getYourLastNameData", "setYourLastNameData", "addFreshUser", "", "isPatientWithUser", "addMyself", "mySelfDetails", "Lcom/intellihealth/truemeds/domain/model/PatientDetails;", "(Lcom/intellihealth/truemeds/domain/model/PatientDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNewPatientsButtonClick", "addPatient", "checkNameExist", "namString", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePatient", "deletePatientApiCalling", "editPatient", "getPatientExperimentCategory", "getPatientList", "managePatientListItemClick", "position", "type", "onSaveButtonClicked", "removeSelectedItem", "selectedItem", "saveButtonClick", "mContext", "savePatientForOrder", "orderId", "patientId", "customerId", "sendAddPatientClickedEvent", "clickedPage", "sendPatientAddedEvent", "mxPatientAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPatientAdded;", "updateCustomerDetailsToDb", "userDetails", "(Lcom/intellihealth/truemeds/domain/model/PatientDetails;Ljava/lang/Long;)V", "updateProfileForFreshUser", "updateProfileUseCase", "validateEditPatient", "validateFreshUser", "validateMySelf", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ManagePatientViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase userDataUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.EditPatientUseCase editPatientUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.AddPatientUseCase addPatientUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.utils.ERRORS> errorType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> selectedPatient;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> _launchEditPatient;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isEditPatient;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isMySelf;
    private boolean _isFreshUser = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> disableFirstName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> disableLastName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSomeOneElse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> deletePatientEventListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> isDelete = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> updateDbAccountFragment = null;
    private int itemPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> showError = null;
    private long newlyCreatedPatientId = -1L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> patientsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showAddPatientView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showPatientListView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> firstName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> firstNameHint;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> lastName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> lastNameHint;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> age;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> ageHint;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> emailHint;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> yourFirstName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> yourLastName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> yourEmailId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> yourAge;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientAge;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> gender;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> yourGender;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> genderValidationStr;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.utils.Validator validator;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> firstNameData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> lastNameData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> patientAgeData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> yourFirstNameData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> yourLastNameData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> yourAgeData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> yourEmailData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> headerType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientExperiment;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> radioType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> someOneElseRadioType;
    private android.content.Context context;
    private boolean callSavePatientForOrder = false;
    private int apiType = 0;
    private long patientIdFromUpdateProfile = 0L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> launchAddPatient = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> _patientItemList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> requestFocus = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "Manage Patient";
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    private boolean isOrderSummaryActivityOpened = false;
    
    @javax.inject.Inject()
    public ManagePatientViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase userDataUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.EditPatientUseCase editPatientUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.AddPatientUseCase addPatientUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> getSelectedPatient() {
        return null;
    }
    
    public final void setSelectedPatient(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> getGetSelectedPatientLiveDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> get_launchEditPatient() {
        return null;
    }
    
    public final void set_launchEditPatient(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> getPatientDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_isEditPatient() {
        return null;
    }
    
    public final void set_isEditPatient(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_isMySelf() {
        return null;
    }
    
    public final void set_isMySelf(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final boolean get_isFreshUser() {
        return false;
    }
    
    public final void set_isFreshUser(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDisableFirstName() {
        return null;
    }
    
    public final void setDisableFirstName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDisableLastName() {
        return null;
    }
    
    public final void setDisableLastName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSomeOneElse() {
        return null;
    }
    
    public final void setSomeOneElse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getDeletePatientEventListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> isDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUpdateDbAccountFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventUpdateDbAccountFragment() {
        return null;
    }
    
    public final int getItemPosition() {
        return 0;
    }
    
    public final void setItemPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> getEventShowError() {
        return null;
    }
    
    public final long getNewlyCreatedPatientId() {
        return 0L;
    }
    
    public final void setNewlyCreatedPatientId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> getPatientsList() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowAddPatientView() {
        return null;
    }
    
    public final void setShowAddPatientView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowPatientListView() {
        return null;
    }
    
    public final void setShowPatientListView(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFirstNameHint() {
        return null;
    }
    
    public final void setFirstNameHint(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLastNameHint() {
        return null;
    }
    
    public final void setLastNameHint(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAge() {
        return null;
    }
    
    public final void setAge(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAgeHint() {
        return null;
    }
    
    public final void setAgeHint(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmailHint() {
        return null;
    }
    
    public final void setEmailHint(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getYourFirstName() {
        return null;
    }
    
    public final void setYourFirstName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getYourLastName() {
        return null;
    }
    
    public final void setYourLastName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getYourEmailId() {
        return null;
    }
    
    public final void setYourEmailId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getYourAge() {
        return null;
    }
    
    public final void setYourAge(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientAge() {
        return null;
    }
    
    public final void setPatientAge(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getYourGender() {
        return null;
    }
    
    public final void setYourGender(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGenderValidationStr() {
        return null;
    }
    
    public final void setGenderValidationStr(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.utils.Validator getValidator() {
        return null;
    }
    
    public final void setValidator(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.utils.Validator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getFirstNameData() {
        return null;
    }
    
    public final void setFirstNameData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getLastNameData() {
        return null;
    }
    
    public final void setLastNameData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getPatientAgeData() {
        return null;
    }
    
    public final void setPatientAgeData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getYourFirstNameData() {
        return null;
    }
    
    public final void setYourFirstNameData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getYourLastNameData() {
        return null;
    }
    
    public final void setYourLastNameData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getYourAgeData() {
        return null;
    }
    
    public final void setYourAgeData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getYourEmailData() {
        return null;
    }
    
    public final void setYourEmailData(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientExperiment() {
        return null;
    }
    
    public final void setPatientExperiment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRadioType() {
        return null;
    }
    
    public final void setRadioType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSomeOneElseRadioType() {
        return null;
    }
    
    public final void setSomeOneElseRadioType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final boolean getCallSavePatientForOrder() {
        return false;
    }
    
    public final void setCallSavePatientForOrder(boolean p0) {
    }
    
    public final int getApiType() {
        return 0;
    }
    
    public final void setApiType(int p0) {
    }
    
    public final long getPatientIdFromUpdateProfile() {
        return 0L;
    }
    
    public final void setPatientIdFromUpdateProfile(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> getEventLaunchAddPatient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> get_patientItemList() {
        return null;
    }
    
    public final void set_patientItemList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> getPatientItemList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRequestFocus() {
        return null;
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
    
    public final boolean isOrderSummaryActivityOpened() {
        return false;
    }
    
    public final void setOrderSummaryActivityOpened(boolean p0) {
    }
    
    public final void setRadioType(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void setSomeOneElseRadioType(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void saveButtonClick(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
    }
    
    public final void addNewPatientsButtonClick() {
    }
    
    public final void managePatientListItemClick(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void deletePatientApiCalling() {
    }
    
    public final void deletePatient() {
    }
    
    public final void removeSelectedItem(int selectedItem) {
    }
    
    public final void getPatientList() {
    }
    
    public final void onSaveButtonClicked() {
    }
    
    private final void validateEditPatient() {
    }
    
    private final void validateFreshUser() {
    }
    
    private final void validateMySelf() {
    }
    
    public final void getPatientDetails() {
    }
    
    public final void editPatient() {
    }
    
    private final void updateProfileForFreshUser(com.intellihealth.truemeds.domain.model.PatientDetails mySelfDetails) {
    }
    
    private final java.lang.Object updateProfileUseCase(com.intellihealth.truemeds.domain.model.PatientDetails mySelfDetails, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void addFreshUser(boolean isPatientWithUser) {
    }
    
    public final void addPatient() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addMyself(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails mySelfDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void savePatientForOrder(long orderId, long patientId, java.lang.String customerId) {
    }
    
    public final void updateCustomerDetailsToDb(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.model.PatientDetails userDetails, @org.jetbrains.annotations.Nullable()
    java.lang.Long customerId) {
    }
    
    public final void getPatientExperimentCategory() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkNameExist(@org.jetbrains.annotations.NotNull()
    java.lang.String namString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    public final void sendPatientAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPatientAdded mxPatientAdded) {
    }
    
    public final void sendAddPatientClickedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedPage) {
    }
}