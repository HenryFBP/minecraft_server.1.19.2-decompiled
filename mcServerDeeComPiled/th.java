public class th implements tc<tf> {
   private final int a;
   private final double b;
   private final double c;
   private final double d;
   private final int e;

   public th(bbt $$0) {
      this.a = $$0.ae();
      this.b = $$0.df();
      this.c = $$0.dh();
      this.d = $$0.dl();
      this.e = $$0.h();
   }

   public th(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readShort();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeDouble(this.d);
      $$0.writeShort(this.e);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public double c() {
      return this.b;
   }

   public double d() {
      return this.c;
   }

   public double e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }
}
