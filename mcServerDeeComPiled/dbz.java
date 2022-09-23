import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbz implements dbw {
   private final hs e;
   private final gy f;
   public static final Codec<dbz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hs.v(16).optionalFieldOf("offset", hs.g).forGetter($$0x -> $$0x.e), gy.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dbz::new)
   );

   public dbz(hs $$0, gy $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(chp $$0, gt $$1) {
      gt $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dbx<?> a() {
      return dbx.d;
   }
}
