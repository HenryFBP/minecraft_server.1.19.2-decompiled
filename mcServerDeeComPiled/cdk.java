import com.google.common.collect.Lists;
import java.util.List;

public class cdk extends cdi {
   private static final cdm a = cdm.a(caz.sr);

   public cdk(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for(int $$4 = 0; $$4 < $$0.b(); ++$$4) {
         cax $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.c() instanceof bzr) {
               $$2 = true;
            } else {
               if (!a.a($$5)) {
                  return false;
               }

               if ($$3) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$3 && $$2;
   }

   public cax a(bxa $$0) {
      List<Integer> $$1 = Lists.newArrayList();
      cax $$2 = null;

      for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
         cax $$4 = $$0.a($$3);
         cat $$5 = $$4.c();
         if ($$5 instanceof bzr) {
            $$1.add(((bzr)$$5).d().f());
         } else if (a.a($$4)) {
            $$2 = $$4.o();
            $$2.e(1);
         }
      }

      if ($$2 != null && !$$1.isEmpty()) {
         $$2.a("Explosion").b("FadeColors", $$1);
         return $$2;
      } else {
         return cax.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cdr<?> U_() {
      return cdr.i;
   }
}
