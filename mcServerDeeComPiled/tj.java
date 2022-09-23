public class tj implements tc<tf> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public tj(bbn $$0, int $$1) {
      this.g = $$0.ae();
      this.h = $$1;
   }

   public tj(qx $$0) {
      this.g = $$0.k();
      this.h = $$0.readUnsignedByte();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.g);
      $$0.writeByte(this.h);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }
}
