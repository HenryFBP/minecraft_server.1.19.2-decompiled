import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bou {
   private static final float a = 2.0F;
   private static final float b = 0.5F;
   private static final float c = 1.25F;

   protected static bcx<?> a(bcx<bot> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(bvn.a));
      $$0.b(bvn.b);
      $$0.e();
      return $$0;
   }

   private static void b(bcx<bot> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bdj(2.0F), new bev(45, 90), new bez(), new bdt(bku.O)));
   }

   private static void c(bcx<bot> $$0) {
      $$0.a(
         bvn.b,
         ImmutableList.of(
            Pair.of(0, new bfn<>(new bfp(bbr.bn, 6.0F), azu.a(30, 60))),
            Pair.of(1, new beb($$0x -> 1.25F)),
            Pair.of(
               2,
               new bec(
                  ImmutableMap.of(bku.m, bkv.b),
                  ImmutableSet.of(),
                  bec.a.a,
                  bec.b.b,
                  ImmutableList.of(Pair.of(new bfg(0.5F), 2), Pair.of(new bfw(0.5F, 3), 3), Pair.of(new bfl<>(bbn::aU, new bdx(30, 60)), 5))
               )
            )
         )
      );
   }

   public static void a(bot $$0) {
      $$0.dy().a(ImmutableList.of(bvn.b));
   }
}
