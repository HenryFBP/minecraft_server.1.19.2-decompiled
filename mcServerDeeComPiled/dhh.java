import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhh extends dhe {
   public static final Codec<dhh> c = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dhh::new));

   public dhh(azo $$0, azo $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dhj<?> a() {
      return dhj.f;
   }

   @Override
   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, int $$4, dhi.a $$5, int $$6, int $$7, int $$8) {
      for(int $$9 = $$8; $$9 >= $$8 - $$6; --$$9) {
         int $$10 = $$7 + ($$9 != $$8 && $$9 != $$8 - $$6 ? 1 : 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }

   }

   @Override
   protected boolean a(amn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return ami.k((float)$$1 + 0.5F) + ami.k((float)$$3 + 0.5F) > (float)($$4 * $$4);
   }
}
