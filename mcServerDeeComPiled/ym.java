public class ym implements tc<xm> {
   private final int a;
   private final abb b;
   private final boolean c;

   public ym(int $$0, cdp<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.f();
      this.c = $$2;
   }

   public ym(qx $$0) {
      this.a = $$0.readByte();
      this.b = $$0.r();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a);
      $$0.a(this.b);
      $$0.writeBoolean(this.c);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public abb c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
