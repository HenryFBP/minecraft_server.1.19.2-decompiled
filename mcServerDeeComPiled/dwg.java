@FunctionalInterface
public interface dwg<T> {
   void handle(T var1, dwi<T> var2, long var3);

   public abstract static class a<T, C extends dwg<T>> {
      private final abb a;
      private final Class<?> b;

      public a(abb $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public abb a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(pj var1, C var2);

      public abstract C b(pj var1);
   }
}
