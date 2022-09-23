import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public class ddh extends ddi {
   public ddh(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   protected boolean a(cgy $$0, amn $$1, gt $$2, cvo $$3) {
      if (!this.b($$0, $$1, $$2, $$3)) {
         return false;
      } else {
         gy $$4 = gy.c.a.a($$1);
         int $$5 = $$1.a(2) + 2;
         List<gy> $$6 = ad.a(Stream.of($$4, $$4.h(), $$4.i()), $$1);

         for(gy $$8 : $$6.subList(0, $$5)) {
            gt.a $$9 = $$2.i();
            int $$10 = $$1.a(2) + 1;
            $$9.c($$8);
            int $$12;
            gy $$11;
            if ($$8 == $$4) {
               $$11 = $$4;
               $$12 = $$1.a(3) + 2;
            } else {
               $$9.c(gy.b);
               gy[] $$13 = new gy[]{$$8, gy.b};
               $$11 = ad.a($$13, $$1);
               $$12 = $$1.a(3) + 3;
            }

            for(int $$16 = 0; $$16 < $$10 && this.b($$0, $$1, $$9, $$3); ++$$16) {
               $$9.c($$11);
            }

            $$9.c($$11.g());
            $$9.c(gy.b);

            for(int $$17 = 0; $$17 < $$12; ++$$17) {
               $$9.c($$4);
               if (!this.b($$0, $$1, $$9, $$3)) {
                  break;
               }

               if ($$1.i() < 0.25F) {
                  $$9.c(gy.b);
               }
            }
         }

         return true;
      }
   }
}
