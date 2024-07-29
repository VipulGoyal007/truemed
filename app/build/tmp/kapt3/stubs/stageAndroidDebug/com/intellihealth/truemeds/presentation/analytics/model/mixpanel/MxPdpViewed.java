package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0003\b\u00a2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00f3\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u00101J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\tH\u00c6\u0003J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0002\u0010hJ\f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0002\u0010hJ\u0011\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0002\u0010hJ\f\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\n\u0010\u00a5\u0001\u001a\u00020\tH\u00c6\u0003J\f\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\tH\u00c6\u0003J\f\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0002\u0010hJ\f\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00af\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010@J\f\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\tH\u00c6\u0003J\f\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u00fe\u0003\u0010\u00ba\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010#\u001a\u00020\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020\t2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00bb\u0001J\u0015\u0010\u00bc\u0001\u001a\u00020\t2\t\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u001dH\u00d6\u0001J\b\u0010\u00bf\u0001\u001a\u00030\u00c0\u0001J\b\u0010\u00c1\u0001\u001a\u00030\u00c2\u0001J\n\u0010\u00c3\u0001\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u0010/\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001a\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00103\"\u0004\b<\u00105R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010D\"\u0004\bE\u0010FR\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010D\"\u0004\bG\u0010FR\u001a\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b,\u00109R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u00103\"\u0004\bI\u00105R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u00103\"\u0004\bK\u00105R\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010P\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00103\"\u0004\bR\u00105R\u001e\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010D\"\u0004\bT\u0010FR\"\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010P\u001a\u0004\bU\u0010M\"\u0004\bV\u0010OR \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u00103\"\u0004\bX\u00105R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u00103\"\u0004\bZ\u00105R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u00103\"\u0004\b\\\u00105R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u00103\"\u0004\b^\u00105R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010P\u001a\u0004\b_\u0010M\"\u0004\b`\u0010OR \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u00103\"\u0004\bb\u00105R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010P\u001a\u0004\bc\u0010M\"\u0004\bd\u0010OR \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u00103\"\u0004\bf\u00105R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010k\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u00103\"\u0004\bm\u00105R\"\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010k\u001a\u0004\bn\u0010h\"\u0004\bo\u0010jR\"\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010k\u001a\u0004\bp\u0010h\"\u0004\bq\u0010jR \u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u00103\"\u0004\bs\u00105R \u0010.\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u00103\"\u0004\bu\u00105R \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u00103\"\u0004\bw\u00105R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u00103\"\u0004\by\u00105R\"\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010P\u001a\u0004\bz\u0010M\"\u0004\b{\u0010OR \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u00103\"\u0004\b}\u00105R\u001e\u0010#\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010D\"\u0004\b\u007f\u0010FR$\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010P\u001a\u0005\b\u0080\u0001\u0010M\"\u0005\b\u0081\u0001\u0010OR\"\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u00103\"\u0005\b\u0083\u0001\u00105R \u0010&\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010D\"\u0005\b\u0085\u0001\u0010FR\"\u0010\'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u00103\"\u0005\b\u0087\u0001\u00105R$\u0010(\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010k\u001a\u0005\b\u0088\u0001\u0010h\"\u0005\b\u0089\u0001\u0010jR\"\u00100\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u00103\"\u0005\b\u008b\u0001\u00105R\"\u0010)\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u00103\"\u0005\b\u008d\u0001\u00105R\"\u0010*\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u00103\"\u0005\b\u008f\u0001\u00105\u00a8\u0006\u00c4\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpViewed;", "", "brand", "", "clickedOnPage", "clickedSuggestionType", "discountVariantId", "", "isBottomSheet", "", "isNotInStock", "orgProductDiscountPercentage", "orgProductId", "orgProductMrp", "", "orgProductName", "orgProductPictureExists", "orgProductSalePrice", "pageSection", "pageType", "productDiscountPercentage", "productId", "productMrp", "productName", "subsProductId", "subsProductName", "productSalePrice", "qc", "resultPosition", "", "rt", "sectionIndex", "sectionRow", "subsProductDiscountPercentage", "subsProductMrp", "subsProductPictureExists", "subsProductSalePrice", "subsSavings", "substituteAvailable", "suggestionTermClicked", "suggestionTermClickedPosition", "termSearched", "whId", "section_heading", "is_otc", "chronic", "subCategoryName", "categoryName", "superCategoryName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Double;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "getCategoryName", "setCategoryName", "getChronic", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getClickedOnPage", "setClickedOnPage", "getClickedSuggestionType", "setClickedSuggestionType", "getDiscountVariantId", "()Ljava/lang/Long;", "setDiscountVariantId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "()Z", "setBottomSheet", "(Z)V", "setNotInStock", "getOrgProductDiscountPercentage", "setOrgProductDiscountPercentage", "getOrgProductId", "setOrgProductId", "getOrgProductMrp", "()Ljava/lang/Double;", "setOrgProductMrp", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getOrgProductName", "setOrgProductName", "getOrgProductPictureExists", "setOrgProductPictureExists", "getOrgProductSalePrice", "setOrgProductSalePrice", "getPageSection", "setPageSection", "getPageType", "setPageType", "getProductDiscountPercentage", "setProductDiscountPercentage", "getProductId", "setProductId", "getProductMrp", "setProductMrp", "getProductName", "setProductName", "getProductSalePrice", "setProductSalePrice", "getQc", "setQc", "getResultPosition", "()Ljava/lang/Integer;", "setResultPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRt", "setRt", "getSectionIndex", "setSectionIndex", "getSectionRow", "setSectionRow", "getSection_heading", "setSection_heading", "getSubCategoryName", "setSubCategoryName", "getSubsProductDiscountPercentage", "setSubsProductDiscountPercentage", "getSubsProductId", "setSubsProductId", "getSubsProductMrp", "setSubsProductMrp", "getSubsProductName", "setSubsProductName", "getSubsProductPictureExists", "setSubsProductPictureExists", "getSubsProductSalePrice", "setSubsProductSalePrice", "getSubsSavings", "setSubsSavings", "getSubstituteAvailable", "setSubstituteAvailable", "getSuggestionTermClicked", "setSuggestionTermClicked", "getSuggestionTermClickedPosition", "setSuggestionTermClickedPosition", "getSuperCategoryName", "setSuperCategoryName", "getTermSearched", "setTermSearched", "getWhId", "setWhId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Double;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpViewed;", "equals", "other", "hashCode", "toAppsFlyer", "Lcom/intellihealth/truemeds/mvvm/data/appsflyer/AFPdpViewed;", "toCleverTap", "Lcom/intellihealth/truemeds/data/model/clevertap/CtPdpViewed;", "toString", "app_stageAndroidDebug"})
public final class MxPdpViewed {
    @com.google.gson.annotations.SerializedName(value = "brand")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String brand;
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "clicked_suggestion_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedSuggestionType;
    @com.google.gson.annotations.SerializedName(value = "discount_variant_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long discountVariantId;
    @com.google.gson.annotations.SerializedName(value = "is_bottom_sheet")
    private boolean isBottomSheet;
    @com.google.gson.annotations.SerializedName(value = "is_not_in_stock")
    private boolean isNotInStock;
    @com.google.gson.annotations.SerializedName(value = "org_product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "org_product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductId;
    @com.google.gson.annotations.SerializedName(value = "org_product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgProductMrp;
    @com.google.gson.annotations.SerializedName(value = "org_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductName;
    @com.google.gson.annotations.SerializedName(value = "org_product_picture_exists")
    private boolean orgProductPictureExists;
    @com.google.gson.annotations.SerializedName(value = "org_product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double orgProductSalePrice;
    @com.google.gson.annotations.SerializedName(value = "page_section")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pageSection;
    @com.google.gson.annotations.SerializedName(value = "page_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pageType;
    @com.google.gson.annotations.SerializedName(value = "product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productId;
    @com.google.gson.annotations.SerializedName(value = "product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productMrp;
    @com.google.gson.annotations.SerializedName(value = "product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productName;
    @com.google.gson.annotations.SerializedName(value = "subs_product_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductId;
    @com.google.gson.annotations.SerializedName(value = "subs_product_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductName;
    @com.google.gson.annotations.SerializedName(value = "product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double productSalePrice;
    @com.google.gson.annotations.SerializedName(value = "_qc")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String qc;
    @com.google.gson.annotations.SerializedName(value = "result_position")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer resultPosition;
    @com.google.gson.annotations.SerializedName(value = "_rt")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rt;
    @com.google.gson.annotations.SerializedName(value = "section_index")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sectionIndex;
    @com.google.gson.annotations.SerializedName(value = "section_row")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sectionRow;
    @com.google.gson.annotations.SerializedName(value = "subs_product_discount_percentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsProductDiscountPercentage;
    @com.google.gson.annotations.SerializedName(value = "subs_product_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsProductMrp;
    @com.google.gson.annotations.SerializedName(value = "subs_product_picture_exists")
    private boolean subsProductPictureExists;
    @com.google.gson.annotations.SerializedName(value = "subs_product_sale_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double subsProductSalePrice;
    @com.google.gson.annotations.SerializedName(value = "subs_savings")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsSavings;
    @com.google.gson.annotations.SerializedName(value = "substitute_available")
    private boolean substituteAvailable;
    @com.google.gson.annotations.SerializedName(value = "suggestion_term_clicked")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestionTermClicked;
    @com.google.gson.annotations.SerializedName(value = "suggestion_term_clicked_position")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer suggestionTermClickedPosition;
    @com.google.gson.annotations.SerializedName(value = "term_searched")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String termSearched;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    @com.google.gson.annotations.SerializedName(value = "section_heading")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String section_heading;
    @com.google.gson.annotations.SerializedName(value = "is_otc")
    @kotlin.jvm.Transient()
    @org.jetbrains.annotations.Nullable()
    private final transient java.lang.Boolean is_otc = null;
    @com.google.gson.annotations.SerializedName(value = "is_chronic")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean chronic = null;
    @com.google.gson.annotations.SerializedName(value = "sub_category_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subCategoryName;
    @com.google.gson.annotations.SerializedName(value = "category_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String categoryName;
    @com.google.gson.annotations.SerializedName(value = "super_category_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String superCategoryName;
    
    public MxPdpViewed(@org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.Long discountVariantId, boolean isBottomSheet, boolean isNotInStock, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, boolean orgProductPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.String pageType, @org.jetbrains.annotations.Nullable()
    java.lang.String productDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.Double productMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionRow, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductMrp, boolean subsProductPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String subsSavings, boolean substituteAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.Integer suggestionTermClickedPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String section_heading, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_otc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean chronic, @org.jetbrains.annotations.Nullable()
    java.lang.String subCategoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String categoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String superCategoryName) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrand() {
        return null;
    }
    
    public final void setBrand(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedSuggestionType() {
        return null;
    }
    
    public final void setClickedSuggestionType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDiscountVariantId() {
        return null;
    }
    
    public final void setDiscountVariantId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final boolean isBottomSheet() {
        return false;
    }
    
    public final void setBottomSheet(boolean p0) {
    }
    
    public final boolean isNotInStock() {
        return false;
    }
    
    public final void setNotInStock(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductDiscountPercentage() {
        return null;
    }
    
    public final void setOrgProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductId() {
        return null;
    }
    
    public final void setOrgProductId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgProductMrp() {
        return null;
    }
    
    public final void setOrgProductMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductName() {
        return null;
    }
    
    public final void setOrgProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getOrgProductPictureExists() {
        return false;
    }
    
    public final void setOrgProductPictureExists(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOrgProductSalePrice() {
        return null;
    }
    
    public final void setOrgProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageType() {
        return null;
    }
    
    public final void setPageType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductDiscountPercentage() {
        return null;
    }
    
    public final void setProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductId() {
        return null;
    }
    
    public final void setProductId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getProductMrp() {
        return null;
    }
    
    public final void setProductMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsProductId() {
        return null;
    }
    
    public final void setSubsProductId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsProductName() {
        return null;
    }
    
    public final void setSubsProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getProductSalePrice() {
        return null;
    }
    
    public final void setProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQc() {
        return null;
    }
    
    public final void setQc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getResultPosition() {
        return null;
    }
    
    public final void setResultPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRt() {
        return null;
    }
    
    public final void setRt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSectionIndex() {
        return null;
    }
    
    public final void setSectionIndex(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSectionRow() {
        return null;
    }
    
    public final void setSectionRow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsProductDiscountPercentage() {
        return null;
    }
    
    public final void setSubsProductDiscountPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsProductMrp() {
        return null;
    }
    
    public final void setSubsProductMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final boolean getSubsProductPictureExists() {
        return false;
    }
    
    public final void setSubsProductPictureExists(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubsProductSalePrice() {
        return null;
    }
    
    public final void setSubsProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsSavings() {
        return null;
    }
    
    public final void setSubsSavings(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getSubstituteAvailable() {
        return false;
    }
    
    public final void setSubstituteAvailable(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuggestionTermClicked() {
        return null;
    }
    
    public final void setSuggestionTermClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSuggestionTermClickedPosition() {
        return null;
    }
    
    public final void setSuggestionTermClickedPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTermSearched() {
        return null;
    }
    
    public final void setTermSearched(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSection_heading() {
        return null;
    }
    
    public final void setSection_heading(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_otc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getChronic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubCategoryName() {
        return null;
    }
    
    public final void setSubCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategoryName() {
        return null;
    }
    
    public final void setCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuperCategoryName() {
        return null;
    }
    
    public final void setSuperCategoryName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.clevertap.CtPdpViewed toCleverTap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.mvvm.data.appsflyer.AFPdpViewed toAppsFlyer() {
        return null;
    }
    
    public MxPdpViewed() {
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
    
    public final boolean component11() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
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
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component28() {
        return null;
    }
    
    public final boolean component29() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    public final boolean component32() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component42() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpViewed copy(@org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedSuggestionType, @org.jetbrains.annotations.Nullable()
    java.lang.Long discountVariantId, boolean isBottomSheet, boolean isNotInStock, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductId, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductName, boolean orgProductPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double orgProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.String pageType, @org.jetbrains.annotations.Nullable()
    java.lang.String productDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String productId, @org.jetbrains.annotations.Nullable()
    java.lang.Double productMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductId, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductName, @org.jetbrains.annotations.Nullable()
    java.lang.Double productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String qc, @org.jetbrains.annotations.Nullable()
    java.lang.Integer resultPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String rt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sectionRow, @org.jetbrains.annotations.Nullable()
    java.lang.String subsProductDiscountPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductMrp, boolean subsProductPictureExists, @org.jetbrains.annotations.Nullable()
    java.lang.Double subsProductSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String subsSavings, boolean substituteAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionTermClicked, @org.jetbrains.annotations.Nullable()
    java.lang.Integer suggestionTermClickedPosition, @org.jetbrains.annotations.Nullable()
    java.lang.String termSearched, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String section_heading, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_otc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean chronic, @org.jetbrains.annotations.Nullable()
    java.lang.String subCategoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String categoryName, @org.jetbrains.annotations.Nullable()
    java.lang.String superCategoryName) {
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