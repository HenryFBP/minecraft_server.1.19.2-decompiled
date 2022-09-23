import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public class civ extends cka {
   public static final cwi a = cnf.aD;
   protected static final float b = 2.0F;
   private static final Map<gy, dxj> c = Maps.newEnumMap(
      ImmutableMap.of(
         gy.d,
         cjt.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         gy.e,
         cjt.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         gy.c,
         cjt.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         gy.f,
         cjt.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final crg d;
   private final Supplier<cat> e;

   protected civ(crg $$0, Supplier<cat> $$1, cvn.c $$2) {
      super($$2);
      this.k(this.D.b().a(a, gy.c));
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)c.get($$0.c(a));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return !$$2.a(this.d) && $$1 == $$0.c(a) ? this.d.b().m().a(crf.b, Integer.valueOf(7)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.a(cju.cn);
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax((cgw)this.e.get());
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
