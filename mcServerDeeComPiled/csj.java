import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

public interface csj extends ckq<csj.a> {
   Supplier<BiMap<cjt, cjt>> r_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
            .put(cju.pw, cju.pv)
            .put(cju.pv, cju.pu)
            .put(cju.pu, cju.pt)
            .put(cju.pC, cju.pB)
            .put(cju.pB, cju.pA)
            .put(cju.pA, cju.pz)
            .put(cju.pK, cju.pJ)
            .put(cju.pJ, cju.pI)
            .put(cju.pI, cju.pH)
            .put(cju.pG, cju.pF)
            .put(cju.pF, cju.pE)
            .put(cju.pE, cju.pD)
            .build()
   );
   Supplier<BiMap<cjt, cjt>> s_ = Suppliers.memoize(() -> ((BiMap)r_.get()).inverse());

   static Optional<cjt> a(cjt $$0) {
      return Optional.ofNullable((cjt)((BiMap)s_.get()).get($$0));
   }

   static cjt b(cjt $$0) {
      cjt $$1 = $$0;

      for(cjt $$2 = (cjt)((BiMap)s_.get()).get($$0); $$2 != null; $$2 = (cjt)((BiMap)s_.get()).get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<cvo> b(cvo $$0) {
      return a($$0.b()).map($$1 -> $$1.l($$0));
   }

   static Optional<cjt> c(cjt $$0) {
      return Optional.ofNullable((cjt)((BiMap)r_.get()).get($$0));
   }

   static cvo c(cvo $$0) {
      return b($$0.b()).l($$0);
   }

   @Override
   default Optional<cvo> a(cvo $$0) {
      return c($$0.b()).map($$1 -> $$1.l($$0));
   }

   @Override
   default float a() {
      return this.b() == csj.a.a ? 0.75F : 1.0F;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
