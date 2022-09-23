import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bqj extends brq implements bcp, bru {
   private static final aaj<Integer> b = aam.a(bqj.class, aal.b);
   private static final aaj<Integer> c = aam.a(bqj.class, aal.b);
   private static final aaj<Integer> d = aam.a(bqj.class, aal.b);
   private static final List<aaj<Integer>> e = ImmutableList.of(b, c, d);
   private static final aaj<Integer> bX = aam.a(bqj.class, aal.b);
   private static final int bY = 220;
   private final float[] bZ = new float[2];
   private final float[] ca = new float[2];
   private final float[] cb = new float[2];
   private final float[] cc = new float[2];
   private final int[] cd = new int[2];
   private final int[] ce = new int[2];
   private int cf;
   private final agd cg = (agd)new agd(this.C_(), azz.a.f, azz.b.a).a(true);
   private static final Predicate<bcc> ch = $$0 -> $$0.ey() != bch.b && $$0.ff();
   private static final bmf ci = bmf.a().a(20.0).a(ch);

   public bqj(bbr<? extends bqj> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bhp(this, 10, false);
      this.c(this.et());
      this.bN = 50;
   }

   @Override
   protected blc a(cgx $$0) {
      bla $$1 = new bla(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void u() {
      this.bS.a(0, new bqj.a());
      this.bS.a(2, new bjn(this, 1.0, 40, 20.0F));
      this.bS.a(5, new bka(this, 1.0));
      this.bS.a(6, new bix(this, buc.class, 8.0F));
      this.bS.a(7, new bjk(this));
      this.bT.a(1, new bkg(this));
      this.bT.a(2, new bkh(this, bcc.class, 0, false, false, ch));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, 0);
      this.Y.a(c, 0);
      this.Y.a(d, 0);
      this.Y.a(bX, 0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Invul", this.t());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.c($$0.h("Invul"));
      if (this.Y()) {
         this.cg.a(this.C_());
      }

   }

   @Override
   public void b(@Nullable rq $$0) {
      super.b($$0);
      this.cg.a(this.C_());
   }

   @Override
   protected ajv r() {
      return ajw.xb;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.xe;
   }

   @Override
   protected ajv x_() {
      return ajw.xd;
   }

   @Override
   public void w_() {
      dwq $$0 = this.dd().d(1.0, 0.6, 1.0);
      if (!this.s.y && this.s(0) > 0) {
         bbn $$1 = this.s.a(this.s(0));
         if ($$1 != null) {
            double $$2 = $$0.d;
            if (this.dh() < $$1.dh() || !this.a() && this.dh() < $$1.dh() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new dwq($$0.c, $$2, $$0.e);
            dwq $$3 = new dwq($$1.df() - this.df(), 0.0, $$1.dl() - this.dl());
            if ($$3.i() > 9.0) {
               dwq $$4 = $$3.d();
               $$0 = $$0.b($$4.c * 0.3 - $$0.c * 0.6, 0.0, $$4.e * 0.3 - $$0.e * 0.6);
            }
         }
      }

      this.f($$0);
      if ($$0.i() > 0.05) {
         this.o((float)ami.d($$0.e, $$0.c) * 180.0F / (float)Math.PI - 90.0F);
      }

      super.w_();

      for(int $$5 = 0; $$5 < 2; ++$$5) {
         this.cc[$$5] = this.ca[$$5];
         this.cb[$$5] = this.bZ[$$5];
      }

      for(int $$6 = 0; $$6 < 2; ++$$6) {
         int $$7 = this.s($$6 + 1);
         bbn $$8 = null;
         if ($$7 > 0) {
            $$8 = this.s.a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.t($$6 + 1);
            double $$10 = this.u($$6 + 1);
            double $$11 = this.v($$6 + 1);
            double $$12 = $$8.df() - $$9;
            double $$13 = $$8.dj() - $$10;
            double $$14 = $$8.dl() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(ami.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(ami.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.bZ[$$6] = this.a(this.bZ[$$6], $$17, 40.0F);
            this.ca[$$6] = this.a(this.ca[$$6], $$16, 10.0F);
         } else {
            this.ca[$$6] = this.a(this.ca[$$6], this.aX, 10.0F);
         }
      }

      boolean $$18 = this.a();

      for(int $$19 = 0; $$19 < 3; ++$$19) {
         double $$20 = this.t($$19);
         double $$21 = this.u($$19);
         double $$22 = this.v($$19);
         this.s.a(io.Y, $$20 + this.R.k() * 0.3F, $$21 + this.R.k() * 0.3F, $$22 + this.R.k() * 0.3F, 0.0, 0.0, 0.0);
         if ($$18 && this.s.w.a(4) == 0) {
            this.s.a(io.v, $$20 + this.R.k() * 0.3F, $$21 + this.R.k() * 0.3F, $$22 + this.R.k() * 0.3F, 0.7F, 0.7F, 0.5);
         }
      }

      if (this.t() > 0) {
         for(int $$23 = 0; $$23 < 3; ++$$23) {
            this.s.a(io.v, this.df() + this.R.k(), this.dh() + (double)(this.R.i() * 3.3F), this.dl() + this.R.k(), 0.7F, 0.7F, 0.9F);
         }
      }

   }

   @Override
   protected void T() {
      if (this.t() > 0) {
         int $$0 = this.t() - 1;
         this.cg.a(1.0F - (float)$$0 / 220.0F);
         if ($$0 <= 0) {
            cgp.a $$1 = this.s.W().b(cgt.c) ? cgp.a.c : cgp.a.a;
            this.s.a(this, this.df(), this.dj(), this.dl(), 7.0F, false, $$1);
            if (!this.aM()) {
               this.s.b(1023, this.da(), 0);
            }
         }

         this.c($$0);
         if (this.S % 10 == 0) {
            this.b(10.0F);
         }

      } else {
         super.T();

         for(int $$2 = 1; $$2 < 3; ++$$2) {
            if (this.S >= this.cd[$$2 - 1]) {
               this.cd[$$2 - 1] = this.S + 10 + this.R.a(10);
               if ((this.s.ag() == bag.c || this.s.ag() == bag.d) && this.ce[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = ami.a(this.R, this.df() - 10.0, this.df() + 10.0);
                  double $$6 = ami.a(this.R, this.dh() - 5.0, this.dh() + 5.0);
                  double $$7 = ami.a(this.R, this.dl() - 10.0, this.dl() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.ce[$$2 - 1] = 0;
               }

               int $$8 = this.s($$2);
               if ($$8 > 0) {
                  bcc $$9 = (bcc)this.s.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.f((bbn)$$9) > 900.0) && this.B($$9)) {
                     this.a($$2 + 1, $$9);
                     this.cd[$$2 - 1] = this.S + 40 + this.R.a(20);
                     this.ce[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<bcc> $$10 = this.s.a(bcc.class, ci, this, this.cy().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     bcc $$11 = (bcc)$$10.get(this.R.a($$10.size()));
                     this.a($$2, $$11.ae());
                  }
               }
            }
         }

         if (this.G() != null) {
            this.a(0, this.G().ae());
         } else {
            this.a(0, 0);
         }

         if (this.cf > 0) {
            --this.cf;
            if (this.cf == 0 && this.s.W().b(cgt.c)) {
               int $$12 = ami.b(this.dh());
               int $$13 = ami.b(this.df());
               int $$14 = ami.b(this.dl());
               boolean $$15 = false;

               for(int $$16 = -1; $$16 <= 1; ++$$16) {
                  for(int $$17 = -1; $$17 <= 1; ++$$17) {
                     for(int $$18 = 0; $$18 <= 3; ++$$18) {
                        int $$19 = $$13 + $$16;
                        int $$20 = $$12 + $$18;
                        int $$21 = $$14 + $$17;
                        gt $$22 = new gt($$19, $$20, $$21);
                        cvo $$23 = this.s.a_($$22);
                        if (c($$23)) {
                           $$15 = this.s.a($$22, true, this) || $$15;
                        }
                     }
                  }
               }

               if ($$15) {
                  this.s.a(null, 1022, this.da(), 0);
               }
            }
         }

         if (this.S % 20 == 0) {
            this.b(1.0F);
         }

         this.cg.a(this.ef() / this.et());
      }
   }

   public static boolean c(cvo $$0) {
      return !$$0.h() && !$$0.a(akl.av);
   }

   @Override
   public void n() {
      this.c(220);
      this.cg.a(0.0F);
      this.c(this.et() / 3.0F);
   }

   @Override
   public void a(cvo $$0, dwq $$1) {
   }

   @Override
   public void c(agh $$0) {
      super.c($$0);
      this.cg.a($$0);
   }

   @Override
   public void d(agh $$0) {
      super.d($$0);
      this.cg.b($$0);
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.df();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ami.b($$1);
         return this.df() + (double)$$2 * 1.3;
      }
   }

   private double u(int $$0) {
      return $$0 <= 0 ? this.dh() + 3.0 : this.dh() + 2.2;
   }

   private double v(int $$0) {
      if ($$0 <= 0) {
         return this.dl();
      } else {
         float $$1 = (this.aX + (float)(180 * ($$0 - 1))) * (float) (Math.PI / 180.0);
         float $$2 = ami.a($$1);
         return this.dl() + (double)$$2 * 1.3;
      }
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ami.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   private void a(int $$0, bcc $$1) {
      this.a($$0, $$1.df(), $$1.dh() + (double)$$1.cA() * 0.5, $$1.dl(), $$0 == 0 && this.R.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.aM()) {
         this.s.a(null, 1024, this.da(), 0);
      }

      double $$5 = this.t($$0);
      double $$6 = this.u($$0);
      double $$7 = this.v($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      bvh $$11 = new bvh(this.s, this, $$8, $$9, $$10);
      $$11.b(this);
      if ($$4) {
         $$11.a(true);
      }

      $$11.o($$5, $$6, $$7);
      this.s.b($$11);
   }

   @Override
   public void a(bcc $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0 == baw.h || $$0.m() instanceof bqj) {
         return false;
      } else if (this.t() > 0 && $$0 != baw.m) {
         return false;
      } else {
         if (this.a()) {
            bbn $$2 = $$0.l();
            if ($$2 instanceof bui) {
               return false;
            }
         }

         bbn $$3 = $$0.m();
         if ($$3 != null && !($$3 instanceof buc) && $$3 instanceof bcc && ((bcc)$$3).ey() == this.ey()) {
            return false;
         } else {
            if (this.cf <= 0) {
               this.cf = 20;
            }

            for(int $$4 = 0; $$4 < this.ce.length; ++$$4) {
               this.ce[$$4] += 3;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void a(baw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bqv $$3 = this.a(caz.so);
      if ($$3 != null) {
         $$3.u();
      }

   }

   @Override
   public void dm() {
      if (this.s.ag() == bag.a && this.Q()) {
         this.ah();
      } else {
         this.bf = 0;
      }
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   public boolean b(bbg $$0, @Nullable bbn $$1) {
      return false;
   }

   public static bdc.a q() {
      return brq.fO().a(bdd.a, 300.0).a(bdd.d, 0.6F).a(bdd.e, 0.6F).a(bdd.b, 40.0).a(bdd.i, 4.0);
   }

   public float a(int $$0) {
      return this.ca[$$0];
   }

   public float b(int $$0) {
      return this.bZ[$$0];
   }

   public int t() {
      return this.Y.a(bX);
   }

   public void c(int $$0) {
      this.Y.b(bX, $$0);
   }

   public int s(int $$0) {
      return this.Y.a((aaj)e.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.Y.b((aaj)e.get($$0), $$1);
   }

   @Override
   public boolean a() {
      return this.ef() <= this.et() / 2.0F;
   }

   @Override
   public bch ey() {
      return bch.b;
   }

   @Override
   protected boolean l(bbn $$0) {
      return false;
   }

   @Override
   public boolean ck() {
      return false;
   }

   @Override
   public boolean c(bbg $$0) {
      return $$0.b() == bbi.t ? false : super.c($$0);
   }

   class a extends bip {
      public a() {
         this.a(EnumSet.of(bip.a.a, bip.a.c, bip.a.b));
      }

      @Override
      public boolean a() {
         return bqj.this.t() > 0;
      }
   }
}
