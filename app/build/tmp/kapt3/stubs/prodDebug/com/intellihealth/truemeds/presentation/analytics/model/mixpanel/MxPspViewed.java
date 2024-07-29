package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0003\b\u0096\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00b1\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010+J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0012\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\n\u0010\u008f\u0001\u001a\u00020\nH\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010YJ\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u00109J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\nH\u00c6\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010YJ\u0012\u0010\u00a1\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u00c6\u0003J\u00bc\u0003\u0010\u00a2\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00a3\u0001J\u0015\u0010\u00a4\u0001\u001a\u00020\n2\t\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\rH\u00d6\u0001J\n\u0010\u00a7\u0001\u001a\u00020\u0003H\u00d6\u0001R \u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010*\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010)\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010-\"\u0004\b@\u0010/R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\bA\u00109\"\u0004\bB\u0010;R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010-\"\u0004\bD\u0010/R \u0010(\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010-\"\u0004\bF\u0010/R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\bG\u00109\"\u0004\bH\u0010;R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\bK\u00109\"\u0004\bL\u0010;R \u0010\'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010-\"\u0004\bN\u0010/R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010O\"\u0004\bP\u0010QR&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\bV\u00109\"\u0004\bW\u0010;R\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\\\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010-\"\u0004\b^\u0010/R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b_\u00109\"\u0004\b`\u0010;R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010-\"\u0004\bb\u0010/R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010-\"\u0004\bd\u0010/R\"\u0010\"\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\\\u001a\u0004\be\u0010Y\"\u0004\bf\u0010[R \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010-\"\u0004\bh\u0010/R \u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010-\"\u0004\bj\u0010/R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010-\"\u0004\bl\u0010/R&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010S\"\u0004\bn\u0010UR\u001e\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010O\"\u0004\bp\u0010QR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\bq\u00109\"\u0004\br\u0010;R \u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010-\"\u0004\bt\u0010/R \u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010-\"\u0004\bv\u0010/R \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010-\"\u0004\bx\u0010/R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010-\"\u0004\bz\u0010/R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b{\u00109\"\u0004\b|\u0010;R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b}\u00109\"\u0004\b~\u0010;\u00a8\u0006\u00a8\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPspViewed;", "", "pageSection", "", "ctaType", "pageState", "availablePaymentModes", "Lorg/json/JSONArray;", "paymentMode", "isReorder", "", "clickedOnPage", "noOfItem", "", "productsIds", "", "subsId", "salesPrice", "", "itemNames", "appliedCouponName", "appliedCouponType", "orderId", "mrpTotalAmount", "discountAmount", "packagingChargeAmount", "deliveryChargeAmount", "couponDiscountAmount", "tmCreditAmount", "tmRewardAmount", "estimatedPayableAmount", "rxRequired", "paymentMethod", "patientType", "patientAge", "shippingCity", "shippingState", "shippingPinCode", "addressType", "gender", "currentOrderStatus", "cashHandlingChargeApplicable", "cashHandlingCharge", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "getAppliedCouponName", "setAppliedCouponName", "getAppliedCouponType", "setAppliedCouponType", "getAvailablePaymentModes", "()Lorg/json/JSONArray;", "setAvailablePaymentModes", "(Lorg/json/JSONArray;)V", "getCashHandlingCharge", "()Ljava/lang/Double;", "setCashHandlingCharge", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCashHandlingChargeApplicable", "setCashHandlingChargeApplicable", "getClickedOnPage", "setClickedOnPage", "getCouponDiscountAmount", "setCouponDiscountAmount", "getCtaType", "setCtaType", "getCurrentOrderStatus", "setCurrentOrderStatus", "getDeliveryChargeAmount", "setDeliveryChargeAmount", "getDiscountAmount", "setDiscountAmount", "getEstimatedPayableAmount", "setEstimatedPayableAmount", "getGender", "setGender", "()Z", "setReorder", "(Z)V", "getItemNames", "()Ljava/util/List;", "setItemNames", "(Ljava/util/List;)V", "getMrpTotalAmount", "setMrpTotalAmount", "getNoOfItem", "()Ljava/lang/Integer;", "setNoOfItem", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOrderId", "setOrderId", "getPackagingChargeAmount", "setPackagingChargeAmount", "getPageSection", "setPageSection", "getPageState", "setPageState", "getPatientAge", "setPatientAge", "getPatientType", "setPatientType", "getPaymentMethod", "setPaymentMethod", "getPaymentMode", "setPaymentMode", "getProductsIds", "setProductsIds", "getRxRequired", "setRxRequired", "getSalesPrice", "setSalesPrice", "getShippingCity", "setShippingCity", "getShippingPinCode", "setShippingPinCode", "getShippingState", "setShippingState", "getSubsId", "setSubsId", "getTmCreditAmount", "setTmCreditAmount", "getTmRewardAmount", "setTmRewardAmount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPspViewed;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class MxPspViewed {
    @com.google.gson.annotations.SerializedName(value = "page_section")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pageSection;
    @com.google.gson.annotations.SerializedName(value = "cta_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ctaType;
    @com.google.gson.annotations.SerializedName(value = "page_state")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pageState;
    @com.google.gson.annotations.SerializedName(value = "available_payment_modes")
    @org.jetbrains.annotations.Nullable()
    private org.json.JSONArray availablePaymentModes;
    @com.google.gson.annotations.SerializedName(value = "payment_mode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMode;
    @com.google.gson.annotations.SerializedName(value = "is_reorder")
    private boolean isReorder;
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "no_of_item")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer noOfItem;
    @com.google.gson.annotations.SerializedName(value = "products_ids")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> productsIds;
    @com.google.gson.annotations.SerializedName(value = "subs_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsId;
    @com.google.gson.annotations.SerializedName(value = "sales_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double salesPrice;
    @com.google.gson.annotations.SerializedName(value = "item_names")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> itemNames;
    @com.google.gson.annotations.SerializedName(value = "applied_coupon_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String appliedCouponName;
    @com.google.gson.annotations.SerializedName(value = "applied_coupon_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String appliedCouponType;
    @com.google.gson.annotations.SerializedName(value = "order_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderId;
    @com.google.gson.annotations.SerializedName(value = "mrp_total_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrpTotalAmount;
    @com.google.gson.annotations.SerializedName(value = "discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discountAmount;
    @com.google.gson.annotations.SerializedName(value = "packaging_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double packagingChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "delivery_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double deliveryChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "coupon_discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscountAmount;
    @com.google.gson.annotations.SerializedName(value = "tm_credit_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCreditAmount;
    @com.google.gson.annotations.SerializedName(value = "tm_reward_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmRewardAmount;
    @com.google.gson.annotations.SerializedName(value = "estimated_payable_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double estimatedPayableAmount;
    @com.google.gson.annotations.SerializedName(value = "rx_required")
    private boolean rxRequired;
    @com.google.gson.annotations.SerializedName(value = "payment_method")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMethod;
    @com.google.gson.annotations.SerializedName(value = "patient_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String patientType;
    @com.google.gson.annotations.SerializedName(value = "patient_age")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer patientAge;
    @com.google.gson.annotations.SerializedName(value = "shipping_city")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shippingCity;
    @com.google.gson.annotations.SerializedName(value = "shipping_state")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shippingState;
    @com.google.gson.annotations.SerializedName(value = "shipping_pincode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shippingPinCode;
    @com.google.gson.annotations.SerializedName(value = "address_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addressType;
    @com.google.gson.annotations.SerializedName(value = "gender")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String gender;
    @com.google.gson.annotations.SerializedName(value = "current_order_status")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentOrderStatus;
    @com.google.gson.annotations.SerializedName(value = "cash_handling_charge_applicable")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingChargeApplicable;
    @com.google.gson.annotations.SerializedName(value = "cash_handling_charge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingCharge;
    
    public MxPspViewed(@org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.String ctaType, @org.jetbrains.annotations.Nullable()
    java.lang.String pageState, @org.jetbrains.annotations.Nullable()
    org.json.JSONArray availablePaymentModes, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, boolean isReorder, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfItem, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productsIds, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double salesPrice, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponName, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponType, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrpTotalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double estimatedPayableAmount, boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String patientType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingCity, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingState, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingPinCode, @org.jetbrains.annotations.Nullable()
    java.lang.String addressType, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String currentOrderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingChargeApplicable, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingCharge) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCtaType() {
        return null;
    }
    
    public final void setCtaType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageState() {
        return null;
    }
    
    public final void setPageState(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONArray getAvailablePaymentModes() {
        return null;
    }
    
    public final void setAvailablePaymentModes(@org.jetbrains.annotations.Nullable()
    org.json.JSONArray p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMode() {
        return null;
    }
    
    public final void setPaymentMode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isReorder() {
        return false;
    }
    
    public final void setReorder(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNoOfItem() {
        return null;
    }
    
    public final void setNoOfItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getProductsIds() {
        return null;
    }
    
    public final void setProductsIds(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsId() {
        return null;
    }
    
    public final void setSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSalesPrice() {
        return null;
    }
    
    public final void setSalesPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getItemNames() {
        return null;
    }
    
    public final void setItemNames(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppliedCouponName() {
        return null;
    }
    
    public final void setAppliedCouponName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppliedCouponType() {
        return null;
    }
    
    public final void setAppliedCouponType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrpTotalAmount() {
        return null;
    }
    
    public final void setMrpTotalAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDiscountAmount() {
        return null;
    }
    
    public final void setDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPackagingChargeAmount() {
        return null;
    }
    
    public final void setPackagingChargeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDeliveryChargeAmount() {
        return null;
    }
    
    public final void setDeliveryChargeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCouponDiscountAmount() {
        return null;
    }
    
    public final void setCouponDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTmCreditAmount() {
        return null;
    }
    
    public final void setTmCreditAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTmRewardAmount() {
        return null;
    }
    
    public final void setTmRewardAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getEstimatedPayableAmount() {
        return null;
    }
    
    public final void setEstimatedPayableAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final boolean getRxRequired() {
        return false;
    }
    
    public final void setRxRequired(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientType() {
        return null;
    }
    
    public final void setPatientType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPatientAge() {
        return null;
    }
    
    public final void setPatientAge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingCity() {
        return null;
    }
    
    public final void setShippingCity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingState() {
        return null;
    }
    
    public final void setShippingState(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingPinCode() {
        return null;
    }
    
    public final void setShippingPinCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentOrderStatus() {
        return null;
    }
    
    public final void setCurrentOrderStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingChargeApplicable() {
        return null;
    }
    
    public final void setCashHandlingChargeApplicable(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingCharge() {
        return null;
    }
    
    public final void setCashHandlingCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public MxPspViewed() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component23() {
        return null;
    }
    
    public final boolean component24() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONArray component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPspViewed copy(@org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.String ctaType, @org.jetbrains.annotations.Nullable()
    java.lang.String pageState, @org.jetbrains.annotations.Nullable()
    org.json.JSONArray availablePaymentModes, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMode, boolean isReorder, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfItem, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productsIds, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double salesPrice, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponName, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponType, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrpTotalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double estimatedPayableAmount, boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String patientType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingCity, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingState, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingPinCode, @org.jetbrains.annotations.Nullable()
    java.lang.String addressType, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String currentOrderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingChargeApplicable, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingCharge) {
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