import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Objects;

public class ast extends DataFix {
   private final String a;
   private final Map<String, String> b;

   public ast(Schema $$0, boolean $$1, String $$2, Map<String, String> $$3) {
      super($$0, $$1);
      this.b = $$3;
      this.a = $$2;
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, String>> $$0 = DSL.named(asr.z.typeName(), aua.a());
      if (!Objects.equals($$0, this.getInputSchema().getType(asr.z))) {
         throw new IllegalStateException("Biome type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.a, $$0, $$0x -> $$0xx -> $$0xx.mapSecond($$0xxx -> (String)this.b.getOrDefault($$0xxx, $$0xxx)));
      }
   }
}
