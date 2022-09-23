import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class auh extends Schema {
   public auh(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         asr.b,
         () -> DSL.optionalFields(
               "RootVehicle", DSL.optionalFields("Entity", asr.p.in($$0)), "Inventory", DSL.list(asr.m.in($$0)), "EnderItems", DSL.list(asr.m.in($$0))
            )
      );
      $$0.registerType(true, asr.p, () -> DSL.optionalFields("Passengers", DSL.list(asr.p.in($$0)), asr.q.in($$0)));
   }
}
