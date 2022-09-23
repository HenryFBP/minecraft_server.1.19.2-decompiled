import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class aou extends DataFix {
   public aou(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.c);
      Type<?> $$1 = $$0.findFieldType("Level");
      OpticFinder<?> $$2 = DSL.fieldFinder("Level", $$1);
      return this.fixTypeEverywhereTyped(
         "ChunkLightRemoveFix",
         $$0,
         this.getOutputSchema().getType(asr.c),
         $$1x -> $$1x.updateTyped($$2, $$0xx -> $$0xx.update(DSL.remainderFinder(), $$0xxx -> $$0xxx.remove("isLightOn")))
      );
   }
}
