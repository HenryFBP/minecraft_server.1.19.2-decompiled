public class tr implements tc<tf> {
   private final bag a;
   private final boolean b;

   public tr(bag $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public tr(qx $$0) {
      this.a = bag.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.a.a());
      $$0.writeBoolean(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.b;
   }

   public bag c() {
      return this.a;
   }
}
