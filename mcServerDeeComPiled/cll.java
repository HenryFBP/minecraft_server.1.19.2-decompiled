public abstract class cll extends cnf {
   protected static final dxj b = cjt.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final cwf c = cwe.w;

   protected cll(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return c($$1, $$2.c());
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!this.a((cha)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((cgx)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), dye.b);
            }
         }

      }
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(aD) == $$3 ? this.b($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if ($$0.a((cha)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         cti $$6 = $$0.o() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for(gy $$7 : gy.values()) {
            $$1.a($$2.a($$7), this);
         }

      }
   }

   protected void c(cgx $$0, gt $$1, cvo $$2) {
      if (!this.a((cha)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.K().b($$1, this)) {
            dye $$5 = dye.c;
            if (this.c((cgd)$$0, $$1, $$2)) {
               $$5 = dye.a;
            } else if ($$3) {
               $$5 = dye.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }

      }
   }

   public boolean a(cha $$0, gt $$1, cvo $$2) {
      return false;
   }

   protected boolean a(cgx $$0, gt $$1, cvo $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cgx $$0, gt $$1, cvo $$2) {
      gy $$3 = $$2.c(aD);
      gt $$4 = $$1.a($$3);
      int $$5 = $$0.b($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         cvo $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cju.ch) ? $$6.c(cpl.e) : 0);
      }
   }

   protected int b(cha $$0, gt $$1, cvo $$2) {
      gy $$3 = $$2.c(aD);
      gy $$4 = $$3.h();
      gy $$5 = $$3.i();
      return Math.max(this.b($$0, $$1.a($$4), $$4), this.b($$0, $$1.a($$5), $$5));
   }

   protected int b(cha $$0, gt $$1, gy $$2) {
      cvo $$3 = $$0.a_($$1);
      if (this.h($$3)) {
         if ($$3.a(cju.gb)) {
            return 15;
         } else {
            return $$3.a(cju.ch) ? $$3.c(cpl.e) : $$0.c($$1, $$2);
         }
      } else {
         return 0;
      }
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(aD, $$0.g().g());
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }

   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cgx $$0, gt $$1, cvo $$2) {
      gy $$3 = $$2.c(aD);
      gt $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean h(cvo $$0) {
      return $$0.j();
   }

   protected int b(cgd $$0, gt $$1, cvo $$2) {
      return 15;
   }

   public static boolean n(cvo $$0) {
      return $$0.b() instanceof cll;
   }

   public boolean c(cgd $$0, gt $$1, cvo $$2) {
      gy $$3 = ((gy)$$2.c(aD)).g();
      cvo $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aD) != $$3;
   }

   protected abstract int g(cvo var1);
}
