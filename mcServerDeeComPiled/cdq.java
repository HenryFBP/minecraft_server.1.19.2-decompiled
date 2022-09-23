import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cdq extends aiq {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cds<?>, Map<abb, cdp<?>>> c = ImmutableMap.of();
   private Map<abb, cdp<?>> d = ImmutableMap.of();
   private boolean e;

   public cdq() {
      super(a, "recipes");
   }

   protected void a(Map<abb, JsonElement> $$0, aim $$1, awz $$2) {
      this.e = false;
      Map<cds<?>, Builder<abb, cdp<?>>> $$3 = Maps.newHashMap();
      Builder<abb, cdp<?>> $$4 = ImmutableMap.builder();

      for(Entry<abb, JsonElement> $$5 : $$0.entrySet()) {
         abb $$6 = (abb)$$5.getKey();

         try {
            cdp<?> $$7 = a($$6, alz.m((JsonElement)$$5.getValue(), "top element"));
            ((Builder)$$3.computeIfAbsent($$7.g(), $$0x -> ImmutableMap.builder())).put($$6, $$7);
            $$4.put($$6, $$7);
         } catch (IllegalArgumentException | JsonParseException var10) {
            b.error("Parsing error loading recipe {}", $$6, var10);
         }
      }

      this.c = (Map)$$3.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((Builder)$$0x.getValue()).build()));
      this.d = $$4.build();
      b.info("Loaded {} recipes", $$3.size());
   }

   public boolean a() {
      return this.e;
   }

   public <C extends bac, T extends cdp<C>> Optional<T> a(cds<T> $$0, C $$1, cgx $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.a($$1, $$2)).findFirst();
   }

   public <C extends bac, T extends cdp<C>> Optional<Pair<abb, T>> a(cds<T> $$0, C $$1, cgx $$2, @Nullable abb $$3) {
      Map<abb, T> $$4 = this.c($$0);
      if ($$3 != null) {
         T $$5 = (T)$$4.get($$3);
         if ($$5 != null && $$5.a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cdp)$$2x.getValue()).a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((abb)$$0x.getKey(), (cdp)$$0x.getValue()));
   }

   public <C extends bac, T extends cdp<C>> List<T> a(cds<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bac, T extends cdp<C>> List<T> b(cds<T> $$0, C $$1, cgx $$2) {
      return (List<T>)this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.a($$1, $$2))
         .sorted(Comparator.comparing($$0x -> $$0x.c().p()))
         .collect(Collectors.toList());
   }

   private <C extends bac, T extends cdp<C>> Map<abb, T> c(cds<T> $$0) {
      return (Map<abb, T>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bac, T extends cdp<C>> hi<cax> c(cds<T> $$0, C $$1, cgx $$2) {
      Optional<T> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return ((cdp)$$3.get()).b($$1);
      } else {
         hi<cax> $$4 = hi.a($$1.b(), cax.b);

         for(int $$5 = 0; $$5 < $$4.size(); ++$$5) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<? extends cdp<?>> a(abb $$0) {
      return Optional.ofNullable((cdp)this.d.get($$0));
   }

   public Collection<cdp<?>> b() {
      return (Collection<cdp<?>>)this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<abb> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   public static cdp<?> a(abb $$0, JsonObject $$1) {
      String $$2 = alz.h($$1, "type");
      return ((cdr)hm.aj.b(new abb($$2)).orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))).a($$0, $$1);
   }

   public void a(Iterable<cdp<?>> $$0) {
      this.e = false;
      Map<cds<?>, Map<abb, cdp<?>>> $$1 = Maps.newHashMap();
      Builder<abb, cdp<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<abb, cdp<?>> $$3 = (Map)$$1.computeIfAbsent($$2x.g(), $$0xx -> Maps.newHashMap());
         abb $$4 = $$2x.f();
         cdp<?> $$5 = (cdp)$$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bac, T extends cdp<C>> cdq.a<C, T> b(final cds<T> $$0) {
      return new cdq.a<C, T>() {
         @Nullable
         private abb b;

         @Override
         public Optional<T> a(C $$0x, cgx $$1) {
            cdq $$2 = $$1.q();
            Optional<Pair<abb, T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<abb, T> $$4 = (Pair)$$3.get();
               this.b = (abb)$$4.getFirst();
               return Optional.of((cdp)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bac, T extends cdp<C>> {
      Optional<T> a(C var1, cgx var2);
   }
}
