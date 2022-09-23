public class yk implements tc<xm> {
   private final boolean a;
   private final boolean b;

   public yk(boolean $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public yk(qx $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeBoolean(this.a);
      $$0.writeBoolean(this.b);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
