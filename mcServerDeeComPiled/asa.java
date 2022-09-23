import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Optional;

public class asa extends DataFix {
   public asa(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   private static dxr.a a(String $$0) {
      return $$0.equals("health") ? dxr.a.b : dxr.a.a;
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.w);
      return this.fixTypeEverywhereTyped("ObjectiveRenderTypeFix", $$0, $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> {
            Optional<String> $$1 = $$0xx.get("RenderType").asString().result();
            if (!$$1.isPresent()) {
               String $$2 = $$0xx.get("CriteriaName").asString("");
               dxr.a $$3 = a($$2);
               return $$0xx.set("RenderType", $$0xx.createString($$3.a()));
            } else {
               return $$0xx;
            }
         }));
   }
}
