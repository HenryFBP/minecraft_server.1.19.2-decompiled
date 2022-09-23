import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class csh extends cru {
   public static final cwi a = cnf.aD;
   protected static final float b = 2.5F;
   private static final Map<gy, dxj> c = Maps.newEnumMap(
      ImmutableMap.of(
         gy.c,
         cjt.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         gy.d,
         cjt.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         gy.e,
         cjt.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         gy.f,
         cjt.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   protected csh(cvn.c $$0, im $$1) {
      super($$0, $$1);
      this.k(this.D.b().a(a, gy.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return h($$0);
   }

   public static dxj h(cvo $$0) {
      return (dxj)c.get($$0.c(a));
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
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cju.a.m() : $$0;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      gy $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      gy $$10 = $$4.g();
      $$1.a(io.Y, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.i, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
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
