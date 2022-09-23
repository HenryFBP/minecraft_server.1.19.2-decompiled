import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhl extends dhi {
   public static final Codec<dhl> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(azo.b(0, 24).fieldOf("crown_height").forGetter($$0x -> $$0x.b)).apply($$0, dhl::new)
   );
   private final azo b;

   public dhl(azo $$0, azo $$1, azo $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dhj<?> a() {
      return dhj.h;
   }

   @Override
   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, int $$4, dhi.a $$5, int $$6, int $$7, int $$8) {
      gt $$9 = $$5.a();
      int $$10 = 0;

      for(int $$11 = $$9.v() - $$6 + $$8; $$11 <= $$9.v() + $$8; ++$$11) {
         int $$12 = $$9.v() - $$11;
         int $$13 = $$7 + $$5.b() + ami.d((float)$$12 / (float)$$6 * 3.5F);
         int $$14;
         if ($$12 > 0 && $$13 == $$10 && ($$11 & 1) == 0) {
            $$14 = $$13 + 1;
         } else {
            $$14 = $$13;
         }

         this.a($$0, $$1, $$2, $$3, new gt($$9.u(), $$11, $$9.w()), $$14, 0, $$5.c());
         $$10 = $$13;
      }

   }

   @Override
   public int a(amn $$0, int $$1, dgt $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(amn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if ($$1 + $$3 >= 7) {
         return true;
      } else {
         return $$1 * $$1 + $$3 * $$3 > $$4 * $$4;
      }
   }
}
