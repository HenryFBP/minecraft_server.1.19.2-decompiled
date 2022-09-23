import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class auq extends aua {
   public auq(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         asr.v,
         () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", asr.n.in($$0), "CB", asr.n.in($$0), "CC", asr.n.in($$0), "CD", asr.n.in($$0))))
      );
   }
}
