import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Locale;
import java.util.Optional;

public class ash extends DataFix {
   public ash(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsLowerCaseLanguageFix", this.getInputSchema().getType(asr.e), $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> {
               Optional<String> $$1 = $$0x.get("lang").asString().result();
               return $$1.isPresent() ? $$0x.set("lang", $$0x.createString(((String)$$1.get()).toLowerCase(Locale.ROOT))) : $$0x;
            })
      );
   }
}
