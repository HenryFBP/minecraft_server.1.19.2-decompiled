import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public class cao extends cat {
   public static final Supplier<BiMap<cjt, cjt>> a = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cju.pw, cju.pL)
            .put(cju.pv, cju.pN)
            .put(cju.pu, cju.pM)
            .put(cju.pt, cju.pO)
            .put(cju.pC, cju.pS)
            .put(cju.pB, cju.pR)
            .put(cju.pA, cju.pQ)
            .put(cju.pz, cju.pP)
            .put(cju.pK, cju.qa)
            .put(cju.pJ, cju.pZ)
            .put(cju.pI, cju.pY)
            .put(cju.pH, cju.pX)
            .put(cju.pG, cju.pW)
            .put(cju.pF, cju.pV)
            .put(cju.pE, cju.pU)
            .put(cju.pD, cju.pT)
            .build()
   );
   public static final Supplier<BiMap<cjt, cjt>> b = Suppliers.memoize(() -> ((BiMap)a.get()).inverse());

   public cao(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      return (baj)b($$3).map($$3x -> {
         buc $$4 = $$0.o();
         cax $$5 = $$0.n();
         if ($$4 instanceof agh) {
            aj.M.a((agh)$$4, $$2, $$5);
         }

         $$5.g(1);
         $$1.a($$2, $$3x, 11);
         $$1.a(czv.c, $$2, czv.a.a($$4, $$3x));
         $$1.a($$4, 3003, $$2, 0);
         return baj.a($$1.y);
      }).orElse(baj.d);
   }

   public static Optional<cvo> b(cvo $$0) {
      return Optional.ofNullable((cjt)((BiMap)a.get()).get($$0.b())).map($$1 -> $$1.l($$0));
   }
}
