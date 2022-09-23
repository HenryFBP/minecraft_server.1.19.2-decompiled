import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class gs {
   private static final Logger c = LogUtils.getLogger();
   public static final Map<gy, i> a = ad.a(Maps.newEnumMap(gy.class), $$0 -> {
      $$0.put(gy.d, i.a());
      $$0.put(gy.f, new i(null, k.e.c(90.0F), null, null));
      $$0.put(gy.e, new i(null, k.e.c(-90.0F), null, null));
      $$0.put(gy.c, new i(null, k.e.c(180.0F), null, null));
      $$0.put(gy.b, new i(null, k.c.c(-90.0F), null, null));
      $$0.put(gy.a, new i(null, k.c.c(90.0F), null, null));
   });
   public static final Map<gy, i> b = ad.a(Maps.newEnumMap(gy.class), $$0 -> {
      for(gy $$1 : gy.values()) {
         $$0.put($$1, ((i)a.get($$1)).b());
      }

   });

   public static i a(i $$0) {
      d $$1 = d.c(0.5F, 0.5F, 0.5F);
      $$1.b($$0.c());
      $$1.b(d.c(-0.5F, -0.5F, -0.5F));
      return new i($$1);
   }

   public static i b(i $$0) {
      d $$1 = d.c(-0.5F, -0.5F, -0.5F);
      $$1.b($$0.c());
      $$1.b(d.c(0.5F, 0.5F, 0.5F));
      return new i($$1);
   }

   public static i a(i $$0, gy $$1, Supplier<String> $$2) {
      gy $$3 = gy.a($$0.c(), $$1);
      i $$4 = $$0.b();
      if ($$4 == null) {
         c.warn((String)$$2.get());
         return new i(null, null, new k(0.0F, 0.0F, 0.0F), null);
      } else {
         i $$5 = ((i)b.get($$1)).a($$4).a((i)a.get($$3));
         return a($$5);
      }
   }
}
