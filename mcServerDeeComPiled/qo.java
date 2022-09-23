import java.util.ArrayDeque;
import java.util.Deque;

public class qo extends qk {
   private final Deque<qm> a = new ArrayDeque();

   public qo(ql... $$0) {
      qm $$1 = qm.a();

      for(ql $$2 : $$0) {
         $$1.a($$2);
      }

      this.a.push($$1);
   }

   @Override
   public pz.a a(qe<?> $$0, String $$1) {
      qm $$2 = (qm)this.a.element();
      if ($$2.a($$0, $$1)) {
         return pz.a.b;
      } else {
         if ($$0 == pj.b) {
            qm $$3 = (qm)$$2.d().get($$1);
            if ($$3 != null) {
               this.a.push($$3);
            }
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public pz.b b() {
      if (this.e() == ((qm)this.a.element()).b()) {
         this.a.pop();
      }

      return super.b();
   }
}
