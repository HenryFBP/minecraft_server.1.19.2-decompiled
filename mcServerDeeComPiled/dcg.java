import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcg extends dch {
   public static final Codec<dcg> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dcg::new));

   public dcg(hs $$0) {
      super($$0);
   }

   @Override
   protected boolean a(cvo $$0) {
      return $$0.d().b();
   }

   @Override
   public dbx<?> a() {
      return dbx.e;
   }
}
