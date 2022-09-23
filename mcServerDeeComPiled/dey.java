import com.mojang.serialization.Codec;

public class dey extends ddt<dfs> {
   public dey(Codec<dfs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dfs> $$0) {
      int $$1 = 0;
      amn $$2 = $$0.d();
      chp $$3 = $$0.b();
      gt $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for(int $$6 = 0; $$6 < $$5; ++$$6) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dar.a.d, $$4.u() + $$7, $$4.w() + $$8);
         gt $$10 = new gt($$4.u() + $$7, $$9, $$4.w() + $$8);
         cvo $$11 = cju.lG.m().a(cqh.b, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cju.C) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            ++$$1;
         }
      }

      return $$1 > 0;
   }
}
