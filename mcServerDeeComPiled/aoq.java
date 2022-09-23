import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class aoq extends DataFix {
   public aoq(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getOutputSchema().getType(asr.c);
      Type<?> $$1 = $$0.findFieldType("Level");
      Type<?> $$2 = $$1.findFieldType("TileEntities");
      if (!($$2 instanceof ListType)) {
         throw new IllegalStateException("Tile entity type is not a list type.");
      } else {
         ListType<?> $$3 = (ListType)$$2;
         return this.a($$1, $$3);
      }
   }

   private <TE> TypeRewriteRule a(Type<?> $$0, ListType<TE> $$1) {
      Type<TE> $$2 = $$1.getElement();
      OpticFinder<?> $$3 = DSL.fieldFinder("Level", $$0);
      OpticFinder<List<TE>> $$4 = DSL.fieldFinder("TileEntities", $$1);
      int $$5 = 416;
      return TypeRewriteRule.seq(
         this.fixTypeEverywhere(
            "InjectBedBlockEntityType", this.getInputSchema().findChoiceType(asr.l), this.getOutputSchema().findChoiceType(asr.l), $$0x -> $$0xx -> $$0xx
         ),
         this.fixTypeEverywhereTyped(
            "BedBlockEntityInjecter",
            this.getOutputSchema().getType(asr.c),
            $$3x -> {
               Typed<?> $$4x = $$3x.getTyped($$3);
               Dynamic<?> $$5x = (Dynamic)$$4x.get(DSL.remainderFinder());
               int $$6 = $$5x.get("xPos").asInt(0);
               int $$7 = $$5x.get("zPos").asInt(0);
               List<TE> $$8 = Lists.newArrayList((Iterable)$$4x.getOrCreate($$4));
               List<? extends Dynamic<?>> $$9 = $$5x.get("Sections").asList(Function.identity());
      
               for(int $$10 = 0; $$10 < $$9.size(); ++$$10) {
                  Dynamic<?> $$11 = (Dynamic)$$9.get($$10);
                  int $$12 = $$11.get("Y").asInt(0);
                  Stream<Integer> $$13 = $$11.get("Blocks").asStream().map($$0xx -> $$0xx.asInt(0));
                  int $$14 = 0;
      
                  for(int $$15 : $$13::iterator) {
                     if (416 == ($$15 & 0xFF) << 4) {
                        int $$16 = $$14 & 15;
                        int $$17 = $$14 >> 8 & 15;
                        int $$18 = $$14 >> 4 & 15;
                        Map<Dynamic<?>, Dynamic<?>> $$19 = Maps.newHashMap();
                        $$19.put($$11.createString("id"), $$11.createString("minecraft:bed"));
                        $$19.put($$11.createString("x"), $$11.createInt($$16 + ($$6 << 4)));
                        $$19.put($$11.createString("y"), $$11.createInt($$17 + ($$12 << 4)));
                        $$19.put($$11.createString("z"), $$11.createInt($$18 + ($$7 << 4)));
                        $$19.put($$11.createString("color"), $$11.createShort((short)14));
                        $$8.add(
                           ((Pair)$$2.read($$11.createMap($$19))
                                 .result()
                                 .orElseThrow(() -> new IllegalStateException("Could not parse newly created bed block entity.")))
                              .getFirst()
                        );
                     }
      
                     ++$$14;
                  }
               }
      
               return !$$8.isEmpty() ? $$3x.set($$3, $$4x.set($$4, $$8)) : $$3x;
            }
         )
      );
   }
}
