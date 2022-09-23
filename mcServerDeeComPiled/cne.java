import javax.annotation.Nullable;

public class cne extends cjg {
   public static final cwi a = cwe.R;
   public static final cwf b = cwe.f;
   private static final dxj c = cjt.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final dxj d = cjt.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final dxj e = dxg.a(d, c);
   private static final dxj f = dxg.a(e, ctz.k_, dwu.e);
   private static final dxj g = dxg.a(f, cjt.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final dxj h = dxg.a(f, cjt.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final dxj i = dxg.a(f, cjt.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final dxj j = dxg.a(f, cjt.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final dxj k = dxg.a(f, cjt.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final dxj l = ctz.k_;
   private static final dxj m = dxg.a(ctz.k_, cjt.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final dxj n = dxg.a(ctz.k_, cjt.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final dxj E = dxg.a(ctz.k_, cjt.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final dxj F = dxg.a(ctz.k_, cjt.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   public cne(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.a).a(b, Boolean.valueOf(true)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch((gy)$$0.c(a)) {
         case a:
            return g;
         case c:
            return i;
         case d:
            return j;
         case e:
            return k;
         case f:
            return h;
         default:
            return f;
      }
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2) {
      switch((gy)$$0.c(a)) {
         case a:
            return l;
         case c:
            return n;
         case d:
            return E;
         case e:
            return F;
         case f:
            return m;
         default:
            return ctz.k_;
      }
   }

   @Override
   public cvo a(ccx $$0) {
      gy $$1 = $$0.k().g();
      return this.m().a(a, $$1.o() == gy.a.b ? gy.a : $$1).a(b, Boolean.valueOf(true));
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cua($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return $$0.y ? null : a($$2, ctk.q, cua::a);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof cua) {
            ((cua)$$5).a($$4.x());
         }
      }

   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         cti $$6 = $$1.c_($$2);
         if ($$6 instanceof cua) {
            $$3.a((cua)$$6);
            $$3.a(akg.ad);
         }

         return baj.b;
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cgx $$0, gt $$1, cvo $$2) {
      boolean $$3 = !$$0.r($$1);
      if ($$3 != $$2.c(b)) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 4);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         cti $$5 = $$1.c_($$2);
         if ($$5 instanceof cua) {
            baf.a($$1, $$2, (cua)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
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
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      cti $$4 = $$1.c_($$2);
      if ($$4 instanceof cua) {
         cua.a($$1, $$2, $$0, $$3, (cua)$$4);
      }

   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
