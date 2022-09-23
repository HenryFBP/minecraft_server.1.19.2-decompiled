import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dir extends diy {
   public static final Codec<dir> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  alq.c.optionalFieldOf("min_height_for_leaves", 1).forGetter($$0x -> $$0x.b), azo.b(1, 64).fieldOf("bend_length").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, dir::new)
   );
   private final int b;
   private final azo h;

   public dir(int $$0, int $$1, int $$2, int $$3, azo $$4) {
      super($$0, $$1, $$2);
      this.b = $$3;
      this.h = $$4;
   }

   @Override
   protected diz<?> a() {
      return diz.g;
   }

   @Override
   public List<dhi.a> a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, int $$3, gt $$4, dgt $$5) {
      gy $$6 = gy.c.a.a($$2);
      int $$7 = $$3 - 1;
      gt.a $$8 = $$4.i();
      gt $$9 = $$8.c();
      a($$0, $$1, $$2, $$9, $$5);
      List<dhi.a> $$10 = Lists.newArrayList();

      for(int $$11 = 0; $$11 <= $$7; ++$$11) {
         if ($$11 + 1 >= $$7 + $$2.a(2)) {
            $$8.c($$6);
         }

         if (dff.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         if ($$11 >= this.b) {
            $$10.add(new dhi.a($$8.h(), 0, false));
         }

         $$8.c(gy.b);
      }

      int $$12 = this.h.a($$2);

      for(int $$13 = 0; $$13 <= $$12; ++$$13) {
         if (dff.d($$0, $$8)) {
            this.b($$0, $$1, $$2, $$8, $$5);
         }

         $$10.add(new dhi.a($$8.h(), 0, false));
         $$8.c($$6);
      }

      return $$10;
   }
}
