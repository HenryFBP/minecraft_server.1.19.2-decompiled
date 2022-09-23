import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class bsw {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final double f = 12.0;
   private static final float g = 0.6F;
   private static final int h = 2;
   private static final int i = 100;
   private static final int j = 5;

   protected static bcx<?> a(bsv $$0, bcx<bsv> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(bvn.a));
      $$1.b(bvn.b);
      $$1.e();
      return $$1;
   }

   protected static void a(bsv $$0) {
      hb $$1 = hb.a($$0.s.ab(), $$0.da());
      $$0.dy().a(bku.b, $$1);
   }

   private static void b(bsv $$0, bcx<bsv> $$1) {
      $$1.a(bvn.a, 0, ImmutableList.of(new bev(45, 90), new bez(), new ben(), new bgf()));
   }

   private static void c(bsv $$0, bcx<bsv> $$1) {
      $$1.a(bvn.b, 10, ImmutableList.of(new bgb(bsw::a), a(), b(), new bfr(bbr.bn, 4)));
   }

   private static void d(bsv $$0, bcx<bsv> $$1) {
      $$1.a(bvn.k, 10, ImmutableList.of(new bge((Predicate<bcc>)($$1x -> !a((bsr)$$0, $$1x))), new bfu(1.0F), new bew(20)), bku.o);
   }

   private static bfm<bsv> a() {
      return new bfm<>(
         ImmutableList.of(
            Pair.of(new bfp(bbr.bn, 8.0F), 1),
            Pair.of(new bfp(bbr.ar, 8.0F), 1),
            Pair.of(new bfp(bbr.as, 8.0F), 1),
            Pair.of(new bfp(8.0F), 1),
            Pair.of(new bdx(30, 60), 1)
         )
      );
   }

   private static bfm<bsv> b() {
      return new bfm<>(
         ImmutableList.of(
            Pair.of(new bff(0.6F), 2),
            Pair.of(bem.a(bbr.ar, 8, bku.q, 0.6F, 2), 2),
            Pair.of(bem.a(bbr.as, 8, bku.q, 0.6F, 2), 2),
            Pair.of(new bgh(bku.b, 0.6F, 2, 100), 2),
            Pair.of(new bgg(bku.b, 0.6F, 5), 2),
            Pair.of(new bdx(30, 60), 1)
         )
      );
   }

   protected static void b(bsv $$0) {
      bcx<bsv> $$1 = $$0.dy();
      bvn $$2 = (bvn)$$1.f().orElse(null);
      $$1.a(ImmutableList.of(bvn.k, bvn.b));
      bvn $$3 = (bvn)$$1.f().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.u($$1.a(bku.o));
   }

   private static boolean a(bsr $$0, bcc $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bcc> a(bsr $$0) {
      Optional<bcc> $$1 = bdp.a($$0, bku.Z);
      if ($$1.isPresent() && bly.d($$0, (bcc)$$1.get())) {
         return $$1;
      } else {
         Optional<? extends bcc> $$2 = a($$0, bku.l);
         return $$2.isPresent() ? $$2 : $$0.dy().c(bku.L);
      }
   }

   private static Optional<? extends bcc> a(bsr $$0, bku<? extends bcc> $$1) {
      return $$0.dy().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(bsv $$0, bcc $$1) {
      if (!($$1 instanceof bsr)) {
         bst.a($$0, $$1);
      }
   }

   protected static void b(bsv $$0, bcc $$1) {
      $$0.dy().b(bku.E);
      $$0.dy().a(bku.Z, $$1.co(), 600L);
   }

   protected static void c(bsv $$0) {
      if ((double)$$0.s.w.i() < 0.0125) {
         d($$0);
      }

   }

   private static void d(bsv $$0) {
      $$0.dy().f().ifPresent($$1 -> {
         if ($$1 == bvn.k) {
            $$0.fQ();
         }

      });
   }
}
