import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class asd extends DataFix {
   public asd(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsAddTextBackgroundFix",
         this.getInputSchema().getType(asr.e),
         $$0 -> $$0.update(
               DSL.remainderFinder(),
               $$0x -> (Dynamic)DataFixUtils.orElse(
                     $$0x.get("chatOpacity").asString().map($$1 -> $$0x.set("textBackgroundOpacity", $$0x.createDouble(this.a($$1)))).result(), $$0x
                  )
            )
      );
   }

   private double a(String $$0) {
      try {
         double $$1 = 0.9 * Double.parseDouble($$0) + 0.1;
         return $$1 / 2.0;
      } catch (NumberFormatException var4) {
         return 0.5;
      }
   }
}
