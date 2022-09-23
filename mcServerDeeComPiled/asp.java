import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class asp extends aso {
   private static final Map<String, String> a = ImmutableMap.builder()
      .put("minecraft:acacia_bark", "minecraft:acacia_wood")
      .put("minecraft:birch_bark", "minecraft:birch_wood")
      .put("minecraft:dark_oak_bark", "minecraft:dark_oak_wood")
      .put("minecraft:jungle_bark", "minecraft:jungle_wood")
      .put("minecraft:oak_bark", "minecraft:oak_wood")
      .put("minecraft:spruce_bark", "minecraft:spruce_wood")
      .build();

   public asp(Schema $$0, boolean $$1) {
      super($$0, $$1, "Recipes renamening fix", $$0x -> (String)a.getOrDefault($$0x, $$0x));
   }
}
