import java.util.List;
import javax.annotation.Nullable;

public class cbg extends bze {
   private final bbr<?> a;
   private final ajv b;

   public cbg(bbr<?> $$0, dpu $$1, ajv $$2, cat.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable buc $$0, cgx $$1, cax $$2, gt $$3) {
      if ($$1 instanceof agg) {
         this.a((agg)$$1, $$2, $$3);
         $$1.a($$0, czv.s, $$3);
      }

   }

   @Override
   protected void a(@Nullable buc $$0, cgy $$1, gt $$2) {
      $$1.a($$0, $$2, this.b, ajx.g, 1.0F, 1.0F);
   }

   private void a(agg $$0, cax $$1, gt $$2) {
      bbn $$3 = this.a.a($$0, $$1, null, $$2, bcg.l, true, false);
      if ($$3 instanceof bng $$4) {
         $$4.c($$1.v());
         $$4.v(true);
      }

   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      if (this.a == bbr.aW) {
         pj $$4 = $$0.u();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            p[] $$6 = new p[]{p.u, p.h};
            String $$7 = "color.minecraft." + boe.c($$5);
            String $$8 = "color.minecraft." + boe.s($$5);

            for(int $$9 = 0; $$9 < boe.e.length; ++$$9) {
               if ($$5 == boe.e[$$9]) {
                  $$2.add(rq.c(boe.b($$9)).a($$6));
                  return;
               }
            }

            $$2.add(rq.c(boe.t($$5)).a($$6));
            sb $$10 = rq.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(rq.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }

   }
}
