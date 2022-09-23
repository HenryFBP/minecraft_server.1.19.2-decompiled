public class dds extends ddt<dge> {
   public static final int a = 4;
   public static final int b = 4;
   public static final int c = 1;
   public static final float d = 0.5F;
   public static final gt e = gt.b;
   private final boolean ao;

   public dds(boolean $$0) {
      super(dge.a);
      this.ao = $$0;
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      gt $$1 = $$0.e();
      chp $$2 = $$0.b();

      for(gt $$3 : gt.a(new gt($$1.u() - 4, $$1.v() - 1, $$1.w() - 4), new gt($$1.u() + 4, $$1.v() + 32, $$1.w() + 4))) {
         boolean $$4 = $$3.a($$1, 2.5);
         if ($$4 || $$3.a($$1, 3.5)) {
            if ($$3.v() < $$1.v()) {
               if ($$4) {
                  this.a($$2, $$3, cju.B.m());
               } else if ($$3.v() < $$1.v()) {
                  this.a($$2, $$3, cju.eG.m());
               }
            } else if ($$3.v() > $$1.v()) {
               this.a($$2, $$3, cju.a.m());
            } else if (!$$4) {
               this.a($$2, $$3, cju.B.m());
            } else if (this.ao) {
               this.a($$2, new gt($$3), cju.eE.m());
            } else {
               this.a($$2, new gt($$3), cju.a.m());
            }
         }
      }

      for(int $$5 = 0; $$5 < 4; ++$$5) {
         this.a($$2, $$1.b($$5), cju.B.m());
      }

      gt $$6 = $$1.b(2);

      for(gy $$7 : gy.c.a) {
         this.a($$2, $$6.a($$7), cju.cb.m().a(csh.a, $$7));
      }

      return true;
   }
}
