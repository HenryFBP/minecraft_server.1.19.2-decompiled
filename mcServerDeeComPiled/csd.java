import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class csd extends cik {
   public static final cwi a = cnf.aD;
   private static final Map<gy, dxj> b = Maps.newEnumMap(
      ImmutableMap.of(
         gy.c,
         cjt.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         gy.d,
         cjt.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         gy.e,
         cjt.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         gy.f,
         cjt.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public csd(bzq $$0, cvn.c $$1) {
      super($$0, $$1);
      this.k(this.D.b().a(a, gy.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return $$1.a_($$2.a(((gy)$$0.c(a)).g())).d().b();
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == ((gy)$$0.c(a)).g() && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)b.get($$0.c(a));
   }

   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = this.m();
      cha $$2 = $$0.q();
      gt $$3 = $$0.a();
      gy[] $$4 = $$0.f();

      for(gy $$5 : $$4) {
         if ($$5.o().d()) {
            gy $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }
}
