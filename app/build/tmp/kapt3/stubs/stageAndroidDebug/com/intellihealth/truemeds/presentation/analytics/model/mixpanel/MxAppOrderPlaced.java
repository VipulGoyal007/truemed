package com.intellihealth.truemeds.presentation.analytics.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0003\b\u00cc\u0001\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00ef\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\u0012\b\u0002\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e\u0012\u0012\b\u0002\u0010\'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d\u0012\b\b\u0002\u0010(\u001a\u00020\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00105\u001a\u00020\u000e\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010<J\f\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\u0011\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\f\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\tH\u00c6\u0003J\f\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\tH\u00c6\u0003J\u0014\u0010\u00be\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001dH\u00c6\u0003J\u0011\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010_J\f\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010_J\u0011\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010_J\f\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010_J\u0014\u0010\u00c9\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001dH\u00c6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\tH\u00c6\u0003J\u0011\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\f\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010_J\f\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\f\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\f\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u00d8\u0001\u001a\u00020\u000eH\u00c6\u0003J\f\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010fJ\n\u0010\u00dc\u0001\u001a\u00020\tH\u00c6\u0003J\u0012\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0003\u0010\u0094\u0001J\u0011\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\f\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0011\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010_J\u00fc\u0004\u0010\u00e4\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\u0012\b\u0002\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e2\u0012\b\u0002\u0010\'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d2\b\b\u0002\u0010(\u001a\u00020\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00105\u001a\u00020\u000e2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00e5\u0001J\u0015\u0010\u00e6\u0001\u001a\u00020\t2\t\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00e8\u0001\u001a\u00020\u000eH\u00d6\u0001J\u0014\u0010\u00e9\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00ea\u0001J\b\u0010\u00eb\u0001\u001a\u00030\u00ec\u0001J\b\u0010\u00ed\u0001\u001a\u00030\u00ee\u0001J\n\u0010\u00ef\u0001\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\"\u0010:\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010;\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010>\"\u0004\bK\u0010@R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bL\u0010D\"\u0004\bM\u0010FR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bR\u0010D\"\u0004\bS\u0010FR\"\u00102\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bT\u0010D\"\u0004\bU\u0010FR\"\u00101\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bV\u0010D\"\u0004\bW\u0010FR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010>\"\u0004\bY\u0010@R\u0011\u00105\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\b\\\u0010D\"\u0004\b]\u0010FR\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010b\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bc\u0010D\"\u0004\bd\u0010FR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010i\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\bj\u0010D\"\u0004\bk\u0010FR \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010>\"\u0004\bm\u0010@R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010>\"\u0004\bo\u0010@R\u001e\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010O\"\u0004\bp\u0010QR\u001e\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010O\"\u0004\bq\u0010QR\u001e\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010O\"\u0004\br\u0010QR\u001e\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010O\"\u0004\bs\u0010QR\u001e\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010O\"\u0004\bt\u0010QR\u001e\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010O\"\u0004\bu\u0010QR\u001e\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010O\"\u0004\bv\u0010QR(\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010G\u001a\u0004\b{\u0010D\"\u0004\b|\u0010FR\"\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010b\u001a\u0004\b}\u0010_\"\u0004\b~\u0010aR!\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010>\"\u0005\b\u0080\u0001\u0010@R$\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010b\u001a\u0005\b\u0081\u0001\u0010_\"\u0005\b\u0082\u0001\u0010aR$\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010G\u001a\u0005\b\u0083\u0001\u0010D\"\u0005\b\u0084\u0001\u0010FR\"\u00107\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010>\"\u0005\b\u0086\u0001\u0010@R$\u0010#\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010b\u001a\u0005\b\u0087\u0001\u0010_\"\u0005\b\u0088\u0001\u0010aR\"\u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010>\"\u0005\b\u008a\u0001\u0010@R\"\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010>\"\u0005\b\u008c\u0001\u0010@R$\u0010&\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010b\u001a\u0005\b\u008d\u0001\u0010_\"\u0005\b\u008e\u0001\u0010aR\"\u00106\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010>\"\u0005\b\u0090\u0001\u0010@R*\u0010\'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010x\"\u0005\b\u0092\u0001\u0010zR\'\u00109\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0015\n\u0003\u0010\u0097\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\"\u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010>\"\u0005\b\u0099\u0001\u0010@R\"\u00104\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010>\"\u0005\b\u009b\u0001\u0010@R \u0010(\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010O\"\u0005\b\u009d\u0001\u0010QR$\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010G\u001a\u0005\b\u009e\u0001\u0010D\"\u0005\b\u009f\u0001\u0010FR\"\u0010*\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010>\"\u0005\b\u00a1\u0001\u0010@R$\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010b\u001a\u0005\b\u00a2\u0001\u0010_\"\u0005\b\u00a3\u0001\u0010aR\"\u0010,\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a4\u0001\u0010>\"\u0005\b\u00a5\u0001\u0010@R\"\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0001\u0010>\"\u0005\b\u00a7\u0001\u0010@R$\u0010.\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010G\u001a\u0005\b\u00a8\u0001\u0010D\"\u0005\b\u00a9\u0001\u0010FR$\u0010/\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010G\u001a\u0005\b\u00aa\u0001\u0010D\"\u0005\b\u00ab\u0001\u0010FR$\u00108\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0002\u0010i\u001a\u0005\b\u00ac\u0001\u0010f\"\u0005\b\u00ad\u0001\u0010hR\"\u00100\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ae\u0001\u0010>\"\u0005\b\u00af\u0001\u0010@\u00a8\u0006\u00f0\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAppOrderPlaced;", "", "addressType", "", "appliedCouponName", "clickedOnPage", "codOrdervalueDifference", "", "couponApplied", "", "couponDiscountAmount", "crossSellingTraysUsed", "deliveryChargeAmount", "deliveryDays", "", "discountAmount", "discountVariantId", "", "estimatedPayableAmount", "experimentList", "gender", "isChronic", "isCodDefaulter", "isCrossSellingItemPresent", "isGeneric", "isOtc", "isReorder", "isTmContactSaved", "itemNames", "", "mrp", "noOfItem", "orderId", "outOfStockNo", "packagingChargeAmount", "patientAge", "patientType", "paymentMethod", "prescriptionUploadedCount", "productsIds", "rxRequired", "salesPrice", "shippingCity", "shippingPincode", "shippingState", "subsId", "tmCreditAmount", "tmRewardAmount", "whId", "crossSellingTotalSellingPrice", "crossSellingTotalMrp", "reorderPatientName", "reorderType", "cxAcceptedSubsCount", "previousStage", "pageSection", "urgencyTimeRemaining", "reorderCrossSelling", "cashHandlingCharge", "cashHandlingChargeApplicable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "getAppliedCouponName", "setAppliedCouponName", "getCashHandlingCharge", "()Ljava/lang/Double;", "setCashHandlingCharge", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCashHandlingChargeApplicable", "setCashHandlingChargeApplicable", "getClickedOnPage", "setClickedOnPage", "getCodOrdervalueDifference", "setCodOrdervalueDifference", "getCouponApplied", "()Z", "setCouponApplied", "(Z)V", "getCouponDiscountAmount", "setCouponDiscountAmount", "getCrossSellingTotalMrp", "setCrossSellingTotalMrp", "getCrossSellingTotalSellingPrice", "setCrossSellingTotalSellingPrice", "getCrossSellingTraysUsed", "setCrossSellingTraysUsed", "getCxAcceptedSubsCount", "()I", "getDeliveryChargeAmount", "setDeliveryChargeAmount", "getDeliveryDays", "()Ljava/lang/Integer;", "setDeliveryDays", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDiscountAmount", "setDiscountAmount", "getDiscountVariantId", "()Ljava/lang/Long;", "setDiscountVariantId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEstimatedPayableAmount", "setEstimatedPayableAmount", "getExperimentList", "setExperimentList", "getGender", "setGender", "setChronic", "setCodDefaulter", "setCrossSellingItemPresent", "setGeneric", "setOtc", "setReorder", "setTmContactSaved", "getItemNames", "()Ljava/util/List;", "setItemNames", "(Ljava/util/List;)V", "getMrp", "setMrp", "getNoOfItem", "setNoOfItem", "getOrderId", "setOrderId", "getOutOfStockNo", "setOutOfStockNo", "getPackagingChargeAmount", "setPackagingChargeAmount", "getPageSection", "setPageSection", "getPatientAge", "setPatientAge", "getPatientType", "setPatientType", "getPaymentMethod", "setPaymentMethod", "getPrescriptionUploadedCount", "setPrescriptionUploadedCount", "getPreviousStage", "setPreviousStage", "getProductsIds", "setProductsIds", "getReorderCrossSelling", "()Ljava/lang/Boolean;", "setReorderCrossSelling", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getReorderPatientName", "setReorderPatientName", "getReorderType", "setReorderType", "getRxRequired", "setRxRequired", "getSalesPrice", "setSalesPrice", "getShippingCity", "setShippingCity", "getShippingPincode", "setShippingPincode", "getShippingState", "setShippingState", "getSubsId", "setSubsId", "getTmCreditAmount", "setTmCreditAmount", "getTmRewardAmount", "setTmRewardAmount", "getUrgencyTimeRemaining", "setUrgencyTimeRemaining", "getWhId", "setWhId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAppOrderPlaced;", "equals", "other", "hashCode", "toAppsFlyer", "", "toCleverTap", "Lcom/intellihealth/truemeds/data/model/clevertap/CtAppOrderPlaced;", "toFireBase", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FbPurchaseEvent;", "toString", "app_stageAndroidDebug"})
public final class MxAppOrderPlaced {
    @com.google.gson.annotations.SerializedName(value = "address_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addressType;
    @com.google.gson.annotations.SerializedName(value = "applied_coupon_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String appliedCouponName;
    @com.google.gson.annotations.SerializedName(value = "clicked_on_page")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @com.google.gson.annotations.SerializedName(value = "cod_order_value_difference")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double codOrdervalueDifference;
    @com.google.gson.annotations.SerializedName(value = "coupon_applied")
    private boolean couponApplied;
    @com.google.gson.annotations.SerializedName(value = "coupon_discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscountAmount;
    @com.google.gson.annotations.SerializedName(value = "cross_selling_trays_used")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String crossSellingTraysUsed;
    @com.google.gson.annotations.SerializedName(value = "delivery_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double deliveryChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "delivery_days")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer deliveryDays;
    @com.google.gson.annotations.SerializedName(value = "discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discountAmount;
    @com.google.gson.annotations.SerializedName(value = "discount_variant_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long discountVariantId;
    @com.google.gson.annotations.SerializedName(value = "estimated_payable_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double estimatedPayableAmount;
    @com.google.gson.annotations.SerializedName(value = "experiment_list")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String experimentList;
    @com.google.gson.annotations.SerializedName(value = "gender")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String gender;
    @com.google.gson.annotations.SerializedName(value = "is_chronic")
    private boolean isChronic;
    @com.google.gson.annotations.SerializedName(value = "is_cod_defaulter")
    private boolean isCodDefaulter;
    @com.google.gson.annotations.SerializedName(value = "is_cross_selling_item_present")
    private boolean isCrossSellingItemPresent;
    @com.google.gson.annotations.SerializedName(value = "is_generic")
    private boolean isGeneric;
    @com.google.gson.annotations.SerializedName(value = "is_otc")
    private boolean isOtc;
    @com.google.gson.annotations.SerializedName(value = "is_reorder")
    private boolean isReorder;
    @com.google.gson.annotations.SerializedName(value = "is_tm_contact_saved")
    private boolean isTmContactSaved;
    @com.google.gson.annotations.SerializedName(value = "item_names")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> itemNames;
    @com.google.gson.annotations.SerializedName(value = "mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrp;
    @com.google.gson.annotations.SerializedName(value = "no_of_item")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer noOfItem;
    @com.google.gson.annotations.SerializedName(value = "order_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderId;
    @com.google.gson.annotations.SerializedName(value = "out_of_stock_no")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer outOfStockNo;
    @com.google.gson.annotations.SerializedName(value = "packaging_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double packagingChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "patient_age")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer patientAge;
    @com.google.gson.annotations.SerializedName(value = "patient_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String patientType;
    @com.google.gson.annotations.SerializedName(value = "payment_method")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMethod;
    @com.google.gson.annotations.SerializedName(value = "prescription_uploaded_count")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer prescriptionUploadedCount;
    @com.google.gson.annotations.SerializedName(value = "products_ids")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> productsIds;
    @com.google.gson.annotations.SerializedName(value = "rx_required")
    private boolean rxRequired;
    @com.google.gson.annotations.SerializedName(value = "sales_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double salesPrice;
    @com.google.gson.annotations.SerializedName(value = "shipping_city")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shippingCity;
    @com.google.gson.annotations.SerializedName(value = "shipping_pincode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer shippingPincode;
    @com.google.gson.annotations.SerializedName(value = "shipping_state")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shippingState;
    @com.google.gson.annotations.SerializedName(value = "subs_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsId;
    @com.google.gson.annotations.SerializedName(value = "tm_credit_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmCreditAmount;
    @com.google.gson.annotations.SerializedName(value = "tm_reward_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double tmRewardAmount;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    @com.google.gson.annotations.SerializedName(value = "cross_selling_total_selling_price")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double crossSellingTotalSellingPrice;
    @com.google.gson.annotations.SerializedName(value = "cross_selling_total_mrp")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double crossSellingTotalMrp;
    @com.google.gson.annotations.SerializedName(value = "reorder_patient_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String reorderPatientName;
    @com.google.gson.annotations.SerializedName(value = "type_of_reorder")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String reorderType;
    private final int cxAcceptedSubsCount = 0;
    @com.google.gson.annotations.SerializedName(value = "previous_stage")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String previousStage;
    @com.google.gson.annotations.SerializedName(value = "page_section")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pageSection;
    @com.google.gson.annotations.SerializedName(value = "urgency_time_remaining")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long urgencyTimeRemaining;
    @com.google.gson.annotations.SerializedName(value = "reorder_cross_selling")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean reorderCrossSelling;
    @com.google.gson.annotations.SerializedName(value = "cash_handling_charge")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingCharge;
    @com.google.gson.annotations.SerializedName(value = "cash_handling_charge_applicable")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingChargeApplicable;
    
    public MxAppOrderPlaced(@org.jetbrains.annotations.Nullable()
    java.lang.String addressType, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponName, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.Double codOrdervalueDifference, boolean couponApplied, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String crossSellingTraysUsed, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer deliveryDays, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Long discountVariantId, @org.jetbrains.annotations.Nullable()
    java.lang.Double estimatedPayableAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String experimentList, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, boolean isChronic, boolean isCodDefaulter, boolean isCrossSellingItemPresent, boolean isGeneric, boolean isOtc, boolean isReorder, boolean isTmContactSaved, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfItem, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer outOfStockNo, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String patientType, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prescriptionUploadedCount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productsIds, boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Double salesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingCity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer shippingPincode, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingState, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.Double crossSellingTotalSellingPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double crossSellingTotalMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String reorderPatientName, @org.jetbrains.annotations.Nullable()
    java.lang.String reorderType, int cxAcceptedSubsCount, @org.jetbrains.annotations.Nullable()
    java.lang.String previousStage, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.Long urgencyTimeRemaining, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reorderCrossSelling, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingChargeApplicable) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppliedCouponName() {
        return null;
    }
    
    public final void setAppliedCouponName(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Double getCodOrdervalueDifference() {
        return null;
    }
    
    public final void setCodOrdervalueDifference(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public final boolean getCouponApplied() {
        return false;
    }
    
    public final void setCouponApplied(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCouponDiscountAmount() {
        return null;
    }
    
    public final void setCouponDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCrossSellingTraysUsed() {
        return null;
    }
    
    public final void setCrossSellingTraysUsed(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDeliveryChargeAmount() {
        return null;
    }
    
    public final void setDeliveryChargeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDeliveryDays() {
        return null;
    }
    
    public final void setDeliveryDays(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDiscountAmount() {
        return null;
    }
    
    public final void setDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDiscountVariantId() {
        return null;
    }
    
    public final void setDiscountVariantId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getEstimatedPayableAmount() {
        return null;
    }
    
    public final void setEstimatedPayableAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExperimentList() {
        return null;
    }
    
    public final void setExperimentList(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isChronic() {
        return false;
    }
    
    public final void setChronic(boolean p0) {
    }
    
    public final boolean isCodDefaulter() {
        return false;
    }
    
    public final void setCodDefaulter(boolean p0) {
    }
    
    public final boolean isCrossSellingItemPresent() {
        return false;
    }
    
    public final void setCrossSellingItemPresent(boolean p0) {
    }
    
    public final boolean isGeneric() {
        return false;
    }
    
    public final void setGeneric(boolean p0) {
    }
    
    public final boolean isOtc() {
        return false;
    }
    
    public final void setOtc(boolean p0) {
    }
    
    public final boolean isReorder() {
        return false;
    }
    
    public final void setReorder(boolean p0) {
    }
    
    public final boolean isTmContactSaved() {
        return false;
    }
    
    public final void setTmContactSaved(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getItemNames() {
        return null;
    }
    
    public final void setItemNames(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrp() {
        return null;
    }
    
    public final void setMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNoOfItem() {
        return null;
    }
    
    public final void setNoOfItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOutOfStockNo() {
        return null;
    }
    
    public final void setOutOfStockNo(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPackagingChargeAmount() {
        return null;
    }
    
    public final void setPackagingChargeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPatientAge() {
        return null;
    }
    
    public final void setPatientAge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientType() {
        return null;
    }
    
    public final void setPatientType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrescriptionUploadedCount() {
        return null;
    }
    
    public final void setPrescriptionUploadedCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getProductsIds() {
        return null;
    }
    
    public final void setProductsIds(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean getRxRequired() {
        return false;
    }
    
    public final void setRxRequired(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSalesPrice() {
        return null;
    }
    
    public final void setSalesPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingCity() {
        return null;
    }
    
    public final void setShippingCity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getShippingPincode() {
        return null;
    }
    
    public final void setShippingPincode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingState() {
        return null;
    }
    
    public final void setShippingState(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsId() {
        return null;
    }
    
    public final void setSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCrossSellingTotalSellingPrice() {
        return null;
    }
    
    public final void setCrossSellingTotalSellingPrice(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCrossSellingTotalMrp() {
        return null;
    }
    
    public final void setCrossSellingTotalMrp(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReorderPatientName() {
        return null;
    }
    
    public final void setReorderPatientName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReorderType() {
        return null;
    }
    
    public final void setReorderType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getCxAcceptedSubsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreviousStage() {
        return null;
    }
    
    public final void setPreviousStage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUrgencyTimeRemaining() {
        return null;
    }
    
    public final void setUrgencyTimeRemaining(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getReorderCrossSelling() {
        return null;
    }
    
    public final void setReorderCrossSelling(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingCharge() {
        return null;
    }
    
    public final void setCashHandlingCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingChargeApplicable() {
        return null;
    }
    
    public final void setCashHandlingChargeApplicable(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.clevertap.CtAppOrderPlaced toCleverTap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> toAppsFlyer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.firebase.FbPurchaseEvent toFireBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component11() {
        return null;
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
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean component19() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final boolean component21() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component27() {
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
    public final java.lang.String component3() {
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
    public final java.util.List<java.lang.String> component32() {
        return null;
    }
    
    public final boolean component33() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component36() {
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
    public final java.lang.Double component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component45() {
        return null;
    }
    
    public final int component46() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component49() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component52() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAppOrderPlaced copy(@org.jetbrains.annotations.Nullable()
    java.lang.String addressType, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponName, @org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.Double codOrdervalueDifference, boolean couponApplied, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String crossSellingTraysUsed, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer deliveryDays, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Long discountVariantId, @org.jetbrains.annotations.Nullable()
    java.lang.Double estimatedPayableAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String experimentList, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, boolean isChronic, boolean isCodDefaulter, boolean isCrossSellingItemPresent, boolean isGeneric, boolean isOtc, boolean isReorder, boolean isTmContactSaved, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfItem, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer outOfStockNo, @org.jetbrains.annotations.Nullable()
    java.lang.Double packagingChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String patientType, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prescriptionUploadedCount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productsIds, boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Double salesPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingCity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer shippingPincode, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingState, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.Double crossSellingTotalSellingPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Double crossSellingTotalMrp, @org.jetbrains.annotations.Nullable()
    java.lang.String reorderPatientName, @org.jetbrains.annotations.Nullable()
    java.lang.String reorderType, int cxAcceptedSubsCount, @org.jetbrains.annotations.Nullable()
    java.lang.String previousStage, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.Long urgencyTimeRemaining, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reorderCrossSelling, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingCharge, @org.jetbrains.annotations.Nullable()
    java.lang.Double cashHandlingChargeApplicable) {
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