import java.util.function.Supplier;

public class com extends cka implements cjv {
   protected static final float a = 3.0F;
   protected static final dxj b = cjt.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final Supplier<hc<? extends ddg<?, ?>>> c;

   public com(cvn.c $$0, Supplier<hc<? extends ddg<?, ?>>> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for(gt $$6 : gt.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this) && --$$4 <= 0) {
               return;
            }
         }

         gt $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for(int $$8 = 0; $$8 < 4; ++$$8) {
            if ($$1.x($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.x($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }

   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      cvo $$4 = $$1.a_($$3);
      if ($$4.a(akl.aR)) {
         return true;
      } else {
         return $$1.b($$2, 0) < 13 && this.d($$4, $$1, $$3);
      }
   }

   public boolean a(agg $$0, gt $$1, cvo $$2, amn $$3) {
      $$0.a($$1, false);
      if (((ddg)((hc)this.c.get()).a()).a($$0, $$0.k().g(), $$3, $$1)) {
         return true;
      } else {
         $$0.a($$1, $$2, 3);
         return false;
      }
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return true;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
