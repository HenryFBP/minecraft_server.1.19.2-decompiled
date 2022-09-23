import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.stream.Collectors;

public class asg extends DataFix {
   public asg(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsKeyTranslationFix",
         this.getInputSchema().getType(asr.e),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> (Dynamic)$$0x.getMapValues().map($$1 -> $$0x.createMap((Map)$$1.entrySet().stream().map($$1x -> {
                     if (((Dynamic)$$1x.getKey()).asString("").startsWith("key_")) {
                        String $$2 = ((Dynamic)$$1x.getValue()).asString("");
                        if (!$$2.startsWith("key.mouse") && !$$2.startsWith("scancode.")) {
                           return Pair.of((Dynamic)$$1x.getKey(), $$0x.createString("key.keyboard." + $$2.substring("key.".length())));
                        }
                     }
   
                     return Pair.of((Dynamic)$$1x.getKey(), (Dynamic)$$1x.getValue());
                  }).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond)))).result().orElse($$0x))
      );
   }
}
