import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ckv extends cjg implements cmq {
   private static final Logger c = LogUtils.getLogger();
   public static final cwi a = clm.a;
   public static final cwf b = cwe.c;
   private final boolean d;

   public ckv(cvn.c $$0, boolean $$1) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)));
      this.d = $$1;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      ctp $$2 = new ctp($$0, $$1);
      $$2.b(this.d);
      return $$2;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if (!$$1.y) {
         cti $$6 = $$1.c_($$2);
         if ($$6 instanceof ctp) {
            ctp $$7 = (ctp)$$6;
            boolean $$8 = $$1.r($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.t() != ctp.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }

            }
         }
      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      cti $$4 = $$1.c_($$2);
      if ($$4 instanceof ctp $$5) {
         cfy $$6 = $$5.c();
         boolean $$7 = !amx.b($$6.l());
         ctp.a $$8 = $$5.t();
         boolean $$9 = $$5.i();
         if ($$8 == ctp.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == ctp.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }

   }

   private void a(cvo $$0, cgx $$1, gt $$2, cfy $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(a));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cti $$6 = $$1.c_($$2);
      if ($$6 instanceof ctp && $$3.fY()) {
         $$3.a((ctp)$$6);
         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      cti $$3 = $$1.c_($$2);
      return $$3 instanceof ctp ? ((ctp)$$3).c().j() : 0;
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      cti $$5 = $$0.c_($$1);
      if ($$5 instanceof ctp) {
         ctp $$6 = (ctp)$$5;
         cfy $$7 = $$6.c();
         if ($$4.z()) {
            $$7.b($$4.x());
         }

         if (!$$0.y) {
            if (byx.a($$4) == null) {
               $$7.a($$0.W().b(cgt.o));
               $$6.b(this.d);
            }

            if ($$6.t() == ctp.a.a) {
               boolean $$8 = $$0.r($$1);
               $$6.a($$8);
            }
         }

      }
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.d().g());
   }

   private static void a(cgx $$0, gt $$1, gy $$2) {
      gt.a $$3 = $$1.i();
      cgt $$4 = $$0.W();

      int $$5;
      cvo $$6;
      for($$5 = $$4.c(cgt.w); $$5-- > 0; $$2 = $$6.c(a)) {
         $$3.c($$2);
         $$6 = $$0.a_($$3);
         cjt $$7 = $$6.b();
         if (!$$6.a(cju.jt)) {
            break;
         }

         cti $$8 = $$0.c_($$3);
         if (!($$8 instanceof ctp)) {
            break;
         }

         ctp $$9 = (ctp)$$8;
         if ($$9.t() != ctp.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cfy $$10 = $$9.c();
            if ($$9.j()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.w()) {
               $$10.a(0);
            }
         }
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(cgt.w), 0);
         c.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }

   }
}
