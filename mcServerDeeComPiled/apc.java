import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class apc extends arx {
   public apc(Schema $$0, boolean $$1) {
      super($$0, $$1, "Colorless shulker entity fix", asr.q, "minecraft:shulker");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.get("Color").asInt(0) == 10 ? $$0x.set("Color", $$0x.createByte((byte)16)) : $$0x);
   }
}
