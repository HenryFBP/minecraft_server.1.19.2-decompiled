import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhk extends dhi {
   public static final Codec<dhk> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, dhk::new)
   );
   protected final int b;

   public dhk(azo $$0, azo $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dhj<?> a() {
      return dhj.g;
   }

   @Override
   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, int $$4, dhi.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$5.c() ? $$6 : 1 + $$2.a(2);

      for(int $$10 = $$8; $$10 >= $$8 - $$9; --$$10) {
         int $$11 = $$7 + $$5.b() + 1 - $$10;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$11, $$10, $$5.c());
      }

   }

   @Override
   public int a(amn $$0, int $$1, dgt $$2) {
      return this.b;
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
