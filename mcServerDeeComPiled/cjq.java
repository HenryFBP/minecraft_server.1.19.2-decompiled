import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cjq extends cnf implements cjv, cql {
   private static final cwf a = cwe.C;
   private static final cwm<cwy> b = cwe.bm;
   private static final int c = -1;
   private static final Object2IntMap<cwy> d = ad.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(cwy.b, 10);
      $$0.put(cwy.c, 10);
      $$0.put(cwy.d, 100);
   });
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 11;
   private static final int h = 13;
   private static final Map<cwy, dxj> i = ImmutableMap.of(
      cwy.a,
      cjt.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      cwy.b,
      cjt.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      cwy.c,
      cjt.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      cwy.d,
      dxg.a()
   );
   private static final dxj j = cjt.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<gy, dxj> k = ImmutableMap.of(
      gy.c, dxg.b(cjr.a, j, dwu.e), gy.d, dxg.b(cjr.b, j, dwu.e), gy.f, dxg.b(cjr.c, j, dwu.e), gy.e, dxg.b(cjr.d, j, dwu.e)
   );
   private final Map<cvo, dxj> l;

   protected cjq(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(false)).a(aD, gy.c).a(b, cwy.a));
      this.l = this.a(cjq::h);
   }

   private static dxj h(cvo $$0) {
      return dxg.a((dxj)i.get($$0.c(b)), (dxj)k.get($$0.c(aD)));
   }

   public static void a(cgy $$0, amn $$1, gt $$2, gy $$3) {
      int $$4 = ami.a($$1, 2, 5);
      gt.a $$5 = $$2.i();
      int $$6 = 0;

      while($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         ++$$6;
         $$5.c(gy.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while($$5.v() < $$7) {
         cjr.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(gy.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(cvo $$0) {
      return $$0.h() || $$0.a(cju.C) || $$0.a(cju.qn);
   }

   protected static boolean a(cgz $$0, gt $$1, cvo $$2) {
      return !$$0.v($$1) && n($$2);
   }

   protected static boolean a(cgy $$0, gt $$1, dpv $$2, gy $$3) {
      cvo $$4 = cju.ql.m().a(a, Boolean.valueOf($$2.a(dpw.c))).a(aD, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      this.a($$1, $$0, $$2.a(), cwy.d, ajw.eV);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(a) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      cvo $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cju.qm) || $$4.a(akl.bn);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == gy.a && !$$0.a($$3, $$4)) {
         return cju.a.m();
      } else {
         if ($$0.c(a)) {
            $$3.a($$4, dpw.c, dpw.c.a($$3));
         }

         return $$1 == gy.b && $$2.a(this) ? cju.qm.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      cvo $$4 = $$0.a_($$1.b());
      return n($$4);
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      gt $$4 = $$2.b();
      cvo $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         gy $$6 = $$3.c(aD);
         cjr.a($$0, $$2, $$3.p(), $$6);
         a($$0, $$4, $$5.p(), $$6);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$1.y) {
         if ($$0.c(b) == cwy.a && a($$2, $$3) && !$$1.r($$2)) {
            this.a($$0, $$1, $$2, cwy.b, null);
         }

      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.r($$2)) {
         d($$0, $$1, $$2);
      } else {
         cwy $$4 = $$0.c(b);
         if ($$4 == cwy.b) {
            this.a($$0, $$1, $$2, cwy.c, ajw.eV);
         } else if ($$4 == cwy.c) {
            this.a($$0, $$1, $$2, cwy.d, ajw.eV);
         } else if ($$4 == cwy.d) {
            d($$0, $$1, $$2);
         }

      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if ($$1.r($$2)) {
         d($$0, $$1, $$2);
      }

   }

   private static void a(cgx $$0, gt $$1, ajv $$2) {
      float $$3 = ami.b($$0.w, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, ajx.e, 1.0F, $$3);
   }

   private static boolean a(gt $$0, bbn $$1) {
      return $$1.aw() && $$1.cY().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(cvo $$0, cgx $$1, gt $$2, cwy $$3, @Nullable ajv $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = d.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }

   }

   private static void d(cvo $$0, cgx $$1, gt $$2) {
      a($$0, $$1, $$2, cwy.a);
      if ($$0.c(b) != cwy.a) {
         a($$1, $$2, ajw.eW);
      }

   }

   private static void a(cvo $$0, cgx $$1, gt $$2, cwy $$3) {
      cwy $$4 = $$0.c(b);
      $$1.a($$2, $$0.a(b, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, czv.c, $$2);
      }

   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)i.get($$0.c(b));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)this.l.get($$0);
   }

   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = $$0.q().a_($$0.a().c());
      dpv $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cju.ql) || $$1.a(cju.qm);
      return this.m().a(a, Boolean.valueOf($$2.a(dpw.c))).a(aD, $$3 ? (gy)$$1.c(aD) : $$0.g().g());
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, aD, b);
   }
}
