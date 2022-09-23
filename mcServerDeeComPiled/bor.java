import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bor {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final azu f = azu.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(boq $$0, amn $$1) {
      $$0.dy().a(bku.Q, f.a($$1));
   }

   protected static bcx<?> a(bcx<boq> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(bvn.a));
      $$0.b(bvn.b);
      $$0.e();
      return $$0;
   }

   private static void b(bcx<boq> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bdj(2.0F), new bev(45, 90), new bez(), new bdt(bku.O), new bdt(bku.Q)));
   }

   private static void c(bcx<boq> $$0) {
      $$0.a(
         bvn.b,
         ImmutableList.of(
            Pair.of(0, new bfn<>(new bfp(bbr.bn, 6.0F), azu.a(30, 60))),
            Pair.of(0, new bdi(bbr.H, 1.0F)),
            Pair.of(1, new beb($$0x -> 1.25F)),
            Pair.of(2, new bgb(bor::b, $$0x -> $$0x.dy().c(bku.B))),
            Pair.of(3, new bgl(6, 1.0F)),
            Pair.of(
               4,
               new bfm(
                  ImmutableMap.of(bku.m, bkv.b),
                  ImmutableList.of(
                     Pair.of(new bff(1.0F), 1), Pair.of(new bfw(1.0F, 3), 1), Pair.of(new bdu(), 3), Pair.of(new bfl<>(bbn::aw, new bdx(5, 20)), 2)
                  )
               )
            )
         ),
         ImmutableSet.of(Pair.of(bku.R, bkv.b), Pair.of(bku.V, bkv.b))
      );
   }

   private static void d(bcx<boq> $$0) {
      $$0.a(
         bvn.t,
         ImmutableList.of(
            Pair.of(0, new bfn<>(new bfp(bbr.bn, 6.0F), azu.a(30, 60))),
            Pair.of(1, new beb($$0x -> 1.25F)),
            Pair.of(2, new bgb(bor::b, $$0x -> $$0x.dy().c(bku.B))),
            Pair.of(3, new bgl(8, 1.5F)),
            Pair.of(
               5,
               new bec(
                  ImmutableMap.of(bku.m, bkv.b),
                  ImmutableSet.of(),
                  bec.a.a,
                  bec.b.b,
                  ImmutableList.of(
                     Pair.of(new bfg(0.75F), 1),
                     Pair.of(new bff(1.0F, true), 1),
                     Pair.of(new bfw(1.0F, 3), 1),
                     Pair.of(new bfl<>(bbn::aU, new bdx(30, 60)), 5)
                  )
               )
            )
         ),
         ImmutableSet.of(Pair.of(bku.R, bkv.b), Pair.of(bku.V, bkv.a))
      );
   }

   private static void e(bcx<boq> $$0) {
      $$0.a(
         bvn.u,
         ImmutableList.of(
            Pair.of(0, new bfn<>(new bfp(bbr.bn, 6.0F), azu.a(30, 60))),
            Pair.of(1, new bgb(bor::b, $$0x -> $$0x.dy().c(bku.B))),
            Pair.of(2, new bgm(8, 1.0F)),
            Pair.of(3, new bgo(cju.qV, bku.W)),
            Pair.of(
               4,
               new bfm(
                  ImmutableList.of(
                     Pair.of(new bff(1.0F), 2), Pair.of(new bfw(1.0F, 3), 1), Pair.of(new bdu(), 2), Pair.of(new bfl<>(bbn::aw, new bdx(5, 20)), 1)
                  )
               )
            )
         ),
         ImmutableSet.of(Pair.of(bku.R, bkv.b), Pair.of(bku.W, bkv.a))
      );
   }

   private static void f(bcx<boq> $$0) {
      $$0.a(
         bvn.q,
         ImmutableList.of(Pair.of(0, new ber(f, ajw.hb)), Pair.of(1, new bes(f, 2, 4, 1.5F, $$0x -> ajw.ha, akl.bz, 0.5F, $$0x -> $$0x.a(cju.et)))),
         ImmutableSet.of(Pair.of(bku.N, bkv.b), Pair.of(bku.r, bkv.b), Pair.of(bku.Q, bkv.b), Pair.of(bku.V, bkv.b))
      );
   }

   private static void g(bcx<boq> $$0) {
      $$0.a(bvn.s, 0, ImmutableList.of(new bge(), new bos(ajw.hc, ajw.gX)), bku.o);
   }

   private static boolean b(boq $$0) {
      return !bdp.a($$0);
   }

   public static void a(boq $$0) {
      $$0.dy().a(ImmutableList.of(bvn.s, bvn.u, bvn.q, bvn.t, bvn.b));
   }

   public static cdm a() {
      return boq.bX;
   }
}
