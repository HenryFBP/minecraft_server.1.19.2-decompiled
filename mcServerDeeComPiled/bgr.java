import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class bgr extends bdo<bcc> {
   private static final int a = 16;
   private final bku<hb> d;
   private final Predicate<hc<bmv>> e;

   public bgr(Predicate<hc<bmv>> $$0, bku<hb> $$1) {
      super(ImmutableMap.of($$1, bkv.a));
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      hb $$2 = (hb)$$1.dy().c(this.d).get();
      return $$0.ab() == $$2.a() && $$2.b().a($$1.cY(), 16.0);
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      hb $$4 = (hb)$$3.c(this.d).get();
      gt $$5 = $$4.b();
      agg $$6 = $$0.n().a($$4.a());
      if ($$6 == null || this.a($$6, $$5)) {
         $$3.b(this.d);
      } else if (this.a($$6, $$5, $$1)) {
         $$3.b(this.d);
         $$0.x().b($$5);
         xl.c($$0, $$5);
      }

   }

   private boolean a(agg $$0, gt $$1, bcc $$2) {
      cvo $$3 = $$0.a_($$1);
      return $$3.a(akl.N) && $$3.c(cjm.b) && !$$2.fj();
   }

   private boolean a(agg $$0, gt $$1) {
      return !$$0.x().a($$1, this.e);
   }
}
