import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public abstract class ata extends aqa {
   public ata(String $$0, Schema $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
      Pair<String, Dynamic<?>> $$2 = this.a($$0, (Dynamic<?>)$$1.getOrCreate(DSL.remainderFinder()));
      return Pair.of((String)$$2.getFirst(), $$1.set(DSL.remainderFinder(), (Dynamic)$$2.getSecond()));
   }

   protected abstract Pair<String, Dynamic<?>> a(String var1, Dynamic<?> var2);
}
