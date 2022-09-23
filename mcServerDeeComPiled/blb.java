public class blb extends blc {
   private boolean p;

   public blb(bce $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected dqn a(int $$0) {
      this.o = new dqq();
      this.o.a(true);
      return new dqn(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aw() || this.o() || this.a.bI();
   }

   @Override
   protected dwq b() {
      return new dwq(this.a.df(), (double)this.t(), this.a.dl());
   }

   @Override
   public dql a(gt $$0, int $$1) {
      if (this.b.a_($$0).h()) {
         gt $$2 = $$0.c();

         while($$2.v() > this.b.u_() && this.b.a_($$2).h()) {
            $$2 = $$2.c();
         }

         if ($$2.v() > this.b.u_()) {
            return super.a($$2.b(), $$1);
         }

         while($$2.v() < this.b.ah() && this.b.a_($$2).h()) {
            $$2 = $$2.b();
         }

         $$0 = $$2;
      }

      if (!this.b.a_($$0).d().b()) {
         return super.a($$0, $$1);
      } else {
         gt $$3 = $$0.b();

         while($$3.v() < this.b.ah() && this.b.a_($$3).d().b()) {
            $$3 = $$3.b();
         }

         return super.a($$3, $$1);
      }
   }

   @Override
   public dql a(bbn $$0, int $$1) {
      return this.a($$0.da(), $$1);
   }

   private int t() {
      if (this.a.aR() && this.q()) {
         int $$0 = this.a.dg();
         cvo $$1 = this.b.a_(new gt(this.a.df(), (double)$$0, this.a.dl()));
         int $$2 = 0;

         while($$1.a(cju.C)) {
            $$1 = this.b.a_(new gt(this.a.df(), (double)(++$$0), this.a.dl()));
            if (++$$2 > 16) {
               return this.a.dg();
            }
         }

         return $$0;
      } else {
         return ami.b(this.a.dh() + 0.5);
      }
   }

   @Override
   protected void F_() {
      super.F_();
      if (this.p) {
         if (this.b.g(new gt(this.a.df(), this.a.dh() + 0.5, this.a.dl()))) {
            return;
         }

         for(int $$0 = 0; $$0 < this.c.e(); ++$$0) {
            dqj $$1 = this.c.a($$0);
            if (this.b.g(new gt($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }

   }

   protected boolean a(dqh $$0) {
      if ($$0 == dqh.j) {
         return false;
      } else if ($$0 == dqh.i) {
         return false;
      } else {
         return $$0 != dqh.b;
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   public boolean e() {
      return this.o.d();
   }

   public void c(boolean $$0) {
      this.o.a($$0);
   }

   public boolean f() {
      return this.o.d();
   }

   public void d(boolean $$0) {
      this.p = $$0;
   }
}
