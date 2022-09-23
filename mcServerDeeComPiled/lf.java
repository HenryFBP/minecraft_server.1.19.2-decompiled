import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lf implements le.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public pj apply(String $$0, pj $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static pj a(String $$0, pj $$1) {
      return b($$0, a($$1));
   }

   private static pj a(pj $$0) {
      if (!$$0.b("DataVersion", 99)) {
         $$0.a("DataVersion", 500);
      }

      return $$0;
   }

   private static pj b(String $$0, pj $$1) {
      dot $$2 = new dot();
      int $$3 = $$1.h("DataVersion");
      int $$4 = 3075;
      if ($$3 < 3075) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3075, $$0});
      }

      pj $$5 = pv.a(ank.a(), ani.f, $$1, $$3);
      $$2.b($$5);
      return $$2.a(new pj());
   }
}
