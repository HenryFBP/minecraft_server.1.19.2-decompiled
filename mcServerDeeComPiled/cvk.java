import java.util.Iterator;
import java.util.List;

public class cvk extends cti {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private cvo d = cju.a.m();
   private gy e;
   private boolean f;
   private boolean g;
   private static final ThreadLocal<gy> h = ThreadLocal.withInitial(() -> null);
   private float i;
   private float j;
   private long k;
   private int l;

   public cvk(gt $$0, cvo $$1) {
      super(ctk.j, $$0, $$1);
   }

   public cvk(gt $$0, cvo $$1, cvo $$2, gy $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   public boolean c() {
      return this.f;
   }

   public gy d() {
      return this.e;
   }

   public boolean f() {
      return this.g;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return ami.i($$0, this.j, this.i);
   }

   public float b(float $$0) {
      return (float)this.e.j() * this.e(this.a($$0));
   }

   public float c(float $$0) {
      return (float)this.e.k() * this.e(this.a($$0));
   }

   public float d(float $$0) {
      return (float)this.e.l() * this.e(this.a($$0));
   }

   private float e(float $$0) {
      return this.f ? $$0 - 1.0F : 1.0F - $$0;
   }

   private cvo w() {
      return !this.c() && this.f() && this.d.b() instanceof cvh
         ? cju.bm.m().a(cvi.c, Boolean.valueOf(this.i > 0.25F)).a(cvi.b, this.d.a(cju.be) ? cwq.b : cwq.a).a(cvi.a, (gy)this.d.c(cvh.a))
         : this.d;
   }

   private static void a(cgx $$0, gt $$1, float $$2, cvk $$3) {
      gy $$4 = $$3.g();
      double $$5 = (double)($$2 - $$3.i);
      dxj $$6 = $$3.w().k($$0, $$1);
      if (!$$6.b()) {
         dwl $$7 = a($$1, $$6.a(), $$3);
         List<bbn> $$8 = $$0.a_(null, cvj.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<dwl> $$9 = $$6.d();
            boolean $$10 = $$3.d.a(cju.gT);
            Iterator var12 = $$8.iterator();

            while(true) {
               bbn $$11;
               while(true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bbn)var12.next();
                  if ($$11.c_() != dqb.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof agh)) {
                        dwq $$12 = $$11.dd();
                        double $$13 = $$12.c;
                        double $$14 = $$12.d;
                        double $$15 = $$12.e;
                        switch($$4.o()) {
                           case a:
                              $$13 = (double)$$4.j();
                              break;
                           case b:
                              $$14 = (double)$$4.k();
                              break;
                           case c:
                              $$15 = (double)$$4.l();
                        }

                        $$11.n($$13, $$14, $$15);
                        break;
                     }
                  }
               }

               double $$16 = 0.0;

               for(dwl $$17 : $$9) {
                  dwl $$18 = cvj.a(a($$1, $$17, $$3), $$4, $$5);
                  dwl $$19 = $$11.cy();
                  if ($$18.c($$19)) {
                     $$16 = Math.max($$16, a($$18, $$4, $$19));
                     if ($$16 >= $$5) {
                        break;
                     }
                  }
               }

               if (!($$16 <= 0.0)) {
                  $$16 = Math.min($$16, $$5) + 0.01;
                  a($$4, $$11, $$16, $$4);
                  if (!$$3.f && $$3.g) {
                     a($$1, $$11, $$4, $$5);
                  }
               }
            }
         }
      }
   }

   private static void a(gy $$0, bbn $$1, double $$2, gy $$3) {
      h.set($$0);
      $$1.a(bci.c, new dwq($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
      h.set(null);
   }

   private static void b(cgx $$0, gt $$1, float $$2, cvk $$3) {
      if ($$3.x()) {
         gy $$4 = $$3.g();
         if ($$4.o().d()) {
            double $$5 = $$3.d.k($$0, $$1).c(gy.a.b);
            dwl $$6 = a($$1, new dwl(0.0, $$5, 0.0, 1.0, 1.5000000999999998, 1.0), $$3);
            double $$7 = (double)($$2 - $$3.i);

            for(bbn $$9 : $$0.a((bbn)null, $$6, $$1x -> a($$6, $$1x))) {
               a($$4, $$9, $$7, $$4);
            }

         }
      }
   }

   private static boolean a(dwl $$0, bbn $$1) {
      return $$1.c_() == dqb.a && $$1.aw() && $$1.df() >= $$0.a && $$1.df() <= $$0.d && $$1.dl() >= $$0.c && $$1.dl() <= $$0.f;
   }

   private boolean x() {
      return this.d.a(cju.nR);
   }

   public gy g() {
      return this.f ? this.e : this.e.g();
   }

   private static double a(dwl $$0, gy $$1, dwl $$2) {
      switch($$1) {
         case f:
            return $$0.d - $$2.a;
         case e:
            return $$2.d - $$0.a;
         case b:
         default:
            return $$0.e - $$2.b;
         case a:
            return $$2.e - $$0.b;
         case d:
            return $$0.f - $$2.c;
         case c:
            return $$2.f - $$0.c;
      }
   }

   private static dwl a(gt $$0, dwl $$1, cvk $$2) {
      double $$3 = (double)$$2.e($$2.i);
      return $$1.d((double)$$0.u() + $$3 * (double)$$2.e.j(), (double)$$0.v() + $$3 * (double)$$2.e.k(), (double)$$0.w() + $$3 * (double)$$2.e.l());
   }

   private static void a(gt $$0, bbn $$1, gy $$2, double $$3) {
      dwl $$4 = $$1.cy();
      dwl $$5 = dxg.b().a().a($$0);
      if ($$4.c($$5)) {
         gy $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }

   }

   public cvo i() {
      return this.d;
   }

   public void j() {
      if (this.n != null && (this.j < 1.0F || this.n.y)) {
         this.i = 1.0F;
         this.j = this.i;
         this.n.n(this.o);
         this.ab_();
         if (this.n.a_(this.o).a(cju.bD)) {
            cvo $$0;
            if (this.g) {
               $$0 = cju.a.m();
            } else {
               $$0 = cjt.b(this.d, this.n, this.o);
            }

            this.n.a(this.o, $$0, 3);
            this.n.a(this.o, $$0.b(), this.o);
         }
      }

   }

   public static void a(cgx $$0, gt $$1, cvo $$2, cvk $$3) {
      $$3.k = $$0.U();
      $$3.j = $$3.i;
      if ($$3.j >= 1.0F) {
         if ($$0.y && $$3.l < 5) {
            ++$$3.l;
         } else {
            $$0.n($$1);
            $$3.ab_();
            if ($$0.a_($$1).a(cju.bD)) {
               cvo $$4 = cjt.b($$3.d, $$0, $$1);
               if ($$4.h()) {
                  $$0.a($$1, $$3.d, 84);
                  cjt.a($$3.d, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(cwe.C) && $$4.c(cwe.C)) {
                     $$4 = $$4.a(cwe.C, Boolean.valueOf(false));
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.a($$1, $$4.b(), $$1);
               }
            }

         }
      } else {
         float $$5 = $$3.i + 0.5F;
         a($$0, $$1, $$5, $$3);
         b($$0, $$1, $$5, $$3);
         $$3.i = $$5;
         if ($$3.i >= 1.0F) {
            $$3.i = 1.0F;
         }

      }
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.d = pv.c($$0.p("blockState"));
      this.e = gy.a($$0.h("facing"));
      this.i = $$0.j("progress");
      this.j = this.i;
      this.f = $$0.q("extending");
      this.g = $$0.q("source");
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("blockState", (qc)pv.a(this.d));
      $$0.a("facing", this.e.d());
      $$0.a("progress", this.j);
      $$0.a("extending", this.f);
      $$0.a("source", this.g);
   }

   public dxj a(cgd $$0, gt $$1) {
      dxj $$2;
      if (!this.f && this.g && this.d.b() instanceof cvh) {
         $$2 = this.d.a(cvh.b, Boolean.valueOf(true)).k($$0, $$1);
      } else {
         $$2 = dxg.a();
      }

      gy $$4 = (gy)h.get();
      if ((double)this.i < 1.0 && $$4 == this.g()) {
         return $$2;
      } else {
         cvo $$5;
         if (this.f()) {
            $$5 = cju.bm.m().a(cvi.a, this.e).a(cvi.c, Boolean.valueOf(this.f != 1.0F - this.i < 0.25F));
         } else {
            $$5 = this.d;
         }

         float $$7 = this.e(this.i);
         double $$8 = (double)((float)this.e.j() * $$7);
         double $$9 = (double)((float)this.e.k() * $$7);
         double $$10 = (double)((float)this.e.l() * $$7);
         return dxg.a($$2, $$5.k($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long t() {
      return this.k;
   }
}
