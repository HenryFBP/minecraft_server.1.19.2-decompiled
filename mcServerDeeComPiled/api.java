import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class api extends atc {
   public static final Map<String, String> a = ImmutableMap.builder()
      .put("minecraft:salmon_mob", "minecraft:salmon")
      .put("minecraft:cod_mob", "minecraft:cod")
      .build();
   public static final Map<String, String> b = ImmutableMap.builder()
      .put("minecraft:salmon_mob_spawn_egg", "minecraft:salmon_spawn_egg")
      .put("minecraft:cod_mob_spawn_egg", "minecraft:cod_spawn_egg")
      .build();

   public api(Schema $$0, boolean $$1) {
      super("EntityCodSalmonFix", $$0, $$1);
   }

   @Override
   protected String a(String $$0) {
      return (String)a.getOrDefault($$0, $$0);
   }
}
