import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dcf extends dch {
   public static final Codec<dcf> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dcf::new));

   public dcf(hs $$0) {
      super($$0);
   }

   @Override
   protected boolean a(cvo $$0) {
      return $$0.d().e();
   }

   @Override
   public dbx<?> a() {
      return dbx.f;
   }
}
