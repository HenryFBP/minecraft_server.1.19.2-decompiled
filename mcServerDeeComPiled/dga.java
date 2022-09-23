import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dga implements dfx {
   public static final Codec<dga> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").orElse(30).forGetter($$0x -> $$0x.b),
               azo.b(1, 60).fieldOf("column_radius").forGetter($$0x -> $$0x.c),
               azm.a(0.0F, 20.0F).fieldOf("height_scale").forGetter($$0x -> $$0x.d),
               Codec.floatRange(0.1F, 1.0F).fieldOf("max_column_radius_to_cave_height_ratio").forGetter($$0x -> $$0x.e),
               azm.a(0.1F, 10.0F).fieldOf("stalactite_bluntness").forGetter($$0x -> $$0x.f),
               azm.a(0.1F, 10.0F).fieldOf("stalagmite_bluntness").forGetter($$0x -> $$0x.g),
               azm.a(0.0F, 2.0F).fieldOf("wind_speed").forGetter($$0x -> $$0x.h),
               Codec.intRange(0, 100).fieldOf("min_radius_for_wind").forGetter($$0x -> $$0x.i),
               Codec.floatRange(0.0F, 5.0F).fieldOf("min_bluntness_for_wind").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dga::new)
   );
   public final int b;
   public final azo c;
   public final azm d;
   public final float e;
   public final azm f;
   public final azm g;
   public final azm h;
   public final int i;
   public final float j;

   public dga(int $$0, azo $$1, azm $$2, float $$3, azm $$4, azm $$5, azm $$6, int $$7, float $$8) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
   }
}
