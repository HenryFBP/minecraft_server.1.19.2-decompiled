import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djv extends dki {
   public static final Codec<djv> a = RecordCodecBuilder.create($$0 -> $$0.group(dbw.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, djv::new));
   private final dbw c;

   private djv(dbw $$0) {
      this.c = $$0;
   }

   public static djv a(dbw $$0) {
      return new djv($$0);
   }

   @Override
   protected boolean a(dkh $$0, amn $$1, gt $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dkk<?> b() {
      return dkk.a;
   }
}
