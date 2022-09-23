import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dca implements dbw {
   public static final Codec<dca> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hs.v(16).optionalFieldOf("offset", gt.b).forGetter($$0x -> $$0x.e)).apply($$0, dca::new)
   );
   private final hs e;

   public dca(hs $$0) {
      this.e = $$0;
   }

   public boolean a(chp $$0, gt $$1) {
      return !$$0.v($$1.a(this.e));
   }

   @Override
   public dbx<?> a() {
      return dbx.h;
   }
}
