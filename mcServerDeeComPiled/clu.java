public class clu extends clo {
   private static final hz c = new hy();

   public clu(cvn.c $$0) {
      super($$0);
   }

   @Override
   protected hz a(cax $$0) {
      return c;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctv($$0, $$1);
   }

   @Override
   protected void a(agg $$0, gt $$1) {
      gv $$2 = new gv($$0, $$1);
      ctu $$3 = $$2.f();
      int $$4 = $$3.a($$0.w);
      if ($$4 < 0) {
         $$0.c(1001, $$1, 0);
      } else {
         cax $$5 = $$3.a($$4);
         if (!$$5.b()) {
            gy $$6 = $$0.a_($$1).c(a);
            bac $$7 = cua.a($$0, $$1.a($$6));
            cax $$8;
            if ($$7 == null) {
               $$8 = c.dispense($$2, $$5);
            } else {
               $$8 = cua.a($$3, $$7, $$5.o().a(1), $$6.g());
               if ($$8.b()) {
                  $$8 = $$5.o();
                  $$8.g(1);
               } else {
                  $$8 = $$5.o();
               }
            }

            $$3.a($$4, $$8);
         }
      }
   }
}
