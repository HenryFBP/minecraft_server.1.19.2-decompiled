import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bhb extends bdo<btp> {
   private final float a;

   public bhb(float $$0) {
      super(ImmutableMap.of(bku.d, bkv.a, bku.c, bkv.b, bku.g, bkv.a));
      this.a = $$0;
   }

   protected boolean a(agg $$0, btp $$1) {
      if ($$1.y_()) {
         return false;
      } else {
         return $$1.fU().b() == bts.b;
      }
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      gt $$3 = ((hb)$$1.dy().c(bku.d).get()).b();
      Optional<hc<bmv>> $$4 = $$0.x().c($$3);
      if ($$4.isPresent()) {
         bdp.a($$1, $$2x -> this.a((hc<bmv>)$$4.get(), $$2x, $$3)).findFirst().ifPresent($$3x -> this.a($$0, $$1, $$3x, $$3, $$3x.dy().c(bku.c).isPresent()));
      }
   }

   private boolean a(hc<bmv> $$0, btp $$1, gt $$2) {
      boolean $$3 = $$1.dy().c(bku.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<hb> $$4 = $$1.dy().c(bku.c);
         bts $$5 = $$1.fU().b();
         if ($$5.b().test($$0)) {
            return !$$4.isPresent() ? this.a($$1, $$2, (bmv)$$0.a()) : ((hb)$$4.get()).b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private void a(agg $$0, btp $$1, btp $$2, gt $$3, boolean $$4) {
      this.a($$1);
      if (!$$4) {
         bdp.a($$2, $$3, this.a, 1);
         $$2.dy().a(bku.d, hb.a($$0.ab(), $$3));
         xl.c($$0, $$3);
      }

   }

   private boolean a(btp $$0, gt $$1, bmv $$2) {
      dql $$3 = $$0.D().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }

   private void a(btp $$0) {
      $$0.dy().b(bku.m);
      $$0.dy().b(bku.n);
      $$0.dy().b(bku.d);
   }
}
