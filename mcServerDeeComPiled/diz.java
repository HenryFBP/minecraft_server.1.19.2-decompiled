import com.mojang.serialization.Codec;

public class diz<P extends diy> {
   public static final diz<dix> a = a("straight_trunk_placer", dix.a);
   public static final diz<diu> b = a("forking_trunk_placer", diu.a);
   public static final diz<div> c = a("giant_trunk_placer", div.a);
   public static final diz<diw> d = a("mega_jungle_trunk_placer", diw.b);
   public static final diz<dis> e = a("dark_oak_trunk_placer", dis.a);
   public static final diz<dit> f = a("fancy_trunk_placer", dit.a);
   public static final diz<dir> g = a("bending_trunk_placer", dir.a);
   public static final diz<dja> h = a("upwards_branching_trunk_placer", dja.a);
   private final Codec<P> i;

   private static <P extends diy> diz<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.bx, $$0, new diz<>($$1));
   }

   private diz(Codec<P> $$0) {
      this.i = $$0;
   }

   public Codec<P> a() {
      return this.i;
   }
}
