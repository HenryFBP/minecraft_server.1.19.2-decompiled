import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bom {
   private static final azu a = azu.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bcx<?> a(bcx<bol> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(bvn.a));
      $$0.b(bvn.b);
      $$0.e();
      return $$0;
   }

   private static void b(bcx<bol> $$0) {
      $$0.a(bvn.p, ImmutableList.of(Pair.of(0, new bon()), Pair.of(1, new bdz(bdp::a, bku.M))), ImmutableSet.of(Pair.of(bku.M, bkv.a)), ImmutableSet.of(bku.M));
   }

   private static void c(bcx<bol> $$0) {
      $$0.a(bvn.k, 0, ImmutableList.of(new bge(bol::a), new bfu(bom::b), new bew(20), new bdz(bdp::a, bku.o)), bku.o);
   }

   private static void d(bcx<bol> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bev(45, 90), new bez(), new boo(), new bdt(bku.O)));
   }

   private static void e(bcx<bol> $$0) {
      $$0.a(
         bvn.b,
         ImmutableList.of(
            Pair.of(0, new bfn<>(new bfp(bbr.bn, 6.0F), azu.a(30, 60))),
            Pair.of(1, new bdi(bbr.f, 0.2F)),
            Pair.of(2, new bfm(ImmutableList.of(Pair.of(new beb(bom::d), 1), Pair.of(new bdl(a, bom::c), 1)))),
            Pair.of(3, new bgb(bom::b)),
            Pair.of(3, new bgn(6, 0.15F)),
            Pair.of(
               4,
               new bec(
                  ImmutableMap.of(bku.m, bkv.b),
                  ImmutableSet.of(),
                  bec.a.a,
                  bec.b.b,
                  ImmutableList.of(
                     Pair.of(new bfg(0.5F), 2),
                     Pair.of(new bff(0.15F, false), 2),
                     Pair.of(new bfw(bom::a, bom::d, 3), 3),
                     Pair.of(new bfl<>(bbn::aU, new bdx(30, 60)), 5),
                     Pair.of(new bfl<>(bbn::aw, new bdx(200, 400)), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bcc $$0) {
      cgx $$1 = $$0.s;
      Optional<bfc> $$2 = $$0.dy().c(bku.n);
      if ($$2.isPresent()) {
         gt $$3 = ((bfc)$$2.get()).b();
         return $$1.C($$3) == $$0.aU();
      } else {
         return false;
      }
   }

   public static void a(bol $$0) {
      bcx<bol> $$1 = $$0.dy();
      bvn $$2 = (bvn)$$1.f().orElse(null);
      if ($$2 != bvn.p) {
         $$1.a(ImmutableList.of(bvn.p, bvn.k, bvn.b));
         if ($$2 == bvn.k && $$1.f().orElse(null) != bvn.k) {
            $$1.a(bku.S, true, 2400L);
         }
      }

   }

   private static float b(bcc $$0) {
      return $$0.aU() ? 0.6F : 0.15F;
   }

   private static float c(bcc $$0) {
      return $$0.aU() ? 0.6F : 0.15F;
   }

   private static float d(bcc $$0) {
      return $$0.aU() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bcc> b(bol $$0) {
      return bdp.a($$0) ? Optional.empty() : $$0.dy().c(bku.B);
   }

   public static cdm a() {
      return cdm.a(aks.av);
   }
}
