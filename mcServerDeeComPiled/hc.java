import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface hc<T> {
   T a();

   boolean b();

   boolean a(abb var1);

   boolean a(aba<T> var1);

   boolean a(Predicate<aba<T>> var1);

   boolean a(akz<T> var1);

   Stream<akz<T>> c();

   Either<aba<T>, T> d();

   Optional<aba<T>> e();

   hc.b f();

   boolean a(hm<T> var1);

   static <T> hc<T> a(T $$0) {
      return new hc.a<>($$0);
   }

   static <T> hc<T> a(hc<? extends T> $$0) {
      return $$0;
   }

   public static record a<T>(T a) implements hc<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(abb $$0) {
         return false;
      }

      @Override
      public boolean a(aba<T> $$0) {
         return false;
      }

      @Override
      public boolean a(akz<T> $$0) {
         return false;
      }

      @Override
      public boolean a(Predicate<aba<T>> $$0) {
         return false;
      }

      @Override
      public Either<aba<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<aba<T>> e() {
         return Optional.empty();
      }

      @Override
      public hc.b f() {
         return hc.b.b;
      }

      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(hm<T> $$0) {
         return true;
      }

      @Override
      public Stream<akz<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements hc<T> {
      private final hm<T> a;
      private Set<akz<T>> b = Set.of();
      private final hc.c.a c;
      @Nullable
      private aba<T> d;
      @Nullable
      private T e;

      private c(hc.c.a $$0, hm<T> $$1, @Nullable aba<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> hc.c<T> a(hm<T> $$0, aba<T> $$1) {
         return new hc.c<>(hc.c.a.a, $$0, $$1, (T)null);
      }

      @Deprecated
      public static <T> hc.c<T> a(hm<T> $$0, @Nullable T $$1) {
         return new hc.c<>(hc.c.a.b, $$0, null, $$1);
      }

      public aba<T> g() {
         if (this.d == null) {
            throw new IllegalStateException("Trying to access unbound value '" + this.e + "' from registry " + this.a);
         } else {
            return this.d;
         }
      }

      @Override
      public T a() {
         if (this.e == null) {
            throw new IllegalStateException("Trying to access unbound value '" + this.d + "' from registry " + this.a);
         } else {
            return this.e;
         }
      }

      @Override
      public boolean a(abb $$0) {
         return this.g().a().equals($$0);
      }

      @Override
      public boolean a(aba<T> $$0) {
         return this.g() == $$0;
      }

      @Override
      public boolean a(akz<T> $$0) {
         return this.b.contains($$0);
      }

      @Override
      public boolean a(Predicate<aba<T>> $$0) {
         return $$0.test(this.g());
      }

      @Override
      public boolean a(hm<T> $$0) {
         return this.a == $$0;
      }

      @Override
      public Either<aba<T>, T> d() {
         return Either.left(this.g());
      }

      @Override
      public Optional<aba<T>> e() {
         return Optional.of(this.g());
      }

      @Override
      public hc.b f() {
         return hc.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void a(aba<T> $$0, T $$1) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else if (this.c == hc.c.a.b && this.e != $$1) {
            throw new IllegalStateException("Can't change holder " + $$0 + " value: existing=" + this.e + ", new=" + $$1);
         } else {
            this.d = $$0;
            this.e = $$1;
         }
      }

      void a(Collection<akz<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<akz<T>> c() {
         return this.b.stream();
      }

      public String toString() {
         return "Reference{" + this.d + "=" + this.e + "}";
      }

      static enum a {
         a,
         b;
      }
   }
}
