import java.util.UUID;
import javax.annotation.Nullable;

public class bum extends bbn {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int ao = 22;
   private boolean ap;
   @Nullable
   private bcc aq;
   @Nullable
   private UUID ar;

   public bum(bbr<? extends bum> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bum(cgx $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bcc $$6) {
      this(bbr.B, $$0);
      this.e = $$5;
      this.a($$6);
      this.o($$4 * 180.0F / (float)Math.PI);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected void a_() {
   }

   public void a(@Nullable bcc $$0) {
      this.aq = $$0;
      this.ar = $$0 == null ? null : $$0.co();
   }

   @Nullable
   public bcc h() {
      if (this.aq == null && this.ar != null && this.s instanceof agg) {
         bbn $$0 = ((agg)this.s).a(this.ar);
         if ($$0 instanceof bcc) {
            this.aq = (bcc)$$0;
         }
      }

      return this.aq;
   }

   @Override
   protected void a(pj $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.ar = $$0.a("Owner");
      }

   }

   @Override
   protected void b(pj $$0) {
      $$0.a("Warmup", this.e);
      if (this.ar != null) {
         $$0.a("Owner", this.ar);
      }

   }

   @Override
   public void k() {
      super.k();
      if (this.s.y) {
         if (this.ap) {
            --this.ao;
            if (this.ao == 14) {
               for(int $$0 = 0; $$0 < 12; ++$$0) {
                  double $$1 = this.df() + (this.R.j() * 2.0 - 1.0) * (double)this.cW() * 0.5;
                  double $$2 = this.dh() + 0.05 + this.R.j();
                  double $$3 = this.dl() + (this.R.j() * 2.0 - 1.0) * (double)this.cW() * 0.5;
                  double $$4 = (this.R.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.R.j() * 0.3;
                  double $$6 = (this.R.j() * 2.0 - 1.0) * 0.3;
                  this.s.a(io.g, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for(bcc $$8 : this.s.a(bcc.class, this.cy().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.s.a(this, (byte)4);
            this.f = true;
         }

         if (--this.ao < 0) {
            this.ah();
         }
      }

   }

   private void c(bcc $$0) {
      bcc $$1 = this.h();
      if ($$0.bo() && !$$0.ci() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(baw.o, 6.0F);
         } else {
            if ($$1.p($$0)) {
               return;
            }

            $$0.a(baw.c(this, $$1), 6.0F);
         }

      }
   }

   @Override
   public void a(byte $$0) {
      super.a($$0);
      if ($$0 == 4) {
         this.ap = true;
         if (!this.aM()) {
            this.s.a(this.df(), this.dh(), this.dl(), ajw.fV, this.cR(), 1.0F, this.R.i() * 0.2F + 0.85F, false);
         }
      }

   }

   public float a(float $$0) {
      if (!this.ap) {
         return 0.0F;
      } else {
         int $$1 = this.ao - 2;
         return $$1 <= 0 ? 1.0F : 1.0F - ((float)$$1 - $$0) / 20.0F;
      }
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }
}
