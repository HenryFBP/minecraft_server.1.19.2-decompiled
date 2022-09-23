import com.mojang.serialization.Codec;

public enum dlx implements amw {
   a("linear"),
   b("triangular");

   public static final Codec<dlx> c = amw.a(dlx::values);
   private final String d;

   private dlx(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(amn $$0, int $$1) {
      return switch(this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
         default -> throw new IncompatibleClassChangeError();
      };
   }
}
