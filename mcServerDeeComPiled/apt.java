import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class apt extends arx {
   public apt(Schema $$0) {
      super($$0, false, "EntityPaintingFieldsRenameFix", asr.q, "minecraft:painting");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      return this.a(this.a($$0, "Motive", "variant"), "Facing", "facing");
   }

   private Dynamic<?> a(Dynamic<?> $$0, String $$1, String $$2) {
      Optional<? extends Dynamic<?>> $$3 = $$0.get($$1).result();
      Optional<? extends Dynamic<?>> $$4 = $$3.map($$3x -> $$0.remove($$1).set($$2, $$3x));
      return (Dynamic<?>)DataFixUtils.orElse($$4, $$0);
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
