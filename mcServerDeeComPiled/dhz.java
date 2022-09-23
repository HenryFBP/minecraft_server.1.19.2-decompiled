import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dhz extends dhw {
   protected final long c;
   protected final dpa.a d;
   protected final float e;
   protected final dpa f;

   protected static <P extends dhz> P3<Mu<P>, Long, dpa.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         dpa.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         alq.d.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dhz(long $$0, dpa.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = dpa.b(new dbo(new das($$0)), $$1);
   }

   protected double a(gt $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
