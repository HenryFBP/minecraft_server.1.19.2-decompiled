import com.mojang.serialization.Codec;

public class ajv {
   public static final Codec<ajv> a = abb.a.xmap(ajv::new, $$0 -> $$0.b);
   private final abb b;
   private final float c;
   private final boolean d;

   public ajv(abb $$0) {
      this($$0, 16.0F, false);
   }

   public ajv(abb $$0, float $$1) {
      this($$0, $$1, true);
   }

   private ajv(abb $$0, float $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public abb a() {
      return this.b;
   }

   public float a(float $$0) {
      if (this.d) {
         return this.c;
      } else {
         return $$0 > 1.0F ? 16.0F * $$0 : 16.0F;
      }
   }
}
