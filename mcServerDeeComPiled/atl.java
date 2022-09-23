import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atl extends DataFix {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 4096;
   private static final short c = 12;

   public atl(Schema $$0, boolean $$1) {
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
         OpticFinder<? extends List<?>> $$4 = DSL.fieldFinder("TileEntities", $$3);
         Type<?> $$5 = this.getInputSchema().getType(asr.c);
         OpticFinder<?> $$6 = $$5.findField("Level");
         OpticFinder<?> $$7 = $$6.type().findField("Sections");
         Type<?> $$8 = $$7.type();
         if (!($$8 instanceof ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
         } else {
            Type<?> $$9 = ((ListType)$$8).getElement();
            OpticFinder<?> $$10 = DSL.typeFinder($$9);
            return TypeRewriteRule.seq(
               new anq(this.getOutputSchema(), "AddTrappedChestFix", asr.l).makeRule(),
               this.fixTypeEverywhereTyped("Trapped Chest fix", $$5, $$4x -> $$4x.updateTyped($$6, $$3xx -> {
                     Optional<? extends Typed<?>> $$4xx = $$3xx.getOptionalTyped($$7);
                     if (!$$4xx.isPresent()) {
                        return $$3xx;
                     } else {
                        List<? extends Typed<?>> $$5x = ((Typed)$$4xx.get()).getAllTyped($$10);
                        IntSet $$6x = new IntOpenHashSet();
   
                        for(Typed<?> $$7 : $$5x) {
                           atl.a $$8 = new atl.a($$7, this.getInputSchema());
                           if (!$$8.b()) {
                              for(int $$9 = 0; $$9 < 4096; ++$$9) {
                                 int $$10x = $$8.c($$9);
                                 if ($$8.a($$10x)) {
                                    $$6x.add($$8.c() << 12 | $$9);
                                 }
                              }
                           }
                        }
   
                        Dynamic<?> $$11 = (Dynamic)$$3xx.get(DSL.remainderFinder());
                        int $$12 = $$11.get("xPos").asInt(0);
                        int $$13 = $$11.get("zPos").asInt(0);
                        TaggedChoiceType<String> $$14 = this.getInputSchema().findChoiceType(asr.l);
                        return $$3xx.updateTyped($$4, $$4xxx -> $$4xxx.updateTyped($$14.finder(), $$4xxxx -> {
                              Dynamic<?> $$5xx = (Dynamic)$$4xxxx.getOrCreate(DSL.remainderFinder());
                              int $$6xx = $$5xx.get("x").asInt(0) - ($$12 << 4);
                              int $$7x = $$5xx.get("y").asInt(0);
                              int $$8x = $$5xx.get("z").asInt(0) - ($$13 << 4);
                              return $$6x.contains(arp.a($$6xx, $$7x, $$8x)) ? $$4xxxx.update($$14.finder(), $$0xxxxx -> $$0xxxxx.mapFirst($$0xxxxxx -> {
                                    if (!Objects.equals($$0xxxxxx, "minecraft:chest")) {
                                       a.warn("Block Entity was expected to be a chest");
                                    }
   
                                    return "minecraft:trapped_chest";
                                 })) : $$4xxxx;
                           }));
                     }
                  }))
            );
         }
      }
   }

   public static final class a extends arp.b {
      @Nullable
      private IntSet h;

      public a(Typed<?> $$0, Schema $$1) {
         super($$0, $$1);
      }

      @Override
      protected boolean a() {
         this.h = new IntOpenHashSet();

         for(int $$0 = 0; $$0 < this.e.size(); ++$$0) {
            Dynamic<?> $$1 = (Dynamic)this.e.get($$0);
            String $$2 = $$1.get("Name").asString("");
            if (Objects.equals($$2, "minecraft:trapped_chest")) {
               this.h.add($$0);
            }
         }

         return this.h.isEmpty();
      }

      public boolean a(int $$0) {
         return this.h.contains($$0);
      }
   }
}
