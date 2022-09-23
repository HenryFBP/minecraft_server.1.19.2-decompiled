import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsi extends aiq {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = drz.a().create();
   private Map<abb, dux> c = ImmutableMap.of();

   public dsi() {
      super(b, "predicates");
   }

   @Nullable
   public dux a(abb $$0) {
      return (dux)this.c.get($$0);
   }

   protected void a(Map<abb, JsonElement> $$0, aim $$1, awz $$2) {
      Builder<abb, dux> $$3 = ImmutableMap.builder();
      $$0.forEach(($$1x, $$2x) -> {
         try {
            if ($$2x.isJsonArray()) {
               dux[] $$5x = (dux[])b.fromJson($$2x, dux[].class);
               $$3.put($$1x, new dsi.a($$5x));
            } else {
               dux var5x = (dux)b.fromJson($$2x, dux.class);
               $$3.put($$1x, var5x);
            }
         } catch (Exception var4x) {
            a.error("Couldn't parse loot table {}", $$1x, var4x);
         }

      });
      Map<abb, dux> $$4 = $$3.build();
      dsl $$5 = new dsl(duk.k, $$4::get, $$0x -> null);
      $$4.forEach(($$1x, $$2x) -> $$2x.a($$5.b("{" + $$1x + "}", $$1x)));
      $$5.a().forEach(($$0x, $$1x) -> a.warn("Found validation problem in {}: {}", $$0x, $$1x));
      this.c = $$4;
   }

   public Set<abb> a() {
      return Collections.unmodifiableSet(this.c.keySet());
   }

   static class a implements dux {
      private final dux[] a;
      private final Predicate<dsd> b;

      a(dux[] $$0) {
         this.a = $$0;
         this.b = duz.a($$0);
      }

      public final boolean a(dsd $$0) {
         return this.b.test($$0);
      }

      @Override
      public void a(dsl $$0) {
         dux.super.a($$0);

         for(int $$1 = 0; $$1 < this.a.length; ++$$1) {
            this.a[$$1].a($$0.b(".term[" + $$1 + "]"));
         }

      }

      @Override
      public duy a() {
         throw new UnsupportedOperationException();
      }
   }
}
