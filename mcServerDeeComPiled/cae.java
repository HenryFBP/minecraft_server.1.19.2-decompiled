public class cae extends cat {
   public cae(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!cke.h($$3) && !ckf.g($$3) && !ckg.g($$3)) {
         $$2 = $$2.a($$0.k());
         if (cjh.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.b($$2, cjh.a($$1, $$2));
            $$1.a($$0.o(), czv.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.b($$2, $$3.a(cwe.r, Boolean.valueOf(true)));
         $$1.a($$0.o(), czv.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().g(1);
         return baj.a($$1.y);
      } else {
         return baj.e;
      }
   }

   private void a(cgx $$0, gt $$1) {
      amn $$2 = $$0.r_();
      $$0.a(null, $$1, ajw.ge, ajx.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }
}
