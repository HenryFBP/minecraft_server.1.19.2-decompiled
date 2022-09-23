import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ddg<FC extends dfx, F extends ddt<FC>>(F d, FC e) {
   public static final Codec<ddg<?, ?>> a = hm.aZ.p().dispatch($$0 -> $$0.d, ddt::a);
   public static final Codec<hc<ddg<?, ?>>> b = aav.a(hm.aL, a);
   public static final Codec<he<ddg<?, ?>>> c = ho.a(hm.aL, a);

   public boolean a(chp $$0, cxk $$1, amn $$2, gt $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ddg<?, ?>> a() {
      return Stream.concat(Stream.of(this), this.e.e());
   }

   public String toString() {
      return "Configured: " + this.d + ": " + this.e;
   }

   public F b() {
      return this.d;
   }

   public FC c() {
      return this.e;
   }
}
