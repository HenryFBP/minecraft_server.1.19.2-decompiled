import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class qj extends qk {
   private int a;
   private final Set<qe<?>> b;
   private final Deque<qm> c = new ArrayDeque();

   public qj(ql... $$0) {
      this.a = $$0.length;
      Builder<qe<?>> $$1 = ImmutableSet.builder();
      qm $$2 = qm.a();

      for(ql $$3 : $$0) {
         $$2.a($$3);
         $$1.add($$3.b());
      }

      this.c.push($$2);
      $$1.add(pj.b);
      this.b = $$1.build();
   }

   @Override
   public pz.b b(qe<?> $$0) {
      return $$0 != pj.b ? pz.b.c : super.b($$0);
   }

   @Override
   public pz.a a(qe<?> $$0) {
      qm $$1 = (qm)this.c.element();
      if (this.e() > $$1.b()) {
         return super.a($$0);
      } else if (this.a <= 0) {
         return pz.a.d;
      } else {
         return !this.b.contains($$0) ? pz.a.b : super.a($$0);
      }
   }

   @Override
   public pz.a a(qe<?> $$0, String $$1) {
      qm $$2 = (qm)this.c.element();
      if (this.e() > $$2.b()) {
         return super.a($$0, $$1);
      } else if ($$2.c().remove($$1, $$0)) {
         --this.a;
         return super.a($$0, $$1);
      } else {
         if ($$0 == pj.b) {
            qm $$3 = (qm)$$2.d().get($$1);
            if ($$3 != null) {
               this.c.push($$3);
               return super.a($$0, $$1);
            }
         }

         return pz.a.b;
      }
   }

   @Override
   public pz.b b() {
      if (this.e() == ((qm)this.c.element()).b()) {
         this.c.pop();
      }

      return super.b();
   }

   public int c() {
      return this.a;
   }
}
