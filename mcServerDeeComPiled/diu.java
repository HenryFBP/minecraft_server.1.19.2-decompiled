import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class diu extends diy {
   public static final Codec<diu> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, diu::new));

   public diu(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected diz<?> a() {
      return diz.b;
   }

   @Override
   public List<dhi.a> a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, int $$3, gt $$4, dgt $$5) {
      a($$0, $$1, $$2, $$4.c(), $$5);
      List<dhi.a> $$6 = Lists.newArrayList();
      gy $$7 = gy.c.a.a($$2);
      int $$8 = $$3 - $$2.a(4) - 1;
      int $$9 = 3 - $$2.a(3);
      gt.a $$10 = new gt.a();
      int $$11 = $$4.u();
      int $$12 = $$4.w();
      OptionalInt $$13 = OptionalInt.empty();

      for(int $$14 = 0; $$14 < $$3; ++$$14) {
         int $$15 = $$4.v() + $$14;
         if ($$14 >= $$8 && $$9 > 0) {
            $$11 += $$7.j();
            $$12 += $$7.l();
            --$$9;
         }

         if (this.b($$0, $$1, $$2, $$10.d($$11, $$15, $$12), $$5)) {
            $$13 = OptionalInt.of($$15 + 1);
         }
      }

      if ($$13.isPresent()) {
         $$6.add(new dhi.a(new gt($$11, $$13.getAsInt(), $$12), 1, false));
      }

      $$11 = $$4.u();
      $$12 = $$4.w();
      gy $$16 = gy.c.a.a($$2);
      if ($$16 != $$7) {
         int $$17 = $$8 - $$2.a(2) - 1;
         int $$18 = 1 + $$2.a(3);
         $$13 = OptionalInt.empty();

         for(int $$19 = $$17; $$19 < $$3 && $$18 > 0; --$$18) {
            if ($$19 >= 1) {
               int $$20 = $$4.v() + $$19;
               $$11 += $$16.j();
               $$12 += $$16.l();
               if (this.b($$0, $$1, $$2, $$10.d($$11, $$20, $$12), $$5)) {
                  $$13 = OptionalInt.of($$20 + 1);
               }
            }

            ++$$19;
         }

         if ($$13.isPresent()) {
            $$6.add(new dhi.a(new gt($$11, $$13.getAsInt(), $$12), 0, false));
         }
      }

      return $$6;
   }
}
