import java.util.List;
import javax.annotation.Nullable;

public class cqj extends cjg {
   public static final cwm<gy> a = clm.a;
   public static final abb b = new abb("contents");
   @Nullable
   private final bzq c;

   public cqj(@Nullable bzq $$0, cvn.c $$1) {
      super($$1);
      this.c = $$0;
      this.k(this.D.b().a(a, gy.b));
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cuj(this.c, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$2, ctk.w, cuj::a);
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.b;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else if ($$3.B_()) {
         return baj.b;
      } else {
         cti $$6 = $$1.c_($$2);
         if ($$6 instanceof cuj $$7) {
            if (a($$0, $$1, $$2, $$7)) {
               $$3.a($$7);
               $$3.a(akg.aq);
               bst.a($$3, true);
            }

            return baj.b;
         } else {
            return baj.d;
         }
      }
   }

   private static boolean a(cvo $$0, cgx $$1, gt $$2, cuj $$3) {
      if ($$3.i() != cuj.a.a) {
         return true;
      } else {
         dwl $$4 = brw.a($$0.c(a), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.k());
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      cti $$4 = $$0.c_($$1);
      if ($$4 instanceof cuj $$5) {
         if (!$$0.y && $$3.f() && !$$5.c()) {
            cax $$6 = b(this.b());
            $$4.e($$6);
            if ($$5.Y()) {
               $$6.a($$5.Z());
            }

            bqv $$7 = new bqv($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.o();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cax> a(cvo $$0, dsd.a $$1) {
      cti $$2 = $$1.b(dul.h);
      if ($$2 instanceof cuj $$3) {
         $$1 = $$1.a(b, ($$1x, $$2x) -> {
            for(int $$3x = 0; $$3x < $$3.b(); ++$$3x) {
               $$2x.accept($$3.a($$3x));
            }

         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof cuj) {
            ((cuj)$$5).a($$4.x());
         }
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         cti $$5 = $$1.c_($$2);
         if ($$5 instanceof cuj) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cax $$0, @Nullable cgd $$1, List<rq> $$2, ccl $$3) {
      super.a($$0, $$1, $$2, $$3);
      pj $$4 = byx.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(rq.b("???????"));
         }

         if ($$4.b("Items", 9)) {
            hi<cax> $$5 = hi.a(27, cax.b);
            bad.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for(cax $$8 : $$5) {
               if (!$$8.b()) {
                  ++$$7;
                  if ($$6 <= 4) {
                     ++$$6;
                     sb $$9 = $$8.x().e();
                     $$9.f(" x").f(String.valueOf($$8.K()));
                     $$2.add($$9);
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(rq.a("container.shulkerBox.more", $$7 - $$6).a(p.u));
            }
         }
      }

   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      cti $$4 = $$1.c_($$2);
      return $$4 instanceof cuj ? dxg.a(((cuj)$$4).a($$0)) : dxg.b();
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return bwm.b((bac)$$1.c_($$2));
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      cax $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, ctk.w).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static bzq b(cat $$0) {
      return a(cjt.a($$0));
   }

   @Nullable
   public static bzq a(cjt $$0) {
      return $$0 instanceof cqj ? ((cqj)$$0).b() : null;
   }

   public static cjt a(@Nullable bzq $$0) {
      if ($$0 == null) {
         return cju.jB;
      } else {
         switch($$0) {
            case a:
               return cju.jC;
            case b:
               return cju.jD;
            case c:
               return cju.jE;
            case d:
               return cju.jF;
            case e:
               return cju.jG;
            case f:
               return cju.jH;
            case g:
               return cju.jI;
            case h:
               return cju.jJ;
            case i:
               return cju.jK;
            case j:
               return cju.jL;
            case k:
            default:
               return cju.jM;
            case l:
               return cju.jN;
            case m:
               return cju.jO;
            case n:
               return cju.jP;
            case o:
               return cju.jQ;
            case p:
               return cju.jR;
         }
      }
   }

   @Nullable
   public bzq b() {
      return this.c;
   }

   public static cax b(@Nullable bzq $$0) {
      return new cax(a($$0));
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }
}
