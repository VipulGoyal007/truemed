package com.intellihealth.truemeds.data.repository.datasource.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bf\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\'J\b\u0010\u000e\u001a\u00020\u0003H\'J\b\u0010\u000f\u001a\u00020\u0003H\'J\b\u0010\u0010\u001a\u00020\u0003H\'J\b\u0010\u0011\u001a\u00020\u0003H\'J\b\u0010\u0012\u001a\u00020\u0003H\'J\b\u0010\u0013\u001a\u00020\u0003H\'J\b\u0010\u0014\u001a\u00020\u0003H\'J\b\u0010\u0015\u001a\u00020\u0003H\'J\b\u0010\u0016\u001a\u00020\u0003H\'J\b\u0010\u0017\u001a\u00020\u0003H\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\'J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH\'J\b\u0010\u001b\u001a\u00020\u0003H\'J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\tH\'J\b\u0010\u001d\u001a\u00020\u0003H\'J\b\u0010\u001e\u001a\u00020\u0003H\'J\b\u0010\u001f\u001a\u00020\u0003H\'J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\tH\'J\b\u0010\"\u001a\u00020\u0003H\'J\b\u0010#\u001a\u00020\u0003H\'J\b\u0010$\u001a\u00020\u0003H\'J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\tH\'J\b\u0010&\u001a\u00020\u0003H\'J\b\u0010\'\u001a\u00020\u0003H\'J\b\u0010(\u001a\u00020\u0003H\'J\b\u0010)\u001a\u00020\u0003H\'J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\tH\'J\b\u0010+\u001a\u00020\u0003H\'J\b\u0010,\u001a\u00020\u0003H\'J\b\u0010-\u001a\u00020\u0003H\'J\b\u0010.\u001a\u00020\u0003H\'J\u0010\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\tH\'J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\t02H\'J\u0016\u00103\u001a\b\u0012\u0004\u0012\u000204022\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020602H\'J\b\u00107\u001a\u00020\u0007H\'J\u0010\u00108\u001a\u0002092\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010:\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\tH\'J\b\u0010;\u001a\u00020\rH\'J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020902H\'J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\t02H\'J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\t02H\'J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020402H\'J\u0010\u0010@\u001a\u0002042\u0006\u0010\u0018\u001a\u00020\tH\'J\u0010\u0010A\u001a\u0002042\u0006\u0010B\u001a\u00020\tH\'J\u0010\u0010C\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\tH\'J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010\u0018\u001a\u00020\tH\'J\u0010\u0010E\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\'J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u000204022\u0006\u0010G\u001a\u00020\tH\'J\u0010\u0010H\u001a\u00020\r2\u0006\u0010!\u001a\u00020\tH\'J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020\t02H\'J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\tH\'J\u0010\u0010M\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010N\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010P\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010Q\u001a\u00020R2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010S\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010T\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010U\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010V\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010W\u001a\u00020R2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010X\u001a\u00020R2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010Y\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010Z\u001a\u00020R2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010[\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\tH\'J\b\u0010^\u001a\u00020KH\'J\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020`02H\'J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020b02H\'J\u0010\u0010c\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\tH\'J\u0010\u0010d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\'J\u0010\u0010e\u001a\u00020K2\u0006\u0010f\u001a\u00020\tH\'J\u0010\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\tH\'J\u0010\u0010j\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010k\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u0018\u0010l\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\'J\b\u0010m\u001a\u00020\tH\'J\b\u0010n\u001a\u00020KH\'J\b\u0010o\u001a\u00020\rH\'J\u000e\u0010p\u001a\b\u0012\u0004\u0012\u00020q02H\'J\u0010\u0010r\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010s\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010t\u001a\u00020u2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010v\u001a\u00020\t2\u0006\u0010w\u001a\u00020\tH\'J\u0010\u0010x\u001a\u00020\t2\u0006\u0010w\u001a\u00020\tH\'J\b\u0010y\u001a\u00020KH\'J\b\u0010z\u001a\u00020KH\'J\u0010\u0010{\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010|\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010}\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010~\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0010\u0010\u007f\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\'J\u0017\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010\b\u001a\u00020\tH\'J\u000f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020902H\'J\t\u0010\u0082\u0001\u001a\u00020\rH\'J\u0011\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u0084\u0001\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u0085\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u0086\u0001\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\'J\u0011\u0010\u0087\u0001\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\t\u0010\u0088\u0001\u001a\u00020\u0007H\'J\u0011\u0010\u0089\u0001\u001a\u00020R2\u0006\u0010!\u001a\u00020\tH\'J\u0019\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u0001022\u0007\u0010\u008c\u0001\u001a\u00020KH\'J\u0011\u0010\u008d\u0001\u001a\u00020K2\u0006\u0010\u0018\u001a\u00020\tH\'J\t\u0010\u008e\u0001\u001a\u00020\u0007H\'J\u0011\u0010\u008f\u0001\u001a\u00020K2\u0006\u0010\u0018\u001a\u00020\tH\'J\u0011\u0010\u0090\u0001\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\'J\u0011\u0010\u0091\u0001\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\tH\'J\u0011\u0010\u0092\u0001\u001a\u00020K2\u0006\u0010\u0018\u001a\u00020\tH\'J\u0010\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u000102H\'J\u0010\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u000102H\'J\t\u0010\u0096\u0001\u001a\u00020\rH\'J\t\u0010\u0097\u0001\u001a\u00020\u0007H\'J\u0011\u0010\u0098\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u0099\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\t\u0010\u009a\u0001\u001a\u00020\u0007H\'J\u0019\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u0001022\u0007\u0010\u008c\u0001\u001a\u00020KH\'J\u0011\u0010\u009d\u0001\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u009e\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u009f\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u00a0\u0001\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\tH\'J\u0011\u0010\u00a1\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0012\u0010\u00a2\u0001\u001a\u00020\u00072\u0007\u0010\u00a3\u0001\u001a\u00020\tH\'J\u0019\u0010\u00a4\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\'J\u0011\u0010\u00a5\u0001\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0011\u0010\u00a6\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00a7\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u00a8\u0001\u001a\u00020\tH\'J\u0011\u0010\u00a9\u0001\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\'J\u0011\u0010\u00aa\u0001\u001a\u0002042\u0006\u0010G\u001a\u00020\tH\'J\u0011\u0010\u00ab\u0001\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u0013\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\tH\'J\u001a\u0010\u00ad\u0001\u001a\u00020\u00072\u0007\u0010\u00a3\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\'J\u0011\u0010\u00ae\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\'J\u000f\u0010\u00af\u0001\u001a\b\u0012\u0004\u0012\u00020\t02H\'J\u0013\u0010\u00b0\u0001\u001a\u00020\u00032\b\u0010\u00b1\u0001\u001a\u00030\u00b2\u0001H\'J\u0013\u0010\u00b3\u0001\u001a\u00020\u00032\b\u0010\u00b4\u0001\u001a\u00030\u00b5\u0001H\'J\u0019\u0010\u00b6\u0001\u001a\u00020\u00032\u000e\u0010\u00b7\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b8\u000102H\'J\u0012\u0010\u00b9\u0001\u001a\u00020\u00032\u0007\u0010\u00ba\u0001\u001a\u000206H\'J\u0013\u0010\u00bb\u0001\u001a\u00020\u00032\b\u0010\u00bc\u0001\u001a\u00030\u00bd\u0001H\'J\u0012\u0010\u00be\u0001\u001a\u00020\u00032\u0007\u0010\u00bf\u0001\u001a\u00020hH\'J\u0013\u0010\u00c0\u0001\u001a\u00020\u00032\b\u0010\u00c1\u0001\u001a\u00030\u00c2\u0001H\'J\u0012\u0010\u00c3\u0001\u001a\u00020\u00032\u0007\u0010\u00c4\u0001\u001a\u00020uH\'J\u0018\u0010\u00c5\u0001\u001a\u00020\u00032\r\u0010\u00c6\u0001\u001a\b\u0012\u0004\u0012\u00020q02H\'J\u0013\u0010\u00c7\u0001\u001a\u00020\u00032\b\u0010\u00c8\u0001\u001a\u00030\u00c9\u0001H\'J\u0011\u0010\u00ca\u0001\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\'J\u0012\u0010\u00cb\u0001\u001a\u00020\u00032\u0007\u0010\u00cc\u0001\u001a\u000209H\'J\u0019\u0010\u00cd\u0001\u001a\u00020\u00032\u000e\u0010\u00ce\u0001\u001a\t\u0012\u0005\u0012\u00030\u00cf\u000102H\'J\u0013\u0010\u00d0\u0001\u001a\u00020\u00032\b\u0010\u00d1\u0001\u001a\u00030\u008b\u0001H\'J\u0013\u0010\u00d2\u0001\u001a\u00020\u00032\b\u0010\u00d3\u0001\u001a\u00030\u00d4\u0001H\'J\u0013\u0010\u00d5\u0001\u001a\u00020\u00032\b\u0010\u00d6\u0001\u001a\u00030\u0094\u0001H\'J\u0013\u0010\u00d7\u0001\u001a\u00020\u00032\b\u0010\u00d8\u0001\u001a\u00030\u00d9\u0001H\'J\u0013\u0010\u00da\u0001\u001a\u00020\u00032\b\u0010\u00cc\u0001\u001a\u00030\u00db\u0001H\'J\u0013\u0010\u00dc\u0001\u001a\u00020\u00032\b\u0010\u00ba\u0001\u001a\u00030\u00dd\u0001H\'JG\u0010\u00de\u0001\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0007\u0010\u00df\u0001\u001a\u00020\t2\u0007\u0010\u00e0\u0001\u001a\u00020R2\u0007\u0010\u00e1\u0001\u001a\u00020\t2\u0007\u0010\u00e2\u0001\u001a\u00020R2\u0007\u0010\u00e3\u0001\u001a\u00020\t2\u0007\u0010\u00e4\u0001\u001a\u00020\tH\'J\u0012\u0010\u00e5\u0001\u001a\u00020\u00032\u0007\u0010\u00e6\u0001\u001a\u000204H\'J\u0013\u0010\u00e7\u0001\u001a\u00020\u00032\b\u0010\u00e8\u0001\u001a\u00030\u009c\u0001H\'J\u0013\u0010\u00e9\u0001\u001a\u00020\u00032\b\u0010\u00ea\u0001\u001a\u00030\u00eb\u0001H\'J\u0019\u0010\u00e9\u0001\u001a\u00020\u00032\u000e\u0010\u00ec\u0001\u001a\t\u0012\u0005\u0012\u00030\u00eb\u000102H\'J\u0019\u0010\u00ed\u0001\u001a\u00020\u00032\u000e\u0010\u00ee\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ef\u000102H\'J\u0012\u0010\u00f0\u0001\u001a\u00020\u00032\u0007\u0010\u00cc\u0001\u001a\u000204H\'J-\u0010\u00f1\u0001\u001a\u00020\u00032\u0007\u0010\u00f2\u0001\u001a\u00020K2\u0007\u0010\u00f3\u0001\u001a\u00020K2\u0007\u0010\u00f4\u0001\u001a\u00020K2\u0007\u0010\u00f5\u0001\u001a\u00020\tH\'J\u0019\u0010\u00f6\u0001\u001a\u00020\u00032\u000e\u0010\u00f7\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b8\u000102H\'J\u0011\u0010\u00f8\u0001\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\'J\t\u0010\u00f9\u0001\u001a\u00020\u0007H\'J\u0012\u0010\u00fa\u0001\u001a\u00020\u00072\u0007\u0010\u00fb\u0001\u001a\u00020\tH\'J\u0011\u0010\u00fc\u0001\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\t\u0010\u00fd\u0001\u001a\u00020\u0007H\'J\t\u0010\u00fe\u0001\u001a\u00020\u0007H\'J\u0011\u0010\u00ff\u0001\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\tH\'J\u001a\u0010\u0080\u0002\u001a\u00020\u00072\u0007\u0010\u00e1\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\'J\u0011\u0010\u0081\u0002\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\tH\'J\t\u0010\u0082\u0002\u001a\u00020\u0007H\'J\t\u0010\u0083\u0002\u001a\u00020\u0007H\'J\u0011\u0010\u0084\u0002\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\'J\u0019\u0010\u0085\u0002\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\'J\t\u0010\u0086\u0002\u001a\u00020\rH\'J\u0012\u0010\u0087\u0002\u001a\u00020\r2\u0007\u0010\u0088\u0002\u001a\u00020\tH\'J\u0019\u0010\u0089\u0002\u001a\u0004\u0018\u00010O2\u0006\u0010!\u001a\u00020\tH\'\u00a2\u0006\u0003\u0010\u008a\u0002J\t\u0010\u008b\u0002\u001a\u00020\u0007H\'J\u0011\u0010\u008c\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u008d\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\tH\'J\u0011\u0010\u008e\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u008f\u0002\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\'J\u0011\u0010\u0090\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u001a\u0010\u0091\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u0092\u0002\u001a\u00020\u0007H\'J\u001a\u0010\u0093\u0002\u001a\u00020\u00032\u0007\u0010\u0094\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u0095\u0002\u001a\u00020\u00032\u0007\u0010\u0096\u0002\u001a\u00020R2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u0097\u0002\u001a\u00020\u00032\u0007\u0010\u0098\u0002\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u0099\u0002\u001a\u00020\u00032\u0007\u0010\u00e2\u0001\u001a\u00020R2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u009a\u0002\u001a\u00020\u00032\u0007\u0010\u009b\u0002\u001a\u00020R2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u009c\u0002\u001a\u00020\u00032\u0007\u0010\u009d\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u009e\u0002\u001a\u00020\u00032\u0007\u0010\u009f\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00a0\u0002\u001a\u00020\u00032\u0007\u0010\u00a1\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00a2\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u00a3\u0002\u001a\u00020\tH\'J\u001a\u0010\u00a4\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u0096\u0002\u001a\u00020RH\'J$\u0010\u00a5\u0002\u001a\u00020\u00032\u0007\u0010\u00d3\u0001\u001a\u00020\t2\u0007\u0010\u00a6\u0002\u001a\u00020\t2\u0007\u0010\u00a7\u0002\u001a\u00020\tH\'J\u001a\u0010\u00a8\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u00a9\u0002\u001a\u00020OH\'J\u001a\u0010\u00aa\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u00ab\u0002\u001a\u00020RH\'J\u001b\u0010\u00ac\u0002\u001a\u00020\u00032\u0007\u0010\u00ad\u0002\u001a\u00020\t2\u0007\u0010\u00ae\u0002\u001a\u00020\u0007H\'J\u001a\u0010\u00af\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u00b0\u0002\u001a\u00020\u0007H\'Jj\u0010\u00b1\u0002\u001a\u00020\u00032\u0007\u0010\u00b2\u0002\u001a\u00020R2\u0007\u0010\u00b3\u0002\u001a\u00020R2\u0007\u0010\u00b4\u0002\u001a\u00020\t2\u0007\u0010\u00e0\u0001\u001a\u00020R2\u0006\u0010G\u001a\u00020\t2\u0007\u0010\u00e2\u0001\u001a\u00020R2\u0007\u0010\u00b5\u0002\u001a\u00020\t2\u0007\u0010\u00b6\u0002\u001a\u00020\t2\u0007\u0010\u00b7\u0002\u001a\u00020R2\u0007\u0010\u00b8\u0002\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00b9\u0002\u001a\u00020\u00032\u0007\u0010\u00ba\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00bb\u0002\u001a\u00020\u00032\u0007\u0010\u00bc\u0002\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J,\u0010\u00bd\u0002\u001a\u00020\u00032\u0007\u0010\u00b2\u0002\u001a\u00020R2\u0007\u0010\u00b3\u0002\u001a\u00020R2\u0007\u0010\u00ba\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00be\u0002\u001a\u00020\u00032\u0007\u0010\u00bf\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00c0\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u0092\u0002\u001a\u00020\u0007H\'J\u001a\u0010\u00c1\u0002\u001a\u00020\u00032\u0007\u0010\u00f3\u0001\u001a\u00020K2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00c2\u0002\u001a\u00020\u00032\u0007\u0010\u00f4\u0001\u001a\u00020K2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00c3\u0002\u001a\u00020\u00032\u0007\u0010\u00c4\u0002\u001a\u00020K2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00c5\u0002\u001a\u00020\u00032\u0007\u0010\u00f2\u0001\u001a\u00020K2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00c6\u0002\u001a\u00020\u00032\u0007\u0010\u00c7\u0002\u001a\u00020K2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00c8\u0002\u001a\u00020\u00032\u0007\u0010\u0098\u0002\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00c9\u0002\u001a\u00020\u00032\u0007\u0010\u00ca\u0002\u001a\u00020R2\u0006\u0010\u001a\u001a\u00020\tH\'J\u001a\u0010\u00cb\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0007\u0010\u00cc\u0002\u001a\u00020OH\'J\u001a\u0010\u00cd\u0002\u001a\u00020\u00032\u0007\u0010\u00ce\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00cf\u0002\u001a\u00020\u00032\u0007\u0010\u0098\u0002\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\'J\u0019\u0010\u00d0\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\'J\u001a\u0010\u00d1\u0002\u001a\u00020\u00032\u0007\u0010\u00d2\u0002\u001a\u00020O2\u0006\u0010!\u001a\u00020\tH\'J\u001a\u0010\u00d3\u0002\u001a\u00020\u00032\u0007\u0010\u00d4\u0002\u001a\u00020K2\u0006\u0010]\u001a\u00020\tH\'\u00a8\u0006\u00d5\u0002"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/local/TruemedsDao;", "", "addCartItemSequence", "", "cartItemSequence", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartItemSequence;", "checkAlreadyAddedAsSubs", "", "subsProductCode", "", "checkNameExist", "inputString", "checkSubExistsInReorder", "Landroid/database/Cursor;", "clearCartTable", "clearCrossSellingTable", "clearItemAddedAttributes", "clearOrgSubsTable", "clearReorderAltSubsTable", "deleteAddedCrossSelling", "deleteAllRecentSearch", "deleteCartItemSellingPrice", "deleteCartItemSequence", "deleteCartReplaceStatus", "orgProductCode", "deleteCrossSellingUsingId", "productCode", "deleteCustomerCategory", "categoryType", "deleteCustomerDetails", "deleteDoctorConfirmation", "deleteDoctorConfirmationSubOptions", "deleteItemAddedAttribute", "medicineId", "deleteOrderFilter", "deleteOrderFilterDetails", "deleteOrderTicket", "deleteOrderTicketFromMedId", "deletePatientNameEntity", "deletePillReminder", "deleteProductImage", "deleteReferReminder", "deleteReorderMedItem", "deleteSaveVideoFAQ", "deleteSearchCategory", "deleteSubOptReasons", "deleteTmContactVersion", "fetchMedsOnCartPage", "orderByString", "fetchMedsSequenceOnCartPage", "", "fetchOrgMedsFromDBWhooseSubsWereSame", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;", "getAddedCrossSellingProducts", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/AddedCrossSelling;", "getAddedCrossSellingProductsCount", "getAddedMedDetails", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "getAddedMedInfo", "getAddedMedListNotInOrgInfo", "getAddedMedListWithSubs", "getAddedMedNames", "getAddedMedProductCode", "getAddedOrgInfoByList", "getAddedOrgInfoByOrgCode", "getAddedOrgInfoBySubsCode", "subsMedCode", "getAddedSubsAsOrgCount", "getAddedSubsInfoByOrg", "getAddedSubsMedCountFromMedicineId", "getAddedSubsOrgInfo", "subsMedProductCode", "getAddedSubsOrgInfoFromOrgId", "getAllCustomerCategory", "getAllDoctorConfirmationSubOption", "", "value", "getAltReOrderSubsCode", "getAltSubsAvailable", "", "getAltSubsCompanyName", "getAltSubsDiscountPercentage", "", "getAltSubsImageUrlFromReorder", "getAltSubsImageUrlFromSubMed", "getAltSubsMedName", "getAltSubsMedProductCode", "getAltSubsMrp", "getAltSubsPack", "getAltSubsSavingPercentage", "getAltSubsSellingPrice", "getAltSubsUnit", "getCartCountFromRecentlySearch", "medName", "getCartTableCount", "getCartTotalMrpPrice", "Lcom/intellihealth/truemeds/data/model/LocalCartDBMrpCalculations;", "getCartTotalSellingPrice", "Lcom/intellihealth/truemeds/data/model/LocalCartDBSellingPriceCalculations;", "getCountOfDuplicateSubsFound", "getCustomerCategory", "getCustomerCategoryId", "category", "getCustomerDetails", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;", "mobileNo", "getCxAcceptedSubsFromReorderSubsTable", "getCxKeepOriginal", "getCxOrgAdded", "getDuplicateSubsFoundMedCode", "getEmptyPrevOrgProductId", "getExistingCartItems", "getFilterOrderList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrderFilter;", "getImageUrlFromAddedMeds", "getIsAltSubsAvailable", "getItemAddedAttributes", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ItemAddedEventAttributes;", "getKeyValueFromSearchCategory", "key", "getKeyValueFromSearchCategoryIgnoreCase", "getLastCustomerCategoryId", "getLastDateForNameValidation", "getMaxCappedCount", "getMedIdFromCartSequence", "getMedIdFromCartTable", "getMedicineIdFromReorderMed", "getMedicineItemCount", "getMedicineListWIthSameSubs", "getMedsList", "getOrderTicketDetails", "getOrgAddedQtyFromReorder", "getOrgAvailableFromOrgSubs", "getOrgInfoCodeInReorder", "getOrgProductCodeToMerge", "getOrgReplaceStatus", "getOrgSubTableCount", "getOriginalPackSizeFromOrgSubs", "getPillReminderUsingOrderId", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PillReminder;", "orderId", "getPrevOrderId", "getPrevOrderIdItemCount", "getPrevOrgProductId", "getProductCodeFromRecentlySearch", "getProductImages", "getProductsDetailId", "getRecentlySearch", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;", "getRecentlySearchMeds", "getReorderPatientInfo", "getReorderTableCount", "getReplacedMedId", "getReplacedMedName", "getSavedContactsCount", "getSavedVideOFAQ", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SaveVideoFAQ;", "getShowOnlyOrg", "getSubImageUrlInReorder", "getSubImageUrlInReorderFromMedicineId", "getSubOptReasonId", "getSubsDiscountPercentage", "getSubsInReorder", "productId", "getSubsInfoFromProductCode", "getSubsInfoFromSubsCode", "getSubsMedCodeFromReorderSubsTable", "getSubsMedicineItemCount", "subsMedicineId", "getSubsName", "getSubsOrgInfo", "getSubsPitchedInReorder", "getSubsProductCodeFromOrgCode", "getSubsReorderReplaceCount", "getSwitchBackCount", "getTrayDetailsOfItemAddedAttributes", "insertCartItemSellingPrice", "cartItemSellingPrice", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartItemSellingPrice;", "insertCartReplaceStatus", "cartReplaceStatus", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartReplaceStatus;", "insertContactList", "contactEntityList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/TmContactVersion;", "insertCrossSellingProduct", "addedCrossSelling", "insertCustomerCategory", "variant", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerCategory;", "insertCustomerDetails", "customerDetails", "insertDoctorConfirmationSubOptions", "doctorConfirmationSubOptions", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/DoctorConfirmationSubOptions;", "insertItemAddedAttributes", "item", "insertOrderFilterDetails", "orderFilter", "insertOrderTicket", "ticket", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrderTicket;", "insertOrgSubFromCart", "insertOriginalMedicine", "medicine", "insertPatientNameList", "patientNameEntity", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PatientNameEntity;", "insertPillReminder", "pillReminder", "insertProductImage", "image", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ProductImage;", "insertRecentlySearch", "recentSearch", "insertReferReminder", "referReminder", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ReferReminder;", "insertReorderAltSubs", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ReorderAlternateSubs;", "insertReorderCrossSellingProduct", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/AddedReorderCrossSelling;", "insertReplaceMed", "savingPercentage", "subsSellingPrice", "originalProductCode", "subsMrp", "originalSkuName", "originalCompanyName", "insertReplaceMedNormalFlow", "orgSubsInfo", "insertSaveVideoFAQ", "videoFAQ", "insertSearchCategory", "searchCategory", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SearchCategory;", "searchCategoryList", "insertSubOptReasons", "subOptReasons", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SubOptReasons;", "insertSubsOrgInfo", "insertSwitchToOrgMed", "productDetailsId", "prevOrderId", "prevOrgProductId", "orgInfoProductCode", "insertTmContactVersionDetails", "tmContactVersions", "isAutoReplace", "isAutoReplaceDone", "isItemThereInReOrderReplace", "itemCode", "isOrgAvailableFromAddedMeds", "isOrgHavingNoSubsAddedToCart", "isOrgHavingSubsAddedToCart", "isProductAddedAsReplacedInReorder", "isProductInOrgInfoAdded", "isProductReplacedInReorder", "isRxRequired", "isSubAddedFromOrgToCart", "isSubsAddedAsWell", "isSubsAlsoAddedForOrg", "isSubsAvailable", "isSubsAvailableFromAddedMedId", "notInAddedMedicineIds", "isSubsAvailableInReOrderAltSubs", "(Ljava/lang/String;)Ljava/lang/Boolean;", "isSubsItselfAddedToCart", "removeAddedMedicineFromCart", "removeCartItemPrice", "removeOrgSubsMedicineFromCart", "subsAddedMedCount", "subsAsOrgCount", "updateAddedMedicine", "qty", "updateAltSubsAvailableInReorder", "altSubsAvailable", "updateAltSubsDiscountPercentageInReorder", "discount", "updateAltSubsImageInReorder", "imageUrl", "updateAltSubsMrpInReorder", "updateAltSubsSellingPriceInReorder", "sellingPrice", "updateColdChainInReorder", "coldChainDisabled", "updateCxAcceptedSubsInReorder", "cxAcceptedSubs", "updateCxKeepOriginalInReorder", "cxKeepOriginal", "updateDescriptionInOrderTicket", "description", "updateDiscountOfAddedMedicine", "updateImageAndDrugTypeInRecentlySearch", "drugType", "id", "updateIsReplaceInReorder", "isReplace", "updateMrpOfAddedMedicine", "mrp", "updateOrderAddressInReorder", "orderAddress", "addressId", "updateOrgAddedQuantityInReorder", "orgAddedQuantity", "updateOrgAndSubDetailsInAddedMed", "orgMrp", "orgDiscountPercentage", "subDiscountPercentage", "subsMedName", "subCompanyName", "substitutePackSize", "subsRecommendedQty", "updateOrgAvailableInAddedMedicine", "orgAvailable", "updateOrgCompanyAddressInAddedMad", "address", "updateOrgDetailsInAddedMed", "updateOrgDisabledInReorder", "orgDisabled", "updateOrgSubInfoMedicine", "updatePrevOrderId", "updatePrevOrgProductId", "updateProductDetailIdnAddedMedicine", "detailId", "updateProductDetailsId", "updateProductImage", "dateTime", "updateProductImageInAddedMedicine", "updateSellingPriceInCart", "orgSellingPrice", "updateShowOnlyOrgInReorder", "showOnlyOrg", "updateSubsAvailableInReorder", "subsAvailable", "updateSubsImageInReorder", "updateSubsMedProductCode", "updateSubsPitchedInReorder", "subsPitched", "updateTimeInRecentlySearch", "addedTime", "app_stageAndroidDebug"})
@androidx.room.Dao()
public abstract interface TruemedsDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertOriginalMedicine(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine medicine);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertSubsOrgInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo medicine);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertReorderAltSubs(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs medicine);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertReferReminder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.ReferReminder referReminder);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertPillReminder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder pillReminder);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertSaveVideoFAQ(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ videoFAQ);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertContactList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion> contactEntityList);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertRecentlySearch(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine recentSearch);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void addCartItemSequence(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSequence cartItemSequence);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertSubOptReasons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons> subOptReasons);
    
    @androidx.room.Query(value = "INSERT INTO addedSubsOrgInfo SELECT id, medicineId, medicineName, companyName, discount, mrp, addedQty, composition,  :savingPercentage AS subDiscountPercentage,  :subsSellingPrice AS subsSellingPrice, isSubFound, isFromApi,  :originalProductCode AS subsMedProductCode, :subsMrp AS subsMrp, :originalSkuName AS subsMedName, :originalCompanyName AS subCompanyName, isColdStorage ,drugType, originalPackSize, substitutePackSize, prescriptionRequired, maxCapped, subsReccommendedQty, originalCountryNm, subs_country_nm, subs_unit, original_unit, product_image_urls, original_company_addr, orgAvailable FROM addedMedsTable12 WHERE medicineId = :orgProductCode ")
    public abstract void insertReplaceMed(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    java.lang.String savingPercentage, double subsSellingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String originalProductCode, double subsMrp, @org.jetbrains.annotations.NotNull()
    java.lang.String originalSkuName, @org.jetbrains.annotations.NotNull()
    java.lang.String originalCompanyName);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertReplaceMedNormalFlow(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo orgSubsInfo);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertCartReplaceStatus(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartReplaceStatus cartReplaceStatus);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertCrossSellingProduct(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling addedCrossSelling);
    
    @androidx.room.Query(value = "INSERT INTO addedMedsTable12 SELECT null, medicineId, medicineName, companyName, discount, mrp, addedQty, composition, subDiscountPercentage, subsSellingPrice, \nisSubFound, isFromApi, subsMedProductCode,subsMrp, subsMedName, subCompanyName, isColdStorage, drugType, originalPackSize, \nsubstitutePackSize, prescriptionRequired, maxCapped, subsReccommendedQty, originalCountryNm, subs_country_nm, subs_unit, original_unit, \nproduct_image_urls,original_company_addr, orgAvailable, :productDetailsId AS productDetailsId, :prevOrderId AS prevOrderId, :prevOrgProductId AS prevOrgProductId  FROM addedSubsOrgInfo  WHERE subsMedProductCode = :orgInfoProductCode ")
    public abstract void insertSwitchToOrgMed(long productDetailsId, long prevOrderId, long prevOrgProductId, @org.jetbrains.annotations.NotNull()
    java.lang.String orgInfoProductCode);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertSearchCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory searchCategory);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertSearchCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory> searchCategoryList);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertDoctorConfirmationSubOptions(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.DoctorConfirmationSubOptions doctorConfirmationSubOptions);
    
    @androidx.room.Query(value = "INSERT INTO addedSubsOrgInfo SELECT null, medicineId,medicineName,companyName,discount,mrp,addedQty,composition,subDiscountPercentage,subsSellingPrice,isSubFound,isFromApi,subsMedProductCode,subsMrp,subsMedName,subCompanyName,isColdStorage,drugType,originalPackSize,substitutePackSize,prescriptionRequired,maxCapped,subsReccommendedQty,originalCountryNm,subs_country_nm,subs_unit,original_unit, product_image_urls, original_company_addr, orgAvailable FROM addedMedsTable12 WHERE medicineId = :orgProductCode ")
    public abstract void insertOrgSubFromCart(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertOrderTicket(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderTicket ticket);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertProductImage(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.ProductImage image);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertCustomerCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory variant);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails customerDetails);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertOrderFilterDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter> orderFilter);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertTmContactVersionDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion> tmContactVersions);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertCartItemSellingPrice(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice cartItemSellingPrice);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes item);
    
    @androidx.room.Query(value = "delete from patientName")
    public abstract void deletePatientNameEntity();
    
    @androidx.room.Query(value = "delete from cart_item_price")
    public abstract void deleteCartItemSellingPrice();
    
    @androidx.room.Query(value = "delete from sub_opt_reasons")
    public abstract void deleteSubOptReasons();
    
    @androidx.room.Query(value = "delete from OrderFilter")
    public abstract void deleteOrderFilter();
    
    @androidx.room.Query(value = "delete from customer_category")
    public abstract void deleteCustomerCategory();
    
    @androidx.room.Query(value = "delete from productImage")
    public abstract void deleteProductImage();
    
    @androidx.room.Query(value = "delete from raise_ticket")
    public abstract void deleteOrderTicket();
    
    @androidx.room.Query(value = "delete from AddedCrossSelling")
    public abstract void deleteAddedCrossSelling();
    
    @androidx.room.Query(value = "delete from doctor_confirmation_sub_options")
    public abstract void deleteDoctorConfirmationSubOptions();
    
    @androidx.room.Query(value = "delete from saveVideoFaq")
    public abstract void deleteSaveVideoFAQ();
    
    @androidx.room.Query(value = "delete from refferReminder")
    public abstract void deleteReferReminder();
    
    @androidx.room.Query(value = "delete from savePillReminder")
    public abstract void deletePillReminder();
    
    @androidx.room.Query(value = "delete from customer_details")
    public abstract void deleteCustomerDetails();
    
    @androidx.room.Query(value = "delete from recentlySearched")
    public abstract void deleteAllRecentSearch();
    
    @androidx.room.Query(value = "delete from addedMedsTable12 where medicineId = :medicineId")
    public abstract void removeAddedMedicineFromCart(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "delete from cart_item_price where productCode = :productCode")
    public abstract void removeCartItemPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "delete from addedSubsOrgInfo where subsMedProductCode= :medicineId ")
    public abstract void removeOrgSubsMedicineFromCart(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "delete from addedMedsTable12")
    public abstract void clearCartTable();
    
    @androidx.room.Query(value = "delete from addedSubsOrgInfo")
    public abstract void clearOrgSubsTable();
    
    @androidx.room.Query(value = "delete from reorder_alternate_subs")
    public abstract void clearReorderAltSubsTable();
    
    @androidx.room.Query(value = "delete from cartReplaceStatus")
    public abstract void deleteCartReplaceStatus();
    
    @androidx.room.Query(value = "delete from addedcrossselling")
    public abstract void clearCrossSellingTable();
    
    @androidx.room.Query(value = "DELETE FROM cartItemSequence")
    public abstract void deleteCartItemSequence();
    
    @androidx.room.Query(value = "delete from cartReplaceStatus where medicineId = :orgProductCode ")
    public abstract void deleteCartReplaceStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "delete from reorder_alternate_subs where medicineId= :medicineId ")
    public abstract void deleteReorderMedItem(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "delete from search_category")
    public abstract void deleteSearchCategory();
    
    @androidx.room.Query(value = "delete from doctor_confirmation_sub_options")
    public abstract void deleteDoctorConfirmation();
    
    @androidx.room.Query(value = "delete from AddedCrossSelling where ProductCode = :productCode")
    public abstract void deleteCrossSellingUsingId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "delete from raise_ticket where medicineId = :medicineId")
    public abstract void deleteOrderTicketFromMedId(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "delete from customer_category where categoryType = :categoryType")
    public abstract void deleteCustomerCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryType);
    
    @androidx.room.Query(value = "delete from OrderFilter")
    public abstract void deleteOrderFilterDetails();
    
    @androidx.room.Query(value = "delete from TmContactVersion")
    public abstract void deleteTmContactVersion();
    
    @androidx.room.Query(value = "UPDATE recentlySearched SET productImage = :image, drugType = :drugType WHERE productCode =:id")
    public abstract void updateImageAndDrugTypeInRecentlySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String drugType, @org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Query(value = "UPDATE recentlySearched SET addedDateTime = :addedTime WHERE medicineName = :medName ")
    public abstract void updateTimeInRecentlySearch(long addedTime, @org.jetbrains.annotations.NotNull()
    java.lang.String medName);
    
    @androidx.room.Query(value = "update addedMedsTable12 set addedQty = :qty where medicineId = :medicineId ")
    public abstract void updateAddedMedicine(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, int qty);
    
    @androidx.room.Query(value = "update addedSubsOrgInfo set addedQty = :qty where medicineId = :medicineId ")
    public abstract void updateOrgSubInfoMedicine(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, int qty);
    
    @androidx.room.Query(value = "update addedMedsTable12 set orgAvailable = :orgAvailable  where medicineId = :medicineId ")
    public abstract void updateOrgAvailableInAddedMedicine(boolean orgAvailable, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update addedMedsTable12 set productDetailsId = :detailId  where medicineId = :medicineId ")
    public abstract void updateProductDetailIdnAddedMedicine(long detailId, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update addedMedsTable12 set product_image_urls = :imageUrl  where medicineId = :medicineId ")
    public abstract void updateProductImageInAddedMedicine(@org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set subImageUrl = :imageUrl  where SubsMedProductCode = :medicineId ")
    public abstract void updateSubsImageInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set altSubsImageUrl = :imageUrl  where altSubsMedProductCode = :medicineId ")
    public abstract void updateAltSubsImageInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update addedMedsTable12 set prevOrderId = :prevOrderId where medicineId = :medicineId ")
    public abstract void updatePrevOrderId(long prevOrderId, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update addedMedsTable12 set subsMedProductCode = :subsProductCode where medicineId = :medicineId ")
    public abstract void updateSubsMedProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "update addedMedsTable12 set prevOrgProductId = :prevOrgProductId where medicineId = :medicineId ")
    public abstract void updatePrevOrgProductId(long prevOrgProductId, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update addedMedsTable12 set productDetailsId = :productDetailsId where medicineId = :medicineId ")
    public abstract void updateProductDetailsId(long productDetailsId, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set isAltSubAvailable = :altSubsAvailable where medicineId = :medicineId")
    public abstract void updateAltSubsAvailableInReorder(boolean altSubsAvailable, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set isSubAvailable = :subsAvailable where medicineId = :medicineId")
    public abstract void updateSubsAvailableInReorder(boolean subsAvailable, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set isOrgDisabled = :orgDisabled where medicineId = :medicineId")
    public abstract void updateOrgDisabledInReorder(boolean orgDisabled, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set subsPitched = :subsPitched where medicineId = :medicineId")
    public abstract void updateSubsPitchedInReorder(boolean subsPitched, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set cxAcceptedSubs = :cxAcceptedSubs where medicineId = :medicineId")
    public abstract void updateCxAcceptedSubsInReorder(boolean cxAcceptedSubs, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set cxKeepOriginal =:cxKeepOriginal where medicineId = :medicineId ")
    public abstract void updateCxKeepOriginalInReorder(boolean cxKeepOriginal, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update addedMedsTable12 set original_company_addr = :address where medicineId = :medicineId")
    public abstract void updateOrgCompanyAddressInAddedMad(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update addedMedsTable12 set mrp = :orgMrp , discount = :orgDiscountPercentage , orgAvailable = :orgAvailable  where medicineId = :medicineId ")
    public abstract void updateOrgDetailsInAddedMed(double orgMrp, double orgDiscountPercentage, boolean orgAvailable, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update addedMedsTable12 set mrp = :orgMrp , discount = :orgDiscountPercentage , subDiscountPercentage = :subDiscountPercentage , subsSellingPrice = :subsSellingPrice , subsMedProductCode = :subsMedProductCode , subsMrp = :subsMrp , subsMedName = :subsMedName , subCompanyName = :subCompanyName , substitutePackSize = :substitutePackSize , subsReccommendedQty = :subsRecommendedQty  where medicineId = :medicineId ")
    public abstract void updateOrgAndSubDetailsInAddedMed(double orgMrp, double orgDiscountPercentage, @org.jetbrains.annotations.NotNull()
    java.lang.String subDiscountPercentage, double subsSellingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String subsMedProductCode, double subsMrp, @org.jetbrains.annotations.NotNull()
    java.lang.String subsMedName, @org.jetbrains.annotations.NotNull()
    java.lang.String subCompanyName, double substitutePackSize, int subsRecommendedQty, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set altSubsDiscountPercentage = :discount  where medicineId = :medicineId ")
    public abstract void updateAltSubsDiscountPercentageInReorder(double discount, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set altSubsSellingPrice = :sellingPrice  where medicineId = :medicineId ")
    public abstract void updateAltSubsSellingPriceInReorder(double sellingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set altSubsMrp = :subsMrp  where medicineId = :medicineId ")
    public abstract void updateAltSubsMrpInReorder(double subsMrp, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set coldChainDisabled = :coldChainDisabled  where medicineId = :medicineId ")
    public abstract void updateColdChainInReorder(boolean coldChainDisabled, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set orderAddress = :orderAddress, addressID = :addressId ")
    public abstract void updateOrderAddressInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String orderAddress, int addressId);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set isReplace = :isReplace where medicineId = :medicineId")
    public abstract void updateIsReplaceInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, boolean isReplace);
    
    @androidx.room.Query(value = "update addedMedsTable12 set mrp = :mrp where medicineId = :medicineId")
    public abstract void updateMrpOfAddedMedicine(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, double mrp);
    
    @androidx.room.Query(value = "update addedMedsTable12 set discount = :discount where medicineId = :medicineId")
    public abstract void updateDiscountOfAddedMedicine(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, double discount);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set orgAddedQuantity = :orgAddedQuantity where medicineId = :medicineId")
    public abstract void updateOrgAddedQuantityInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, int orgAddedQuantity);
    
    @androidx.room.Query(value = "update reorder_alternate_subs set showOnlyOrg = :showOnlyOrg where medicineId = :medicineId")
    public abstract void updateShowOnlyOrgInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, boolean showOnlyOrg);
    
    @androidx.room.Query(value = "update raise_ticket set description = :description where medicineId = :medicineId")
    public abstract void updateDescriptionInOrderTicket(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.NotNull()
    java.lang.String description);
    
    @androidx.room.Query(value = "update productImage set addedDateTime = :dateTime where productCode = :medicineId")
    public abstract void updateProductImage(long dateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "update cart_item_price set sellingPrice = :orgSellingPrice where productCode = :productCode")
    public abstract void updateSellingPriceInCart(double orgSellingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "SELECT COUNT(medicineId) FROM addedMedsTable12")
    public abstract long getCartTableCount();
    
    @androidx.room.Query(value = "SELECT COUNT(medicineId) FROM addedSubsOrgInfo")
    public abstract int getOrgSubTableCount();
    
    @androidx.room.Query(value = "SELECT COUNT(medicineId) FROM reorder_alternate_subs")
    public abstract int getReorderTableCount();
    
    @androidx.room.Query(value = "SELECT addedQty FROM addedMedsTable12 WHERE medicineId = :medicineId")
    public abstract int getMedicineItemCount(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT maxCapped FROM addedMedsTable12 WHERE medicineId = :medicineId")
    public abstract int getMaxCappedCount(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT cart.addedQty FROM addedMedsTable12 cart INNER JOIN addedSubsOrgInfo subOrgInfo ON cart.medicineId = subOrgInfo.subsMedProductCode WHERE subOrgInfo.medicineId = :medicineId")
    public abstract int subsAddedMedCount(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT addedQty FROM addedSubsOrgInfo WHERE medicineId = :medicineId AND subsMedProductCode = :subsMedicineId")
    public abstract int getSubsMedicineItemCount(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.NotNull()
    java.lang.String subsMedicineId);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = :subsProductCode AND (subsMedProductCode = :subsProductCode AND NOT EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = :subsProductCode AND medicineId != :subsProductCode ))")
    public abstract int checkAlreadyAddedAsSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedSubsOrgInfo WHERE medicineId != :productCode and subsMedProductCode = :subsProductCode")
    public abstract int getSubsInfoFromProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = :subsProductCode ")
    public abstract int getSubsInfoFromSubsCode(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "select * from addedSubsOrgInfo WHERE subsMedProductCode = :subsMedProductCode")
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo getSubsOrgInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String subsMedProductCode);
    
    @androidx.room.Query(value = "select subsMedProductCode from addedSubsOrgInfo WHERE medicineId = :orgProductCode")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getSubsProductCodeFromOrgCode(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = :subsProductCode AND (subsMedProductCode = :subsProductCode AND NOT EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = :subsProductCode AND medicineId != :subsProductCode ))")
    public abstract int subsAsOrgCount(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = :productCode AND subsMedProductCode = :productCode AND EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = :productCode AND medicineId != :productCode )")
    public abstract int getAddedSubsAsOrgCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM reorder_alternate_subs WHERE (SubsMedProductCode = :productId OR altSubsMedProductCode = :productId) AND (isReplace = \'1\' OR isReplace = \'true\')")
    public abstract int getSubsInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String productId);
    
    @androidx.room.Query(value = "SELECT * FROM savePillReminder WHERE orderId = :orderId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder> getPillReminderUsingOrderId(long orderId);
    
    @androidx.room.Query(value = "SELECT * FROM saveVideoFaq WHERE orderId = :orderId ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ> getSavedVideOFAQ(long orderId);
    
    @androidx.room.Query(value = "select 1 from addedMedsTable12 where prescriptionRequired = \'true\' OR prescriptionRequired = \'1\'")
    public abstract int isRxRequired();
    
    @androidx.room.Query(value = "select * from recentlySearched where productCode IS NOT NULL AND productCode !=\'\' AND productCode!=\'null\' order by addedDateTime desc")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> getRecentlySearchMeds();
    
    @androidx.room.Query(value = "select * from recentlySearched where productCode IS NULL OR productCode=\'\' OR productCode=\'null\' OR productCode=null order by addedDateTime desc")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine> getRecentlySearch();
    
    @androidx.room.Query(value = "SELECT 1 FROM recentlySearched WHERE medicineName = :medName")
    public abstract int getCartCountFromRecentlySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String medName);
    
    @androidx.room.Query(value = "SELECT 1 FROM reorder_alternate_subs WHERE medicineId = :productId AND (SubsMedProductCode = :subsProductCode OR altSubsMedProductCode = :subsProductCode) AND (isReplace = \'1\' OR isReplace = \'true\')")
    public abstract int getSubsReorderReplaceCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM reorder_alternate_subs WHERE medicineId = :productCode AND (isReplace = \'1\' OR isReplace = \'true\')")
    public abstract int isProductReplacedInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "select medicineId from addedMedsTable12 where subsMedProductCode = :productCode AND medicineId!= :productCode AND EXISTS ( SELECT 1 FROM addedMedsTable12 WHERE medicineId = :productCode ) AND EXISTS ( SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = :productCode)")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getOrgProductCodeToMerge(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 cart INNER JOIN addedSubsOrgInfo orgInfo ON cart.medicineId = orgInfo.subsMedProductCode AND cart.medicineId = :subsProductCode AND orgInfo.medicineId = :originalProductCode")
    public abstract int isProductInOrgInfoAdded(@org.jetbrains.annotations.NotNull()
    java.lang.String originalProductCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM reorder_alternate_subs WHERE SubsMedProductCode = :itemCode AND (isReplace = \'1\' OR isReplace = \'true\')")
    public abstract int isItemThereInReOrderReplace(@org.jetbrains.annotations.NotNull()
    java.lang.String itemCode);
    
    @androidx.room.Query(value = "select * from addedMedsTable12 ORDER BY (subsMedProductCode != medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode != \'\' AND subsMedProductCode != \'null\') DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> getMedsList();
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = :subsProductCode AND NOT EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = :orgProductCode )")
    public abstract int getCxOrgAdded(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "select 1 FROM addedMedsTable12 cart INNER JOIN addedSubsOrgInfo orgInfo ON cart.medicineId = orgInfo.medicineId where cart.medicineId = :orgProductCode ")
    public abstract int isSubsAddedAsWell(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "SELECT productDetailsId FROM addedMedsTable12 WHERE medicineId = :orgProductCode")
    public abstract long getProductsDetailId(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "SELECT prevOrderId FROM addedMedsTable12 WHERE medicineId = :orgProductCode")
    public abstract long getPrevOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "SELECT prevOrgProductId FROM addedMedsTable12 WHERE medicineId = :orgProductCode")
    public abstract long getPrevOrgProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "SELECT DISTINCT org.*, IFNULL(subs.addedQty, 0) AS subsAddedQty, IFNULL(subs.subsSellingPrice, org.subsSellingPrice) AS subsSellingPrice, IFNULL(subs.subsReccommendedQty, org.subsReccommendedQty) AS subsReccommendedQty, IFNULL(subs.maxCapped, org.maxCapped) AS subsMaxCapped, subs.product_image_urls as subsProductImage, IFNULL(subs.drugType, org.drugType) as subsDrugType, IFNULL(subs.originalPackSize, org.substitutePackSize) as subsPackSize, (CASE WHEN IFNULL(orgInfo.medicineId, \'\') = \'\' THEN \'false\' ELSE \'true\' END) AS isReplaced, IFNULL(replaceStatus.isAutoReplace, \'false\') as isAutoReplace, (CASE WHEN EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = org.medicineId) THEN 1 ELSE 2 END ) AS location2, ( CASE WHEN (org.subsMedProductCode != org.medicineId AND org.subsMedProductCode IS NOT NULL AND org.subsMedProductCode !=\'\' AND org.subsMedProductCode != \'null\' AND IFNULL(subs.addedQty, 0) = 0) THEN 1 ELSE 2 END ) AS location1 FROM addedMedsTable12 org  LEFT JOIN (SELECT *, in_orgInfo.medicineId as OrgId FROM addedMedsTable12 in_subs INNER JOIN addedSubsOrgInfo in_orgInfo ON in_subs.medicineId = in_orgInfo.subsMedProductCode) subs ON org.subsMedProductCode = subs.medicineId AND org.subsMedProductCode != org.medicineId AND IFNULL(org.subsMedProductCode, \'\') != \'\' AND org.subsMedProductCode != \'null\' AND org.medicineId = subs.OrgId LEFT JOIN addedSubsOrgInfo orgInfo ON org.medicineId = orgInfo.subsMedProductCode AND EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = orgInfo.medicineId) LEFT JOIN cartReplaceStatus replaceStatus ON org.medicineId = replaceStatus.medicineId WHERE orgInfo.medicineId IS NULL ORDER BY :orderByString ")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor fetchMedsOnCartPage(@org.jetbrains.annotations.NotNull()
    java.lang.String orderByString);
    
    @androidx.room.Query(value = "SELECT DISTINCT org.medicineId \nFROM addedMedsTable12 org  LEFT JOIN (SELECT *, in_orgInfo.medicineId as OrgId FROM addedMedsTable12 in_subs INNER JOIN addedSubsOrgInfo in_orgInfo ON in_subs.medicineId = in_orgInfo.subsMedProductCode) subs ON org.subsMedProductCode = subs.medicineId AND org.subsMedProductCode != org.medicineId AND IFNULL(org.subsMedProductCode, \'\') != \'\' AND org.subsMedProductCode != \'null\' AND org.medicineId = subs.OrgId LEFT JOIN addedSubsOrgInfo orgInfo ON org.medicineId = orgInfo.subsMedProductCode AND EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = orgInfo.medicineId) LEFT JOIN cartReplaceStatus replaceStatus ON org.medicineId = replaceStatus.medicineId WHERE orgInfo.medicineId IS NULL ORDER BY \n ( CASE WHEN (org.subsMedProductCode != org.medicineId AND org.subsMedProductCode IS NOT NULL AND org.subsMedProductCode !=\'\' AND org.subsMedProductCode != \'null\' AND IFNULL(subs.addedQty, 0) = 0) THEN 1 ELSE 2 END ) ASC, (CASE WHEN EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = org.medicineId) THEN 1 ELSE 2 END ) ASC;")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> fetchMedsSequenceOnCartPage();
    
    @androidx.room.Query(value = "SELECT * FROM addedMedsTable12 cart WHERE medicineId!= subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!=\'null\' AND subsMedProductCode!=\'\' AND NOT EXISTS (SELECT 1 FROM addedMedsTable12 WHERE medicineId = cart.subsMedProductCode)")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> getAddedMedListWithSubs();
    
    @androidx.room.Query(value = "SELECT Count(1) FROM cartReplaceStatus WHERE isAutoReplace=\'true\' AND isAutoReplace=\'1\'")
    public abstract int isAutoReplaceDone();
    
    @androidx.room.Query(value = "SELECT Count(1) FROM cartReplaceStatus WHERE medicineId = :medicineId")
    public abstract int isAutoReplace(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select * from addedSubsOrgInfo WHERE subsMedProductCode = :subsMedProductCode ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo> getAddedSubsOrgInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String subsMedProductCode);
    
    @androidx.room.Query(value = "select medicineId from cartItemSequence where medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMedIdFromCartSequence(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT * FROM addedMedsTable12 WHERE medicineId = :productCode  ORDER BY (subsMedProductCode!=medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode!=\'\' AND subsMedProductCode!=\'null\') DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getAddedMedInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = :orgProductCode ")
    public abstract int getAddedSubsMedCountFromMedicineId(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "SELECT cxAcceptedSubs FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    public abstract boolean getCxAcceptedSubsFromReorderSubsTable(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select SubsMedProductCode from reorder_alternate_subs where altSubsMedProductCode = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSubsMedCodeFromReorderSubsTable(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select medicineId, addedQty from addedMedsTable12")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getExistingCartItems();
    
    @androidx.room.Query(value = "SELECT Count(1) FROM reorder_alternate_subs WHERE SubsMedProductCode = :subsProductCode")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor checkSubExistsInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT altSubsMedProductCode FROM reorder_alternate_subs WHERE SubsMedProductCode = :subsProductCode ")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getAltReOrderSubsCode(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT subsMedName FROM addedMedsTable12 WHERE subsMedProductCode = :subsProductCode ")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getSubsName(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT altSubsMedName FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAltSubsMedName(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT altSubsUnit FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAltSubsUnit(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT altSubsPackSize FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    public abstract double getAltSubsPack(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT isAltSubAvailable FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    public abstract boolean getIsAltSubsAvailable(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT showOnlyOrg FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    public abstract boolean getShowOnlyOrg(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT altSubsMedProductCode FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAltSubsMedProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT altSubsCompanyName FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAltSubsCompanyName(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT altSubsMrp FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    public abstract double getAltSubsMrp(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT altSubsSellingPrice FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    public abstract double getAltSubsSellingPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT altSubsDiscountPercentage FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    public abstract double getAltSubsDiscountPercentage(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT isSubAvailable FROM reorder_alternate_subs WHERE SubsMedProductCode = :medicineId")
    public abstract boolean getAltSubsAvailable(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select isReplace from reorder_alternate_subs where medicineId = :medicineId")
    public abstract boolean getOrgReplaceStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select cxKeepOriginal from reorder_alternate_subs where medicineId = :medicineId")
    public abstract boolean getCxKeepOriginal(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select * from addedMedsTable12 WHERE medicineId = (SELECT subsMedProductCode FROM addedSubsOrgInfo WHERE medicineId = :orgProductCode)")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> getAddedSubsInfoByOrg(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "SELECT isSubAvailable FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean isSubsAvailableInReOrderAltSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT orgAvailable FROM addedMedsTable12 WHERE medicineId = :medicineId")
    public abstract boolean isOrgAvailableFromAddedMeds(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select * from AddedCrossSelling")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling> getAddedCrossSellingProducts();
    
    @androidx.room.Query(value = "SELECT Count(prevOrgProductId) FROM addedMedsTable12 WHERE prevOrgProductId > 0 ")
    public abstract int getPrevOrderIdItemCount();
    
    @androidx.room.Query(value = "select orgAvailable from addedSubsOrgInfo where subsMedProductCode = :medicineId")
    public abstract boolean getOrgAvailableFromOrgSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select medicineId from addedSubsOrgInfo where subsMedProductCode = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getReplacedMedId(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select medicineName from addedSubsOrgInfo where subsMedProductCode = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getReplacedMedName(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select subDiscountPercentage from addedSubsOrgInfo where subsMedProductCode = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSubsDiscountPercentage(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!=\'null\' AND subsMedProductCode!=\'\'")
    public abstract int isSubsItselfAddedToCart();
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 WHERE medicineId != subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!=\'null\' AND subsMedProductCode!=\'\'")
    public abstract int isOrgHavingSubsAddedToCart();
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 WHERE subsMedProductCode IS NULL OR subsMedProductCode =\'null\' OR subsMedProductCode=\'\'")
    public abstract int isOrgHavingNoSubsAddedToCart();
    
    @androidx.room.Query(value = "SELECT 1 FROM addedSubsOrgInfo")
    public abstract int isSubAddedFromOrgToCart();
    
    @androidx.room.Query(value = "select * from addedSubsOrgInfo WHERE medicineId = :medicineId ")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getAddedSubsOrgInfoFromOrgId(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT SubsMedProductCode FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getOrgInfoCodeInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT reasonId FROM doctor_confirmation_sub_options WHERE key_value = :value ")
    public abstract long getAllDoctorConfirmationSubOption(@org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    @androidx.room.Query(value = "select patientID, patientName, orderAddress, addressID, orderID from reorder_alternate_subs;")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getReorderPatientInfo();
    
    @androidx.room.Query(value = "select * from addedMedsTable12 WHERE medicineId NOT IN (SELECT medicineId FROM addedSubsOrgInfo)ORDER BY (subsMedProductCode!=medicineId AND subsMedProductCode IS NOT NULL AND subsMedProductCode!=\'\' AND subsMedProductCode!=\'null\') DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getAddedMedListNotInOrgInfo();
    
    @androidx.room.Query(value = "SELECT 1 FROM reorder_alternate_subs WHERE (SubsMedProductCode = :productCode OR altSubsMedProductCode = :productCode ) AND (isReplace = \'1\' OR isReplace = \'true\')")
    public abstract int isProductAddedAsReplacedInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "select productCode from recentlySearched where productCode = :productCode")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getProductCodeFromRecentlySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "select product_image_urls from addedMedsTable12 where medicineId=:medicineId ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getImageUrlFromAddedMeds(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select key_value from search_category where key_name = :key ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getKeyValueFromSearchCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @androidx.room.Query(value = "select key_value from search_category where key_name = :key LIMIT 1 COLLATE NOCASE")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getKeyValueFromSearchCategoryIgnoreCase(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @androidx.room.Query(value = "SELECT medicineId FROM reorder_alternate_subs WHERE medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMedicineIdFromReorderMed(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select medicineId from addedSubsOrgInfo where medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMedIdFromCartTable(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT * FROM addedMedsTable12 WHERE medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine getAddedMedDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT 1 FROM addedMedsTable12 WHERE medicineId = :subsProductCode AND EXISTS(SELECT 1 FROM addedSubsOrgInfo WHERE medicineId = :orgProductCode AND subsMedProductCode = :subsProductCode )")
    public abstract int isSubsAlsoAddedForOrg(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "select originalPackSize from addedSubsOrgInfo where medicineId = :medicineId")
    public abstract double getOriginalPackSizeFromOrgSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT medicineId, subsMedProductCode FROM addedMedsTable12 cart WHERE (medicineId!= subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!=\'null\' AND subsMedProductCode!=\'\' ) OR EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = cart.medicineId AND (orgAvailable=\'true\' OR orgAvailable=\'1\'))")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor isSubsAvailable();
    
    @androidx.room.Query(value = "SELECT medicineId, subsMedProductCode FROM addedMedsTable12 cart WHERE (medicineId NOT IN (:notInAddedMedicineIds) AND medicineId!= subsMedProductCode AND subsMedProductCode IS NOT NULL AND subsMedProductCode!=\'null\' AND subsMedProductCode!=\'\') OR EXISTS (SELECT 1 FROM addedSubsOrgInfo WHERE subsMedProductCode = cart.medicineId);")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor isSubsAvailableFromAddedMedId(@org.jetbrains.annotations.NotNull()
    java.lang.String notInAddedMedicineIds);
    
    @androidx.room.Query(value = "Select subImageUrl from reorder_alternate_subs where SubsMedProductCode = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSubImageUrlInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "Select subImageUrl from reorder_alternate_subs where medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSubImageUrlInReorderFromMedicineId(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "Select subsPitched from reorder_alternate_subs where medicineId = :medicineId")
    public abstract boolean getSubsPitchedInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "Select orgAddedQuantity from reorder_alternate_subs where medicineId = :medicineId")
    public abstract int getOrgAddedQtyFromReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "Select altSubsImageUrl from reorder_alternate_subs where medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAltSubsImageUrlFromReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "Select altSubsImageUrl from reorder_alternate_subs where SubsMedProductCode = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAltSubsImageUrlFromSubMed(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "Select altSubsSavingPercentage from reorder_alternate_subs where medicineId = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAltSubsSavingPercentage(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT prevOrgProductId FROM addedMedsTable12 WHERE prevOrgProductId = 0 ")
    public abstract long getEmptyPrevOrgProductId();
    
    @androidx.room.Query(value = "select * from raise_ticket")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getOrderTicketDetails();
    
    @androidx.room.Query(value = "select * from productImage where productCode = :productCode")
    @org.jetbrains.annotations.NotNull()
    public abstract android.database.Cursor getProductImages(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode);
    
    @androidx.room.Query(value = "select id from customer_category where categoryType = :category")
    public abstract long getCustomerCategoryId(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @androidx.room.Query(value = "select category from customer_category where categoryType = :categoryType")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCustomerCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryType);
    
    @androidx.room.Query(value = "select categoryType from customer_category")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getAllCustomerCategory();
    
    @androidx.room.Query(value = "select count(*) from AddedCrossSelling")
    public abstract int getAddedCrossSellingProductsCount();
    
    @androidx.room.Query(value = "select * from OrderFilter")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter> getFilterOrderList();
    
    @androidx.room.Query(value = "select * from customer_details where mobileNo= :mobileNo")
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails getCustomerDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo);
    
    @androidx.room.Query(value = "select reasonId from sub_opt_reasons where value= :value")
    public abstract int getSubOptReasonId(@org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    @androidx.room.Query(value = "SELECT sp.sellingPrice, cart.addedQty FROM addedMedsTable12 cart INNER JOIN cart_item_price sp ON cart.medicineId = sp.productCode AND orgAvailable = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.model.LocalCartDBSellingPriceCalculations> getCartTotalSellingPrice();
    
    @androidx.room.Query(value = "SELECT cart.mrp, cart.addedQty FROM addedMedsTable12 cart INNER JOIN cart_item_price sp ON cart.medicineId = sp.productCode AND orgAvailable = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.model.LocalCartDBMrpCalculations> getCartTotalMrpPrice();
    
    @androidx.room.Query(value = "SELECT subsMedProductCode FROM addedMedsTable12 WHERE subsMedProductCode != NULL AND subsMedProductCode!=\'\' AND subsMedProductCode!=\'null\' AND subsMedProductCode!=\'NULL\' GROUP BY subsMedProductCode HAVING COUNT(subsMedProductCode) > 1")
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDuplicateSubsFoundMedCode();
    
    @androidx.room.Query(value = "SELECT count(*) FROM addedMedsTable12 WHERE subsMedProductCode = :subsMedProductCode")
    public abstract int getCountOfDuplicateSubsFound(@org.jetbrains.annotations.NotNull()
    java.lang.String subsMedProductCode);
    
    @androidx.room.Query(value = "SELECT * FROM addedMedsTable12 WHERE subsMedProductCode = :subsProductCode AND medicineId != :subsProductCode")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> getMedicineListWIthSameSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertPatientNameList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.PatientNameEntity> patientNameEntity);
    
    @androidx.room.Query(value = "SELECT MAX(SaveDate) FROM patientName")
    public abstract long getLastDateForNameValidation();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM patientName WHERE PatientName = :inputString COLLATE NOCASE")
    public abstract int checkNameExist(@org.jetbrains.annotations.Nullable()
    java.lang.String inputString);
    
    @androidx.room.Query(value = "SELECT addedQty FROM addedSubsOrgInfo WHERE medicineId = :medicineId")
    public abstract int getSwitchBackCount(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "SELECT medicineId FROM addedMedsTable12")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getAddedMedProductCode();
    
    @androidx.room.Query(value = "SELECT DISTINCT medicineName FROM addedMedsTable12")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getAddedMedNames();
    
    @androidx.room.Query(value = "select * from addedSubsOrgInfo WHERE medicineId = :orgProductCode")
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo getAddedOrgInfoByOrgCode(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode);
    
    @androidx.room.Query(value = "select * from addedSubsOrgInfo WHERE subsMedProductCode = :subsMedCode")
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo getAddedOrgInfoBySubsCode(@org.jetbrains.annotations.NotNull()
    java.lang.String subsMedCode);
    
    @androidx.room.Query(value = "select * from addedSubsOrgInfo")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo> getAddedOrgInfoByList();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertReorderCrossSellingProduct(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedReorderCrossSelling addedCrossSelling);
    
    @androidx.room.Query(value = "SELECT Count(*) FROM TmContactVersion")
    public abstract int getSavedContactsCount();
    
    @androidx.room.Query(value = "select * from item_added_attributes where productCode = :medicineId")
    @org.jetbrains.annotations.NotNull()
    public abstract com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes getItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "delete from item_added_attributes where productCode = :medicineId")
    public abstract void deleteItemAddedAttribute(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId);
    
    @androidx.room.Query(value = "select section_heading from item_added_attributes")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getTrayDetailsOfItemAddedAttributes();
    
    @androidx.room.Query(value = "delete from item_added_attributes")
    public abstract void clearItemAddedAttributes();
    
    @androidx.room.Query(value = "select * from addedSubsOrgInfo where subsMedProductCode = :subsProductCode AND addedQty != 0")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo> fetchOrgMedsFromDBWhooseSubsWereSame(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode);
    
    @androidx.room.Query(value = "SELECT MAX(id) FROM customer_category")
    public abstract long getLastCustomerCategoryId();
}