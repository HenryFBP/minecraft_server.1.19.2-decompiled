import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class aqx extends DataFix {
   public aqx(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      Optional<? extends Dynamic<?>> $$1 = $$0.get("display").result();
      if ($$1.isPresent()) {
         Dynamic<?> $$2 = (Dynamic)$$1.get();
         Optional<String> $$3 = $$2.get("Name").asString().result();
         if ($$3.isPresent()) {
            $$2 = $$2.set("Name", $$2.createString(rq.a.a(rq.b((String)$$3.get()))));
         } else {
            Optional<String> $$4 = $$2.get("LocName").asString().result();
            if ($$4.isPresent()) {
               $$2 = $$2.set("Name", $$2.createString(rq.a.a(rq.c((String)$$4.get()))));
               $$2 = $$2.remove("LocName");
            }
         }

         return $$0.set("display", $$2);
      } else {
         return $$0;
      }
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.m);
      OpticFinder<?> $$1 = $$0.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemCustomNameToComponentFix", $$0, $$1x -> $$1x.updateTyped($$1, $$0xx -> $$0xx.update(DSL.remainderFinder(), this::a))
      );
   }
}
