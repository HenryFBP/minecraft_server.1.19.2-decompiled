import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dkg(hc<ddg<?, ?>> e, List<dkj> f) {
   public static final Codec<dkg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddg.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dkj.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dkg::new)
   );
   public static final Codec<hc<dkg>> b = aav.a(hm.aM, a);
   public static final Codec<he<dkg>> c = ho.a(hm.aM, a);
   public static final Codec<List<he<dkg>>> d = ho.a(hm.aM, a, true).listOf();

   public boolean a(chp $$0, cxk $$1, amn $$2, gt $$3) {
      return this.a(new dkh($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(chp $$0, cxk $$1, amn $$2, gt $$3) {
      return this.a(new dkh($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dkh $$0, amn $$1, gt $$2) {
      Stream<gt> $$3 = Stream.of($$2);

      for(dkj $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ddg<?, ?> $$5 = (ddg)this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }

      });
      return $$6.isTrue();
   }

   public Stream<ddg<?, ?>> a() {
      return ((ddg)this.e.a()).a();
   }

   public String toString() {
      return "Placed " + this.e;
   }

   public hc<ddg<?, ?>> b() {
      return this.e;
   }

   public List<dkj> c() {
      return this.f;
   }

   static record a(int a) {
   }
}
