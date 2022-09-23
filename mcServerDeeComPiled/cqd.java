import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import javax.annotation.Nullable;

public class cqd extends cjg implements cql {
   public static final int a = 40;
   public static final int b = 1;
   public static final Object2IntMap<czv> c = Object2IntMaps.unmodifiable(ad.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.put(czv.R, 1);
      $$0.put(czv.x, 2);
      $$0.put(czv.S, 3);
      $$0.put(czv.o, 4);
      $$0.put(czv.A, 5);
      $$0.put(czv.T, 5);
      $$0.put(czv.Q, 6);
      $$0.put(czv.u, 6);
      $$0.put(czv.c, 6);
      $$0.put(czv.H, 6);
      $$0.put(czv.M, 7);
      $$0.put(czv.m, 7);
      $$0.put(czv.K, 7);
      $$0.put(czv.L, 8);
      $$0.put(czv.n, 8);
      $$0.put(czv.r, 8);
      $$0.put(czv.p, 8);
      $$0.put(czv.v, 9);
      $$0.put(czv.O, 9);
      $$0.put(czv.t, 9);
      $$0.put(czv.d, 10);
      $$0.put(czv.e, 10);
      $$0.put(czv.g, 10);
      $$0.put(czv.l, 10);
      $$0.put(czv.h, 11);
      $$0.put(czv.a, 11);
      $$0.put(czv.b, 11);
      $$0.put(czv.s, 12);
      $$0.put(czv.i, 12);
      $$0.put(czv.z, 12);
      $$0.put(czv.q, 13);
      $$0.put(czv.f, 13);
      $$0.put(czv.y, 13);
      $$0.put(czv.C, 14);
      $$0.put(czv.j, 14);
      $$0.put(czv.I, 14);
      $$0.put(czv.J, 15);
      $$0.put(czv.k, 15);
      $$0.put(czv.D, 15);
      $$0.put(czv.w, 15);
      $$0.put(czv.G, 15);
      $$0.put(czv.B, 15);
   }));
   public static final cwm<cwu> d = cwe.bp;
   public static final cwo e = cwe.aT;
   public static final cwf f = cwe.C;
   protected static final dxj g = cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final int h;

   public cqd(cvn.c $$0, int $$1) {
      super($$0);
      this.k(this.D.b().a(d, cwu.a).a(e, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
      this.h = $$1;
   }

   public int d() {
      return this.h;
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      gt $$1 = $$0.a();
      dpv $$2 = $$0.q().b_($$1);
      return this.m().a(f, Boolean.valueOf($$2.a() == dpw.c));
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(f) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (h($$0) != cwu.b) {
         if (h($$0) == cwu.c) {
            $$1.a($$2, $$0.a(d, cwu.a), 3);
         }

      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bbn $$3) {
      if (!$$0.k_() && n($$2) && $$3.ad() != bbr.bc) {
         cti $$4 = $$0.c_($$1);
         if ($$4 instanceof cuh $$5) {
            $$5.a(c.get(czv.R));
         }

         a($$3, $$0, $$1, $$2, 15);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$1.k_() && !$$0.a($$3.b())) {
         if ($$0.c(e) > 0 && !$$1.K().a($$2, this)) {
            $$1.a($$2, $$0.a(e, Integer.valueOf(0)), 18);
         }

         $$1.a(new gt($$2), $$0.b(), 1);
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == cwu.b) {
            a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(cgx $$0, gt $$1) {
      $$0.a($$1, cju.po);
      $$0.a($$1.a(gy.b.g()), cju.po);
   }

   @Nullable
   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cuh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> czx a(agg $$0, T $$1) {
      return $$1 instanceof cuh ? ((cuh)$$1).c() : null;
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return !$$0.y ? a($$2, ctk.H, ($$0x, $$1x, $$2x, $$3) -> $$3.c().a($$0x)) : null;
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return g;
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(e);
   }

   public static cwu h(cvo $$0) {
      return $$0.c(d);
   }

   public static boolean n(cvo $$0) {
      return h($$0) == cwu.a;
   }

   public static void a(cgx $$0, gt $$1, cvo $$2) {
      $$0.a($$1, $$2.a(d, cwu.c).a(e, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 1);
      if (!$$2.c(f)) {
         $$0.a(null, $$1, ajw.rN, ajx.e, 1.0F, $$0.w.i() * 0.2F + 0.8F);
      }

      a($$0, $$1);
   }

   public static void a(@Nullable bbn $$0, cgx $$1, gt $$2, cvo $$3, int $$4) {
      $$1.a($$2, $$3.a(d, cwu.b).a(e, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), 40);
      a($$1, $$2);
      $$1.a($$0, czv.N, $$2);
      if (!$$3.c(f)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ajw.rM, ajx.e, 1.0F, $$1.w.i() * 0.2F + 0.8F);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if (h($$0) == cwu.b) {
         gy $$4 = gy.b($$3);
         if ($$4 != gy.b && $$4 != gy.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ih.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      cti $$3 = $$1.c_($$2);
      if ($$3 instanceof cuh $$4) {
         return h($$0) == cwu.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, cax $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, azl.a(5));
      }

   }
}
