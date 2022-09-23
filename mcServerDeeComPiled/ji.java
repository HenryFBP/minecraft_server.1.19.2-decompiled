import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import org.slf4j.Logger;

public class ji implements iz {
   private static final Logger c = LogUtils.getLogger();
   private final Path d;

   public ji(iy $$0) {
      this.d = $$0.a(iy.b.c).resolve("biome_parameters");
   }

   @Override
   public void a(ix $$0) {
      hn.a $$1 = (hn.a)hn.d.get();
      DynamicOps<JsonElement> $$2 = aay.a(JsonOps.INSTANCE, $$1);
      hm<cht> $$3 = $$1.d(hm.aR);
      cig.a.a().forEach($$3x -> {
         cig $$4 = ((cig.a)$$3x.getSecond()).a($$3, false);
         a(this.a((abb)$$3x.getFirst()), $$0, $$2, cig.c, $$4);
      });
   }

   private static <E> void a(Path $$0, ix $$1, DynamicOps<JsonElement> $$2, Encoder<E> $$3, E $$4) {
      try {
         Optional<JsonElement> $$5 = $$3.encodeStart($$2, $$4).resultOrPartial($$1x -> c.error("Couldn't serialize element {}: {}", $$0, $$1x));
         if ($$5.isPresent()) {
            iz.a($$1, (JsonElement)$$5.get(), $$0);
         }
      } catch (IOException var6) {
         c.error("Couldn't save element {}", $$0, var6);
      }

   }

   private Path a(abb $$0) {
      return this.d.resolve($$0.b()).resolve($$0.a() + ".json");
   }

   @Override
   public String a() {
      return "Biome Parameters";
   }
}
