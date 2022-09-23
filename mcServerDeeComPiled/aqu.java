import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class aqu extends DataFix {
   public aqu(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.c);
      OpticFinder<?> $$1 = $$0.findField("Level");
      return this.fixTypeEverywhereTyped("HeightmapRenamingFix", $$0, $$1x -> $$1x.updateTyped($$1, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::a)));
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      Optional<? extends Dynamic<?>> $$1 = $$0.get("Heightmaps").result();
      if (!$$1.isPresent()) {
         return $$0;
      } else {
         Dynamic<?> $$2 = (Dynamic)$$1.get();
         Optional<? extends Dynamic<?>> $$3 = $$2.get("LIQUID").result();
         if ($$3.isPresent()) {
            $$2 = $$2.remove("LIQUID");
            $$2 = $$2.set("WORLD_SURFACE_WG", (Dynamic)$$3.get());
         }

         Optional<? extends Dynamic<?>> $$4 = $$2.get("SOLID").result();
         if ($$4.isPresent()) {
            $$2 = $$2.remove("SOLID");
            $$2 = $$2.set("OCEAN_FLOOR_WG", (Dynamic)$$4.get());
            $$2 = $$2.set("OCEAN_FLOOR", (Dynamic)$$4.get());
         }

         Optional<? extends Dynamic<?>> $$5 = $$2.get("LIGHT").result();
         if ($$5.isPresent()) {
            $$2 = $$2.remove("LIGHT");
            $$2 = $$2.set("LIGHT_BLOCKING", (Dynamic)$$5.get());
         }

         Optional<? extends Dynamic<?>> $$6 = $$2.get("RAIN").result();
         if ($$6.isPresent()) {
            $$2 = $$2.remove("RAIN");
            $$2 = $$2.set("MOTION_BLOCKING", (Dynamic)$$6.get());
            $$2 = $$2.set("MOTION_BLOCKING_NO_LEAVES", (Dynamic)$$6.get());
         }

         return $$0.set("Heightmaps", $$2);
      }
   }
}
