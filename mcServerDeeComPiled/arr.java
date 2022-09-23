import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.math.NumberUtils;

public class arr extends DataFix {
   private static final String b = "generatorOptions";
   @VisibleForTesting
   static final String a = "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
   private static final Splitter c = Splitter.on(';').limit(5);
   private static final Splitter d = Splitter.on(',');
   private static final Splitter e = Splitter.on('x').limit(2);
   private static final Splitter f = Splitter.on('*').limit(2);
   private static final Splitter g = Splitter.on(':').limit(3);

   public arr(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("LevelFlatGeneratorInfoFix", this.getInputSchema().getType(asr.a), $$0 -> $$0.update(DSL.remainderFinder(), this::a));
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      return $$0.get("generatorName").asString("").equalsIgnoreCase("flat")
         ? $$0.update("generatorOptions", $$0x -> (Dynamic)DataFixUtils.orElse($$0x.asString().map(this::a).map($$0x::createString).result(), $$0x))
         : $$0;
   }

   @VisibleForTesting
   String a(String $$0) {
      if ($$0.isEmpty()) {
         return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
      } else {
         Iterator<String> $$1 = c.split($$0).iterator();
         String $$2 = (String)$$1.next();
         int $$3;
         String $$4;
         if ($$1.hasNext()) {
            $$3 = NumberUtils.toInt($$2, 0);
            $$4 = (String)$$1.next();
         } else {
            $$3 = 0;
            $$4 = $$2;
         }

         if ($$3 >= 0 && $$3 <= 3) {
            StringBuilder $$7 = new StringBuilder();
            Splitter $$8 = $$3 < 3 ? e : f;
            $$7.append((String)StreamSupport.stream(d.split($$4).spliterator(), false).map($$2x -> {
               List<String> $$3 = $$8.splitToList($$2x);
               int $$6x;
               String $$7x;
               if ($$3.size() == 2) {
                  $$6x = NumberUtils.toInt((String)$$3.get(0));
                  $$7x = (String)$$3.get(1);
               } else {
                  $$6x = 1;
                  $$7x = (String)$$3.get(0);
               }

               List<String> $$8x = g.splitToList($$7x);
               int $$9 = ((String)$$8x.get(0)).equals("minecraft") ? 1 : 0;
               String $$10 = (String)$$8x.get($$9);
               int $$11 = $$3 == 3 ? apg.a("minecraft:" + $$10) : NumberUtils.toInt($$10, 0);
               int $$12 = $$9 + 1;
               int $$13 = $$8x.size() > $$12 ? NumberUtils.toInt((String)$$8x.get($$12), 0) : 0;
               return ($$6x == 1 ? "" : $$6x + "*") + aol.b($$11 << 4 | $$13).get("Name").asString("");
            }).collect(Collectors.joining(",")));

            while($$1.hasNext()) {
               $$7.append(';').append((String)$$1.next());
            }

            return $$7.toString();
         } else {
            return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
         }
      }
   }
}
