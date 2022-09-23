import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgm implements dfx {
   public static final Codec<dgm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvo.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               cvo.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               azo.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dgm::new)
   );
   public final cvo b;
   public final cvo c;
   private final azo d;

   public dgm(cvo $$0, cvo $$1, azo $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public azo a() {
      return this.d;
   }
}
