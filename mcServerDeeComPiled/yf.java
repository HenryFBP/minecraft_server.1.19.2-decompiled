public class yf implements tc<xm> {
   private final gt a;
   private final int b;
   private final boolean c;

   public yf(gt $$0, int $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public yf(qx $$0) {
      this.a = $$0.f();
      this.b = $$0.k();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.d(this.b);
      $$0.writeBoolean(this.c);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public gt b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
