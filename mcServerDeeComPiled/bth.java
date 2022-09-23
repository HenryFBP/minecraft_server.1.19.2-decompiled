import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;

public class bth {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ami.f(100.0F);
   public static final int a = ami.f(133.59999F);
   public static final int b = ami.f(84.0F);
   private static final int i = ami.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<blz<? extends bly<? super btg>>> k = List.of(blz.d, blz.u);
   private static final List<bku<?>> l = List.of(
      new bku[]{
         bku.g,
         bku.h,
         bku.k,
         bku.l,
         bku.L,
         bku.n,
         bku.m,
         bku.E,
         bku.t,
         bku.o,
         bku.p,
         bku.B,
         bku.aw,
         bku.ax,
         bku.ay,
         bku.az,
         bku.aA,
         bku.aB,
         bku.aC,
         bku.aD,
         bku.aE,
         bku.aF,
         bku.aG,
         bku.aH,
         bku.aI,
         bku.aJ
      }
   );
   private static final bdo<btg> m = new bdo<btg>(ImmutableMap.of(bku.aC, bkv.c)) {
      protected void a(agg $$0, btg $$1, long $$2) {
         bth.a((bcc)$$1);
      }
   };

   public static void a(btg $$0) {
      $$0.dy().a(ImmutableList.of(bvn.y, bvn.z, bvn.x, bvn.k, bvn.w, bvn.v, bvn.b));
   }

   protected static bcx<?> a(btg $$0, Dynamic<?> $$1) {
      bcx.b<btg> $$2 = bcx.a(l, k);
      bcx<btg> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(bvn.a));
      $$3.b(bvn.b);
      $$3.e();
      return $$3;
   }

   private static void a(bcx<btg> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bgj(0.8F), new bhi(), new bev(45, 90), new bez()));
   }

   private static void b(bcx<btg> $$0) {
      $$0.a(bvn.y, 5, ImmutableList.of(new bhe(a)), bku.aA);
   }

   private static void c(bcx<btg> $$0) {
      $$0.a(bvn.z, ImmutableList.of(Pair.of(0, new bhf()), Pair.of(1, new bhd(h))), ImmutableSet.of(Pair.of(bku.aw, bkv.b), Pair.of(bku.aC, bkv.b)));
   }

   private static void d(bcx<btg> $$0) {
      $$0.a(
         bvn.b,
         10,
         ImmutableList.of(
            new bhh(btg::fK), new bhl(), new bfm(ImmutableMap.of(bku.az, bkv.b), ImmutableList.of(Pair.of(new bff(0.5F), 2), Pair.of(new bdx(30, 60), 1)))
         )
      );
   }

   private static void e(bcx<btg> $$0) {
      $$0.a(bvn.w, 5, ImmutableList.of(new bhh(btg::fK), new bei(bku.ax, 2, 0.7F)), bku.ax);
   }

   private static void f(bcx<btg> $$0) {
      $$0.a(bvn.v, 5, ImmutableList.of(new bhh(btg::fK), new bhj(i)), bku.az);
   }

   private static void g(bcx<btg> $$0) {
      $$0.a(bvn.x, 10, ImmutableList.of(new bhg()), bku.aw);
   }

   private static void a(btg $$0, bcx<btg> $$1) {
      $$1.a(
         bvn.k,
         10,
         ImmutableList.of(
            m,
            new bge($$1x -> !$$0.fJ().d() || !$$0.a($$1x), bth::b, false),
            new bfp($$1x -> a($$0, $$1x), (float)$$0.b(bdd.b)),
            new bfu(1.2F),
            new bhk(),
            new bew(18)
         ),
         bku.o
      );
   }

   private static boolean a(btg $$0, bcc $$1) {
      return $$0.dy().c(bku.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(btg $$0, bcc $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bcc)$$0);
   }

   public static void a(bcc $$0) {
      if ($$0.dy().a(bku.aC)) {
         $$0.dy().a(bku.aC, anf.a, 1200L);
      }

   }

   public static void a(btg $$0, gt $$1) {
      if ($$0.s.p_().a($$1) && !$$0.fK().isPresent() && !$$0.dy().c(bku.o).isPresent()) {
         a((bcc)$$0);
         $$0.dy().a(bku.aE, anf.a, 100L);
         $$0.dy().a(bku.n, new bdq($$1), 100L);
         $$0.dy().a(bku.ax, $$1, 100L);
         $$0.dy().b(bku.m);
      }
   }
}
