import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Function;

public class aso extends DataFix {
   private final String a;
   private final Function<String, String> b;

   public aso(Schema $$0, boolean $$1, String $$2, Function<String, String> $$3) {
      super($$0, $$1);
      this.a = $$2;
      this.b = $$3;
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, String>> $$0 = DSL.named(asr.y.typeName(), aua.a());
      if (!Objects.equals($$0, this.getInputSchema().getType(asr.y))) {
         throw new IllegalStateException("Recipe type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.a, $$0, $$0x -> $$0xx -> $$0xx.mapSecond(this.b));
      }
   }
}
