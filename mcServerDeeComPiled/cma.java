import javax.annotation.Nullable;

public class cma extends cin<ctx> implements cql {
   public static final cwi b = cnf.aD;
   public static final cwf c = cwe.C;
   protected static final dxj d = cjt.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final rq e = rq.c("container.enderchest");

   protected cma(cvn.c $$0) {
      super($$0, () -> ctk.d);
      this.k(this.D.b().a(b, gy.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public clq.c<? extends ctn> a(cvo $$0, cgx $$1, gt $$2, boolean $$3) {
      return clq.b::b;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return d;
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.b;
   }

   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      return this.m().a(b, $$0.g().g()).a(c, Boolean.valueOf($$1.a() == dpw.c));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      bxu $$6 = $$3.fO();
      cti $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof ctx) {
         gt $$8 = $$2.b();
         if ($$1.a_($$8).g($$1, $$8)) {
            return baj.a($$1.y);
         } else if ($$1.y) {
            return baj.a;
         } else {
            ctx $$9 = (ctx)$$7;
            $$6.a($$9);
            $$3.a(new bap(($$1x, $$2x, $$3x) -> bwt.a($$1x, $$2x, $$6), e));
            $$3.a(akg.aj);
            bst.a($$3, true);
            return baj.b;
         }
      } else {
         return baj.a($$1.y);
      }
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return $$0.y ? a($$2, ctk.d, ctx::a) : null;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      for(int $$4 = 0; $$4 < 3; ++$$4) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(io.W, $$7, $$8, $$9, $$10, $$11, $$12);
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
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(c) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      cti $$4 = $$1.c_($$2);
      if ($$4 instanceof ctx) {
         ((ctx)$$4).c();
      }

   }
}
