import com.google.gson.JsonObject;

public interface am<T extends an> {
   abb a();

   void a(abj var1, am.a<T> var2);

   void b(abj var1, am.a<T> var2);

   void a(abj var1);

   T a(JsonObject var1, be var2);

   public static class a<T extends an> {
      private final T a;
      private final af b;
      private final String c;

      public a(T $$0, af $$1, String $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public T a() {
         return this.a;
      }

      public void a(abj $$0) {
         $$0.a(this.b, this.c);
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            am.a<?> $$1 = (am.a)$$0;
            if (!this.a.equals($$1.a)) {
               return false;
            } else {
               return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
            }
         } else {
            return false;
         }
      }

      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }
   }
}
