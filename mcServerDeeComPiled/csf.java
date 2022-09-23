import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class csf extends cqk {
   public static final cwi d = cnf.aD;
   protected static final float e = 2.0F;
   protected static final float f = 4.5F;
   protected static final float g = 12.5F;
   private static final Map<gy, dxj> h = Maps.newEnumMap(
      ImmutableMap.of(
         gy.c,
         cjt.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         gy.d,
         cjt.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         gy.f,
         cjt.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         gy.e,
         cjt.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public csf(cvn.c $$0, cxa $$1) {
      super($$0, $$1);
      this.k(this.D.b().a(d, gy.c).a(a, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)h.get($$0.c(d));
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return $$1.a_($$2.a(((gy)$$0.c(d)).g())).d().b();
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = this.m();
      dpv $$2 = $$0.q().b_($$0.a());
      cha $$3 = $$0.q();
      gt $$4 = $$0.a();
      gy[] $$5 = $$0.f();

      for(gy $$6 : $$5) {
         if ($$6.o().d()) {
            gy $$7 = $$6.g();
            $$1 = $$1.a(d, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(a, Boolean.valueOf($$2.a() == dpw.c));
            }
         }
      }

      return null;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1.g() == $$0.c(d) && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d, a);
   }
}
