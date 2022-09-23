import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dao {
   public final dhw a;
   public final dhw b;
   public final dhw c;
   public final dhw d;
   public final dhw e;
   public final List<cvo> f;
   public final akz<cjt> g;
   public final akz<cjt> h;
   public static final Codec<dao> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhw.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dhw.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dhw.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dhw.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dhw.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               alq.a(cvo.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               akz.b(hm.h).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               akz.b(hm.h).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dao::new)
   );

   public dao(dhw $$0, dhw $$1, dhw $$2, dhw $$3, dhw $$4, List<cvo> $$5, akz<cjt> $$6, akz<cjt> $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }
}
