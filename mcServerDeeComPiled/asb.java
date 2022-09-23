import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class asb extends arx {
   public asb(Schema $$0, boolean $$1) {
      super($$0, $$1, "OminousBannerBlockEntityRenameFix", asr.l, "minecraft:banner");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      Optional<String> $$1 = $$0.get("CustomName").asString().result();
      if ($$1.isPresent()) {
         String $$2 = (String)$$1.get();
         $$2 = $$2.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
         return $$0.set("CustomName", $$0.createString($$2));
      } else {
         return $$0;
      }
   }
}
