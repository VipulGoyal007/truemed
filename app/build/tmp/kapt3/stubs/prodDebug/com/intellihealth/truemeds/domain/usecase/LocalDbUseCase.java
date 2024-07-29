package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0014\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001fJ&\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000e\u0010+\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010,J\u000e\u0010-\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010,J\u000e\u0010.\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010,J\u000e\u0010/\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010,J\u000e\u00100\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010,J\u000e\u00101\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010,J\u0016\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000e\u00105\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010,J\u0018\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\"0:H\u0086@\u00a2\u0006\u0002\u0010,J\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0:H\u0082@\u00a2\u0006\u0002\u0010,J\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150:2\u0006\u0010=\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000e\u0010>\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010,J\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020@0:H\u0086@\u00a2\u0006\u0002\u0010,J\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0:H\u0086@\u00a2\u0006\u0002\u0010,J\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\"0:H\u0086@\u00a2\u0006\u0002\u0010,J\u0016\u0010C\u001a\u00020\u00182\u0006\u00102\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00180:H\u0086@\u00a2\u0006\u0002\u0010,J\u0016\u0010E\u001a\u00020\u00152\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u0010F\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u0010H\u001a\u00020)2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180:2\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u0010J\u001a\u00020)2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0014\u0010K\u001a\b\u0012\u0004\u0012\u00020\"0:H\u0086@\u00a2\u0006\u0002\u0010,J\u000e\u0010L\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010,J\u0016\u0010M\u001a\u00020)2\u0006\u0010N\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000e\u0010O\u001a\u00020PH\u0086@\u00a2\u0006\u0002\u0010,J2\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0:2\u0006\u0010V\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010XJ2\u0010Y\u001a\b\u0012\u0004\u0012\u00020S0R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0:2\u0006\u00104\u001a\u00020\"2\u0006\u0010Z\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010[J2\u0010\\\u001a\b\u0012\u0004\u0012\u00020S0R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0:2\u0006\u00104\u001a\u00020\"2\u0006\u0010Z\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010[J$\u0010]\u001a\b\u0012\u0004\u0012\u00020S0R2\u0006\u00104\u001a\u00020\"2\u0006\u0010Z\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010^J\u000e\u0010_\u001a\u00020PH\u0086@\u00a2\u0006\u0002\u0010,J\u000e\u0010`\u001a\u00020PH\u0086@\u00a2\u0006\u0002\u0010,J\u0016\u0010a\u001a\u00020)2\u0006\u0010#\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u0010b\u001a\u00020\"2\u0006\u00106\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u0010c\u001a\u00020d2\u0006\u00106\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u0010e\u001a\u00020\b2\u0006\u0010f\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u001e\u0010g\u001a\u00020)2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010hJ&\u0010g\u001a\u0004\u0018\u00010U2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020U0:2\u0006\u00104\u001a\u00020\"H\u0082@\u00a2\u0006\u0002\u0010jJ\u000e\u0010k\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010,J*\u0010l\u001a\u001e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020)0mj\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020)`nH\u0086@\u00a2\u0006\u0002\u0010,J\u0016\u0010o\u001a\u00020\"2\u0006\u0010p\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0016\u0010q\u001a\u00020r2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000e\u0010s\u001a\u00020\"2\u0006\u0010t\u001a\u00020\"J\u000e\u0010u\u001a\u00020dH\u0086@\u00a2\u0006\u0002\u0010,J\u000e\u0010v\u001a\u00020dH\u0086@\u00a2\u0006\u0002\u0010,J,\u0010w\u001a\u00020S2\u0006\u0010x\u001a\u00020\u00182\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0:2\u0006\u0010y\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010zJ,\u0010{\u001a\u00020S2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U0:2\u0006\u0010\u0007\u001a\u00020U2\u0006\u0010Z\u001a\u00020)H\u0082@\u00a2\u0006\u0002\u0010|J\u001c\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00180:2\u0006\u0010#\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0014\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0:H\u0086@\u00a2\u0006\u0002\u0010,J\u0017\u0010\u0080\u0001\u001a\u00020)2\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0017\u0010\u0081\u0001\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0017\u0010\u0082\u0001\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u001f\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0:2\u0007\u0010\u0084\u0001\u001a\u00020dH\u0086@\u00a2\u0006\u0003\u0010\u0085\u0001J\u0017\u0010\u0086\u0001\u001a\u00020d2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000f\u0010\u0087\u0001\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010,J\u0015\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0:H\u0086@\u00a2\u0006\u0002\u0010,J\u0017\u0010\u0089\u0001\u001a\u00020d2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\"0:J\u0015\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0:H\u0086@\u00a2\u0006\u0002\u0010,J\u0017\u0010\u008c\u0001\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000f\u0010\u008d\u0001\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010,J \u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010:2\u0007\u0010\u0084\u0001\u001a\u00020dH\u0086@\u00a2\u0006\u0003\u0010\u0085\u0001J\u0018\u0010\u0090\u0001\u001a\u00020)2\u0007\u0010\u0091\u0001\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0017\u0010\u0092\u0001\u001a\u00020)2\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000f\u0010\u0093\u0001\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010,J\u0015\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180:H\u0086@\u00a2\u0006\u0002\u0010,J\u0017\u0010\u0095\u0001\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0017\u0010\u0096\u0001\u001a\u00020)2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0015\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\"0:H\u0086@\u00a2\u0006\u0002\u0010,J\u001a\u0010\u0098\u0001\u001a\u00020\u00062\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0086@\u00a2\u0006\u0003\u0010\u009b\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u00062\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0086@\u00a2\u0006\u0003\u0010\u009f\u0001J \u0010\u00a0\u0001\u001a\u00020\u00062\u000e\u0010\u00a1\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a2\u00010:H\u0086@\u00a2\u0006\u0003\u0010\u00a3\u0001J\u0017\u0010\u00a4\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0018\u0010\u00a5\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020rH\u0086@\u00a2\u0006\u0003\u0010\u00a6\u0001J\u001f\u0010\u00a7\u0001\u001a\u00020\u00062\r\u0010\u00a8\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0:H\u0086@\u00a2\u0006\u0003\u0010\u00a3\u0001J\u0017\u0010\u00a9\u0001\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J \u0010\u00aa\u0001\u001a\u00020\u00062\u000e\u0010\u00ab\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ac\u00010:H\u0086@\u00a2\u0006\u0003\u0010\u00a3\u0001J\u0019\u0010\u00ad\u0001\u001a\u00020\u00062\u0007\u0010\u00ae\u0001\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0003\u0010\u00af\u0001J\u001a\u0010\u00b0\u0001\u001a\u00020\u00062\b\u0010\u00b1\u0001\u001a\u00030\u008f\u0001H\u0086@\u00a2\u0006\u0003\u0010\u00b2\u0001J \u0010\u00b3\u0001\u001a\u00020\u00062\u000e\u0010\u00b4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b5\u00010:H\u0086@\u00a2\u0006\u0003\u0010\u00a3\u0001J \u0010\u00b6\u0001\u001a\u00020\u00062\u000e\u0010\u00b7\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b8\u00010:H\u0086@\u00a2\u0006\u0003\u0010\u00a3\u0001J \u0010\u00b9\u0001\u001a\u00020\u00062\u000e\u0010\u00ba\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a2\u00010:H\u0086@\u00a2\u0006\u0003\u0010\u00a3\u0001J\u0017\u0010\u00bb\u0001\u001a\u00020)2\u0006\u00102\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u000f\u0010\u00bc\u0001\u001a\u00020)H\u0082@\u00a2\u0006\u0002\u0010,J\u000f\u0010\u00bd\u0001\u001a\u00020)H\u0082@\u00a2\u0006\u0002\u0010,J\u000f\u0010\u00be\u0001\u001a\u00020)H\u0082@\u00a2\u0006\u0002\u0010,J\u000f\u0010\u00bf\u0001\u001a\u00020)H\u0082@\u00a2\u0006\u0002\u0010,J\u000f\u0010\u00c0\u0001\u001a\u00020)H\u0082@\u00a2\u0006\u0002\u0010,J\u0017\u0010\u00c1\u0001\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0017\u0010\u00c2\u0001\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J\u0017\u0010\u00c3\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J \u0010\u00c4\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0003\u0010\u00c5\u0001J\u0017\u0010\u00c6\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010\'J*\u0010\u00c7\u0001\u001a\u00020\u00062\u0007\u0010\u00c8\u0001\u001a\u00020\"2\u0007\u0010\u00c9\u0001\u001a\u00020\"2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0003\u0010\u00ca\u0001J \u0010\u00cb\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"2\u0007\u0010\u00cc\u0001\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010^J!\u0010\u00cd\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"2\u0007\u0010\u00ce\u0001\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0003\u0010\u00c5\u0001J!\u0010\u00cf\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"2\u0007\u0010\u00d0\u0001\u001a\u00020dH\u0086@\u00a2\u0006\u0003\u0010\u00d1\u0001J!\u0010\u00d2\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"2\u0007\u0010\u00d3\u0001\u001a\u00020dH\u0086@\u00a2\u0006\u0003\u0010\u00d1\u0001J!\u0010\u00d4\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"2\u0007\u0010\u00d5\u0001\u001a\u00020dH\u0086@\u00a2\u0006\u0003\u0010\u00d1\u0001J!\u0010\u00d6\u0001\u001a\u00020\u00062\u0007\u0010\u00d7\u0001\u001a\u00020P2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0003\u0010\u00d8\u0001J\u001f\u0010\u00d9\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0086@\u00a2\u0006\u0002\u0010hJ!\u0010\u00da\u0001\u001a\u00020\u00062\u0007\u0010\u00db\u0001\u001a\u00020d2\u0006\u00104\u001a\u00020\"H\u0086@\u00a2\u0006\u0003\u0010\u00dc\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00dd\u0001"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;", "", "localDbRepository", "Lcom/intellihealth/truemeds/domain/repository/LocalDbRepository;", "(Lcom/intellihealth/truemeds/domain/repository/LocalDbRepository;)V", "addCustomerDetails", "", "item", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addPillReminder", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PillReminder;", "addRecentlySearchMed", "recentMedicine", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/RecentMedicine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addReferReminder", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ReferReminder;", "addReorderAlternateMedicine", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ReorderAlternateSubs;", "addSubsInfo", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToCart", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "orgSubsInfo", "isSubs", "", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addVariant", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerCategory;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CustomerCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAlreadyAddedAsSubs", "orgProductCode", "", "subsProductCode", "fromOrderSummary", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAlreadyAddedSubsAsOrg", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkNameExist", "", "name", "clearCart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCrossSellingProducts", "clearItemAddedAttributes", "deleteAllRecentlySearchMeds", "deleteCartItemSequence", "deleteCartReplaceStatus", "medicineId", "deleteItemAddedAttributesUsingProductCode", "productCode", "deleteOfflineDbData", "categoryType", "deleteRecentlySearchForCustomerId", "accessToken", "fetchCartMedicines", "", "fetchMedsSequenceOnCartPage", "fetchOrgMedsFromDBWhooseSubsWereSame", "subsMedProductCode", "getAddedCrossSellingProductCount", "getAddedCrossSellingProducts", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/AddedCrossSelling;", "getAddedMedNames", "getAddedMedProductCode", "getAddedMedicineDetails", "getAddedMedicines", "getAddedOrgInfoByOrgCode", "getAddedOrgInfoBySubsCode", "subsCode", "getAddedQtyOfAddedMedicine", "getAddedSubsInfoByOrg", "getAddedSubsMedCountFromMedicineId", "getAllCustomerCategory", "getCartCount", "getCartCountFromRecentlySearch", "medicineName", "getCartMedicineDiscount", "", "getCartMedicineDto", "", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "cartList", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "newOrder", "isReplaceAll", "(Ljava/util/List;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCartMedicineDtoFromProductCode", "qty", "(Ljava/util/List;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCartMedicineDtoFromProductCodeByAPI", "getCartMedicineDtoFromProductCodeForSwitchBack", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCartTotalMrpPrice", "getCartTotalSellingPrice", "getCountOfDuplicateSubsFound", "getCustomerCategory", "getCustomerCategoryId", "", "getCustomerDetails", "mobileNo", "getCxOrgAdded", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDuplicateSubsFoundMedCode", "getExistingCartMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getInSectionForSearch", "keyName", "getItemAddedAttributes", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ItemAddedEventAttributes;", "getKeyValueFromSearchCategoryIgnoreCase", "key", "getLastCustomerCategoryId", "getLastDateForNameValidation", "getMedicineDto", "model", "addOgPdId", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMedicineDto1", "(Ljava/util/List;Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMedicineListWIthSameSubs", "getOrderFilterList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrderFilter;", "getOrgCountFromSubsMed", "getOrgProductCodeFromSubs", "getOrgProductCodeToMerge", "getPillReminderUsingOrderId", "orderId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrevOrderId", "getPrevOrderIdItemCount", "getPreviouslySearch", "getProductDetailsId", "getReOrderPatientInfo", "getRecentlySearch", "getReplaceMedAddedInCart", "getSavedContactsCount", "getSavedVideOFAQ", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SaveVideoFAQ;", "getSubOptReasonId", "value", "getSubsAddedAsWell", "getSubsIdOfOrder", "getSubsMedicineList", "getSubsProductCodeAfterDelete", "getSwitchBackCount", "getTrayDetailsOfItemAddedAttributes", "insertCartReplaceStatus", "cartReplaceStatus", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartReplaceStatus;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartReplaceStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCartSellingPrice", "cartItemSellingPrice", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartItemSellingPrice;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartItemSellingPrice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertContactList", "contactEntityList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/TmContactVersion;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCrossSellingProduct", "insertItemAddedAttributes", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/ItemAddedEventAttributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrderFilterDetails", "orderFilterList", "insertOrgSubFromCart", "insertPatientNameEntity", "patientNameEntity", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PatientNameEntity;", "insertPillReminder", "pillReminder", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PillReminder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSaveVideoFAQ", "saveVideoFAQ", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SaveVideoFAQ;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSearchType", "searchCategoryList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SearchCategory;", "insertSubOptReasons", "subOptReasonsList", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SubOptReasons;", "insertTmContactDetails", "tmContacts", "isAutoReplace", "isAutoReplaceDone", "isOrgHavingNoSubsAddedToCart", "isOrgHavingSubsAddedToCart", "isSubAddedFromOrgToCart", "isSubsItselfAddedToCart", "productAsReplaceInReorder", "productReplacedInReorder", "removeCrossSellingProductUsingId", "removeItemFromCart", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeOrgSubsMapping", "updateImageAndDrugTypeInRecentMeds", "image", "drugType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMedicineQuantity", "addedQty", "updateOrgAvailable", "available", "updatePrevOrderId", "prevOrderId", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrevProductDetailsId", "prevProductDetailsId", "updateProductDetailsId", "productDetailsId", "updateSellingPrice", "sellingPrice", "(DLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSubsMedProductCode", "updateTimeInRecentSearch", "time", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class LocalDbUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.LocalDbRepository localDbRepository = null;
    
    @javax.inject.Inject()
    public LocalDbUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.LocalDbRepository localDbRepository) {
        super();
    }
    
    /**
     * Add product in offline DB
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addToCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine item, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo orgSubsInfo, boolean isSubs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Adds ORG-SUBS mapping in DB is customer added subs product in Cart
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addSubsInfo(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedMedicines(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartMedicineDto(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartList, boolean newOrder, boolean isReplaceAll, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartMedicineDtoFromProductCode(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartList, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int qty, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartMedicineDtoFromProductCodeByAPI(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartList, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int qty, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto>> $completion) {
        return null;
    }
    
    private final java.lang.Object getCxOrgAdded(java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> list, java.lang.String productCode, kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.presentation.model.ProductInfoModel> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartMedicineDtoFromProductCodeForSwitchBack(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int qty, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto>> $completion) {
        return null;
    }
    
    private final java.lang.Object getMedicineDto1(java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartList, com.intellihealth.truemeds.presentation.model.ProductInfoModel item, int qty, kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.MedicineDto> $completion) {
        return null;
    }
    
    private final java.lang.Object getMedicineDto(com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine model, java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartList, boolean addOgPdId, kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.MedicineDto> $completion) {
        return null;
    }
    
    /**
     * If customer orders medicine 'A' and selected 'B' on Dr call
     * Now, while doing reorder if subs medicine becomes unavailable
     * In the above scenario if ORG med has another subs medicine available which is 'C'
     * So, we need to insert medicine 'C' in our DB table
     */
    public final void addReorderAlternateMedicine(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs item) {
    }
    
    /**
     * add reminder of order placed items
     */
    public final void addPillReminder(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder item) {
    }
    
    /**
     * add reminder of referral program in DB
     */
    public final void addReferReminder(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.ReferReminder item) {
    }
    
    /**
     * add variant category
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addVariant(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerCategoryId(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllCustomerCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertOrderFilterDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter> orderFilterList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSearchType(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory> searchCategoryList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTmContactDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion> tmContacts, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * remove medicine from cart
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeItemFromCart(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, boolean isSubs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeOrgSubsMapping(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * update medicine quantity on addition and substraction
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateMedicineQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int addedQty, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProductDetailsId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, long productDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePrevOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, long prevOrderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePrevProductDetailsId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, long prevProductDetailsId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSubsMedProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * fetch medicine quantity from
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateOrgAvailable(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, boolean available, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getReOrderPatientInfo() {
        return null;
    }
    
    /**
     * delete customer category from table
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteOfflineDbData(@org.jetbrains.annotations.Nullable()
    java.lang.String categoryType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRecentlySearch(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPreviouslySearch(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCrossSellingProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedCrossSellingProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.AddedCrossSelling>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedCrossSellingProductCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrevOrderIdItemCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSavedContactsCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearCrossSellingProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeCrossSellingProductUsingId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedQtyOfAddedMedicine(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkAlreadyAddedAsSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, boolean fromOrderSummary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkAlreadyAddedSubsAsOrg(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object productReplacedInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object productAsReplaceInReorder(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteRecentlySearchForCustomerId(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllRecentlySearchMeds(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateImageAndDrugTypeInRecentMeds(@org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String drugType, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateTimeInRecentSearch(long time, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartCountFromRecentlySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addRecentlySearchMed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine recentMedicine, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSellingPrice(double sellingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCartSellingPrice(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice cartItemSellingPrice, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSubOptReasons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons> subOptReasonsList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubOptReasonId(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteOfflineDbData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderFilterList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getInSectionForSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCxOrgAdded(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubsAddedAsWell(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubsMedicineList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearCart(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPillReminderUsingOrderId(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPillReminder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder pillReminder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertOrgSubFromCart(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSavedVideOFAQ(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertSaveVideoFAQ(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ saveVideoFAQ, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertContactList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion> contactEntityList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartTotalSellingPrice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartTotalMrpPrice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductDetailsId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getReplaceMedAddedInCart(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubsProductCodeAfterDelete(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrgCountFromSubsMed(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrgProductCodeToMerge(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedSubsInfoByOrg(@org.jetbrains.annotations.NotNull()
    java.lang.String orgProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPatientNameEntity(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.PatientNameEntity> patientNameEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLastDateForNameValidation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkNameExist(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isAutoReplace(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCartReplaceStatus(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartReplaceStatus cartReplaceStatus, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCartReplaceStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCartReplaceStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedSubsMedCountFromMedicineId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExistingCartMap(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, java.lang.Integer>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSwitchBackCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrgProductCodeFromSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrevOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedMedProductCode(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedMedNames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedOrgInfoByOrgCode(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedOrgInfoBySubsCode(@org.jetbrains.annotations.NotNull()
    java.lang.String subsCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteItemAddedAttributesUsingProductCode(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyValueFromSearchCategoryIgnoreCase(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddedMedicineDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String medicineId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTrayDetailsOfItemAddedAttributes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    private final java.lang.Object isSubsItselfAddedToCart(kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final java.lang.Object isOrgHavingSubsAddedToCart(kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final java.lang.Object isOrgHavingNoSubsAddedToCart(kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final java.lang.Object isSubAddedFromOrgToCart(kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubsIdOfOrder(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDuplicateSubsFoundMedCode(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCountOfDuplicateSubsFound(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMedicineListWIthSameSubs(@org.jetbrains.annotations.NotNull()
    java.lang.String subsProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine>> $completion) {
        return null;
    }
    
    private final java.lang.Object isAutoReplaceDone(kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    private final java.lang.Object deleteCartItemSequence(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object fetchMedsSequenceOnCartPage(kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchCartMedicines(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartMedicineDiscount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchOrgMedsFromDBWhooseSubsWereSame(@org.jetbrains.annotations.NotNull()
    java.lang.String subsMedProductCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLastCustomerCategoryId(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
}