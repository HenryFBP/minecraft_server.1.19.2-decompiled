import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class kl {
   private final Optional<abb> a;
   private final Set<ko> b;
   private final Optional<String> c;

   public kl(Optional<abb> $$0, Optional<String> $$1, ko... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public abb a(cjt $$0, kn $$1, BiConsumer<abb, Supplier<JsonElement>> $$2) {
      return this.a(kk.a($$0, (String)this.c.orElse("")), $$1, $$2);
   }

   public abb a(cjt $$0, String $$1, kn $$2, BiConsumer<abb, Supplier<JsonElement>> $$3) {
      return this.a(kk.a($$0, $$1 + (String)this.c.orElse("")), $$2, $$3);
   }

   public abb b(cjt $$0, String $$1, kn $$2, BiConsumer<abb, Supplier<JsonElement>> $$3) {
      return this.a(kk.a($$0, $$1), $$2, $$3);
   }

   public abb a(abb $$0, kn $$1, BiConsumer<abb, Supplier<JsonElement>> $$2) {
      Map<ko, abb> $$3 = this.a($$1);
      $$2.accept($$0, (Supplier)() -> {
         JsonObject $$1x = new JsonObject();
         this.a.ifPresent($$1xx -> $$1x.addProperty("parent", $$1xx.toString()));
         if (!$$3.isEmpty()) {
            JsonObject $$2x = new JsonObject();
            $$3.forEach(($$1xx, $$2xx) -> $$2x.addProperty($$1xx.a(), $$2xx.toString()));
            $$1x.add("textures", $$2x);
         }

         return $$1x;
      });
      return $$0;
   }

   private Map<ko, abb> a(kn $$0) {
      return (Map<ko, abb>)Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
