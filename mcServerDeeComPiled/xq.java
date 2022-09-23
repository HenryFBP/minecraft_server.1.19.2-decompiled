public class xq implements tc<xm> {
   private final bag a;

   public xq(bag $$0) {
      this.a = $$0;
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public xq(qx $$0) {
      this.a = bag.a($$0.readUnsignedByte());
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a.a());
   }

   public bag b() {
      return this.a;
   }
}
