import javax.annotation.Nullable;

public class cit extends cis implements cql {
   public static final cwf a = cwe.C;
   public static final cwi b = cwe.Q;
   protected final dxj c;
   protected final dxj d;
   protected final dxj e;
   protected final dxj f;
   protected final dxj g;
   protected final dxj h;

   public cit(int $$0, int $$1, cvn.c $$2) {
      super($$2);
      this.k(this.m().a(a, Boolean.valueOf(false)).a(b, gy.b));
      this.g = cjt.a((double)$$1, 0.0, (double)$$1, (double)(16 - $$1), (double)$$0, (double)(16 - $$1));
      this.h = cjt.a((double)$$1, (double)(16 - $$0), (double)$$1, (double)(16 - $$1), 16.0, (double)(16 - $$1));
      this.c = cjt.a((double)$$1, (double)$$1, (double)(16 - $$0), (double)(16 - $$1), (double)(16 - $$1), 16.0);
      this.d = cjt.a((double)$$1, (double)$$1, 0.0, (double)(16 - $$1), (double)(16 - $$1), (double)$$0);
      this.e = cjt.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16 - $$1), (double)(16 - $$1));
      this.f = cjt.a((double)(16 - $$0), (double)$$1, (double)$$1, 16.0, (double)(16 - $$1), (double)(16 - $$1));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      gy $$4 = $$0.c(b);
      switch($$4) {
         case c:
            return this.c;
         case d:
            return this.d;
         case f:
            return this.e;
         case e:
            return this.f;
         case a:
            return this.h;
         case b:
         default:
            return this.g;
      }
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gy $$3 = $$0.c(b);
      gt $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$1 == ((gy)$$0.c(b)).g() && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cgy $$1 = $$0.q();
      gt $$2 = $$0.a();
      return this.m().a(a, Boolean.valueOf($$1.b_($$2).a() == dpw.c)).a(b, $$0.k());
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(a) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }
}
