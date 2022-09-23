import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ala<T> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ".json";
   private static final int c = ".json".length();
   final Function<abb, Optional<T>> d;
   private final String e;

   public ala(Function<abb, Optional<T>> $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public Map<abb, List<ala.a>> a(aim $$0) {
      Map<abb, List<ala.a>> $$1 = Maps.newHashMap();

      for(Entry<abb, List<aik>> $$2 : $$0.c(this.e, $$0x -> $$0x.a().endsWith(".json")).entrySet()) {
         abb $$3 = (abb)$$2.getKey();
         String $$4 = $$3.a();
         abb $$5 = new abb($$3.b(), $$4.substring(this.e.length() + 1, $$4.length() - c));

         for(aik $$6 : (List)$$2.getValue()) {
            try {
               Reader $$7 = $$6.c();

               try {
                  JsonElement $$8 = JsonParser.parseReader($$7);
                  List<ala.a> $$9 = (List)$$1.computeIfAbsent($$5, $$0x -> new ArrayList());
                  aky $$10 = (aky)aky.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow(false, a::error);
                  if ($$10.b()) {
                     $$9.clear();
                  }

                  String $$11 = $$6.a();
                  $$10.a().forEach($$2x -> $$9.add(new ala.a($$2x, $$11)));
               } catch (Throwable var16) {
                  if ($$7 != null) {
                     try {
                        $$7.close();
                     } catch (Throwable var15) {
                        var16.addSuppressed(var15);
                     }
                  }

                  throw var16;
               }

               if ($$7 != null) {
                  $$7.close();
               }
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$3, $$6.a(), var17});
            }
         }
      }

      return $$1;
   }

   private static void a(Map<abb, List<ala.a>> $$0, Multimap<abb, abb> $$1, Set<abb> $$2, abb $$3, BiConsumer<abb, List<ala.a>> $$4) {
      if ($$2.add($$3)) {
         $$1.get($$3).forEach($$4x -> a($$0, $$1, $$2, $$4x, $$4));
         List<ala.a> $$5 = (List)$$0.get($$3);
         if ($$5 != null) {
            $$4.accept($$3, $$5);
         }

      }
   }

   private static boolean a(Multimap<abb, abb> $$0, abb $$1, abb $$2) {
      Collection<abb> $$3 = $$0.get($$2);
      return $$3.contains($$1) ? true : $$3.stream().anyMatch($$2x -> a($$0, $$1, $$2x));
   }

   private static void b(Multimap<abb, abb> $$0, abb $$1, abb $$2) {
      if (!a($$0, $$1, $$2)) {
         $$0.put($$1, $$2);
      }

   }

   private Either<Collection<ala.a>, Collection<T>> a(akx.a<T> $$0, List<ala.a> $$1) {
      Builder<T> $$2 = ImmutableSet.builder();
      List<ala.a> $$3 = new ArrayList();

      for(ala.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right($$2.build()) : Either.left($$3);
   }

   public Map<abb, Collection<T>> a(Map<abb, List<ala.a>> $$0) {
      final Map<abb, Collection<T>> $$1 = Maps.newHashMap();
      akx.a<T> $$2 = new akx.a<T>() {
         @Nullable
         @Override
         public T a(abb $$0) {
            return (T)((Optional)ala.this.d.apply($$0)).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(abb $$0) {
            return (Collection<T>)$$1.get($$0);
         }
      };
      Multimap<abb, abb> $$3 = HashMultimap.create();
      $$0.forEach(($$1x, $$2x) -> $$2x.forEach($$2xx -> $$2xx.a.a($$2xxx -> b($$3, $$1x, $$2xxx))));
      $$0.forEach(($$1x, $$2x) -> $$2x.forEach($$2xx -> $$2xx.a.b($$2xxx -> b($$3, $$1x, $$2xxx))));
      Set<abb> $$4 = Sets.newHashSet();
      $$0.keySet()
         .forEach(
            $$5 -> a(
                  $$0,
                  $$3,
                  $$4,
                  $$5,
                  ($$2xx, $$3xx) -> this.a($$2, $$3xx)
                        .ifLeft(
                           $$1xxx -> a.error(
                                 "Couldn't load tag {} as it is missing following references: {}",
                                 $$2xx,
                                 $$1xxx.stream().map(Objects::toString).collect(Collectors.joining(", "))
                              )
                        )
                        .ifRight($$2xxx -> $$1.put($$2xx, $$2xxx))
               )
         );
      return $$1;
   }

   public Map<abb, Collection<T>> b(aim $$0) {
      return this.a(this.a($$0));
   }

   public static record a(akx a, String b) {
      final akx a;

      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }
}
