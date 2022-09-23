import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkp extends dki {
   public static final Codec<dkp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dkp::new)
   );
   private final int c;

   private dkp(int $$0) {
      this.c = $$0;
   }

   public static dkp a(int $$0) {
      return new dkp($$0);
   }

   @Override
   protected boolean a(dkh $$0, amn $$1, gt $$2) {
      int $$3 = $$0.a(dar.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dar.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dkk<?> b() {
      return dkk.d;
   }
}
