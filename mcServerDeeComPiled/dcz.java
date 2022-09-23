import com.mojang.serialization.Codec;

public class dcz extends ddt<dge> {
   public dcz(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      gt $$1 = $$0.e();
      chp $$2 = $$0.b();
      amn $$3 = $$0.d();
      if ($$2.x($$1) && !$$2.x($$1.b())) {
         gt.a $$4 = $$1.i();
         gt.a $$5 = $$1.i();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while($$2.x($$4)) {
            if ($$2.v($$4)) {
               return true;
            }

            $$2.a($$4, cju.di.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, gy.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, gy.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, gy.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, gy.f));
            $$4.c(gy.a);
         }

         $$4.c(gy.b);
         this.a($$2, $$3, $$5.a($$4, gy.c));
         this.a($$2, $$3, $$5.a($$4, gy.d));
         this.a($$2, $$3, $$5.a($$4, gy.e));
         this.a($$2, $$3, $$5.a($$4, gy.f));
         $$4.c(gy.a);
         gt.a $$10 = new gt.a();

         for(int $$11 = -3; $$11 < 4; ++$$11) {
            for(int $$12 = -3; $$12 < 4; ++$$12) {
               int $$13 = ami.a($$11) * ami.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while($$2.x($$5.a($$10, gy.a))) {
                     $$10.c(gy.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.x($$5.a($$10, gy.a))) {
                     $$2.a($$10, cju.di.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(cgy $$0, amn $$1, gt $$2) {
      if ($$1.h()) {
         $$0.a($$2, cju.di.m(), 2);
      }

   }

   private boolean b(cgy $$0, amn $$1, gt $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, cju.di.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
