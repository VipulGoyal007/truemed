package com.intellihealth.truemeds.data.model.user;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0003\b\u00c0\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00db\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0001\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0001\u0012\b\u00100\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\u0018\u0012\b\u00102\u001a\u0004\u0018\u00010\u0018\u0012\b\u00103\u001a\u0004\u0018\u00010\u0018\u0012\b\u00104\u001a\u0004\u0018\u00010\u0018\u0012\b\u00105\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u00106J\u0011\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\f\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00108J\u0011\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00108J\u0011\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00108J\u0011\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0011\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\f\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\u0011\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\f\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010HJ\f\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\f\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\f\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0011\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00108J\f\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00108J\f\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u00c4\u0004\u0010\u00d2\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00d3\u0001J\u0015\u0010\u00d4\u0001\u001a\u00020\u00182\t\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00d6\u0001\u001a\u00020\tH\u00d6\u0001J\n\u0010\u00d7\u0001\u001a\u00020\u000bH\u00d6\u0001R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010,\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u00100\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010=\"\u0004\bF\u0010?R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010K\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\u001e\u00105\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010X\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010K\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010JR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010=\"\u0004\b\\\u0010?R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010=\"\u0004\b^\u0010?R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010=\"\u0004\bd\u0010?R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010X\u001a\u0004\b\u0019\u0010U\"\u0004\be\u0010WR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010X\u001a\u0004\b\u0017\u0010U\"\u0004\bf\u0010WR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010=\"\u0004\bh\u0010?R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010K\u001a\u0004\bi\u0010H\"\u0004\bj\u0010JR\u001c\u0010&\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010=\"\u0004\bl\u0010?R\u001e\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010;\u001a\u0004\bm\u00108\"\u0004\bn\u0010:R\u001c\u0010/\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010=\"\u0004\bp\u0010?R\u001e\u00101\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010X\u001a\u0004\bq\u0010U\"\u0004\br\u0010WR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010=\"\u0004\bt\u0010?R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010=\"\u0004\bv\u0010?R\u001c\u0010(\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010=\"\u0004\bx\u0010?R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010=\"\u0004\bz\u0010?R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010;\u001a\u0004\b{\u00108\"\u0004\b|\u0010:R\u001c\u0010$\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010=\"\u0004\b~\u0010?R\u001d\u0010!\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010=\"\u0005\b\u0080\u0001\u0010?R \u00103\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010X\u001a\u0005\b\u0081\u0001\u0010U\"\u0005\b\u0082\u0001\u0010WR \u00104\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010X\u001a\u0005\b\u0083\u0001\u0010U\"\u0005\b\u0084\u0001\u0010WR \u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010D\u001a\u0005\b\u0085\u0001\u0010A\"\u0005\b\u0086\u0001\u0010CR\u001e\u0010-\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010=\"\u0005\b\u0088\u0001\u0010?R\u001e\u0010.\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010=\"\u0005\b\u008a\u0001\u0010?R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010=\"\u0005\b\u008c\u0001\u0010?R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010=\"\u0005\b\u008e\u0001\u0010?R \u00102\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010X\u001a\u0005\b\u008f\u0001\u0010U\"\u0005\b\u0090\u0001\u0010WR \u0010%\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010X\u001a\u0005\b\u0091\u0001\u0010U\"\u0005\b\u0092\u0001\u0010WR\u001e\u0010)\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010=\"\u0005\b\u0094\u0001\u0010?R\u001e\u0010+\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010=\"\u0005\b\u0096\u0001\u0010?R\u001e\u0010*\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010=\"\u0005\b\u0098\u0001\u0010?R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010`\"\u0005\b\u009a\u0001\u0010bR \u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010;\u001a\u0005\b\u009b\u0001\u00108\"\u0005\b\u009c\u0001\u0010:R\u001e\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010=\"\u0005\b\u009e\u0001\u0010?R \u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010D\u001a\u0005\b\u009f\u0001\u0010A\"\u0005\b\u00a0\u0001\u0010CR \u0010\u0016\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010;\u001a\u0005\b\u00a1\u0001\u00108\"\u0005\b\u00a2\u0001\u0010:\u00a8\u0006\u00d8\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/model/user/LiveOrder;", "", "date", "", "totalSaving", "", "modifiedOn", "paymentValue", "statusId", "", "edd", "", "orderId", "statusSubstring", "status", "deliveryPartnerName", "deliveryPartnerNumber", "patientId", "medicineDetailsList", "ratingId", "addressId", "paymentId", "workflowStatusId", "isDoctorCallMissed", "", "isCallbackRequested", "doctorCutOffTime", "paymentCutOffTime", "currentTimestamp", "discount", "drName", "doctorId", "currentPaymentOption", "paymentMethodId", "promoCode", "finalCalcAmt", "paymentMethodIconUrl", "rxRequired", "noOfItem", "patientAge", "patientType", "shippingCity", "shippingState", "shippingPincode", "addressType", "productCodes", "productNames", "orgSubsId", "couponDiscountPrice", "outForDelivery", "reorder", "paymentPending", "paymentSpecificCouponApplied", "doctorCallConfirm", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAddressId", "()Ljava/lang/Integer;", "setAddressId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAddressType", "()Ljava/lang/Object;", "setAddressType", "(Ljava/lang/Object;)V", "getCouponDiscountPrice", "()Ljava/lang/Double;", "setCouponDiscountPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCurrentPaymentOption", "setCurrentPaymentOption", "getCurrentTimestamp", "()Ljava/lang/Long;", "setCurrentTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDate", "setDate", "getDeliveryPartnerName", "setDeliveryPartnerName", "getDeliveryPartnerNumber", "setDeliveryPartnerNumber", "getDiscount", "setDiscount", "getDoctorCallConfirm", "()Ljava/lang/Boolean;", "setDoctorCallConfirm", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getDoctorCutOffTime", "setDoctorCutOffTime", "getDoctorId", "setDoctorId", "getDrName", "setDrName", "getEdd", "()Ljava/lang/String;", "setEdd", "(Ljava/lang/String;)V", "getFinalCalcAmt", "setFinalCalcAmt", "setCallbackRequested", "setDoctorCallMissed", "getMedicineDetailsList", "setMedicineDetailsList", "getModifiedOn", "setModifiedOn", "getNoOfItem", "setNoOfItem", "getOrderId", "setOrderId", "getOrgSubsId", "setOrgSubsId", "getOutForDelivery", "setOutForDelivery", "getPatientAge", "setPatientAge", "getPatientId", "setPatientId", "getPatientType", "setPatientType", "getPaymentCutOffTime", "setPaymentCutOffTime", "getPaymentId", "setPaymentId", "getPaymentMethodIconUrl", "setPaymentMethodIconUrl", "getPaymentMethodId", "setPaymentMethodId", "getPaymentPending", "setPaymentPending", "getPaymentSpecificCouponApplied", "setPaymentSpecificCouponApplied", "getPaymentValue", "setPaymentValue", "getProductCodes", "setProductCodes", "getProductNames", "setProductNames", "getPromoCode", "setPromoCode", "getRatingId", "setRatingId", "getReorder", "setReorder", "getRxRequired", "setRxRequired", "getShippingCity", "setShippingCity", "getShippingPincode", "setShippingPincode", "getShippingState", "setShippingState", "getStatus", "setStatus", "getStatusId", "setStatusId", "getStatusSubstring", "setStatusSubstring", "getTotalSaving", "setTotalSaving", "getWorkflowStatusId", "setWorkflowStatusId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/intellihealth/truemeds/data/model/user/LiveOrder;", "equals", "other", "hashCode", "toString", "app_prodDebug"})
public final class LiveOrder {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long date;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double totalSaving;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long modifiedOn;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double paymentValue;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer statusId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String edd;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer orderId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object statusSubstring;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object deliveryPartnerName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object deliveryPartnerNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object patientId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object medicineDetailsList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object ratingId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer addressId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer paymentId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer workflowStatusId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isDoctorCallMissed;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isCallbackRequested;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long doctorCutOffTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object paymentCutOffTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long currentTimestamp;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object drName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object doctorId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object currentPaymentOption;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object paymentMethodId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object promoCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object finalCalcAmt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object paymentMethodIconUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean rxRequired;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object noOfItem;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object patientAge;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object patientType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object shippingCity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object shippingState;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object shippingPincode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object addressType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object productCodes;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object productNames;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object orgSubsId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscountPrice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean outForDelivery;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean reorder;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean paymentPending;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean paymentSpecificCouponApplied;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean doctorCallConfirm;
    
    public LiveOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long date, @org.jetbrains.annotations.Nullable()
    java.lang.Double totalSaving, @org.jetbrains.annotations.Nullable()
    java.lang.Long modifiedOn, @org.jetbrains.annotations.Nullable()
    java.lang.Double paymentValue, @org.jetbrains.annotations.Nullable()
    java.lang.Integer statusId, @org.jetbrains.annotations.Nullable()
    java.lang.String edd, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Object statusSubstring, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Object deliveryPartnerName, @org.jetbrains.annotations.Nullable()
    java.lang.Object deliveryPartnerNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Object medicineDetailsList, @org.jetbrains.annotations.Nullable()
    java.lang.Object ratingId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addressId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer paymentId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer workflowStatusId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isDoctorCallMissed, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCallbackRequested, @org.jetbrains.annotations.Nullable()
    java.lang.Long doctorCutOffTime, @org.jetbrains.annotations.Nullable()
    java.lang.Object paymentCutOffTime, @org.jetbrains.annotations.Nullable()
    java.lang.Long currentTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Object drName, @org.jetbrains.annotations.Nullable()
    java.lang.Object doctorId, @org.jetbrains.annotations.Nullable()
    java.lang.Object currentPaymentOption, @org.jetbrains.annotations.Nullable()
    java.lang.Object paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.Object promoCode, @org.jetbrains.annotations.Nullable()
    java.lang.Object finalCalcAmt, @org.jetbrains.annotations.Nullable()
    java.lang.Object paymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Object noOfItem, @org.jetbrains.annotations.Nullable()
    java.lang.Object patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.Object patientType, @org.jetbrains.annotations.Nullable()
    java.lang.Object shippingCity, @org.jetbrains.annotations.Nullable()
    java.lang.Object shippingState, @org.jetbrains.annotations.Nullable()
    java.lang.Object shippingPincode, @org.jetbrains.annotations.Nullable()
    java.lang.Object addressType, @org.jetbrains.annotations.Nullable()
    java.lang.Object productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.Object productNames, @org.jetbrains.annotations.Nullable()
    java.lang.Object orgSubsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean outForDelivery, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reorder, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean paymentPending, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean paymentSpecificCouponApplied, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean doctorCallConfirm) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTotalSaving() {
        return null;
    }
    
    public final void setTotalSaving(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getModifiedOn() {
        return null;
    }
    
    public final void setModifiedOn(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPaymentValue() {
        return null;
    }
    
    public final void setPaymentValue(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatusId() {
        return null;
    }
    
    public final void setStatusId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEdd() {
        return null;
    }
    
    public final void setEdd(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStatusSubstring() {
        return null;
    }
    
    public final void setStatusSubstring(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDeliveryPartnerName() {
        return null;
    }
    
    public final void setDeliveryPartnerName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDeliveryPartnerNumber() {
        return null;
    }
    
    public final void setDeliveryPartnerNumber(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPatientId() {
        return null;
    }
    
    public final void setPatientId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMedicineDetailsList() {
        return null;
    }
    
    public final void setMedicineDetailsList(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRatingId() {
        return null;
    }
    
    public final void setRatingId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAddressId() {
        return null;
    }
    
    public final void setAddressId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPaymentId() {
        return null;
    }
    
    public final void setPaymentId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWorkflowStatusId() {
        return null;
    }
    
    public final void setWorkflowStatusId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isDoctorCallMissed() {
        return null;
    }
    
    public final void setDoctorCallMissed(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCallbackRequested() {
        return null;
    }
    
    public final void setCallbackRequested(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDoctorCutOffTime() {
        return null;
    }
    
    public final void setDoctorCutOffTime(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPaymentCutOffTime() {
        return null;
    }
    
    public final void setPaymentCutOffTime(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCurrentTimestamp() {
        return null;
    }
    
    public final void setCurrentTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDiscount() {
        return null;
    }
    
    public final void setDiscount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDrName() {
        return null;
    }
    
    public final void setDrName(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDoctorId() {
        return null;
    }
    
    public final void setDoctorId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentPaymentOption() {
        return null;
    }
    
    public final void setCurrentPaymentOption(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPaymentMethodId() {
        return null;
    }
    
    public final void setPaymentMethodId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPromoCode() {
        return null;
    }
    
    public final void setPromoCode(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFinalCalcAmt() {
        return null;
    }
    
    public final void setFinalCalcAmt(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPaymentMethodIconUrl() {
        return null;
    }
    
    public final void setPaymentMethodIconUrl(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRxRequired() {
        return null;
    }
    
    public final void setRxRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNoOfItem() {
        return null;
    }
    
    public final void setNoOfItem(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPatientAge() {
        return null;
    }
    
    public final void setPatientAge(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPatientType() {
        return null;
    }
    
    public final void setPatientType(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShippingCity() {
        return null;
    }
    
    public final void setShippingCity(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShippingState() {
        return null;
    }
    
    public final void setShippingState(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShippingPincode() {
        return null;
    }
    
    public final void setShippingPincode(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductCodes() {
        return null;
    }
    
    public final void setProductCodes(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductNames() {
        return null;
    }
    
    public final void setProductNames(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrgSubsId() {
        return null;
    }
    
    public final void setOrgSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCouponDiscountPrice() {
        return null;
    }
    
    public final void setCouponDiscountPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOutForDelivery() {
        return null;
    }
    
    public final void setOutForDelivery(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReorder() {
        return null;
    }
    
    public final void setReorder(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPaymentPending() {
        return null;
    }
    
    public final void setPaymentPending(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPaymentSpecificCouponApplied() {
        return null;
    }
    
    public final void setPaymentSpecificCouponApplied(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDoctorCallConfirm() {
        return null;
    }
    
    public final void setDoctorCallConfirm(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.user.LiveOrder copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long date, @org.jetbrains.annotations.Nullable()
    java.lang.Double totalSaving, @org.jetbrains.annotations.Nullable()
    java.lang.Long modifiedOn, @org.jetbrains.annotations.Nullable()
    java.lang.Double paymentValue, @org.jetbrains.annotations.Nullable()
    java.lang.Integer statusId, @org.jetbrains.annotations.Nullable()
    java.lang.String edd, @org.jetbrains.annotations.Nullable()
    java.lang.Integer orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Object statusSubstring, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Object deliveryPartnerName, @org.jetbrains.annotations.Nullable()
    java.lang.Object deliveryPartnerNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object patientId, @org.jetbrains.annotations.Nullable()
    java.lang.Object medicineDetailsList, @org.jetbrains.annotations.Nullable()
    java.lang.Object ratingId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer addressId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer paymentId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer workflowStatusId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isDoctorCallMissed, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCallbackRequested, @org.jetbrains.annotations.Nullable()
    java.lang.Long doctorCutOffTime, @org.jetbrains.annotations.Nullable()
    java.lang.Object paymentCutOffTime, @org.jetbrains.annotations.Nullable()
    java.lang.Long currentTimestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Double discount, @org.jetbrains.annotations.Nullable()
    java.lang.Object drName, @org.jetbrains.annotations.Nullable()
    java.lang.Object doctorId, @org.jetbrains.annotations.Nullable()
    java.lang.Object currentPaymentOption, @org.jetbrains.annotations.Nullable()
    java.lang.Object paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.Object promoCode, @org.jetbrains.annotations.Nullable()
    java.lang.Object finalCalcAmt, @org.jetbrains.annotations.Nullable()
    java.lang.Object paymentMethodIconUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Object noOfItem, @org.jetbrains.annotations.Nullable()
    java.lang.Object patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.Object patientType, @org.jetbrains.annotations.Nullable()
    java.lang.Object shippingCity, @org.jetbrains.annotations.Nullable()
    java.lang.Object shippingState, @org.jetbrains.annotations.Nullable()
    java.lang.Object shippingPincode, @org.jetbrains.annotations.Nullable()
    java.lang.Object addressType, @org.jetbrains.annotations.Nullable()
    java.lang.Object productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.Object productNames, @org.jetbrains.annotations.Nullable()
    java.lang.Object orgSubsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean outForDelivery, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reorder, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean paymentPending, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean paymentSpecificCouponApplied, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean doctorCallConfirm) {
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