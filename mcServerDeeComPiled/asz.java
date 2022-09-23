import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class asz extends DataFix {
   public asz(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.writeFixAndRead("SavedDataVillageCropFix", this.getInputSchema().getType(asr.v), this.getOutputSchema().getType(asr.v), this::a);
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.update("Children", asz::b);
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0) {
      return (Dynamic<T>)$$0.asStreamOpt().map(asz::a).map($$0::createList).result().orElse($$0);
   }

   private static Stream<? extends Dynamic<?>> a(Stream<? extends Dynamic<?>> $$0) {
      return $$0.map($$0x -> {
         String $$1 = $$0x.get("id").asString("");
         if ("ViF".equals($$1)) {
            return c($$0x);
         } else {
            return "ViDF".equals($$1) ? d($$0x) : $$0x;
         }
      });
   }

   private static <T> Dynamic<T> c(Dynamic<T> $$0) {
      $$0 = a($$0, "CA");
      return a($$0, "CB");
   }

   private static <T> Dynamic<T> d(Dynamic<T> $$0) {
      $$0 = a($$0, "CA");
      $$0 = a($$0, "CB");
      $$0 = a($$0, "CC");
      return a($$0, "CD");
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0, String $$1) {
      return $$0.get($$1).asNumber().result().isPresent() ? $$0.set($$1, aol.b($$0.get($$1).asInt(0) << 4)) : $$0;
   }
}
