import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvf extends bva implements bur {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bcc> c = bcc::eL;

   public bvf(bbr<? extends bvf> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bvf(cgx $$0, bcc $$1) {
      super(bbr.aT, $$1, $$0);
   }

   public bvf(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.aT, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cat i() {
      return caz.ti;
   }

   @Override
   protected float l() {
      return 0.05F;
   }

   @Override
   protected void a(dwm $$0) {
      super.a($$0);
      if (!this.s.y) {
         cax $$1 = this.h();
         ccs $$2 = ccu.d($$1);
         List<bbg> $$3 = ccu.a($$1);
         boolean $$4 = $$2 == ccv.b && $$3.isEmpty();
         gy $$5 = $$0.b();
         gt $$6 = $$0.a();
         gt $$7 = $$6.a($$5);
         if ($$4) {
            this.a($$7);
            this.a($$7.a($$5.g()));

            for(gy $$8 : gy.c.a) {
               this.a($$7.a($$8));
            }
         }

      }
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);
      if (!this.s.y) {
         cax $$1 = this.h();
         ccs $$2 = ccu.d($$1);
         List<bbg> $$3 = ccu.a($$1);
         boolean $$4 = $$2 == ccv.b && $$3.isEmpty();
         if ($$4) {
            this.n();
         } else if (!$$3.isEmpty()) {
            if (this.o()) {
               this.a($$1, $$2);
            } else {
               this.a($$3, $$0.c() == dwo.a.c ? ((dwn)$$0).a() : null);
            }
         }

         int $$5 = $$2.b() ? 2007 : 2002;
         this.s.c($$5, this.da(), ccu.c($$1));
         this.ah();
      }
   }

   private void n() {
      dwl $$0 = this.cy().c(4.0, 2.0, 4.0);
      List<bcc> $$1 = this.s.a(bcc.class, $$0, c);
      if (!$$1.isEmpty()) {
         for(bcc $$2 : $$1) {
            double $$3 = this.f($$2);
            if ($$3 < 16.0 && $$2.eL()) {
               $$2.a(baw.c(this, this.x()), 1.0F);
            }
         }
      }

      for(bol $$5 : this.s.a(bol.class, $$0)) {
         $$5.fJ();
      }

   }

   private void a(List<bbg> $$0, @Nullable bbn $$1) {
      dwl $$2 = this.cy().c(4.0, 2.0, 4.0);
      List<bcc> $$3 = this.s.a(bcc.class, $$2);
      if (!$$3.isEmpty()) {
         bbn $$4 = this.y();

         for(bcc $$5 : $$3) {
            if ($$5.fe()) {
               double $$6 = this.f($$5);
               if ($$6 < 16.0) {
                  double $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  }

                  for(bbg $$8 : $$0) {
                     bbe $$9 = $$8.b();
                     if ($$9.a()) {
                        $$9.a(this, this.x(), $$5, $$8.d(), $$7);
                     } else {
                        int $$10 = (int)($$7 * (double)$$8.c() + 0.5);
                        if ($$10 > 20) {
                           $$5.b(new bbg($$9, $$10, $$8.d(), $$8.e(), $$8.f()), $$4);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   private void a(cax $$0, ccs $$1) {
      bbm $$2 = new bbm(this.s, this.df(), this.dh(), this.dl());
      bbn $$3 = this.x();
      if ($$3 instanceof bcc) {
         $$2.a((bcc)$$3);
      }

      $$2.a(3.0F);
      $$2.b(-0.5F);
      $$2.d(10);
      $$2.c(-$$2.h() / (float)$$2.n());
      $$2.a($$1);

      for(bbg $$4 : ccu.b($$0)) {
         $$2.a(new bbg($$4));
      }

      pj $$5 = $$0.u();
      if ($$5 != null && $$5.b("CustomPotionColor", 99)) {
         $$2.a($$5.h("CustomPotionColor"));
      }

      this.s.b($$2);
   }

   private boolean o() {
      return this.h().a(caz.tl);
   }

   private void a(gt $$0) {
      cvo $$1 = this.s.a_($$0);
      if ($$1.a(akl.aB)) {
         this.s.a($$0, false);
      } else if (cil.b($$1)) {
         cil.a(null, $$1, this.s, $$0);
      } else if (cke.g($$1)) {
         this.s.a(null, 1009, $$0, 0);
         cke.a(this.x(), this.s, $$0, $$1);
         this.s.b($$0, $$1.a(cke.b, Boolean.valueOf(false)));
      }

   }
}
