import java.util.Collection;
import javax.annotation.Nullable;

public class bzl extends cat {
   public bzl(cat.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cax $$0) {
      return true;
   }

   @Override
   public boolean a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
      if (!$$1.y) {
         this.a($$3, $$0, $$1, $$2, false, $$3.b(bai.a));
      }

      return false;
   }

   @Override
   public baj a(ccz $$0) {
      buc $$1 = $$0.o();
      cgx $$2 = $$0.q();
      if (!$$2.y && $$1 != null) {
         gt $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return baj.e;
         }
      }

      return baj.a($$2.y);
   }

   private boolean a(buc $$0, cvo $$1, cgy $$2, gt $$3, boolean $$4, cax $$5) {
      if (!$$0.fY()) {
         return false;
      } else {
         cjt $$6 = $$1.b();
         cvp<cjt, cvo> $$7 = $$6.k();
         Collection<cwr<?>> $$8 = $$7.d();
         String $$9 = hm.V.b($$6).toString();
         if ($$8.isEmpty()) {
            a($$0, rq.a(this.a() + ".empty", $$9));
            return false;
         } else {
            pj $$10 = $$5.a("DebugProperty");
            String $$11 = $$10.l($$9);
            cwr<?> $$12 = $$7.a($$11);
            if ($$4) {
               if ($$12 == null) {
                  $$12 = (cwr)$$8.iterator().next();
               }

               cvo $$13 = a($$1, $$12, $$0.fo());
               $$2.a($$3, $$13, 18);
               a($$0, rq.a(this.a() + ".update", $$12.f(), a($$13, $$12)));
            } else {
               $$12 = a($$8, $$12, $$0.fo());
               String $$14 = $$12.f();
               $$10.a($$9, $$14);
               a($$0, rq.a(this.a() + ".select", $$14, a($$1, $$12)));
            }

            return true;
         }
      }
   }

   private static <T extends Comparable<T>> cvo a(cvo $$0, cwr<T> $$1, boolean $$2) {
      return $$0.a($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return (T)($$2 ? ad.b($$0, $$1) : ad.a($$0, $$1));
   }

   private static void a(buc $$0, rq $$1) {
      ((agh)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(cvo $$0, cwr<T> $$1) {
      return $$1.a($$0.c($$1));
   }
}
