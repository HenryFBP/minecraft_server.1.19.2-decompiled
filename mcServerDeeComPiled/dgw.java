import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgw implements dfx {
   public static final Codec<dgw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akz.b(hm.h).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               dhw.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               dkg.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               djx.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               azo.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               azo.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dgw::new)
   );
   public final akz<cjt> b;
   public final dhw c;
   public final hc<dkg> d;
   public final djx e;
   public final azo f;
   public final float g;
   public final int h;
   public final float i;
   public final azo j;
   public final float k;

   public dgw(akz<cjt> $$0, dhw $$1, hc<dkg> $$2, djx $$3, azo $$4, float $$5, int $$6, float $$7, azo $$8, float $$9) {
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
   }
}
