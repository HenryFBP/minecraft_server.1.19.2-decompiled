import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhd extends dhi {
   public static final Codec<dhd> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dhd::new));

   public dhd(azo $$0, azo $$1) {
      super($$0, $$1);
   }

   @Override
   protected dhj<?> a() {
      return dhj.d;
   }

   @Override
   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, int $$4, dhi.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      gt $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(amn $$0, int $$1, dgt $$2) {
      return 0;
   }

   @Override
   protected boolean a(amn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if ($$2 == 0) {
         return ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0;
      } else {
         return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
      }
   }
}
