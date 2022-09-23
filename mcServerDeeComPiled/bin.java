import java.util.EnumSet;

public class bin extends bip {
   public static final int a = 12;
   private static final int b = 2;
   private static final int c = 3;
   private static final int d = 1;
   private final bcw e;
   private bcc f;
   private final cha g;
   private final double h;
   private final blc i;
   private int j;
   private final float k;
   private final float l;
   private float m;
   private final boolean n;

   public bin(bcw $$0, double $$1, float $$2, float $$3, boolean $$4) {
      this.e = $$0;
      this.g = $$0.s;
      this.h = $$1;
      this.i = $$0.D();
      this.l = $$2;
      this.k = $$3;
      this.n = $$4;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
      if (!($$0.D() instanceof blb) && !($$0.D() instanceof bla)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean a() {
      bcc $$0 = this.e.fK();
      if ($$0 == null) {
         return false;
      } else if ($$0.B_()) {
         return false;
      } else if (this.e.fL()) {
         return false;
      } else if (this.e.f((bbn)$$0) < (double)(this.l * this.l)) {
         return false;
      } else {
         this.f = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (this.i.l()) {
         return false;
      } else if (this.e.fL()) {
         return false;
      } else {
         return !(this.e.f((bbn)this.f) <= (double)(this.k * this.k));
      }
   }

   @Override
   public void c() {
      this.j = 0;
      this.m = this.e.a(dqh.j);
      this.e.a(dqh.j, 0.0F);
   }

   @Override
   public void d() {
      this.f = null;
      this.i.n();
      this.e.a(dqh.j, this.m);
   }

   @Override
   public void e() {
      this.e.z().a(this.f, 10.0F, (float)this.e.U());
      if (--this.j <= 0) {
         this.j = this.a(10);
         if (!this.e.fy() && !this.e.bI()) {
            if (this.e.f((bbn)this.f) >= 144.0) {
               this.h();
            } else {
               this.i.a(this.f, this.h);
            }

         }
      }
   }

   private void h() {
      gt $$0 = this.f.da();

      for(int $$1 = 0; $$1 < 10; ++$$1) {
         int $$2 = this.a(-3, 3);
         int $$3 = this.a(-1, 1);
         int $$4 = this.a(-3, 3);
         boolean $$5 = this.a($$0.u() + $$2, $$0.v() + $$3, $$0.w() + $$4);
         if ($$5) {
            return;
         }
      }

   }

   private boolean a(int $$0, int $$1, int $$2) {
      if (Math.abs((double)$$0 - this.f.df()) < 2.0 && Math.abs((double)$$2 - this.f.dl()) < 2.0) {
         return false;
      } else if (!this.a(new gt($$0, $$1, $$2))) {
         return false;
      } else {
         this.e.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.e.dq(), this.e.ds());
         this.i.n();
         return true;
      }
   }

   private boolean a(gt $$0) {
      dqh $$1 = dqq.a(this.g, $$0.i());
      if ($$1 != dqh.c) {
         return false;
      } else {
         cvo $$2 = this.g.a_($$0.c());
         if (!this.n && $$2.b() instanceof cnt) {
            return false;
         } else {
            gt $$3 = $$0.b(this.e.da());
            return this.g.a(this.e, this.e.cy().a($$3));
         }
      }
   }

   private int a(int $$0, int $$1) {
      return this.e.dQ().a($$1 - $$0 + 1) + $$0;
   }
}
