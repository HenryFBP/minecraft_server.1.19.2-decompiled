import net.minecraft.server.MinecraftServer;

public class ahd implements aaf {
   private static final rq a = rq.c("multiplayer.status.request_handled");
   private final MinecraftServer b;
   private final qv c;
   private boolean d;

   public ahd(MinecraftServer $$0, qv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(rq $$0) {
   }

   @Override
   public qv a() {
      return this.c;
   }

   @Override
   public void a(aah $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new aad(this.b.aq()));
      }
   }

   @Override
   public void a(aag $$0) {
      this.c.a(new aac($$0.b()));
      this.c.a(a);
   }
}
