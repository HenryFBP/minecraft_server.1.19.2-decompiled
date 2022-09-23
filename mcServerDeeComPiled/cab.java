public class cab extends cat {
   public cab(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      if (!$$3.a(cju.eF) || $$3.c(cly.b)) {
         return baj.d;
      } else if ($$1.y) {
         return baj.a;
      } else {
         cvo $$4 = $$3.a(cly.b, Boolean.valueOf(true));
         cjt.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, cju.eF);
         $$0.n().g(1);
         $$1.c(1503, $$2, 0);
         cvt.b $$5 = cly.b().a($$1, $$2);
         if ($$5 != null) {
            gt $$6 = $$5.a().b(-3, 0, -3);

            for(int $$7 = 0; $$7 < 3; ++$$7) {
               for(int $$8 = 0; $$8 < 3; ++$$8) {
                  $$1.a($$6.b($$7, 0, $$8), cju.eE.m(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return baj.b;
      }
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      dwo $$4 = a($$0, $$1, cgg.b.a);
      if ($$4.c() == dwo.a.b && $$0.a_(((dwm)$$4).a()).a(cju.eF)) {
         return bak.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof agg $$5) {
            gt $$6 = $$5.a(akv.a, $$1.da(), 100, false);
            if ($$6 != null) {
               bun $$7 = new bun($$0, $$1.df(), $$1.e(0.5), $$1.dl());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(czv.M, $$7.cY(), czv.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof agh) {
                  aj.m.a((agh)$$1, $$6);
               }

               $$0.a(null, $$1.df(), $$1.dh(), $$1.dl(), ajw.fC, ajx.g, 0.5F, 0.4F / ($$0.r_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.da(), 0);
               if (!$$1.fB().d) {
                  $$3.g(1);
               }

               $$1.b(akg.c.b(this));
               $$1.a($$2, true);
               return bak.a($$3);
            }
         }

         return bak.b($$3);
      }
   }
}
