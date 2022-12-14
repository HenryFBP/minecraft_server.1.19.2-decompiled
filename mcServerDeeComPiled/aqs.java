import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class aqs extends ari {
   private static final String[] a = new String[]{
      "minecraft:ponder_goat_horn",
      "minecraft:sing_goat_horn",
      "minecraft:seek_goat_horn",
      "minecraft:feel_goat_horn",
      "minecraft:admire_goat_horn",
      "minecraft:call_goat_horn",
      "minecraft:yearn_goat_horn",
      "minecraft:dream_goat_horn"
   };

   public aqs(Schema $$0) {
      super($$0, "GoatHornIdFix", $$0x -> $$0x.equals("minecraft:goat_horn"));
   }

   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      int $$1 = $$0.get("SoundVariant").asInt(0);
      String $$2 = a[$$1 >= 0 && $$1 < a.length ? $$1 : 0];
      return $$0.remove("SoundVariant").set("instrument", $$0.createString($$2));
   }
}
