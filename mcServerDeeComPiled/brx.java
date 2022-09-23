import java.util.EnumSet;
import javax.annotation.Nullable;

public class brx extends brq {
   @Nullable
   private brx.b b;

   public brx(bbr<? extends brx> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      this.b = new brx.b(this);
      this.bS.a(1, new bij(this));
      this.bS.a(1, new bie(this, this.s));
      this.bS.a(3, this.b);
      this.bS.a(4, new biz(this, 1.0, false));
      this.bS.a(5, new brx.a(this));
      this.bT.a(1, new bkg(this).a());
      this.bT.a(2, new bkh(this, buc.class, true));
   }

   @Override
   public double bs() {
      return 0.1;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 0.13F;
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.a, 8.0).a(bdd.d, 0.25).a(bdd.f, 1.0);
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.c;
   }

   @Override
   protected ajv r() {
      return ajw.sD;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.sF;
   }

   @Override
   protected ajv x_() {
      return ajw.sE;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.sG, 0.15F, 1.0F);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0 instanceof bax || $$0 == baw.o) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void k() {
      this.aX = this.dq();
      super.k();
   }

   @Override
   public void m(float $$0) {
      this.o($$0);
      super.m($$0);
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return cni.h($$1.a_($$0.c())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bbr<brx> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         buc $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bch ey() {
      return bch.c;
   }

   static class a extends bjl {
      @Nullable
      private gy i;
      private boolean j;

      public a(brx $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.G() != null) {
            return false;
         } else if (!this.b.D().l()) {
            return false;
         } else {
            amn $$0 = this.b.dQ();
            if (this.b.s.W().b(cgt.c) && $$0.a(b(10)) == 0) {
               this.i = gy.b($$0);
               gt $$1 = new gt(this.b.df(), this.b.dh() + 0.5, this.b.dl()).a(this.i);
               cvo $$2 = this.b.s.a_($$1);
               if (cni.h($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.a();
         }
      }

      @Override
      public boolean b() {
         return this.j ? false : super.b();
      }

      @Override
      public void c() {
         if (!this.j) {
            super.c();
         } else {
            cgy $$0 = this.b.s;
            gt $$1 = new gt(this.b.df(), this.b.dh() + 0.5, this.b.dl()).a(this.i);
            cvo $$2 = $$0.a_($$1);
            if (cni.h($$2)) {
               $$0.a($$1, cni.n($$2), 3);
               this.b.L();
               this.b.ah();
            }

         }
      }
   }

   static class b extends bip {
      private final brx a;
      private int b;

      public b(brx $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }

      }

      @Override
      public boolean a() {
         return this.b > 0;
      }

      @Override
      public void e() {
         --this.b;
         if (this.b <= 0) {
            cgx $$0 = this.a.s;
            amn $$1 = this.a.dQ();
            gt $$2 = this.a.da();

            for(int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for(int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for(int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     gt $$6 = $$2.b($$4, $$3, $$5);
                     cvo $$7 = $$0.a_($$6);
                     cjt $$8 = $$7.b();
                     if ($$8 instanceof cni) {
                        if ($$0.W().b(cgt.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((cni)$$8).o($$0.a_($$6)), 3);
                        }

                        if ($$1.h()) {
                           return;
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
