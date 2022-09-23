import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bne extends bbk {
   protected static final int bZ = 6000;
   private int bX;
   @Nullable
   private UUID bY;

   protected bne(bbr<? extends bne> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.n, 16.0F);
      this.a(dqh.o, -1.0F);
   }

   @Override
   protected void T() {
      if (this.j() != 0) {
         this.bX = 0;
      }

      super.T();
   }

   @Override
   public void w_() {
      super.w_();
      if (this.j() != 0) {
         this.bX = 0;
      }

      if (this.bX > 0) {
         --this.bX;
         if (this.bX % 10 == 0) {
            double $$0 = this.R.k() * 0.02;
            double $$1 = this.R.k() * 0.02;
            double $$2 = this.R.k() * 0.02;
            this.s.a(io.L, this.d(1.0), this.di() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }

   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bX = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return $$1.a_($$0.c()).a(cju.i) ? 10.0F : $$1.z($$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("InLove", this.bX);
      if (this.bY != null) {
         $$0.a("LoveCause", this.bY);
      }

   }

   @Override
   public double bs() {
      return 0.14;
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.bX = $$0.h("InLove");
      this.bY = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bbr<? extends bne> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bD) && a($$1, $$3);
   }

   protected static boolean a(cga $$0, gt $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int J() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int dO() {
      return 1 + this.s.w.a(3);
   }

   public boolean n(cax $$0) {
      return $$0.a(caz.nS);
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (this.n($$2)) {
         int $$3 = this.j();
         if (!this.s.y && $$3 == 0 && this.fM()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            return baj.a;
         }

         if (this.y_()) {
            this.a($$0, $$1, $$2);
            this.a(c(-$$3), true);
            return baj.a(this.s.y);
         }

         if (this.s.y) {
            return baj.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(buc $$0, bai $$1, cax $$2) {
      if (!$$0.fB().d) {
         $$2.g(1);
      }

   }

   public boolean fM() {
      return this.bX <= 0;
   }

   public void f(@Nullable buc $$0) {
      this.bX = 600;
      if ($$0 != null) {
         this.bY = $$0.co();
      }

      this.s.a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bX = $$0;
   }

   public int fN() {
      return this.bX;
   }

   @Nullable
   public agh fO() {
      if (this.bY == null) {
         return null;
      } else {
         buc $$0 = this.s.b(this.bY);
         return $$0 instanceof agh ? (agh)$$0 : null;
      }
   }

   public boolean fP() {
      return this.bX > 0;
   }

   public void fQ() {
      this.bX = 0;
   }

   public boolean a(bne $$0) {
      if ($$0 == this) {
         return false;
      } else if ($$0.getClass() != this.getClass()) {
         return false;
      } else {
         return this.fP() && $$0.fP();
      }
   }

   public void a(agg $$0, bne $$1) {
      bbk $$2 = this.a($$0, (bbk)$$1);
      if ($$2 != null) {
         agh $$3 = this.fO();
         if ($$3 == null && $$1.fO() != null) {
            $$3 = $$1.fO();
         }

         if ($$3 != null) {
            $$3.a(akg.P);
            aj.o.a($$3, this, $$1, $$2);
         }

         this.b_(6000);
         $$1.b_(6000);
         this.fQ();
         $$1.fQ();
         $$2.a(true);
         $$2.b(this.df(), this.dh(), this.dl(), 0.0F, 0.0F);
         $$0.a_($$2);
         $$0.a(this, (byte)18);
         if ($$0.W().b(cgt.f)) {
            $$0.b(new bbt($$0, this.df(), this.dh(), this.dl(), this.dQ().a(7) + 1));
         }

      }
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 18) {
         for(int $$1 = 0; $$1 < 7; ++$$1) {
            double $$2 = this.R.k() * 0.02;
            double $$3 = this.R.k() * 0.02;
            double $$4 = this.R.k() * 0.02;
            this.s.a(io.L, this.d(1.0), this.di() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.a($$0);
      }

   }
}
