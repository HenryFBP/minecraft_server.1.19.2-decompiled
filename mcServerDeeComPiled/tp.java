public class tp implements tc<tf> {
   private final gt a;
   private final cvo b;

   public tp(gt $$0, cvo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public tp(cgd $$0, gt $$1) {
      this($$1, $$0.a_($$1));
   }

   public tp(qx $$0) {
      this.a = $$0.f();
      this.b = $$0.a(cjt.o);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.a(cjt.o, this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public cvo b() {
      return this.b;
   }

   public gt c() {
      return this.a;
   }
}
