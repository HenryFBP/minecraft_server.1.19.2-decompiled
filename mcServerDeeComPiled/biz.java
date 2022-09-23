import java.util.EnumSet;

public class biz extends bip {
   protected final bcl a;
   private final double b;
   private final boolean c;
   private dql d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public biz(bcl $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
   }

   @Override
   public boolean a() {
      long $$0 = this.a.s.U();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         bcc $$1 = this.a.G();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bo()) {
            return false;
         } else {
            this.d = this.a.D().a($$1, 0);
            if (this.d != null) {
               return true;
            } else {
               return this.a($$1) >= this.a.h($$1.df(), $$1.dh(), $$1.dl());
            }
         }
      }
   }

   @Override
   public boolean b() {
      bcc $$0 = this.a.G();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bo()) {
         return false;
      } else if (!this.c) {
         return !this.a.D().l();
      } else if (!this.a.a($$0.da())) {
         return false;
      } else {
         return !($$0 instanceof buc) || !$$0.B_() && !((buc)$$0).f();
      }
   }

   @Override
   public void c() {
      this.a.D().a(this.d, this.b);
      this.a.u(true);
      this.h = 0;
      this.i = 0;
   }

   @Override
   public void d() {
      bcc $$0 = this.a.G();
      if (!bbq.e.test($$0)) {
         this.a.h(null);
      }

      this.a.u(false);
      this.a.D().n();
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      bcc $$0 = this.a.G();
      if ($$0 != null) {
         this.a.z().a($$0, 30.0F, 30.0F);
         double $$1 = this.a.h($$0.df(), $$0.dh(), $$0.dl());
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.E().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.h(this.e, this.f, this.g) >= 1.0 || this.a.dQ().i() < 0.05F)) {
            this.e = $$0.df();
            this.f = $$0.dh();
            this.g = $$0.dl();
            this.h = 4 + this.a.dQ().a(7);
            if ($$1 > 1024.0) {
               this.h += 10;
            } else if ($$1 > 256.0) {
               this.h += 5;
            }

            if (!this.a.D().a($$0, this.b)) {
               this.h += 15;
            }

            this.h = this.a(this.h);
         }

         this.i = Math.max(this.i - 1, 0);
         this.a($$0, $$1);
      }
   }

   protected void a(bcc $$0, double $$1) {
      double $$2 = this.a($$0);
      if ($$1 <= $$2 && this.i <= 0) {
         this.h();
         this.a.a(bai.a);
         this.a.z($$0);
      }

   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }

   protected double a(bcc $$0) {
      return (double)(this.a.cW() * 2.0F * this.a.cW() * 2.0F + $$0.cW());
   }
}
