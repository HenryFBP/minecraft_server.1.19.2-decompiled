import java.util.Optional;

public interface bng {
   boolean q();

   void v(boolean var1);

   void m(cax var1);

   void c(pj var1);

   cax b();

   ajv t();

   @Deprecated
   static void a(bce $$0, cax $$1) {
      pj $$2 = $$1.v();
      if ($$0.Y()) {
         $$1.a($$0.Z());
      }

      if ($$0.fA()) {
         $$2.a("NoAI", $$0.fA());
      }

      if ($$0.aM()) {
         $$2.a("Silent", $$0.aM());
      }

      if ($$0.aN()) {
         $$2.a("NoGravity", $$0.aN());
      }

      if ($$0.bV()) {
         $$2.a("Glowing", $$0.bV());
      }

      if ($$0.ci()) {
         $$2.a("Invulnerable", $$0.ci());
      }

      $$2.a("Health", $$0.ef());
   }

   @Deprecated
   static void a(bce $$0, pj $$1) {
      if ($$1.e("NoAI")) {
         $$0.s($$1.q("NoAI"));
      }

      if ($$1.e("Silent")) {
         $$0.d($$1.q("Silent"));
      }

      if ($$1.e("NoGravity")) {
         $$0.e($$1.q("NoGravity"));
      }

      if ($$1.e("Glowing")) {
         $$0.i($$1.q("Glowing"));
      }

      if ($$1.e("Invulnerable")) {
         $$0.m($$1.q("Invulnerable"));
      }

      if ($$1.b("Health", 99)) {
         $$0.c($$1.j("Health"));
      }

   }

   static <T extends bcc & bng> Optional<baj> a(buc $$0, bai $$1, T $$2) {
      cax $$3 = $$0.b($$1);
      if ($$3.c() == caz.oI && $$2.bo()) {
         $$2.a($$2.t(), 1.0F, 1.0F);
         cax $$4 = $$2.b();
         $$2.m($$4);
         cax $$5 = cay.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         cgx $$6 = $$2.s;
         if (!$$6.y) {
            aj.j.a((agh)$$0, $$4);
         }

         $$2.ah();
         return Optional.of(baj.a($$6.y));
      } else {
         return Optional.empty();
      }
   }
}
