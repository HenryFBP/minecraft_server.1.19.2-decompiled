import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhn extends dhi {
   public static final Codec<dhn> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  azo.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dhn::new)
   );
   private final azo b;
   private final int c;

   public dhn(azo $$0, azo $$1, azo $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dhj<?> a() {
      return dhj.j;
   }

   @Override
   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, dgt $$3, int $$4, dhi.a $$5, int $$6, int $$7, int $$8) {
      gt $$9 = $$5.a();
      gt.a $$10 = $$9.i();

      for(int $$11 = 0; $$11 < this.c; ++$$11) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }

   }

   @Override
   public int a(amn $$0, int $$1, dgt $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(amn $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
