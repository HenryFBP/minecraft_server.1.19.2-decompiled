import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dia extends dhz {
   public static final Codec<dia> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dia::new));
   protected final List<cvo> h;

   protected static <P extends dia> P4<Mu<P>, Long, dpa.a, Float, List<cvo>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(cvo.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dia(long $$0, dpa.a $$1, float $$2, List<cvo> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dhx<?> a() {
      return dhx.d;
   }

   @Override
   public cvo a(amn $$0, gt $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected cvo a(List<cvo> $$0, gt $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected cvo a(List<cvo> $$0, double $$1) {
      double $$2 = ami.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return (cvo)$$0.get((int)($$2 * (double)$$0.size()));
   }
}
