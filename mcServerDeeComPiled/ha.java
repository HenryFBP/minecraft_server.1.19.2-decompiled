import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum ha implements amw {
   a("down_east", gy.a, gy.f),
   b("down_north", gy.a, gy.c),
   c("down_south", gy.a, gy.d),
   d("down_west", gy.a, gy.e),
   e("up_east", gy.b, gy.f),
   f("up_north", gy.b, gy.c),
   g("up_south", gy.b, gy.d),
   h("up_west", gy.b, gy.e),
   i("west_up", gy.e, gy.b),
   j("east_up", gy.f, gy.b),
   k("north_up", gy.c, gy.b),
   l("south_up", gy.d, gy.b);

   private static final Int2ObjectMap<ha> m = ad.a(new Int2ObjectOpenHashMap(values().length), $$0 -> {
      for(ha $$1 : values()) {
         $$0.put(b($$1.p, $$1.o), $$1);
      }

   });
   private final String n;
   private final gy o;
   private final gy p;

   private static int b(gy $$0, gy $$1) {
      return $$1.ordinal() << 3 | $$0.ordinal();
   }

   private ha(String $$0, gy $$1, gy $$2) {
      this.n = $$0;
      this.p = $$1;
      this.o = $$2;
   }

   @Override
   public String c() {
      return this.n;
   }

   public static ha a(gy $$0, gy $$1) {
      int $$2 = b($$0, $$1);
      return (ha)m.get($$2);
   }

   public gy a() {
      return this.p;
   }

   public gy b() {
      return this.o;
   }
}
