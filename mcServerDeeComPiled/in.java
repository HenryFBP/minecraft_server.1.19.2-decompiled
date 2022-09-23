import com.mojang.serialization.Codec;

public abstract class in<T extends im> {
   private final boolean a;
   private final im.a<T> b;

   protected in(boolean $$0, im.a<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean c() {
      return this.a;
   }

   public im.a<T> d() {
      return this.b;
   }

   public abstract Codec<T> e();
}
