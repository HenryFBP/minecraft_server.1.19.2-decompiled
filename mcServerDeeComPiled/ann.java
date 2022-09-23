import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.stream.Stream;

public abstract class ann extends DataFix {
   private final String a;

   public ann(Schema $$0, String $$1) {
      super($$0, false);
      this.a = $$1;
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> $$0 = DSL.named(asr.j.typeName(), DSL.remainderType());
      if (!Objects.equals($$0, this.getInputSchema().getType(asr.j))) {
         throw new IllegalStateException("Poi type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.a, $$0, $$0x -> $$0xx -> $$0xx.mapSecond(this::a));
      }
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.update("Sections", $$0x -> $$0x.updateMapValues($$0xx -> $$0xx.mapSecond(this::b)));
   }

   private Dynamic<?> b(Dynamic<?> $$0) {
      return $$0.update("Records", this::c);
   }

   private <T> Dynamic<T> c(Dynamic<T> $$0) {
      return (Dynamic<T>)DataFixUtils.orElse($$0.asStreamOpt().result().map($$1 -> $$0.createList(this.a($$1))), $$0);
   }

   protected abstract <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> var1);
}
