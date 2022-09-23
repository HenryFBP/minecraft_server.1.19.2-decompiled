public class clf extends cka implements cjv {
   public static final int c = 7;
   public static final cwo d = cwe.av;
   private static final dxj[] a = new dxj[]{
      cjt.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   protected clf(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a[$$0.c(this.b())];
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.a(cju.cn);
   }

   public cwo b() {
      return d;
   }

   public int c() {
      return 7;
   }

   protected int g(cvo $$0) {
      return $$0.c(this.b());
   }

   public cvo b(int $$0) {
      return this.m().a(this.b(), Integer.valueOf($$0));
   }

   public boolean h(cvo $$0) {
      return $$0.c(this.b()) >= this.c();
   }

   @Override
   public boolean e_(cvo $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.g($$0);
         if ($$4 < this.c()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }

   }

   public void a(cgx $$0, gt $$1, cvo $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cgx $$0) {
      return ami.a($$0.w, 2, 5);
   }

   protected static float a(cjt $$0, cgd $$1, gt $$2) {
      float $$3 = 1.0F;
      gt $$4 = $$2.c();

      for(int $$5 = -1; $$5 <= 1; ++$$5) {
         for(int $$6 = -1; $$6 <= 1; ++$$6) {
            float $$7 = 0.0F;
            cvo $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cju.cn)) {
               $$7 = 1.0F;
               if ($$8.c(cmf.a) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      gt $$9 = $$2.d();
      gt $$10 = $$2.e();
      gt $$11 = $$2.f();
      gt $$12 = $$2.g();
      boolean $$13 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
      boolean $$14 = $$1.a_($$9).a($$0) || $$1.a_($$10).a($$0);
      if ($$13 && $$14) {
         $$3 /= 2.0F;
      } else {
         boolean $$15 = $$1.a_($$11.d()).a($$0) || $$1.a_($$12.d()).a($$0) || $$1.a_($$12.e()).a($$0) || $$1.a_($$11.e()).a($$0);
         if ($$15) {
            $$3 /= 2.0F;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return ($$1.b($$2, 0) >= 8 || $$1.g($$2)) && super.a($$0, $$1, $$2);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if ($$3 instanceof brv && $$1.W().b(cgt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cgw d() {
      return caz.nR;
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(this.d());
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      this.a((cgx)$$0, $$2, $$3);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d);
   }
}
