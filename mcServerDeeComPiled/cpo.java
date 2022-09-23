import javax.annotation.Nullable;

public class cpo extends cpn {
   public static final cwi e = cnf.aD;
   public static final cwf f = cpn.a;

   protected cpo(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(e, gy.c).a(f, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return csh.h($$0);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return cju.cb.a($$0, $$1, $$2);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return cju.cb.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = cju.cb.a($$0);
      return $$1 == null ? null : this.m().a(e, (gy)$$1.c(e));
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(f)) {
         gy $$4 = ((gy)$$0.c(e)).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(this.i, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cgx $$0, gt $$1, cvo $$2) {
      gy $$3 = ((gy)$$2.c(e)).g();
      return $$0.a($$1.a($$3), $$3);
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(f) && $$0.c(e) != $$3 ? 15 : 0;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return cju.cb.a($$0, $$1);
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return cju.cb.a($$0, $$1);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(e, f);
   }
}
