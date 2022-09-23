public class wk implements tc<tf> {
   private final int a;
   private final int b;
   private final int c;
   private final int d;

   public wk(bbn $$0) {
      this($$0.ae(), $$0.dd());
   }

   public wk(int $$0, dwq $$1) {
      this.a = $$0;
      double $$2 = 3.9;
      double $$3 = ami.a($$1.c, -3.9, 3.9);
      double $$4 = ami.a($$1.d, -3.9, 3.9);
      double $$5 = ami.a($$1.e, -3.9, 3.9);
      this.b = (int)($$3 * 8000.0);
      this.c = (int)($$4 * 8000.0);
      this.d = (int)($$5 * 8000.0);
   }

   public wk(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.readShort();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.writeShort(this.b);
      $$0.writeShort(this.c);
      $$0.writeShort(this.d);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }
}
