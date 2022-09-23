public abstract class big extends bip {
   protected bce d;
   protected gt e = gt.b;
   protected boolean f;
   private boolean a;
   private float b;
   private float c;

   public big(bce $$0) {
      this.d = $$0;
      if (!bmk.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   protected boolean h() {
      if (!this.f) {
         return false;
      } else {
         cvo $$0 = this.d.s.a_(this.e);
         if (!($$0.b() instanceof clp)) {
            this.f = false;
            return false;
         } else {
            return $$0.c(clp.b);
         }
      }
   }

   protected void a(boolean $$0) {
      if (this.f) {
         cvo $$1 = this.d.s.a_(this.e);
         if ($$1.b() instanceof clp) {
            ((clp)$$1.b()).a(this.d, this.d.s, $$1, this.e, $$0);
         }
      }

   }

   @Override
   public boolean a() {
      if (!bmk.a(this.d)) {
         return false;
      } else if (!this.d.z) {
         return false;
      } else {
         blb $$0 = (blb)this.d.D();
         dql $$1 = $$0.j();
         if ($$1 != null && !$$1.c() && $$0.f()) {
            for(int $$2 = 0; $$2 < Math.min($$1.f() + 2, $$1.e()); ++$$2) {
               dqj $$3 = $$1.a($$2);
               this.e = new gt($$3.a, $$3.b + 1, $$3.c);
               if (!(this.d.h((double)this.e.u(), this.d.dh(), (double)this.e.w()) > 2.25)) {
                  this.f = clp.a(this.d.s, this.e);
                  if (this.f) {
                     return true;
                  }
               }
            }

            this.e = this.d.da().b();
            this.f = clp.a(this.d.s, this.e);
            return this.f;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a;
   }

   @Override
   public void c() {
      this.a = false;
      this.b = (float)((double)this.e.u() + 0.5 - this.d.df());
      this.c = (float)((double)this.e.w() + 0.5 - this.d.dl());
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      float $$0 = (float)((double)this.e.u() + 0.5 - this.d.df());
      float $$1 = (float)((double)this.e.w() + 0.5 - this.d.dl());
      float $$2 = this.b * $$0 + this.c * $$1;
      if ($$2 < 0.0F) {
         this.a = true;
      }

   }
}
