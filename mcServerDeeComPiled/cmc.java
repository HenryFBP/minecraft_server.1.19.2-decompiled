import javax.annotation.Nullable;

public class cmc extends cnf {
   public static final cwm<cwa> J = cwe.U;

   protected cmc(cvn.c $$0) {
      super($$0);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cha $$0, gt $$1, gy $$2) {
      gt $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      for(gy $$1 : $$0.f()) {
         cvo $$2;
         if ($$1.o() == gy.a.b) {
            $$2 = this.m().a(J, $$1 == gy.b ? cwa.c : cwa.a).a(aD, $$0.g());
         } else {
            $$2 = this.m().a(J, cwa.b).a(aD, $$1.g());
         }

         if ($$2.a((cha)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static gy h(cvo $$0) {
      switch((cwa)$$0.c(J)) {
         case c:
            return gy.a;
         case a:
            return gy.b;
         default:
            return $$0.c(aD);
      }
   }
}
