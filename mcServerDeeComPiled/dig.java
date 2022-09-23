import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class dig extends dhw {
   public static final Codec<dig> b = ayt.b(cvo.b).comapFlatMap(dig::a, $$0 -> $$0.c).fieldOf("entries").codec();
   private final ayt<cvo> c;

   private static DataResult<dig> a(ayt<cvo> $$0) {
      return $$0.d() ? DataResult.error("WeightedStateProvider with no states") : DataResult.success(new dig($$0));
   }

   public dig(ayt<cvo> $$0) {
      this.c = $$0;
   }

   public dig(ayt.a<cvo> $$0) {
      this($$0.a());
   }

   @Override
   protected dhx<?> a() {
      return dhx.b;
   }

   @Override
   public cvo a(amn $$0, gt $$1) {
      return (cvo)this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
