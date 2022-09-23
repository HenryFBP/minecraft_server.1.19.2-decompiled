import java.util.List;
import javax.annotation.Nullable;

public class bzy extends cat {
   public static final String a = "StoredEnchantments";

   public bzy(cat.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cax $$0) {
      return true;
   }

   @Override
   public boolean c_(cax $$0) {
      return false;
   }

   public static pp d(cax $$0) {
      pj $$1 = $$0.u();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new pp();
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      super.a($$0, $$1, $$2, $$3);
      cax.a($$2, d($$0));
   }

   public static void a(cax $$0, ceu $$1) {
      pp $$2 = d($$0);
      boolean $$3 = true;
      abb $$4 = cet.a($$1.a);

      for(int $$5 = 0; $$5 < $$2.size(); ++$$5) {
         pj $$6 = $$2.a($$5);
         abb $$7 = cet.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cet.a($$6) < $$1.b) {
               cet.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cet.a($$4, $$1.b));
      }

      $$0.v().a("StoredEnchantments", (qc)$$2);
   }

   public static cax a(ceu $$0) {
      cax $$1 = new cax(caz.ss);
      a($$1, $$0);
      return $$1;
   }

   @Override
   public void a(bzj $$0, hi<cax> $$1) {
      if ($$0 == bzj.g) {
         for(cer $$2 : hm.W) {
            if ($$2.e != null) {
               for(int $$3 = $$2.e(); $$3 <= $$2.a(); ++$$3) {
                  $$1.add(a(new ceu($$2, $$3)));
               }
            }
         }
      } else if ($$0.n().length != 0) {
         for(cer $$4 : hm.W) {
            if ($$0.a($$4.e)) {
               $$1.add(a(new ceu($$4, $$4.a())));
            }
         }
      }

   }
}
