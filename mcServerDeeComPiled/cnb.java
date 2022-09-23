import javax.annotation.Nullable;

public class cnb extends cjt implements cql {
   private static final cwf b = cwe.C;
   protected static final dxj a = cjt.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   protected cnb(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(b) ? dpw.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = super.a($$0);
      if ($$1 != null) {
         dpv $$2 = $$0.q().b_($$0.a());
         return $$1.a(b, Boolean.valueOf($$2.a() == dpw.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.b();
      cvo $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, gy.a);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == gy.b && !this.a($$0, $$3, $$4)) {
         return cju.a.m();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, dpw.c, dpw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
