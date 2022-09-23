import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;

public class boj {
   private static final float a = 1.0F;
   private static final float b = 2.25F;
   private static final float c = 1.75F;
   private static final float d = 2.5F;
   private static final int e = 4;
   private static final int f = 16;
   private static final int g = 6;
   private static final int h = 30;
   private static final int i = 60;
   private static final int j = 600;
   private static final int k = 32;

   protected static bcx<?> a(bcx<boi> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(bvn.a));
      $$0.b(bvn.b);
      $$0.e();
      return $$0;
   }

   private static void b(bcx<boi> $$0) {
      $$0.a(bvn.a, 0, ImmutableList.of(new bgj(0.8F), new bdj(2.5F), new bev(45, 90), new bez(), new bdt(bku.aM), new bdt(bku.aN)));
   }

   private static void c(bcx<boi> $$0) {
      $$0.a(
         bvn.b,
         ImmutableList.of(
            Pair.of(0, new bej($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bee(boj::b, 2.25F)),
            Pair.of(2, new bgd(boj::b, 4, 16, 2.25F)),
            Pair.of(3, new bfn<>(new bfp($$0x -> true, 6.0F), azu.a(30, 60))),
            Pair.of(4, new bfm(ImmutableList.of(Pair.of(new bea(1.0F), 2), Pair.of(new bfw(1.0F, 3), 2), Pair.of(new bdx(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(boi $$0) {
      $$0.dy().a(ImmutableList.of(bvn.b));
   }

   public static void a(bcc $$0, gt $$1) {
      bcx<?> $$2 = $$0.dy();
      hb $$3 = hb.a($$0.W().ab(), $$1);
      Optional<hb> $$4 = $$2.c(bku.aL);
      if ($$4.isEmpty()) {
         $$2.a(bku.aL, $$3);
         $$2.a(bku.aM, 600);
      } else if (((hb)$$4.get()).equals($$3)) {
         $$2.a(bku.aM, 600);
      }

   }

   private static Optional<bfc> b(bcc $$0) {
      bcx<?> $$1 = $$0.dy();
      Optional<hb> $$2 = $$1.c(bku.aL);
      if ($$2.isPresent()) {
         hb $$3 = (hb)$$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bdq($$3.b().b()));
         }

         $$1.b(bku.aL);
      }

      return c($$0);
   }

   private static boolean a(bcc $$0, bcx<?> $$1, hb $$2) {
      Optional<Integer> $$3 = $$1.c(bku.aM);
      cgx $$4 = $$0.W();
      return $$4.ab() == $$2.a() && $$4.a_($$2.b()).a(cju.aL) && $$3.isPresent();
   }

   private static Optional<bfc> c(bcc $$0) {
      return a($$0).map($$0x -> new bdy($$0x, true));
   }

   public static Optional<agh> a(bcc $$0) {
      cgx $$1 = $$0.W();
      if (!$$1.k_() && $$1 instanceof agg $$2) {
         Optional<UUID> $$3 = $$0.dy().c(bku.aK);
         if ($$3.isPresent()) {
            bbn $$4 = $$2.a((UUID)$$3.get());
            if ($$4 instanceof agh $$5 && ($$5.d.d() || $$5.d.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
