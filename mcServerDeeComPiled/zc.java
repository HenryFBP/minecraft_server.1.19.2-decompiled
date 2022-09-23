public class zc implements tc<xm> {
   private final int a;
   private final cax b;

   public zc(int $$0, cax $$1) {
      this.a = $$0;
      this.b = $$1.o();
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public zc(qx $$0) {
      this.a = $$0.readShort();
      this.b = $$0.p();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeShort(this.a);
      $$0.a(this.b);
   }

   public int b() {
      return this.a;
   }

   public cax c() {
      return this.b;
   }
}
