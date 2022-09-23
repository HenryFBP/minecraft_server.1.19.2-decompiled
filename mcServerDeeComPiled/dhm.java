import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhm extends dhi {
   public static final Codec<dhm> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(azo.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, dhm::new)
   );
   private final azo b;

   public dhm(azo $$0, azo $$1, azo $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dhj<?> a() {
      return dhj.c;
   }

   @Override
   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, int $$4, dhi.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = 0;

      for(int $$10 = $$8; $$10 >= $$8 - $$6; --$$10) {
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$9, $$10, $$5.c());
         if ($$9 >= 1 && $$10 == $$8 - $$6 + 1) {
            --$$9;
         } else if ($$9 < $$7 + $$5.b()) {
            ++$$9;
         }
      }

   }

   @Override
   public int a(amn $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(amn $$0, int $$1, dgt $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(amn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
