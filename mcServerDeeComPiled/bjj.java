import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bjj<T extends bvk> extends bip {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bjj(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bip.a.a));
   }

   @Override
   public boolean a() {
      return this.c.G() == null && !this.c.bJ() && this.c.fY() && !this.c.fX().a() && !((agg)this.c.s).b(this.c.da());
   }

   @Override
   public boolean b() {
      return this.c.fY() && !this.c.fX().a() && this.c.s instanceof agg && !((agg)this.c.s).b(this.c.da());
   }

   @Override
   public void e() {
      if (this.c.fY()) {
         bvj $$0 = this.c.fX();
         if (this.c.S > this.d) {
            this.d = this.c.S + 20;
            this.a($$0);
         }

         if (!this.c.fG()) {
            dwq $$1 = bmj.a(this.c, 15, 4, dwq.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.D().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }

   }

   private void a(bvj $$0) {
      if ($$0.v()) {
         Set<bvk> $$1 = Sets.newHashSet();
         List<bvk> $$2 = this.c.s.a(bvk.class, this.c.cy().g(16.0), $$1x -> !$$1x.fY() && bvl.a($$1x, $$0));
         $$1.addAll($$2);

         for(bvk $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }

   }
}
