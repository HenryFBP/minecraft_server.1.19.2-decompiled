import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dka extends dkj {
   private final gy c;
   private final dbw d;
   private final dbw e;
   private final int f;
   public static final Codec<dka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               gy.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dbw.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dbw.b.optionalFieldOf("allowed_search_condition", dbw.d()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dka::new)
   );

   private dka(gy $$0, dbw $$1, dbw $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dka a(gy $$0, dbw $$1, dbw $$2, int $$3) {
      return new dka($$0, $$1, $$2, $$3);
   }

   public static dka a(gy $$0, dbw $$1, int $$2) {
      return a($$0, $$1, dbw.d(), $$2);
   }

   @Override
   public Stream<gt> a_(dkh $$0, amn $$1, gt $$2) {
      gt.a $$3 = $$2.i();
      chp $$4 = $$0.d();
      if (!this.e.test($$4, $$3)) {
         return Stream.of();
      } else {
         for(int $$5 = 0; $$5 < this.f; ++$$5) {
            if (this.d.test($$4, $$3)) {
               return Stream.of($$3);
            }

            $$3.c(this.c);
            if ($$4.d($$3.v())) {
               return Stream.of();
            }

            if (!this.e.test($$4, $$3)) {
               break;
            }
         }

         return this.d.test($$4, $$3) ? Stream.of($$3) : Stream.of();
      }
   }

   @Override
   public dkk<?> b() {
      return dkk.j;
   }
}
