package com.intellihealth.truemeds.data.repository.datasource.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000e\u0010(\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010)\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010*\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010+\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010,\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010-\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000e\u00101\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000e\u00104\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u00105\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000e\u00108\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u00109\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190;2\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000e\u0010=\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010>\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00100;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010A\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\f0;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010C\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010D\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0;2\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010F\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190;2\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00100;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000e\u0010K\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010L\u001a\u00020MH\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010N\u001a\u00020MH\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010O\u001a\u00020&2\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0014\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010R\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010S\u001a\u00020T2\u0006\u00100\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u001e\u0010W\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010X\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u001cJ*\u0010Y\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&0Zj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&`[H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\\\u001a\u00020\u00102\u0006\u0010]\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010^\u001a\u00020_2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0010\u0010`\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u0010H\u0016J\u000e\u0010b\u001a\u00020TH\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010c\u001a\u00020TH\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020\f0;2\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0014\u0010e\u001a\b\u0012\u0004\u0012\u00020f0;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010g\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010h\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020j0;2\u0006\u0010k\u001a\u00020TH\u0096@\u00a2\u0006\u0002\u0010lJ\u0016\u0010m\u001a\u00020T2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000e\u0010n\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010o\u001a\u00020T2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010q\u001a\u00020T2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010s\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000e\u0010t\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020v0;2\u0006\u0010k\u001a\u00020TH\u0096@\u00a2\u0006\u0002\u0010lJ\u0016\u0010w\u001a\u00020&2\u0006\u0010x\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0014\u0010y\u001a\b\u0012\u0004\u0012\u00020\f0;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010z\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0016\u0010{\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0014\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00100;H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010}\u001a\u00020\u00062\u0006\u0010~\u001a\u00020\u007fH\u0096@\u00a2\u0006\u0003\u0010\u0080\u0001J\u001a\u0010\u0081\u0001\u001a\u00020\u00062\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0096@\u00a2\u0006\u0003\u0010\u0084\u0001J \u0010\u0085\u0001\u001a\u00020\u00062\u000e\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010;H\u0096@\u00a2\u0006\u0003\u0010\u0088\u0001J\u0019\u0010\u0089\u0001\u001a\u00020\u00062\u0007\u0010\u008a\u0001\u001a\u00020QH\u0096@\u00a2\u0006\u0003\u0010\u008b\u0001J\u001a\u0010\u008c\u0001\u001a\u00020\u00062\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0096@\u00a2\u0006\u0003\u0010\u008f\u0001J\u0019\u0010\u0090\u0001\u001a\u00020\u00062\u0007\u0010\u008d\u0001\u001a\u00020_H\u0096@\u00a2\u0006\u0003\u0010\u0091\u0001J\u001f\u0010\u0092\u0001\u001a\u00020\u00062\r\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020f0;H\u0096@\u00a2\u0006\u0003\u0010\u0088\u0001J\u0017\u0010\u0094\u0001\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J \u0010\u0095\u0001\u001a\u00020\u00062\u000e\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010;H\u0096@\u00a2\u0006\u0003\u0010\u0088\u0001J\u0019\u0010\u0098\u0001\u001a\u00020\u00062\u0007\u0010\u0099\u0001\u001a\u00020jH\u0096@\u00a2\u0006\u0003\u0010\u009a\u0001J\u0019\u0010\u009b\u0001\u001a\u00020\u00062\u0007\u0010\u009c\u0001\u001a\u00020vH\u0096@\u00a2\u0006\u0003\u0010\u009d\u0001J \u0010\u009e\u0001\u001a\u00020\u00062\u000e\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a0\u00010;H\u0096@\u00a2\u0006\u0003\u0010\u0088\u0001J \u0010\u00a1\u0001\u001a\u00020\u00062\u000e\u0010\u00a2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a3\u00010;H\u0096@\u00a2\u0006\u0003\u0010\u0088\u0001J \u0010\u00a4\u0001\u001a\u00020\u00062\u000e\u0010\u00a5\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010;H\u0096@\u00a2\u0006\u0003\u0010\u0088\u0001J\u0017\u0010\u00a6\u0001\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000f\u0010\u00a7\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000f\u0010\u00a8\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000f\u0010\u00a9\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u000f\u0010\u00aa\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010\u00ab\u0001\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u000f\u0010\u00ac\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010\u00ad\u0001\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0017\u0010\u00ae\u0001\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0017\u0010\u00af\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0018\u0010\u00b0\u0001\u001a\u00020\u00062\u0007\u0010\u00b1\u0001\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\u0018\u0010\u00b2\u0001\u001a\u00020\u00062\u0007\u0010\u00b3\u0001\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010$J\"\u0010\u00b4\u0001\u001a\u00020\u00062\u0007\u0010\u00b3\u0001\u001a\u00020\u00102\u0007\u0010\u00b5\u0001\u001a\u00020&H\u0096@\u00a2\u0006\u0003\u0010\u00b6\u0001J*\u0010\u00b7\u0001\u001a\u00020\u00062\u0007\u0010\u00b8\u0001\u001a\u00020\u00102\u0007\u0010\u00b9\u0001\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0003\u0010\u00ba\u0001J!\u0010\u00bb\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0007\u0010\u00bc\u0001\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0003\u0010\u00bd\u0001J!\u0010\u00be\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0007\u0010\u00bf\u0001\u001a\u00020TH\u0096@\u00a2\u0006\u0003\u0010\u00c0\u0001J!\u0010\u00c1\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0007\u0010\u00c2\u0001\u001a\u00020TH\u0096@\u00a2\u0006\u0003\u0010\u00c0\u0001J!\u0010\u00c3\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0007\u0010\u00c4\u0001\u001a\u00020TH\u0096@\u00a2\u0006\u0003\u0010\u00c0\u0001J!\u0010\u00c5\u0001\u001a\u00020\u00062\u0007\u0010\u00c6\u0001\u001a\u00020M2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0003\u0010\u00c7\u0001J\u001f\u0010\u00c8\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0012J!\u0010\u00c9\u0001\u001a\u00020\u00062\u0007\u0010\u00ca\u0001\u001a\u00020T2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0003\u0010\u00cb\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00cc\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/local/LocalDbRepositoryImpl;", "Lcom/intellihealth/truemeds/domain/repository/LocalDbRepository;", "appDao", "Lcom/intellihealth/truemeds/data/repository/datasource/local/TruemedsDao;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/TruemedsDao;)V", "addCustomerDetails", "", "customerDetails", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addItemToCart", "medicine", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addProductImage", "productCode", "", "productImage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addRecentlySearchedMedicine", "recentMedicine", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSubOrgInfo", "orgSubsInfo", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addVideoFaq", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAlreadyAddedAsSubs", "", "orgProductCode", "subsProductCode", "fromOrderSummary", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAlreadyAddedSubsAsOrg", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkNameExist", "", "name", "clearAddedCrossSellingTable", "clearCartTable", "clearItemAddedAttributes", "deleteAllRecentlySearchMeds", "deleteCartItemSequence", "deleteCartReplaceStatus", "medicineId", "deleteCustomerCategory", "categoryType", "deleteCustomerDetails", "deleteItemAddedAttributesUsingProductCode", "productId", "deleteOfflineDbData", "deleteOrderFilterDetails", "deleteRecentlySearchForCustomerId", "accessToken", "deleteSearchTypeMaster", "deleteTmContactDetails", "fetchMedsSequenceOnCartPage", "", "fetchOrgMedsFromDBWhooseSubsWereSame", "getAddedCrossSellingProductCount", "getAddedMedDetails", "getAddedMedNames", "getAddedMedProductCode", "getAddedMedicineCount", "getAddedMedicines", "getAddedOrgInfoByOrgCode", "getAddedOrgInfoBySubCode", "getAddedSubsInfoByOrg", "getAddedSubsMedCountFromMedicineId", "getAddedSubsOrgInfo", "getAllCustomerCategory", "getCartCountFromRecentlySearch", "medicineName", "getCartItemCount", "getCartTotalMrpPrice", "", "getCartTotalSellingPrice", "getCountOfDuplicateSubsFound", "getCrossSellingProduct", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/AddedCrossSelling;", "getCustomerCategory", "getCustomerCategoryId", "", "getCustomerDetails", "mobileNo", "getCxOrgAdded", "getDuplicateSubsFoundMedCode", "getExistingCartItems", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getInSectionValueOfSearch", "keyName", "getItemAddedAttributes", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ItemAddedEventAttributes;", "getKeyValueFromSearchCategoryIgnoreCase", "key", "getLastCustomerCategoryId", "getLastDateForNameValidation", "getMedicineListWIthSameSubs", "getOrderFilterList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrderFilter;", "getOrgProductCodeFromSubs", "getOrgProductCodeToMerge", "getPillReminderUsingOrderId", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PillReminder;", "orderId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrevOrderId", "getPrevOrderIdItemCount", "getPrevProductId", "getPreviouslySearch", "getProductDetailsId", "getRecentSearch", "getReplaceMedAddedInCart", "getSavedContactsCount", "getSavedVideOFAQ", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SaveVideoFAQ;", "getSubOptReasonId", "value", "getSubsMedicineList", "getSubsProductCodeAfterDelete", "getSwitchBackCount", "getTrayDetailsOfItemAddedAttributes", "insertCartReplaceStatus", "cartReplaceStatus", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartReplaceStatus;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartReplaceStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCartSellingPrice", "cartItemSellingPrice", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartItemSellingPrice;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartItemSellingPrice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertContactList", "contactEntityList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/TmContactVersion;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCrossSellingProduct", "addedCrossSelling", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/AddedCrossSelling;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCustomerCategory", "item", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerCategory;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertItemAddedAttributes", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ItemAddedEventAttributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrderFilterDetails", "orderFilterList", "insertOrgSubFromCart", "insertPatientNameEntity", "patientNameEntity", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PatientNameEntity;", "insertPillReminder", "pillReminder", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PillReminder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSaveVideoFAQ", "saveVideoFAQ", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SaveVideoFAQ;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSearchTypeMaster", "searchCategoryList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SearchCategory;", "insertSubOptReasons", "subOptReasons", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SubOptReasons;", "insertTmContactDetails", "tmContactVersions", "isAutoReplace", "isAutoReplaceDone", "isOrgHavingNoSubsAddedToCart", "isOrgHavingSubsAddedToCart", "isSubAddedFromOrgToCart", "isSubsAddedAsWell", "isSubsItselfAddedToCart", "productAsReplaceInReorder", "productReplacedInReorder", "removeAddedCrossSellingUsingId", "removeMedicineItem", "originalProductCode", "removeOrgSubsInfo", "originalPrdCode", "updateAddedMedicine", "addedQty", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateImageAndDrugTypeInRecentSearchMed", "image", "drugType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrgAvailableStatus", "available", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrevOrderId", "prevOrderId", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrevProductDetailsId", "prevProductDetailsId", "updateProductDetailsId", "productDetailsId", "updateSellingPrice", "sellingPrice", "(DLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSubsMedProductCode", "updateTimeInRecentSearchMed", "time", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class LocalDbRepositoryImpl implements com.intellihealth.truemeds.domain.repository.LocalDbRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao appDao = null;
    
    @javax.inject.Inject()
    public LocalDbRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao appDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addItemToCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine medicine, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCartItemCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateAddedMedicine(@org.jetbrains.annotations.NotNull()
    java.lang.String originalPrdCode, int addedQty, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object removeMedicineItem(@org.jetbrains.annotations.NotNull()
    java.lang.String originalProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object removeOrgSubsInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String originalPrdCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addSubOrgInfo(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo orgSubsInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addVideoFaq(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addRecentlySearchedMedicine(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine recentMedicine, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addProductImage(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    java.lang.String productImage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails customerDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertOrderFilterDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter> orderFilterList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteOrderFilterDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertSearchTypeMaster(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory> searchCategoryList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteSearchTypeMaster(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertTmContactDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion> tmContactVersions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteTmContactDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getRecentSearch(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPreviouslySearch(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedMedicines(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertCrossSellingProduct(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling addedCrossSelling, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCrossSellingProduct(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedCrossSellingProductCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPrevOrderIdItemCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSavedContactsCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOrderFilterList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearAddedCrossSellingTable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object removeAddedCrossSellingUsingId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedMedicineCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkAlreadyAddedAsSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, boolean fromOrderSummary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkAlreadyAddedSubsAsOrg(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object productReplacedInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object productAsReplaceInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteRecentlySearchForCustomerId(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteAllRecentlySearchMeds(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateImageAndDrugTypeInRecentSearchMed(@org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String drugType, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateTimeInRecentSearchMed(long time, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCartCountFromRecentlySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateSellingPrice(double sellingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertCartSellingPrice(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice cartItemSellingPrice, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertSubOptReasons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons> subOptReasons, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSubOptReasonId(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteOfflineDbData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteCustomerDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getInSectionValueOfSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCxOrgAdded(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isSubsAddedAsWell(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateProductDetailsId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, long productDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updatePrevOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, long prevOrderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updatePrevProductDetailsId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, long prevProductDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateSubsMedProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSubsMedicineList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedMedDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedSubsOrgInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getProductDetailsId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPrevOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPrevProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearCartTable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateOrgAvailableStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, boolean available, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPillReminderUsingOrderId(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertPillReminder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder pillReminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertOrgSubFromCart(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSavedVideOFAQ(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertSaveVideoFAQ(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ saveVideoFAQ, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertContactList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion> contactEntityList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCartTotalSellingPrice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCartTotalMrpPrice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getReplaceMedAddedInCart(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSubsProductCodeAfterDelete(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertPatientNameEntity(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.PatientNameEntity> patientNameEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLastDateForNameValidation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkNameExist(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isAutoReplace(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteCartReplaceStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteCartReplaceStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertCartReplaceStatus(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartReplaceStatus cartReplaceStatus, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedSubsInfoByOrg(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOrgProductCodeToMerge(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedSubsMedCountFromMedicineId(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertCustomerCategory(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerCategoryId(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllCustomerCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteCustomerCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getExistingCartItems(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, java.lang.Integer>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSwitchBackCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOrgProductCodeFromSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedMedProductCode(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedMedNames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTrayDetailsOfItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedOrgInfoByOrgCode(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAddedOrgInfoBySubCode(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getDuplicateSubsFoundMedCode(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCountOfDuplicateSubsFound(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getMedicineListWIthSameSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteItemAddedAttributesUsingProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getKeyValueFromSearchCategoryIgnoreCase(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isSubsItselfAddedToCart(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isOrgHavingSubsAddedToCart(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isOrgHavingNoSubsAddedToCart(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isSubAddedFromOrgToCart(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isAutoReplaceDone(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteCartItemSequence(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchMedsSequenceOnCartPage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchOrgMedsFromDBWhooseSubsWereSame(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLastCustomerCategoryId(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
}