import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnt extends dog {
   public static final Codec<dnt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter($$0x -> $$0x.b),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter($$0x -> $$0x.e),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter($$0x -> $$0x.f),
               gy.a.e.fieldOf("axis").orElse(gy.a.b).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dnt::new)
   );
   private final float b;
   private final float d;
   private final int e;
   private final int f;
   private final gy.a g;

   public dnt(float $$0, float $$1, int $$2, int $$3, gy.a $$4) {
      if ($$2 >= $$3) {
         throw new IllegalArgumentException("Invalid range: [" + $$2 + "," + $$3 + "]");
      } else {
         this.b = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
      }
   }

   @Override
   public boolean a(gt $$0, gt $$1, gt $$2, amn $$3) {
      gy $$4 = gy.a(gy.b.a, this.g);
      float $$5 = (float)Math.abs(($$1.u() - $$2.u()) * $$4.j());
      float $$6 = (float)Math.abs(($$1.v() - $$2.v()) * $$4.k());
      float $$7 = (float)Math.abs(($$1.w() - $$2.w()) * $$4.l());
      int $$8 = (int)($$5 + $$6 + $$7);
      float $$9 = $$3.i();
      return $$9 <= ami.b(this.b, this.d, ami.g((float)$$8, (float)this.e, (float)this.f));
   }

   @Override
   protected doh<?> a() {
      return doh.c;
   }
}
