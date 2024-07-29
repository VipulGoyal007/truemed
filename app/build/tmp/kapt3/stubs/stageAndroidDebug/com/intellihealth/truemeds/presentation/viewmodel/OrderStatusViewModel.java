package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b2\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0081\u00032\u00020\u00012\u00020\u0002:\u0002\u0081\u0003BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u001a\u0010\u00ae\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020v2\u0007\u0010\u00b1\u0002\u001a\u000203J\b\u0010\u00b2\u0002\u001a\u00030\u00b3\u0002J\u0011\u0010\u00b4\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020vJ\u0011\u0010\u00b5\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020vJ\u0013\u0010\u00b6\u0002\u001a\u0005\u0018\u00010\u00b7\u00022\u0007\u0010\u00b8\u0002\u001a\u000203Jy\u0010\u00b9\u0002\u001a\u00020+2\b\u0010\u00ba\u0002\u001a\u00030\u00bb\u00022\u0007\u0010\u00bc\u0002\u001a\u0002032\u0007\u0010\u00bd\u0002\u001a\u0002032\u0007\u0010\u00be\u0002\u001a\u0002032\u0007\u0010\u00bf\u0002\u001a\u0002032\u0007\u0010\u00c0\u0002\u001a\u0002032\u0007\u0010\u00c1\u0002\u001a\u0002032\b\u0010\u00c2\u0002\u001a\u00030\u0094\u00022\u0007\u0010\u00c3\u0002\u001a\u00020\u00162\u001b\u0010\u00c4\u0002\u001a\u0016\u0012\u0005\u0012\u00030\u00c5\u00020\u009d\u0001j\n\u0012\u0005\u0012\u00030\u00c5\u0002`\u00c6\u0002H\u0002J\u001a\u0010\u00c7\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020v2\u0007\u0010\u00b1\u0002\u001a\u000203J\u0011\u0010\u00c8\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020vJ\u0011\u0010\u00c9\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00ca\u0002\u001a\u000203J\u0013\u0010\u00cb\u0002\u001a\u00030\u00af\u00022\t\u0010\u00cc\u0002\u001a\u0004\u0018\u00010/J\b\u0010\u00cd\u0002\u001a\u00030\u00af\u0002J\u0011\u0010\u00ce\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020vJ\u0013\u0010\u00cf\u0002\u001a\u00030\u00af\u00022\t\u0010\u00cc\u0002\u001a\u0004\u0018\u00010/J\u0011\u0010\u00d0\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020vJ\b\u0010\u00d1\u0002\u001a\u00030\u00c3\u0001J\u0011\u0010\u00d2\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020vJ\u0011\u0010\u00d3\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00e4\u0001\u001a\u00020vJ\u0083\u0001\u0010\u00d4\u0002\u001a\u00030\u00d5\u00022\t\u0010\u00b0\u0002\u001a\u0004\u0018\u00010v2\t\u0010\u00d6\u0002\u001a\u0004\u0018\u0001032!\u0010\u00d7\u0002\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010v\u0018\u00010\u009d\u0001j\r\u0012\u0006\u0012\u0004\u0018\u00010v\u0018\u0001`\u00c6\u00022\t\u0010\u00d8\u0002\u001a\u0004\u0018\u0001032\u0007\u0010\u00d9\u0002\u001a\u00020\u00162\u0007\u0010\u00da\u0002\u001a\u00020\u00162\t\u0010\u00db\u0002\u001a\u0004\u0018\u00010H2\u0007\u0010\u00dc\u0002\u001a\u00020\u00162\t\u0010\u00dd\u0002\u001a\u0004\u0018\u00010v\u00a2\u0006\u0003\u0010\u00de\u0002J\u0011\u0010\u00df\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020vJ\u0012\u0010\u00e0\u0002\u001a\u00030\u00af\u00022\b\u0010\u00e1\u0002\u001a\u00030\u00e2\u0002J\u0012\u0010\u00e3\u0002\u001a\u00030\u00af\u00022\b\u0010\u00e4\u0002\u001a\u00030\u00e5\u0002J\b\u0010\u00e6\u0002\u001a\u00030\u00e7\u0002J-\u0010\u00e8\u0002\u001a\u00030\u00d5\u00022\t\b\u0002\u0010\u00d6\u0002\u001a\u0002032\u000b\b\u0002\u0010\u00e9\u0002\u001a\u0004\u0018\u0001032\u000b\b\u0002\u0010\u00ea\u0002\u001a\u0004\u0018\u000103J\u0015\u0010\u00eb\u0002\u001a\u00030\u00af\u00022\t\u0010\u00e9\u0002\u001a\u0004\u0018\u000103H\u0002J\b\u0010\u00ec\u0002\u001a\u00030\u00af\u0002J\u001f\u0010\u00ed\u0002\u001a\u0005\u0018\u00010\u00ee\u00022\b\u0010>\u001a\u0004\u0018\u0001032\t\u0010\u00ef\u0002\u001a\u0004\u0018\u000103J\b\u0010\u00f0\u0002\u001a\u00030\u00af\u0002J\b\u0010\u00f1\u0002\u001a\u00030\u00af\u0002J\u0011\u0010\u00f2\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u000203J\u001a\u0010\u00f3\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020v2\u0007\u0010\u00c3\u0002\u001a\u00020\u0016J>\u0010\u00f4\u0002\u001a\u00030\u00d5\u00022\u0007\u0010\u00b0\u0002\u001a\u00020v2\u0007\u0010\u00f1\u0001\u001a\u00020\u00162\u0007\u0010\u00db\u0001\u001a\u0002032\u0007\u0010\u00f5\u0002\u001a\u00020\u00162\u0007\u0010\u00f6\u0002\u001a\u0002032\u0007\u0010\u00c3\u0002\u001a\u00020\u0016J\n\u0010\u00f7\u0002\u001a\u00030\u00af\u0002H\u0002J\u001c\u0010\u00f8\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020v2\u0007\u0010\u00c3\u0002\u001a\u00020\u0016H\u0002J\u001a\u0010\u00f9\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020v2\u0007\u0010\u00c3\u0002\u001a\u00020\u0016J\u001a\u0010\u00fa\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00b0\u0002\u001a\u00020v2\u0007\u0010\u00c3\u0002\u001a\u00020\u0016J\u001c\u0010\u00fb\u0002\u001a\u00030\u00af\u00022\u0007\u0010\u00fc\u0002\u001a\u00020/2\u0007\u0010\u00f1\u0001\u001a\u00020\u0016H\u0002J\b\u0010\u00fd\u0002\u001a\u00030\u00af\u0002J\u001b\u0010\u00fe\u0002\u001a\u00030\u00af\u00022\b\u0010\u00ff\u0002\u001a\u00030\u0080\u00032\u0007\u0010\u00b0\u0002\u001a\u00020vR\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010$R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0&0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010$R \u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010$R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010$R\u001a\u0010>\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00105\"\u0004\b@\u00107R\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0&0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0019R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00105\"\u0004\bF\u00107R\u001a\u0010G\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010S\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010T\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0019\"\u0004\bV\u0010$R\u001a\u0010W\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010J\"\u0004\bY\u0010LR\"\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0019\"\u0004\b\\\u0010$R\"\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0019\"\u0004\b_\u0010$R&\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0&0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0019\"\u0004\bc\u0010$R \u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0019\"\u0004\bg\u0010$R \u0010h\u001a\b\u0012\u0004\u0012\u00020H0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0019\"\u0004\bj\u0010$R\"\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010l0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0019\"\u0004\bn\u0010$R\u001c\u0010o\u001a\u0004\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u00105\"\u0004\bq\u00107R\u001a\u0010r\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u00105\"\u0004\bt\u00107R\u001a\u0010u\u001a\u00020vX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001a\u0010{\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010J\"\u0004\b}\u0010LR$\u0010~\u001a\b\u0012\u0004\u0012\u0002030\u007fX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R%\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u0002030\u007fX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0081\u0001\"\u0006\b\u0086\u0001\u0010\u0083\u0001R#\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u0002030\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0019\"\u0005\b\u0089\u0001\u0010$R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008e\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010\u008f\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\u0093\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0090\u0001\"\u0006\b\u0094\u0001\u0010\u0092\u0001R\u001b\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0096\u00018F\u00a2\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0097\u0001R$\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008e\u0001\u001a\u0006\b\u0098\u0001\u0010\u008b\u0001\"\u0006\b\u0099\u0001\u0010\u008d\u0001R#\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0019\"\u0005\b\u009b\u0001\u0010$R&\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u0002030\u009d\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b\u00a0\u0001\u0010\u00a1\u0001R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u00a2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a3\u00010&X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a4\u0001\u0010\u0081\u0001\"\u0006\b\u00a5\u0001\u0010\u0083\u0001R \u0010\u00a6\u0001\u001a\u00030\u00a7\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a8\u0001\u0010\u00a9\u0001\"\u0006\b\u00aa\u0001\u0010\u00ab\u0001R!\u0010\u00ac\u0001\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ad\u0001\u0010\u00ae\u0001\"\u0006\b\u00af\u0001\u0010\u00b0\u0001R&\u0010\u00b1\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u00b2\u0001\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b3\u0001\u0010\u0019\"\u0005\b\u00b4\u0001\u0010$R$\u0010\u00b5\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b6\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b7\u0001\u0010\u0019\"\u0005\b\u00b8\u0001\u0010$R%\u0010\u00b9\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ba\u0001\u0010\u0019\"\u0005\b\u00bb\u0001\u0010$R\u001d\u0010\u00bc\u0001\u001a\u000203X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bd\u0001\u00105\"\u0005\b\u00be\u0001\u00107R#\u0010\u00bf\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c0\u0001\u0010\u0019\"\u0005\b\u00c1\u0001\u0010$R$\u0010\u00c2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c3\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c4\u0001\u0010\u0019\"\u0005\b\u00c5\u0001\u0010$R#\u0010\u00c6\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c7\u0001\u0010\u0019\"\u0005\b\u00c8\u0001\u0010$R$\u0010\u00c9\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c3\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ca\u0001\u0010\u0019\"\u0005\b\u00cb\u0001\u0010$R(\u0010\u00cc\u0001\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u00cd\u0001\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ce\u0001\u0010\u0019\"\u0005\b\u00cf\u0001\u0010$R&\u0010\u00d0\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00d1\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d2\u0001\u0010\u0019\"\u0005\b\u00d3\u0001\u0010$R#\u0010\u00d4\u0001\u001a\b\u0012\u0004\u0012\u0002030\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d5\u0001\u0010\u0019\"\u0005\b\u00d6\u0001\u0010$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u00d7\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00d8\u00010&0\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d9\u0001\u0010\u0019\"\u0005\b\u00da\u0001\u0010$R%\u0010\u00db\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00dc\u0001\u0010\u0019\"\u0005\b\u00dd\u0001\u0010$R\"\u0010\u00de\u0001\u001a\u0005\u0018\u00010\u00df\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e0\u0001\u0010\u00e1\u0001\"\u0006\b\u00e2\u0001\u0010\u00e3\u0001R%\u0010\u00e4\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010v0\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e5\u0001\u0010\u0019\"\u0005\b\u00e6\u0001\u0010$R#\u0010\u00e7\u0001\u001a\b\u0012\u0004\u0012\u00020v0\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e8\u0001\u0010\u0019\"\u0005\b\u00e9\u0001\u0010$R#\u0010\u00ea\u0001\u001a\b\u0012\u0004\u0012\u0002030\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00eb\u0001\u0010\u0019\"\u0005\b\u00ec\u0001\u0010$R$\u0010\u00ed\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ee\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ef\u0001\u0010\u0019\"\u0005\b\u00f0\u0001\u0010$R\u001f\u0010\u00f1\u0001\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f2\u0001\u0010\u0090\u0001\"\u0006\b\u00f3\u0001\u0010\u0092\u0001R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u00f4\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00f5\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f6\u0001\u0010\u0019\"\u0005\b\u00f7\u0001\u0010$R)\u0010\u00f8\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030&0\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f9\u0001\u0010\u0019\"\u0005\b\u00fa\u0001\u0010$R \u0010\u00fb\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00fc\u00010&0\u0015\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00fd\u0001\u0010\u0019R$\u0010\u00fe\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ff\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0002\u0010\u0019\"\u0005\b\u0081\u0002\u0010$R#\u0010\u0082\u0002\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0002\u0010\u0019\"\u0005\b\u0084\u0002\u0010$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0085\u0002\u001a\t\u0012\u0005\u0012\u00030\u0086\u00020&X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0087\u0002\u0010\u0081\u0001\"\u0006\b\u0088\u0002\u0010\u0083\u0001R%\u0010\u0089\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0002\u0010\u0019\"\u0005\b\u008b\u0002\u0010$R$\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008e\u0001\u001a\u0006\b\u008d\u0002\u0010\u008b\u0001\"\u0006\b\u008e\u0002\u0010\u008d\u0001R&\u0010\u008f\u0002\u001a\u000b\u0012\u0005\u0012\u00030\u0090\u0002\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0002\u0010\u0019\"\u0005\b\u0092\u0002\u0010$R&\u0010\u0093\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u00020\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0002\u0010\u0019\"\u0005\b\u0096\u0002\u0010$R#\u0010\u0097\u0002\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0002\u0010\u0019\"\u0005\b\u0099\u0002\u0010$R\u0019\u0010\u009a\u0002\u001a\b\u0012\u0004\u0012\u0002030\u0015\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0002\u0010\u0019R+\u0010\u009c\u0002\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0002\u0010\u0019\"\u0005\b\u009e\u0002\u0010$R#\u0010\u009f\u0002\u001a\b\u0012\u0004\u0012\u0002030\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0002\u0010\u0019\"\u0005\b\u00a1\u0002\u0010$R\u001d\u0010\u00a2\u0002\u001a\u00020HX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0002\u0010J\"\u0005\b\u00a4\u0002\u0010LR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u00a5\u0002\u001a\u00020HX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0002\u0010J\"\u0005\b\u00a7\u0002\u0010LR\u001d\u0010\u00a8\u0002\u001a\u000203X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0002\u00105\"\u0005\b\u00aa\u0002\u00107R#\u0010\u00ab\u0002\u001a\b\u0012\u0004\u0012\u0002030\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ac\u0002\u0010\u0019\"\u0005\b\u00ad\u0002\u0010$\u00a8\u0006\u0082\u0003"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/OrderStatusViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "orderStatusUseCase", "Lcom/intellihealth/truemeds/domain/usecase/OrderStatusUseCase;", "reminderUseCase", "Lcom/intellihealth/truemeds/domain/usecase/ReminderUseCase;", "reorderUseCase", "Lcom/intellihealth/truemeds/domain/usecase/ReorderUseCase;", "paymentOptionsUseCase", "Lcom/intellihealth/truemeds/domain/usecase/PaymentOptionsUseCase;", "loginUseCase", "Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;", "homePageUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "userDataUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "context", "Landroid/content/Context;", "(Lcom/intellihealth/truemeds/domain/usecase/OrderStatusUseCase;Lcom/intellihealth/truemeds/domain/usecase/ReminderUseCase;Lcom/intellihealth/truemeds/domain/usecase/ReorderUseCase;Lcom/intellihealth/truemeds/domain/usecase/PaymentOptionsUseCase;Lcom/intellihealth/truemeds/domain/usecase/LoginUseCase;Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;Landroid/content/Context;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "get_isLoading", "()Landroidx/lifecycle/MutableLiveData;", "addressData", "Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse;", "getAddressData", "()Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse;", "setAddressData", "(Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse;)V", "alternateNumberResponse", "Lcom/intellihealth/truemeds/data/model/orderstatus/AlternateNumberResponse;", "getAlternateNumberResponse", "setAlternateNumberResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "bannerList", "", "Lcom/intellihealth/salt/models/BannerItemModel;", "getBannerList", "setBannerList", "billDetails", "Lcom/intellihealth/salt/models/BillDetailsModel;", "getBillDetails", "setBillDetails", "billDetailsResponse", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "getBillDetailsResponse", "setBillDetailsResponse", "cashHandlingPayMsg", "", "getCashHandlingPayMsg", "()Ljava/lang/String;", "setCashHandlingPayMsg", "(Ljava/lang/String;)V", "cashHandlingRefundMsg", "getCashHandlingRefundMsg", "setCashHandlingRefundMsg", "clickPostTrackingUrl", "getClickPostTrackingUrl", "setClickPostTrackingUrl", "clickedOnPage", "getClickedOnPage", "setClickedOnPage", "combinedModificationList", "Lcom/intellihealth/truemeds/data/model/orderstatus/ModificationItem;", "getCombinedModificationList", "currentOrderState", "getCurrentOrderState", "setCurrentOrderState", "currentOrderStatus", "", "getCurrentOrderStatus", "()I", "setCurrentOrderStatus", "(I)V", "customerOrderDetailsResponseData", "Lcom/intellihealth/truemeds/data/model/orderflow/CustomerOrderDetailsResponseData;", "getCustomerOrderDetailsResponseData", "()Lcom/intellihealth/truemeds/data/model/orderflow/CustomerOrderDetailsResponseData;", "setCustomerOrderDetailsResponseData", "(Lcom/intellihealth/truemeds/data/model/orderflow/CustomerOrderDetailsResponseData;)V", "deliveryAccordionData", "Lcom/intellihealth/salt/models/HistoryAccordionModel;", "getDeliveryAccordionData", "setDeliveryAccordionData", "deliveryDays", "getDeliveryDays", "setDeliveryDays", "deliveryPartnerContact", "getDeliveryPartnerContact", "setDeliveryPartnerContact", "deliveryPartnerName", "getDeliveryPartnerName", "setDeliveryPartnerName", "detailedTimeLineDataList", "Lcom/intellihealth/salt/models/DetailedTimelineModel;", "getDetailedTimeLineDataList", "setDetailedTimeLineDataList", "doctorCallCardModel", "Lcom/intellihealth/salt/models/DoctorCallCardModel;", "getDoctorCallCardModel", "setDoctorCallCardModel", "doctorId", "getDoctorId", "setDoctorId", "doctorRating", "Lcom/intellihealth/truemeds/data/model/orderstatus/DoctorRating;", "getDoctorRating", "setDoctorRating", "edd", "getEdd", "setEdd", "editReminderDate", "getEditReminderDate", "setEditReminderDate", "editReminderDeleteId", "", "getEditReminderDeleteId", "()J", "setEditReminderDeleteId", "(J)V", "editReminderFrequency", "getEditReminderFrequency", "setEditReminderFrequency", "eventItemNames", "", "getEventItemNames", "()Ljava/util/List;", "setEventItemNames", "(Ljava/util/List;)V", "eventProductsIds", "getEventProductsIds", "setEventProductsIds", "gifUrlVertical", "getGifUrlVertical", "setGifUrlVertical", "isChronicAdded", "()Ljava/lang/Boolean;", "setChronicAdded", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isDeleteNumberSuccessFully", "()Z", "setDeleteNumberSuccessFully", "(Z)V", "isFromDeleteAlternateNumber", "setFromDeleteAlternateNumber", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isReOrder", "setReOrder", "isShowVideoPopup", "setShowVideoPopup", "list", "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "modificationItemsList", "Lcom/intellihealth/salt/models/ProductInfoModel;", "getModificationItemsList", "setModificationItemsList", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "mxOrderStatusBill", "getMxOrderStatusBill", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "setMxOrderStatusBill", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;)V", "notificationData", "Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;", "getNotificationData", "setNotificationData", "notificationType", "Lcom/intellihealth/salt/models/NotificationType;", "getNotificationType", "setNotificationType", "orderDate", "getOrderDate", "setOrderDate", "orderID", "getOrderID", "setOrderID", "orderIdExistForReminder", "getOrderIdExistForReminder", "setOrderIdExistForReminder", "orderPersonalAddressModel", "Lcom/intellihealth/salt/models/OrderPersonalDetailsModel;", "getOrderPersonalAddressModel", "setOrderPersonalAddressModel", "orderPersonalEmailDetail", "getOrderPersonalEmailDetail", "setOrderPersonalEmailDetail", "orderPersonalMobileDetail", "getOrderPersonalMobileDetail", "setOrderPersonalMobileDetail", "orderPlaceModel", "Lcom/intellihealth/salt/models/OrderTrackerModel;", "getOrderPlaceModel", "setOrderPlaceModel", "orderStatusResponseData", "Lcom/intellihealth/truemeds/data/model/orderstatus/OrderStatusResponse$ResponseData;", "getOrderStatusResponseData", "setOrderStatusResponseData", "orderStatusTitle", "getOrderStatusTitle", "setOrderStatusTitle", "orderedItemsList", "Lcom/intellihealth/salt/models/OrderedItemCardModel;", "getOrderedItemsList", "setOrderedItemsList", "pageTitle", "getPageTitle", "setPageTitle", "patientData", "Lcom/intellihealth/truemeds/data/model/orderflow/GetPatientDetailsResponse;", "getPatientData", "()Lcom/intellihealth/truemeds/data/model/orderflow/GetPatientDetailsResponse;", "setPatientData", "(Lcom/intellihealth/truemeds/data/model/orderflow/GetPatientDetailsResponse;)V", "patientId", "getPatientId", "setPatientId", "patientIdForReminder", "getPatientIdForReminder", "setPatientIdForReminder", "patientName", "getPatientName", "setPatientName", "paymentContainerModel", "Lcom/intellihealth/salt/models/PaymentContainerModel;", "getPaymentContainerModel", "setPaymentContainerModel", "paymentEnable", "getPaymentEnable", "setPaymentEnable", "paymentSelectionInfo", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData$PaymentSelectionInfo;", "getPaymentSelectionInfo", "setPaymentSelectionInfo", "prescriptionList", "getPrescriptionList", "setPrescriptionList", "prescriptions", "Lcom/intellihealth/truemeds/data/model/orderflow/OrderRxInfo;", "getPrescriptions", "reminderCardModel", "Lcom/intellihealth/salt/models/ReminderCardModel;", "getReminderCardModel", "setReminderCardModel", "reminderDataExist", "getReminderDataExist", "setReminderDataExist", "replaceItemList", "Lcom/intellihealth/salt/models/TooltipProductCardModel;", "getReplaceItemList", "setReplaceItemList", "returnOrderUrl", "getReturnOrderUrl", "setReturnOrderUrl", "rxRequired", "getRxRequired", "setRxRequired", "savingCardData", "Lcom/intellihealth/salt/models/SavingCardsModel;", "getSavingCardData", "setSavingCardData", "savingValue", "", "getSavingValue", "setSavingValue", "showCancelButton", "getShowCancelButton", "setShowCancelButton", "showError", "getShowError", "showShimmerLiveData", "getShowShimmerLiveData", "setShowShimmerLiveData", "showToast", "getShowToast", "setShowToast", "subsId", "getSubsId", "setSubsId", "videoId", "getVideoId", "setVideoId", "videoName", "getVideoName", "setVideoName", "videoUrl", "getVideoUrl", "setVideoUrl", "addAlternateNumberClick", "", "orderId", "alternateNumber", "appOrderCancelledData", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAppOrderCancelled;", "checkOrderIdExistForReminder", "checkOrderOpenFirstTimeForVideo", "convertStringToDate", "Ljava/util/Date;", "date", "convertToBillDetails", "billModel", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "billDetailsTitle", "totalPayable", "gst", "sellerPackagingCharge", "saveOrderPrice", "savedOrderMessage", "strikePackagingCharge", "fromOrderStatus", "billDetailFooterList", "Lcom/intellihealth/salt/models/FooterBillItem;", "Lkotlin/collections/ArrayList;", "deleteAlternateNumberClick", "eventAddAlternateContactNumber", "eventAppOrderCancelledClick", "from", "eventOrderStatusViewed", "billDetailResponse", "eventReOrderButtonClicked", "eventVideoFloaterClickedEvent", "eventViewDetailsClicked", "generateReturnUrlApiCall", "getCustomerEmailIdCard", "getDoctorCallMeBack", "getReminderData", "getReorder", "Lkotlinx/coroutines/Job;", "customerId", "patientListDto", "variant", "checkAutoConfirmEligibility", "newAlgo", "serialId", "reOrderMedCheck", "variantId", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/Long;)Lkotlinx/coroutines/Job;", "getRxForOrder", "insertPillReminder", "pillReminder", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/PillReminder;", "insertSaveVideoFAQ", "saveVideoFAQ", "Lcom/intellihealth/truemeds/data/repository/datasource/local/entity/SaveVideoFAQ;", "mxReminderSuccessfullySetDataToMixpanel", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderSuccessfullySet;", "saveCustomerEmailAddress", "emailId", "transactionId", "saveEmailAddress", "sendPatientAndReminderSetButtonOrderStatus", "sendPaymentPageVisitedEventToMixpanel", "", "pageSection", "sendReminderBottomSheetViewedEvent", "sendReminderEditClickedEvent", "sendVideoFloaterImpressionEvent", "setAddressDetailsData", "setBillDetailsData", "paymentDone", "actionBtnText", "setCustomerCategory", "setMobileNumber", "setOrderTrackerData", "setOrderedItemListData", "setPaymentBottomData", "billData", "stickyOrderStatusData", "submitDoctorRating", "jsonObject", "Lcom/google/gson/JsonObject;", "Companion", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class OrderStatusViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.OrderStatusUseCase orderStatusUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.ReminderUseCase reminderUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.domain.usecase.ReorderUseCase reorderUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase paymentOptionsUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> notificationData;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderTrackerModel> orderPlaceModel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ReminderCardModel> reminderCardModel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.OrderedItemCardModel>> orderedItemsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.salt.models.ProductInfoModel> modificationItemsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.salt.models.TooltipProductCardModel> replaceItemList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderPersonalDetailsModel> orderPersonalAddressModel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderPersonalDetailsModel> orderPersonalMobileDetail;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> orderPersonalEmailDetail;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.PaymentContainerModel> paymentContainerModel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.DoctorCallCardModel> doctorCallCardModel;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel> billDetails;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse> billDetailsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.DetailedTimelineModel>> detailedTimeLineDataList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> prescriptionList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> prescriptions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderstatus.ModificationItem>> combinedModificationList = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.SavingCardsModel> savingCardData;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.HistoryAccordionModel> deliveryAccordionData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmerLiveData;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> list;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String orderID = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse.ResponseData> orderStatusResponseData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> pageTitle;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> reminderDataExist;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> orderIdExistForReminder;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowVideoPopup;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse> alternateNumberResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> patientIdForReminder;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String editReminderDate = "";
    private int editReminderFrequency = 0;
    private long editReminderDeleteId = 0L;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.DoctorRating> doctorRating;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> patientId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> gifUrlVertical;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.BannerItemModel>> bannerList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> videoUrl;
    private int videoId = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String videoName = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> orderStatusTitle;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.NotificationType> notificationType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> doctorId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo> paymentSelectionInfo;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> orderDate;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> deliveryPartnerName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> deliveryPartnerContact;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> clickPostTrackingUrl;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> returnOrderUrl;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> savingValue;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showCancelButton;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    private boolean isDeleteNumberSuccessFully = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> showError = null;
    private boolean paymentEnable = false;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.ordersummary.AddressResponse addressData;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse patientData;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> eventItemNames;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> eventProductsIds;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.CustomerOrderDetailsResponseData customerOrderDetailsResponseData;
    private int currentOrderStatus = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentOrderState = "";
    private int deliveryDays = 0;
    private int subsId = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean rxRequired;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isChronicAdded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isReOrder;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String edd;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse mxOrderStatusBill;
    private boolean isFromDeleteAlternateNumber = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> showToast;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cashHandlingPayMsg;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cashHandlingRefundMsg;
    private static boolean isSubsAddedOrderStatus = false;
    private static boolean isChroniceOrderStatus = false;
    private static boolean isGenericAdded = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel.Companion Companion = null;
    
    @javax.inject.Inject()
    public OrderStatusViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.OrderStatusUseCase orderStatusUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.ReminderUseCase reminderUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.ReorderUseCase reorderUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase paymentOptionsUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> getNotificationData() {
        return null;
    }
    
    public final void setNotificationData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderTrackerModel> getOrderPlaceModel() {
        return null;
    }
    
    public final void setOrderPlaceModel(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderTrackerModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ReminderCardModel> getReminderCardModel() {
        return null;
    }
    
    public final void setReminderCardModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.ReminderCardModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.OrderedItemCardModel>> getOrderedItemsList() {
        return null;
    }
    
    public final void setOrderedItemsList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.OrderedItemCardModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.ProductInfoModel> getModificationItemsList() {
        return null;
    }
    
    public final void setModificationItemsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.TooltipProductCardModel> getReplaceItemList() {
        return null;
    }
    
    public final void setReplaceItemList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.TooltipProductCardModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderPersonalDetailsModel> getOrderPersonalAddressModel() {
        return null;
    }
    
    public final void setOrderPersonalAddressModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderPersonalDetailsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderPersonalDetailsModel> getOrderPersonalMobileDetail() {
        return null;
    }
    
    public final void setOrderPersonalMobileDetail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderPersonalDetailsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOrderPersonalEmailDetail() {
        return null;
    }
    
    public final void setOrderPersonalEmailDetail(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.PaymentContainerModel> getPaymentContainerModel() {
        return null;
    }
    
    public final void setPaymentContainerModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.PaymentContainerModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.DoctorCallCardModel> getDoctorCallCardModel() {
        return null;
    }
    
    public final void setDoctorCallCardModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.DoctorCallCardModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel> getBillDetails() {
        return null;
    }
    
    public final void setBillDetails(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse> getBillDetailsResponse() {
        return null;
    }
    
    public final void setBillDetailsResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.DetailedTimelineModel>> getDetailedTimeLineDataList() {
        return null;
    }
    
    public final void setDetailedTimeLineDataList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.DetailedTimelineModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getPrescriptionList() {
        return null;
    }
    
    public final void setPrescriptionList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> getPrescriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderstatus.ModificationItem>> getCombinedModificationList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.SavingCardsModel> getSavingCardData() {
        return null;
    }
    
    public final void setSavingCardData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.SavingCardsModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.HistoryAccordionModel> getDeliveryAccordionData() {
        return null;
    }
    
    public final void setDeliveryAccordionData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.HistoryAccordionModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    public final void setShowShimmerLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderID() {
        return null;
    }
    
    public final void setOrderID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse.ResponseData> getOrderStatusResponseData() {
        return null;
    }
    
    public final void setOrderStatusResponseData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse.ResponseData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPageTitle() {
        return null;
    }
    
    public final void setPageTitle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getReminderDataExist() {
        return null;
    }
    
    public final void setReminderDataExist(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOrderIdExistForReminder() {
        return null;
    }
    
    public final void setOrderIdExistForReminder(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowVideoPopup() {
        return null;
    }
    
    public final void setShowVideoPopup(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse> getAlternateNumberResponse() {
        return null;
    }
    
    public final void setAlternateNumberResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getPatientIdForReminder() {
        return null;
    }
    
    public final void setPatientIdForReminder(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEditReminderDate() {
        return null;
    }
    
    public final void setEditReminderDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getEditReminderFrequency() {
        return 0;
    }
    
    public final void setEditReminderFrequency(int p0) {
    }
    
    public final long getEditReminderDeleteId() {
        return 0L;
    }
    
    public final void setEditReminderDeleteId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.DoctorRating> getDoctorRating() {
        return null;
    }
    
    public final void setDoctorRating(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderstatus.DoctorRating> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientName() {
        return null;
    }
    
    public final void setPatientName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getPatientId() {
        return null;
    }
    
    public final void setPatientId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGifUrlVertical() {
        return null;
    }
    
    public final void setGifUrlVertical(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.BannerItemModel>> getBannerList() {
        return null;
    }
    
    public final void setBannerList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.BannerItemModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getVideoUrl() {
        return null;
    }
    
    public final void setVideoUrl(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final int getVideoId() {
        return 0;
    }
    
    public final void setVideoId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVideoName() {
        return null;
    }
    
    public final void setVideoName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOrderStatusTitle() {
        return null;
    }
    
    public final void setOrderStatusTitle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.NotificationType> getNotificationType() {
        return null;
    }
    
    public final void setNotificationType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.NotificationType> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDoctorId() {
        return null;
    }
    
    public final void setDoctorId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo> getPaymentSelectionInfo() {
        return null;
    }
    
    public final void setPaymentSelectionInfo(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData.PaymentSelectionInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOrderDate() {
        return null;
    }
    
    public final void setOrderDate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDeliveryPartnerName() {
        return null;
    }
    
    public final void setDeliveryPartnerName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDeliveryPartnerContact() {
        return null;
    }
    
    public final void setDeliveryPartnerContact(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getClickPostTrackingUrl() {
        return null;
    }
    
    public final void setClickPostTrackingUrl(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getReturnOrderUrl() {
        return null;
    }
    
    public final void setReturnOrderUrl(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getSavingValue() {
        return null;
    }
    
    public final void setSavingValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Double> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowCancelButton() {
        return null;
    }
    
    public final void setShowCancelButton(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isDeleteNumberSuccessFully() {
        return false;
    }
    
    public final void setDeleteNumberSuccessFully(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShowError() {
        return null;
    }
    
    public final boolean getPaymentEnable() {
        return false;
    }
    
    public final void setPaymentEnable(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.ordersummary.AddressResponse getAddressData() {
        return null;
    }
    
    public final void setAddressData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.ordersummary.AddressResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse getPatientData() {
        return null;
    }
    
    public final void setPatientData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getEventItemNames() {
        return null;
    }
    
    public final void setEventItemNames(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getEventProductsIds() {
        return null;
    }
    
    public final void setEventProductsIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.CustomerOrderDetailsResponseData getCustomerOrderDetailsResponseData() {
        return null;
    }
    
    public final void setCustomerOrderDetailsResponseData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.CustomerOrderDetailsResponseData p0) {
    }
    
    public final int getCurrentOrderStatus() {
        return 0;
    }
    
    public final void setCurrentOrderStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentOrderState() {
        return null;
    }
    
    public final void setCurrentOrderState(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getDeliveryDays() {
        return 0;
    }
    
    public final void setDeliveryDays(int p0) {
    }
    
    public final int getSubsId() {
        return 0;
    }
    
    public final void setSubsId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRxRequired() {
        return null;
    }
    
    public final void setRxRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isChronicAdded() {
        return null;
    }
    
    public final void setChronicAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isReOrder() {
        return null;
    }
    
    public final void setReOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEdd() {
        return null;
    }
    
    public final void setEdd(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse getMxOrderStatusBill() {
        return null;
    }
    
    public final void setMxOrderStatusBill(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse p0) {
    }
    
    public final boolean isFromDeleteAlternateNumber() {
        return false;
    }
    
    public final void setFromDeleteAlternateNumber(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShowToast() {
        return null;
    }
    
    public final void setShowToast(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCashHandlingPayMsg() {
        return null;
    }
    
    public final void setCashHandlingPayMsg(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCashHandlingRefundMsg() {
        return null;
    }
    
    public final void setCashHandlingRefundMsg(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Set Order tracker data in orderPlaceModel
     * This data returns the current state of order
     */
    public final void setOrderTrackerData(long orderId, boolean fromOrderStatus) {
    }
    
    public final void sendVideoFloaterImpressionEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    /**
     * This is used for showing sticky top bottom bar
     * This data returns the to show current order status e.g.order received..
     */
    public final void stickyOrderStatusData() {
    }
    
    /**
     * This is used for showing reminder card value either set reminder or edit reminder
     */
    public final void getReminderData(long patientId) {
    }
    
    /**
     * This is used for setting all ordered items
     * This include view more and view less items
     */
    public final void setOrderedItemListData(long orderId, boolean fromOrderStatus) {
    }
    
    /**
     * This is used for setting bill details
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setBillDetailsData(long orderId, boolean paymentEnable, @org.jetbrains.annotations.NotNull()
    java.lang.String pageTitle, boolean paymentDone, @org.jetbrains.annotations.NotNull()
    java.lang.String actionBtnText, boolean fromOrderStatus) {
        return null;
    }
    
    public final void setAddressDetailsData(long orderId, boolean fromOrderStatus) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.OrderPersonalDetailsModel getCustomerEmailIdCard() {
        return null;
    }
    
    private final void setMobileNumber(long orderId, boolean fromOrderStatus) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveCustomerEmailAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String emailId, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId) {
        return null;
    }
    
    private final void saveEmailAddress(java.lang.String emailId) {
    }
    
    private final void setPaymentBottomData(com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse billData, boolean paymentEnable) {
    }
    
    public final void getRxForOrder(long orderId) {
    }
    
    private final com.intellihealth.salt.models.BillDetailsModel convertToBillDetails(com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billModel, java.lang.String billDetailsTitle, java.lang.String totalPayable, java.lang.String gst, java.lang.String sellerPackagingCharge, java.lang.String saveOrderPrice, java.lang.String savedOrderMessage, double strikePackagingCharge, boolean fromOrderStatus, java.util.ArrayList<com.intellihealth.salt.models.FooterBillItem> billDetailFooterList) {
        return null;
    }
    
    public final void addAlternateNumberClick(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String alternateNumber) {
    }
    
    public final void checkOrderIdExistForReminder(long orderId) {
    }
    
    public final void insertPillReminder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder pillReminder) {
    }
    
    public final void checkOrderOpenFirstTimeForVideo(long orderId) {
    }
    
    public final void insertSaveVideoFAQ(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ saveVideoFAQ) {
    }
    
    public final void submitDoctorRating(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, long orderId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getReorder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Long> patientListDto, @org.jetbrains.annotations.Nullable()
    java.lang.String variant, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serialId, boolean reOrderMedCheck, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId) {
        return null;
    }
    
    /**
     * This function is used to change the payment method selection
     */
    public final void generateReturnUrlApiCall(long orderId) {
    }
    
    public final void getDoctorCallMeBack(long orderId) {
    }
    
    private final void setCustomerCategory() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled appOrderCancelledData() {
        return null;
    }
    
    public final void eventOrderStatusViewed(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse billDetailResponse) {
    }
    
    public final void eventViewDetailsClicked(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse billDetailResponse) {
    }
    
    public final void eventAppOrderCancelledClick(@org.jetbrains.annotations.NotNull()
    java.lang.String from) {
    }
    
    public final void eventAddAlternateContactNumber(long orderId) {
    }
    
    public final void eventVideoFloaterClickedEvent(long orderId) {
    }
    
    public final void sendReminderBottomSheetViewedEvent() {
    }
    
    public final void sendReminderEditClickedEvent() {
    }
    
    public final void sendPatientAndReminderSetButtonOrderStatus() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date convertStringToDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendPaymentPageVisitedEventToMixpanel(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection) {
        return null;
    }
    
    public final void eventReOrderButtonClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySetDataToMixpanel() {
        return null;
    }
    
    public final void deleteAlternateNumberClick(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String alternateNumber) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/OrderStatusViewModel$Companion;", "", "()V", "isChroniceOrderStatus", "", "()Z", "setChroniceOrderStatus", "(Z)V", "isGenericAdded", "setGenericAdded", "isSubsAddedOrderStatus", "setSubsAddedOrderStatus", "app_stageAndroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isSubsAddedOrderStatus() {
            return false;
        }
        
        public final void setSubsAddedOrderStatus(boolean p0) {
        }
        
        public final boolean isChroniceOrderStatus() {
            return false;
        }
        
        public final void setChroniceOrderStatus(boolean p0) {
        }
        
        public final boolean isGenericAdded() {
            return false;
        }
        
        public final void setGenericAdded(boolean p0) {
        }
    }
}