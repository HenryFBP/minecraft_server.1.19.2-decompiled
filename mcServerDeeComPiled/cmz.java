public abstract class cmz extends cmx implements cjv {
   public static final cwo d = cwe.ax;
   public static final int e = 25;
   private final double f;

   protected cmz(cvn.c $$0, gy $$1, dxj $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.f = $$4;
      this.k(this.D.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public cvo a(cgy $$0) {
      return this.m().a(d, Integer.valueOf($$0.r_().a(25)));
   }

   @Override
   public boolean e_(cvo $$0) {
      return $$0.c(d) < 25;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(d) < 25 && $$3.j() < this.f) {
         gt $$4 = $$2.a(this.a);
         if (this.g($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.w));
         }
      }

   }

   protected cvo a(cvo $$0, amn $$1) {
      return $$0.a(d);
   }

   public cvo n(cvo $$0) {
      return $$0.a(d, Integer.valueOf(25));
   }

   public boolean o(cvo $$0) {
      return $$0.c(d) == 25;
   }

   protected cvo a(cvo $$0, cvo $$1) {
      return $$1;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, dpw.c, dpw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return this.g($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      gt $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(d) + 1, 25);
      int $$6 = this.a($$1);

      for(int $$7 = 0; $$7 < $$6 && this.g($$0.a_($$4)); ++$$7) {
         $$0.b($$4, $$3.a(d, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }

   }

   protected abstract int a(amn var1);

   protected abstract boolean g(cvo var1);

   @Override
   protected cmz c() {
      return this;
   }
}
