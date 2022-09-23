import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class djm extends djj {
   public static final Codec<djm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dbl.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), dbl.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e))
            .apply($$0, djm::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final dbl d;
   private final dbl e;
   private final LongSet f = new LongOpenHashSet();

   private djm(dbl $$0, dbl $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static djm a(dbl $$0, dbl $$1) {
      return new djm($$0, $$1);
   }

   @Override
   public int a(amn $$0, dbn $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | (long)$$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return ami.b($$0, $$2, $$3);
      }
   }

   @Override
   public djk<?> a() {
      return djk.b;
   }

   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
