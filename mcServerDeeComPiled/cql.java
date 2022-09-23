import java.util.Optional;

public interface cql extends cjy, coa {
   @Override
   default boolean a(cgd $$0, gt $$1, cvo $$2, dpu $$3) {
      return !$$2.c(cwe.C) && $$3 == dpw.c;
   }

   @Override
   default boolean a(cgy $$0, gt $$1, cvo $$2, dpv $$3) {
      if (!$$2.c(cwe.C) && $$3.a() == dpw.c) {
         if (!$$0.k_()) {
            $$0.a($$1, $$2.a(cwe.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cax c(cgy $$0, gt $$1, cvo $$2) {
      if ($$2.c(cwe.C)) {
         $$0.a($$1, $$2.a(cwe.C, Boolean.valueOf(false)), 3);
         if (!$$2.a($$0, $$1)) {
            $$0.b($$1, true);
         }

         return new cax(caz.oI);
      } else {
         return cax.b;
      }
   }

   @Override
   default Optional<ajv> X_() {
      return dpw.c.k();
   }
}
