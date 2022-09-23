import javax.annotation.Nullable;

public class cby extends byx implements bzo {
   private final ajv b;

   public cby(cjt $$0, ajv $$1, cat.a $$2) {
      super($$0, $$2);
      this.b = $$1;
   }

   @Override
   public baj a(ccz $$0) {
      baj $$1 = super.a($$0);
      buc $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bai $$3 = $$0.p();
         $$2.a($$3, caz.oH.Q_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected ajv a(cvo $$0) {
      return this.b;
   }

   @Override
   public boolean a(@Nullable buc $$0, cgx $$1, gt $$2, @Nullable dwm $$3) {
      if ($$1.j($$2) && $$1.x($$2)) {
         if (!$$1.y) {
            $$1.a($$2, this.e().m(), 3);
         }

         $$1.a($$0, czv.z, $$2);
         $$1.a($$0, $$2, this.b, ajx.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
