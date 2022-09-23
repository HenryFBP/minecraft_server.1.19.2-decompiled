import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cjf extends cjc {
   public static final cwi a = cnf.aD;
   private static final Map<gy, dxj> b = Maps.newEnumMap(
      ImmutableMap.of(
         gy.c,
         cjt.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         gy.d,
         cjt.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         gy.e,
         cjt.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         gy.f,
         cjt.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   protected cjf(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(c, Boolean.valueOf(true)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)b.get($$0.c(a));
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
      $$0.a(a, c);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cju.a.m() : $$0;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gy $$3 = $$0.c(a);
      gt $$4 = $$2.a($$3.g());
      cvo $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = super.a($$0);
      cha $$2 = $$0.q();
      gt $$3 = $$0.a();
      gy[] $$4 = $$0.f();

      for(gy $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(a, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
