import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class csg extends ciq {
   public static final cwi a = cnf.aD;
   private static final Map<gy, dxj> b = Maps.newEnumMap(
      ImmutableMap.of(
         gy.c,
         cjt.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         gy.d,
         cjt.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         gy.f,
         cjt.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         gy.e,
         cjt.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   protected csg(cqm.a $$0, cvn.c $$1) {
      super($$0, $$1);
      this.k(this.D.b().a(a, gy.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)b.get($$0.c(a));
   }

   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = this.m();
      cgd $$2 = $$0.q();
      gt $$3 = $$0.a();
      gy[] $$4 = $$0.f();

      for(gy $$5 : $$4) {
         if ($$5.o().d()) {
            gy $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
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
