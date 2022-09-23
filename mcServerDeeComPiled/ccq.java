import javax.annotation.Nullable;

public class ccq extends cat {
   public ccq(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      cvo $$3 = $$1.a_($$2);
      if ($$3.a(cju.mL)) {
         return cnu.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? baj.a($$1.y) : baj.d;
      } else {
         return baj.d;
      }
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(akg.c.b(this));
      return bak.a($$3, $$0.k_());
   }

   public static boolean a(@Nullable pj $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         pp $$1 = $$0.c("pages", 8);

         for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            String $$3 = $$1.j($$2);
            if ($$3.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }
}
