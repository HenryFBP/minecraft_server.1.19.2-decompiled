import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class ask extends ano {
   public ask(Schema $$0) {
      super($$0, asr.b);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerUUIDFix",
         this.getInputSchema().getType(this.a),
         $$0 -> {
            OpticFinder<?> $$1 = $$0.getType().findField("RootVehicle");
            return $$0.updateTyped($$1, $$1.type(), $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> (Dynamic)c($$0xx, "Attach", "Attach").orElse($$0xx)))
               .update(DSL.remainderFinder(), $$0x -> aqi.c(aqi.b($$0x)));
         }
      );
   }
}
