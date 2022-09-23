import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Set;

public class duj {
   private final Set<dui<?>> a;
   private final Set<dui<?>> b;

   duj(Set<dui<?>> $$0, Set<dui<?>> $$1) {
      this.a = ImmutableSet.copyOf($$0);
      this.b = ImmutableSet.copyOf(Sets.union($$0, $$1));
   }

   public boolean a(dui<?> $$0) {
      return this.b.contains($$0);
   }

   public Set<dui<?>> a() {
      return this.a;
   }

   public Set<dui<?>> b() {
      return this.b;
   }

   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public void a(dsl $$0, dse $$1) {
      Set<dui<?>> $$2 = $$1.b();
      Set<dui<?>> $$3 = Sets.difference($$2, this.b);
      if (!$$3.isEmpty()) {
         $$0.a("Parameters " + $$3 + " are not provided in this context");
      }

   }

   public static duj.a c() {
      return new duj.a();
   }

   public static class a {
      private final Set<dui<?>> a = Sets.newIdentityHashSet();
      private final Set<dui<?>> b = Sets.newIdentityHashSet();

      public duj.a a(dui<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public duj.a b(dui<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public duj a() {
         return new duj(this.a, this.b);
      }
   }
}
