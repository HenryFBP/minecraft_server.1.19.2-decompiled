import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class bsn {
   public static final int a = 8;
   public static final int b = 4;
   private static final azu c = anc.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final azu j = azu.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bcx<?> a(bcx<bsm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(bvn.a));
      $$0.b(bvn.b);
      $$0.e();
      return $$0;
   }

   private static void b(bcx<bsm> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bev(45, 90), new bez()));
   }

   private static void c(bcx<bsm> $$0) {
      $$0.a(
         bvn.b,
         10,
         ImmutableList.of(
            new bdn(bku.au, 200),
            new bdi(bbr.O, 0.6F),
            bft.a(bku.au, 1.0F, 8, true),
            new bgb(bsn::d),
            new bfl<>(bsm::t, bft.b(bku.ao, 0.4F, 8, false)),
            new bfn<>(new bfp(8.0F), azu.a(30, 60)),
            new bdl(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bcx<bsm> $$0) {
      $$0.a(
         bvn.k,
         10,
         ImmutableList.of(
            new bdn(bku.au, 200),
            new bdi(bbr.O, 0.6F),
            new bfu(1.0F),
            new bfl<>(bsm::t, new bew(40)),
            new bfl<>(bbk::y_, new bew(15)),
            new bge(),
            new bdz(bsn::i, bku.o)
         ),
         bku.o
      );
   }

   private static void e(bcx<bsm> $$0) {
      $$0.a(bvn.n, 10, ImmutableList.of(bft.b(bku.z, 1.3F, 15, false), a(), new bfn<>(new bfp(8.0F), azu.a(30, 60)), new bdz(bsn::e, bku.z)), bku.z);
   }

   private static bfm<bsm> a() {
      return new bfm<>(ImmutableList.of(Pair.of(new bff(0.4F), 2), Pair.of(new bfw(0.4F, 3), 2), Pair.of(new bdx(30, 60), 1)));
   }

   protected static void a(bsm $$0) {
      bcx<bsm> $$1 = $$0.dy();
      bvn $$2 = (bvn)$$1.f().orElse(null);
      $$1.a(ImmutableList.of(bvn.k, bvn.n, bvn.b));
      bvn $$3 = (bvn)$$1.f().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.u($$1.a(bku.o));
   }

   protected static void a(bsm $$0, bcc $$1) {
      if (!$$0.y_()) {
         if ($$1.ad() == bbr.ar && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(bsm $$0, bcc $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(bsm $$0, bcc $$1) {
      bcx<bsm> $$3 = $$0.dy();
      bcc $$2 = bdp.a($$0, $$3.c(bku.z), $$1);
      $$2 = bdp.a($$0, $$3.c(bku.o), $$2);
      e($$0, $$2);
   }

   private static void e(bsm $$0, bcc $$1) {
      $$0.dy().b(bku.o);
      $$0.dy().b(bku.m);
      $$0.dy().a(bku.z, $$1, (long)c.a($$0.s.w));
   }

   private static Optional<? extends bcc> d(bsm $$0) {
      return !c($$0) && !i($$0) ? $$0.dy().c(bku.l) : Optional.empty();
   }

   static boolean a(bsm $$0, gt $$1) {
      Optional<gt> $$2 = $$0.dy().c(bku.au);
      return $$2.isPresent() && ((gt)$$2.get()).a($$1, 8.0);
   }

   private static boolean e(bsm $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(bsm $$0) {
      if ($$0.y_()) {
         return false;
      } else {
         int $$1 = $$0.dy().c(bku.aq).orElse(0);
         int $$2 = $$0.dy().c(bku.ar).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(bsm $$0, bcc $$1) {
      bcx<bsm> $$2 = $$0.dy();
      $$2.b(bku.av);
      $$2.b(bku.r);
      if ($$0.y_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(bsm $$0, bcc $$1) {
      if (!$$0.dy().c(bvn.n) || $$1.ad() != bbr.ar) {
         if ($$1.ad() != bbr.O) {
            if (!bdp.a($$0, $$1, 4.0)) {
               if (bly.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(bsm $$0, bcc $$1) {
      bcx<bsm> $$2 = $$0.dy();
      $$2.b(bku.E);
      $$2.b(bku.r);
      $$2.a(bku.o, $$1, 200L);
   }

   private static void h(bsm $$0, bcc $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(bsm $$0, bcc $$1) {
      if (!c($$0)) {
         Optional<bcc> $$2 = $$0.dy().c(bku.o);
         bcc $$3 = bdp.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<ajv> b(bsm $$0) {
      return $$0.dy().f().map($$1 -> a($$0, $$1));
   }

   private static ajv a(bsm $$0, bvn $$1) {
      if ($$1 == bvn.n || $$0.fK()) {
         return ajw.iU;
      } else if ($$1 == bvn.k) {
         return ajw.iP;
      } else {
         return h($$0) ? ajw.iU : ajw.iO;
      }
   }

   private static List<bsm> g(bsm $$0) {
      return (List<bsm>)$$0.dy().c(bku.an).orElse(ImmutableList.of());
   }

   private static boolean h(bsm $$0) {
      return $$0.dy().a(bku.au);
   }

   private static boolean i(bsm $$0) {
      return $$0.dy().a(bku.r);
   }

   protected static boolean c(bsm $$0) {
      return $$0.dy().a(bku.av);
   }
}
