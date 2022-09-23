public class vr implements tc<tf> {
   private final int a;
   private final byte b;

   public vr(bbn $$0, byte $$1) {
      this.a = $$0.ae();
      this.b = $$1;
   }

   public vr(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.readByte();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.writeByte(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public bbn a(cgx $$0) {
      return $$0.a(this.a);
   }

   public byte b() {
      return this.b;
   }
}
