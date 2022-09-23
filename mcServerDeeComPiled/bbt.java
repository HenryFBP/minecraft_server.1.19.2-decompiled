import java.util.List;
import java.util.Map.Entry;

public class bbt extends bbn {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int ao;
   private int ap = 5;
   private int aq;
   private int ar = 1;
   private buc as;

   public bbt(cgx $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bbr.C, $$0);
      this.e($$1, $$2, $$3);
      this.o((float)(this.R.j() * 360.0));
      this.n((this.R.j() * 0.2F - 0.1F) * 2.0, this.R.j() * 0.2 * 2.0, (this.R.j() * 0.2F - 0.1F) * 2.0);
      this.aq = $$4;
   }

   public bbt(bbr<? extends bbt> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.a;
   }

   @Override
   protected void a_() {
   }

   @Override
   public void k() {
      super.k();
      this.t = this.df();
      this.u = this.dh();
      this.v = this.dl();
      if (this.a(akp.a)) {
         this.l();
      } else if (!this.aN()) {
         this.f(this.dd().b(0.0, -0.03, 0.0));
      }

      if (this.s.b_(this.da()).a(akp.b)) {
         this.n((double)((this.R.i() - this.R.i()) * 0.2F), 0.2F, (double)((this.R.i() - this.R.i()) * 0.2F));
      }

      if (!this.s.b(this.cy())) {
         this.l(this.df(), (this.cy().b + this.cy().e) / 2.0, this.dl());
      }

      if (this.S % 20 == 1) {
         this.j();
      }

      if (this.as != null && (this.as.B_() || this.as.eg())) {
         this.as = null;
      }

      if (this.as != null) {
         dwq $$0 = new dwq(this.as.df() - this.df(), this.as.dh() + (double)this.as.cA() / 2.0 - this.dh(), this.as.dl() - this.dl());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.f(this.dd().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(bci.a, this.dd());
      float $$3 = 0.98F;
      if (this.y) {
         $$3 = this.s.a_(new gt(this.df(), this.dh() - 1.0, this.dl())).b().h() * 0.98F;
      }

      this.f(this.dd().d((double)$$3, 0.98, (double)$$3));
      if (this.y) {
         this.f(this.dd().d(1.0, -0.9, 1.0));
      }

      ++this.ao;
      if (this.ao >= 6000) {
         this.ah();
      }

   }

   private void j() {
      if (this.as == null || this.as.f(this) > 64.0) {
         this.as = this.s.a(this, 8.0);
      }

      if (this.s instanceof agg) {
         for(bbt $$1 : this.s.a(czj.a(bbt.class), this.cy().g(0.5), this::a)) {
            this.b($$1);
         }
      }

   }

   public static void a(agg $$0, dwq $$1, int $$2) {
      while($$2 > 0) {
         int $$3 = a($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bbt($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }

   }

   private static boolean b(agg $$0, dwq $$1, int $$2) {
      dwl $$3 = dwl.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.r_().a(40);
      List<bbt> $$5 = $$0.a(czj.a(bbt.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bbt $$6 = (bbt)$$5.get(0);
         ++$$6.ar;
         $$6.ao = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bbt $$0) {
      return $$0 != this && a($$0, this.ae(), this.aq);
   }

   private static boolean a(bbt $$0, int $$1, int $$2) {
      return !$$0.dt() && ($$0.ae() - $$1) % 40 == 0 && $$0.aq == $$2;
   }

   private void b(bbt $$0) {
      this.ar += $$0.ar;
      this.ao = Math.min(this.ao, $$0.ao);
      $$0.ah();
   }

   private void l() {
      dwq $$0 = this.dd();
      this.n($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void ba() {
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.s.y) {
         return true;
      } else {
         this.bi();
         this.ap = (int)((float)this.ap - $$1);
         if (this.ap <= 0) {
            this.ah();
         }

         return true;
      }
   }

   @Override
   public void b(pj $$0) {
      $$0.a("Health", (short)this.ap);
      $$0.a("Age", (short)this.ao);
      $$0.a("Value", (short)this.aq);
      $$0.a("Count", this.ar);
   }

   @Override
   public void a(pj $$0) {
      this.ap = $$0.g("Health");
      this.ao = $$0.g("Age");
      this.aq = $$0.g("Value");
      this.ar = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(buc $$0) {
      if (!this.s.y) {
         if ($$0.ca == 0) {
            $$0.ca = 2;
            $$0.a(this, 1);
            int $$1 = this.a($$0, this.aq);
            if ($$1 > 0) {
               $$0.d($$1);
            }

            --this.ar;
            if (this.ar == 0) {
               this.ah();
            }
         }

      }
   }

   private int a(buc $$0, int $$1) {
      Entry<bbs, cax> $$2 = cet.a(cev.L, $$0, cax::i);
      if ($$2 != null) {
         cax $$3 = (cax)$$2.getValue();
         int $$4 = Math.min(this.c(this.aq), $$3.j());
         $$3.b($$3.j() - $$4);
         int $$5 = $$1 - this.b($$4);
         return $$5 > 0 ? this.a($$0, $$5) : 0;
      } else {
         return $$1;
      }
   }

   private int b(int $$0) {
      return $$0 / 2;
   }

   private int c(int $$0) {
      return $$0 * 2;
   }

   public int h() {
      return this.aq;
   }

   public int i() {
      if (this.aq >= 2477) {
         return 10;
      } else if (this.aq >= 1237) {
         return 9;
      } else if (this.aq >= 617) {
         return 8;
      } else if (this.aq >= 307) {
         return 7;
      } else if (this.aq >= 149) {
         return 6;
      } else if (this.aq >= 73) {
         return 5;
      } else if (this.aq >= 37) {
         return 4;
      } else if (this.aq >= 17) {
         return 3;
      } else if (this.aq >= 7) {
         return 2;
      } else {
         return this.aq >= 3 ? 1 : 0;
      }
   }

   public static int a(int $$0) {
      if ($$0 >= 2477) {
         return 2477;
      } else if ($$0 >= 1237) {
         return 1237;
      } else if ($$0 >= 617) {
         return 617;
      } else if ($$0 >= 307) {
         return 307;
      } else if ($$0 >= 149) {
         return 149;
      } else if ($$0 >= 73) {
         return 73;
      } else if ($$0 >= 37) {
         return 37;
      } else if ($$0 >= 17) {
         return 17;
      } else if ($$0 >= 7) {
         return 7;
      } else {
         return $$0 >= 3 ? 3 : 1;
      }
   }

   @Override
   public boolean ch() {
      return false;
   }

   @Override
   public tc<?> S() {
      return new th(this);
   }

   @Override
   public ajx cR() {
      return ajx.i;
   }
}
