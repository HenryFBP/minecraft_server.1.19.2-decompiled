import com.mojang.serialization.Codec;

public enum djx implements amw {
   a(gy.b, 1, "ceiling"),
   b(gy.a, -1, "floor");

   public static final Codec<djx> c = amw.a(djx::values);
   private final gy d;
   private final int e;
   private final String f;

   private djx(gy $$0, int $$1, String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public gy a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   @Override
   public String c() {
      return this.f;
   }
}
