import com.google.common.collect.Maps;
import java.util.Map;

public final class btu {
   public static final btu a = a("desert");
   public static final btu b = a("jungle");
   public static final btu c = a("plains");
   public static final btu d = a("savanna");
   public static final btu e = a("snow");
   public static final btu f = a("swamp");
   public static final btu g = a("taiga");
   private final String h;
   private static final Map<aba<cht>, btu> i = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cia.A, a);
      $$0.put(cia.f, a);
      $$0.put(cia.B, a);
      $$0.put(cia.C, a);
      $$0.put(cia.z, b);
      $$0.put(cia.x, b);
      $$0.put(cia.y, b);
      $$0.put(cia.s, d);
      $$0.put(cia.r, d);
      $$0.put(cia.w, d);
      $$0.put(cia.W, e);
      $$0.put(cia.V, e);
      $$0.put(cia.K, e);
      $$0.put(cia.e, e);
      $$0.put(cia.M, e);
      $$0.put(cia.q, e);
      $$0.put(cia.d, e);
      $$0.put(cia.E, e);
      $$0.put(cia.F, e);
      $$0.put(cia.G, e);
      $$0.put(cia.H, e);
      $$0.put(cia.g, f);
      $$0.put(cia.h, f);
      $$0.put(cia.o, g);
      $$0.put(cia.n, g);
      $$0.put(cia.u, g);
      $$0.put(cia.t, g);
      $$0.put(cia.p, g);
      $$0.put(cia.v, g);
   });

   private btu(String $$0) {
      this.h = $$0;
   }

   public String toString() {
      return this.h;
   }

   private static btu a(String $$0) {
      return hm.a(hm.ao, new abb($$0), new btu($$0));
   }

   public static btu a(hc<cht> $$0) {
      return (btu)$$0.e().map(i::get).orElse(c);
   }
}
