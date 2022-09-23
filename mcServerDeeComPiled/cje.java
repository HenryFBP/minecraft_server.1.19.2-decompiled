import javax.annotation.Nullable;

public class cje extends cjt implements cql {
   public static final cwf c = cwe.C;
   private static final dxj a = cjt.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cje(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(c, Boolean.valueOf(true)));
   }

   protected void a(cvo $$0, cgy $$1, gt $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.r_().a(40));
      }

   }

   protected static boolean e(cvo $$0, cgd $$1, gt $$2) {
      if ($$0.c(c)) {
         return true;
      } else {
         for(gy $$3 : gy.values()) {
            if ($$1.b_($$2.a($$3)).a(akp.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      return this.m().a(c, Boolean.valueOf($$1.a(akp.a) && $$1.e() == 8));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$1 == gy.a && !this.a($$0, (cha)$$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      return $$1.a_($$3).d($$1, $$3, gy.b);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(c);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(c) ? dpw.c.a(false) : super.c_($$0);
   }
}
