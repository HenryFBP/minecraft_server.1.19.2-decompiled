public class vc implements tc<tf> {
   private final int a;
   private final abb b;

   public vc(int $$0, cdp<?> $$1) {
      this.a = $$0;
      this.b = $$1.f();
   }

   public vc(qx $$0) {
      this.a = $$0.readByte();
      this.b = $$0.r();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a);
      $$0.a(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public abb b() {
      return this.b;
   }

   public int c() {
      return this.a;
   }
}
