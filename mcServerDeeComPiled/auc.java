import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class auc extends Schema {
   public auc(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         asr.m,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  asr.s.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     asr.p.in($$0),
                     "BlockEntityTag",
                     asr.l.in($$0),
                     "CanDestroy",
                     DSL.list(asr.r.in($$0)),
                     "CanPlaceOn",
                     DSL.list(asr.r.in($$0)),
                     "Items",
                     DSL.list(asr.m.in($$0))
                  )
               ),
               awn.a,
               HookFunction.IDENTITY
            )
      );
   }
}
