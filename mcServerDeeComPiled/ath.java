import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class ath extends DataFix {
   public ath(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.v);
      return this.fixTypeEverywhereTyped("Structure Reference Fix", $$0, $$0x -> $$0x.update(DSL.remainderFinder(), ath::a));
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.update("references", $$0x -> $$0x.createInt($$0x.asNumber().map(Number::intValue).result().filter($$0xx -> $$0xx > 0).orElse(1)));
   }
}
