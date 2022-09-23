import com.mojang.serialization.Codec;

public class dhj<P extends dhi> {
   public static final dhj<dhe> a = a("blob_foliage_placer", dhe.a);
   public static final dhj<dho> b = a("spruce_foliage_placer", dho.a);
   public static final dhj<dhm> c = a("pine_foliage_placer", dhm.a);
   public static final dhj<dhd> d = a("acacia_foliage_placer", dhd.a);
   public static final dhj<dhf> e = a("bush_foliage_placer", dhf.c);
   public static final dhj<dhh> f = a("fancy_foliage_placer", dhh.c);
   public static final dhj<dhk> g = a("jungle_foliage_placer", dhk.a);
   public static final dhj<dhl> h = a("mega_pine_foliage_placer", dhl.a);
   public static final dhj<dhg> i = a("dark_oak_foliage_placer", dhg.a);
   public static final dhj<dhn> j = a("random_spread_foliage_placer", dhn.a);
   private final Codec<P> k;

   private static <P extends dhi> dhj<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.bw, $$0, new dhj<>($$1));
   }

   private dhj(Codec<P> $$0) {
      this.k = $$0;
   }

   public Codec<P> a() {
      return this.k;
   }
}
