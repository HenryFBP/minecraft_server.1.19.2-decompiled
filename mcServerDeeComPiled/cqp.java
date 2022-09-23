import javax.annotation.Nullable;

public class cqp extends clr implements cjv, cql {
   private static final cwf e = cwe.C;
   public static final cwi b = cwe.S;
   protected static final float c = 6.0F;
   protected static final dxj d = cjt.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public cqp(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, cwk.b).a(e, Boolean.valueOf(false)).a(b, gy.c));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return d;
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.a(akl.bm) || $$1.b_($$2.b()).a(dpw.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = super.a($$0);
      return $$1 != null ? a($$0.q(), $$0.a(), $$1.a(b, $$0.g().g())) : null;
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if (!$$0.k_()) {
         gt $$5 = $$1.b();
         cvo $$6 = clr.a($$0, $$5, this.m().a(a, cwk.a).a(b, (gy)$$2.c(b)));
         $$0.a($$5, $$6, 3);
      }

   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(e) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      if ($$0.c(a) == cwk.a) {
         return super.a($$0, $$1, $$2);
      } else {
         gt $$3 = $$2.c();
         cvo $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, e, b);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      if ($$3.c(clr.a) == cwk.b) {
         gt $$4 = $$2.b();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cjq.a($$0, $$1, $$2, $$3.c(b));
      } else {
         gt $$5 = $$2.c();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }

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
   public float Z_() {
      return 0.1F;
   }
}
