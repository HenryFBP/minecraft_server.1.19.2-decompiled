import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcn extends dgh {
   public static final MapCodec<dcn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               djj.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               azm.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dbl.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dco.b.optionalFieldOf("debug_settings", dco.a).forGetter($$0x -> $$0x.h),
               ho.a(hm.h).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dcn::new)
   );
   public final djj e;
   public final azm f;
   public final dbl g;
   public final dco h;
   public final he<cjt> i;

   public dcn(float $$0, djj $$1, azm $$2, dbl $$3, dco $$4, he<cjt> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
