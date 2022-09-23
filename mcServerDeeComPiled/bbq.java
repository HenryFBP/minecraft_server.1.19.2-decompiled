import com.google.common.base.Predicates;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bbq {
   public static final Predicate<bbn> a = bbn::bo;
   public static final Predicate<bbn> b = $$0 -> $$0.bo() && $$0 instanceof bcc;
   public static final Predicate<bbn> c = $$0 -> $$0.bo() && !$$0.bJ() && !$$0.bI();
   public static final Predicate<bbn> d = $$0 -> $$0 instanceof bac && $$0.bo();
   public static final Predicate<bbn> e = $$0 -> !($$0 instanceof buc) || !$$0.B_() && !((buc)$$0).f();
   public static final Predicate<bbn> f = $$0 -> !$$0.B_();
   public static final Predicate<bbn> g = f.and(bbn::bq);

   private bbq() {
   }

   public static Predicate<bbn> a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$3 * $$3;
      return $$4x -> $$4x != null && $$4x.h($$0, $$1, $$2) <= $$4;
   }

   public static Predicate<bbn> a(bbn $$0) {
      dxq $$1 = $$0.bY();
      dxq.a $$2 = $$1 == null ? dxq.a.a : $$1.l();
      return (Predicate<bbn>)($$2 == dxq.a.b ? Predicates.alwaysFalse() : f.and($$3 -> {
         if (!$$3.bl()) {
            return false;
         } else if (!$$0.s.y || $$3 instanceof buc && ((buc)$$3).fx()) {
            dxq $$4 = $$3.bY();
            dxq.a $$5 = $$4 == null ? dxq.a.a : $$4.l();
            if ($$5 == dxq.a.b) {
               return false;
            } else {
               boolean $$6 = $$1 != null && $$1.a($$4);
               if (($$2 == dxq.a.d || $$5 == dxq.a.d) && $$6) {
                  return false;
               } else {
                  return $$2 != dxq.a.c && $$5 != dxq.a.c || $$6;
               }
            }
         } else {
            return false;
         }
      }));
   }

   public static Predicate<bbn> b(bbn $$0) {
      return $$1 -> {
         while($$1.bI()) {
            $$1 = $$1.cQ();
            if ($$1 == $$0) {
               return false;
            }
         }

         return true;
      };
   }

   public static class a implements Predicate<bbn> {
      private final cax a;

      public a(cax $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bbn $$0) {
         if (!$$0.bo()) {
            return false;
         } else if (!($$0 instanceof bcc)) {
            return false;
         } else {
            bcc $$1 = (bcc)$$0;
            return $$1.g(this.a);
         }
      }
   }
}
