package com.intellihealth.truemeds.presentation.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u00b5\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00d1\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f\u0012\b\b\u0002\u0010 \u001a\u00020\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010*\u001a\u00020\f\u0012\b\b\u0002\u0010+\u001a\u00020\u0010\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010/\u001a\u00020\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u00101\u001a\u00020\f\u0012\b\b\u0002\u00102\u001a\u00020\f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010(\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010=J\u0011\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\f\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0012H\u00c6\u0003J\f\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\u0012\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\f\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00c7\u0001\u001a\u00020\fH\u00c6\u0003J\f\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00c9\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\fH\u00c6\u0003J\f\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010zJ\f\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u00d2\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010(H\u00c6\u0003J\f\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00d4\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u00d5\u0001\u001a\u00020\u0010H\u00c6\u0003J\u0012\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0093\u0001J\f\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\n\u0010\u00d9\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00da\u0001\u001a\u00020\fH\u00c6\u0003J\f\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00dc\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u00dd\u0001\u001a\u00020\fH\u00c6\u0003J\f\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\u00e1\u0001\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010(H\u00c6\u0003J\u0012\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0003\u0010\u009a\u0001J\u0012\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0003\u0010\u009a\u0001J\f\u0010\u00e4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00e5\u0001\u001a\u0004\u0018\u00010;H\u00c6\u0003J\f\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\f\u0010\u00e8\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\n\u0010\u00e9\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u00ea\u0001\u001a\u00020\fH\u00c6\u0003J\u00e2\u0004\u0010\u00eb\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001d\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010*\u001a\u00020\f2\b\b\u0002\u0010+\u001a\u00020\u00102\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010/\u001a\u00020\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00101\u001a\u00020\f2\b\b\u0002\u00102\u001a\u00020\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010(2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00ec\u0001J\u0015\u0010\u00ed\u0001\u001a\u00020\f2\t\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00ef\u0001\u001a\u00020\u0010H\u00d6\u0001J\u001a\u0010\u00f0\u0001\u001a\u00030\u00f1\u00012\u0007\u0010\u00f2\u0001\u001a\u00020\f2\u0007\u0010\u00f3\u0001\u001a\u00020\u0010J\b\u0010\u00f4\u0001\u001a\u00030\u00f5\u0001J\n\u0010\u00f6\u0001\u001a\u00020\u0007H\u00d6\u0001R \u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010?\"\u0004\bC\u0010AR\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR \u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\u001c\u00105\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010?\"\u0004\bO\u0010AR\u001e\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010I\"\u0004\bQ\u0010KR\u001e\u0010 \u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010I\"\u0004\bS\u0010KR\u001e\u0010\u0014\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR \u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010?\"\u0004\bY\u0010AR&\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010I\"\u0004\b^\u0010KR\u001e\u00101\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010I\"\u0004\b_\u0010KR\u001e\u00102\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010I\"\u0004\b`\u0010KR \u0010-\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010?\"\u0004\bb\u0010AR \u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010?\"\u0004\bd\u0010AR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010<\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010?\"\u0004\bj\u0010AR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010U\"\u0004\bl\u0010WR\u001c\u00104\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010?\"\u0004\bn\u0010AR\u001c\u00103\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010?\"\u0004\bp\u0010AR \u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010?\"\u0004\br\u0010AR \u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010?\"\u0004\bt\u0010AR \u0010%\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010?\"\u0004\bv\u0010AR \u0010$\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010?\"\u0004\bx\u0010AR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010}\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010}\u001a\u0004\b~\u0010zR!\u0010&\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010?\"\u0005\b\u0080\u0001\u0010AR$\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010(X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010[\"\u0005\b\u0082\u0001\u0010]R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010?\"\u0005\b\u0084\u0001\u0010AR \u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010?\"\u0005\b\u0086\u0001\u0010AR \u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010}\u001a\u0005\b\u0087\u0001\u0010z\"\u0005\b\u0088\u0001\u0010|R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010?\"\u0005\b\u008a\u0001\u0010AR\'\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\'\u0010.\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u008c\u0001\"\u0006\b\u0091\u0001\u0010\u008e\u0001R\'\u0010,\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0015\n\u0003\u0010\u0096\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010U\"\u0005\b\u0098\u0001\u0010WR#\u00108\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u009d\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R#\u00109\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009a\u0001\"\u0006\b\u009f\u0001\u0010\u009c\u0001R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010?\"\u0005\b\u00a1\u0001\u0010AR \u0010*\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a2\u0001\u0010I\"\u0005\b\u00a3\u0001\u0010KR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a4\u0001\u0010?\"\u0005\b\u00a5\u0001\u0010AR \u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0001\u0010I\"\u0005\b\u00a7\u0001\u0010KR \u0010/\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a8\u0001\u0010I\"\u0005\b\u00a9\u0001\u0010KR\"\u00100\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0001\u0010?\"\u0005\b\u00ab\u0001\u0010AR\"\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ac\u0001\u0010?\"\u0005\b\u00ad\u0001\u0010AR\"\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ae\u0001\u0010?\"\u0005\b\u00af\u0001\u0010AR\"\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b0\u0001\u0010?\"\u0005\b\u00b1\u0001\u0010AR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b2\u0001\u0010?\"\u0005\b\u00b3\u0001\u0010AR \u0010+\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b4\u0001\u0010f\"\u0005\b\u00b5\u0001\u0010hR\"\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b6\u0001\u0010?\"\u0005\b\u00b7\u0001\u0010A\u00a8\u0006\u00f7\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/Product;", "", "productDetailsId", "", "prevOrderId", "prevOrgProductId", "productCode", "", "skuName", "availabilityStatus", "availabilityMessage", "isAvailable", "", "suppliedByTm", "manufacturerName", "maxCappedQty", "", "mrp", "", "sellingPrice", "discount", "packSize", "unit", "packForm", "pricePerUnitLabel", "productImageUrl", "qty", "composition", "subsSavingPercentage", "coldStorage", "drugType", "cxAcceptedSubs", "cxKeepOriginal", "switchBackSkuName", "switchBackProductCode", "switchBackImageUrl", "preSubsSkuName", "preSubsProductCode", "prevSubsAvailabilityMessage", "highlightedInfo", "", "usersAlsoBoughtMessage", "subsFound", "usersAlsoBoughtCount", "replacedSavingPercentage", "manufacturerAddr", "recommendedQty", "switchBackAvailability", "switchBackAvailabilityStatus", "isChronic", "isOtc", "orgSubsSkuName", "orgProductCode", "customerAlsoBoughtMsg", "priceInfoDto", "Lcom/intellihealth/salt/models/PriceInfo;", "showRemove", "showRemoved", "availabilityStatusWarning", "Lcom/intellihealth/salt/constants/FWPCWarningConstants;", "motherBrand", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;IDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZILjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/intellihealth/salt/constants/FWPCWarningConstants;Ljava/lang/String;)V", "getAvailabilityMessage", "()Ljava/lang/String;", "setAvailabilityMessage", "(Ljava/lang/String;)V", "getAvailabilityStatus", "setAvailabilityStatus", "getAvailabilityStatusWarning", "()Lcom/intellihealth/salt/constants/FWPCWarningConstants;", "setAvailabilityStatusWarning", "(Lcom/intellihealth/salt/constants/FWPCWarningConstants;)V", "getColdStorage", "()Z", "setColdStorage", "(Z)V", "getComposition", "setComposition", "getCustomerAlsoBoughtMsg", "setCustomerAlsoBoughtMsg", "getCxAcceptedSubs", "setCxAcceptedSubs", "getCxKeepOriginal", "setCxKeepOriginal", "getDiscount", "()D", "setDiscount", "(D)V", "getDrugType", "setDrugType", "getHighlightedInfo", "()Ljava/util/List;", "setHighlightedInfo", "(Ljava/util/List;)V", "setAvailable", "setChronic", "setOtc", "getManufacturerAddr", "setManufacturerAddr", "getManufacturerName", "setManufacturerName", "getMaxCappedQty", "()I", "setMaxCappedQty", "(I)V", "getMotherBrand", "setMotherBrand", "getMrp", "setMrp", "getOrgProductCode", "setOrgProductCode", "getOrgSubsSkuName", "setOrgSubsSkuName", "getPackForm", "setPackForm", "getPackSize", "setPackSize", "getPreSubsProductCode", "setPreSubsProductCode", "getPreSubsSkuName", "setPreSubsSkuName", "getPrevOrderId", "()Ljava/lang/Long;", "setPrevOrderId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPrevOrgProductId", "getPrevSubsAvailabilityMessage", "setPrevSubsAvailabilityMessage", "getPriceInfoDto", "setPriceInfoDto", "getPricePerUnitLabel", "setPricePerUnitLabel", "getProductCode", "setProductCode", "getProductDetailsId", "setProductDetailsId", "getProductImageUrl", "setProductImageUrl", "getQty", "()Ljava/lang/Integer;", "setQty", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRecommendedQty", "setRecommendedQty", "getReplacedSavingPercentage", "()Ljava/lang/Double;", "setReplacedSavingPercentage", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getSellingPrice", "setSellingPrice", "getShowRemove", "()Ljava/lang/Boolean;", "setShowRemove", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShowRemoved", "setShowRemoved", "getSkuName", "setSkuName", "getSubsFound", "setSubsFound", "getSubsSavingPercentage", "setSubsSavingPercentage", "getSuppliedByTm", "setSuppliedByTm", "getSwitchBackAvailability", "setSwitchBackAvailability", "getSwitchBackAvailabilityStatus", "setSwitchBackAvailabilityStatus", "getSwitchBackImageUrl", "setSwitchBackImageUrl", "getSwitchBackProductCode", "setSwitchBackProductCode", "getSwitchBackSkuName", "setSwitchBackSkuName", "getUnit", "setUnit", "getUsersAlsoBoughtCount", "setUsersAlsoBoughtCount", "getUsersAlsoBoughtMessage", "setUsersAlsoBoughtMessage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;IDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZILjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/intellihealth/salt/constants/FWPCWarningConstants;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/model/Product;", "equals", "other", "hashCode", "productAsCartItem", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "isFromAPI", "addedQty", "toSdkObject", "Lcom/intellihealth/salt/models/ProductInfoModel$Product;", "toString", "app_prodDebug"})
public final class Product {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long productDetailsId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long prevOrderId;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long prevOrgProductId = null;
    @com.google.gson.annotations.SerializedName(value = "productCode")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String productCode;
    @com.google.gson.annotations.SerializedName(value = "skuName")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String skuName;
    @com.google.gson.annotations.SerializedName(value = "availabilityStatus")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String availabilityStatus;
    @com.google.gson.annotations.SerializedName(value = "availabilityMessage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String availabilityMessage;
    @com.google.gson.annotations.SerializedName(value = "available")
    private boolean isAvailable;
    @com.google.gson.annotations.SerializedName(value = "suppliedByTm")
    private boolean suppliedByTm;
    @com.google.gson.annotations.SerializedName(value = "manufacturerName")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String manufacturerName;
    @com.google.gson.annotations.SerializedName(value = "maxCappedQty")
    private int maxCappedQty;
    @com.google.gson.annotations.SerializedName(value = "mrp")
    private double mrp;
    @com.google.gson.annotations.SerializedName(value = "sellingPrice")
    private double sellingPrice;
    @com.google.gson.annotations.SerializedName(value = "discount")
    private double discount;
    @com.google.gson.annotations.SerializedName(value = "packSize")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String packSize;
    @com.google.gson.annotations.SerializedName(value = "unit")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String unit;
    @com.google.gson.annotations.SerializedName(value = "packForm")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String packForm;
    @com.google.gson.annotations.SerializedName(value = "pricePerUnitLabel")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pricePerUnitLabel;
    @com.google.gson.annotations.SerializedName(value = "productImageUrl")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productImageUrl;
    @com.google.gson.annotations.SerializedName(value = "qty")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer qty;
    @com.google.gson.annotations.SerializedName(value = "composition")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String composition;
    @com.google.gson.annotations.SerializedName(value = "subsSavingPercentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsSavingPercentage;
    @com.google.gson.annotations.SerializedName(value = "coldStorage")
    private boolean coldStorage;
    @com.google.gson.annotations.SerializedName(value = "drugType")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String drugType;
    @com.google.gson.annotations.SerializedName(value = "cxAcceptedSubs")
    private boolean cxAcceptedSubs;
    @com.google.gson.annotations.SerializedName(value = "cxKeepOriginal")
    private boolean cxKeepOriginal;
    @com.google.gson.annotations.SerializedName(value = "switchBackSkuName")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String switchBackSkuName;
    @com.google.gson.annotations.SerializedName(value = "switchBackProductCode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String switchBackProductCode;
    @com.google.gson.annotations.SerializedName(value = "switchBackImageUrl")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String switchBackImageUrl;
    @com.google.gson.annotations.SerializedName(value = "preSubsSkuName")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String preSubsSkuName;
    @com.google.gson.annotations.SerializedName(value = "preSubsProductCode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String preSubsProductCode;
    @com.google.gson.annotations.SerializedName(value = "prevSubsAvailabilityMessage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String prevSubsAvailabilityMessage;
    @com.google.gson.annotations.SerializedName(value = "highlightedInfo")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> highlightedInfo;
    @com.google.gson.annotations.SerializedName(value = "usersAlsoBoughtMessage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usersAlsoBoughtMessage;
    @com.google.gson.annotations.SerializedName(value = "subsFound")
    private boolean subsFound;
    @com.google.gson.annotations.SerializedName(value = "usersAlsoBoughtCount")
    private int usersAlsoBoughtCount;
    @com.google.gson.annotations.SerializedName(value = "replacedSavingPercentage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double replacedSavingPercentage;
    @com.google.gson.annotations.SerializedName(value = "manufacturerAddr")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String manufacturerAddr;
    @com.google.gson.annotations.SerializedName(value = "recommendedQty")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer recommendedQty;
    @com.google.gson.annotations.SerializedName(value = "switchBackAvailability")
    private boolean switchBackAvailability;
    @com.google.gson.annotations.SerializedName(value = "switchBackAvailabilityStatus")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String switchBackAvailabilityStatus;
    @com.google.gson.annotations.SerializedName(value = "chronic")
    private boolean isChronic;
    @com.google.gson.annotations.SerializedName(value = "otc")
    private boolean isOtc;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgSubsSkuName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String customerAlsoBoughtMsg;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.salt.models.PriceInfo> priceInfoDto;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean showRemove;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean showRemoved;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.constants.FWPCWarningConstants availabilityStatusWarning;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String motherBrand;
    
    public Product(@org.jetbrains.annotations.Nullable()
    java.lang.Long productDetailsId, @org.jetbrains.annotations.Nullable()
    java.lang.Long prevOrderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long prevOrgProductId, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.String skuName, @org.jetbrains.annotations.Nullable()
    java.lang.String availabilityStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String availabilityMessage, boolean isAvailable, boolean suppliedByTm, @org.jetbrains.annotations.Nullable()
    java.lang.String manufacturerName, int maxCappedQty, double mrp, double sellingPrice, double discount, @org.jetbrains.annotations.Nullable()
    java.lang.String packSize, @org.jetbrains.annotations.Nullable()
    java.lang.String unit, @org.jetbrains.annotations.Nullable()
    java.lang.String packForm, @org.jetbrains.annotations.Nullable()
    java.lang.String pricePerUnitLabel, @org.jetbrains.annotations.Nullable()
    java.lang.String productImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer qty, @org.jetbrains.annotations.Nullable()
    java.lang.String composition, @org.jetbrains.annotations.Nullable()
    java.lang.String subsSavingPercentage, boolean coldStorage, @org.jetbrains.annotations.Nullable()
    java.lang.String drugType, boolean cxAcceptedSubs, boolean cxKeepOriginal, @org.jetbrains.annotations.Nullable()
    java.lang.String switchBackSkuName, @org.jetbrains.annotations.Nullable()
    java.lang.String switchBackProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String switchBackImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String preSubsSkuName, @org.jetbrains.annotations.Nullable()
    java.lang.String preSubsProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String prevSubsAvailabilityMessage, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> highlightedInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String usersAlsoBoughtMessage, boolean subsFound, int usersAlsoBoughtCount, @org.jetbrains.annotations.Nullable()
    java.lang.Double replacedSavingPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String manufacturerAddr, @org.jetbrains.annotations.Nullable()
    java.lang.Integer recommendedQty, boolean switchBackAvailability, @org.jetbrains.annotations.Nullable()
    java.lang.String switchBackAvailabilityStatus, boolean isChronic, boolean isOtc, @org.jetbrains.annotations.Nullable()
    java.lang.String orgSubsSkuName, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String customerAlsoBoughtMsg, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.salt.models.PriceInfo> priceInfoDto, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean showRemove, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean showRemoved, @org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.constants.FWPCWarningConstants availabilityStatusWarning, @org.jetbrains.annotations.Nullable()
    java.lang.String motherBrand) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getProductDetailsId() {
        return null;
    }
    
    public final void setProductDetailsId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPrevOrderId() {
        return null;
    }
    
    public final void setPrevOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPrevOrgProductId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductCode() {
        return null;
    }
    
    public final void setProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSkuName() {
        return null;
    }
    
    public final void setSkuName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvailabilityStatus() {
        return null;
    }
    
    public final void setAvailabilityStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvailabilityMessage() {
        return null;
    }
    
    public final void setAvailabilityMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isAvailable() {
        return false;
    }
    
    public final void setAvailable(boolean p0) {
    }
    
    public final boolean getSuppliedByTm() {
        return false;
    }
    
    public final void setSuppliedByTm(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getManufacturerName() {
        return null;
    }
    
    public final void setManufacturerName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getMaxCappedQty() {
        return 0;
    }
    
    public final void setMaxCappedQty(int p0) {
    }
    
    public final double getMrp() {
        return 0.0;
    }
    
    public final void setMrp(double p0) {
    }
    
    public final double getSellingPrice() {
        return 0.0;
    }
    
    public final void setSellingPrice(double p0) {
    }
    
    public final double getDiscount() {
        return 0.0;
    }
    
    public final void setDiscount(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackSize() {
        return null;
    }
    
    public final void setPackSize(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUnit() {
        return null;
    }
    
    public final void setUnit(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackForm() {
        return null;
    }
    
    public final void setPackForm(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPricePerUnitLabel() {
        return null;
    }
    
    public final void setPricePerUnitLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductImageUrl() {
        return null;
    }
    
    public final void setProductImageUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getQty() {
        return null;
    }
    
    public final void setQty(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComposition() {
        return null;
    }
    
    public final void setComposition(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsSavingPercentage() {
        return null;
    }
    
    public final void setSubsSavingPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getColdStorage() {
        return false;
    }
    
    public final void setColdStorage(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDrugType() {
        return null;
    }
    
    public final void setDrugType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getCxAcceptedSubs() {
        return false;
    }
    
    public final void setCxAcceptedSubs(boolean p0) {
    }
    
    public final boolean getCxKeepOriginal() {
        return false;
    }
    
    public final void setCxKeepOriginal(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSwitchBackSkuName() {
        return null;
    }
    
    public final void setSwitchBackSkuName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSwitchBackProductCode() {
        return null;
    }
    
    public final void setSwitchBackProductCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSwitchBackImageUrl() {
        return null;
    }
    
    public final void setSwitchBackImageUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreSubsSkuName() {
        return null;
    }
    
    public final void setPreSubsSkuName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreSubsProductCode() {
        return null;
    }
    
    public final void setPreSubsProductCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrevSubsAvailabilityMessage() {
        return null;
    }
    
    public final void setPrevSubsAvailabilityMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getHighlightedInfo() {
        return null;
    }
    
    public final void setHighlightedInfo(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsersAlsoBoughtMessage() {
        return null;
    }
    
    public final void setUsersAlsoBoughtMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getSubsFound() {
        return false;
    }
    
    public final void setSubsFound(boolean p0) {
    }
    
    public final int getUsersAlsoBoughtCount() {
        return 0;
    }
    
    public final void setUsersAlsoBoughtCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getReplacedSavingPercentage() {
        return null;
    }
    
    public final void setReplacedSavingPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getManufacturerAddr() {
        return null;
    }
    
    public final void setManufacturerAddr(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRecommendedQty() {
        return null;
    }
    
    public final void setRecommendedQty(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getSwitchBackAvailability() {
        return false;
    }
    
    public final void setSwitchBackAvailability(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSwitchBackAvailabilityStatus() {
        return null;
    }
    
    public final void setSwitchBackAvailabilityStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isChronic() {
        return false;
    }
    
    public final void setChronic(boolean p0) {
    }
    
    public final boolean isOtc() {
        return false;
    }
    
    public final void setOtc(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgSubsSkuName() {
        return null;
    }
    
    public final void setOrgSubsSkuName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrgProductCode() {
        return null;
    }
    
    public final void setOrgProductCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerAlsoBoughtMsg() {
        return null;
    }
    
    public final void setCustomerAlsoBoughtMsg(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.salt.models.PriceInfo> getPriceInfoDto() {
        return null;
    }
    
    public final void setPriceInfoDto(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.salt.models.PriceInfo> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getShowRemove() {
        return null;
    }
    
    public final void setShowRemove(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getShowRemoved() {
        return null;
    }
    
    public final void setShowRemoved(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.constants.FWPCWarningConstants getAvailabilityStatusWarning() {
        return null;
    }
    
    public final void setAvailabilityStatusWarning(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.constants.FWPCWarningConstants p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMotherBrand() {
        return null;
    }
    
    public final void setMotherBrand(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.ProductInfoModel.Product toSdkObject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine productAsCartItem(boolean isFromAPI, int addedQty) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
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
    public final java.lang.String component17() {
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
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    public final boolean component23() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    public final boolean component25() {
        return false;
    }
    
    public final boolean component26() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
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
    public final java.lang.Long component3() {
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
    public final java.util.List<java.lang.String> component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component34() {
        return null;
    }
    
    public final boolean component35() {
        return false;
    }
    
    public final int component36() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component40() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component41() {
        return null;
    }
    
    public final boolean component42() {
        return false;
    }
    
    public final boolean component43() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
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
    public final java.util.List<com.intellihealth.salt.models.PriceInfo> component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.constants.FWPCWarningConstants component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.Product copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long productDetailsId, @org.jetbrains.annotations.Nullable()
    java.lang.Long prevOrderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long prevOrgProductId, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.String skuName, @org.jetbrains.annotations.Nullable()
    java.lang.String availabilityStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String availabilityMessage, boolean isAvailable, boolean suppliedByTm, @org.jetbrains.annotations.Nullable()
    java.lang.String manufacturerName, int maxCappedQty, double mrp, double sellingPrice, double discount, @org.jetbrains.annotations.Nullable()
    java.lang.String packSize, @org.jetbrains.annotations.Nullable()
    java.lang.String unit, @org.jetbrains.annotations.Nullable()
    java.lang.String packForm, @org.jetbrains.annotations.Nullable()
    java.lang.String pricePerUnitLabel, @org.jetbrains.annotations.Nullable()
    java.lang.String productImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer qty, @org.jetbrains.annotations.Nullable()
    java.lang.String composition, @org.jetbrains.annotations.Nullable()
    java.lang.String subsSavingPercentage, boolean coldStorage, @org.jetbrains.annotations.Nullable()
    java.lang.String drugType, boolean cxAcceptedSubs, boolean cxKeepOriginal, @org.jetbrains.annotations.Nullable()
    java.lang.String switchBackSkuName, @org.jetbrains.annotations.Nullable()
    java.lang.String switchBackProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String switchBackImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String preSubsSkuName, @org.jetbrains.annotations.Nullable()
    java.lang.String preSubsProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String prevSubsAvailabilityMessage, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> highlightedInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String usersAlsoBoughtMessage, boolean subsFound, int usersAlsoBoughtCount, @org.jetbrains.annotations.Nullable()
    java.lang.Double replacedSavingPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String manufacturerAddr, @org.jetbrains.annotations.Nullable()
    java.lang.Integer recommendedQty, boolean switchBackAvailability, @org.jetbrains.annotations.Nullable()
    java.lang.String switchBackAvailabilityStatus, boolean isChronic, boolean isOtc, @org.jetbrains.annotations.Nullable()
    java.lang.String orgSubsSkuName, @org.jetbrains.annotations.Nullable()
    java.lang.String orgProductCode, @org.jetbrains.annotations.Nullable()
    java.lang.String customerAlsoBoughtMsg, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.salt.models.PriceInfo> priceInfoDto, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean showRemove, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean showRemoved, @org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.constants.FWPCWarningConstants availabilityStatusWarning, @org.jetbrains.annotations.Nullable()
    java.lang.String motherBrand) {
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