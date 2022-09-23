import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class czm<T extends czc> implements czl<T> {
   private final cze<T> a;
   private final czh<T> b;

   public czm(cze<T> $$0, czh<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return this.a.a($$0);
   }

   @Nullable
   @Override
   public T a(UUID $$0) {
      return this.a.a($$0);
   }

   @Override
   public Iterable<T> a() {
      return this.a.a();
   }

   @Override
   public <U extends T> void a(czj<T, U> $$0, Consumer<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(dwl $$0, Consumer<T> $$1) {
      this.b.b($$0, $$1);
   }

   @Override
   public <U extends T> void a(czj<T, U> $$0, dwl $$1, Consumer<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
