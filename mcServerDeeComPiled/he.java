import com.mojang.datafixers.util.Either;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface he<T> extends Iterable<hc<T>> {
   Stream<hc<T>> a();

   int b();

   Either<akz<T>, List<hc<T>>> c();

   Optional<hc<T>> a(amn var1);

   hc<T> a(int var1);

   boolean a(hc<T> var1);

   boolean a(hm<T> var1);

   @SafeVarargs
   static <T> he.a<T> a(hc<T>... $$0) {
      return new he.a<>(List.of($$0));
   }

   static <T> he.a<T> a(List<? extends hc<T>> $$0) {
      return new he.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> he.a<T> a(Function<E, hc<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> he.a<T> a(Function<E, hc<T>> $$0, List<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static class a<T> extends he.b<T> {
      private final List<hc<T>> a;
      @Nullable
      private Set<hc<T>> b;

      a(List<hc<T>> $$0) {
         this.a = $$0;
      }

      @Override
      protected List<hc<T>> d() {
         return this.a;
      }

      @Override
      public Either<akz<T>, List<hc<T>>> c() {
         return Either.right(this.a);
      }

      @Override
      public boolean a(hc<T> $$0) {
         if (this.b == null) {
            this.b = Set.copyOf(this.a);
         }

         return this.b.contains($$0);
      }

      public String toString() {
         return "DirectSet[" + this.a + "]";
      }
   }

   public abstract static class b<T> implements he<T> {
      protected abstract List<hc<T>> d();

      @Override
      public int b() {
         return this.d().size();
      }

      public Spliterator<hc<T>> spliterator() {
         return this.d().spliterator();
      }

      @NotNull
      public Iterator<hc<T>> iterator() {
         return this.d().iterator();
      }

      @Override
      public Stream<hc<T>> a() {
         return this.d().stream();
      }

      @Override
      public Optional<hc<T>> a(amn $$0) {
         return ad.b(this.d(), $$0);
      }

      @Override
      public hc<T> a(int $$0) {
         return (hc<T>)this.d().get($$0);
      }

      @Override
      public boolean a(hm<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends he.b<T> {
      private final hm<T> a;
      private final akz<T> b;
      private List<hc<T>> c = List.of();

      c(hm<T> $$0, akz<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<hc<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public akz<T> e() {
         return this.b;
      }

      @Override
      protected List<hc<T>> d() {
         return this.c;
      }

      @Override
      public Either<akz<T>, List<hc<T>>> c() {
         return Either.left(this.b);
      }

      @Override
      public boolean a(hc<T> $$0) {
         return $$0.a(this.b);
      }

      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(hm<T> $$0) {
         return this.a == $$0;
      }
   }
}
