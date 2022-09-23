import com.mojang.bridge.game.GameVersion;
import com.mojang.bridge.game.PackType;

public enum ahm {
   a("assets", PackType.RESOURCE),
   b("data", PackType.DATA);

   private final String c;
   private final PackType d;

   private ahm(String $$0, PackType $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public String a() {
      return this.c;
   }

   public int a(GameVersion $$0) {
      return $$0.getPackVersion(this.d);
   }
}
