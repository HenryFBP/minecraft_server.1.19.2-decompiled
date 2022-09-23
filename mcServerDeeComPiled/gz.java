import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum gz {
   a(gy.c),
   b(gy.c, gy.f),
   c(gy.f),
   d(gy.d, gy.f),
   e(gy.d),
   f(gy.d, gy.e),
   g(gy.e),
   h(gy.c, gy.e);

   private final Set<gy> i;
   private final hs j;

   private gz(gy... $$0) {
      this.i = Sets.immutableEnumSet(Arrays.asList($$0));
      this.j = new hs(0, 0, 0);

      for(gy $$1 : $$0) {
         this.j.u(this.j.u() + $$1.j()).t(this.j.v() + $$1.k()).s(this.j.w() + $$1.l());
      }

   }

   public Set<gy> a() {
      return this.i;
   }

   public int b() {
      return this.j.u();
   }

   public int c() {
      return this.j.w();
   }
}
