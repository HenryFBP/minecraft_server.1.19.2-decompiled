public class bak<T> {
   private final baj a;
   private final T b;

   public bak(baj $$0, T $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public baj a() {
      return this.a;
   }

   public T b() {
      return this.b;
   }

   public static <T> bak<T> a(T $$0) {
      return new bak<>(baj.a, $$0);
   }

   public static <T> bak<T> b(T $$0) {
      return new bak<>(baj.b, $$0);
   }

   public static <T> bak<T> c(T $$0) {
      return new bak<>(baj.d, $$0);
   }

   public static <T> bak<T> d(T $$0) {
      return new bak<>(baj.e, $$0);
   }

   public static <T> bak<T> a(T $$0, boolean $$1) {
      return $$1 ? a($$0) : b($$0);
   }
}
