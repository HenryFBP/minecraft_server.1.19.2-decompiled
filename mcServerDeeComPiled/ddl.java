import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class ddl extends ddt<dft> {
   private static final ImmutableList<cjt> a = ImmutableList.of(cju.B, cju.eu, cju.ev, cju.ew, cju.ex, cju.cg, cju.ce);
   private static final gy[] b = gy.values();
   private static final double c = 0.9;

   public ddl(Codec<dft> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dft> $$0) {
      boolean $$1 = false;
      amn $$2 = $$0.d();
      chp $$3 = $$0.b();
      dft $$4 = $$0.f();
      gt $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for(gt $$13 : gt.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            gt $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(cgy $$0, gt $$1, dft $$2) {
      cvo $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for(gy $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).h();
            if ($$5 && $$4 != gy.b || !$$5 && $$4 == gy.b) {
               return false;
            }
         }

         return true;
      }
   }
}
