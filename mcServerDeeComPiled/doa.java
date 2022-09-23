import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class doa extends doq {
   public static final Codec<doa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dar.a.g.fieldOf("heightmap").orElse(dar.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, doa::new)
   );
   private final dar.a b;
   private final int c;

   public doa(dar.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      dar.a $$6;
      if ($$0 instanceof agg) {
         if (this.b == dar.a.a) {
            $$6 = dar.a.b;
         } else if (this.b == dar.a.c) {
            $$6 = dar.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      int $$10 = $$0.a($$6, $$4.a.u(), $$4.a.w()) + this.c;
      int $$11 = $$3.a.v();
      return new dot.c(new gt($$4.a.u(), $$10 + $$11, $$4.a.w()), $$4.b, $$4.c);
   }

   @Override
   protected dos<?> a() {
      return dos.c;
   }
}
