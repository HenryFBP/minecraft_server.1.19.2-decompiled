import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class asq extends DataFix {
   public asq(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Schema $$0 = this.getInputSchema();
      return this.fixTypeEverywhereTyped("RedstoneConnectionsFix", $$0.getType(asr.n), $$0x -> $$0x.update(DSL.remainderFinder(), this::a));
   }

   private <T> Dynamic<T> a(Dynamic<T> $$0) {
      boolean $$1 = $$0.get("Name").asString().result().filter("minecraft:redstone_wire"::equals).isPresent();
      return !$$1
         ? $$0
         : $$0.update(
            "Properties",
            $$0x -> {
               String $$1x = $$0x.get("east").asString("none");
               String $$2 = $$0x.get("west").asString("none");
               String $$3 = $$0x.get("north").asString("none");
               String $$4 = $$0x.get("south").asString("none");
               boolean $$5 = a($$1x) || a($$2);
               boolean $$6 = a($$3) || a($$4);
               String $$7 = !a($$1x) && !$$6 ? "side" : $$1x;
               String $$8 = !a($$2) && !$$6 ? "side" : $$2;
               String $$9 = !a($$3) && !$$5 ? "side" : $$3;
               String $$10 = !a($$4) && !$$5 ? "side" : $$4;
               return $$0x.update("east", $$1xx -> $$1xx.createString($$7))
                  .update("west", $$1xx -> $$1xx.createString($$8))
                  .update("north", $$1xx -> $$1xx.createString($$9))
                  .update("south", $$1xx -> $$1xx.createString($$10));
            }
         );
   }

   private static boolean a(String $$0) {
      return !"none".equals($$0);
   }
}
