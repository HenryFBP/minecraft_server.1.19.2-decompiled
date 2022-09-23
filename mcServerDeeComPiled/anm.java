import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class anm extends DataFix {
   public anm(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Schema $$0 = this.getInputSchema();
      return this.fixTypeEverywhereTyped("AbstractArrowPickupFix", $$0.getType(asr.q), this::a);
   }

   private Typed<?> a(Typed<?> $$0) {
      $$0 = this.a($$0, "minecraft:arrow", anm::a);
      $$0 = this.a($$0, "minecraft:spectral_arrow", anm::a);
      return this.a($$0, "minecraft:trident", anm::a);
   }

   private static Dynamic<?> a(Dynamic<?> $$0) {
      if ($$0.get("pickup").result().isPresent()) {
         return $$0;
      } else {
         boolean $$1 = $$0.get("player").asBoolean(true);
         return $$0.set("pickup", $$0.createByte((byte)($$1 ? 1 : 0))).remove("player");
      }
   }

   private Typed<?> a(Typed<?> $$0, String $$1, Function<Dynamic<?>, Dynamic<?>> $$2) {
      Type<?> $$3 = this.getInputSchema().getChoiceType(asr.q, $$1);
      Type<?> $$4 = this.getOutputSchema().getChoiceType(asr.q, $$1);
      return $$0.updateTyped(DSL.namedChoice($$1, $$3), $$4, $$1x -> $$1x.update(DSL.remainderFinder(), $$2));
   }
}
