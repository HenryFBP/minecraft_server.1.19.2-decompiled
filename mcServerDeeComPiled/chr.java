import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class chr {
   public static final Codec<chr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajv.a.fieldOf("sound").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("tick_delay").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("block_search_extent").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("offset").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, chr::new)
   );
   public static final chr b = new chr(ajw.h, 6000, 8, 2.0);
   private final ajv c;
   private final int d;
   private final int e;
   private final double f;

   public chr(ajv $$0, int $$1, int $$2, double $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ajv a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }
}
