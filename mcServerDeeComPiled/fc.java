import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fc implements Predicate<cvs> {
   private final cvo a;
   private final Set<cwr<?>> b;
   @Nullable
   private final pj c;

   public fc(cvo $$0, Set<cwr<?>> $$1, @Nullable pj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cvo a() {
      return this.a;
   }

   public Set<cwr<?>> b() {
      return this.b;
   }

   public boolean a(cvs $$0) {
      cvo $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for(cwr<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            cti $$3 = $$0.b();
            return $$3 != null && pv.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(agg $$0, gt $$1) {
      return this.a(new cvs($$0, $$1, false));
   }

   public boolean a(agg $$0, gt $$1, int $$2) {
      cvo $$3 = cjt.b(this.a, $$0, $$1);
      if ($$3.h()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            cti $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
