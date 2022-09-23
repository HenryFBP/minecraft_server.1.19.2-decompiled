import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dcs<WC extends dcn>(dcu<WC> d, WC e) {
   public static final Codec<dcs<?>> a = hm.aX.p().dispatch($$0 -> $$0.d, dcu::c);
   public static final Codec<hc<dcs<?>>> b = aav.a(hm.aK, a);
   public static final Codec<he<dcs<?>>> c = ho.a(hm.aK, a);

   public boolean a(amn $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dcp $$0, cxj $$1, Function<gt, hc<cht>> $$2, amn $$3, dad $$4, cge $$5, cxi $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dcu<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
