package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009e\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0086@\u00a2\u0006\u0002\u0010\u0017J(\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u001fJT\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\u001c\b\u0002\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0018\u00010\'j\n\u0012\u0004\u0012\u00020(\u0018\u0001`)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-H\u0086@\u00a2\u0006\u0002\u0010.Jp\u0010/\u001a\u00020\u000e2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u00100\u001a\u00020%2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00101\u001a\u00020%2\u001c\b\u0002\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0018\u00010\'j\n\u0012\u0004\u0012\u00020(\u0018\u0001`)2\u0006\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020-2\u0006\u0010,\u001a\u00020-J*\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020%052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0002\u00106JN\u00107\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010=\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u0010>J6\u0010?\u001a\u00020@2\u0006\u00108\u001a\u0002092\u0006\u0010$\u001a\u00020%2\u0006\u0010A\u001a\u00020%2\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0002\u0010BJ\u0017\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0002\u0010FJ\u001e\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010IJ>\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u00142\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001d0N2\u0006\u0010O\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u0010PJ&\u0010Q\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0002\u0010RJ.\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020V0NH\u0086@\u00a2\u0006\u0002\u0010WJ \u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u0010ZJ \u0010[\u001a\u0004\u0018\u00010\\2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020^H\u0086@\u00a2\u0006\u0002\u0010_J(\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0002\u0010bJ\u0016\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020dH\u0086@\u00a2\u0006\u0002\u0010fJ\u0010\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010E\u001a\u00020\u001dJV\u0010i\u001a\u0004\u0018\u00010j2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010k\u001a\u00020%2\b\u0010l\u001a\u0004\u0018\u00010%2\u0006\u0010m\u001a\u0002092\b\u0010n\u001a\u0004\u0018\u0001092\u0006\u0010o\u001a\u00020%2\u0006\u0010H\u001a\u00020%2\b\u0010p\u001a\u0004\u0018\u00010\u001dH\u0086@\u00a2\u0006\u0002\u0010qJ\u000e\u0010r\u001a\u00020\u000e2\u0006\u0010s\u001a\u00020\u0014J(\u0010t\u001a\u0004\u0018\u00010u2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u0010vJ\u001e\u0010w\u001a\u00020x2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0002\u00106J*\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010O\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u0010{J \u0010|\u001a\u0004\u0018\u00010}2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0002\u00106J\f\u0010~\u001a\b\u0012\u0004\u0012\u00020%0NJ!\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0002\u00106J-\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020\u001d2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010%H\u0086@\u00a2\u0006\u0002\u0010vJ\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J@\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0007\u0010\u0088\u0001\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%2\u0006\u0010m\u001a\u0002092\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0003\u0010\u008b\u0001JG\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010N2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010l\u001a\u0004\u0018\u00010%2\b\u0010k\u001a\u0004\u0018\u00010%2\b\u0010m\u001a\u0004\u0018\u0001092\b\u0010n\u001a\u0004\u0018\u000109H\u0086@\u00a2\u0006\u0003\u0010\u008e\u0001J\u0019\u0010\u008f\u0001\u001a\u00020\u000e2\u0007\u0010\u0090\u0001\u001a\u00020%H\u0086@\u00a2\u0006\u0003\u0010\u0091\u0001Jy\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00012\u000e\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010N2\u000e\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010N2\u0007\u0010\u009a\u0001\u001a\u0002092\u0007\u0010\u009b\u0001\u001a\u00020%2\u0007\u0010\u009c\u0001\u001a\u00020\u001d2\u0007\u0010\u009d\u0001\u001a\u00020%2\t\b\u0002\u0010\u009e\u0001\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0003\u0010\u009f\u0001Jc\u0010\u00a0\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020%052\u0007\u0010\u00a1\u0001\u001a\u00020%2\u0007\u0010\u00a2\u0001\u001a\u00020%2\u0007\u0010\u00a3\u0001\u001a\u00020%2\u0007\u0010\u00a4\u0001\u001a\u00020\u00142\b\u0010\u00a5\u0001\u001a\u00030\u00a6\u00012\u000e\u0010\u00a7\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010N2\u0007\u0010\u00a8\u0001\u001a\u0002092\u0007\u0010\u00a9\u0001\u001a\u000209J5\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00ab\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u00ac\u0001\u001a\u00020%2\u0007\u0010\u00ad\u0001\u001a\u00020%H\u0086@\u00a2\u0006\u0003\u0010\u00ae\u0001Jg\u0010\u00af\u0001\u001a\u0004\u0018\u00010T2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\r\u0010\u00b0\u0001\u001a\b\u0012\u0004\u0012\u00020V0N2\u0006\u0010:\u001a\u00020%2\u0007\u0010\u00ad\u0001\u001a\u00020%2\u0007\u0010\u00b1\u0001\u001a\u00020\u00142\u0007\u0010\u00b2\u0001\u001a\u00020\u00142\u0007\u0010\u00b3\u0001\u001a\u00020\u001d2\b\u0010p\u001a\u0004\u0018\u00010\u001dH\u0086@\u00a2\u0006\u0003\u0010\u00b4\u0001J3\u0010\u00b5\u0001\u001a\u0004\u0018\u0001092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u00b6\u0001\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020%H\u0086@\u00a2\u0006\u0003\u0010\u00b7\u0001Jp\u0010\u00b8\u0001\u001a\u0004\u0018\u00010T2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001d2\r\u0010\u00b9\u0001\u001a\b\u0012\u0004\u0012\u00020V0N2\u0007\u0010\u00ad\u0001\u001a\u00020%2\b\u0010p\u001a\u0004\u0018\u00010\u001d2\u0007\u0010\u00b1\u0001\u001a\u00020\u00142\u0007\u0010\u00b2\u0001\u001a\u00020\u00142\u0007\u0010\u00b3\u0001\u001a\u00020\u001d2\u0007\u0010\u0090\u0001\u001a\u00020%H\u0086@\u00a2\u0006\u0003\u0010\u00ba\u0001J`\u0010\u00bb\u0001\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020%2\b\u0010\u00b9\u0001\u001a\u00030\u00bc\u00012\u0007\u0010\u00ad\u0001\u001a\u00020%2\u0007\u0010\u00bd\u0001\u001a\u00020\u001d2\u0007\u0010\u00b1\u0001\u001a\u00020\u00142\u0007\u0010\u00b2\u0001\u001a\u00020\u00142\u0007\u0010\u00b3\u0001\u001a\u0002092\u0007\u0010\u0090\u0001\u001a\u00020%H\u0086@\u00a2\u0006\u0003\u0010\u00be\u0001J,\u0010\u00bf\u0001\u001a\u00030\u00c0\u00012\u0007\u0010\u00c1\u0001\u001a\u0002092\u0007\u0010\u00c2\u0001\u001a\u00020K2\u0007\u0010\u00c3\u0001\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0003\u0010\u00c4\u0001J\u0010\u0010\u00c5\u0001\u001a\u00020\u000e2\u0007\u0010\u00c6\u0001\u001a\u00020%J2\u0010\u00c7\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u00ac\u0001\u001a\u00020\u001d2\u0007\u0010\u00ad\u0001\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0003\u0010\u00c8\u0001J\u0007\u0010\u00c9\u0001\u001a\u00020\u001dJ;\u0010\u00ca\u0001\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u00cb\u0001\u001a\u00020\u001d2\u0007\u0010\u00cc\u0001\u001a\u00020%2\u0007\u0010\u009a\u0001\u001a\u00020\u001dH\u0086@\u00a2\u0006\u0003\u0010\u00cd\u0001J\u0018\u0010\u00ce\u0001\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0003\u0010\u00cf\u0001J\u001b\u0010\u00d0\u0001\u001a\u00030\u00d1\u00012\b\u0010\u00d2\u0001\u001a\u00030\u00d1\u00012\u0007\u0010\u00d3\u0001\u001a\u00020%J%\u0010\u00d4\u0001\u001a\u0005\u0018\u00010\u00d5\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u00d6\u0001\u001a\u00030\u00d7\u0001H\u0086@\u00a2\u0006\u0003\u0010\u00d8\u0001J3\u0010\u00d9\u0001\u001a\u0004\u0018\u0001092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0007\u0010\u0083\u0001\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020%H\u0086@\u00a2\u0006\u0003\u0010\u00b7\u0001J!\u0010\u00da\u0001\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020%2\u0007\u0010\u00db\u0001\u001a\u000209H\u0086@\u00a2\u0006\u0003\u0010\u00dc\u0001JB\u0010\u00dd\u0001\u001a\u0005\u0018\u00010\u00de\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0007\u0010\u0090\u0001\u001a\u00020%2\b\u0010O\u001a\u0004\u0018\u00010%2\b\u0010\u00df\u0001\u001a\u00030\u00e0\u00012\b\u0010p\u001a\u0004\u0018\u00010\u001dH\u0086@\u00a2\u0006\u0003\u0010\u00e1\u0001R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00e2\u0001"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/OrderFlowUseCase;", "", "orderFlowRepository", "Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;", "userDataRepository", "Lcom/intellihealth/truemeds/domain/repository/UserDataRepository;", "localDbUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;", "sdkEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;", "context", "Landroid/content/Context;", "(Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;Lcom/intellihealth/truemeds/domain/repository/UserDataRepository;Lcom/intellihealth/truemeds/domain/usecase/LocalDbUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/SdkEventUseCase;Landroid/content/Context;)V", "addMedicineToCart", "", "orgMedicine", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;", "subsMedicine", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;", "isSubs", "", "itemAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAdded;", "(Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/CartMedicine;Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/OrgSubsInfo;ZLcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAdded;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateBillDetailsforApp", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "orderId", "", "paymentSelectionInfo", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateSavingAmount", "Lcom/intellihealth/truemeds/data/model/coupon/CouponResponse;", "coupon", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "clickedOnPage", "", "medicineListDataReceived", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineListDetailsSent;", "Lkotlin/collections/ArrayList;", "billDetailsData", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "currentPayableAmount", "", "(Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;Ljava/lang/String;Ljava/util/ArrayList;Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callCouponAppliedEventForOfflineCouponCase", "clickedOnPag", "discountAmountApiResponse", "mrpTotalAmount", "cartMedicineDiscount", "changeToCod", "Lkotlin/Pair;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmOrder", "lastPaymentMode", "", "loggedInUserId", "lastPaymentMethod", "lastPaymentMethodId", "lastPaymentMethodUrl", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmOrderValidation", "Lcom/intellihealth/truemeds/data/model/orderflow/ConfirmOrderUseCaseResponse;", "lastPaymentMethodIconUrl", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertMillisToDate", "Ljava/util/Date;", "millis", "(Ljava/lang/Long;)Ljava/util/Date;", "deleteMedicineFromCart", "productCode", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePrescription", "Lokhttp3/ResponseBody;", "edit", "images", "", "customerId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JZLjava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardOrder", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editMedicine", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveMedsCreateEditOrderResponse;", "list", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMedicineDetails", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsMain;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOtcProductsForCategories", "Lcom/intellihealth/truemeds/presentation/model/OtcCategoriesForProductsResponse;", "request", "Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAddress", "Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillDetailsFromOrderDetails", "Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$FinalCalcAmt;", "finalCalcAmt", "(Lcom/intellihealth/truemeds/data/model/home/OrderDetailsResponse$FinalCalcAmt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCalendarData", "Ljava/util/Calendar;", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "sessionToken", "warehouseId", "pageNumber", "pageSize", "type", "variantId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIncompleteOrderArray", "callConfirmOrder", "getOrderDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetCustomerOrderDetails;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderMedicineDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderMedicineDetails;", "getOrderPatientDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetPatientDetailsResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderRx", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse;", "getOriginalMedicineList", "getPatientDetails", "Lcom/intellihealth/truemeds/presentation/model/GetAllPatientModel;", "getPrescriptionsDetails", "Lcom/intellihealth/truemeds/presentation/model/GetAllPrescriptionDataModel;", "patientId", "getReorderData", "Lcom/intellihealth/truemeds/data/model/orderflow/ReorderStatusData;", "getSearchResults", "Lcom/intellihealth/truemeds/presentation/model/SearchResultElasticResponse;", "query", "elasticSearchType", "isMultiSearch", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingSearches", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse$TrendingSearch;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newCheckPinCode", "pinCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeOrder", "Lcom/intellihealth/truemeds/data/model/ResponseCodeModel;", "cartList", "", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "cartMedicineListResponse", "prescriptions", "Lcom/intellihealth/truemeds/data/model/orderflow/OrderRxInfo;", "paymentMode", "selectedPaymentMethod", "selectedPaymentMethodId", "selectedPaymentMethodIconUrl", "isConfirmOrder", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/String;JLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processValidationForPsp", "patientID", "patientName", "orderAddress", "isOrderAddressServiceable", "mrpValue", "", "prescriptionUploadedImgList", "totalOutOfStockCount", "notDeliverableCount", "removeCouponCode", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "paymentId", "offerId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replaceMedicineForIncompleteOrder", "medList", "checkAutoConfirmEligibility", "newAlgo", "srcType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZZJLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddressForOrder", "addressId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMedsAndCreateOrder", "array", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/Long;ZZJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMedsAndCreateOrderWithCategoryId", "Lcom/google/gson/JsonArray;", "processingFeeVariantId", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonArray;Ljava/lang/String;JZZILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setErrorResponseBody", "Lcom/intellihealth/truemeds/data/utils/ResponseData;", "errorCode", "errorBody", "isNetworkError", "(ILokhttp3/ResponseBody;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setEstimatedDeliveryDate", "edd", "setOfferIdForOrder", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPaymentMode", "setPaymentSelectionMethod", "paymentMethodId", "paymentMethod", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJLjava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserCategoryApiCall", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showBillDetails", "Lcom/intellihealth/salt/models/BillDetailsModel;", "cartBillDetailsModel", "className", "submitDoctorRating", "Lcom/intellihealth/truemeds/data/model/orderstatus/DoctorRating;", "jsonObject", "Lcom/google/gson/JsonObject;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tagPatientIdWithOrder", "updateCartMedicineCount", "qty", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRxImageForCustomerIdResponse;", "uploadImageModel", "Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class OrderFlowUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.UserDataRepository userDataRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public OrderFlowUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.UserDataRepository userDataRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LocalDbUseCase localDbUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase sdkEventUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * This api creates the order and returns orderId in response
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveMedsAndCreateOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> array, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, boolean checkAutoConfirmEligibility, boolean newAlgo, long srcType, @org.jetbrains.annotations.NotNull()
    java.lang.String pinCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse> $completion) {
        return null;
    }
    
    /**
     * This api creates the order and returns orderId in response
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveMedsAndCreateOrderWithCategoryId(@org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonArray array, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, long processingFeeVariantId, boolean checkAutoConfirmEligibility, boolean newAlgo, int srcType, @org.jetbrains.annotations.NotNull()
    java.lang.String pinCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object tagPatientIdWithOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long patientId, @org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveAddressForOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long addressId, @org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    /**
     * Get Details of the orderId like
     * 1) Product Details List
     * 2) Payment Mode selected (Online or COD)
     * 3) Bill details
     * 4) Address Details
     * 5) Order Status
     * 6) Payment Method Selected Information from PSP screen (method, methodid, url, lastpaymentmethod etc)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.GetCustomerOrderDetails> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderMedicineDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.GetOrderMedicineDetails> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBillDetailsFromOrderDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.FinalCalcAmt finalCalcAmt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.home.OrderDetailsResponse.FinalCalcAmt> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderPatientDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderRx(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.ReorderStatusData getReorderData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object editMedicine(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object replaceMedicineForIncompleteOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medList, @org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, boolean checkAutoConfirmEligibility, boolean newAlgo, long srcType, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object discardOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeCouponCode(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object confirmOrderValidation(int lastPaymentMode, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.NotNull()
    java.lang.String lastPaymentMethodIconUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String lastPaymentMethod, long lastPaymentMethodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.ConfirmOrderUseCaseResponse> $completion) {
        return null;
    }
    
    /**
     * 1) API to confirm the order, orderId is confirmed once the API returns success
     * 2) Before calling this API, the orderId is still in incomplete state where we can access orderId by calling
     * SharedPrefManager.getInstance().incompleteOrderId
     * 3) On Success of this API, we assign SharedPrefManager.getInstance().incompleteOrderId = 0
     * 4) We also clear the added medicines from the local storage
     * 5) This API is used in OrderSummary, ReOrder, PSP screen
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object confirmOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, int lastPaymentMode, @org.jetbrains.annotations.NotNull()
    java.lang.String loggedInUserId, @org.jetbrains.annotations.NotNull()
    java.lang.String lastPaymentMethod, long lastPaymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.NotNull()
    java.lang.String lastPaymentMethodUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object placeOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> cartMedicineListResponse, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> prescriptions, int paymentMode, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedPaymentMethod, long selectedPaymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedPaymentMethodIconUrl, boolean isConfirmOrder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.ResponseCodeModel> $completion) {
        return null;
    }
    
    private final java.lang.Object setUserCategoryApiCall(com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final long setPaymentMode() {
        return 0L;
    }
    
    /**
     * 1) Whenever user clicks on apply/remove offer in Cart,OrderSummary,Reorder screen we call this API
     * 2) This API is also used in PSP screen when user tries to change the coupon specific payment method(eg. UPI)
     * 3) Only when user tries to remove coupon we pass 0L for offerId paramater, else we pass the offerId for that associated coupon
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setOfferIdForOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long paymentId, long offerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * 1) User has the option to change the online payment mode to COD if payment is failed
     * 2) If user has selected online payment mode and has not done payment for 24 hrs, the payment mode
     * gets automatically converted to COD
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object changeToCod(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> $completion) {
        return null;
    }
    
    /**
     * 1) User has the option to change the online payment mode to COD if payment is failed
     * 2) If user has selected online payment mode and has not done payment for 24 hrs, the payment mode
     * gets automatically converted to COD
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object calculateBillDetailsforApp(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, boolean paymentSelectionInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse> $completion) {
        return null;
    }
    
    /**
     * This function is used for setting the estimated delivery date for the address already available
     */
    public final void setEstimatedDeliveryDate(@org.jetbrains.annotations.NotNull()
    java.lang.String edd) {
    }
    
    /**
     * As the name suggests the order is not confirmed, its in incomplete state,
     * these are the medicines which are present in the cart or in our local storage
     */
    public final void getIncompleteOrderArray(boolean callConfirmOrder) {
    }
    
    /**
     * Check if the pincode passed is serviceable or not
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object newCheckPinCode(@org.jetbrains.annotations.NotNull()
    java.lang.String pinCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setErrorResponseBody(int errorCode, @org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody errorBody, boolean isNetworkError, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.ResponseData> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.BillDetailsModel showBillDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.BillDetailsModel cartBillDetailsModel, @org.jetbrains.annotations.NotNull()
    java.lang.String className) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOriginalMedicineList() {
        return null;
    }
    
    /**
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addMedicineToCart(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine orgMedicine, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo subsMedicine, boolean isSubs, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded itemAdded, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteMedicineFromCart(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, boolean isSubs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateCartMedicineCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode, int qty, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSearchResults(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, int pageNumber, boolean isMultiSearch, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.presentation.model.SearchResultElasticResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTrendingSearches(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String pinCode, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest uploadImageModel, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderflow.SaveRxImageForCustomerIdResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchMedicineDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.presentation.model.MedicineDetailsMain> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchOtcProductsForCategories(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCrossSellingRecommendedProducts(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, int pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllAddress(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.ordersummary.AddressResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object calculateSavingAmount(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon coupon, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> medicineListDataReceived, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData, double currentPayableAmount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.coupon.CouponResponse> $completion) {
        return null;
    }
    
    public final void callCouponAppliedEventForOfflineCouponCase(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPag, @org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon coupon, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String discountAmountApiResponse, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> medicineListDataReceived, double mrpTotalAmount, double cartMedicineDiscount, double currentPayableAmount) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Calendar getCalendarData(long millis) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date convertMillisToDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long millis) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deletePrescription(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, boolean edit, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> images, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Boolean, java.lang.String> processValidationForPsp(@org.jetbrains.annotations.NotNull()
    java.lang.String patientID, @org.jetbrains.annotations.NotNull()
    java.lang.String patientName, @org.jetbrains.annotations.NotNull()
    java.lang.String orderAddress, boolean isOrderAddressServiceable, float mrpValue, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> prescriptionUploadedImgList, int totalOutOfStockCount, int notDeliverableCount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setPaymentSelectionMethod(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long paymentMethodId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod, long paymentMode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPatientDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.presentation.model.GetAllPatientModel> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrescriptionsDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object submitDoctorRating(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.model.orderstatus.DoctorRating> $completion) {
        return null;
    }
}