import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.DataResult.PartialResult;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public interface aaz {
   <E> Map<aba<E>, aaz.a<E>> a(aba<? extends hm<E>> var1);

   <E> Optional<aaz.a<E>> b(aba<E> var1);

   static aaz a(final aim $$0) {
      return new aaz() {
         private static final String b = ".json";

         @Override
         public <E> Map<aba<E>, aaz.a<E>> a(aba<? extends hm<E>> $$0x) {
            String $$1 = a($$0.a());
            Map<aba<E>, aaz.a<E>> $$2 = Maps.newHashMap();
            $$0.b($$1, $$0xx -> $$0xx.a().endsWith(".json")).forEach(($$3, $$4) -> {
               String $$5 = $$3.a();
               String $$6 = $$5.substring($$1.length() + 1, $$5.length() - ".json".length());
               aba<E> $$7 = aba.a($$0, new abb($$3.b(), $$6));
               $$2.put($$7, (aaz.a<>)($$2xx, $$3x) -> {
                  try {
                     Reader $$5x = $$4.c();

                     DataResult var6x;
                     try {
                        var6x = this.a($$2xx, $$3x, $$5x);
                     } catch (Throwable var9) {
                        if ($$5x != null) {
                           try {
                              $$5x.close();
                           } catch (Throwable var8x) {
                              var9.addSuppressed(var8x);
                           }
                        }

                        throw var9;
                     }

                     if ($$5x != null) {
                        $$5x.close();
                     }

                     return var6x;
                  } catch (JsonIOException | JsonSyntaxException | IOException var10) {
                     return DataResult.error("Failed to parse " + $$3 + " file: " + var10.getMessage());
                  }
               });
            });
            return $$2;
         }

         @Override
         public <E> Optional<aaz.a<E>> b(aba<E> $$0x) {
            abb $$1 = c($$0);
            return $$0.getResource($$1).map($$1x -> ($$2, $$3) -> {
                  try {
                     Reader $$4 = $$1x.c();

                     DataResult var6;
                     try {
                        var6 = this.a($$2, $$3, $$4);
                     } catch (Throwable var9) {
                        if ($$4 != null) {
                           try {
                              $$4.close();
                           } catch (Throwable var8) {
                              var9.addSuppressed(var8);
                           }
                        }

                        throw var9;
                     }

                     if ($$4 != null) {
                        $$4.close();
                     }

                     return var6;
                  } catch (JsonIOException | JsonSyntaxException | IOException var10) {
                     return DataResult.error("Failed to parse " + $$1 + " file: " + var10.getMessage());
                  }
               });
         }

         private <E> DataResult<aaz.c<E>> a(DynamicOps<JsonElement> $$0x, Decoder<E> $$1, Reader $$2) throws IOException {
            JsonElement $$3 = JsonParser.parseReader($$2);
            return $$1.parse($$0, $$3).map(aaz.c::a);
         }

         private static String a(abb $$0x) {
            return $$0.a();
         }

         private static <E> abb c(aba<E> $$0x) {
            return new abb($$0.a().b(), a($$0.b()) + "/" + $$0.a().a() + ".json");
         }

         public String toString() {
            return "ResourceAccess[" + $$0 + "]";
         }
      };
   }

   @FunctionalInterface
   public interface a<E> {
      DataResult<aaz.c<E>> parseElement(DynamicOps<JsonElement> var1, Decoder<E> var2);
   }

   public static final class b implements aaz {
      private static final Logger a = LogUtils.getLogger();
      private final Map<aba<?>, aaz.b.a> b = Maps.newIdentityHashMap();

      public <E> void a(hn $$0, aba<E> $$1, Encoder<E> $$2, int $$3, E $$4, Lifecycle $$5) {
         DataResult<JsonElement> $$6 = $$2.encodeStart(aay.a(JsonOps.INSTANCE, $$0), $$4);
         Optional<PartialResult<JsonElement>> $$7 = $$6.error();
         if ($$7.isPresent()) {
            a.error("Error adding element: {}", ((PartialResult)$$7.get()).message());
         } else {
            this.b.put($$1, new aaz.b.a((JsonElement)$$6.result().get(), $$3, $$5));
         }

      }

      @Override
      public <E> Map<aba<E>, aaz.a<E>> a(aba<? extends hm<E>> $$0) {
         return (Map<aba<E>, aaz.a<E>>)this.b
            .entrySet()
            .stream()
            .filter($$1 -> ((aba)$$1.getKey()).b($$0))
            .collect(Collectors.toMap($$0x -> (aba)$$0x.getKey(), $$0x -> ((aaz.b.a)$$0x.getValue())::a));
      }

      @Override
      public <E> Optional<aaz.a<E>> b(aba<E> $$0) {
         aaz.b.a $$1 = (aaz.b.a)this.b.get($$0);
         if ($$1 == null) {
            DataResult<aaz.c<E>> $$2 = DataResult.error("Unknown element: " + $$0);
            return Optional.of((aaz.a<>)($$1x, $$2x) -> $$2);
         } else {
            return Optional.of($$1::a);
         }
      }

      static record a(JsonElement a, int b, Lifecycle c) {
         public <E> DataResult<aaz.c<E>> a(DynamicOps<JsonElement> $$0, Decoder<E> $$1) {
            return $$1.parse($$0, this.a).setLifecycle(this.c).map($$0x -> aaz.c.a((int)$$0x, this.b));
         }
      }
   }

   public static record c<E>(E a, OptionalInt b) {
      public static <E> aaz.c<E> a(E $$0) {
         return new aaz.c<>($$0, OptionalInt.empty());
      }

      public static <E> aaz.c<E> a(E $$0, int $$1) {
         return new aaz.c<>($$0, OptionalInt.of($$1));
      }
   }
}
