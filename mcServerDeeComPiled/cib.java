import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cib extends chx {
   public static final Codec<cib> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cht.d.fieldOf("biomes").forGetter($$0x -> $$0x.c), Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter($$0x -> $$0x.e))
            .apply($$0, cib::new)
   );
   private final he<cht> c;
   private final int d;
   private final int e;

   public cib(he<cht> $$0, int $$1) {
      super($$0.a());
      this.c = $$0;
      this.d = $$1 + 2;
      this.e = $$1;
   }

   @Override
   protected Codec<? extends chx> a() {
      return b;
   }

   @Override
   public hc<cht> getNoiseBiome(int $$0, int $$1, int $$2, cic.f $$3) {
      return this.c.a(Math.floorMod(($$0 >> this.d) + ($$2 >> this.d), this.c.b()));
   }
}
