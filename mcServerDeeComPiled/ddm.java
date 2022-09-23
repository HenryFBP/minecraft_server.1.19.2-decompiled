import com.mojang.serialization.Codec;

public class ddm extends ddt<dge> {
   private static final cvy a = cvy.a(cju.E);
   private final cvo b = cju.iA.m();
   private final cvo c = cju.aI.m();
   private final cvo d = cju.C.m();

   public ddm(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      $$2 = $$2.b();

      while($$1.x($$2) && $$2.v() > $$1.u_() + 2) {
         $$2 = $$2.c();
      }

      if (!a.a($$1.a_($$2))) {
         return false;
      } else {
         for(int $$3 = -2; $$3 <= 2; ++$$3) {
            for(int $$4 = -2; $$4 <= 2; ++$$4) {
               if ($$1.x($$2.b($$3, -1, $$4)) && $$1.x($$2.b($$3, -2, $$4))) {
                  return false;
               }
            }
         }

         for(int $$5 = -1; $$5 <= 0; ++$$5) {
            for(int $$6 = -2; $$6 <= 2; ++$$6) {
               for(int $$7 = -2; $$7 <= 2; ++$$7) {
                  $$1.a($$2.b($$6, $$5, $$7), this.c, 2);
               }
            }
         }

         $$1.a($$2, this.d, 2);

         for(gy $$8 : gy.c.a) {
            $$1.a($$2.a($$8), this.d, 2);
         }

         for(int $$9 = -2; $$9 <= 2; ++$$9) {
            for(int $$10 = -2; $$10 <= 2; ++$$10) {
               if ($$9 == -2 || $$9 == 2 || $$10 == -2 || $$10 == 2) {
                  $$1.a($$2.b($$9, 1, $$10), this.c, 2);
               }
            }
         }

         $$1.a($$2.b(2, 1, 0), this.b, 2);
         $$1.a($$2.b(-2, 1, 0), this.b, 2);
         $$1.a($$2.b(0, 1, 2), this.b, 2);
         $$1.a($$2.b(0, 1, -2), this.b, 2);

         for(int $$11 = -1; $$11 <= 1; ++$$11) {
            for(int $$12 = -1; $$12 <= 1; ++$$12) {
               if ($$11 == 0 && $$12 == 0) {
                  $$1.a($$2.b($$11, 4, $$12), this.c, 2);
               } else {
                  $$1.a($$2.b($$11, 4, $$12), this.b, 2);
               }
            }
         }

         for(int $$13 = 1; $$13 <= 3; ++$$13) {
            $$1.a($$2.b(-1, $$13, -1), this.c, 2);
            $$1.a($$2.b(-1, $$13, 1), this.c, 2);
            $$1.a($$2.b(1, $$13, -1), this.c, 2);
            $$1.a($$2.b(1, $$13, 1), this.c, 2);
         }

         return true;
      }
   }
}
