import com.mojang.serialization.Codec;

public class dnx extends don {
   public static final Codec<dnx> a = hm.V.p().fieldOf("block").xmap(dnx::new, $$0 -> $$0.b).codec();
   private final cjt b;

   public dnx(cjt $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(cvo $$0, amn $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected doo<?> a() {
      return doo.b;
   }
}
