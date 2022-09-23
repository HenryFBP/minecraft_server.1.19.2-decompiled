import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcq extends dcn {
   public static final Codec<dcq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcn.d.forGetter($$0x -> $$0x),
               azm.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               azm.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               azm.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, dcq::new)
   );
   public final azm b;
   public final azm c;
   final azm j;

   public dcq(float $$0, djj $$1, azm $$2, dbl $$3, dco $$4, he<cjt> $$5, azm $$6, azm $$7, azm $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public dcq(float $$0, djj $$1, azm $$2, dbl $$3, he<cjt> $$4, azm $$5, azm $$6, azm $$7) {
      this($$0, $$1, $$2, $$3, dco.a, $$4, $$5, $$6, $$7);
   }

   public dcq(dcn $$0, azm $$1, azm $$2, azm $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
