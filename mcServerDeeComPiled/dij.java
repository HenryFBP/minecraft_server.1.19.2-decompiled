import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dij extends din {
   public static final Codec<dij> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter($$0x -> $$0x.c),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter($$0x -> $$0x.d),
               dhw.a.fieldOf("block_provider").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter($$0x -> $$0x.f),
               alq.a(gy.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dij::new)
   );
   protected final float b;
   protected final int c;
   protected final int d;
   protected final dhw e;
   protected final int f;
   protected final List<gy> g;

   public dij(float $$0, int $$1, int $$2, dhw $$3, int $$4, List<gy> $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public void a(din.a $$0) {
      Set<gt> $$1 = new HashSet();
      amn $$2 = $$0.b();

      for(gt $$3 : ad.a($$0.d(), $$2)) {
         gy $$4 = ad.a(this.g, $$2);
         gt $$5 = $$3.a($$4);
         if (!$$1.contains($$5) && $$2.i() < this.b && this.a($$0, $$3, $$4)) {
            gt $$6 = $$5.b(-this.c, -this.d, -this.c);
            gt $$7 = $$5.b(this.c, this.d, this.c);

            for(gt $$8 : gt.a($$6, $$7)) {
               $$1.add($$8.h());
            }

            $$0.a($$5, this.e.a($$2, $$5));
         }
      }

   }

   private boolean a(din.a $$0, gt $$1, gy $$2) {
      for(int $$3 = 1; $$3 <= this.f; ++$$3) {
         gt $$4 = $$1.a($$2, $$3);
         if (!$$0.a($$4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dio<?> a() {
      return dio.f;
   }
}
