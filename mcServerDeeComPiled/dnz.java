import com.mojang.serialization.Codec;

public class dnz extends don {
   public static final Codec<dnz> a = cvo.b.fieldOf("block_state").xmap(dnz::new, $$0 -> $$0.b).codec();
   private final cvo b;

   public dnz(cvo $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(cvo $$0, amn $$1) {
      return $$0 == this.b;
   }

   @Override
   protected doo<?> a() {
      return doo.c;
   }
}
