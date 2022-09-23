import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class avg extends aua {
   public avg(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerEntities($$0);
      $$0.register(
         $$1,
         "minecraft:wandering_trader",
         $$1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(asr.m.in($$0)),
               "Offers",
               DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", asr.m.in($$0), "buyB", asr.m.in($$0), "sell", asr.m.in($$0)))),
               aub.a($$0)
            )
      );
      $$0.register(
         $$1,
         "minecraft:trader_llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(asr.m.in($$0)), "SaddleItem", asr.m.in($$0), "DecorItem", asr.m.in($$0), aub.a($$0))
      );
      return $$1;
   }
}
