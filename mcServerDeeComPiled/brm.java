import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brm extends brq {
   protected static final int c = 80;
   private static final aaj<Boolean> b = aam.a(brm.class, aal.i);
   private static final aaj<Integer> e = aam.a(brm.class, aal.b);
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private float cb;
   @Nullable
   private bcc cc;
   private int cd;
   private boolean ce;
   @Nullable
   protected bjl d;

   public brm(bbr<? extends brm> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 10;
      this.a(dqh.j, 0.0F);
      this.bP = new brm.c(this);
      this.bX = this.R.i();
      this.bY = this.bX;
   }

   @Override
   protected void u() {
      bjd $$0 = new bjd(this, 1.0);
      this.d = new bjl(this, 1.0, 80);
      this.bS.a(4, new brm.a(this));
      this.bS.a(5, $$0);
      this.bS.a(7, this.d);
      this.bS.a(8, new bix(this, buc.class, 8.0F));
      this.bS.a(8, new bix(this, brm.class, 12.0F, 0.01F));
      this.bS.a(9, new bjk(this));
      this.d.a(EnumSet.of(bip.a.a, bip.a.b));
      $$0.a(EnumSet.of(bip.a.a, bip.a.b));
      this.bT.a(1, new bkh(this, bcc.class, 10, true, false, new brm.b(this)));
   }

   public static bdc.a fJ() {
      return brq.fO().a(bdd.f, 6.0).a(bdd.d, 0.5).a(bdd.b, 16.0).a(bdd.a, 30.0);
   }

   @Override
   protected blc a(cgx $$0) {
      return new ble(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, false);
      this.Y.a(e, 0);
   }

   @Override
   public boolean dB() {
      return true;
   }

   @Override
   public bch ey() {
      return bch.e;
   }

   public boolean fK() {
      return this.Y.a(b);
   }

   void v(boolean $$0) {
      this.Y.b(b, $$0);
   }

   public int q() {
      return 80;
   }

   void a(int $$0) {
      this.Y.b(e, $$0);
   }

   public boolean fL() {
      return this.Y.a(e) != 0;
   }

   @Nullable
   public bcc fM() {
      if (!this.fL()) {
         return null;
      } else if (this.s.y) {
         if (this.cc != null) {
            return this.cc;
         } else {
            bbn $$0 = this.s.a(this.Y.a(e));
            if ($$0 instanceof bcc) {
               this.cc = (bcc)$$0;
               return this.cc;
            } else {
               return null;
            }
         }
      } else {
         return this.G();
      }
   }

   @Override
   public void a(aaj<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.cd = 0;
         this.cc = null;
      }

   }

   @Override
   public int J() {
      return 160;
   }

   @Override
   protected ajv r() {
      return this.aU() ? ajw.iA : ajw.iB;
   }

   @Override
   protected ajv c(baw $$0) {
      return this.aU() ? ajw.iG : ajw.iH;
   }

   @Override
   protected ajv x_() {
      return this.aU() ? ajw.iD : ajw.iE;
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.c;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return $$1.b_($$0).a(akp.a) ? 10.0F + $$1.z($$0) : super.a($$0, $$1);
   }

   @Override
   public void w_() {
      if (this.bo()) {
         if (this.s.y) {
            this.bY = this.bX;
            if (!this.aR()) {
               this.bZ = 2.0F;
               dwq $$0 = this.dd();
               if ($$0.d > 0.0 && this.ce && !this.aM()) {
                  this.s.a(this.df(), this.dh(), this.dl(), this.t(), this.cR(), 1.0F, 1.0F, false);
               }

               this.ce = $$0.d < 0.0 && this.s.a(this.da().c(), this);
            } else if (this.fK()) {
               if (this.bZ < 0.5F) {
                  this.bZ = 4.0F;
               } else {
                  this.bZ += (0.5F - this.bZ) * 0.1F;
               }
            } else {
               this.bZ += (0.125F - this.bZ) * 0.2F;
            }

            this.bX += this.bZ;
            this.cb = this.ca;
            if (!this.aU()) {
               this.ca = this.R.i();
            } else if (this.fK()) {
               this.ca += (0.0F - this.ca) * 0.25F;
            } else {
               this.ca += (1.0F - this.ca) * 0.06F;
            }

            if (this.fK() && this.aR()) {
               dwq $$1 = this.e(0.0F);

               for(int $$2 = 0; $$2 < 2; ++$$2) {
                  this.s.a(io.e, this.d(0.5) - $$1.c * 1.5, this.di() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.fL()) {
               if (this.cd < this.q()) {
                  ++this.cd;
               }

               bcc $$3 = this.fM();
               if ($$3 != null) {
                  this.z().a($$3, 90.0F, 90.0F);
                  this.z().a();
                  double $$4 = (double)this.A(0.0F);
                  double $$5 = $$3.df() - this.df();
                  double $$6 = $$3.e(0.5) - this.dj();
                  double $$7 = $$3.dl() - this.dl();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.R.j();

                  while($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.R.j() * (1.7 - $$4);
                     this.s.a(io.e, this.df() + $$5 * $$9, this.dj() + $$6 * $$9, this.dl() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.aU()) {
            this.i(300);
         } else if (this.y) {
            this.f(this.dd().b((double)((this.R.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.R.i() * 2.0F - 1.0F) * 0.4F)));
            this.o(this.R.i() * 360.0F);
            this.y = false;
            this.af = true;
         }

         if (this.fL()) {
            this.o(this.aZ);
         }
      }

      super.w_();
   }

   protected ajv t() {
      return ajw.iF;
   }

   public float y(float $$0) {
      return ami.i($$0, this.bY, this.bX);
   }

   public float z(float $$0) {
      return ami.i($$0, this.cb, this.ca);
   }

   public float A(float $$0) {
      return ((float)this.cd + $$0) / (float)this.q();
   }

   @Override
   public boolean a(cha $$0) {
      return $$0.f(this);
   }

   public static boolean b(bbr<? extends brm> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return ($$4.a(20) == 0 || !$$1.y($$3)) && $$1.ag() != bag.a && ($$2 == bcg.c || $$1.b_($$3).a(akp.a)) && $$1.b_($$3.c()).a(akp.a);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (!this.fK() && !$$0.z() && $$0.l() instanceof bcc $$2 && !$$0.d()) {
         $$2.a(baw.a((bbn)this), 2.0F);
      }

      if (this.d != null) {
         this.d.i();
      }

      return super.a($$0, $$1);
   }

   @Override
   public int U() {
      return 180;
   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() && this.aR()) {
         this.a(0.1F, $$0);
         this.a(bci.a, this.dd());
         this.f(this.dd().a(0.9));
         if (!this.fK() && this.G() == null) {
            this.f(this.dd().b(0.0, -0.005, 0.0));
         }
      } else {
         super.g($$0);
      }

   }

   static class a extends bip {
      private final brm a;
      private int b;
      private final boolean c;

      public a(brm $$0) {
         this.a = $$0;
         this.c = $$0 instanceof brf;
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean a() {
         bcc $$0 = this.a.G();
         return $$0 != null && $$0.bo();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.G() != null && this.a.f((bbn)this.a.G()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.D().n();
         bcc $$0 = this.a.G();
         if ($$0 != null) {
            this.a.z().a($$0, 90.0F, 90.0F);
         }

         this.a.af = true;
      }

      @Override
      public void d() {
         this.a.a(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         bcc $$0 = this.a.G();
         if ($$0 != null) {
            this.a.D().n();
            this.a.z().a($$0, 90.0F, 90.0F);
            if (!this.a.B($$0)) {
               this.a.h(null);
            } else {
               ++this.b;
               if (this.b == 0) {
                  this.a.a($$0.ae());
                  if (!this.a.aM()) {
                     this.a.s.a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.q()) {
                  float $$1 = 1.0F;
                  if (this.a.s.ag() == bag.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(baw.c(this.a, this.a), $$1);
                  $$0.a(baw.c(this.a), (float)this.a.b(bdd.f));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bcc> {
      private final brm a;

      public b(brm $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bcc $$0) {
         return ($$0 instanceof buc || $$0 instanceof bod || $$0 instanceof bol) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bhs {
      private final brm l;

      public c(brm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bhs.a.b && !this.l.D().l()) {
            dwq $$0 = new dwq(this.e - this.l.df(), this.f - this.l.dh(), this.g - this.l.dl());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ami.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.o(this.a(this.l.dq(), $$5, 90.0F));
            this.l.aX = this.l.dq();
            float $$6 = (float)(this.h * this.l.b(bdd.d));
            float $$7 = ami.i(0.125F, this.l.eK(), $$6);
            this.l.r($$7);
            double $$8 = Math.sin((double)(this.l.S + this.l.ae()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dq() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dq() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.S + this.l.ae()) * 0.75) * 0.05;
            this.l.f(this.l.dd().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bhr $$12 = this.l.z();
            double $$13 = this.l.df() + $$2 * 2.0;
            double $$14 = this.l.dj() + $$3 / $$1;
            double $$15 = this.l.dl() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.z().a(ami.d(0.125, $$16, $$13), ami.d(0.125, $$17, $$14), ami.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.v(true);
         } else {
            this.l.r(0.0F);
            this.l.v(false);
         }
      }
   }
}
