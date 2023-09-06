package com.unl.addressvalidator.ui.fragments;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00aa\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0098\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\u0098\u0002B\u0005\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u00d8\u0001\u001a\u00030\u00d9\u00012\u0007\u0010\u00da\u0001\u001a\u00020<2\u0007\u0010\u00db\u0001\u001a\u00020UH\u0016J\u0012\u0010\u00dc\u0001\u001a\u00030\u00d9\u00012\u0006\u0010$\u001a\u00020%H\u0016J\u0014\u0010\u00dd\u0001\u001a\u00030\u00d9\u00012\b\u0010\u00de\u0001\u001a\u00030\u00df\u0001H\u0002J\u0014\u0010\u00e0\u0001\u001a\u00030\u00d9\u00012\b\u0010\u00de\u0001\u001a\u00030\u00df\u0001H\u0002J\u0012\u0010\u00e1\u0001\u001a\u00030\u00d9\u00012\b\u0010\u00de\u0001\u001a\u00030\u00df\u0001J\b\u0010\u00e2\u0001\u001a\u00030\u00d9\u0001J\u0013\u0010\u00e3\u0001\u001a\u00030\u00d9\u00012\u0007\u0010\u00e4\u0001\u001a\u00020\fH\u0016J,\u0010\u00e5\u0001\u001a\u00030\u00d9\u00012\u0007\u0010\u00e6\u0001\u001a\u00020<2\u0017\u0010\u00e7\u0001\u001a\u0012\u0012\u0004\u0012\u00020K07j\b\u0012\u0004\u0012\u00020K`LH\u0016J,\u0010\u00e8\u0001\u001a\u00030\u00d9\u00012\u0007\u0010\u00e6\u0001\u001a\u00020<2\u0017\u0010\u00e7\u0001\u001a\u0012\u0012\u0004\u0012\u00020K07j\b\u0012\u0004\u0012\u00020K`LH\u0016J,\u0010\u00e9\u0001\u001a\u00030\u00d9\u00012\u0007\u0010\u00e6\u0001\u001a\u00020<2\u0017\u0010\u00e7\u0001\u001a\u0012\u0012\u0004\u0012\u00020K07j\b\u0012\u0004\u0012\u00020K`LH\u0016J\b\u0010\u00ea\u0001\u001a\u00030\u00d9\u0001J\n\u0010\u00eb\u0001\u001a\u00030\u00d9\u0001H\u0002J\n\u0010\u00ec\u0001\u001a\u00030\u00d9\u0001H\u0002J\n\u0010\u00ed\u0001\u001a\u00030\u00ee\u0001H\u0016J\n\u0010\u00ef\u0001\u001a\u00030\u00d9\u0001H\u0002J\n\u0010\u00f0\u0001\u001a\u00030\u00d9\u0001H\u0002J\n\u0010\u00f1\u0001\u001a\u00030\u00d9\u0001H\u0002J\n\u0010\u00f2\u0001\u001a\u00030\u00d9\u0001H\u0002J\n\u0010\u00f3\u0001\u001a\u00030\u00d9\u0001H\u0002J\n\u0010\u00f4\u0001\u001a\u00030\u00d9\u0001H\u0002J\u001c\u0010\u00f5\u0001\u001a\u00030\u00d9\u00012\u0007\u0010\u00f6\u0001\u001a\u00020\f2\u0007\u0010\u00f7\u0001\u001a\u00020\fH\u0016J\u0014\u0010\u00f8\u0001\u001a\u00030\u00d9\u00012\b\u0010\u00f9\u0001\u001a\u00030\u00aa\u0001H\u0016J(\u0010\u00fa\u0001\u001a\u00030\u00d9\u00012\u0007\u0010\u00fb\u0001\u001a\u00020<2\u0007\u0010\u00fc\u0001\u001a\u00020<2\n\u0010\u00fd\u0001\u001a\u0005\u0018\u00010\u00fe\u0001H\u0016J\u0016\u0010\u00ff\u0001\u001a\u00030\u00d9\u00012\n\u0010\u0080\u0002\u001a\u0005\u0018\u00010\u0081\u0002H\u0016J.\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0084\u00012\b\u0010\u0083\u0002\u001a\u00030\u0084\u00022\n\u0010\u0085\u0002\u001a\u0005\u0018\u00010\u0086\u00022\n\u0010\u0080\u0002\u001a\u0005\u0018\u00010\u0081\u0002H\u0016J\u0013\u0010\u0087\u0002\u001a\u00030\u00d9\u00012\u0007\u0010\u0088\u0002\u001a\u00020uH\u0016J\n\u0010\u0089\u0002\u001a\u00030\u00d9\u0001H\u0016J\n\u0010\u008a\u0002\u001a\u00030\u00d9\u0001H\u0016J\b\u0010\u008b\u0002\u001a\u00030\u00d9\u0001J\u0011\u0010\u008b\u0002\u001a\u00030\u00d9\u00012\u0007\u0010\u008c\u0002\u001a\u00020<J\n\u0010\u008d\u0002\u001a\u00030\u00d9\u0001H\u0002J\u0014\u0010\u008e\u0002\u001a\u00030\u00d9\u00012\b\u0010\u008f\u0002\u001a\u00030\u0090\u0002H\u0016J\n\u0010\u0091\u0002\u001a\u00030\u00d9\u0001H\u0002J\u001b\u0010\u0092\u0002\u001a\u00030\u00d9\u00012\b\u0010\u0093\u0002\u001a\u00030\u00df\u00012\u0007\u0010\u0094\u0002\u001a\u00020\fJ\u0013\u0010\u0095\u0002\u001a\u00030\u00d9\u00012\u0007\u0010\u0088\u0002\u001a\u00020uH\u0002J.\u0010\u0096\u0002\u001a\u00030\u00d9\u00012\u0007\u0010\u00e6\u0001\u001a\u00020<2\u0019\u0010\u0097\u0002\u001a\u0014\u0012\u0005\u0012\u00030\u00aa\u000107j\t\u0012\u0005\u0012\u00030\u00aa\u0001`LH\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001a\u00103\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020807\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020<X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010\u0010R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020807\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010:R*\u0010J\u001a\u0012\u0012\u0004\u0012\u00020K07j\b\u0012\u0004\u0012\u00020K`LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010:\"\u0004\bN\u0010OR*\u0010P\u001a\u0012\u0012\u0004\u0012\u00020Q07j\b\u0012\u0004\u0012\u00020Q`LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010:\"\u0004\bS\u0010OR\u001a\u0010T\u001a\u00020UX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u000e\"\u0004\b\\\u0010\u0010R\u001a\u0010]\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u000e\"\u0004\b_\u0010\u0010R\u001a\u0010`\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u000e\"\u0004\bb\u0010\u0010R\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\f07\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010:R\u001a\u0010e\u001a\u00020UX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010W\"\u0004\bf\u0010YR\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020807\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010:R\u001a\u0010i\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001c\u0010n\u001a\u0004\u0018\u00010oX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0010\u0010t\u001a\u0004\u0018\u00010uX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010v\u001a\u0004\u0018\u00010uX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010w\u001a\u00020xX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001f\u0010}\u001a\u0004\u0018\u00010~X\u0086\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R!\u0010\u0083\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u0084\u000107j\t\u0012\u0005\u0012\u00030\u0084\u0001`LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0085\u0001\u001a\u00020<X\u0086\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u0086\u0001\u0010>\"\u0006\b\u0087\u0001\u0010\u0088\u0001R/\u0010\u0089\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u008a\u000107j\t\u0012\u0005\u0012\u00030\u008a\u0001`LX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010:\"\u0005\b\u008c\u0001\u0010OR\u000f\u0010\u008d\u0001\u001a\u00020<X\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u008e\u0001\u001a\u00020+X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010-\"\u0005\b\u0090\u0001\u0010/R\u001d\u0010\u0091\u0001\u001a\u00020+X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010-\"\u0005\b\u0093\u0001\u0010/R\u001d\u0010\u0094\u0001\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010\u000e\"\u0005\b\u0096\u0001\u0010\u0010R\u001e\u0010\u0097\u0001\u001a\u00020<X\u0086\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u0098\u0001\u0010>\"\u0006\b\u0099\u0001\u0010\u0088\u0001R\"\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\"\u0010\u00a0\u0001\u001a\u0005\u0018\u00010\u009b\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a1\u0001\u0010\u009d\u0001\"\u0006\b\u00a2\u0001\u0010\u009f\u0001R\u001d\u0010\u00a3\u0001\u001a\u00020UX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a4\u0001\u0010W\"\u0005\b\u00a5\u0001\u0010YR\u001d\u0010\u00a6\u0001\u001a\u00020UX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a7\u0001\u0010W\"\u0005\b\u00a8\u0001\u0010YR$\u0010\u00a9\u0001\u001a\t\u0012\u0005\u0012\u00030\u00aa\u000107X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ab\u0001\u0010:\"\u0005\b\u00ac\u0001\u0010OR\u001d\u0010\u00ad\u0001\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ae\u0001\u0010\u000e\"\u0005\b\u00af\u0001\u0010\u0010R \u0010\u00b0\u0001\u001a\u00030\u00b1\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b2\u0001\u0010\u00b3\u0001\"\u0006\b\u00b4\u0001\u0010\u00b5\u0001R\u001d\u0010\u00b6\u0001\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b7\u0001\u0010\u000e\"\u0005\b\u00b8\u0001\u0010\u0010R\u001d\u0010\u00b9\u0001\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ba\u0001\u0010\u000e\"\u0005\b\u00bb\u0001\u0010\u0010R\u001d\u0010\u00bc\u0001\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bd\u0001\u0010\u000e\"\u0005\b\u00be\u0001\u0010\u0010R\u001d\u0010\u00bf\u0001\u001a\u00020UX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c0\u0001\u0010W\"\u0005\b\u00c1\u0001\u0010YR\u0019\u0010\u00c2\u0001\u001a\b\u0012\u0004\u0012\u00020807\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c3\u0001\u0010:R \u0010\u00c4\u0001\u001a\u00030\u00c5\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c6\u0001\u0010\u00c7\u0001\"\u0006\b\u00c8\u0001\u0010\u00c9\u0001R \u0010\u00ca\u0001\u001a\u00030\u00cb\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00cc\u0001\u0010\u00cd\u0001\"\u0006\b\u00ce\u0001\u0010\u00cf\u0001R\u0011\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\u00d1\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u00d2\u0001X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00d7\u0001\u001a\u0006\b\u00d3\u0001\u0010\u00d4\u0001\"\u0006\b\u00d5\u0001\u0010\u00d6\u0001\u00a8\u0006\u0099\u0002"}, d2 = {"Lcom/unl/addressvalidator/ui/fragments/HomeFragment;", "Landroid/app/Fragment;", "Lcom/unl/addressvalidator/ui/interfaces/SearchItemClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/LandmarkClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/AddressItemClickListner;", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/unl/addressvalidator/ui/interfaces/OperationHoursClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/AddressImageClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/EntranceClickListner;", "Landroid/location/LocationListener;", "()V", "accessibilityType", "", "getAccessibilityType", "()Ljava/lang/String;", "setAccessibilityType", "(Ljava/lang/String;)V", "adapter", "Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "getAdapter", "()Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "setAdapter", "(Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;)V", "addressType", "getAddressType", "setAddressType", "apiKey", "binding", "Lcom/unl/addressvalidator/databinding/FragmentHomeBinding;", "getBinding", "()Lcom/unl/addressvalidator/databinding/FragmentHomeBinding;", "setBinding", "(Lcom/unl/addressvalidator/databinding/FragmentHomeBinding;)V", "cityText", "getCityText", "setCityText", "createAddressModel", "Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "getCreateAddressModel", "()Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "setCreateAddressModel", "(Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;)V", "currLat", "", "getCurrLat", "()D", "setCurrLat", "(D)V", "currLong", "getCurrLong", "setCurrLong", "currentAddressText", "getCurrentAddressText", "setCurrentAddressText", "dataList", "Ljava/util/ArrayList;", "Lcom/unl/addressvalidator/ui/imagepicker/data/AddPicturesModel;", "getDataList", "()Ljava/util/ArrayList;", "dataListSize", "", "getDataListSize", "()I", "database", "Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "getDatabase", "()Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "setDatabase", "(Lcom/unl/addressvalidator/database/UnlAddressDatabase;)V", "daysType", "getDaysType", "setDaysType", "entranceImageList", "getEntranceImageList", "entranceList", "Lcom/example/roomdatabasewithmodelclassess/model/EntranceModel;", "Lkotlin/collections/ArrayList;", "getEntranceList", "setEntranceList", "(Ljava/util/ArrayList;)V", "entranceMarker", "Lcom/mapbox/mapboxsdk/annotations/Marker;", "getEntranceMarker", "setEntranceMarker", "entranceSelectionEnable", "", "getEntranceSelectionEnable", "()Z", "setEntranceSelectionEnable", "(Z)V", "fromAMPM", "getFromAMPM", "setFromAMPM", "fromHours", "getFromHours", "setFromHours", "fromMins", "getFromMins", "setFromMins", "imageList", "getImageList", "isChangeMarker", "setChangeMarker", "landMakrImageList", "getLandMakrImageList", "lifecycleOwner", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "setLifecycleRegistry", "(Landroidx/lifecycle/LifecycleRegistry;)V", "locationByGps", "Landroid/location/Location;", "locationByNetwork", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "setLocationManager", "(Landroid/location/LocationManager;)V", "mapBoxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "getMapBoxMap", "()Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "setMapBoxMap", "(Lcom/mapbox/mapboxsdk/maps/MapboxMap;)V", "markerViewList", "Landroid/view/View;", "moveCounter", "getMoveCounter", "setMoveCounter", "(I)V", "openCloseTimeList", "Lcom/example/roomdatabasewithmodelclassess/model/OpeningHoursSpecificationModel;", "getOpenCloseTimeList", "setOpenCloseTimeList", "permissionsRequestCode", "pinLat", "getPinLat", "setPinLat", "pinLong", "getPinLong", "setPinLong", "pincodeText", "getPincodeText", "setPincodeText", "replaceIndex", "getReplaceIndex", "setReplaceIndex", "reverseGeoCodeCurrentLocationResponse", "Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;", "getReverseGeoCodeCurrentLocationResponse", "()Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;", "setReverseGeoCodeCurrentLocationResponse", "(Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;)V", "reverseGeoCodeResponse", "getReverseGeoCodeResponse", "setReverseGeoCodeResponse", "selectImageForEntrance", "getSelectImageForEntrance", "setSelectImageForEntrance", "selectImageForLandmakr", "getSelectImageForLandmakr", "setSelectImageForLandmakr", "selectedLandmarkDataList", "Lcom/unl/addressvalidator/model/landmark/LandmarkDataList;", "getSelectedLandmarkDataList", "setSelectedLandmarkDataList", "stateText", "getStateText", "setStateText", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getSupportFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setSupportFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "toAMPM", "getToAMPM", "setToAMPM", "toHours", "getToHours", "setToHours", "toMins", "getToMins", "setToMins", "updateLocation", "getUpdateLocation", "setUpdateLocation", "uriList", "getUriList", "viewModel", "Lcom/unl/addressvalidator/ui/viewmodel/HomeViewModel;", "getViewModel", "()Lcom/unl/addressvalidator/ui/viewmodel/HomeViewModel;", "setViewModel", "(Lcom/unl/addressvalidator/ui/viewmodel/HomeViewModel;)V", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "()Landroidx/lifecycle/ViewModelStoreOwner;", "setViewModelStoreOwner", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "vpmId", "weekDays", "", "getWeekDays", "()[Ljava/lang/String;", "setWeekDays", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "addressImageClick", "", "index", "isReplace", "addressItemClick", "callAddressFromCurrLocation", "latlng", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "callReverseGeoCode", "changeCameraPosition", "clearMap", "dayClick", "day", "entranceDeleteClick", "position", "entranceModel", "entranceEditClick", "entranceImageClick", "getAddressCreated", "getAddressFromCurrLocatinResponse", "getAutocompleteResponse", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "getMetadataFromMenifest", "getNearbyLandmarkResponse", "getReversgeoCodeResponse", "getSearchAddressResponse", "iniitLocatinoManager", "initiateViewModel", "itemClick", "hour", "type", "landmarkItemClick", "landmarkDataList", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLocationChanged", "location", "onResume", "onStart", "openImagePicker", "imageLimit", "requestPermissions", "searchItemClick", "searchResultDTO", "Lcom/unl/addressvalidator/model/autocomplet/AutocompleteData;", "setSearchListView", "showMarker", "latLng", "address", "updateCurrentLocation", "uploadLandmarkPic", "resulttList", "Companion", "sdk_debug"})
public final class HomeFragment extends android.app.Fragment implements com.unl.addressvalidator.ui.interfaces.SearchItemClickListner, com.unl.addressvalidator.ui.interfaces.LandmarkClickListner, com.unl.addressvalidator.ui.interfaces.AddressItemClickListner, androidx.lifecycle.LifecycleOwner, com.unl.addressvalidator.ui.interfaces.OperationHoursClickListner, com.unl.addressvalidator.ui.interfaces.AddressImageClickListner, com.unl.addressvalidator.ui.interfaces.EntranceClickListner, android.location.LocationListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.mapbox.mapboxsdk.annotations.Marker> entranceMarker;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> openCloseTimeList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] weekDays = {"All Day\'s", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
    private android.location.Location locationByGps;
    private android.location.Location locationByNetwork;
    public android.location.LocationManager locationManager;
    private boolean selectImageForEntrance = false;
    private boolean selectImageForLandmakr = false;
    private boolean entranceSelectionEnable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> imageList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> landMakrImageList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> dataList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> entranceImageList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> uriList = null;
    public com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter adapter;
    private final int dataListSize = 9;
    private int replaceIndex = 0;
    private java.lang.String apiKey;
    private java.lang.String vpmId;
    public com.unl.addressvalidator.ui.viewmodel.HomeViewModel viewModel;
    public androidx.lifecycle.LifecycleOwner lifecycleOwner;
    public androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner;
    public androidx.fragment.app.FragmentManager supportFragmentManager;
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.databinding.FragmentHomeBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.mapbox.mapboxsdk.maps.MapboxMap mapBoxMap;
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse reverseGeoCodeResponse;
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse reverseGeoCodeCurrentLocationResponse;
    private double pinLat = 0.0;
    private double pinLong = 0.0;
    private double currLat = 0.0;
    private double currLong = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentAddressText = "";
    private int moveCounter = 0;
    private boolean isChangeMarker = true;
    private boolean updateLocation = true;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addressType = "home";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accessibilityType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cityText = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String stateText = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pincodeText = "";
    public com.unl.addressvalidator.database.UnlAddressDatabase database;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LifecycleRegistry lifecycleRegistry;
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.model.dbmodel.CreateAddressModel createAddressModel;
    private final int permissionsRequestCode = 123;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String daysType = "All Day\'s";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromHours = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromMins = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromAMPM = "AM";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String toHours = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String toMins = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String toAMPM = "AM";
    private java.util.ArrayList<android.view.View> markerViewList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> selectedLandmarkDataList;
    @org.jetbrains.annotations.NotNull()
    public static final com.unl.addressvalidator.ui.fragments.HomeFragment.Companion Companion = null;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> getEntranceList() {
        return null;
    }
    
    public final void setEntranceList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.mapbox.mapboxsdk.annotations.Marker> getEntranceMarker() {
        return null;
    }
    
    public final void setEntranceMarker(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.mapbox.mapboxsdk.annotations.Marker> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> getOpenCloseTimeList() {
        return null;
    }
    
    public final void setOpenCloseTimeList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getWeekDays() {
        return null;
    }
    
    public final void setWeekDays(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationManager getLocationManager() {
        return null;
    }
    
    public final void setLocationManager(@org.jetbrains.annotations.NotNull()
    android.location.LocationManager p0) {
    }
    
    public final boolean getSelectImageForEntrance() {
        return false;
    }
    
    public final void setSelectImageForEntrance(boolean p0) {
    }
    
    public final boolean getSelectImageForLandmakr() {
        return false;
    }
    
    public final void setSelectImageForLandmakr(boolean p0) {
    }
    
    public final boolean getEntranceSelectionEnable() {
        return false;
    }
    
    public final void setEntranceSelectionEnable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImageList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> getLandMakrImageList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> getDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> getEntranceImageList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> getUriList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter p0) {
    }
    
    public final int getDataListSize() {
        return 0;
    }
    
    public final int getReplaceIndex() {
        return 0;
    }
    
    public final void setReplaceIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.viewmodel.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.viewmodel.HomeViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
        return null;
    }
    
    public final void setLifecycleOwner(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelStoreOwner getViewModelStoreOwner() {
        return null;
    }
    
    public final void setViewModelStoreOwner(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelStoreOwner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentManager getSupportFragmentManager() {
        return null;
    }
    
    public final void setSupportFragmentManager(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.databinding.FragmentHomeBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mapbox.mapboxsdk.maps.MapboxMap getMapBoxMap() {
        return null;
    }
    
    public final void setMapBoxMap(@org.jetbrains.annotations.Nullable()
    com.mapbox.mapboxsdk.maps.MapboxMap p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse getReverseGeoCodeResponse() {
        return null;
    }
    
    public final void setReverseGeoCodeResponse(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse getReverseGeoCodeCurrentLocationResponse() {
        return null;
    }
    
    public final void setReverseGeoCodeCurrentLocationResponse(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse p0) {
    }
    
    public final double getPinLat() {
        return 0.0;
    }
    
    public final void setPinLat(double p0) {
    }
    
    public final double getPinLong() {
        return 0.0;
    }
    
    public final void setPinLong(double p0) {
    }
    
    public final double getCurrLat() {
        return 0.0;
    }
    
    public final void setCurrLat(double p0) {
    }
    
    public final double getCurrLong() {
        return 0.0;
    }
    
    public final void setCurrLong(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentAddressText() {
        return null;
    }
    
    public final void setCurrentAddressText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getMoveCounter() {
        return 0;
    }
    
    public final void setMoveCounter(int p0) {
    }
    
    public final boolean isChangeMarker() {
        return false;
    }
    
    public final void setChangeMarker(boolean p0) {
    }
    
    public final boolean getUpdateLocation() {
        return false;
    }
    
    public final void setUpdateLocation(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessibilityType() {
        return null;
    }
    
    public final void setAccessibilityType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityText() {
        return null;
    }
    
    public final void setCityText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStateText() {
        return null;
    }
    
    public final void setStateText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPincodeText() {
        return null;
    }
    
    public final void setPincodeText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.database.UnlAddressDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.database.UnlAddressDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LifecycleRegistry getLifecycleRegistry() {
        return null;
    }
    
    public final void setLifecycleRegistry(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LifecycleRegistry p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.dbmodel.CreateAddressModel getCreateAddressModel() {
        return null;
    }
    
    public final void setCreateAddressModel(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.dbmodel.CreateAddressModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDaysType() {
        return null;
    }
    
    public final void setDaysType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromHours() {
        return null;
    }
    
    public final void setFromHours(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromMins() {
        return null;
    }
    
    public final void setFromMins(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromAMPM() {
        return null;
    }
    
    public final void setFromAMPM(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToHours() {
        return null;
    }
    
    public final void setToHours(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToMins() {
        return null;
    }
    
    public final void setToMins(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToAMPM() {
        return null;
    }
    
    public final void setToAMPM(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> getSelectedLandmarkDataList() {
        return null;
    }
    
    public final void setSelectedLandmarkDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void callReverseGeoCode(com.mapbox.mapboxsdk.geometry.LatLng latlng) {
    }
    
    public final void clearMap() {
    }
    
    public final void showMarker(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.geometry.LatLng latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    private final void setSearchListView() {
    }
    
    private final void initiateViewModel() {
    }
    
    private final void getAutocompleteResponse() {
    }
    
    private final void getSearchAddressResponse() {
    }
    
    private final void getNearbyLandmarkResponse() {
    }
    
    public final void changeCameraPosition(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.geometry.LatLng latlng) {
    }
    
    public final void getAddressCreated() {
    }
    
    private final void getReversgeoCodeResponse() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void openImagePicker() {
    }
    
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.unl.addressvalidator.ui.fragments.HomeFragment newInstance(@org.jetbrains.annotations.NotNull()
    android.app.Activity lifecycleOwner1, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragmentManager1) {
        return null;
    }
    
    private final void getMetadataFromMenifest() {
    }
    
    @java.lang.Override()
    public void searchItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.autocomplet.AutocompleteData searchResultDTO) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return null;
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    private final void requestPermissions() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void iniitLocatinoManager() {
    }
    
    private final void updateCurrentLocation(android.location.Location location) {
    }
    
    private final void callAddressFromCurrLocation(com.mapbox.mapboxsdk.geometry.LatLng latlng) {
    }
    
    private final void getAddressFromCurrLocatinResponse() {
    }
    
    @java.lang.Override()
    public void landmarkItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.landmark.LandmarkDataList landmarkDataList) {
    }
    
    @java.lang.Override()
    public void uploadLandmarkPic(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> resulttList) {
    }
    
    @java.lang.Override()
    public void addressImageClick(int index, boolean isReplace) {
    }
    
    public final void openImagePicker(int imageLimit) {
    }
    
    @java.lang.Override()
    public void dayClick(@org.jetbrains.annotations.NotNull()
    java.lang.String day) {
    }
    
    @java.lang.Override()
    public void itemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String hour, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @java.lang.Override()
    public void entranceEditClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel) {
    }
    
    @java.lang.Override()
    public void entranceDeleteClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel) {
    }
    
    @java.lang.Override()
    public void entranceImageClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel) {
    }
    
    @java.lang.Override()
    public void addressItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.dbmodel.CreateAddressModel createAddressModel) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/unl/addressvalidator/ui/fragments/HomeFragment$Companion;", "", "()V", "newInstance", "Lcom/unl/addressvalidator/ui/fragments/HomeFragment;", "lifecycleOwner1", "Landroid/app/Activity;", "supportFragmentManager1", "Landroidx/fragment/app/FragmentManager;", "sdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.unl.addressvalidator.ui.fragments.HomeFragment newInstance(@org.jetbrains.annotations.NotNull()
        android.app.Activity lifecycleOwner1, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager supportFragmentManager1) {
            return null;
        }
    }
}