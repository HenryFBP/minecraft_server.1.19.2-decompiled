import javax.annotation.Nullable;

public class cnp extends cjt implements cql {
   public static final cwi a = cnf.aD;
   public static final cwf b = cwe.C;
   protected static final float c = 3.0F;
   protected static final dxj d = cjt.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final dxj e = cjt.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final dxj f = cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final dxj g = cjt.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected cnp(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch((gy)$$0.c(a)) {
         case c:
            return g;
         case d:
            return f;
         case e:
            return e;
         case f:
         default:
            return d;
      }
   }

   private boolean a(cgd $$0, gt $$1, gy $$2) {
      cvo $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gy $$3 = $$0.c(a);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return cju.a.m();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, dpw.c, dpw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      if (!$$0.c()) {
         cvo $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(a) == $$0.k()) {
            return null;
         }
      }

      cvo $$2 = this.m();
      cha $$3 = $$0.q();
      gt $$4 = $$0.a();
      dpv $$5 = $$0.q().b_($$0.a());

      for(gy $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(a, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(b, Boolean.valueOf($$5.a() == dpw.c));
            }
         }
      }

      return null;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(b) ? dpw.c.a(false) : super.c_($$0);
   }
}
