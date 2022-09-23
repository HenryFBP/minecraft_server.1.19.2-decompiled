import com.google.common.collect.Maps;
import java.util.Map;

public class ciz extends cik {
   public static final cwo a = cwe.bb;
   private static final Map<bzq, cjt> b = Maps.newHashMap();
   private static final dxj c = cjt.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public ciz(bzq $$0, cvn.c $$1) {
      super($$0, $$1);
      this.k(this.D.b().a(a, Integer.valueOf(0)));
      b.put($$0, this);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return $$1.a_($$2.c()).d().b();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c;
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, Integer.valueOf(ami.b((double)((180.0F + $$0.i()) * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == gy.a && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a(a, Integer.valueOf($$1.a($$0.c(a), 16)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   public static cjt a(bzq $$0) {
      return (cjt)b.getOrDefault($$0, cju.hH);
   }
}
