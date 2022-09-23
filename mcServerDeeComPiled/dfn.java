import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfn {
   public static final Codec<dfn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkg.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dfn::new)
   );
   public final hc<dkg> b;
   public final float c;

   public dfn(hc<dkg> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(chp $$0, cxk $$1, amn $$2, gt $$3) {
      return ((dkg)this.b.a()).a($$0, $$1, $$2, $$3);
   }
}
