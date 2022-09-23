import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record daz(int g, int h, int i, int j) {
   public static final Codec<daz> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(cyu.e, cyu.d).fieldOf("min_y").forGetter(daz::c),
                  Codec.intRange(0, cyu.c).fieldOf("height").forGetter(daz::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(daz::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(daz::f)
               )
               .apply($$0, daz::new)
      )
      .comapFlatMap(daz::a, Function.identity());
   protected static final daz b = a(-64, 384, 1, 2);
   protected static final daz c = a(0, 128, 1, 2);
   protected static final daz d = a(0, 128, 2, 1);
   protected static final daz e = a(-64, 192, 1, 2);
   protected static final daz f = a(0, 256, 2, 1);

   private static DataResult<daz> a(daz $$0) {
      if ($$0.c() + $$0.d() > cyu.d + 1) {
         return DataResult.error("min_y + height cannot be higher than: " + (cyu.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error("height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error("min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static daz a(int $$0, int $$1, int $$2, int $$3) {
      daz $$4 = new daz($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return hl.c(this.f());
   }

   public int b() {
      return hl.c(this.e());
   }

   public daz a(cgz $$0) {
      int $$1 = Math.max(this.g, $$0.u_());
      int $$2 = Math.min(this.g + this.h, $$0.ah()) - $$1;
      return new daz($$1, $$2, this.i, this.j);
   }

   public int c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }

   public int e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }
}
