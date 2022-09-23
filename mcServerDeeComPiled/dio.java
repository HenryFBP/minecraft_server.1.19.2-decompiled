import com.mojang.serialization.Codec;

public class dio<P extends din> {
   public static final dio<dip> a = a("trunk_vine", dip.a);
   public static final dio<dim> b = a("leave_vine", dim.a);
   public static final dio<dil> c = a("cocoa", dil.a);
   public static final dio<dik> d = a("beehive", dik.a);
   public static final dio<dii> e = a("alter_ground", dii.a);
   public static final dio<dij> f = a("attached_to_leaves", dij.a);
   private final Codec<P> g;

   private static <P extends din> dio<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.bz, $$0, new dio<>($$1));
   }

   private dio(Codec<P> $$0) {
      this.g = $$0;
   }

   public Codec<P> a() {
      return this.g;
   }
}
