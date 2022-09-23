import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cbu extends bzm {
   protected static final Map<cjt, cvo> a = Maps.newHashMap(
      new Builder()
         .put(cju.i, cju.jq.m())
         .put(cju.j, cju.jq.m())
         .put(cju.l, cju.jq.m())
         .put(cju.k, cju.jq.m())
         .put(cju.es, cju.jq.m())
         .put(cju.qp, cju.jq.m())
         .build()
   );

   public cbu(cch $$0, float $$1, float $$2, cat.a $$3) {
      super($$1, $$2, $$0, akl.bs, $$3);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      if ($$0.k() == gy.a) {
         return baj.d;
      } else {
         buc $$4 = $$0.o();
         cvo $$5 = (cvo)a.get($$3.b());
         cvo $$6 = null;
         if ($$5 != null && $$1.a_($$2.b()).h()) {
            $$1.a($$4, $$2, ajw.sq, ajx.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof cke && $$3.c(cke.b)) {
            if (!$$1.k_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            cke.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.a(cke.b, Boolean.valueOf(false));
         }

         if ($$6 != null) {
            if (!$$1.y) {
               $$1.a($$2, $$6, 11);
               $$1.a(czv.c, $$2, czv.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, $$1x -> $$1x.d($$0.p()));
               }
            }

            return baj.a($$1.y);
         } else {
            return baj.d;
         }
      }
   }
}
