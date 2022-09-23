import javax.annotation.Nullable;

public class cnq extends cjt implements cql {
   public static final cwf a = cwe.j;
   public static final cwf b = cwe.C;
   protected static final dxj c = dxg.a(cjt.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cjt.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final dxj d = dxg.a(cjt.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cjt.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   public cnq(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());

      for(gy $$2 : $$0.f()) {
         if ($$2.o() == gy.a.b) {
            cvo $$3 = this.m().a(a, Boolean.valueOf($$2 == gy.b));
            if ($$3.a((cha)$$0.q(), $$0.a())) {
               return $$3.a(b, Boolean.valueOf($$1.a() == dpw.c));
            }
         }
      }

      return null;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return $$0.c(a) ? d : c;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gy $$3 = h($$0).g();
      return cjt.a($$1, $$2.a($$3), $$3.g());
   }

   protected static gy h(cvo $$0) {
      return $$0.c(a) ? gy.a : gy.b;
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(b) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
