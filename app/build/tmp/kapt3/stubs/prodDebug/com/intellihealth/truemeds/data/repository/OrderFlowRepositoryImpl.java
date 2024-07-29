package com.intellihealth.truemeds.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00de\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J2\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\u0018J,\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0096@\u00a2\u0006\u0002\u0010\u001cJr\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010&JH\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100*2\u0006\u0010 \u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010+J2\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010-JD\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010*2\u0006\u0010\u001b\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u00102JT\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00172\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\u0010\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u0001092\u0006\u0010:\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010;JL\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00107\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00172\b\u0010@\u001a\u0004\u0018\u00010\u0010H\u0096@\u00a2\u0006\u0002\u0010AJ,\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u0017H\u0096@\u00a2\u0006\u0002\u0010\u001cJ2\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010IJN\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0010\u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u0001092\b\u0010 \u001a\u0004\u0018\u00010\u00172\u0006\u0010M\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010NJ2\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010QJ2\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00172\u0006\u00107\u001a\u000206H\u0096@\u00a2\u0006\u0002\u0010TJ*\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\u001cJ,\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010X\u001a\u0004\u0018\u00010YH\u0096@\u00a2\u0006\u0002\u0010ZJb\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010\u00172\b\u0010H\u001a\u0004\u0018\u00010\u00172\u0006\u0010^\u001a\u0002062\b\u0010_\u001a\u0004\u0018\u0001062\u0006\u0010`\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u00172\b\u0010@\u001a\u0004\u0018\u00010\u0010H\u0096@\u00a2\u0006\u0002\u0010bJ2\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010IJ2\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\u0018J,\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096@\u00a2\u0006\u0002\u0010iJ`\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u00172\u0006\u0010^\u001a\u0002062\u0006\u0010`\u001a\u00020\u00172\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u0017092\u0006\u0010_\u001a\u0002062\u0006\u0010@\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010mJ8\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020\u00172\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00100*H\u0096@\u00a2\u0006\u0002\u0010qJ*\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010tJ*\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020v0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010tJ*\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010y\u001a\u00020zH\u0096@\u00a2\u0006\u0002\u0010{J*\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010tJ4\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u0017H\u0096@\u00a2\u0006\u0002\u0010\u007fJ6\u0010\u0080\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0081\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00102\b\u0010M\u001a\u0004\u0018\u00010\u0017H\u0096@\u00a2\u0006\u0002\u0010\u0018Jl\u0010\u0082\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u00172\u0007\u0010\u0084\u0001\u001a\u00020\u00172\u0007\u0010\u0085\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u0002062\u0006\u00105\u001a\u0002062\b\u0010@\u001a\u0004\u0018\u00010\u00102\u0007\u0010\u0087\u0001\u001a\u00020\u00172\u0007\u0010\u0088\u0001\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0003\u0010\u0089\u0001JM\u0010\u008a\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008b\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010\u00172\b\u0010]\u001a\u0004\u0018\u00010\u00172\b\u0010^\u001a\u0004\u0018\u0001062\b\u0010_\u001a\u0004\u0018\u000106H\u0096@\u00a2\u0006\u0003\u0010\u008c\u0001J\u0096\u0001\u0010\u008d\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u00172!\u0010\u008f\u0001\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0090\u0001j\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u0001`\u0091\u00012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020\u00122\u0007\u0010\u0093\u0001\u001a\u00020\u00122\t\u0010\u0094\u0001\u001a\u0004\u0018\u0001062\u0007\u0010\u0095\u0001\u001a\u00020\u00122\b\u0010@\u001a\u0004\u0018\u00010\u0010H\u0096@\u00a2\u0006\u0003\u0010\u0096\u0001Jx\u0010\u0097\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010*2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00122\u0007\u0010\u0093\u0001\u001a\u00020\u00122\u0007\u0010\u0094\u0001\u001a\u00020\u00102\b\u0010@\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0003\u0010\u0098\u0001JD\u0010\u0099\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009a\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0096@\u00a2\u0006\u0003\u0010\u009c\u0001J9\u0010\u009d\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096@\u00a2\u0006\u0003\u0010\u009f\u0001Jy\u0010\u00a0\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u0002010*2\u0006\u0010\u001f\u001a\u00020\u00172\t\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u00102\u0006\u0010%\u001a\u00020\u00122\u0007\u0010\u0093\u0001\u001a\u00020\u00122\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0003\u0010\u00a2\u0001J=\u0010\u00a3\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a4\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0003\u0010\u00a5\u0001J/\u0010\u00a6\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a7\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\t\u0010\u00a8\u0001\u001a\u0004\u0018\u00010YH\u0096@\u00a2\u0006\u0002\u0010ZJ>\u0010\u00a9\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u0002062\u0006\u0010\u001f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0003\u0010\u00aa\u0001JK\u0010\u00ab\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u00172\u0007\u0010\u00ac\u0001\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0003\u0010\u00ad\u0001J7\u0010\u00ae\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0007\u0010\u00af\u0001\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0003\u0010\u00b0\u0001JB\u0010\u00b1\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010M\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0017H\u0096@\u00a2\u0006\u0003\u0010\u009c\u0001JN\u0010\u00b2\u0001\u001a\u0011\u0012\r\u0012\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00b3\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0007\u0010\u00b4\u0001\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u00b5\u0001\u001a\u00030\u00b6\u00012\b\u0010@\u001a\u0004\u0018\u00010\u0010H\u0096@\u00a2\u0006\u0003\u0010\u00b7\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00b8\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/OrderFlowRepositoryImpl;", "Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;", "orderFlowRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderFlowRemoteDataSource;", "elasticMedicineRemoteDataSource", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/ElasticMedicineRemoteDataSource;", "apiCallInitClass", "Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;", "(Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderFlowRemoteDataSource;Lcom/intellihealth/truemeds/data/repository/datasource/remote/ElasticMedicineRemoteDataSource;Lcom/intellihealth/truemeds/data/utils/ApiCallInitClass;)V", "calculateBillDetailsforApp", "Lcom/intellihealth/truemeds/data/utils/Resource;", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "orderId", "", "paymentSelectionInfo", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePaymentMode", "Lokhttp3/ResponseBody;", "paymentModeId", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPincodeServiceability", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "pincode", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmOrder", "paymentId", "offerId", "customerId", "paymentMethod", "paymentMethodId", "orderConfirmSrc", "sourceVersion", "checkAutoConfirmEligibility", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImages", "edit", "images", "", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JZLjava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardOrder", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editMedicine", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveMedsCreateEditOrderResponse;", "medicineDto", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllOrdersOfCustomers", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel;", "page", "", "result", "statusIds", "", "patientIds", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;IILjava/util/Set;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCouponData", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse;", "offerType", "categoryType", "variantId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchIconMaster", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse;", "iconType", "fetchMedicineDetails", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsResultResponse;", "productCd", "warehouseId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchReOrderOTCProductV1", "Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse;", "productCodes", "patientId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/util/Set;Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAddress", "Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOffers", "Lcom/intellihealth/truemeds/data/model/orderflow/AllOffersResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPrescriptionByCustomerId", "Lcom/intellihealth/truemeds/data/model/orderflow/AllPrescriptionByCustomerResponse;", "getClickPostReturnLink", "obj", "Lcom/google/gson/JsonObject;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrossSellingRecommendedProducts", "Lcom/intellihealth/truemeds/data/model/productlistanddetails/CrossSellingRecommendedProductResponse;", "sessionToken", "pageNumber", "pageSize", "type", "productCode", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerOrderDetail", "Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse;", "getCustomerOrderDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetCustomerOrderDetails;", "getDoctorDetails", "Lcom/intellihealth/truemeds/data/model/doctordetails/DoctorDetails;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastMinuteResponse", "Lcom/intellihealth/truemeds/data/model/ordersummary/LastMinutePurchaseResponse;", "subType", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyOrders", "orderType", "patientList", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderMedicineDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderMedicineDetails;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderRx", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse;", "getOtcProductsForCategories", "Lcom/intellihealth/truemeds/presentation/model/OtcCategoriesForProductsResponse;", "request", "Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDetails", "Lcom/intellihealth/truemeds/presentation/model/GetAllPatientModel;", "Lcom/intellihealth/truemeds/data/model/orderflow/GetPatientDetailsResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrescriptionDetails", "Lcom/intellihealth/truemeds/presentation/model/GetAllPrescriptionDataModel;", "getSearchResults", "Lcom/intellihealth/truemeds/presentation/model/SearchResultResponse;", "elasticSearchType", "searchString", "sizeCount", "searchVariant", "isMultiSearch", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Long;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingSearches", "Lcom/intellihealth/truemeds/data/model/search/TrendingSearchResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reOrder", "Lcom/intellihealth/truemeds/data/model/home/ReorderResponse;", "patientListDto", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "variant", "newAlgo", "serialId", "reOrderMedCheck", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replaceMedicineForIncompleteOrder", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddressForOrder", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveAddressForOrderResponse;", "addressId", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCouponCode", "couponCode", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMedsAndCreateOrder", "variantID", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentAndCouponForOrder", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDoctorRating", "Lcom/intellihealth/truemeds/data/model/orderstatus/DoctorRating;", "ratingData", "setPaymentModeForAnOrder", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPaymentSelectionMethod", "paymentMode", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPspViewedByCustomer", "isPspViewed", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePatientIdInSubOrder", "uploadImage", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRxImageForCustomerIdResponse;", "pinCode", "uploadImageModel", "Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public final class OrderFlowRepositoryImpl implements com.intellihealth.truemeds.domain.repository.OrderFlowRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.repository.datasource.remote.OrderFlowRemoteDataSource orderFlowRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource elasticMedicineRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass = null;
    
    @javax.inject.Inject()
    public OrderFlowRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.remote.OrderFlowRemoteDataSource orderFlowRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource elasticMedicineRemoteDataSource, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.utils.ApiCallInitClass apiCallInitClass) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveMedsAndCreateOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantID, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Long serialId, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object replaceMedicineForIncompleteOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, boolean checkAutoConfirmEligibility, boolean newAlgo, long serialId, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object editMedicine(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOrderMedicineDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetOrderMedicineDetails>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerOrderDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetCustomerOrderDetails>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOrderRx(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPatientDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setPaymentModeForAnOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, int paymentId, long offerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String pinCode, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest uploadImageModel, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveRxImageForCustomerIdResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllPrescriptionByCustomerId(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.AllPrescriptionByCustomerResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllOffers(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, int result, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.AllOffersResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object savePaymentAndCouponForOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveCouponCode(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveAddressForOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long addressId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveAddressForOrderResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updatePatientIdInSubOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchIconMaster(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String iconType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setPaymentSelectionMethod(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, long paymentMode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setPspViewedByCustomer(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, boolean isPspViewed, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object confirmOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentId, @org.jetbrains.annotations.Nullable()
    java.lang.String offerId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String orderConfirmSrc, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceVersion, boolean checkAutoConfirmEligibility, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object discardOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<java.lang.String>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getDoctorDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.doctordetails.DoctorDetails>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setDoctorRating(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject ratingData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.DoctorRating>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getClickPostReturnLink(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject obj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object changePaymentMode(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentModeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object calculateBillDetailsforApp(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, boolean paymentSelectionInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchAllOrdersOfCustomers(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> statusIds, @org.jetbrains.annotations.NotNull()
    java.lang.String patientIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getMyOrders(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String orderType, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> patientList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object reOrder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Long> patientListDto, @org.jetbrains.annotations.Nullable()
    java.lang.String variant, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serialId, boolean reOrderMedCheck, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.ReorderResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSearchResults(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    java.lang.String elasticSearchType, @org.jetbrains.annotations.NotNull()
    java.lang.String searchString, int sizeCount, int page, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    java.lang.String searchVariant, boolean isMultiSearch, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.presentation.model.SearchResultResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTrendingSearches(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.search.TrendingSearchResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchMedicineDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String productCd, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchCouponData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, int result, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    java.lang.String offerType, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllAddress(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerOrderDetail(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLastMinuteResponse(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, int pageNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, int pageSize, long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.LastMinutePurchaseResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCrossSellingRecommendedProducts(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String sessionToken, @org.jetbrains.annotations.Nullable()
    java.lang.String warehouseId, int pageNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String productCode, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOtcProductsForCategories(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchReOrderOTCProductV1(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, long patientId, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.OTCResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkPincodeServiceability(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, @org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteImages(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long orderId, boolean edit, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> images, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<okhttp3.ResponseBody>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPrescriptionDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPatientDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.intellihealth.truemeds.data.utils.Resource<retrofit2.Response<com.intellihealth.truemeds.presentation.model.GetAllPatientModel>>> $completion) {
        return null;
    }
}