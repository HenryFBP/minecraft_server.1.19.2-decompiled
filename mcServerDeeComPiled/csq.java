public class csq extends cji {
   public static final cwo d = cwe.aT;
   private final int e;

   protected csq(int $$0, cvn.c $$1) {
      super($$1);
      this.k(this.D.b().a(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(cgx $$0, gt $$1) {
      int $$2 = Math.min($$0.a(bbn.class, c.a($$1)).size(), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return ami.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected void a(cgy $$0, gt $$1) {
      $$0.a(null, $$1, ajw.lg, ajx.e, 0.3F, 0.90000004F);
   }

   @Override
   protected void b(cgy $$0, gt $$1) {
      $$0.a(null, $$1, ajw.lf, ajx.e, 0.3F, 0.75F);
   }

   @Override
   protected int g(cvo $$0) {
      return $$0.c(d);
   }

   @Override
   protected cvo a(cvo $$0, int $$1) {
      return $$0.a(d, Integer.valueOf($$1));
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d);
   }
}
