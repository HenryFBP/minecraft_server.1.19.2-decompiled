import net.minecraft.server.MinecraftServer;

public class ajm implements dq {
   private static final String b = "Rcon";
   private static final rq c = rq.b("Rcon");
   private final StringBuffer d = new StringBuffer();
   private final MinecraftServer e;

   public ajm(MinecraftServer $$0) {
      this.e = $$0;
   }

   public void e() {
      this.d.setLength(0);
   }

   public String f() {
      return this.d.toString();
   }

   public dr g() {
      agg $$0 = this.e.C();
      return new dr(this, dwq.b($$0.Q()), dwp.a, $$0, 4, "Rcon", c, this.e, null);
   }

   @Override
   public void a(rq $$0) {
      this.d.append($$0.getString());
   }

   @Override
   public boolean i_() {
      return true;
   }

   @Override
   public boolean j_() {
      return true;
   }

   @Override
   public boolean G_() {
      return this.e.j();
   }
}
