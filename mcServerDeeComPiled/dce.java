import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dce implements dbw {
   public static final Codec<dce> a = RecordCodecBuilder.create($$0 -> $$0.group(dbw.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dce::new));
   private final dbw e;

   public dce(dbw $$0) {
      this.e = $$0;
   }

   public boolean a(chp $$0, gt $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dbx<?> a() {
      return dbx.k;
   }
}
