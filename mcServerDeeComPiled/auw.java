import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class auw extends aua {
   public auw(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$1.put("minecraft:cod", (Supplier)$$1.remove("minecraft:cod_mob"));
      $$1.put("minecraft:salmon", (Supplier)$$1.remove("minecraft:salmon_mob"));
      return $$1;
   }
}
