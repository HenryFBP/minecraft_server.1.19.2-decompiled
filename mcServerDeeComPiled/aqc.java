import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class aqc extends arx {
   public aqc(Schema $$0, boolean $$1) {
      super($$0, $$1, "EntityShulkerColorFix", asr.q, "minecraft:shulker");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return !$$0.get("Color").map(Dynamic::asNumber).result().isPresent() ? $$0.set("Color", $$0.createByte((byte)10)) : $$0;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
