import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dfl extends dfi {
   public dfl(Codec<dgw> $$0) {
      super($$0);
   }

   @Override
   protected Set<gt> a(chp $$0, dgw $$1, amn $$2, gt $$3, Predicate<cvo> $$4, int $$5, int $$6) {
      Set<gt> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<gt> $$8 = new HashSet();
      gt.a $$9 = new gt.a();

      for(gt $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for(gt $$11 : $$8) {
         $$0.a($$11, cju.C.m(), 2);
      }

      return $$8;
   }

   private static boolean a(chp $$0, Set<gt> $$1, gt $$2, gt.a $$3) {
      return a($$0, $$2, $$3, gy.c) || a($$0, $$2, $$3, gy.f) || a($$0, $$2, $$3, gy.d) || a($$0, $$2, $$3, gy.e) || a($$0, $$2, $$3, gy.a);
   }

   private static boolean a(chp $$0, gt $$1, gt.a $$2, gy $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(chp $$0, dgw $$1, cxk $$2, amn $$3, gt $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.c())) {
         cvo $$5 = $$0.a_($$4);
         if ($$5.b(cwe.C) && !$$5.c(cwe.C)) {
            $$0.a($$4, $$5.a(cwe.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
