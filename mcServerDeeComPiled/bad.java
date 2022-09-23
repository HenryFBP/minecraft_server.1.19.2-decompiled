import java.util.List;
import java.util.function.Predicate;

public class bad {
   public static cax a(List<cax> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !((cax)$$0.get($$1)).b() && $$2 > 0 ? ((cax)$$0.get($$1)).a($$2) : cax.b;
   }

   public static cax a(List<cax> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? (cax)$$0.set($$1, cax.b) : cax.b;
   }

   public static pj a(pj $$0, hi<cax> $$1) {
      return a($$0, $$1, true);
   }

   public static pj a(pj $$0, hi<cax> $$1, boolean $$2) {
      pp $$3 = new pp();

      for(int $$4 = 0; $$4 < $$1.size(); ++$$4) {
         cax $$5 = $$1.get($$4);
         if (!$$5.b()) {
            pj $$6 = new pj();
            $$6.a("Slot", (byte)$$4);
            $$5.b($$6);
            $$3.add($$6);
         }
      }

      if (!$$3.isEmpty() || $$2) {
         $$0.a("Items", (qc)$$3);
      }

      return $$0;
   }

   public static void b(pj $$0, hi<cax> $$1) {
      pp $$2 = $$0.c("Items", 10);

      for(int $$3 = 0; $$3 < $$2.size(); ++$$3) {
         pj $$4 = $$2.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < $$1.size()) {
            $$1.set($$5, cax.a($$4));
         }
      }

   }

   public static int a(bac $$0, Predicate<cax> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for(int $$5 = 0; $$5 < $$0.b(); ++$$5) {
         cax $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.b()) {
            $$0.a($$5, cax.b);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(cax $$0, Predicate<cax> $$1, int $$2, boolean $$3) {
      if ($$0.b() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.K();
      } else {
         int $$4 = $$2 < 0 ? $$0.K() : Math.min($$2, $$0.K());
         $$0.g($$4);
         return $$4;
      }
   }
}
