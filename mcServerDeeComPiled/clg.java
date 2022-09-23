import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class clg extends cjt implements cql {
   public static final cwf a = cox.a;
   public static final cwf b = cox.b;
   public static final cwf c = cox.c;
   public static final cwf d = cox.d;
   public static final cwf e = cwe.C;
   protected static final Map<gy, cwf> f = (Map<gy, cwf>)cox.g.entrySet().stream().filter($$0 -> ((gy)$$0.getKey()).o().d()).collect(ad.a());
   protected final dxj[] g;
   protected final dxj[] h;
   private final Object2IntMap<cvo> i = new Object2IntOpenHashMap();

   protected clg(float $$0, float $$1, float $$2, float $$3, float $$4, cvn.c $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.D.a().iterator();

      while(var7.hasNext()) {
         cvo $$6 = (cvo)var7.next();
         this.g($$6);
      }

   }

   protected dxj[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      dxj $$9 = cjt.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      dxj $$10 = cjt.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      dxj $$11 = cjt.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      dxj $$12 = cjt.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      dxj $$13 = cjt.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      dxj $$14 = dxg.a($$10, $$13);
      dxj $$15 = dxg.a($$11, $$12);
      dxj[] $$16 = new dxj[]{
         dxg.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         dxg.a($$11, $$10),
         dxg.a($$12, $$10),
         dxg.a($$15, $$10),
         $$13,
         dxg.a($$11, $$13),
         dxg.a($$12, $$13),
         dxg.a($$15, $$13),
         $$14,
         dxg.a($$11, $$14),
         dxg.a($$12, $$14),
         dxg.a($$15, $$14)
      };

      for(int $$17 = 0; $$17 < 16; ++$$17) {
         $$16[$$17] = dxg.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return !$$0.c(e);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(gy $$0) {
      return 1 << $$0.e();
   }

   protected int g(cvo $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(gy.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(gy.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(gy.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(gy.e);
         }

         return $$1;
      });
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(e) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      switch($$1) {
         case c:
            return $$0.a(a, (Boolean)$$0.c(c)).a(b, (Boolean)$$0.c(d)).a(c, (Boolean)$$0.c(a)).a(d, (Boolean)$$0.c(b));
         case d:
            return $$0.a(a, (Boolean)$$0.c(b)).a(b, (Boolean)$$0.c(c)).a(c, (Boolean)$$0.c(d)).a(d, (Boolean)$$0.c(a));
         case b:
            return $$0.a(a, (Boolean)$$0.c(d)).a(b, (Boolean)$$0.c(a)).a(c, (Boolean)$$0.c(b)).a(d, (Boolean)$$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      switch($$1) {
         case b:
            return $$0.a(a, (Boolean)$$0.c(c)).a(c, (Boolean)$$0.c(a));
         case c:
            return $$0.a(b, (Boolean)$$0.c(d)).a(d, (Boolean)$$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
