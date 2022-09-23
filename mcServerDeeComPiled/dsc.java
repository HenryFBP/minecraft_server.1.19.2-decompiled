import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsc extends aiq {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = drz.b().create();
   private final dsi c;
   private final dsh d;
   private Map<abb, dto> e = ImmutableMap.of();

   public dsc(dsi $$0, dsh $$1) {
      super(b, "item_modifiers");
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   public dto a(abb $$0) {
      return (dto)this.e.get($$0);
   }

   public dto a(abb $$0, dto $$1) {
      return (dto)this.e.getOrDefault($$0, $$1);
   }

   protected void a(Map<abb, JsonElement> $$0, aim $$1, awz $$2) {
      Builder<abb, dto> $$3 = ImmutableMap.builder();
      $$0.forEach(($$1x, $$2x) -> {
         try {
            if ($$2x.isJsonArray()) {
               dto[] $$5x = (dto[])b.fromJson($$2x, dto[].class);
               $$3.put($$1x, new dsc.a($$5x));
            } else {
               dto var5x = (dto)b.fromJson($$2x, dto.class);
               $$3.put($$1x, var5x);
            }
         } catch (Exception var4x) {
            a.error("Couldn't parse item modifier {}", $$1x, var4x);
         }

      });
      Map<abb, dto> $$4 = $$3.build();
      dsl $$5 = new dsl(duk.k, this.c::a, this.d::a);
      $$4.forEach(($$1x, $$2x) -> $$2x.a($$5));
      $$5.a().forEach(($$0x, $$1x) -> a.warn("Found item modifier validation problem in {}: {}", $$0x, $$1x));
      this.e = $$4;
   }

   public Set<abb> a() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   static class a implements dto {
      protected final dto[] a;
      private final BiFunction<cax, dsd, cax> b;

      public a(dto[] $$0) {
         this.a = $$0;
         this.b = dtq.a($$0);
      }

      public cax a(cax $$0, dsd $$1) {
         return (cax)this.b.apply($$0, $$1);
      }

      @Override
      public dtp a() {
         throw new UnsupportedOperationException();
      }
   }
}
