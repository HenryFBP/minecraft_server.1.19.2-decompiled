import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class cox extends cjt {
   private static final gy[] i = gy.values();
   public static final cwf a = cwe.M;
   public static final cwf b = cwe.N;
   public static final cwf c = cwe.O;
   public static final cwf d = cwe.P;
   public static final cwf e = cwe.K;
   public static final cwf f = cwe.L;
   public static final Map<gy, cwf> g = ImmutableMap.copyOf(ad.a(Maps.newEnumMap(gy.class), $$0 -> {
      $$0.put(gy.c, a);
      $$0.put(gy.f, b);
      $$0.put(gy.d, c);
      $$0.put(gy.e, d);
      $$0.put(gy.b, e);
      $$0.put(gy.a, f);
   }));
   protected final dxj[] h;

   protected cox(float $$0, cvn.c $$1) {
      super($$1);
      this.h = this.a($$0);
   }

   private dxj[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      dxj $$3 = cjt.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      dxj[] $$4 = new dxj[i.length];

      for(int $$5 = 0; $$5 < i.length; ++$$5) {
         gy $$6 = i[$$5];
         $$4[$$5] = dxg.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      dxj[] $$7 = new dxj[64];

      for(int $$8 = 0; $$8 < 64; ++$$8) {
         dxj $$9 = $$3;

         for(int $$10 = 0; $$10 < i.length; ++$$10) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = dxg.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return false;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.h[this.h($$0)];
   }

   protected int h(cvo $$0) {
      int $$1 = 0;

      for(int $$2 = 0; $$2 < i.length; ++$$2) {
         if ($$0.c((cwr)g.get(i[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}
