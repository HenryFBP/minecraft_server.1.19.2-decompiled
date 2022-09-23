import java.util.EnumSet;
import javax.annotation.Nullable;

public class bse extends brq {
   public static final float b = 45.836624F;
   public static final int c = ami.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aaj<Byte> d = aam.a(bse.class, aal.a);
   private static final int e = 1;
   @Nullable
   bce bX;
   @Nullable
   private gt bY;
   private boolean bZ;
   private int ca;

   public bse(bbr<? extends bse> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bse.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aL() {
      return this.S % c == 0;
   }

   @Override
   public void a(bci $$0, dwq $$1) {
      super.a($$0, $$1);
      this.aJ();
   }

   @Override
   public void k() {
      this.Q = true;
      super.k();
      this.Q = false;
      this.e(true);
      if (this.bZ && --this.ca <= 0) {
         this.ca = 20;
         this.a(baw.i, 1.0F);
      }

   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(0, new bij(this));
      this.bS.a(4, new bse.a());
      this.bS.a(8, new bse.d());
      this.bS.a(9, new bix(this, buc.class, 3.0F, 1.0F));
      this.bS.a(10, new bix(this, bce.class, 8.0F));
      this.bT.a(1, new bkg(this, bvk.class).a());
      this.bT.a(2, new bse.b(this));
      this.bT.a(3, new bkh(this, buc.class, true));
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.a, 14.0).a(bdd.f, 4.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(d, (byte)0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bY = new gt($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.a($$0.h("LifeTicks"));
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.bY != null) {
         $$0.a("BoundX", this.bY.u());
         $$0.a("BoundY", this.bY.v());
         $$0.a("BoundZ", this.bY.w());
      }

      if (this.bZ) {
         $$0.a("LifeTicks", this.ca);
      }

   }

   @Nullable
   public bce q() {
      return this.bX;
   }

   @Nullable
   public gt t() {
      return this.bY;
   }

   public void g(@Nullable gt $$0) {
      this.bY = $$0;
   }

   private boolean b(int $$0) {
      int $$1 = this.Y.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.Y.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.Y.b(d, (byte)($$2 & 0xFF));
   }

   public boolean fJ() {
      return this.b(1);
   }

   public void v(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bce $$0) {
      this.bX = $$0;
   }

   public void a(int $$0) {
      this.bZ = true;
      this.ca = $$0;
   }

   @Override
   protected ajv r() {
      return ajw.vB;
   }

   @Override
   protected ajv x_() {
      return ajw.vD;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.vE;
   }

   @Override
   public float bg() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      this.a(bbs.a, new cax(caz.nw));
      this.a(bbs.a, 0.0F);
   }

   class a extends bip {
      public a() {
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         bcc $$0 = bse.this.G();
         if ($$0 != null && $$0.bo() && !bse.this.A().b() && bse.this.R.a(b(7)) == 0) {
            return bse.this.f($$0) > 4.0;
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return bse.this.A().b() && bse.this.fJ() && bse.this.G() != null && bse.this.G().bo();
      }

      @Override
      public void c() {
         bcc $$0 = bse.this.G();
         if ($$0 != null) {
            dwq $$1 = $$0.bj();
            bse.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         bse.this.v(true);
         bse.this.a(ajw.vC, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         bse.this.v(false);
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         bcc $$0 = bse.this.G();
         if ($$0 != null) {
            if (bse.this.cy().c($$0.cy())) {
               bse.this.z($$0);
               bse.this.v(false);
            } else {
               double $$1 = bse.this.f($$0);
               if ($$1 < 9.0) {
                  dwq $$2 = $$0.bj();
                  bse.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }

         }
      }
   }

   class b extends bko {
      private final bmf b = bmf.b().d().e();

      public b(bcl $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return bse.this.bX != null && bse.this.bX.G() != null && this.a(bse.this.bX.G(), this.b);
      }

      @Override
      public void c() {
         bse.this.h(bse.this.bX.G());
         super.c();
      }
   }

   class c extends bhs {
      public c(bse $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bhs.a.b) {
            dwq $$0 = new dwq(this.e - bse.this.df(), this.f - bse.this.dh(), this.g - bse.this.dl());
            double $$1 = $$0.f();
            if ($$1 < bse.this.cy().a()) {
               this.k = bhs.a.a;
               bse.this.f(bse.this.dd().a(0.5));
            } else {
               bse.this.f(bse.this.dd().e($$0.a(this.h * 0.05 / $$1)));
               if (bse.this.G() == null) {
                  dwq $$2 = bse.this.dd();
                  bse.this.o(-((float)ami.d($$2.c, $$2.e)) * 180.0F / (float)Math.PI);
                  bse.this.aX = bse.this.dq();
               } else {
                  double $$3 = bse.this.G().df() - bse.this.df();
                  double $$4 = bse.this.G().dl() - bse.this.dl();
                  bse.this.o(-((float)ami.d($$3, $$4)) * 180.0F / (float)Math.PI);
                  bse.this.aX = bse.this.dq();
               }
            }

         }
      }
   }

   class d extends bip {
      public d() {
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         return !bse.this.A().b() && bse.this.R.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         gt $$0 = bse.this.t();
         if ($$0 == null) {
            $$0 = bse.this.da();
         }

         for(int $$1 = 0; $$1 < 3; ++$$1) {
            gt $$2 = $$0.b(bse.this.R.a(15) - 7, bse.this.R.a(11) - 5, bse.this.R.a(15) - 7);
            if (bse.this.s.x($$2)) {
               bse.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (bse.this.G() == null) {
                  bse.this.z().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }

      }
   }
}
