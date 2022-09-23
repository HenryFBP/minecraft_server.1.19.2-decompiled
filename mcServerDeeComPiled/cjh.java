import java.util.Optional;

public abstract class cjh extends cjt {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final dxj b = cjt.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public cjh(cvn.c $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public cvo a(ccx $$0) {
      return a($$0.q(), $$0.a());
   }

   public static cvo a(cgd $$0, gt $$1) {
      gt $$2 = $$1.c();
      cvo $$3 = $$0.a_($$2);
      return cqu.h($$3) ? cju.cd.m() : ((cmi)cju.cc).b($$0, $$1);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ajw.gn, ajx.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      gt $$4 = $$2.c();
      cvo $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, gy.b)) {
         if (this.f($$1.a_($$2.f()))) {
            for(int $$10 = 0; $$10 < 2; ++$$10) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(io.R, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.g()))) {
            for(int $$14 = 0; $$14 < 2; ++$$14) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(io.R, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.d()))) {
            for(int $$18 = 0; $$18 < 2; ++$$18) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(io.R, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for(int $$22 = 0; $$22 < 2; ++$$22) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(io.R, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.b()))) {
            for(int $$26 = 0; $$26 < 2; ++$$26) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(io.R, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for(int $$6 = 0; $$6 < 3; ++$$6) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(io.R, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }

   }

   protected abstract boolean f(cvo var1);

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$3.aQ()) {
         $$3.g($$3.at() + 1);
         if ($$3.at() == 0) {
            $$3.f(8);
         }
      }

      $$3.a(baw.a, this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<dqu> $$5 = dqu.a($$1, $$2, gy.a.a);
            if ($$5.isPresent()) {
               ((dqu)$$5.get()).b();
               return;
            }
         }

         if (!$$0.a((cha)$$1, $$2)) {
            $$1.a($$2, false);
         }

      }
   }

   private static boolean a(cgx $$0) {
      return $$0.ab() == cgx.e || $$0.ab() == cgx.f;
   }

   @Override
   protected void a(cgx $$0, buc $$1, gt $$2, cvo $$3) {
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$0.k_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(cgx $$0, gt $$1, gy $$2) {
      cvo $$3 = $$0.a_($$1);
      if (!$$3.h()) {
         return false;
      } else {
         return a($$0, $$1).a((cha)$$0, $$1) || b($$0, $$1, $$2);
      }
   }

   private static boolean b(cgx $$0, gt $$1, gy $$2) {
      if (!a($$0)) {
         return false;
      } else {
         gt.a $$3 = $$1.i();
         boolean $$4 = false;

         for(gy $$5 : gy.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(cju.bZ)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            gy.a $$6 = $$2.o().d() ? $$2.i().o() : gy.c.a.b($$0.w);
            return dqu.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
