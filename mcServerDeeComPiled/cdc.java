import com.google.common.collect.Lists;
import java.util.List;

public class cdc extends cdi {
   public cdc(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      cax $$2 = cax.b;
      List<cax> $$3 = Lists.newArrayList();

      for(int $$4 = 0; $$4 < $$0.b(); ++$$4) {
         cax $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.c() instanceof bzu) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.c() instanceof bzr)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cax a(bxa $$0) {
      List<bzr> $$1 = Lists.newArrayList();
      cax $$2 = cax.b;

      for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
         cax $$4 = $$0.a($$3);
         if (!$$4.b()) {
            cat $$5 = $$4.c();
            if ($$5 instanceof bzu) {
               if (!$$2.b()) {
                  return cax.b;
               }

               $$2 = $$4.o();
            } else {
               if (!($$5 instanceof bzr)) {
                  return cax.b;
               }

               $$1.add((bzr)$$5);
            }
         }
      }

      return !$$2.b() && !$$1.isEmpty() ? bzu.a($$2, $$1) : cax.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cdr<?> U_() {
      return cdr.c;
   }
}
