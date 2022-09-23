public class cqm extends ciq {
   public static final int a = 15;
   private static final int d = 16;
   public static final cwo b = cwe.bb;
   protected static final dxj c = cjt.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   protected cqm(cqm.a $$0, cvn.c $$1) {
      super($$0, $$1);
      this.k(this.D.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c;
   }

   @Override
   public dxj b_(cvo $$0, cgd $$1, gt $$2) {
      return dxg.a();
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(b, Integer.valueOf(ami.b((double)($$0.i() * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   public interface a {
   }

   public static enum b implements cqm.a {
      a,
      b,
      c,
      d,
      e,
      f;
   }
}
