import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcj implements dbw {
   public static final Codec<dcj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hs.v(16).optionalFieldOf("offset", hs.g).forGetter($$0x -> $$0x.e), cvo.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dcj::new)
   );
   private final hs e;
   private final cvo f;

   protected dcj(hs $$0, cvo $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(chp $$0, gt $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dbx<?> a() {
      return dbx.g;
   }
}
