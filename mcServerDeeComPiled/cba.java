import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class cba extends cat {
   private static final String a = "Recipes";
   private static final Logger b = LogUtils.getLogger();

   public cba(cat.a $$0) {
      super($$0);
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      pj $$4 = $$3.u();
      if (!$$1.fB().d) {
         $$1.a($$2, cax.b);
      }

      if ($$4 != null && $$4.b("Recipes", 9)) {
         if (!$$0.y) {
            pp $$5 = $$4.c("Recipes", 8);
            List<cdp<?>> $$6 = Lists.newArrayList();
            cdq $$7 = $$0.n().aE();

            for(int $$8 = 0; $$8 < $$5.size(); ++$$8) {
               String $$9 = $$5.j($$8);
               Optional<? extends cdp<?>> $$10 = $$7.a(new abb($$9));
               if (!$$10.isPresent()) {
                  b.error("Invalid recipe: {}", $$9);
                  return bak.d($$3);
               }

               $$6.add((cdp)$$10.get());
            }

            $$1.a($$6);
            $$1.b(akg.c.b(this));
         }

         return bak.a($$3, $$0.k_());
      } else {
         b.error("Tag not valid: {}", $$4);
         return bak.d($$3);
      }
   }
}
