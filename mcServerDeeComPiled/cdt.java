import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class cdt extends cdi {
   public cdt(abb $$0) {
      super($$0);
   }

   public boolean a(bxa $$0, cgx $$1) {
      List<cax> $$2 = Lists.newArrayList();

      for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
         cax $$4 = $$0.a($$3);
         if (!$$4.b()) {
            $$2.add($$4);
            if ($$2.size() > 1) {
               cax $$5 = (cax)$$2.get(0);
               if (!$$4.a($$5.c()) || $$5.K() != 1 || $$4.K() != 1 || !$$5.c().o()) {
                  return false;
               }
            }
         }
      }

      return $$2.size() == 2;
   }

   public cax a(bxa $$0) {
      List<cax> $$1 = Lists.newArrayList();

      for(int $$2 = 0; $$2 < $$0.b(); ++$$2) {
         cax $$3 = $$0.a($$2);
         if (!$$3.b()) {
            $$1.add($$3);
            if ($$1.size() > 1) {
               cax $$4 = (cax)$$1.get(0);
               if (!$$3.a($$4.c()) || $$4.K() != 1 || $$3.K() != 1 || !$$4.c().o()) {
                  return cax.b;
               }
            }
         }
      }

      if ($$1.size() == 2) {
         cax $$5 = (cax)$$1.get(0);
         cax $$6 = (cax)$$1.get(1);
         if ($$5.a($$6.c()) && $$5.K() == 1 && $$6.K() == 1 && $$5.c().o()) {
            cat $$7 = $$5.c();
            int $$8 = $$7.n() - $$5.j();
            int $$9 = $$7.n() - $$6.j();
            int $$10 = $$8 + $$9 + $$7.n() * 5 / 100;
            int $$11 = $$7.n() - $$10;
            if ($$11 < 0) {
               $$11 = 0;
            }

            cax $$12 = new cax($$5.c());
            $$12.b($$11);
            Map<cer, Integer> $$13 = Maps.newHashMap();
            Map<cer, Integer> $$14 = cet.a($$5);
            Map<cer, Integer> $$15 = cet.a($$6);
            hm.W.r().filter(cer::c).forEach($$3 -> {
               int $$4 = Math.max($$14.getOrDefault($$3, 0), $$15.getOrDefault($$3, 0));
               if ($$4 > 0) {
                  $$13.put($$3, $$4);
               }

            });
            if (!$$13.isEmpty()) {
               cet.a($$13, $$12);
            }

            return $$12;
         }
      }

      return cax.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cdr<?> U_() {
      return cdr.o;
   }
}
