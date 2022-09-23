import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Stream;

public interface hd<T> {
   Optional<hc<T>> a(aba<T> var1);

   Stream<aba<T>> a();

   Optional<? extends he<T>> a(akz<T> var1);

   Stream<akz<T>> b();

   static <T> hd<T> a(hm<T> $$0) {
      return new hd.a<>($$0);
   }

   public static class a<T> implements hd<T> {
      protected final hm<T> b;

      public a(hm<T> $$0) {
         this.b = $$0;
      }

      @Override
      public Optional<hc<T>> a(aba<T> $$0) {
         return this.b.b($$0);
      }

      @Override
      public Stream<aba<T>> a() {
         return this.b.f().stream().map(Entry::getKey);
      }

      @Override
      public Optional<? extends he<T>> a(akz<T> $$0) {
         return this.b.c($$0);
      }

      @Override
      public Stream<akz<T>> b() {
         return this.b.i();
      }
   }
}
