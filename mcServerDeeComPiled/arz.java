import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class arz extends DataFix {
   public arz(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.w);
      return this.fixTypeEverywhereTyped(
         "ObjectiveDisplayNameFix",
         $$0,
         $$0x -> $$0x.update(
               DSL.remainderFinder(),
               $$0xx -> $$0xx.update(
                     "DisplayName",
                     $$1 -> (Dynamic)DataFixUtils.orElse($$1.asString().map($$0xxxx -> rq.a.a(rq.b($$0xxxx))).map($$0xx::createString).result(), $$1)
                  )
            )
      );
   }
}
