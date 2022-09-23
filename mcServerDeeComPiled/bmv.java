import java.util.Set;
import java.util.function.Predicate;

public record bmv(Set<cvo> b, int c, int d) {
   public static final Predicate<hc<bmv>> a = $$0 -> false;

   public bmv(Set<cvo> $$0, int $$1, int $$2) {
      $$0 = Set.copyOf($$0);
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public boolean a(cvo $$0) {
      return this.b.contains($$0);
   }

   public Set<cvo> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }
}
