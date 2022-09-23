import com.mojang.serialization.Codec;

public abstract class dcw extends ddt<dfz> {
   public dcw(Codec<dfz> $$0) {
      super($$0);
   }

   protected void a(cgy $$0, amn $$1, gt $$2, dfz $$3, int $$4, gt.a $$5) {
      for(int $$6 = 0; $$6 < $$4; ++$$6) {
         $$5.g($$2).c(gy.b, $$6);
         if (!$$0.a_($$5).i($$0, $$5)) {
            this.a($$0, $$5, $$3.c.a($$1, $$2));
         }
      }

   }

   protected int a(amn $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(cgy $$0, gt $$1, int $$2, gt.a $$3, dfz $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.u_() + 1 && $$5 + $$2 + 1 < $$0.ah()) {
         cvo $$6 = $$0.a_($$1.c());
         if (!b($$6) && !$$6.a(akl.aR)) {
            return false;
         } else {
            for(int $$7 = 0; $$7 <= $$2; ++$$7) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for(int $$9 = -$$8; $$9 <= $$8; ++$$9) {
                  for(int $$10 = -$$8; $$10 <= $$8; ++$$10) {
                     cvo $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.h() && !$$11.a(akl.K)) {
                        return false;
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean a(ddv<dfz> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      amn $$3 = $$0.d();
      dfz $$4 = $$0.f();
      int $$5 = this.a($$3);
      gt.a $$6 = new gt.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(cgy var1, amn var2, gt var3, int var4, gt.a var5, dfz var6);
}
