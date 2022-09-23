import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dib extends dhz {
   public static final Codec<dib> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  cvo.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(cvo.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(cvo.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dib::new)
   );
   private final float g;
   private final float h;
   private final cvo i;
   private final List<cvo> j;
   private final List<cvo> k;

   public dib(long $$0, dpa.a $$1, float $$2, float $$3, float $$4, cvo $$5, List<cvo> $$6, List<cvo> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dhx<?> a() {
      return dhx.c;
   }

   @Override
   public cvo a(amn $$0, gt $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ad.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ad.a(this.k, $$0) : this.i;
      }
   }
}
