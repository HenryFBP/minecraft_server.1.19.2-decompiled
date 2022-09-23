import java.util.List;
import java.util.function.Predicate;

public class cxq<T> implements cxy<T> {
   private final hf<T> a;

   public cxq(hf<T> $$0) {
      this.a = $$0;
   }

   public static <A> cxy<A> a(int $$0, hf<A> $$1, cxz<A> $$2, List<A> $$3) {
      return new cxq<>($$1);
   }

   @Override
   public int a(T $$0) {
      int $$1 = this.a.a($$0);
      return $$1 == -1 ? 0 : $$1;
   }

   @Override
   public boolean a(Predicate<T> $$0) {
      return true;
   }

   @Override
   public T a(int $$0) {
      T $$1 = this.a.a($$0);
      if ($$1 == null) {
         throw new cxx($$0);
      } else {
         return $$1;
      }
   }

   @Override
   public void a(qx $$0) {
   }

   @Override
   public void b(qx $$0) {
   }

   @Override
   public int a() {
      return qx.a(0);
   }

   @Override
   public int b() {
      return this.a.b();
   }

   @Override
   public cxy<T> c() {
      return this;
   }
}
