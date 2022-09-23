import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dcd extends dch {
   private final he<dpu> e;
   public static final Codec<dcd> a = RecordCodecBuilder.create($$0 -> a($$0).and(ho.a(hm.f).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dcd::new));

   public dcd(hs $$0, he<dpu> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(cvo $$0) {
      return $$0.p().a(this.e);
   }

   @Override
   public dbx<?> a() {
      return dbx.c;
   }
}
