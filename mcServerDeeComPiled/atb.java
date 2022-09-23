import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Objects;

public class atb extends DataFix {
   private final String a;
   private final Map<String, String> b;
   private final TypeReference c;

   public atb(Schema $$0, TypeReference $$1, Map<String, String> $$2) {
      this($$0, $$1, $$1.typeName() + "-renames at version: " + $$0.getVersionKey(), $$2);
   }

   public atb(Schema $$0, TypeReference $$1, String $$2, Map<String, String> $$3) {
      super($$0, false);
      this.b = $$3;
      this.a = $$2;
      this.c = $$1;
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, String>> $$0 = DSL.named(this.c.typeName(), aua.a());
      if (!Objects.equals($$0, this.getInputSchema().getType(this.c))) {
         throw new IllegalStateException("\"" + this.c.typeName() + "\" type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.a, $$0, $$0x -> $$0xx -> $$0xx.mapSecond($$0xxx -> (String)this.b.getOrDefault($$0xxx, $$0xxx)));
      }
   }
}
