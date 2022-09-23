import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class tk implements tc<tf> {
   private final Object2IntMap<akd<?>> a;

   public tk(Object2IntMap<akd<?>> $$0) {
      this.a = $$0;
   }

   public tk(qx $$0) {
      this.a = $$0.a(Object2IntOpenHashMap::new, $$1 -> {
         akf<?> $$2 = $$1.a(hm.an);
         return a($$0, $$2);
      }, qx::k);
   }

   private static <T> akd<T> a(qx $$0, akf<T> $$1) {
      return $$1.b($$0.a($$1.a()));
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a, tk::a, qx::d);
   }

   private static <T> void a(qx $$0, akd<T> $$1) {
      $$0.a(hm.an, $$1.a());
      $$0.a($$1.a().a(), $$1.b());
   }

   public Map<akd<?>, Integer> b() {
      return this.a;
   }
}
