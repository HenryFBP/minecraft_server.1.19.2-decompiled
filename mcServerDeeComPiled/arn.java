import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class arn extends arx {
   public arn(Schema $$0, boolean $$1) {
      super($$0, $$1, "JigsawPropertiesFix", asr.l, "minecraft:jigsaw");
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      String $$1 = $$0.get("attachement_type").asString("minecraft:empty");
      String $$2 = $$0.get("target_pool").asString("minecraft:empty");
      return $$0.set("name", $$0.createString($$1))
         .set("target", $$0.createString($$1))
         .remove("attachement_type")
         .set("pool", $$0.createString($$2))
         .remove("target_pool");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), arn::a);
   }
}
