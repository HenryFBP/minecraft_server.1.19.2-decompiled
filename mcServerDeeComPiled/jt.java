import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class jt implements iz {
   private static final Logger c = LogUtils.getLogger();
   private final iy.a d;
   private final List<Pair<Supplier<Consumer<BiConsumer<abb, dsg.a>>>, duj>> e = ImmutableList.of(
      Pair.of(jr::new, duk.e), Pair.of(jp::new, duk.b), Pair.of(jq::new, duk.f), Pair.of(jo::new, duk.l), Pair.of(ju::new, duk.h), Pair.of(js::new, duk.g)
   );

   public jt(iy $$0) {
      this.d = $$0.a(iy.b.a, "loot_tables");
   }

   @Override
   public void a(ix $$0) {
      Map<abb, dsg> $$1 = Maps.newHashMap();
      this.e.forEach($$1x -> ((Consumer)((Supplier)$$1x.getFirst()).get()).accept((BiConsumer)($$2x, $$3) -> {
            if ($$1.put($$2x, $$3.a((duj)$$1x.getSecond()).b()) != null) {
               throw new IllegalStateException("Duplicate loot table " + $$2x);
            }
         }));
      dsl $$2 = new dsl(duk.k, $$0x -> null, $$1::get);

      for(abb $$4 : Sets.difference(dry.a(), $$1.keySet())) {
         $$2.a("Missing built-in table: " + $$4);
      }

      $$1.forEach(($$1x, $$2x) -> dsh.a($$2, $$1x, $$2x));
      Multimap<String, String> $$5 = $$2.a();
      if (!$$5.isEmpty()) {
         $$5.forEach(($$0x, $$1x) -> c.warn("Found validation problem in {}: {}", $$0x, $$1x));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         $$1.forEach(($$1x, $$2x) -> {
            Path $$3 = this.d.a($$1x);

            try {
               iz.a($$0, dsh.a($$2x), $$3);
            } catch (IOException var6x) {
               c.error("Couldn't save loot table {}", $$3, var6x);
            }

         });
      }
   }

   @Override
   public String a() {
      return "LootTables";
   }
}
