import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;

public class dsh extends aiq {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = drz.c().create();
   private Map<abb, dsg> c = ImmutableMap.of();
   private final dsi d;

   public dsh(dsi $$0) {
      super(b, "loot_tables");
      this.d = $$0;
   }

   public dsg a(abb $$0) {
      return (dsg)this.c.getOrDefault($$0, dsg.a);
   }

   protected void a(Map<abb, JsonElement> $$0, aim $$1, awz $$2) {
      Builder<abb, dsg> $$3 = ImmutableMap.builder();
      JsonElement $$4 = (JsonElement)$$0.remove(dry.a);
      if ($$4 != null) {
         a.warn("Datapack tried to redefine {} loot table, ignoring", dry.a);
      }

      $$0.forEach(($$1x, $$2x) -> {
         try {
            dsg $$4x = (dsg)b.fromJson($$2x, dsg.class);
            $$3.put($$1x, $$4x);
         } catch (Exception var4x) {
            a.error("Couldn't parse loot table {}", $$1x, var4x);
         }

      });
      $$3.put(dry.a, dsg.a);
      ImmutableMap<abb, dsg> $$5 = $$3.build();
      dsl $$6 = new dsl(duk.k, this.d::a, $$5::get);
      $$5.forEach(($$1x, $$2x) -> a($$6, $$1x, $$2x));
      $$6.a().forEach(($$0x, $$1x) -> a.warn("Found validation problem in {}: {}", $$0x, $$1x));
      this.c = $$5;
   }

   public static void a(dsl $$0, abb $$1, dsg $$2) {
      $$2.a($$0.a($$2.a()).a("{" + $$1 + "}", $$1));
   }

   public static JsonElement a(dsg $$0) {
      return b.toJsonTree($$0);
   }

   public Set<abb> a() {
      return this.c.keySet();
   }
}
