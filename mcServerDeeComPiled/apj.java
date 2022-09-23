import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class apj extends DataFix {
   public apj(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<String> $$0 = DSL.fieldFinder("id", aua.a());
      return this.fixTypeEverywhereTyped(
         "EntityCustomNameToComponentFix", this.getInputSchema().getType(asr.q), $$1 -> $$1.update(DSL.remainderFinder(), $$2 -> {
               Optional<String> $$3 = $$1.getOptional($$0);
               return $$3.isPresent() && Objects.equals($$3.get(), "minecraft:commandblock_minecart") ? $$2 : a($$2);
            })
      );
   }

   public static Dynamic<?> a(Dynamic<?> $$0) {
      String $$1 = $$0.get("CustomName").asString("");
      return $$1.isEmpty() ? $$0.remove("CustomName") : $$0.set("CustomName", $$0.createString(rq.a.a(rq.b($$1))));
   }
}
