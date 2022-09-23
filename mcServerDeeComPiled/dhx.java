import com.mojang.serialization.Codec;

public class dhx<P extends dhw> {
   public static final dhx<dif> a = a("simple_state_provider", dif.b);
   public static final dhx<dig> b = a("weighted_state_provider", dig.b);
   public static final dhx<dib> c = a("noise_threshold_provider", dib.b);
   public static final dhx<dia> d = a("noise_provider", dia.g);
   public static final dhx<dhy> e = a("dual_noise_provider", dhy.b);
   public static final dhx<did> f = a("rotated_block_provider", did.b);
   public static final dhx<dic> g = a("randomized_int_state_provider", dic.b);
   private final Codec<P> h;

   private static <P extends dhw> dhx<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.bv, $$0, new dhx<>($$1));
   }

   private dhx(Codec<P> $$0) {
      this.h = $$0;
   }

   public Codec<P> a() {
      return this.h;
   }
}
