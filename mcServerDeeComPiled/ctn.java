public class ctn extends cuf implements cue {
   private static final int b = 1;
   private hi<cax> c = hi.a(27, cax.b);
   private final cts f = new cts() {
      @Override
      protected void a(cgx $$0, gt $$1, cvo $$2) {
         ctn.a($$0, $$1, $$2, ajw.cZ);
      }

      @Override
      protected void b(cgx $$0, gt $$1, cvo $$2) {
         ctn.a($$0, $$1, $$2, ajw.cX);
      }

      @Override
      protected void a(cgx $$0, gt $$1, cvo $$2, int $$3, int $$4) {
         ctn.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(buc $$0) {
         if (!($$0.bU instanceof bwt)) {
            return false;
         } else {
            bac $$1 = ((bwt)$$0.bU).l();
            return $$1 == ctn.this || $$1 instanceof bab && ((bab)$$1).a(ctn.this);
         }
      }
   };
   private final cto i = new cto();

   protected ctn(ctk<?> $$0, gt $$1, cvo $$2) {
      super($$0, $$1, $$2);
   }

   public ctn(gt $$0, cvo $$1) {
      this(ctk.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected rq g() {
      return rq.c("container.chest");
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.c = hi.a(this.b(), cax.b);
      if (!this.d($$0)) {
         bad.b($$0, this.c);
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bad.a($$0, this.c);
      }

   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctn $$3) {
      $$3.i.a();
   }

   static void a(cgx $$0, gt $$1, cvo $$2, ajv $$3) {
      cwg $$4 = $$2.c(ckr.c);
      if ($$4 != cwg.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == cwg.c) {
            gy $$8 = ckr.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, ajx.e, 0.5F, $$0.w.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.i.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(buc $$0) {
      if (!this.p && !$$0.B_()) {
         this.f.a($$0, this.k(), this.p(), this.q());
      }

   }

   @Override
   public void c_(buc $$0) {
      if (!this.p && !$$0.B_()) {
         this.f.b($$0, this.k(), this.p(), this.q());
      }

   }

   @Override
   protected hi<cax> f() {
      return this.c;
   }

   @Override
   protected void a(hi<cax> $$0) {
      this.c = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.i.a($$0);
   }

   public static int a(cgd $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      if ($$2.o()) {
         cti $$3 = $$0.c_($$1);
         if ($$3 instanceof ctn) {
            return ((ctn)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(ctn $$0, ctn $$1) {
      hi<cax> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected bwm a(int $$0, bub $$1) {
      return bwt.a($$0, $$1, this);
   }

   public void i() {
      if (!this.p) {
         this.f.c(this.k(), this.p(), this.q());
      }

   }

   protected void a(cgx $$0, gt $$1, cvo $$2, int $$3, int $$4) {
      cjt $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
