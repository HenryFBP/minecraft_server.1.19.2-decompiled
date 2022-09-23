import com.mojang.serialization.Codec;

public class dex extends ddt<dgo> {
   public dex(Codec<dgo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgo> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         dgo $$3 = $$0.f();
         amn $$4 = $$0.d();
         cqf $$5 = cqf.b();
         int $$6 = $$3.f() + $$3.d();

         for(int $$7 = 0; $$7 < $$6; ++$$7) {
            for(int $$8 = 0; $$8 < $$3.a(); ++$$8) {
               $$5.a($$2, $$3.b());
            }

            boolean $$9 = $$7 < $$3.f();

            for(int $$10 = 0; $$10 < $$3.c(); ++$$10) {
               $$5.a($$1, $$2, $$4, $$9);
            }

            $$5.j();
         }

         gt $$11 = $$2.c();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, cju.pr.m(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for(int $$13 = 0; $$13 < $$12; ++$$13) {
            gt $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).h() && $$1.a_($$14.c()).d($$1, $$14.c(), gy.b)) {
               $$1.a($$14, cju.ps.m().a(cqe.c, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(cgy $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      if ($$2.b() instanceof cqa) {
         return true;
      } else {
         return !$$2.h() && (!$$2.a(cju.C) || !$$2.p().b()) ? false : gy.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
