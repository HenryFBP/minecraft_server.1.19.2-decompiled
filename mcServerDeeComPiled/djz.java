import com.mojang.serialization.Codec;

public class djz extends dkn {
   public static final Codec<djz> a = azo.b(0, 256).fieldOf("count").xmap(djz::new, $$0 -> $$0.c).codec();
   private final azo c;

   private djz(azo $$0) {
      this.c = $$0;
   }

   public static djz a(azo $$0) {
      return new djz($$0);
   }

   public static djz a(int $$0) {
      return a(azl.a($$0));
   }

   @Override
   protected int a(amn $$0, gt $$1) {
      return this.c.a($$0);
   }

   @Override
   public dkk<?> b() {
      return dkk.f;
   }
}
