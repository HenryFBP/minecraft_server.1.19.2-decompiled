import com.mojang.serialization.Codec;

public enum dlm implements amw {
   a("none"),
   b("bury"),
   c("beard_thin"),
   d("beard_box");

   public static final Codec<dlm> e = amw.a(dlm::values);
   private final String f;

   private dlm(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
