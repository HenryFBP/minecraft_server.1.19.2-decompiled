import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dhy extends dia {
   public static final Codec<dhy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               amb.a(Codec.INT, 1, 64).fieldOf("variety").forGetter($$0x -> $$0x.i),
               dpa.a.a.fieldOf("slow_noise").forGetter($$0x -> $$0x.j),
               alq.d.fieldOf("slow_scale").forGetter($$0x -> $$0x.k)
            )
            .and(b($$0))
            .apply($$0, dhy::new)
   );
   private final amb<Integer> i;
   private final dpa.a j;
   private final float k;
   private final dpa l;

   public dhy(amb<Integer> $$0, dpa.a $$1, float $$2, long $$3, dpa.a $$4, float $$5, List<cvo> $$6) {
      super($$3, $$4, $$5, $$6);
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = dpa.b(new dbo(new das($$3)), $$1);
   }

   @Override
   protected dhx<?> a() {
      return dhx.e;
   }

   @Override
   public cvo a(amn $$0, gt $$1) {
      double $$2 = this.a($$1);
      int $$3 = (int)ami.a($$2, -1.0, 1.0, (double)((Integer)this.i.a()).intValue(), (double)(this.i.b() + 1));
      List<cvo> $$4 = Lists.newArrayListWithCapacity($$3);

      for(int $$5 = 0; $$5 < $$3; ++$$5) {
         $$4.add(this.a(this.h, this.a($$1.b($$5 * 54545, 0, $$5 * 34234))));
      }

      return this.a($$4, $$1, (double)this.e);
   }

   protected double a(gt $$0) {
      return this.l.a((double)((float)$$0.u() * this.k), (double)((float)$$0.v() * this.k), (double)((float)$$0.w() * this.k));
   }
}
