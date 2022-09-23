import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;

public record abr(MinecraftSessionService a, amp b, GameProfileRepository c, aiv d) {
   private static final String e = "usercache.json";

   public static abr a(YggdrasilAuthenticationService $$0, File $$1) {
      MinecraftSessionService $$2 = $$0.createMinecraftSessionService();
      GameProfileRepository $$3 = $$0.createProfileRepository();
      aiv $$4 = new aiv($$3, new File($$1, "usercache.json"));
      amp $$5 = amp.a($$0.getServicesKey());
      return new abr($$2, $$5, $$3, $$4);
   }
}
