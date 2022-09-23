import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class aud extends Schema {
   public aud(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(false, asr.y, () -> DSL.constType(aua.a()));
      $$0.registerType(
         false,
         asr.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", asr.p.in($$0)),
               "Inventory",
               DSL.list(asr.m.in($$0)),
               "EnderItems",
               DSL.list(asr.m.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  asr.p.in($$0),
                  "ShoulderEntityRight",
                  asr.p.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(asr.y.in($$0)), "toBeDisplayed", DSL.list(asr.y.in($$0)))
               )
            )
      );
      $$0.registerType(false, asr.d, () -> DSL.compoundList(DSL.list(asr.m.in($$0))));
   }
}
