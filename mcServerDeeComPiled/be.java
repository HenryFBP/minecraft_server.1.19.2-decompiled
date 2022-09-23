import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class be {
   private static final Logger a = LogUtils.getLogger();
   private final abb b;
   private final dsi c;
   private final Gson d = drz.a().create();

   public be(abb $$0, dsi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public final dux[] a(JsonArray $$0, String $$1, duj $$2) {
      dux[] $$3 = (dux[])this.d.fromJson($$0, dux[].class);
      dsl $$4 = new dsl($$2, this.c::a, $$0x -> null);

      for(dux $$5 : $$3) {
         $$5.a($$4);
         $$4.a().forEach(($$1x, $$2x) -> a.warn("Found validation problem in advancement trigger {}/{}: {}", new Object[]{$$1, $$1x, $$2x}));
      }

      return $$3;
   }

   public abb a() {
      return this.b;
   }
}
