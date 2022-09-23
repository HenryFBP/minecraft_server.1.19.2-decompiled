import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class atp extends DataFix {
   private static final int a = 2;
   private static final int[] b = new int[]{0, 10, 50, 100, 150};

   public static int a(int $$0) {
      return b[ami.a($$0 - 1, 0, b.length - 1)];
   }

   public atp(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getChoiceType(asr.q, "minecraft:villager");
      OpticFinder<?> $$1 = DSL.namedChoice("minecraft:villager", $$0);
      OpticFinder<?> $$2 = $$0.findField("Offers");
      Type<?> $$3 = $$2.type();
      OpticFinder<?> $$4 = $$3.findField("Recipes");
      ListType<?> $$5 = (ListType)$$4.type();
      OpticFinder<?> $$6 = $$5.getElement().finder();
      return this.fixTypeEverywhereTyped("Villager level and xp rebuild", this.getInputSchema().getType(asr.q), $$5x -> $$5x.updateTyped($$1, $$0, $$3xx -> {
            Dynamic<?> $$4xx = (Dynamic)$$3xx.get(DSL.remainderFinder());
            int $$5xx = $$4xx.get("VillagerData").get("level").asInt(0);
            Typed<?> $$6x = $$3xx;
            if ($$5xx == 0 || $$5xx == 1) {
               int $$7 = $$3xx.getOptionalTyped($$2).flatMap($$1xxx -> $$1xxx.getOptionalTyped($$4)).map($$1xxx -> $$1xxx.getAllTyped($$6).size()).orElse(0);
               $$5xx = ami.a($$7 / 2, 1, 5);
               if ($$5xx > 1) {
                  $$6x = a($$3xx, $$5xx);
               }
            }

            Optional<Number> $$8 = $$4xx.get("Xp").asNumber().result();
            if (!$$8.isPresent()) {
               $$6x = b($$6x, $$5xx);
            }

            return $$6x;
         }));
   }

   private static Typed<?> a(Typed<?> $$0, int $$1) {
      return $$0.update(DSL.remainderFinder(), $$1x -> $$1x.update("VillagerData", $$1xx -> $$1xx.set("level", $$1xx.createInt($$1))));
   }

   private static Typed<?> b(Typed<?> $$0, int $$1) {
      int $$2 = a($$1);
      return $$0.update(DSL.remainderFinder(), $$1x -> $$1x.set("Xp", $$1x.createInt($$2)));
   }
}
