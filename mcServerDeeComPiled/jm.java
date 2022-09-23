import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Map.Entry;
import org.slf4j.Logger;

public class jm implements iz {
   private static final Logger c = LogUtils.getLogger();
   private final iy d;

   public jm(iy $$0) {
      this.d = $$0;
   }

   @Override
   public void a(ix $$0) {
      hn $$1 = (hn)hn.d.get();
      DynamicOps<JsonElement> $$2 = aay.a(JsonOps.INSTANCE, $$1);
      hn.a().forEach($$3 -> this.a($$0, $$1, $$2, $$3));
   }

   private <T> void a(ix $$0, hn $$1, DynamicOps<JsonElement> $$2, hn.c<T> $$3) {
      aba<? extends hm<T>> $$4 = $$3.b();
      hm<T> $$5 = $$1.b($$4);
      iy.a $$6 = this.d.a(iy.b.c, $$4.a().a());

      for(Entry<aba<T>, T> $$7 : $$5.f()) {
         a($$6.a(((aba)$$7.getKey()).a()), $$0, $$2, $$3.c(), $$7.getValue());
      }

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

   @Override
   public String a() {
      return "Worldgen";
   }
}
