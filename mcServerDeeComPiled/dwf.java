import net.minecraft.server.MinecraftServer;

public class dwf implements dwg<MinecraftServer> {
   final abb a;

   public dwf(abb $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, dwi<MinecraftServer> $$1, long $$2) {
      abo $$3 = $$0.aA();

      for(dm $$5 : $$3.b(this.a)) {
         $$3.a($$5, $$3.d());
      }

   }

   public static class a extends dwg.a<MinecraftServer, dwf> {
      public a() {
         super(new abb("function_tag"), dwf.class);
      }

      public void a(pj $$0, dwf $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public dwf a(pj $$0) {
         abb $$1 = new abb($$0.l("Name"));
         return new dwf($$1);
      }
   }
}
