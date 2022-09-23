import com.mojang.serialization.Codec;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableInt;

public class ddx extends ddt<ddy> {
   public ddx(Codec<ddy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<ddy> $$0) {
      amn $$1 = $$0.d();
      chp $$2 = $$0.b();
      gt $$3 = $$0.e();
      cpw $$4 = cpw.a($$1);
      ddy $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      dou $$7 = $$2.D().n().aV();
      dot $$8 = $$7.a((abb)$$5.b.get($$6));
      dot $$9 = $$7.a((abb)$$5.c.get($$6));
      cge $$10 = new cge($$3);
      dkt $$11 = new dkt($$10.d() - 16, $$2.u_(), $$10.e() - 16, $$10.f() + 16, $$2.ah(), $$10.g() + 16);
      dop $$12 = new dop().a($$4).a($$11).a($$1);
      hs $$13 = $$8.a($$4);
      gt $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for(int $$16 = 0; $$16 < $$13.u(); ++$$16) {
         for(int $$17 = 0; $$17 < $$13.w(); ++$$17) {
            $$15 = Math.min($$15, $$2.a(dar.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.u_() + 10);
      gt $$19 = $$8.a($$14.h($$18), coh.a, $$4);
      if (a($$2, $$8.b($$12, $$19)) > $$5.f) {
         return false;
      } else {
         $$12.b();
         $$5.d.a().a().forEach($$12::a);
         $$8.a($$2, $$19, $$19, $$12, $$1, 4);
         $$12.b();
         $$5.e.a().a().forEach($$12::a);
         $$9.a($$2, $$19, $$19, $$12, $$1, 4);
         return true;
      }
   }

   private static int a(chp $$0, dkt $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a((Consumer<gt>)($$2x -> {
         cvo $$3 = $$0.a_($$2x);
         if ($$3.h() || $$3.a(cju.D) || $$3.a(cju.C)) {
            $$2.add(1);
         }

      }));
      return $$2.getValue();
   }
}
