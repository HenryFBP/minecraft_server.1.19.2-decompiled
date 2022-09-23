import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dch implements dbw {
   protected final hs f;

   protected static <P extends dch> P1<Mu<P>, hs> a(Instance<P> $$0) {
      return $$0.group(hs.v(16).optionalFieldOf("offset", hs.g).forGetter($$0x -> $$0x.f));
   }

   protected dch(hs $$0) {
      this.f = $$0;
   }

   public final boolean a(chp $$0, gt $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(cvo var1);
}
