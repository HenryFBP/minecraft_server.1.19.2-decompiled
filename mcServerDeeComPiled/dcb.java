import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcb extends dch {
   final akz<cjt> a;
   public static final Codec<dcb> e = RecordCodecBuilder.create($$0 -> a($$0).and(akz.a(hm.h).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dcb::new));

   protected dcb(hs $$0, akz<cjt> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(cvo $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dbx<?> a() {
      return dbx.b;
   }
}
