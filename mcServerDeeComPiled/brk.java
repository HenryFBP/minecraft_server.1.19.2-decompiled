import java.util.EnumSet;

public class brk extends bbu implements bri {
   private static final aaj<Boolean> b = aam.a(brk.class, aal.i);
   private int c = 1;

   public brk(bbr<? extends brk> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new brk.b(this);
   }

   @Override
   protected void u() {
      this.bS.a(5, new brk.d(this));
      this.bS.a(7, new brk.a(this));
      this.bS.a(7, new brk.c(this));
      this.bT.a(1, new bkh(this, buc.class, 10, true, false, $$0 -> Math.abs($$0.dh() - this.dh()) <= 4.0));
   }

   public boolean n() {
      return this.Y.a(b);
   }

   public void v(boolean $$0) {
      this.Y.b(b, $$0);
   }

   public int q() {
      return this.c;
   }

   @Override
   protected boolean Q() {
      return true;
   }

   private static boolean g(baw $$0) {
      return $$0.l() instanceof bus && $$0.m() instanceof buc;
   }

   @Override
   public boolean b(baw $$0) {
      return !g($$0) && super.b($$0);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (g($$0)) {
         super.a($$0, 1000.0F);
         return true;
      } else {
         return this.b($$0) ? false : super.a($$0, $$1);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, false);
   }

   public static bdc.a t() {
      return bce.w().a(bdd.a, 10.0).a(bdd.b, 100.0);
   }

   @Override
   public ajx cR() {
      return ajx.f;
   }

   @Override
   protected ajv r() {
      return ajw.hu;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.hw;
   }

   @Override
   protected ajv x_() {
      return ajw.hv;
   }

   @Override
   protected float eC() {
      return 5.0F;
   }

   public static boolean b(bbr<brk> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.ag() != bag.a && $$4.a(20) == 0 && a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public int fo() {
      return 1;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("ExplosionPower", (byte)this.c);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("ExplosionPower", 99)) {
         this.c = $$0.f("ExplosionPower");
      }

   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 2.6F;
   }

   static class a extends bip {
      private final brk a;

      public a(brk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.b));
      }

      @Override
      public boolean a() {
         return true;
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.G() == null) {
            dwq $$0 = this.a.dd();
            this.a.o(-((float)ami.d($$0.c, $$0.e)) * 180.0F / (float)Math.PI);
            this.a.aX = this.a.dq();
         } else {
            bcc $$1 = this.a.G();
            double $$2 = 64.0;
            if ($$1.f(this.a) < 4096.0) {
               double $$3 = $$1.df() - this.a.df();
               double $$4 = $$1.dl() - this.a.dl();
               this.a.o(-((float)ami.d($$3, $$4)) * 180.0F / (float)Math.PI);
               this.a.aX = this.a.dq();
            }
         }

      }
   }

   static class b extends bhs {
      private final brk l;
      private int m;

      public b(brk $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bhs.a.b) {
            if (this.m-- <= 0) {
               this.m += this.l.dQ().a(5) + 2;
               dwq $$0 = new dwq(this.e - this.l.df(), this.f - this.l.dh(), this.g - this.l.dl());
               double $$1 = $$0.f();
               $$0 = $$0.d();
               if (this.a($$0, ami.e($$1))) {
                  this.l.f(this.l.dd().e($$0.a(0.1)));
               } else {
                  this.k = bhs.a.a;
               }
            }

         }
      }

      private boolean a(dwq $$0, int $$1) {
         dwl $$2 = this.l.cy();

         for(int $$3 = 1; $$3 < $$1; ++$$3) {
            $$2 = $$2.c($$0);
            if (!this.l.s.a(this.l, $$2)) {
               return false;
            }
         }

         return true;
      }
   }

   static class c extends bip {
      private final brk b;
      public int a;

      public c(brk $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.G() != null;
      }

      @Override
      public void c() {
         this.a = 0;
      }

      @Override
      public void d() {
         this.b.v(false);
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         bcc $$0 = this.b.G();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.f(this.b) < 4096.0 && this.b.B($$0)) {
               cgx $$2 = this.b.s;
               ++this.a;
               if (this.a == 10 && !this.b.aM()) {
                  $$2.a(null, 1015, this.b.da(), 0);
               }

               if (this.a == 20) {
                  double $$3 = 4.0;
                  dwq $$4 = this.b.e(1.0F);
                  double $$5 = $$0.df() - (this.b.df() + $$4.c * 4.0);
                  double $$6 = $$0.e(0.5) - (0.5 + this.b.e(0.5));
                  double $$7 = $$0.dl() - (this.b.dl() + $$4.e * 4.0);
                  if (!this.b.aM()) {
                     $$2.a(null, 1016, this.b.da(), 0);
                  }

                  bus $$8 = new bus($$2, this.b, $$5, $$6, $$7, this.b.q());
                  $$8.e(this.b.df() + $$4.c * 4.0, this.b.e(0.5) + 0.5, $$8.dl() + $$4.e * 4.0);
                  $$2.b($$8);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               --this.a;
            }

            this.b.v(this.a > 10);
         }
      }
   }

   static class d extends bip {
      private final brk a;

      public d(brk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         bhs $$0 = this.a.A();
         if (!$$0.b()) {
            return true;
         } else {
            double $$1 = $$0.d() - this.a.df();
            double $$2 = $$0.e() - this.a.dh();
            double $$3 = $$0.f() - this.a.dl();
            double $$4 = $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
            return $$4 < 1.0 || $$4 > 3600.0;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         amn $$0 = this.a.dQ();
         double $$1 = this.a.df() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$2 = this.a.dh() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         double $$3 = this.a.dl() + (double)(($$0.i() * 2.0F - 1.0F) * 16.0F);
         this.a.A().a($$1, $$2, $$3, 1.0);
      }
   }
}
