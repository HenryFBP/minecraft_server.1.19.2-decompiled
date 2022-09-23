import com.google.common.collect.ImmutableList;
import java.util.List;

public enum cyw {
   a {
      @Override
      public void a(agg $$0, cyx $$1, List<bpo> $$2, int $$3, gt $$4) {
         gt $$5 = new gt(0, 128, 0);

         for(bpo $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(agg $$0, cyx $$1, List<bpo> $$2, int $$3, gt $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new gt(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }

      }
   },
   c {
      @Override
      public void a(agg $$0, cyx $$1, List<bpo> $$2, int $$3, gt $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<dfd.a> $$8 = dfd.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               dfd.a $$10 = (dfd.a)$$8.get($$9);
               if ($$6) {
                  for(bpo $$11 : $$2) {
                     $$11.a(new gt($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for(gt $$13 : gt.a(new gt($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new gt($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, (double)((float)$$10.a() + 0.5F), (double)$$10.d(), (double)((float)$$10.b() + 0.5F), 5.0F, cgp.a.c);
                  dgr $$14 = new dgr(true, ImmutableList.of($$10), new gt(0, 128, 0));
                  ddt.K.a($$14, $$0, $$0.k().g(), amn.a(), new gt($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }

      }
   },
   d {
      @Override
      public void a(agg $$0, cyx $$1, List<bpo> $$2, int $$3, gt $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.f();

            for(bpo $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.df(), $$5.dh(), $$5.dl(), 6.0F, cgp.a.a);
               $$5.ah();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new gt(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for(bpo $$6 : $$2) {
               $$6.a(new gt(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new gt(0, 128, 0), 0);
         }

      }
   },
   e {
      @Override
      public void a(agg $$0, cyx $$1, List<bpo> $$2, int $$3, gt $$4) {
      }
   };

   public abstract void a(agg var1, cyx var2, List<bpo> var3, int var4, gt var5);
}
