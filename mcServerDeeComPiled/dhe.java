import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.function.BiConsumer;

public class dhe extends dhi {
   public static final Codec<dhe> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dhe::new));
   protected final int b;

   protected static <P extends dhe> P3<Mu<P>, azo, azo, Integer> a(Instance<P> $$0) {
      return b($$0).and(Codec.intRange(0, 16).fieldOf("height").forGetter($$0x -> $$0x.b));
   }

   public dhe(azo $$0, azo $$1, int $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected dhj<?> a() {
      return dhj.a;
   }

   @Override
   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, int $$4, dhi.a $$5, int $$6, int $$7, int $$8) {
      for(int $$9 = $$8; $$9 >= $$8 - $$6; --$$9) {
         int $$10 = Math.max($$7 + $$5.b() - 1 - $$9 / 2, 0);
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }

   }

   @Override
   public int a(amn $$0, int $$1, dgt $$2) {
      return this.b;
   }

   @Override
   protected boolean a(amn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && ($$0.a(2) == 0 || $$2 == 0);
   }
}
