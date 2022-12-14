import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class apa extends DataFix {
   private static final ImmutableMap<String, Pair<String, ImmutableMap<String, String>>> a = ImmutableMap.builder()
      .put(
         "EndCity",
         Pair.of(
            "ECP",
            ImmutableMap.builder().put("second_floor", "second_floor_1").put("third_floor", "third_floor_1").put("third_floor_c", "third_floor_2").build()
         )
      )
      .put(
         "Mansion",
         Pair.of(
            "WMP",
            ImmutableMap.builder()
               .put("carpet_south", "carpet_south_1")
               .put("carpet_west", "carpet_west_1")
               .put("indoors_door", "indoors_door_1")
               .put("indoors_wall", "indoors_wall_1")
               .build()
         )
      )
      .put(
         "Igloo",
         Pair.of(
            "Iglu",
            ImmutableMap.builder()
               .put("minecraft:igloo/igloo_bottom", "minecraft:igloo/bottom")
               .put("minecraft:igloo/igloo_middle", "minecraft:igloo/middle")
               .put("minecraft:igloo/igloo_top", "minecraft:igloo/top")
               .build()
         )
      )
      .put(
         "Ocean_Ruin",
         Pair.of(
            "ORP",
            ImmutableMap.builder()
               .put("minecraft:ruin/big_ruin1_brick", "minecraft:underwater_ruin/big_brick_1")
               .put("minecraft:ruin/big_ruin2_brick", "minecraft:underwater_ruin/big_brick_2")
               .put("minecraft:ruin/big_ruin3_brick", "minecraft:underwater_ruin/big_brick_3")
               .put("minecraft:ruin/big_ruin8_brick", "minecraft:underwater_ruin/big_brick_8")
               .put("minecraft:ruin/big_ruin1_cracked", "minecraft:underwater_ruin/big_cracked_1")
               .put("minecraft:ruin/big_ruin2_cracked", "minecraft:underwater_ruin/big_cracked_2")
               .put("minecraft:ruin/big_ruin3_cracked", "minecraft:underwater_ruin/big_cracked_3")
               .put("minecraft:ruin/big_ruin8_cracked", "minecraft:underwater_ruin/big_cracked_8")
               .put("minecraft:ruin/big_ruin1_mossy", "minecraft:underwater_ruin/big_mossy_1")
               .put("minecraft:ruin/big_ruin2_mossy", "minecraft:underwater_ruin/big_mossy_2")
               .put("minecraft:ruin/big_ruin3_mossy", "minecraft:underwater_ruin/big_mossy_3")
               .put("minecraft:ruin/big_ruin8_mossy", "minecraft:underwater_ruin/big_mossy_8")
               .put("minecraft:ruin/big_ruin_warm4", "minecraft:underwater_ruin/big_warm_4")
               .put("minecraft:ruin/big_ruin_warm5", "minecraft:underwater_ruin/big_warm_5")
               .put("minecraft:ruin/big_ruin_warm6", "minecraft:underwater_ruin/big_warm_6")
               .put("minecraft:ruin/big_ruin_warm7", "minecraft:underwater_ruin/big_warm_7")
               .put("minecraft:ruin/ruin1_brick", "minecraft:underwater_ruin/brick_1")
               .put("minecraft:ruin/ruin2_brick", "minecraft:underwater_ruin/brick_2")
               .put("minecraft:ruin/ruin3_brick", "minecraft:underwater_ruin/brick_3")
               .put("minecraft:ruin/ruin4_brick", "minecraft:underwater_ruin/brick_4")
               .put("minecraft:ruin/ruin5_brick", "minecraft:underwater_ruin/brick_5")
               .put("minecraft:ruin/ruin6_brick", "minecraft:underwater_ruin/brick_6")
               .put("minecraft:ruin/ruin7_brick", "minecraft:underwater_ruin/brick_7")
               .put("minecraft:ruin/ruin8_brick", "minecraft:underwater_ruin/brick_8")
               .put("minecraft:ruin/ruin1_cracked", "minecraft:underwater_ruin/cracked_1")
               .put("minecraft:ruin/ruin2_cracked", "minecraft:underwater_ruin/cracked_2")
               .put("minecraft:ruin/ruin3_cracked", "minecraft:underwater_ruin/cracked_3")
               .put("minecraft:ruin/ruin4_cracked", "minecraft:underwater_ruin/cracked_4")
               .put("minecraft:ruin/ruin5_cracked", "minecraft:underwater_ruin/cracked_5")
               .put("minecraft:ruin/ruin6_cracked", "minecraft:underwater_ruin/cracked_6")
               .put("minecraft:ruin/ruin7_cracked", "minecraft:underwater_ruin/cracked_7")
               .put("minecraft:ruin/ruin8_cracked", "minecraft:underwater_ruin/cracked_8")
               .put("minecraft:ruin/ruin1_mossy", "minecraft:underwater_ruin/mossy_1")
               .put("minecraft:ruin/ruin2_mossy", "minecraft:underwater_ruin/mossy_2")
               .put("minecraft:ruin/ruin3_mossy", "minecraft:underwater_ruin/mossy_3")
               .put("minecraft:ruin/ruin4_mossy", "minecraft:underwater_ruin/mossy_4")
               .put("minecraft:ruin/ruin5_mossy", "minecraft:underwater_ruin/mossy_5")
               .put("minecraft:ruin/ruin6_mossy", "minecraft:underwater_ruin/mossy_6")
               .put("minecraft:ruin/ruin7_mossy", "minecraft:underwater_ruin/mossy_7")
               .put("minecraft:ruin/ruin8_mossy", "minecraft:underwater_ruin/mossy_8")
               .put("minecraft:ruin/ruin_warm1", "minecraft:underwater_ruin/warm_1")
               .put("minecraft:ruin/ruin_warm2", "minecraft:underwater_ruin/warm_2")
               .put("minecraft:ruin/ruin_warm3", "minecraft:underwater_ruin/warm_3")
               .put("minecraft:ruin/ruin_warm4", "minecraft:underwater_ruin/warm_4")
               .put("minecraft:ruin/ruin_warm5", "minecraft:underwater_ruin/warm_5")
               .put("minecraft:ruin/ruin_warm6", "minecraft:underwater_ruin/warm_6")
               .put("minecraft:ruin/ruin_warm7", "minecraft:underwater_ruin/warm_7")
               .put("minecraft:ruin/ruin_warm8", "minecraft:underwater_ruin/warm_8")
               .put("minecraft:ruin/big_brick_1", "minecraft:underwater_ruin/big_brick_1")
               .put("minecraft:ruin/big_brick_2", "minecraft:underwater_ruin/big_brick_2")
               .put("minecraft:ruin/big_brick_3", "minecraft:underwater_ruin/big_brick_3")
               .put("minecraft:ruin/big_brick_8", "minecraft:underwater_ruin/big_brick_8")
               .put("minecraft:ruin/big_mossy_1", "minecraft:underwater_ruin/big_mossy_1")
               .put("minecraft:ruin/big_mossy_2", "minecraft:underwater_ruin/big_mossy_2")
               .put("minecraft:ruin/big_mossy_3", "minecraft:underwater_ruin/big_mossy_3")
               .put("minecraft:ruin/big_mossy_8", "minecraft:underwater_ruin/big_mossy_8")
               .put("minecraft:ruin/big_cracked_1", "minecraft:underwater_ruin/big_cracked_1")
               .put("minecraft:ruin/big_cracked_2", "minecraft:underwater_ruin/big_cracked_2")
               .put("minecraft:ruin/big_cracked_3", "minecraft:underwater_ruin/big_cracked_3")
               .put("minecraft:ruin/big_cracked_8", "minecraft:underwater_ruin/big_cracked_8")
               .put("minecraft:ruin/big_warm_4", "minecraft:underwater_ruin/big_warm_4")
               .put("minecraft:ruin/big_warm_5", "minecraft:underwater_ruin/big_warm_5")
               .put("minecraft:ruin/big_warm_6", "minecraft:underwater_ruin/big_warm_6")
               .put("minecraft:ruin/big_warm_7", "minecraft:underwater_ruin/big_warm_7")
               .build()
         )
      )
      .build();

   public apa(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.v);
      OpticFinder<?> $$1 = $$0.findField("Children");
      return this.fixTypeEverywhereTyped(
         "ChunkStructuresTemplateRenameFix",
         $$0,
         $$1x -> $$1x.updateTyped($$1, $$1xx -> $$1xx.update(DSL.remainderFinder(), $$1xxx -> this.a((Dynamic<?>)$$1x.get(DSL.remainderFinder()), $$1xxx)))
      );
   }

   private Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$1) {
      String $$2 = $$0.get("id").asString("");
      if (a.containsKey($$2)) {
         Pair<String, ImmutableMap<String, String>> $$3 = (Pair)a.get($$2);
         if (((String)$$3.getFirst()).equals($$1.get("id").asString(""))) {
            String $$4 = $$1.get("Template").asString("");
            $$1 = $$1.set("Template", $$1.createString((String)((ImmutableMap)$$3.getSecond()).getOrDefault($$4, $$4)));
         }
      }

      return $$1;
   }
}
