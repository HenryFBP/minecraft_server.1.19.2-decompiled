import java.util.function.ToIntFunction;

public interface ckm {
   dxj o_ = cjt.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   cwf p_ = cwe.E;

   static baj a_(cvo $$0, cgx $$1, gt $$2) {
      if ($$0.c(p_)) {
         cjt.a($$1, $$2, new cax(caz.uj, 1));
         float $$3 = ami.b($$1.w, 0.8F, 1.2F);
         $$1.a(null, $$2, ajw.cR, ajx.e, 1.0F, $$3);
         $$1.a($$2, $$0.a(p_, Boolean.valueOf(false)), 2);
         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   static boolean a(cvo $$0) {
      return $$0.b(p_) && $$0.c(p_);
   }

   static ToIntFunction<cvo> f_(int $$0) {
      return $$1 -> $$1.c(cwe.E) ? $$0 : 0;
   }
}
