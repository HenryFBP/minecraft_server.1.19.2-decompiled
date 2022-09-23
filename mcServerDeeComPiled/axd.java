import net.minecraft.server.MinecraftServer;

public enum axd {
   a("client"),
   b("server");

   private final String c;

   private axd(String $$0) {
      this.c = $$0;
   }

   public static axd a(MinecraftServer $$0) {
      return $$0.k() ? b : a;
   }

   public String a() {
      return this.c;
   }
}
