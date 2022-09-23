public class yz implements tc<xm> {
   private final int a;

   public yz(int $$0) {
      this.a = $$0;
   }

   public yz(qx $$0) {
      this.a = $$0.readShort();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeShort(this.a);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }
}
