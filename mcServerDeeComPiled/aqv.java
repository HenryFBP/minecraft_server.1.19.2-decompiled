import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class aqv extends DataFix {
   public aqv(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.v);
      Type<?> $$1 = this.getOutputSchema().getType(asr.v);
      return this.writeFixAndRead("IglooMetadataRemovalFix", $$0, $$1, aqv::a);
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      boolean $$1 = $$0.get("Children").asStreamOpt().map($$0x -> $$0x.allMatch(aqv::c)).result().orElse(false);
      return $$1 ? $$0.set("id", $$0.createString("Igloo")).remove("Children") : $$0.update("Children", aqv::b);
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0) {
      return (Dynamic<T>)$$0.asStreamOpt().map($$0x -> $$0x.filter($$0xx -> !c($$0xx))).map($$0::createList).result().orElse($$0);
   }

   private static boolean c(Dynamic<?> $$0) {
      return $$0.get("id").asString("").equals("Iglu");
   }
}
