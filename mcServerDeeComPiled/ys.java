public class ys implements tc<xm> {
   private final bxw a;
   private final boolean b;
   private final boolean c;

   public ys(bxw $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ys(qx $$0) {
      this.a = $$0.a(bxw.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.a((Enum<?>)this.a);
      $$0.writeBoolean(this.b);
      $$0.writeBoolean(this.c);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public bxw b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
