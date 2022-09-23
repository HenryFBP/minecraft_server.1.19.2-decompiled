import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfv implements dfx {
   public static final Codec<dfv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.intRange(1, 512).fieldOf("floor_to_ceiling_search_range").forGetter($$0x -> $$0x.b),
               azo.b(1, 128).fieldOf("height").forGetter($$0x -> $$0x.c),
               azo.b(1, 128).fieldOf("radius").forGetter($$0x -> $$0x.d),
               Codec.intRange(0, 64).fieldOf("max_stalagmite_stalactite_height_diff").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 64).fieldOf("height_deviation").forGetter($$0x -> $$0x.f),
               azo.b(0, 128).fieldOf("dripstone_block_layer_thickness").forGetter($$0x -> $$0x.g),
               azm.a(0.0F, 2.0F).fieldOf("density").forGetter($$0x -> $$0x.h),
               azm.a(0.0F, 2.0F).fieldOf("wetness").forGetter($$0x -> $$0x.i),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_dripstone_column_at_max_distance_from_center").forGetter($$0x -> $$0x.j),
               Codec.intRange(1, 64).fieldOf("max_distance_from_edge_affecting_chance_of_dripstone_column").forGetter($$0x -> $$0x.k),
               Codec.intRange(1, 64).fieldOf("max_distance_from_center_affecting_height_bias").forGetter($$0x -> $$0x.l)
            )
            .apply($$0, dfv::new)
   );
   public final int b;
   public final azo c;
   public final azo d;
   public final int e;
   public final int f;
   public final azo g;
   public final azm h;
   public final azm i;
   public final float j;
   public final int k;
   public final int l;

   public dfv(int $$0, azo $$1, azo $$2, int $$3, int $$4, azo $$5, azm $$6, azm $$7, float $$8, int $$9, int $$10) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
      this.l = $$10;
   }
}
