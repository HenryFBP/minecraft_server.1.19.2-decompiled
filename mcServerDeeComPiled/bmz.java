import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class bmz extends bmy {
   public static final float b = 74.48451F;
   public static final int c = ami.f(2.4166098F);
   private static final aaj<Byte> d = aam.a(bmz.class, aal.a);
   private static final int e = 1;
   private static final bmf bW = bmf.b().a(4.0);
   @Nullable
   private gt bX;

   public bmz(bbr<? extends bmz> $$0, cgx $$1) {
      super($$0, $$1);
      this.v(true);
   }

   @Override
   public boolean aL() {
      return !this.q() && this.S % c == 0;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(d, (byte)0);
   }

   @Override
   protected float eC() {
      return 0.1F;
   }

   @Override
   public float eD() {
      return super.eD() * 0.95F;
   }

   @Nullable
   @Override
   public ajv r() {
      return this.q() && this.R.a(4) != 0 ? null : ajw.ba;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.bc;
   }

   @Override
   protected ajv x_() {
      return ajw.bb;
   }

   @Override
   public boolean bl() {
      return false;
   }

   @Override
   protected void A(bbn $$0) {
   }

   @Override
   protected void eN() {
   }

   public static bdc.a n() {
      return bce.w().a(bdd.a, 6.0);
   }

   public boolean q() {
      return (this.Y.a(d) & 1) != 0;
   }

   public void v(boolean $$0) {
      byte $$1 = this.Y.a(d);
      if ($$0) {
         this.Y.b(d, (byte)($$1 | 1));
      } else {
         this.Y.b(d, (byte)($$1 & -2));
      }

   }

   @Override
   public void k() {
      super.k();
      if (this.q()) {
         this.f(dwq.b);
         this.o(this.df(), (double)ami.b(this.dh()) + 1.0 - (double)this.cX(), this.dl());
      } else {
         this.f(this.dd().d(1.0, 0.6, 1.0));
      }

   }

   @Override
   protected void T() {
      super.T();
      gt $$0 = this.da();
      gt $$1 = $$0.b();
      if (this.q()) {
         boolean $$2 = this.aM();
         if (this.s.a_($$1).g(this.s, $$0)) {
            if (this.R.a(200) == 0) {
               this.aZ = (float)this.R.a(360);
            }

            if (this.s.a(bW, this) != null) {
               this.v(false);
               if (!$$2) {
                  this.s.a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.v(false);
            if (!$$2) {
               this.s.a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.bX != null && (!this.s.x(this.bX) || this.bX.v() <= this.s.u_())) {
            this.bX = null;
         }

         if (this.bX == null || this.R.a(30) == 0 || this.bX.a(this.cY(), 2.0)) {
            this.bX = new gt(
               this.df() + (double)this.R.a(7) - (double)this.R.a(7),
               this.dh() + (double)this.R.a(6) - 2.0,
               this.dl() + (double)this.R.a(7) - (double)this.R.a(7)
            );
         }

         double $$3 = (double)this.bX.u() + 0.5 - this.df();
         double $$4 = (double)this.bX.v() + 0.1 - this.dh();
         double $$5 = (double)this.bX.w() + 0.5 - this.dl();
         dwq $$6 = this.dd();
         dwq $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.f($$7);
         float $$8 = (float)(ami.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ami.g($$8 - this.dq());
         this.bq = 0.5F;
         this.o(this.dq() + $$9);
         if (this.R.a(100) == 0 && this.s.a_($$1).g(this.s, $$1)) {
            this.v(true);
         }
      }

   }

   @Override
   protected bbn.b aO() {
      return bbn.b.c;
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
   }

   @Override
   public boolean cm() {
      return true;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.s.y && this.q()) {
            this.v(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.Y.b(d, $$0.f("BatFlags"));
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.Y.a(d));
   }

   public static boolean b(bbr<bmz> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      if ($$3.v() >= $$1.m_()) {
         return false;
      } else {
         int $$5 = $$1.D($$3);
         int $$6 = 4;
         if (t()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean t() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b / 2.0F;
   }
}
