import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class box {
   public static final int a = 20;
   public static final int b = 7;
   private static final azu i = azu.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final azu p = azu.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final azu q = azu.a(600, 6000);
   private static final azu r = azu.a(100, 300);
   private static final bmf s = bmf.a().a($$0 -> !$$0.ad().equals(bbr.M) && $$0.s.p_().a($$0.cy()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bow $$0, amn $$1) {
      $$0.dy().a(bku.Q, p.a($$1));
      $$0.dy().a(bku.T, q.a($$1));
   }

   protected static bcx<?> a(bcx<bow> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(bvn.a));
      $$0.b(bvn.b);
      $$0.e();
      return $$0;
   }

   private static void b(bcx<bow> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bgj(0.8F), new bdj(2.0F), new bev(45, 90), new bez(), new bdt(bku.O), new bdt(bku.Q), new bdt(bku.T)));
   }

   private static void c(bcx<bow> $$0) {
      $$0.a(
         bvn.b,
         ImmutableList.of(
            Pair.of(0, new bfn<>(new bfp(bbr.bn, 6.0F), azu.a(30, 60))),
            Pair.of(0, new bdi(bbr.M, 1.0F)),
            Pair.of(1, new beb($$0x -> 1.25F)),
            Pair.of(2, new bdl(i, 1.25F)),
            Pair.of(3, new bfm(ImmutableList.of(Pair.of(new bff(1.0F), 2), Pair.of(new bfw(1.0F, 3), 2), Pair.of(new bdx(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bku.U, bkv.b), Pair.of(bku.R, bkv.b))
      );
   }

   private static void d(bcx<bow> $$0) {
      $$0.a(
         bvn.q,
         ImmutableList.of(Pair.of(0, new ber(p, ajw.in)), Pair.of(1, new bet(p, 5, 5, 1.5F, $$0x -> $$0x.fU() ? ajw.ii : ajw.hY))),
         ImmutableSet.of(Pair.of(bku.N, bkv.b), Pair.of(bku.r, bkv.b), Pair.of(bku.m, bkv.b), Pair.of(bku.Q, bkv.b))
      );
   }

   private static void e(bcx<bow> $$0) {
      $$0.a(
         bvn.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bfe(
                  $$0x -> $$0x.fU() ? r : q, s, 3.0F, $$0x -> $$0x.y_() ? 1.0 : 2.5, $$0x -> $$0x.fU() ? ajw.il : ajw.ib, $$0x -> $$0x.fU() ? ajw.im : ajw.ic
               )
            ),
            Pair.of(1, new bfd($$0x -> $$0x.fU() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.fU() ? ajw.ik : ajw.ia))
         ),
         ImmutableSet.of(Pair.of(bku.N, bkv.b), Pair.of(bku.r, bkv.b), Pair.of(bku.T, bkv.b))
      );
   }

   public static void a(bow $$0) {
      $$0.dy().a(ImmutableList.of(bvn.r, bvn.q, bvn.b));
   }

   public static cdm a() {
      return cdm.a(caz.nS);
   }
}
