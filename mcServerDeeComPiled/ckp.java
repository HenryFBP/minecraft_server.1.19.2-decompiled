import javax.annotation.Nullable;

public class ckp extends cpv implements cql {
   public static final cwf a = cwe.C;
   protected static final float b = 6.5F;
   protected static final float c = 9.5F;
   protected static final dxj d = cjt.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final dxj e = cjt.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final dxj f = cjt.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public ckp(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(false)).a(g, gy.a.b));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch((gy.a)$$0.c(g)) {
         case a:
         default:
            return f;
         case c:
            return e;
         case b:
            return d;
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == dpw.c;
      return super.a($$0).a(a, Boolean.valueOf($$2));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a).a(g);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(a) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
