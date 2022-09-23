import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dek extends ddt<dge> {
   private static final Logger a = LogUtils.getLogger();
   private static final bbr<?>[] b = new bbr[]{bbr.aE, bbr.bj, bbr.bj, bbr.aL};
   private static final cvo c = cju.lN.m();

   public dek(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      Predicate<cvo> $$1 = ddt.a(akl.bw);
      gt $$2 = $$0.e();
      amn $$3 = $$0.d();
      chp $$4 = $$0.b();
      int $$5 = 3;
      int $$6 = $$3.a(2) + 2;
      int $$7 = -$$6 - 1;
      int $$8 = $$6 + 1;
      int $$9 = -1;
      int $$10 = 4;
      int $$11 = $$3.a(2) + 2;
      int $$12 = -$$11 - 1;
      int $$13 = $$11 + 1;
      int $$14 = 0;

      for(int $$15 = $$7; $$15 <= $$8; ++$$15) {
         for(int $$16 = -1; $$16 <= 4; ++$$16) {
            for(int $$17 = $$12; $$17 <= $$13; ++$$17) {
               gt $$18 = $$2.b($$15, $$16, $$17);
               dpz $$19 = $$4.a_($$18).d();
               boolean $$20 = $$19.b();
               if ($$16 == -1 && !$$20) {
                  return false;
               }

               if ($$16 == 4 && !$$20) {
                  return false;
               }

               if (($$15 == $$7 || $$15 == $$8 || $$17 == $$12 || $$17 == $$13) && $$16 == 0 && $$4.x($$18) && $$4.x($$18.b())) {
                  ++$$14;
               }
            }
         }
      }

      if ($$14 >= 1 && $$14 <= 5) {
         for(int $$21 = $$7; $$21 <= $$8; ++$$21) {
            for(int $$22 = 3; $$22 >= -1; --$$22) {
               for(int $$23 = $$12; $$23 <= $$13; ++$$23) {
                  gt $$24 = $$2.b($$21, $$22, $$23);
                  cvo $$25 = $$4.a_($$24);
                  if ($$21 == $$7 || $$22 == -1 || $$23 == $$12 || $$21 == $$8 || $$22 == 4 || $$23 == $$13) {
                     if ($$24.v() >= $$4.u_() && !$$4.a_($$24.c()).d().b()) {
                        $$4.a($$24, c, 2);
                     } else if ($$25.d().b() && !$$25.a(cju.cg)) {
                        if ($$22 == -1 && $$3.a(4) != 0) {
                           this.a($$4, $$24, cju.bY.m(), $$1);
                        } else {
                           this.a($$4, $$24, cju.m.m(), $$1);
                        }
                     }
                  } else if (!$$25.a(cju.cg) && !$$25.a(cju.ce)) {
                     this.a($$4, $$24, c, $$1);
                  }
               }
            }
         }

         for(int $$26 = 0; $$26 < 2; ++$$26) {
            for(int $$27 = 0; $$27 < 3; ++$$27) {
               int $$28 = $$2.u() + $$3.a($$6 * 2 + 1) - $$6;
               int $$29 = $$2.v();
               int $$30 = $$2.w() + $$3.a($$11 * 2 + 1) - $$11;
               gt $$31 = new gt($$28, $$29, $$30);
               if ($$4.x($$31)) {
                  int $$32 = 0;

                  for(gy $$33 : gy.c.a) {
                     if ($$4.a_($$31.a($$33)).d().b()) {
                        ++$$32;
                     }
                  }

                  if ($$32 == 1) {
                     this.a($$4, $$31, dlf.a($$4, $$31, cju.cg.m()), $$1);
                     cuf.a($$4, $$3, $$31, dry.d);
                     break;
                  }
               }
            }
         }

         this.a($$4, $$2, cju.ce.m(), $$1);
         cti $$34 = $$4.c_($$2);
         if ($$34 instanceof cun) {
            ((cun)$$34).d().a(this.a($$3));
         } else {
            a.error("Failed to fetch mob spawner entity at ({}, {}, {})", new Object[]{$$2.u(), $$2.v(), $$2.w()});
         }

         return true;
      } else {
         return false;
      }
   }

   private bbr<?> a(amn $$0) {
      return ad.a(b, $$0);
   }
}
