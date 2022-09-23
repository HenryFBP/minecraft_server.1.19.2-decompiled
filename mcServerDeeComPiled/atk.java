import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class atk extends DataFix {
   public atk(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> $$0 = DSL.named(asr.x.typeName(), DSL.remainderType());
      if (!Objects.equals($$0, this.getInputSchema().getType(asr.x))) {
         throw new IllegalStateException("Team type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(
            "TeamDisplayNameFix",
            $$0,
            $$0x -> $$0xx -> $$0xx.mapSecond(
                     $$0xxx -> $$0xxx.update(
                           "DisplayName",
                           $$1 -> (Dynamic)DataFixUtils.orElse($$1.asString().map($$0xxxxx -> rq.a.a(rq.b($$0xxxxx))).map($$0xxx::createString).result(), $$1)
                        )
                  )
         );
      }
   }
}
