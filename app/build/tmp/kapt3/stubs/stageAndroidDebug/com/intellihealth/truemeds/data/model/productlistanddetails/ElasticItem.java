package com.intellihealth.truemeds.data.model.productlistanddetails;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0003\b\u00f6\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u001a\u0012\b\u00100\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u00010(\u0012\b\u00102\u001a\u0004\u0018\u00010\u0004\u0012\b\u00103\u001a\u0004\u0018\u00010\u0004\u0012\b\u00104\u001a\u0004\u0018\u00010\u0004\u0012\b\u00105\u001a\u0004\u0018\u00010(\u0012\b\u00106\u001a\u0004\u0018\u00010\u001a\u0012\b\u00107\u001a\u0004\u0018\u00010\u0004\u0012\b\u00108\u001a\u0004\u0018\u00010\u0004\u0012\b\u00109\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010E\u001a\u0004\u0018\u00010(\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010I\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010K\u001a\u0004\u0018\u00010(\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010M\u001a\u0004\u0018\u00010(\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010P\u001a\u0004\u0018\u00010(\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010R\u001a\u0004\u0018\u00010(\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010W\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010`J\f\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\u0011\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\u0011\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\u0011\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\u0011\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\u0012\u0010\u00da\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\f\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\f\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u00e4\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\f\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u00e8\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\u0011\u0010\u00e9\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\u0011\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00ec\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u00ed\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\f\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u00f0\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u00f1\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00f3\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u00f4\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00f6\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00f8\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u00f9\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0012\u0010\u00fa\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\f\u0010\u00fb\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00fc\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u00fd\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u00fe\u0001\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\f\u0010\u00ff\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0012\u0010\u0081\u0002\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u0083\u0002\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u0086\u0002\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\u0011\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\u0012\u0010\u0088\u0002\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u00c8\b\u0010\u0098\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010(2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00105\u001a\u0004\u0018\u00010(2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010E\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010K\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010M\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010P\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0099\u0002J\u0015\u0010\u009a\u0002\u001a\u00020\u001a2\t\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u009c\u0002\u001a\u00020\u0006H\u00d6\u0001J\n\u0010\u009d\u0002\u001a\u00020\u0004H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\be\u0010fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\bi\u0010fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010dR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\bk\u0010fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\bl\u0010fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\bp\u0010fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\br\u0010fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\bt\u0010fR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\bu\u0010fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\bv\u0010fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\bw\u0010fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010bR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\by\u0010fR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u0010{\u001a\u0004\b\u0019\u0010zR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\b\u001b\u0010fR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u0010{\u001a\u0004\b\u001c\u0010zR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u0010{\u001a\u0004\b\u001d\u0010zR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\b\u001e\u0010fR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\b|\u0010fR\u0015\u0010 \u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010g\u001a\u0004\b}\u0010fR\u0013\u0010!\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010dR\u0016\u0010#\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u0080\u0001\u0010fR\u0016\u0010$\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u0081\u0001\u0010fR\u0016\u0010%\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u0082\u0001\u0010zR\u0016\u0010&\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u0083\u0001\u0010zR\u0018\u0010\'\u001a\u0004\u0018\u00010(\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0014\u0010)\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010dR\u0014\u0010*\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010dR\u0014\u0010+\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010dR\u0014\u0010,\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010dR\u0014\u0010-\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010dR\u0014\u0010.\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010dR\u0016\u0010/\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u008d\u0001\u0010zR\u0014\u00100\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010dR\u0018\u00101\u001a\u0004\u0018\u00010(\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u008f\u0001\u0010\u0085\u0001R\u0014\u00102\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010dR\u0014\u00103\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010dR\u0014\u00104\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010dR\u0018\u00105\u001a\u0004\u0018\u00010(\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u0093\u0001\u0010\u0085\u0001R\u0016\u00106\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u0094\u0001\u0010zR\u0014\u00107\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010dR\u0014\u00108\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010dR\u0016\u00109\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u0097\u0001\u0010zR\u0014\u0010:\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010dR\u0014\u0010;\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010dR\u0016\u0010<\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u009a\u0001\u0010fR\u0014\u0010=\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010bR\u0016\u0010>\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u009c\u0001\u0010fR\u0016\u0010?\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u009d\u0001\u0010fR\u0014\u0010@\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010dR\u0014\u0010A\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010bR\u0014\u0010B\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a0\u0001\u0010dR\u0014\u0010C\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a1\u0001\u0010dR\u0016\u0010D\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u00a2\u0001\u0010fR\u0018\u0010E\u001a\u0004\u0018\u00010(\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u00a3\u0001\u0010\u0085\u0001R\u0014\u0010F\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a4\u0001\u0010dR\u0014\u0010G\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a5\u0001\u0010dR\u0014\u0010H\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a6\u0001\u0010dR\u0016\u0010I\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u00a7\u0001\u0010zR\u0014\u0010J\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a8\u0001\u0010dR\u0018\u0010K\u001a\u0004\u0018\u00010(\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u00a9\u0001\u0010\u0085\u0001R\u0014\u0010L\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00aa\u0001\u0010dR\u0018\u0010M\u001a\u0004\u0018\u00010(\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u00ab\u0001\u0010\u0085\u0001R\u0014\u0010N\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ac\u0001\u0010dR\u0014\u0010O\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010dR\u0018\u0010P\u001a\u0004\u0018\u00010(\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u00ae\u0001\u0010\u0085\u0001R\u0016\u0010Q\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u000b\n\u0002\u0010{\u001a\u0005\b\u00af\u0001\u0010zR\u0018\u0010R\u001a\u0004\u0018\u00010(\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u00b0\u0001\u0010\u0085\u0001R\u0014\u0010S\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b1\u0001\u0010dR\u0016\u0010T\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u00b2\u0001\u0010fR\u0014\u0010U\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b3\u0001\u0010dR\u0016\u0010V\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u00b4\u0001\u0010fR\u0014\u0010W\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b5\u0001\u0010dR\u0016\u0010X\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u00b6\u0001\u0010fR\u0019\u0010Y\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b7\u0001\u0010dR\u0014\u0010Z\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b8\u0001\u0010bR\u0014\u0010[\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b9\u0001\u0010bR\u0014\u0010\\\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ba\u0001\u0010dR\u0016\u0010]\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u00bb\u0001\u0010fR\u0016\u0010^\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u000b\n\u0002\u0010g\u001a\u0005\b\u00bc\u0001\u0010fR\u0019\u0010_\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bd\u0001\u0010d\u00a8\u0006\u009e\u0002"}, d2 = {"Lcom/intellihealth/truemeds/data/model/productlistanddetails/ElasticItem;", "", "branded_tag", "category1", "", "category1_score", "", "category2", "category2_score", "category3", "category3_score", "company_nm_score", "composition_search", "created_on", "disease1", "disease1_score", "disease2", "disease2_score", "disease3", "disease3_score", "dispatched_order_count", "doctor_substituted_count", "experiment_id", "generic_branded_for_procurement", "id", "is_chronic", "", "is_org_product_info_present", "is_otc", "is_special_product", "is_subs_product_info_present", "max_capped_qty", "max_capped_weight", "med_type", "modified_on", "molecule_code_score", "mother_brand_score", "org_cold_storage", "original_available", "original_base_discount", "", "original_company_addr", "original_company_nm", "original_composition", "original_country_nm", "original_drug_type", "original_generic_branded", "original_is_searchable", "original_mother_brand", "original_mrp", "original_pack", "original_product_code", "original_product_url_suffix", "original_pts", "original_rx_required", "original_sku_name", "original_super_group", "original_supplied_bytm", "original_unit", "otc_disease", "otc_disease_score", "otc_sub_category", "patient_taken_count", "prod_searched_count", "product_image_urls", "salt_url_suffix", "savings_percentage", "savings_value", "sub_recommended_qty", "subs_base_discount", "subs_company_addr", "subs_company_nm", "subs_country_nm", "subs_found", "subs_generic_branded", "subs_margin", "subs_mother_brand", "subs_mrp", "subs_pack", "subs_product_code", "subs_pts", "subs_rx_required", "subs_selling_price", "subs_sku_name", "subs_taken_count", "subs_unit", "substitute_order_count", "super_category", "super_category_score", "timestamp", "top_product_rank", "ts", "type", "type_score", "variant_id", "version", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getBranded_tag", "()Ljava/lang/Object;", "getCategory1", "()Ljava/lang/String;", "getCategory1_score", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCategory2", "getCategory2_score", "getCategory3", "getCategory3_score", "getCompany_nm_score", "getComposition_search", "getCreated_on", "getDisease1", "getDisease1_score", "getDisease2", "getDisease2_score", "getDisease3", "getDisease3_score", "getDispatched_order_count", "getDoctor_substituted_count", "getExperiment_id", "getGeneric_branded_for_procurement", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMax_capped_qty", "getMax_capped_weight", "getMed_type", "getModified_on", "getMolecule_code_score", "getMother_brand_score", "getOrg_cold_storage", "getOriginal_available", "getOriginal_base_discount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOriginal_company_addr", "getOriginal_company_nm", "getOriginal_composition", "getOriginal_country_nm", "getOriginal_drug_type", "getOriginal_generic_branded", "getOriginal_is_searchable", "getOriginal_mother_brand", "getOriginal_mrp", "getOriginal_pack", "getOriginal_product_code", "getOriginal_product_url_suffix", "getOriginal_pts", "getOriginal_rx_required", "getOriginal_sku_name", "getOriginal_super_group", "getOriginal_supplied_bytm", "getOriginal_unit", "getOtc_disease", "getOtc_disease_score", "getOtc_sub_category", "getPatient_taken_count", "getProd_searched_count", "getProduct_image_urls", "getSalt_url_suffix", "getSavings_percentage", "getSavings_value", "getSub_recommended_qty", "getSubs_base_discount", "getSubs_company_addr", "getSubs_company_nm", "getSubs_country_nm", "getSubs_found", "getSubs_generic_branded", "getSubs_margin", "getSubs_mother_brand", "getSubs_mrp", "getSubs_pack", "getSubs_product_code", "getSubs_pts", "getSubs_rx_required", "getSubs_selling_price", "getSubs_sku_name", "getSubs_taken_count", "getSubs_unit", "getSubstitute_order_count", "getSuper_category", "getSuper_category_score", "getTimestamp", "getTop_product_rank", "getTs", "getType", "getType_score", "getVariant_id", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/productlistanddetails/ElasticItem;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
public final class ElasticItem {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object branded_tag = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String category1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer category1_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String category2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer category2_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String category3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer category3_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer company_nm_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String composition_search = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String created_on = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object disease1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer disease1_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object disease2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer disease2_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object disease3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer disease3_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer dispatched_order_count = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer doctor_substituted_count = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer experiment_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object generic_branded_for_procurement = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_chronic = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer is_org_product_info_present = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_otc = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_special_product = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer is_subs_product_info_present = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer max_capped_qty = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer max_capped_weight = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String med_type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String modified_on = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer molecule_code_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mother_brand_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean org_cold_storage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean original_available = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double original_base_discount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_company_addr = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_company_nm = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_composition = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_country_nm = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_drug_type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_generic_branded = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean original_is_searchable = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_mother_brand = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double original_mrp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_pack = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_product_code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_product_url_suffix = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double original_pts = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean original_rx_required = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_sku_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_super_group = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean original_supplied_bytm = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String original_unit = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String otc_disease = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer otc_disease_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object otc_sub_category = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer patient_taken_count = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer prod_searched_count = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String product_image_urls = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object salt_url_suffix = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String savings_percentage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String savings_value = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer sub_recommended_qty = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double subs_base_discount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_company_addr = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_company_nm = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_country_nm = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean subs_found = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_generic_branded = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double subs_margin = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_mother_brand = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double subs_mrp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_pack = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_product_code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double subs_pts = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean subs_rx_required = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double subs_selling_price = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_sku_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer subs_taken_count = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subs_unit = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer substitute_order_count = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String super_category = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer super_category_score = null;
    @com.google.gson.annotations.SerializedName(value = "@timestamp")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String timestamp = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object top_product_rank = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object ts = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer type_score = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer variant_id = null;
    @com.google.gson.annotations.SerializedName(value = "@version")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String version = null;
    
    public ElasticItem(@org.jetbrains.annotations.Nullable()
    java.lang.Object branded_tag, @org.jetbrains.annotations.Nullable()
    java.lang.String category1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer category1_score, @org.jetbrains.annotations.Nullable()
    java.lang.String category2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer category2_score, @org.jetbrains.annotations.Nullable()
    java.lang.String category3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer category3_score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer company_nm_score, @org.jetbrains.annotations.Nullable()
    java.lang.String composition_search, @org.jetbrains.annotations.Nullable()
    java.lang.String created_on, @org.jetbrains.annotations.Nullable()
    java.lang.Object disease1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer disease1_score, @org.jetbrains.annotations.Nullable()
    java.lang.Object disease2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer disease2_score, @org.jetbrains.annotations.Nullable()
    java.lang.Object disease3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer disease3_score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dispatched_order_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer doctor_substituted_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer experiment_id, @org.jetbrains.annotations.Nullable()
    java.lang.Object generic_branded_for_procurement, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_chronic, @org.jetbrains.annotations.Nullable()
    java.lang.Integer is_org_product_info_present, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_otc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_special_product, @org.jetbrains.annotations.Nullable()
    java.lang.Integer is_subs_product_info_present, @org.jetbrains.annotations.Nullable()
    java.lang.Integer max_capped_qty, @org.jetbrains.annotations.Nullable()
    java.lang.Integer max_capped_weight, @org.jetbrains.annotations.Nullable()
    java.lang.String med_type, @org.jetbrains.annotations.Nullable()
    java.lang.String modified_on, @org.jetbrains.annotations.Nullable()
    java.lang.Integer molecule_code_score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mother_brand_score, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean org_cold_storage, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean original_available, @org.jetbrains.annotations.Nullable()
    java.lang.Double original_base_discount, @org.jetbrains.annotations.Nullable()
    java.lang.String original_company_addr, @org.jetbrains.annotations.Nullable()
    java.lang.String original_company_nm, @org.jetbrains.annotations.Nullable()
    java.lang.String original_composition, @org.jetbrains.annotations.Nullable()
    java.lang.String original_country_nm, @org.jetbrains.annotations.Nullable()
    java.lang.String original_drug_type, @org.jetbrains.annotations.Nullable()
    java.lang.String original_generic_branded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean original_is_searchable, @org.jetbrains.annotations.Nullable()
    java.lang.String original_mother_brand, @org.jetbrains.annotations.Nullable()
    java.lang.Double original_mrp, @org.jetbrains.annotations.Nullable()
    java.lang.String original_pack, @org.jetbrains.annotations.Nullable()
    java.lang.String original_product_code, @org.jetbrains.annotations.Nullable()
    java.lang.String original_product_url_suffix, @org.jetbrains.annotations.Nullable()
    java.lang.Double original_pts, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean original_rx_required, @org.jetbrains.annotations.Nullable()
    java.lang.String original_sku_name, @org.jetbrains.annotations.Nullable()
    java.lang.String original_super_group, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean original_supplied_bytm, @org.jetbrains.annotations.Nullable()
    java.lang.String original_unit, @org.jetbrains.annotations.Nullable()
    java.lang.String otc_disease, @org.jetbrains.annotations.Nullable()
    java.lang.Integer otc_disease_score, @org.jetbrains.annotations.Nullable()
    java.lang.Object otc_sub_category, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patient_taken_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prod_searched_count, @org.jetbrains.annotations.Nullable()
    java.lang.String product_image_urls, @org.jetbrains.annotations.Nullable()
    java.lang.Object salt_url_suffix, @org.jetbrains.annotations.Nullable()
    java.lang.String savings_percentage, @org.jetbrains.annotations.Nullable()
    java.lang.String savings_value, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sub_recommended_qty, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_base_discount, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_company_addr, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_company_nm, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_country_nm, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subs_found, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_generic_branded, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_margin, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_mother_brand, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_mrp, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_pack, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_product_code, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_pts, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subs_rx_required, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_selling_price, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_sku_name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subs_taken_count, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_unit, @org.jetbrains.annotations.Nullable()
    java.lang.Integer substitute_order_count, @org.jetbrains.annotations.Nullable()
    java.lang.String super_category, @org.jetbrains.annotations.Nullable()
    java.lang.Integer super_category_score, @org.jetbrains.annotations.Nullable()
    java.lang.String timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Object top_product_rank, @org.jetbrains.annotations.Nullable()
    java.lang.Object ts, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type_score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer variant_id, @org.jetbrains.annotations.Nullable()
    java.lang.String version) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBranded_tag() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCategory1_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCategory2_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCategory3_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCompany_nm_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComposition_search() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreated_on() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDisease1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDisease1_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDisease2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDisease2_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDisease3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDisease3_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDispatched_order_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDoctor_substituted_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExperiment_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getGeneric_branded_for_procurement() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_chronic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer is_org_product_info_present() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_otc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_special_product() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer is_subs_product_info_present() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMax_capped_qty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMax_capped_weight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMed_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getModified_on() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMolecule_code_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMother_brand_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOrg_cold_storage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOriginal_available() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOriginal_base_discount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_company_addr() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_company_nm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_composition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_country_nm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_drug_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_generic_branded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOriginal_is_searchable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_mother_brand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOriginal_mrp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_pack() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_product_code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_product_url_suffix() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getOriginal_pts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOriginal_rx_required() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_sku_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_super_group() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOriginal_supplied_bytm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_unit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOtc_disease() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOtc_disease_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOtc_sub_category() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPatient_taken_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getProd_searched_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProduct_image_urls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSalt_url_suffix() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSavings_percentage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSavings_value() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSub_recommended_qty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubs_base_discount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_company_addr() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_company_nm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_country_nm() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSubs_found() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_generic_branded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubs_margin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_mother_brand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubs_mrp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_pack() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_product_code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubs_pts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSubs_rx_required() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSubs_selling_price() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_sku_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubs_taken_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubs_unit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubstitute_order_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuper_category() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSuper_category_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTop_product_rank() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getType_score() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVariant_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component15() {
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
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component35() {
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
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
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
    public final java.lang.Boolean component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component52() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component55() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component56() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component57() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component58() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component59() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component60() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component61() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component62() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component63() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component64() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component65() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component66() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component67() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component68() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component69() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component70() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component71() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component72() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component73() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component74() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component75() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component76() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component77() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component78() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component79() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component80() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component81() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component82() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component83() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component84() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component85() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component86() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component87() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component88() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component89() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component90() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.productlistanddetails.ElasticItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.Object branded_tag, @org.jetbrains.annotations.Nullable()
    java.lang.String category1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer category1_score, @org.jetbrains.annotations.Nullable()
    java.lang.String category2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer category2_score, @org.jetbrains.annotations.Nullable()
    java.lang.String category3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer category3_score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer company_nm_score, @org.jetbrains.annotations.Nullable()
    java.lang.String composition_search, @org.jetbrains.annotations.Nullable()
    java.lang.String created_on, @org.jetbrains.annotations.Nullable()
    java.lang.Object disease1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer disease1_score, @org.jetbrains.annotations.Nullable()
    java.lang.Object disease2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer disease2_score, @org.jetbrains.annotations.Nullable()
    java.lang.Object disease3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer disease3_score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dispatched_order_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer doctor_substituted_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer experiment_id, @org.jetbrains.annotations.Nullable()
    java.lang.Object generic_branded_for_procurement, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_chronic, @org.jetbrains.annotations.Nullable()
    java.lang.Integer is_org_product_info_present, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_otc, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_special_product, @org.jetbrains.annotations.Nullable()
    java.lang.Integer is_subs_product_info_present, @org.jetbrains.annotations.Nullable()
    java.lang.Integer max_capped_qty, @org.jetbrains.annotations.Nullable()
    java.lang.Integer max_capped_weight, @org.jetbrains.annotations.Nullable()
    java.lang.String med_type, @org.jetbrains.annotations.Nullable()
    java.lang.String modified_on, @org.jetbrains.annotations.Nullable()
    java.lang.Integer molecule_code_score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mother_brand_score, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean org_cold_storage, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean original_available, @org.jetbrains.annotations.Nullable()
    java.lang.Double original_base_discount, @org.jetbrains.annotations.Nullable()
    java.lang.String original_company_addr, @org.jetbrains.annotations.Nullable()
    java.lang.String original_company_nm, @org.jetbrains.annotations.Nullable()
    java.lang.String original_composition, @org.jetbrains.annotations.Nullable()
    java.lang.String original_country_nm, @org.jetbrains.annotations.Nullable()
    java.lang.String original_drug_type, @org.jetbrains.annotations.Nullable()
    java.lang.String original_generic_branded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean original_is_searchable, @org.jetbrains.annotations.Nullable()
    java.lang.String original_mother_brand, @org.jetbrains.annotations.Nullable()
    java.lang.Double original_mrp, @org.jetbrains.annotations.Nullable()
    java.lang.String original_pack, @org.jetbrains.annotations.Nullable()
    java.lang.String original_product_code, @org.jetbrains.annotations.Nullable()
    java.lang.String original_product_url_suffix, @org.jetbrains.annotations.Nullable()
    java.lang.Double original_pts, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean original_rx_required, @org.jetbrains.annotations.Nullable()
    java.lang.String original_sku_name, @org.jetbrains.annotations.Nullable()
    java.lang.String original_super_group, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean original_supplied_bytm, @org.jetbrains.annotations.Nullable()
    java.lang.String original_unit, @org.jetbrains.annotations.Nullable()
    java.lang.String otc_disease, @org.jetbrains.annotations.Nullable()
    java.lang.Integer otc_disease_score, @org.jetbrains.annotations.Nullable()
    java.lang.Object otc_sub_category, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patient_taken_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prod_searched_count, @org.jetbrains.annotations.Nullable()
    java.lang.String product_image_urls, @org.jetbrains.annotations.Nullable()
    java.lang.Object salt_url_suffix, @org.jetbrains.annotations.Nullable()
    java.lang.String savings_percentage, @org.jetbrains.annotations.Nullable()
    java.lang.String savings_value, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sub_recommended_qty, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_base_discount, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_company_addr, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_company_nm, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_country_nm, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subs_found, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_generic_branded, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_margin, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_mother_brand, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_mrp, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_pack, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_product_code, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_pts, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean subs_rx_required, @org.jetbrains.annotations.Nullable()
    java.lang.Double subs_selling_price, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_sku_name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subs_taken_count, @org.jetbrains.annotations.Nullable()
    java.lang.String subs_unit, @org.jetbrains.annotations.Nullable()
    java.lang.Integer substitute_order_count, @org.jetbrains.annotations.Nullable()
    java.lang.String super_category, @org.jetbrains.annotations.Nullable()
    java.lang.Integer super_category_score, @org.jetbrains.annotations.Nullable()
    java.lang.String timestamp, @org.jetbrains.annotations.Nullable()
    java.lang.Object top_product_rank, @org.jetbrains.annotations.Nullable()
    java.lang.Object ts, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type_score, @org.jetbrains.annotations.Nullable()
    java.lang.Integer variant_id, @org.jetbrains.annotations.Nullable()
    java.lang.String version) {
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