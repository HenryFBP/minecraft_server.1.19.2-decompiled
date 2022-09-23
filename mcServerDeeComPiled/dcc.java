import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dcc extends dch {
   private final he<cjt> e;
   public static final Codec<dcc> a = RecordCodecBuilder.create($$0 -> a($$0).and(ho.a(hm.h).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dcc::new));

   public dcc(hs $$0, he<cjt> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(cvo $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dbx<?> a() {
      return dbx.a;
   }
}
