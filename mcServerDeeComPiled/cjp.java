import javax.annotation.Nullable;

public class cjp extends cjg {
   public static final cwi a = cnf.aD;
   public static final cwm<cwd> b = cwe.V;
   public static final cwf c = cwe.w;
   private static final dxj e = cjt.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final dxj f = cjt.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final dxj g = cjt.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final dxj h = cjt.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final dxj i = dxg.a(h, g);
   private static final dxj j = dxg.a(i, cjt.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final dxj k = dxg.a(i, cjt.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final dxj l = dxg.a(i, cjt.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final dxj m = dxg.a(i, cjt.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final dxj n = dxg.a(i, cjt.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final dxj E = dxg.a(i, cjt.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final dxj F = dxg.a(i, cjt.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int d = 1;

   public cjp(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, cwd.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      boolean $$6 = $$1.r($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }

   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      bbn $$4 = $$3.x();
      buc $$5 = $$4 instanceof buc ? (buc)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? baj.a($$1.y) : baj.d;
   }

   public boolean a(cgx $$0, cvo $$1, dwm $$2, @Nullable buc $$3, boolean $$4) {
      gy $$5 = $$2.b();
      gt $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(akg.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cvo $$0, gy $$1, double $$2) {
      if ($$1.o() != gy.a.b && !($$2 > 0.8124F)) {
         gy $$3 = $$0.c(a);
         cwd $$4 = $$0.c(b);
         switch($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(cgx $$0, gt $$1, @Nullable gy $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bbn $$0, cgx $$1, gt $$2, @Nullable gy $$3) {
      cti $$4 = $$1.c_($$2);
      if (!$$1.y && $$4 instanceof ctg) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(a);
         }

         ((ctg)$$4).a($$3);
         $$1.a(null, $$2, ajw.bu, ajx.e, 2.0F, 1.0F);
         $$1.a($$0, czv.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private dxj h(cvo $$0) {
      gy $$1 = $$0.c(a);
      cwd $$2 = $$0.c(b);
      if ($$2 == cwd.a) {
         return $$1 != gy.c && $$1 != gy.d ? f : e;
      } else if ($$2 == cwd.b) {
         return F;
      } else if ($$2 == cwd.d) {
         return $$1 != gy.c && $$1 != gy.d ? k : j;
      } else if ($$1 == gy.c) {
         return n;
      } else if ($$1 == gy.d) {
         return E;
      } else {
         return $$1 == gy.f ? m : l;
      }
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.h($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.h($$0);
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      gy $$1 = $$0.k();
      gt $$2 = $$0.a();
      cgx $$3 = $$0.q();
      gy.a $$4 = $$1.o();
      if ($$4 == gy.a.b) {
         cvo $$5 = this.m().a(b, $$1 == gy.a ? cwd.b : cwd.a).a(a, $$0.g());
         if ($$5.a((cha)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == gy.a.a && $$3.a_($$2.f()).d($$3, $$2.f(), gy.f) && $$3.a_($$2.g()).d($$3, $$2.g(), gy.e)
            || $$4 == gy.a.c && $$3.a_($$2.d()).d($$3, $$2.d(), gy.d) && $$3.a_($$2.e()).d($$3, $$2.e(), gy.c);
         cvo $$7 = this.m().a(a, $$1.g()).a(b, $$6 ? cwd.d : cwd.c);
         if ($$7.a((cha)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.c()).d($$3, $$2.c(), gy.b);
         $$7 = $$7.a(b, $$8 ? cwd.a : cwd.b);
         if ($$7.a((cha)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      cwd $$6 = $$0.c(b);
      gy $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != cwd.d) {
         return cju.a.m();
      } else {
         if ($$1.o() == ((gy)$$0.c(a)).o()) {
            if ($$6 == cwd.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(b, cwd.c).a(a, $$1.g());
            }

            if ($$6 == cwd.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(a))) {
               return $$0.a(b, cwd.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gy $$3 = n($$0).g();
      return $$3 == gy.b ? cjt.a($$1, $$2.b(), gy.a) : cmc.b($$1, $$2, $$3);
   }

   private static gy n(cvo $$0) {
      switch((cwd)$$0.c(b)) {
         case a:
            return gy.b;
         case b:
            return gy.a;
         default:
            return ((gy)$$0.c(a)).g();
      }
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c);
   }

   @Nullable
   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$2, ctk.D, $$0.y ? ctg::a : ctg::b);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
