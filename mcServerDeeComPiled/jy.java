import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class jy implements iz {
   private static final Logger c = LogUtils.getLogger();
   private final iy.a d;
   private final iy.a e;

   public jy(iy $$0) {
      this.d = $$0.a(iy.b.b, "blockstates");
      this.e = $$0.a(iy.b.b, "models");
   }

   @Override
   public void a(ix $$0) {
      Map<cjt, jz> $$1 = Maps.newHashMap();
      Consumer<jz> $$2 = $$1x -> {
         cjt $$2x = $$1x.a();
         jz $$3x = (jz)$$1.put($$2x, $$1x);
         if ($$3x != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$2x);
         }
      };
      Map<abb, Supplier<JsonElement>> $$3 = Maps.newHashMap();
      Set<cat> $$4 = Sets.newHashSet();
      BiConsumer<abb, Supplier<JsonElement>> $$5 = ($$1x, $$2x) -> {
         Supplier<JsonElement> $$3x = (Supplier)$$3.put($$1x, $$2x);
         if ($$3x != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$1x);
         }
      };
      Consumer<cat> $$6 = $$4::add;
      new jw($$2, $$5, $$6).a();
      new jx($$5).a();
      List<cjt> $$7 = hm.V.r().filter($$1x -> !$$1.containsKey($$1x)).toList();
      if (!$$7.isEmpty()) {
         throw new IllegalStateException("Missing blockstate definitions for: " + $$7);
      } else {
         hm.V.forEach($$2x -> {
            cat $$3x = (cat)cat.k.get($$2x);
            if ($$3x != null) {
               if ($$4.contains($$3x)) {
                  return;
               }

               abb $$4x = kk.a($$3x);
               if (!$$3.containsKey($$4x)) {
                  $$3.put($$4x, new kj(kk.a($$2x)));
               }
            }

         });
         this.a($$0, $$1, $$0x -> this.d.a($$0x.p().g().a()));
         this.a($$0, $$3, this.e::a);
      }
   }

   private <T> void a(ix $$0, Map<T, ? extends Supplier<JsonElement>> $$1, Function<T, Path> $$2) {
      $$1.forEach(($$2x, $$3) -> {
         Path $$4 = (Path)$$2.apply($$2x);

         try {
            iz.a($$0, (JsonElement)$$3.get(), $$4);
         } catch (Exception var6) {
            c.error("Couldn't save {}", $$4, var6);
         }

      });
   }

   @Override
   public String a() {
      return "Block State Definitions";
   }
}
