import java.util.List;
import javax.annotation.Nullable;

public class brj extends bsa {
   @Nullable
   private boa e;

   public brj(bbr<? extends brj> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(0, new bij(this));
      this.bS.a(1, new brj.b());
      this.bS.a(2, new bhw(this, buc.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new brj.c());
      this.bS.a(5, new brj.a());
      this.bS.a(6, new brj.d());
      this.bS.a(8, new bjl(this, 0.6));
      this.bS.a(9, new bix(this, buc.class, 3.0F, 1.0F));
      this.bS.a(10, new bix(this, bce.class, 8.0F));
      this.bT.a(1, new bkg(this, bvk.class).a());
      this.bT.a(2, new bkh(this, buc.class, true).c(300));
      this.bT.a(3, new bkh(this, btk.class, false).c(300));
      this.bT.a(3, new bkh(this, bnq.class, false));
   }

   public static bdc.a q() {
      return brq.fO().a(bdd.d, 0.5).a(bdd.b, 12.0).a(bdd.a, 24.0);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
   }

   @Override
   public ajv L_() {
      return ajw.fT;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
   }

   @Override
   protected void T() {
      super.T();
   }

   @Override
   public boolean p(bbn $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.p($$0)) {
         return true;
      } else if ($$0 instanceof bse) {
         return this.p(((bse)$$0).q());
      } else if ($$0 instanceof bcc && ((bcc)$$0).ey() == bch.d) {
         return this.bY() == null && $$0.bY() == null;
      } else {
         return false;
      }
   }

   @Override
   protected ajv r() {
      return ajw.fR;
   }

   @Override
   protected ajv x_() {
      return ajw.fU;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.fW;
   }

   void a(@Nullable boa $$0) {
      this.e = $$0;
   }

   @Nullable
   boa gc() {
      return this.e;
   }

   @Override
   protected ajv fJ() {
      return ajw.fS;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bsa.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         bcc $$0 = brj.this.G();
         double $$1 = Math.min($$0.dh(), brj.this.dh());
         double $$2 = Math.max($$0.dh(), brj.this.dh()) + 1.0;
         float $$3 = (float)ami.d($$0.dl() - brj.this.dl(), $$0.df() - brj.this.df());
         if (brj.this.f((bbn)$$0) < 9.0) {
            for(int $$4 = 0; $$4 < 5; ++$$4) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(brj.this.df() + (double)ami.b($$5) * 1.5, brj.this.dl() + (double)ami.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for(int $$6 = 0; $$6 < 8; ++$$6) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(brj.this.df() + (double)ami.b($$7) * 2.5, brj.this.dl() + (double)ami.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for(int $$8 = 0; $$8 < 16; ++$$8) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(brj.this.df() + (double)ami.b($$3) * $$9, brj.this.dl() + (double)ami.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }

      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gt $$6 = new gt($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gt $$9 = $$6.c();
            cvo $$10 = brj.this.s.a_($$9);
            if ($$10.d(brj.this.s, $$9, gy.b)) {
               if (!brj.this.s.x($$6)) {
                  cvo $$11 = brj.this.s.a_($$6);
                  dxj $$12 = $$11.k(brj.this.s, $$6);
                  if (!$$12.b()) {
                     $$8 = $$12.c(gy.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.c();
         } while($$6.v() >= ami.b($$2) - 1);

         if ($$7) {
            brj.this.s.b(new bum(brj.this.s, $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, brj.this));
         }

      }

      @Override
      protected ajv l() {
         return ajw.fX;
      }

      @Override
      protected bsa.a m() {
         return bsa.a.c;
      }
   }

   class b extends bsa.b {
      @Override
      public void e() {
         if (brj.this.G() != null) {
            brj.this.z().a(brj.this.G(), (float)brj.this.V(), (float)brj.this.U());
         } else if (brj.this.gc() != null) {
            brj.this.z().a(brj.this.gc(), (float)brj.this.V(), (float)brj.this.U());
         }

      }
   }

   class c extends bsa.c {
      private final bmf e = bmf.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = brj.this.s.a(bse.class, this.e, brj.this, brj.this.cy().g(16.0)).size();
            return brj.this.R.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         agg $$0 = (agg)brj.this.s;

         for(int $$1 = 0; $$1 < 3; ++$$1) {
            gt $$2 = brj.this.da().b(-2 + brj.this.R.a(5), 1, -2 + brj.this.R.a(5));
            bse $$3 = bbr.aY.a(brj.this.s);
            $$3.a($$2, 0.0F, 0.0F);
            $$3.a($$0, brj.this.s.d_($$2), bcg.f, null, null);
            $$3.a(brj.this);
            $$3.g($$2);
            $$3.a(20 * (30 + brj.this.R.a(90)));
            $$0.a_($$3);
         }

      }

      @Override
      protected ajv l() {
         return ajw.fY;
      }

      @Override
      protected bsa.a m() {
         return bsa.a.b;
      }
   }

   public class d extends bsa.c {
      private final bmf e = bmf.b().a(16.0).a($$0x -> ((boa)$$0x).t() == bzq.l);

      @Override
      public boolean a() {
         if (brj.this.G() != null) {
            return false;
         } else if (brj.this.fT()) {
            return false;
         } else if (brj.this.S < this.c) {
            return false;
         } else if (!brj.this.s.W().b(cgt.c)) {
            return false;
         } else {
            List<boa> $$0 = brj.this.s.a(boa.class, this.e, brj.this, brj.this.cy().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               brj.this.a((boa)$$0.get(brj.this.R.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return brj.this.gc() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         brj.this.a(null);
      }

      @Override
      protected void k() {
         boa $$0 = brj.this.gc();
         if ($$0 != null && $$0.bo()) {
            $$0.b(bzq.o);
         }

      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected ajv l() {
         return ajw.fZ;
      }

      @Override
      protected bsa.a m() {
         return bsa.a.d;
      }
   }
}
