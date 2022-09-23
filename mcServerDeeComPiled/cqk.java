public abstract class cqk extends cjg implements cql {
   public static final cwf a = cwe.C;
   protected static final float b = 4.0F;
   protected static final dxj c = cjt.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final cxa d;

   protected cqk(cvn.c $$0, cxa $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c;
   }

   @Override
   public boolean Y_() {
      return true;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cuk($$0, $$1);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      cat $$7 = $$6.c();
      boolean $$8 = $$7 instanceof bzr;
      boolean $$9 = $$6.a(caz.pp);
      boolean $$10 = $$6.a(caz.po);
      boolean $$11 = ($$9 || $$8 || $$10) && $$3.fB().e;
      if ($$1.y) {
         return $$11 ? baj.a : baj.b;
      } else {
         cti $$12 = $$1.c_($$2);
         if (!($$12 instanceof cuk)) {
            return baj.d;
         } else {
            cuk $$13 = (cuk)$$12;
            boolean $$14 = $$13.i();
            if ((!$$9 || !$$14) && (!$$10 || $$14)) {
               if ($$11) {
                  boolean $$15;
                  if ($$9) {
                     $$1.a(null, $$2, ajw.hK, ajx.e, 1.0F, 1.0F);
                     $$15 = $$13.b(true);
                     if ($$3 instanceof agh) {
                        aj.M.a((agh)$$3, $$2, $$6);
                     }
                  } else if ($$10) {
                     $$1.a(null, $$2, ajw.jL, ajx.e, 1.0F, 1.0F);
                     $$15 = $$13.b(false);
                  } else {
                     $$1.a(null, $$2, ajw.fg, ajx.e, 1.0F, 1.0F);
                     $$15 = $$13.a(((bzr)$$7).d());
                  }

                  if ($$15) {
                     if (!$$3.f()) {
                        $$6.g(1);
                     }

                     $$3.b(akg.c.b($$7));
                  }
               }

               return $$13.a((agh)$$3) ? baj.a : baj.d;
            } else {
               return baj.d;
            }
         }
      }
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(a) ? dpw.c.a(false) : super.c_($$0);
   }

   public cxa d() {
      return this.d;
   }
}
