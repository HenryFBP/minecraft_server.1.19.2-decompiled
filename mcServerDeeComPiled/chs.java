import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class chs {
   public static final Codec<chs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(io.aP.fieldOf("options").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.c)).apply($$0, chs::new)
   );
   private final im b;
   private final float c;

   public chs(im $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public im a() {
      return this.b;
   }

   public boolean a(amn $$0) {
      return $$0.i() <= this.c;
   }
}
