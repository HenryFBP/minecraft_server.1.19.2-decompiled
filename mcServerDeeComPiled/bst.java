import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class bst {
   public static final int a = 8;
   public static final int b = 4;
   public static final cat c = caz.ne;
   private static final int d = 16;
   private static final int e = 600;
   private static final int f = 120;
   private static final int g = 9;
   private static final int h = 200;
   private static final int i = 200;
   private static final int j = 300;
   private static final azu k = anc.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final azu o = anc.a(10, 40);
   private static final azu p = anc.a(10, 30);
   private static final azu q = anc.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final azu A = anc.a(5, 7);
   private static final azu B = anc.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bcx<?> a(bss $$0, bcx<bss> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(bvn.a));
      $$1.b(bvn.b);
      $$1.e();
      return $$1;
   }

   protected static void a(bss $$0, amn $$1) {
      int $$2 = k.a($$1);
      $$0.dy().a(bku.af, true, (long)$$2);
   }

   private static void a(bcx<bss> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bev(45, 90), new bez(), new ben(), d(), e(), new btc(), new bsy(120), new bgc(300, bst::a), new bgf()));
   }

   private static void b(bcx<bss> $$0) {
      $$0.a(bvn.b, 10, ImmutableList.of(new bfp(bst::b, 14.0F), new bgb(bsr::fK, bst::j), new bfl(bss::n, new bsz()), c(), f(), a(), b(), new bfr(bbr.bn, 4)));
   }

   private static void b(bss $$0, bcx<bss> $$1) {
      $$1.a(
         bvn.k,
         10,
         ImmutableList.of(
            new bge((Predicate<bcc>)($$1x -> !b($$0, $$1x))),
            new bfl(bst::c, new bdm(5, 0.75F)),
            new bfu(1.0F),
            new bew(20),
            new bdv(),
            new bsx(),
            new bdz(bst::i, bku.o)
         ),
         bku.o
      );
   }

   private static void c(bcx<bss> $$0) {
      $$0.a(
         bvn.l,
         10,
         ImmutableList.of(
            c(),
            new bfp(bst::b, 14.0F),
            new bgb(bsr::fK, bst::j),
            new bfl((Predicate)($$0x -> !$$0x.fR()), new bei(bku.ag, 2, 1.0F)),
            new bfl(bss::fR, new bei(bku.ag, 4, 0.6F)),
            new bfm(ImmutableList.of(Pair.of(new bfp(bbr.ar, 8.0F), 1), Pair.of(new bff(0.6F, 2, 1), 1), Pair.of(new bdx(10, 20), 1)))
         ),
         bku.ag
      );
   }

   private static void d(bcx<bss> $$0) {
      $$0.a(bvn.m, 10, ImmutableList.of(new bej(bst::y, 1.0F, true, 9), new bta(9), new btb(200, 200)), bku.ab);
   }

   private static void e(bcx<bss> $$0) {
      $$0.a(bvn.n, 10, ImmutableList.of(bft.b(bku.z, 1.0F, 12, true), a(), b(), new bdz(bst::n, bku.z)), bku.z);
   }

   private static void f(bcx<bss> $$0) {
      $$0.a(bvn.o, 10, ImmutableList.of(new bex(0.8F), new bfp(bst::b, 8.0F), new bfl<>(bbn::bI, a()), new bdw(8, bst::a)), bku.s);
   }

   private static bfm<bss> a() {
      return new bfm<>(
         ImmutableList.of(Pair.of(new bfp(bbr.bn, 8.0F), 1), Pair.of(new bfp(bbr.ar, 8.0F), 1), Pair.of(new bfp(8.0F), 1), Pair.of(new bdx(30, 60), 1))
      );
   }

   private static bfm<bss> b() {
      return new bfm<>(
         ImmutableList.of(
            Pair.of(new bff(0.6F), 2),
            Pair.of(bem.a(bbr.ar, 8, bku.q, 0.6F, 2), 2),
            Pair.of(new bfl<>(bst::f, new bfw(0.6F, 3)), 2),
            Pair.of(new bdx(30, 60), 1)
         )
      );
   }

   private static bft<gt> c() {
      return bft.a(bku.au, 1.0F, 8, false);
   }

   private static bds<bss, bcc> d() {
      return new bds<>(bss::y_, bku.L, bku.z, B);
   }

   private static bds<bss, bcc> e() {
      return new bds<>(bst::i, bku.ap, bku.z, A);
   }

   protected static void a(bss $$0) {
      bcx<bss> $$1 = $$0.dy();
      bvn $$2 = (bvn)$$1.f().orElse(null);
      $$1.a(ImmutableList.of(bvn.m, bvn.k, bvn.n, bvn.l, bvn.o, bvn.b));
      bvn $$3 = (bvn)$$1.f().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.u($$1.a(bku.o));
      if (!$$1.a(bku.s) && g($$0)) {
         $$0.p();
      }

      if (!$$1.a(bku.ag)) {
         $$1.b(bku.ah);
      }

      $$0.w($$1.a(bku.ah));
   }

   private static boolean g(bss $$0) {
      if (!$$0.y_()) {
         return false;
      } else {
         bbn $$1 = $$0.cQ();
         return $$1 instanceof bss && ((bss)$$1).y_() || $$1 instanceof bsm && ((bsm)$$1).y_();
      }
   }

   protected static void a(bss $$0, bqv $$1) {
      m($$0);
      cax $$2;
      if ($$1.i().a(caz.qq)) {
         $$0.a($$1, $$1.i().K());
         $$2 = $$1.i();
         $$1.ah();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dy().b(bku.ac);
         c($$0, $$2);
         d((bcc)$$0);
      } else if (c($$2) && !t($$0)) {
         r($$0);
      } else {
         boolean $$4 = $$0.j($$2);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(bss $$0, cax $$1) {
      if (x($$0)) {
         $$0.b($$0.b(bai.b));
      }

      $$0.p($$1);
   }

   private static cax a(bqv $$0) {
      cax $$1 = $$0.i();
      cax $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.ah();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(bss $$0, boolean $$1) {
      cax $$2 = $$0.b(bai.b);
      $$0.a(bai.b, cax.b);
      if ($$0.fK()) {
         boolean $$3 = b($$2);
         if ($$1 && $$3) {
            a($$0, h($$0));
         } else if (!$$3) {
            boolean $$4 = $$0.j($$2);
            if (!$$4) {
               d($$0, $$2);
            }
         }
      } else {
         boolean $$5 = $$0.j($$2);
         if (!$$5) {
            cax $$6 = $$0.ez();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.o($$2);
         }
      }

   }

   protected static void b(bss $$0) {
      if (u($$0) && !$$0.eA().b()) {
         $$0.b($$0.eA());
         $$0.a(bai.b, cax.b);
      }

   }

   private static void d(bss $$0, cax $$1) {
      cax $$2 = $$0.m($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(bss $$0, List<cax> $$1) {
      Optional<buc> $$2 = $$0.dy().c(bku.k);
      if ($$2.isPresent()) {
         a($$0, (buc)$$2.get(), $$1);
      } else {
         b($$0, $$1);
      }

   }

   private static void b(bss $$0, List<cax> $$1) {
      a($$0, $$1, s($$0));
   }

   private static void a(bss $$0, buc $$1, List<cax> $$2) {
      a($$0, $$2, $$1.cY());
   }

   private static void a(bss $$0, List<cax> $$1, dwq $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bai.b);

         for(cax $$3 : $$1) {
            bdp.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }

   }

   private static List<cax> h(bss $$0) {
      dsg $$1 = $$0.s.n().aH().a(dry.aA);
      List<cax> $$2 = $$1.a(new dsd.a((agg)$$0.s).a(dul.a, $$0).a($$0.s.w).a(duk.h));
      return $$2;
   }

   private static boolean a(bcc $$0, bcc $$1) {
      if ($$1.ad() != bbr.O) {
         return false;
      } else {
         return amn.a($$0.s.U()).i() < 0.1F;
      }
   }

   protected static boolean a(bss $$0, cax $$1) {
      if ($$0.y_() && $$1.a(aks.R)) {
         return false;
      } else if ($$1.a(aks.P)) {
         return false;
      } else if (w($$0) && $$0.dy().a(bku.o)) {
         return false;
      } else if (b($$1)) {
         return y($$0);
      } else {
         boolean $$2 = $$0.n($$1);
         if ($$1.a(caz.qq)) {
            return $$2;
         } else if (c($$1)) {
            return !t($$0) && $$2;
         } else if (!a($$1)) {
            return $$0.q($$1);
         } else {
            return y($$0) && $$2;
         }
      }
   }

   protected static boolean a(cax $$0) {
      return $$0.a(aks.Q);
   }

   private static boolean a(bss $$0, bbn $$1) {
      if (!($$1 instanceof bce)) {
         return false;
      } else {
         bce $$2 = (bce)$$1;
         return !$$2.y_() || !$$2.bo() || g((bcc)$$0) || g($$2) || $$2 instanceof bss && $$2.cQ() == null;
      }
   }

   private static boolean b(bss $$0, bcc $$1) {
      return j($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean i(bss $$0) {
      bcx<bss> $$1 = $$0.dy();
      if ($$1.a(bku.ap)) {
         bcc $$2 = (bcc)$$1.c(bku.ap).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bcc> j(bss $$0) {
      bcx<bss> $$1 = $$0.dy();
      if (i($$0)) {
         return Optional.empty();
      } else {
         Optional<bcc> $$2 = bdp.a($$0, bku.Z);
         if ($$2.isPresent() && bly.d($$0, (bcc)$$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bku.aa)) {
               Optional<buc> $$3 = $$1.c(bku.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bce> $$4 = $$1.c(bku.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<buc> $$5 = $$1.c(bku.ak);
               return $$5.isPresent() && bly.c($$0, (bcc)$$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(buc $$0, boolean $$1) {
      List<bss> $$2 = $$0.s.a(bss.class, $$0.cy().g(16.0));
      $$2.stream().filter(bst::d).filter($$2x -> !$$1 || bdp.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.s.W().b(cgt.J)) {
            d((bsr)$$1x, $$0);
         } else {
            c((bsr)$$1x, $$0);
         }

      });
   }

   public static baj a(bss $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cax $$4 = $$3.a(1);
         c($$0, $$4);
         d((bcc)$$0);
         m($$0);
         return baj.b;
      } else {
         return baj.d;
      }
   }

   protected static boolean b(bss $$0, cax $$1) {
      return !w($$0) && !u($$0) && $$0.fK() && b($$1);
   }

   protected static void a(bss $$0, bcc $$1) {
      if (!($$1 instanceof bss)) {
         if (x($$0)) {
            a($$0, false);
         }

         bcx<bss> $$2 = $$0.dy();
         $$2.b(bku.ag);
         $$2.b(bku.ah);
         $$2.b(bku.ab);
         if ($$1 instanceof buc) {
            $$2.a(bku.ae, true, 400L);
         }

         f($$0).ifPresent($$2x -> {
            if ($$2x.ad() != $$1.ad()) {
               $$2.b(bku.z);
            }

         });
         if ($$0.y_()) {
            $$2.a(bku.z, $$1, 100L);
            if (bly.d($$0, $$1)) {
               b((bsr)$$0, $$1);
            }

         } else if ($$1.ad() == bbr.O && p($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((bsr)$$0, $$1);
         }
      }
   }

   protected static void a(bsr $$0, bcc $$1) {
      if (!$$0.dy().c(bvn.n)) {
         if (bly.d($$0, $$1)) {
            if (!bdp.a($$0, $$1, 4.0)) {
               if ($$1.ad() == bbr.bn && $$0.s.W().b(cgt.J)) {
                  d($$0, $$1);
                  a($$0);
               } else {
                  c($$0, $$1);
                  b($$0, $$1);
               }

            }
         }
      }
   }

   public static Optional<ajv> c(bss $$0) {
      return $$0.dy().f().map($$1 -> a($$0, $$1));
   }

   private static ajv a(bss $$0, bvn $$1) {
      if ($$1 == bvn.k) {
         return ajw.po;
      } else if ($$0.fJ()) {
         return ajw.pt;
      } else if ($$1 == bvn.n && k($$0)) {
         return ajw.pt;
      } else if ($$1 == bvn.m) {
         return ajw.pm;
      } else if ($$1 == bvn.l) {
         return ajw.pp;
      } else if (e((bcc)$$0)) {
         return ajw.pr;
      } else {
         return v($$0) ? ajw.pt : ajw.pn;
      }
   }

   private static boolean k(bss $$0) {
      bcx<bss> $$1 = $$0.dy();
      return !$$1.a(bku.z) ? false : ((bcc)$$1.c(bku.z).get()).a($$0, 12.0);
   }

   protected static boolean d(bss $$0) {
      return $$0.dy().a(bku.af) || l($$0).stream().anyMatch($$0x -> $$0x.dy().a(bku.af));
   }

   private static List<bsr> l(bss $$0) {
      return (List<bsr>)$$0.dy().c(bku.am).orElse(ImmutableList.of());
   }

   private static List<bsr> e(bsr $$0) {
      return (List<bsr>)$$0.dy().c(bku.al).orElse(ImmutableList.of());
   }

   public static boolean a(bcc $$0) {
      for(cax $$2 : $$0.bF()) {
         cat $$3 = $$2.c();
         if ($$3 instanceof byo && ((byo)$$3).d() == byq.d) {
            return true;
         }
      }

      return false;
   }

   private static void m(bss $$0) {
      $$0.dy().b(bku.m);
      $$0.D().n();
   }

   private static bfn<bss> f() {
      return new bfn<>(new bds<>(bss::y_, bku.aj, bku.s, p), o);
   }

   protected static void b(bsr $$0, bcc $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ad() != bbr.O || $$1x.n() && ((bsm)$$1).fL()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(bsr $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void e(bss $$0) {
      l($$0).forEach(bst::c);
   }

   protected static void c(bsr $$0, bcc $$1) {
      if (bly.d($$0, $$1)) {
         $$0.dy().b(bku.E);
         $$0.dy().a(bku.Z, $$1.co(), 600L);
         if ($$1.ad() == bbr.O && $$0.n()) {
            c($$0);
         }

         if ($$1.ad() == bbr.bn && $$0.s.W().b(cgt.J)) {
            $$0.dy().a(bku.aa, true, 600L);
         }

      }
   }

   private static void d(bsr $$0, bcc $$1) {
      Optional<buc> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, (bcc)$$2.get());
      } else {
         c($$0, $$1);
      }

   }

   private static void e(bsr $$0, bcc $$1) {
      Optional<bcc> $$2 = f($$0);
      bcc $$3 = bdp.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bcc> f(bsr $$0) {
      return bdp.a($$0, bku.Z);
   }

   public static Optional<bcc> f(bss $$0) {
      return $$0.dy().a(bku.z) ? $$0.dy().c(bku.z) : Optional.empty();
   }

   public static Optional<buc> b(bsr $$0) {
      return $$0.dy().a(bku.l) ? $$0.dy().c(bku.l) : Optional.empty();
   }

   private static void c(bss $$0, bcc $$1) {
      l($$0).stream().filter($$0x -> $$0x instanceof bss).forEach($$1x -> d((bss)$$1x, $$1));
   }

   private static void d(bss $$0, bcc $$1) {
      bcx<bss> $$2 = $$0.dy();
      bcc $$3 = bdp.a($$0, $$2.c(bku.z), $$1);
      $$3 = bdp.a($$0, $$2.c(bku.o), $$3);
      e($$0, $$3);
   }

   private static boolean n(bss $$0) {
      bcx<bss> $$1 = $$0.dy();
      if (!$$1.a(bku.z)) {
         return true;
      } else {
         bcc $$2 = (bcc)$$1.c(bku.z).get();
         bbr<?> $$3 = $$2.ad();
         if ($$3 == bbr.O) {
            return o($$0);
         } else if (a($$3)) {
            return !$$1.b(bku.ap, $$2);
         } else {
            return false;
         }
      }
   }

   private static boolean o(bss $$0) {
      return !p($$0);
   }

   private static boolean p(bss $$0) {
      int $$1 = $$0.dy().c(bku.aq).orElse(0) + 1;
      int $$2 = $$0.dy().c(bku.ar).orElse(0);
      return $$2 > $$1;
   }

   private static void e(bss $$0, bcc $$1) {
      $$0.dy().b(bku.Z);
      $$0.dy().b(bku.o);
      $$0.dy().b(bku.m);
      $$0.dy().a(bku.z, $$1, (long)q.a($$0.s.w));
      c((bsr)$$0);
   }

   protected static void c(bsr $$0) {
      $$0.dy().a(bku.af, true, (long)k.a($$0.s.w));
   }

   private static boolean q(bss $$0) {
      return $$0.dy().a(bku.as);
   }

   private static void r(bss $$0) {
      $$0.dy().a(bku.at, true, 200L);
   }

   private static dwq s(bss $$0) {
      dwq $$1 = bmm.a($$0, 4, 2);
      return $$1 == null ? $$0.cY() : $$1;
   }

   private static boolean t(bss $$0) {
      return $$0.dy().a(bku.at);
   }

   protected static boolean d(bsr $$0) {
      return $$0.dy().c(bvn.b);
   }

   private static boolean c(bcc $$0) {
      return $$0.b(caz.tM);
   }

   private static void d(bcc $$0) {
      $$0.dy().a(bku.ab, true, 120L);
   }

   private static boolean u(bss $$0) {
      return $$0.dy().a(bku.ab);
   }

   private static boolean b(cax $$0) {
      return $$0.a(c);
   }

   private static boolean c(cax $$0) {
      return $$0.a(aks.S);
   }

   private static boolean v(bss $$0) {
      return $$0.dy().a(bku.au);
   }

   private static boolean e(bcc $$0) {
      return $$0.dy().a(bku.as);
   }

   private static boolean f(bcc $$0) {
      return !e($$0);
   }

   public static boolean b(bcc $$0) {
      return $$0.ad() == bbr.bn && $$0.b(bst::a);
   }

   private static boolean w(bss $$0) {
      return $$0.dy().a(bku.ae);
   }

   private static boolean g(bcc $$0) {
      return $$0.dy().a(bku.x);
   }

   private static boolean x(bss $$0) {
      return !$$0.eA().b();
   }

   private static boolean y(bss $$0) {
      return $$0.eA().b() || !a($$0.eA());
   }

   public static boolean a(bbr<?> $$0) {
      return $$0 == bbr.bm || $$0 == bbr.bi;
   }
}
