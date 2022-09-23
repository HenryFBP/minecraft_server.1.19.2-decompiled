import com.mojang.serialization.Codec;

public class dhv<P extends dhu> {
   public static final dhv<dht> a = a("mangrove_root_placer", dht.c);
   private final Codec<P> b;

   private static <P extends dhu> dhv<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.by, $$0, new dhv<>($$1));
   }

   private dhv(Codec<P> $$0) {
      this.b = $$0;
   }

   public Codec<P> a() {
      return this.b;
   }
}
