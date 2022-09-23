import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public class clo extends cjg {
   public static final cwi a = clm.a;
   public static final cwf b = cwe.A;
   private static final Map<cat, hz> c = ad.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new hy()));
   private static final int d = 4;

   public static void a(cgw $$0, hz $$1) {
      c.put($$0.l(), $$1);
   }

   protected clo(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         cti $$6 = $$1.c_($$2);
         if ($$6 instanceof ctu) {
            $$3.a((ctu)$$6);
            if ($$6 instanceof ctv) {
               $$3.a(akg.ac);
            } else {
               $$3.a(akg.ae);
            }
         }

         return baj.b;
      }
   }

   protected void a(agg $$0, gt $$1) {
      gv $$2 = new gv($$0, $$1);
      ctu $$3 = $$2.f();
      int $$4 = $$3.a($$0.w);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
         $$0.a(null, czv.l, $$1);
      } else {
         cax $$5 = $$3.a($$4);
         hz $$6 = this.a($$5);
         if ($$6 != hz.b) {
            $$3.a($$4, $$6.dispense($$2, $$5));
         }

      }
   }

   protected hz a(cax $$0) {
      return (hz)c.get($$0.c());
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      boolean $$6 = $$1.r($$2) || $$1.r($$2.b());
      boolean $$7 = $$0.c(b);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 4);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 4);
      }

   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      this.a($$1, $$2);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctu($$0, $$1);
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.d().g());
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof ctu) {
            ((ctu)$$5).a($$4.x());
         }
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         cti $$5 = $$1.c_($$2);
         if ($$5 instanceof ctu) {
            baf.a($$1, $$2, (ctu)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public static hj a(gu $$0) {
      gy $$1 = $$0.e().c(a);
      double $$2 = $$0.a() + 0.7 * (double)$$1.j();
      double $$3 = $$0.b() + 0.7 * (double)$$1.k();
      double $$4 = $$0.c() + 0.7 * (double)$$1.l();
      return new hk($$2, $$3, $$4);
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return bwm.a($$1.c_($$2));
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
}
