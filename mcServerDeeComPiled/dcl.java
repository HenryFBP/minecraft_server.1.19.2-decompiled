import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcl extends dcn {
   public static final Codec<dcl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcn.d.forGetter($$0x -> $$0x), azm.c.fieldOf("vertical_rotation").forGetter($$0x -> $$0x.b), dcl.a.a.fieldOf("shape").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dcl::new)
   );
   public final azm b;
   public final dcl.a c;

   public dcl(float $$0, djj $$1, azm $$2, dbl $$3, dco $$4, he<cjt> $$5, azm $$6, dcl.a $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
   }

   public dcl(dcn $$0, azm $$1, dcl.a $$2) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2);
   }

   public static class a {
      public static final Codec<dcl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  azm.c.fieldOf("distance_factor").forGetter($$0x -> $$0x.b),
                  azm.c.fieldOf("thickness").forGetter($$0x -> $$0x.c),
                  alq.b.fieldOf("width_smoothness").forGetter($$0x -> $$0x.d),
                  azm.c.fieldOf("horizontal_radius_factor").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcl.a::new)
      );
      public final azm b;
      public final azm c;
      public final int d;
      public final azm e;
      public final float f;
      public final float g;

      public a(azm $$0, azm $$1, int $$2, azm $$3, float $$4, float $$5) {
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.b = $$0;
         this.c = $$1;
      }
   }
}
