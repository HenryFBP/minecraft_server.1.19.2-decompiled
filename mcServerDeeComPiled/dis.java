import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dis extends diy {
   public static final Codec<dis> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dis::new));

   public dis(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected diz<?> a() {
      return diz.e;
   }

   @Override
   public List<dhi.a> a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, int $$3, gt $$4, dgt $$5) {
      List<dhi.a> $$6 = Lists.newArrayList();
      gt $$7 = $$4.c();
      a($$0, $$1, $$2, $$7, $$5);
      a($$0, $$1, $$2, $$7.g(), $$5);
      a($$0, $$1, $$2, $$7.e(), $$5);
      a($$0, $$1, $$2, $$7.e().g(), $$5);
      gy $$8 = gy.c.a.a($$2);
      int $$9 = $$3 - $$2.a(4);
      int $$10 = 2 - $$2.a(3);
      int $$11 = $$4.u();
      int $$12 = $$4.v();
      int $$13 = $$4.w();
      int $$14 = $$11;
      int $$15 = $$13;
      int $$16 = $$12 + $$3 - 1;

      for(int $$17 = 0; $$17 < $$3; ++$$17) {
         if ($$17 >= $$9 && $$10 > 0) {
            $$14 += $$8.j();
            $$15 += $$8.l();
            --$$10;
         }

         int $$18 = $$12 + $$17;
         gt $$19 = new gt($$14, $$18, $$15);
         if (dff.c($$0, $$19)) {
            this.b($$0, $$1, $$2, $$19, $$5);
            this.b($$0, $$1, $$2, $$19.g(), $$5);
            this.b($$0, $$1, $$2, $$19.e(), $$5);
            this.b($$0, $$1, $$2, $$19.g().e(), $$5);
         }
      }

      $$6.add(new dhi.a(new gt($$14, $$16, $$15), 0, true));

      for(int $$20 = -1; $$20 <= 2; ++$$20) {
         for(int $$21 = -1; $$21 <= 2; ++$$21) {
            if (($$20 < 0 || $$20 > 1 || $$21 < 0 || $$21 > 1) && $$2.a(3) <= 0) {
               int $$22 = $$2.a(3) + 2;

               for(int $$23 = 0; $$23 < $$22; ++$$23) {
                  this.b($$0, $$1, $$2, new gt($$11 + $$20, $$16 - $$23 - 1, $$13 + $$21), $$5);
               }

               $$6.add(new dhi.a(new gt($$14 + $$20, $$16, $$15 + $$21), 0, false));
            }
         }
      }

      return $$6;
   }
}
