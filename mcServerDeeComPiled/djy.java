import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class djy extends dkj {
   public static final Codec<djy> a = azo.b(0, 256).fieldOf("count").xmap(djy::new, $$0 -> $$0.c).codec();
   private final azo c;

   private djy(azo $$0) {
      this.c = $$0;
   }

   public static djy a(azo $$0) {
      return new djy($$0);
   }

   public static djy a(int $$0) {
      return a(azl.a($$0));
   }

   @Override
   public Stream<gt> a_(dkh $$0, amn $$1, gt $$2) {
      Builder<gt> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for(int $$6 = 0; $$6 < this.c.a($$1); ++$$6) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dar.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new gt($$7, $$10, $$8));
               $$5 = true;
            }
         }

         ++$$4;
      } while($$5);

      return $$3.build();
   }

   @Override
   public dkk<?> b() {
      return dkk.i;
   }

   private static int a(dkh $$0, int $$1, int $$2, int $$3, int $$4) {
      gt.a $$5 = new gt.a($$1, $$2, $$3);
      int $$6 = 0;
      cvo $$7 = $$0.a($$5);

      for(int $$8 = $$2; $$8 >= $$0.c() + 1; --$$8) {
         $$5.q($$8 - 1);
         cvo $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cju.B)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            ++$$6;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(cvo $$0) {
      return $$0.h() || $$0.a(cju.C) || $$0.a(cju.D);
   }
}
