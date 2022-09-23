public class tz implements tc<tf> {
   public static final int a = -1;
   public static final int b = -2;
   private final int c;
   private final int d;
   private final int e;
   private final cax f;

   public tz(int $$0, int $$1, int $$2, cax $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3.o();
   }

   public tz(qx $$0) {
      this.c = $$0.readByte();
      this.d = $$0.k();
      this.e = $$0.readShort();
      this.f = $$0.p();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeByte(this.c);
      $$0.d(this.d);
      $$0.writeShort(this.e);
      $$0.a(this.f);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.e;
   }

   public cax d() {
      return this.f;
   }

   public int e() {
      return this.d;
   }
}
