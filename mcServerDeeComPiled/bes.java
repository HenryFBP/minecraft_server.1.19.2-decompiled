import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bes<E extends bce> extends bet<E> {
   private final akz<cjt> m;
   private final float n;
   private final List<bet.a> o = new ArrayList();
   private boolean p;

   public bes(azu $$0, int $$1, int $$2, float $$3, Function<E, ajv> $$4, akz<cjt> $$5, float $$6, Predicate<cvo> $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$7);
      this.m = $$5;
      this.n = $$6;
   }

   @Override
   protected void a(agg $$0, E $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.o.clear();
      this.p = $$1.dQ().i() < this.n;
   }

   @Override
   protected Optional<bet.a> a(agg $$0) {
      if (!this.p) {
         return super.a($$0);
      } else {
         gt.a $$1 = new gt.a();

         while(!this.h.isEmpty()) {
            Optional<bet.a> $$2 = super.a($$0);
            if ($$2.isPresent()) {
               bet.a $$3 = (bet.a)$$2.get();
               if ($$0.a_($$1.a($$3.b(), gy.a)).a(this.m)) {
                  return $$2;
               }

               this.o.add($$3);
            }
         }

         return !this.o.isEmpty() ? Optional.of((bet.a)this.o.remove(0)) : Optional.empty();
      }
   }

   @Override
   protected boolean a(agg $$0, E $$1, gt $$2) {
      return super.a($$0, $$1, $$2) && this.a($$0, $$2);
   }

   private boolean a(agg $$0, gt $$1) {
      return $$0.b_($$1).c() && $$0.b_($$1.c()).c();
   }
}
