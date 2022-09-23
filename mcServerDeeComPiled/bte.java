import java.util.Arrays;

public enum bte {
   a(0, ajw.wu, ajw.wC),
   b(40, ajw.wt, ajw.wD),
   c(80, ajw.wv, ajw.wD);

   private static final bte[] d = ad.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final ajv f;
   private final ajv g;

   private bte(int $$0, ajv $$1, ajv $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public ajv b() {
      return this.f;
   }

   public ajv c() {
      return this.g;
   }

   public static bte a(int $$0) {
      for(bte $$1 : d) {
         if ($$0 >= $$1.e) {
            return $$1;
         }
      }

      return a;
   }

   public boolean d() {
      return this == c;
   }
}
