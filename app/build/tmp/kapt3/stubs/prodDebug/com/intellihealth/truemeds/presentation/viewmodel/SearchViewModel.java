package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ee\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 \u00bb\u00032\u00020\u00012\u00020\u0002:\u0002\u00bb\u0003B1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\'\u0010\u00d4\u0002\u001a\u00030\u00d5\u00022\b\u0010\u00d6\u0002\u001a\u00030\u008e\u00022\t\b\u0002\u0010\u00d7\u0002\u001a\u00020m2\b\u0010\u00d8\u0002\u001a\u00030\u0095\u0001J\u0011\u0010\u00d9\u0002\u001a\u00030\u00c7\u00022\u0007\u0010\u00da\u0002\u001a\u00020\u000fJ\u0013\u0010\u00db\u0002\u001a\u00030\u00d5\u00022\t\u0010\u00dc\u0002\u001a\u0004\u0018\u00010MJ\u0011\u0010\u00dd\u0002\u001a\u00030\u00c7\u00022\u0007\u0010\u00de\u0002\u001a\u000200J\u001c\u0010\u00df\u0002\u001a\u00030\u00d5\u00022\t\u0010\u00dc\u0002\u001a\u0004\u0018\u00010M2\u0007\u0010\u00e0\u0002\u001a\u00020\u001fJ\n\u0010\u00e1\u0002\u001a\u00030\u00d5\u0002H\u0002J\u001b\u0010\u00e2\u0002\u001a\u00020m2\u0007\u0010\u00e3\u0002\u001a\u00020\u000f2\u0007\u0010\u00e4\u0002\u001a\u00020\u000fH\u0002J\u0012\u0010\u00e5\u0002\u001a\u00020m2\u0007\u0010\u00e6\u0002\u001a\u00020\u000fH\u0002J\u0012\u0010\u00e7\u0002\u001a\u00020m2\u0007\u0010\u00e6\u0002\u001a\u00020\u000fH\u0002J$\u0010\u00e8\u0002\u001a\u00020m2\u0010\u0010\u00e9\u0002\u001a\u000b\u0012\u0005\u0012\u00030\u00d9\u0001\u0018\u00010a2\u0007\u0010\u00ea\u0002\u001a\u00020\u000fH\u0002J\u0012\u0010\u00eb\u0002\u001a\u00020m2\u0007\u0010\u00e6\u0002\u001a\u00020\u000fH\u0002J\u001a\u0010\u00ec\u0002\u001a\u00030\u00d5\u00022\u0007\u0010\u00e6\u0002\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020mJ5\u0010\u00ed\u0002\u001a\u00030\u00d5\u00022\u0007\u0010\u00de\u0002\u001a\u0002002\u000e\u0010\u00e9\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ee\u00020a2\u0007\u0010\u00ef\u0002\u001a\u00020m2\t\b\u0002\u0010\u00f0\u0002\u001a\u00020\u000fJ\b\u0010\u00f1\u0002\u001a\u00030\u00d5\u0002J\b\u0010\u00f2\u0002\u001a\u00030\u00d5\u0002J\u001e\u0010\u00f3\u0002\u001a\u00030\u00d5\u00022\n\u0010\u00a1\u0002\u001a\u0005\u0018\u00010\u008e\u00022\b\u0010\u00f4\u0002\u001a\u00030\u0095\u0001J\u001e\u0010\u00f5\u0002\u001a\u00030\u00d5\u00022\n\u0010\u00a1\u0002\u001a\u0005\u0018\u00010\u008e\u00022\b\u0010\u00f4\u0002\u001a\u00030\u0095\u0001J\b\u0010\u00f6\u0002\u001a\u00030\u00d5\u0002J)\u0010\u00f7\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ee\u00020a2\u0007\u0010\u00f8\u0002\u001a\u00020m2\u0007\u0010\u00f9\u0002\u001a\u00020mH\u0082@\u00a2\u0006\u0003\u0010\u00fa\u0002J\u0019\u0010\u00fb\u0002\u001a\t\u0012\u0005\u0012\u00030\u00fc\u00020a2\u0007\u0010\u00e6\u0002\u001a\u00020\u000fH\u0002J!\u0010\u00fd\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ee\u00020a2\u0007\u0010\u00e6\u0002\u001a\u00020\u000f2\b\u0010\u00fe\u0002\u001a\u00030\u0095\u0001J\u0017\u0010\u00ff\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u001bH\u0016J\u0011\u0010\u0080\u0003\u001a\u00030\u00d5\u0002H\u0086@\u00a2\u0006\u0003\u0010\u0081\u0003J\u0013\u0010\u0082\u0003\u001a\u00030\u0095\u00012\u0007\u0010\u00e6\u0002\u001a\u00020\u000fH\u0002J\u0013\u0010\u0083\u0003\u001a\u00030\u0095\u00012\u0007\u0010\u00e6\u0002\u001a\u00020\u000fH\u0002J\u0012\u0010\u0084\u0003\u001a\u00020\u000f2\u0007\u0010\u00e6\u0002\u001a\u00020\u000fH\u0002J\t\u0010\u0085\u0003\u001a\u000200H\u0002J\u0013\u0010\u0086\u0003\u001a\u00030\u0087\u00032\u0007\u0010\u0088\u0003\u001a\u00020\u000fH\u0002J,\u0010\u008f\u0002\u001a\u00030\u00d5\u00022\u0007\u0010\u00da\u0002\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000f2\b\u0010\u00f0\u0002\u001a\u00030\u0095\u00012\u0007\u0010\u0089\u0003\u001a\u00020mJ\u0013\u0010\u008a\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u00da\u0002\u001a\u00020\u000fH\u0002J\u0012\u0010\u008b\u0003\u001a\u00020\u000f2\u0007\u0010\u008c\u0003\u001a\u00020\u000fH\u0002J\b\u0010\u008d\u0003\u001a\u00030\u00d5\u0002J\b\u0010\u008e\u0003\u001a\u00030\u00d5\u0002J\u001b\u0010\u008f\u0003\u001a\u00030\u00d5\u00022\u0006\u00105\u001a\u00020\u000f2\u0007\u0010\u0090\u0003\u001a\u00020\u000fH\u0002J\u0012\u0010\u0091\u0003\u001a\u00030\u00d5\u00022\b\u0010\u0092\u0003\u001a\u00030\u00d9\u0001J\u0011\u0010\u00a3\u0001\u001a\u00030\u00d5\u00022\u0007\u0010\u0093\u0003\u001a\u00020BJ\u0011\u0010\u00a5\u0001\u001a\u00030\u00d5\u00022\u0007\u0010\u0093\u0003\u001a\u00020BJ\u0011\u0010\u0094\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u0095\u0003\u001a\u00020mJ\n\u0010\u0096\u0003\u001a\u00030\u00c7\u0002H\u0002J\u0013\u0010\u0097\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u0098\u0003\u001a\u00020\u000fH\u0002J\b\u0010\u0099\u0003\u001a\u00030\u00d5\u0002J\b\u0010\u009a\u0003\u001a\u00030\u00d5\u0002J\b\u0010\u009b\u0003\u001a\u00030\u00d5\u0002J\u0013\u0010\u009c\u0003\u001a\u00030\u00d5\u00022\t\b\u0002\u0010\u009d\u0003\u001a\u00020\u000fJ\u0014\u0010\u009e\u0003\u001a\u00030\u00d5\u00022\b\u0010\u009f\u0003\u001a\u00030\u00a0\u0003H\u0016J\u0011\u0010\u00a1\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u00da\u0002\u001a\u00020\u000fJ\u0018\u0010\u00a2\u0003\u001a\u00030\u00d5\u00022\u000e\u0010\u00a3\u0003\u001a\t\u0012\u0005\u0012\u00030\u008e\u00020aJ\u0013\u0010\u00a4\u0003\u001a\u00030\u00d5\u00022\t\u0010\u00dc\u0002\u001a\u0004\u0018\u00010MJ\n\u0010\u00a5\u0003\u001a\u00030\u00d5\u0002H\u0002J\u0011\u0010\u00a6\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u00a7\u0003\u001a\u000200J\u0013\u0010\u00a8\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u009d\u0003\u001a\u00020\u000fH\u0002J\u0012\u0010\u00a9\u0003\u001a\u00030\u00d5\u00022\b\u0010\u00bc\u0001\u001a\u00030\u00bd\u0001J\u0011\u0010\u00aa\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u00ab\u0003\u001a\u00020\u000fJ\u0013\u0010\u00ac\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u009d\u0003\u001a\u00020\u000fH\u0002J\u0012\u0010\u00ad\u0003\u001a\u00020m2\t\u0010\u00ae\u0003\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u00ad\u0001\u001a\u00030\u00d5\u0002J\b\u0010\u00af\u0003\u001a\u00030\u00d5\u0002J\n\u0010\u00b0\u0003\u001a\u00030\u00c7\u0002H\u0002J\n\u0010\u00b1\u0003\u001a\u00030\u00c7\u0002H\u0002J\n\u0010\u00b2\u0003\u001a\u00030\u00d5\u0002H\u0002J\b\u0010\u00b3\u0003\u001a\u00030\u00d5\u0002J\u001b\u0010\u00b4\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u00e6\u0002\u001a\u00020\u000f2\b\u0010\u00fe\u0002\u001a\u00030\u0095\u0001J\u001a\u0010\u00b5\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u00e6\u0002\u001a\u00020\u000f2\u0007\u0010\u00b6\u0003\u001a\u00020mJ\b\u0010\u00b7\u0003\u001a\u00030\u00d5\u0002J\u0013\u0010\u00b8\u0003\u001a\u00030\u00d5\u00022\t\u0010\u00b9\u0003\u001a\u0004\u0018\u00010MJ\u0011\u0010\u00ba\u0003\u001a\u00030\u00d5\u00022\u0007\u0010\u00b9\u0003\u001a\u00020MR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b\'\u0010\u0013R\u001a\u0010(\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013R\u000e\u0010.\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0011\"\u0004\b7\u0010\u0013R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c098F\u00a2\u0006\u0006\u001a\u0004\b:\u0010;R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c098F\u00a2\u0006\u0006\u001a\u0004\b=\u0010;R\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u001c098F\u00a2\u0006\u0006\u001a\u0004\b@\u0010;R\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u001c098F\u00a2\u0006\u0006\u001a\u0004\bC\u0010;R\u001d\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u001c098F\u00a2\u0006\u0006\u001a\u0004\bE\u0010;R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c098F\u00a2\u0006\u0006\u001a\u0004\bG\u0010;R\u001d\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u001c098F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010;R+\u0010K\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020M\u0012\u0006\u0012\u0004\u0018\u00010N0L0\u001c098F\u00a2\u0006\u0006\u001a\u0004\bO\u0010;R+\u0010P\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010M\u0012\u0004\u0012\u00020Q0L0\u001c09\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010;R\u001a\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010T\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR \u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010V\"\u0004\b_\u0010XR\"\u0010`\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010f\u001a\u00020gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR(\u0010l\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\u001a\u0010q\u001a\u00020rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001d\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020m0\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010VR\u001d\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020m0\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010VR\u001a\u0010y\u001a\u00020mX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001a\u0010}\u001a\u00020mX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010z\"\u0004\b~\u0010|R)\u0010\u007f\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010V\"\u0005\b\u0080\u0001\u0010XR\u001d\u0010\u0081\u0001\u001a\u00020mX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010z\"\u0005\b\u0082\u0001\u0010|R\u001d\u0010\u0083\u0001\u001a\u00020mX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010z\"\u0005\b\u0084\u0001\u0010|R\u001d\u0010\u0085\u0001\u001a\u00020mX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010z\"\u0005\b\u0086\u0001\u0010|R+\u0010\u0087\u0001\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010V\"\u0005\b\u0088\u0001\u0010XR \u0010\u0089\u0001\u001a\u00030\u008a\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001d\u0010\u008f\u0001\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u0011\"\u0005\b\u0091\u0001\u0010\u0013R\u0010\u0010\u0092\u0001\u001a\u00030\u0093\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u0097\u0001\"\u0006\b\u009c\u0001\u0010\u0099\u0001R \u0010\u009d\u0001\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u0097\u0001\"\u0006\b\u009f\u0001\u0010\u0099\u0001R\u000f\u0010\u00a0\u0001\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u00a1\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u001c0\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a2\u0001\u0010VR\u001f\u0010\u00a3\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u001c0\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a4\u0001\u0010VR\u001f\u0010\u00a5\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u001c0\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a6\u0001\u0010VR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\u00a7\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u00a9\u00010\u00a8\u0001j\n\u0012\u0005\u0012\u00030\u00a9\u0001`\u00aa\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ab\u0001\u0010\u00ac\u0001\"\u0006\b\u00ad\u0001\u0010\u00ae\u0001R\u000f\u0010\u00af\u0001\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u00b0\u0001\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b1\u0001\u0010\u0097\u0001\"\u0006\b\u00b2\u0001\u0010\u0099\u0001R\u001d\u0010\u00b3\u0001\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b4\u0001\u0010\u0011\"\u0005\b\u00b5\u0001\u0010\u0013R \u0010\u00b6\u0001\u001a\u00030\u00b7\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b8\u0001\u0010\u00b9\u0001\"\u0006\b\u00ba\u0001\u0010\u00bb\u0001R \u0010\u00bc\u0001\u001a\u00030\u00bd\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00be\u0001\u0010\u00bf\u0001\"\u0006\b\u00c0\u0001\u0010\u00c1\u0001R\u000f\u0010\u00c2\u0001\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u00c3\u0001\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c4\u0001\u0010\u0011\"\u0005\b\u00c5\u0001\u0010\u0013R\u001d\u0010\u00c6\u0001\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c7\u0001\u0010\u0011\"\u0005\b\u00c8\u0001\u0010\u0013R\u001d\u0010\u00c9\u0001\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ca\u0001\u0010\u0011\"\u0005\b\u00cb\u0001\u0010\u0013R\u001d\u0010\u00cc\u0001\u001a\u00020mX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cd\u0001\u0010z\"\u0005\b\u00ce\u0001\u0010|R+\u0010\u00cf\u0001\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d0\u0001\u0010V\"\u0005\b\u00d1\u0001\u0010XR+\u0010\u00d2\u0001\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d3\u0001\u0010V\"\u0005\b\u00d4\u0001\u0010XR\u001c\u0010\u00d5\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00d6\u00010\u001b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d7\u0001\u0010VR$\u0010\u00d8\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d9\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00da\u0001\u0010V\"\u0005\b\u00db\u0001\u0010XR$\u0010\u00dc\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d9\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00dd\u0001\u0010V\"\u0005\b\u00de\u0001\u0010XR$\u0010\u00df\u0001\u001a\t\u0012\u0005\u0012\u00030\u00e0\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e1\u0001\u0010V\"\u0005\b\u00e2\u0001\u0010XR$\u0010\u00e3\u0001\u001a\t\u0012\u0005\u0012\u00030\u00e4\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e5\u0001\u0010V\"\u0005\b\u00e6\u0001\u0010XR)\u0010\u00e7\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020M\u0012\u0006\u0012\u0004\u0018\u00010N0L0\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u00e8\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010M\u0012\u0004\u0012\u00020Q0L0\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u00e9\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u00ea\u0001\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00eb\u0001\u0010\u0097\u0001\"\u0006\b\u00ec\u0001\u0010\u0099\u0001R\u001d\u0010\u00ed\u0001\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ee\u0001\u0010\u0011\"\u0005\b\u00ef\u0001\u0010\u0013R9\u0010\u00f0\u0001\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0005\u0012\u00030\u00d9\u0001 n*\u000b\u0012\u0005\u0012\u00030\u00d9\u0001\u0018\u00010a0a0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f1\u0001\u0010V\"\u0005\b\u00f2\u0001\u0010XR\"\u0010\u00f3\u0001\u001a\u0005\u0018\u00010\u00f4\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f5\u0001\u0010\u00f6\u0001\"\u0006\b\u00f7\u0001\u0010\u00f8\u0001R+\u0010\u00f9\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00fb\u00010\u00fa\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00fc\u0001\u0010V\"\u0005\b\u00fd\u0001\u0010XR9\u0010\u00fe\u0001\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0005\u0012\u00030\u00d9\u0001 n*\u000b\u0012\u0005\u0012\u00030\u00d9\u0001\u0018\u00010a0a0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ff\u0001\u0010V\"\u0005\b\u0080\u0002\u0010XR \u0010\u0081\u0002\u001a\u00030\u0082\u0002X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R\"\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u00f4\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0002\u0010\u00f6\u0001\"\u0006\b\u0089\u0002\u0010\u00f8\u0001R+\u0010\u008a\u0002\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010\u000f0\u000f0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0002\u0010V\"\u0005\b\u008c\u0002\u0010XR;\u0010\u008d\u0002\u001a \u0012\u001c\u0012\u001a\u0012\u0005\u0012\u00030\u008e\u0002 n*\f\u0012\u0005\u0012\u00030\u008e\u0002\u0018\u00010\u00fa\u00010\u00fa\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0002\u0010V\"\u0005\b\u0090\u0002\u0010XR\u001d\u0010\u0091\u0002\u001a\u00020rX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0002\u0010t\"\u0005\b\u0093\u0002\u0010vR9\u0010\u0094\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0005\u0012\u00030\u00e0\u0001 n*\u000b\u0012\u0005\u0012\u00030\u00e0\u0001\u0018\u00010a0a0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0002\u0010V\"\u0005\b\u0096\u0002\u0010XR-\u0010\u0097\u0002\u001a\u0012\u0012\u000e\u0012\f n*\u0005\u0018\u00010\u0098\u00020\u0098\u00020\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0002\u0010V\"\u0005\b\u009a\u0002\u0010XR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0002\u0010\u0011\"\u0005\b\u009d\u0002\u0010\u0013R\u001f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0002\u0010\u0011\"\u0005\b\u00a0\u0002\u0010\u0013R\"\u0010\u00a1\u0002\u001a\u0005\u0018\u00010\u008e\u0002X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a2\u0002\u0010\u00a3\u0002\"\u0006\b\u00a4\u0002\u0010\u00a5\u0002R \u0010\u00a6\u0002\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a7\u0002\u0010\u0097\u0001\"\u0006\b\u00a8\u0002\u0010\u0099\u0001R\u001d\u0010\u00a9\u0002\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00aa\u0002\u0010\u0011\"\u0005\b\u00ab\u0002\u0010\u0013R+\u0010\u00ac\u0002\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0002\u0010V\"\u0005\b\u00ae\u0002\u0010XR\u001b\u0010\u00af\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b0\u0002\u001a\u00020mX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u00b1\u0002\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b2\u0002\u0010V\"\u0005\b\u00b3\u0002\u0010XR+\u0010\u00b4\u0002\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0002\u0010V\"\u0005\b\u00b6\u0002\u0010XR+\u0010\u00b7\u0002\u001a\u0010\u0012\f\u0012\n n*\u0004\u0018\u00010m0m0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b8\u0002\u0010V\"\u0005\b\u00b9\u0002\u0010XR\u001d\u0010\u00ba\u0002\u001a\u00020mX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bb\u0002\u0010z\"\u0005\b\u00bc\u0002\u0010|R\u001d\u0010\u00bd\u0002\u001a\u00020mX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00be\u0002\u0010z\"\u0005\b\u00bf\u0002\u0010|R\u001f\u0010\u00c0\u0002\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0002\u0010\u0011\"\u0005\b\u00c2\u0002\u0010\u0013R \u0010\u00c3\u0002\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c4\u0002\u0010\u0097\u0001\"\u0006\b\u00c5\u0002\u0010\u0099\u0001R\u0012\u0010\u00c6\u0002\u001a\u0005\u0018\u00010\u00c7\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u00c8\u0002\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c9\u0002\u0010\u0011\"\u0005\b\u00ca\u0002\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010\u00cb\u0002\u001a\u0012\u0012\u000e\u0012\f n*\u0005\u0018\u00010\u0095\u00010\u0095\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cc\u0002\u0010V\"\u0005\b\u00cd\u0002\u0010XR9\u0010\u00ce\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0005\u0012\u00030\u00e4\u0001 n*\u000b\u0012\u0005\u0012\u00030\u00e4\u0001\u0018\u00010a0a0\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cf\u0002\u0010V\"\u0005\b\u00d0\u0002\u0010XR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u00d1\u0002\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d2\u0002\u0010\u0097\u0001\"\u0006\b\u00d3\u0002\u0010\u0099\u0001\u00a8\u0006\u00bc\u0003"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/SearchViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModelWithLogin;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "searchUseCase", "Lcom/intellihealth/truemeds/domain/usecase/SearchUseCase;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "userDataUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "tmWalletUseCase", "Lcom/intellihealth/truemeds/domain/usecase/TmWalletUseCase;", "(Landroid/content/Context;Lcom/intellihealth/truemeds/domain/usecase/SearchUseCase;Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;Lcom/intellihealth/truemeds/domain/usecase/TmWalletUseCase;)V", "beforeTextChange", "", "getBeforeTextChange", "()Ljava/lang/String;", "setBeforeTextChange", "(Ljava/lang/String;)V", "billDetailsData", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "getBillDetailsData", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "setBillDetailsData", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;)V", "callPharmacist", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "cartTotal", "", "getCartTotal", "()D", "setCartTotal", "(D)V", "checkReferralClaim", "clickedOnPage", "getClickedOnPage", "setClickedOnPage", "clickedSuggestionType", "getClickedSuggestionType", "setClickedSuggestionType", "couponAppliedRemovedPageName", "getCouponAppliedRemovedPageName", "setCouponAppliedRemovedPageName", "deepLinkSearchQuery", "delay", "", "getDelay", "()J", "setDelay", "(J)V", "elasticSearchType", "getElasticSearchType", "setElasticSearchType", "eventCallPharmacist", "Landroidx/lifecycle/LiveData;", "getEventCallPharmacist", "()Landroidx/lifecycle/LiveData;", "eventCheckReferralClaim", "getEventCheckReferralClaim", "eventLaunchPDPage", "Lcom/intellihealth/salt/models/ProductInfoModel;", "getEventLaunchPDPage", "eventLaunchSearchBS", "Lcom/intellihealth/truemeds/data/model/search/SearchBottomSheetModel;", "getEventLaunchSearchBS", "eventLaunchSearchSubsBS", "getEventLaunchSearchSubsBS", "eventLoginOpenBottomSheet", "getEventLoginOpenBottomSheet", "eventMessage", "Lcom/intellihealth/truemeds/data/utils/MessageConstant;", "getEventMessage", "eventOpenCouponPopup", "Lkotlin/Pair;", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "getEventOpenCouponPopup", "eventOpenCouponPopupOffline", "Lcom/intellihealth/truemeds/data/model/coupon/CouponResponse;", "getEventOpenCouponPopupOffline", "eventSendSrpEvent", "ftcCounterTime", "getFtcCounterTime", "()Landroidx/lifecycle/MutableLiveData;", "setFtcCounterTime", "(Landroidx/lifecycle/MutableLiveData;)V", "ftcCouponData", "getFtcCouponData", "setFtcCouponData", "ftcCouponList", "Lcom/intellihealth/truemeds/presentation/model/FtcCouponResponseList;", "getFtcCouponList", "setFtcCouponList", "ftcCouponResponse", "", "getFtcCouponResponse", "()Ljava/util/List;", "setFtcCouponResponse", "(Ljava/util/List;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "hideAPIData", "", "kotlin.jvm.PlatformType", "getHideAPIData", "setHideAPIData", "inputFinishChecker", "Ljava/lang/Runnable;", "getInputFinishChecker", "()Ljava/lang/Runnable;", "setInputFinishChecker", "(Ljava/lang/Runnable;)V", "isDelete", "isDeleteCompleted", "isLoadingMore", "()Z", "setLoadingMore", "(Z)V", "isMultiSearch", "setMultiSearch", "isSearchMedicineVisible", "setSearchMedicineVisible", "isSrpView", "setSrpView", "isSubs", "setSubs", "isSubsClicked", "setSubsClicked", "isSuggestionLoaded", "setSuggestionLoaded", "lastKnownResponse", "Lorg/json/JSONObject;", "getLastKnownResponse", "()Lorg/json/JSONObject;", "setLastKnownResponse", "(Lorg/json/JSONObject;)V", "lastScreenName", "getLastScreenName", "setLastScreenName", "lastTextEdit", "", "lastVisibleItemPosition", "", "getLastVisibleItemPosition", "()I", "setLastVisibleItemPosition", "(I)V", "lastVisibleItemPositionOfPreviouslyViewed", "getLastVisibleItemPositionOfPreviouslyViewed", "setLastVisibleItemPositionOfPreviouslyViewed", "lastVisibleItemPositionOfRecentlyViewed", "getLastVisibleItemPositionOfRecentlyViewed", "setLastVisibleItemPositionOfRecentlyViewed", "last_text_edit", "launchPDPage", "getLaunchPDPage", "launchSearchBS", "getLaunchSearchBS", "launchSearchSubsBS", "getLaunchSearchSubsBS", "medicineListDataReceived", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineListDetailsSent;", "Lkotlin/collections/ArrayList;", "getMedicineListDataReceived", "()Ljava/util/ArrayList;", "setMedicineListDataReceived", "(Ljava/util/ArrayList;)V", "mxClickedOnPage", "mxClickedSuggestionsPosition", "getMxClickedSuggestionsPosition", "setMxClickedSuggestionsPosition", "mxElasticSearchType", "getMxElasticSearchType", "setMxElasticSearchType", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "mxItemSearched", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxItemSearched;", "getMxItemSearched", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxItemSearched;", "setMxItemSearched", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxItemSearched;)V", "mxPageSection", "mxSuggestionTermClicked", "getMxSuggestionTermClicked", "setMxSuggestionTermClicked", "mxTermSearchTriggeredFor", "getMxTermSearchTriggeredFor", "setMxTermSearchTriggeredFor", "mxTermSearched", "getMxTermSearched", "setMxTermSearched", "mxTermSearchedTriggered", "getMxTermSearchedTriggered", "setMxTermSearchedTriggered", "noResultFound", "getNoResultFound", "setNoResultFound", "noResultSRP", "getNoResultSRP", "setNoResultSRP", "notificationDetailData", "Lcom/intellihealth/truemeds/data/model/orderflow/CouponCodeDataModel;", "getNotificationDetailData", "onClickPreviousItem", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;", "getOnClickPreviousItem", "setOnClickPreviousItem", "onClickRecentItem", "getOnClickRecentItem", "setOnClickRecentItem", "onClickSuggestionItem", "Lcom/intellihealth/truemeds/data/model/search/SuggestionWithType;", "getOnClickSuggestionItem", "setOnClickSuggestionItem", "onClickTrendingItem", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse$TrendingSearch;", "getOnClickTrendingItem", "setOnClickTrendingItem", "openCouponPopup", "openCouponPopupOffline", "openLoginBottomSheet", "pageNumber", "getPageNumber", "setPageNumber", "pageSection", "getPageSection", "setPageSection", "previouslyViewedList", "getPreviouslyViewedList", "setPreviouslyViewedList", "qcEvent", "", "getQcEvent", "()Ljava/lang/Void;", "setQcEvent", "(Ljava/lang/Void;)V", "recentMedicines", "", "Lcom/intellihealth/truemeds/data/model/SearchResult;", "getRecentMedicines", "setRecentMedicines", "recentlySearchedList", "getRecentlySearchedList", "setRecentlySearchedList", "replaceAllModel", "Lcom/intellihealth/truemeds/data/model/orderflow/ReplaceAllBottomSheetModel;", "getReplaceAllModel", "()Lcom/intellihealth/truemeds/data/model/orderflow/ReplaceAllBottomSheetModel;", "setReplaceAllModel", "(Lcom/intellihealth/truemeds/data/model/orderflow/ReplaceAllBottomSheetModel;)V", "rtEvent", "getRtEvent", "setRtEvent", "searchQuery", "getSearchQuery", "setSearchQuery", "searchResultList", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "getSearchResultList", "setSearchResultList", "searchResultRunner", "getSearchResultRunner", "setSearchResultRunner", "searchSuggestionList", "getSearchSuggestionList", "setSearchSuggestionList", "searchUIState", "Lcom/intellihealth/truemeds/data/model/search/SearchUIStateConstants;", "getSearchUIState", "setSearchUIState", "selectedItemQC", "getSelectedItemQC", "setSelectedItemQC", "selectedItemRT", "getSelectedItemRT", "setSelectedItemRT", "selectedMedicineDetails", "getSelectedMedicineDetails", "()Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "setSelectedMedicineDetails", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;)V", "selectedMedicineIndex", "getSelectedMedicineIndex", "setSelectedMedicineIndex", "selectedMedicineProductCode", "getSelectedMedicineProductCode", "setSelectedMedicineProductCode", "showDidYouMean", "getShowDidYouMean", "setShowDidYouMean", "showMessage", "showProducts", "showProgressBar", "getShowProgressBar", "setShowProgressBar", "showSearchedMedicine", "getShowSearchedMedicine", "setShowSearchedMedicine", "showSearching", "getShowSearching", "setShowSearching", "srpViewTriggered", "getSrpViewTriggered", "setSrpViewTriggered", "stopPagging", "getStopPagging", "setStopPagging", "suggestion_term_clicked", "getSuggestion_term_clicked", "setSuggestion_term_clicked", "suggestion_term_clicked_position", "getSuggestion_term_clicked_position", "setSuggestion_term_clicked_position", "taskSearchJob", "Lkotlinx/coroutines/Job;", "term_searched", "getTerm_searched", "setTerm_searched", "totalSearchCount", "getTotalSearchCount", "setTotalSearchCount", "trendingSearchList", "getTrendingSearchList", "setTrendingSearchList", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "addMedicine", "", "productInfoModel", "isSub", "position", "afterTextChanged", "input", "applyCouponClick", "couponCodeResponse", "calculateBillDetailsAfterCouponApplied", "orderId", "calculateSavingAmount", "currentPayableAmount", "cancelJob", "checkAlreadyAddedAsSubs", "orgProductCode", "subsProductCode", "checkAlreadyAddedSubsAsOrg", "productCode", "checkProductAsReplaceInReorder", "checkProductInList", "list", "name", "checkProductReplacedInReorder", "deleteMedicineFromCart", "editMedicine", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "removeMed", "page", "eventCallPharmacistClickedEvent", "eventSendSearchViewedEvent", "eventSendSrpAddSubsBottomSheetViewedEvent", "index", "eventSendSrpViewSubsBottomSheetViewedEvent", "eventSendSrpViewedEvent", "getAddedMedicinesFromCart", "newOrder", "isReplaceAll", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddedSubsInfoByOrg", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "getEditOrderRequestData", "qty", "getEventSendSrpEvent", "getFtcCouponsData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMedicineCount", "getOrgCountFromSubsMed", "getOrgProductCodeToMerge", "getPaymentMode", "getReactiveSuggestions", "Lcom/intellihealth/truemeds/data/model/search/SuggestionResponseData;", "query", "isMultiBrand", "getSearchSuggestions", "getSessionToken", "firebaseId", "getTrendingSearch", "getTrendingSearches", "initiateSearchJob", "search", "insertRecentlySearchMedicineInDB", "recentMedicine", "searchBottomSheetModel", "loadMoreResults", "hidePrimaryLoader", "loadRecentMedicines", "logEvents", "eventName", "onBackIconClick", "onCallPharmacistClick", "onClearRecentlySearch", "onClearSearchTextClick", "exitEventName", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onTextChanged", "reloadSearchResultList", "mList", "removeCouponClick", "resetSearchResult", "sendFtcCounterStarted", "timestamp", "sendItemSearchedEvent", "sendItem_searched", "sendSearchSuggestionImpressionEvent", "exitAction", "sendSuggestionItemImpression", "setEventPictureExists", "imgUrl", "setOfflineData", "setPreviouslyViewedProducts", "setRecentlySearched", "setTrendingSearches", "showBottomSheet", "updateCartMedicineQty", "updateOrgAvailableOfCartMedicine", "available", "updateUIState", "urgencyStickyClickedEvent", "couponResponse", "urgencyStickyViewedEvent", "Companion", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SearchViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModelWithLogin implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.SearchUseCase searchUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.TmWalletUseCase tmWalletUseCase = null;
    public static final long DEBOUNCER_TIME = 250L;
    public static final long DELAY = 500L;
    private static int timeTakenInMs = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> ftcCounterTime;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> ftcCouponData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse>>> openCouponPopup = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponResponse>>> openCouponPopupOffline = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponResponse>>> eventOpenCouponPopupOffline = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> isDelete = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> isDeleteCompleted = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedMedicineProductCode = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pageSection = "";
    private boolean isSubs = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastScreenName = "";
    private int lastVisibleItemPosition = 0;
    private int lastVisibleItemPositionOfPreviouslyViewed = 0;
    private int lastVisibleItemPositionOfRecentlyViewed = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> callPharmacist = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> openLoginBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> checkReferralClaim = null;
    private boolean isSubsClicked = false;
    private boolean isLoadingMore = false;
    private boolean stopPagging = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> onClickRecentItem;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> onClickPreviousItem;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch> onClickTrendingItem;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SuggestionWithType> onClickSuggestionItem;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SearchUIStateConstants> searchUIState;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> searchResultList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.FtcCouponResponseList> ftcCouponList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType>> searchSuggestionList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> recentlySearchedList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> previouslyViewedList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch>> trendingSearchList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery;
    @org.jetbrains.annotations.NotNull()
    private org.json.JSONObject lastKnownResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel> notificationDetailData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSearchMedicineVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideAPIData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> noResultFound;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> noResultSRP;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSuggestionLoaded;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showSearchedMedicine;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showSearching;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showDidYouMean;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showProgressBar;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String elasticSearchType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mxElasticSearchType = "";
    private boolean isMultiSearch = false;
    private int pageNumber = 1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String beforeTextChange = "";
    private boolean showProducts = false;
    private boolean mxTermSearchedTriggered = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mxTermSearchTriggeredFor = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mxTermSearched = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mxClickedOnPage = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mxPageSection = "";
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> ftcCouponResponse;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String deepLinkSearchQuery = "";
    private double cartTotal = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.orderflow.ReplaceAllBottomSheetModel replaceAllModel;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> launchPDPage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel>> launchSearchBS = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel>> launchSearchSubsBS = null;
    @org.jetbrains.annotations.NotNull()
    private long[] lastTextEdit = {0L};
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> totalSearchCount;
    @org.jetbrains.annotations.NotNull()
    private android.os.Handler handler;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Runnable inputFinishChecker;
    
    /**
     * Search edit text variables
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.SearchResult>> recentMedicines;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.model.ProductInfoModel selectedMedicineDetails;
    private int selectedMedicineIndex = -1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> medicineListDataReceived;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Void qcEvent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Void rtEvent;
    private int suggestion_term_clicked_position = -1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestion_term_clicked;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String term_searched;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String couponAppliedRemovedPageName = "search_result";
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched mxItemSearched;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedItemQC = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedItemRT = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mxSuggestionTermClicked = "";
    private int mxClickedSuggestionsPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedSuggestionType = "";
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    private boolean srpViewTriggered = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> eventSendSrpEvent = null;
    private boolean isSrpView = false;
    private int visibleItemCount = 0;
    
    /**
     * This method defines logic for Activity's EditText afterTextChanged event
     * 1) if user enters all space characters then do not execute any text change logic & stop EditText animation(to avoid space characters and EditText cursor getting animated)
     * 2) Update search query, so that data binding with respect to this can update view accordingly
     * 3) If input string is empty, then perform step 4 to step 7
     * 4) Reset variable:
     * 5) Get offline search data: recently searched, previously viewed.trending searched(Stored in session)
     * 6) If offline data not available then show default view, else show view having offline data
     * 7) Start EditText animation
     * 8) Else perform step 9 to step 12
     * 9) Reset variables for mixpanel item_searched event
     * 10) Stop EditText animation(to avoid inout characters and EditText cursor getting animated)
     * 11) Call api if gap between 2 input character is more than 500 milliseconds
     * 12) Trigger Singular event Search_typing(if not triggered in active instance)
     */
    private long last_text_edit = 0L;
    private long delay = 500L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Runnable searchResultRunner;
    
    /**
     * This job is used to start search only if user has not entered any character in 0.5 seconds time interval
     */
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job taskSearchJob;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel.Companion Companion = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.SearchUseCase searchUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.TmWalletUseCase tmWalletUseCase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFtcCounterTime() {
        return null;
    }
    
    public final void setFtcCounterTime(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> isDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> isDeleteCompleted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedMedicineProductCode() {
        return null;
    }
    
    public final void setSelectedMedicineProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSubs() {
        return false;
    }
    
    public final void setSubs(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastScreenName() {
        return null;
    }
    
    public final void setLastScreenName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getLastVisibleItemPosition() {
        return 0;
    }
    
    public final void setLastVisibleItemPosition(int p0) {
    }
    
    public final int getLastVisibleItemPositionOfPreviouslyViewed() {
        return 0;
    }
    
    public final void setLastVisibleItemPositionOfPreviouslyViewed(int p0) {
    }
    
    public final int getLastVisibleItemPositionOfRecentlyViewed() {
        return 0;
    }
    
    public final void setLastVisibleItemPositionOfRecentlyViewed(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventCallPharmacist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventLoginOpenBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventCheckReferralClaim() {
        return null;
    }
    
    public final boolean isSubsClicked() {
        return false;
    }
    
    public final void setSubsClicked(boolean p0) {
    }
    
    public final boolean isLoadingMore() {
        return false;
    }
    
    public final void setLoadingMore(boolean p0) {
    }
    
    public final boolean getStopPagging() {
        return false;
    }
    
    public final void setStopPagging(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> getOnClickRecentItem() {
        return null;
    }
    
    public final void setOnClickRecentItem(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> getOnClickPreviousItem() {
        return null;
    }
    
    public final void setOnClickPreviousItem(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch> getOnClickTrendingItem() {
        return null;
    }
    
    public final void setOnClickTrendingItem(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SuggestionWithType> getOnClickSuggestionItem() {
        return null;
    }
    
    public final void setOnClickSuggestionItem(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SuggestionWithType> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SearchUIStateConstants> getSearchUIState() {
        return null;
    }
    
    public final void setSearchUIState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.search.SearchUIStateConstants> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> getSearchResultList() {
        return null;
    }
    
    public final void setSearchResultList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.FtcCouponResponseList> getFtcCouponList() {
        return null;
    }
    
    public final void setFtcCouponList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.FtcCouponResponseList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType>> getSearchSuggestionList() {
        return null;
    }
    
    public final void setSearchSuggestionList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.SuggestionWithType>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> getRecentlySearchedList() {
        return null;
    }
    
    public final void setRecentlySearchedList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> getPreviouslyViewedList() {
        return null;
    }
    
    public final void setPreviouslyViewedList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch>> getTrendingSearchList() {
        return null;
    }
    
    public final void setTrendingSearchList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject getLastKnownResponse() {
        return null;
    }
    
    public final void setLastKnownResponse(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel> getNotificationDetailData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSearchMedicineVisible() {
        return null;
    }
    
    public final void setSearchMedicineVisible(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideAPIData() {
        return null;
    }
    
    public final void setHideAPIData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNoResultFound() {
        return null;
    }
    
    public final void setNoResultFound(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNoResultSRP() {
        return null;
    }
    
    public final void setNoResultSRP(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSuggestionLoaded() {
        return null;
    }
    
    public final void setSuggestionLoaded(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowSearchedMedicine() {
        return null;
    }
    
    public final void setShowSearchedMedicine(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowSearching() {
        return null;
    }
    
    public final void setShowSearching(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowDidYouMean() {
        return null;
    }
    
    public final void setShowDidYouMean(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowProgressBar() {
        return null;
    }
    
    public final void setShowProgressBar(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getElasticSearchType() {
        return null;
    }
    
    public final void setElasticSearchType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMxElasticSearchType() {
        return null;
    }
    
    public final void setMxElasticSearchType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isMultiSearch() {
        return false;
    }
    
    public final void setMultiSearch(boolean p0) {
    }
    
    public final int getPageNumber() {
        return 0;
    }
    
    public final void setPageNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBeforeTextChange() {
        return null;
    }
    
    public final void setBeforeTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getMxTermSearchedTriggered() {
        return false;
    }
    
    public final void setMxTermSearchedTriggered(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMxTermSearchTriggeredFor() {
        return null;
    }
    
    public final void setMxTermSearchTriggeredFor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMxTermSearched() {
        return null;
    }
    
    public final void setMxTermSearched(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> getFtcCouponResponse() {
        return null;
    }
    
    public final void setFtcCouponResponse(@org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> p0) {
    }
    
    public final double getCartTotal() {
        return 0.0;
    }
    
    public final void setCartTotal(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.ReplaceAllBottomSheetModel getReplaceAllModel() {
        return null;
    }
    
    public final void setReplaceAllModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.orderflow.ReplaceAllBottomSheetModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> getLaunchPDPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.salt.models.ProductInfoModel>> getEventLaunchPDPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel>> getLaunchSearchBS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel>> getEventLaunchSearchBS() {
        return null;
    }
    
    public final void launchSearchBS(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel searchBottomSheetModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel>> getLaunchSearchSubsBS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel>> getEventLaunchSearchSubsBS() {
        return null;
    }
    
    public final void launchSearchSubsBS(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.search.SearchBottomSheetModel searchBottomSheetModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTotalSearchCount() {
        return null;
    }
    
    public final void setTotalSearchCount(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Runnable getInputFinishChecker() {
        return null;
    }
    
    public final void setInputFinishChecker(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable p0) {
    }
    
    /**
     * Search edit text variables
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.SearchResult>> getRecentMedicines() {
        return null;
    }
    
    /**
     * Search edit text variables
     */
    public final void setRecentMedicines(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.SearchResult>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getSelectedMedicineDetails() {
        return null;
    }
    
    public final void setSelectedMedicineDetails(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel p0) {
    }
    
    public final int getSelectedMedicineIndex() {
        return 0;
    }
    
    public final void setSelectedMedicineIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Void getQcEvent() {
        return null;
    }
    
    public final void setQcEvent(@org.jetbrains.annotations.Nullable()
    java.lang.Void p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Void getRtEvent() {
        return null;
    }
    
    public final void setRtEvent(@org.jetbrains.annotations.Nullable()
    java.lang.Void p0) {
    }
    
    public final int getSuggestion_term_clicked_position() {
        return 0;
    }
    
    public final void setSuggestion_term_clicked_position(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuggestion_term_clicked() {
        return null;
    }
    
    public final void setSuggestion_term_clicked(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTerm_searched() {
        return null;
    }
    
    public final void setTerm_searched(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCouponAppliedRemovedPageName() {
        return null;
    }
    
    public final void setCouponAppliedRemovedPageName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched getMxItemSearched() {
        return null;
    }
    
    public final void setMxItemSearched(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedItemQC() {
        return null;
    }
    
    public final void setSelectedItemQC(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedItemRT() {
        return null;
    }
    
    public final void setSelectedItemRT(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMxSuggestionTermClicked() {
        return null;
    }
    
    public final void setMxSuggestionTermClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getMxClickedSuggestionsPosition() {
        return 0;
    }
    
    public final void setMxClickedSuggestionsPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedSuggestionType() {
        return null;
    }
    
    public final void setClickedSuggestionType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    public final boolean getSrpViewTriggered() {
        return false;
    }
    
    public final void setSrpViewTriggered(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventSendSrpEvent() {
        return null;
    }
    
    public final boolean isSrpView() {
        return false;
    }
    
    public final void setSrpView(boolean p0) {
    }
    
    public final int getVisibleItemCount() {
        return 0;
    }
    
    public final void setVisibleItemCount(int p0) {
    }
    
    public final void setMedicineListDataReceived() {
    }
    
    /**
     * 1) Send SDK Events
     * 2) Update cart item count, recently searched and previously viewed section
     * 3) Reset search text and search suggestion
     * 4) Start search box animation
     */
    public final void onClearSearchTextClick(@org.jetbrains.annotations.NotNull()
    java.lang.String exitEventName) {
    }
    
    /**
     * 1) If search suggestion is loaded then perform all steps from ivClearSearchText else Finish activity
     */
    public final void updateUIState() {
    }
    
    /**
     * 1) If search suggestion is loaded then perform all steps from ivClearSearchText else Finish activity
     */
    public final void onBackIconClick() {
    }
    
    /**
     * 1) Delete Recently Searched and Previously Viewed
     * 2) Reset Recently Searched and Previously Viewed list
     */
    public final void onClearRecentlySearch() {
    }
    
    /**
     * 1) Log MixPanel, Firebase, Singular, Facebook event
     * 2) open dialer with customer care number which is saved in Shared Preference
     */
    public final void onCallPharmacistClick() {
    }
    
    private final void resetSearchResult() {
    }
    
    /**
     * 1) Update cart item count
     * 2) Update recently searched list
     * 3) Update previously searched list
     * 4) Update trending searches
     */
    public final void setOfflineData() {
    }
    
    private final void setTrendingSearches() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> getEditOrderRequestData(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int qty) {
        return null;
    }
    
    public final void editMedicine(long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> list, boolean removeMed, @org.jetbrains.annotations.NotNull()
    java.lang.String page) {
    }
    
    private final kotlinx.coroutines.Job setRecentlySearched() {
        return null;
    }
    
    private final kotlinx.coroutines.Job setPreviouslyViewedProducts() {
        return null;
    }
    
    private final void sendSuggestionItemImpression(java.lang.String exitEventName) {
    }
    
    private final void sendItemSearchedEvent(java.lang.String exitEventName) {
    }
    
    /**
     * log events for Firebase, Singular and Facebook
     */
    private final void logEvents(java.lang.String eventName) {
    }
    
    public final void showBottomSheet() {
    }
    
    /**
     * Activity's onResume event callback will come here as well, as this viewmodel is observing activity lifecycle
     * 1) Start EditText animation
     */
    @java.lang.Override()
    public void onResume(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    /**
     * This method defines logic for Activity's EditText onTextChanged event
     * 1) Set showProduct = false so that product list is not shown to user
     * 2) If user pressed back space from keyboard, it's an exit event for search event, then send MixPanel item_searched event(if it's not triggered before for same exit event)
     * Else set mixpanel term searched to false so that next time item_searched event can be triggered
     */
    public final void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
    }
    
    public final long getDelay() {
        return 0L;
    }
    
    public final void setDelay(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Runnable getSearchResultRunner() {
        return null;
    }
    
    public final void setSearchResultRunner(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job afterTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    private final void getSearchSuggestions(java.lang.String input) {
    }
    
    public final void getSearchResultList(@org.jetbrains.annotations.NotNull()
    java.lang.String input, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, int page, boolean isMultiBrand) {
    }
    
    public final void reloadSearchResultList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> mList) {
    }
    
    /**
     * API call to get trending searches list
     */
    public final void getTrendingSearch() {
    }
    
    private final kotlinx.coroutines.Job loadRecentMedicines() {
        return null;
    }
    
    private final void initiateSearchJob(java.lang.String elasticSearchType, java.lang.String search) {
    }
    
    private final void cancelJob() {
    }
    
    private final java.lang.String getSessionToken(java.lang.String firebaseId) {
        return null;
    }
    
    public final void loadMoreResults(boolean hidePrimaryLoader) {
    }
    
    private final com.intellihealth.truemeds.data.model.search.SuggestionResponseData getReactiveSuggestions(java.lang.String query) {
        return null;
    }
    
    public final void getTrendingSearches() {
    }
    
    public final void insertRecentlySearchMedicineInDB(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine recentMedicine) {
    }
    
    private final int getMedicineCount(java.lang.String productCode) {
        return 0;
    }
    
    private final int getOrgCountFromSubsMed(java.lang.String productCode) {
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
    
    private final java.lang.String getOrgProductCodeToMerge(java.lang.String productCode) {
        return null;
    }
    
    private final java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> getAddedSubsInfoByOrg(java.lang.String productCode) {
        return null;
    }
    
    public final void addMedicine(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfoModel, boolean isSub, int position) {
    }
    
    public final void updateCartMedicineQty(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int qty) {
    }
    
    public final void updateOrgAvailableOfCartMedicine(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, boolean available) {
    }
    
    public final void deleteMedicineFromCart(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, boolean isSubs) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFtcCouponsData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
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
    
    public final void eventCallPharmacistClickedEvent() {
    }
    
    public final void eventSendSearchViewedEvent() {
    }
    
    public final void eventSendSrpAddSubsBottomSheetViewedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel selectedMedicineDetails, int index) {
    }
    
    public final boolean setEventPictureExists(@org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
        return false;
    }
    
    public final void eventSendSrpViewSubsBottomSheetViewedEvent(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel selectedMedicineDetails, int index) {
    }
    
    public final void sendSearchSuggestionImpressionEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String exitAction) {
    }
    
    public final void sendItem_searched(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched mxItemSearched) {
    }
    
    public final void eventSendSrpViewedEvent() {
    }
    
    private final boolean checkProductInList(java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> list, java.lang.String name) {
        return false;
    }
    
    public final void sendFtcCounterStarted(long timestamp) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job calculateBillDetailsAfterCouponApplied(long orderId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/SearchViewModel$Companion;", "", "()V", "DEBOUNCER_TIME", "", "DELAY", "timeTakenInMs", "", "getTimeTakenInMs", "()I", "setTimeTakenInMs", "(I)V", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getTimeTakenInMs() {
            return 0;
        }
        
        public final void setTimeTakenInMs(int p0) {
        }
    }
}