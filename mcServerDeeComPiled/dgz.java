import com.mojang.serialization.Codec;

public class dgz<P extends dgy> {
   public static final dgz<dhb> a = a("two_layers_feature_size", dhb.d);
   public static final dgz<dha> b = a("three_layers_feature_size", dha.d);
   private final Codec<P> c;

   private static <P extends dgy> dgz<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.bA, $$0, new dgz<>($$1));
   }

   private dgz(Codec<P> $$0) {
      this.c = $$0;
   }

   public Codec<P> a() {
      return this.c;
   }
}
