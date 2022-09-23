import net.minecraft.server.MinecraftServer;

public class dwe implements dwg<MinecraftServer> {
   final abb a;

   public dwe(abb $$0) {
      this.a = $$0;
   }

   public void a(MinecraftServer $$0, dwi<MinecraftServer> $$1, long $$2) {
      abo $$3 = $$0.aA();
      $$3.a(this.a).ifPresent($$1x -> $$3.a($$1x, $$3.d()));
   }

   public static class a extends dwg.a<MinecraftServer, dwe> {
      public a() {
         super(new abb("function"), dwe.class);
      }

      public void a(pj $$0, dwe $$1) {
         $$0.a("Name", $$1.a.toString());
      }

      public dwe a(pj $$0) {
         abb $$1 = new abb($$0.l("Name"));
         return new dwe($$1);
      }
   }
}
