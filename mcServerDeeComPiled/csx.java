import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class csx extends ctc implements baq, bxx, byg {
   protected static final int b = 0;
   protected static final int c = 1;
   protected static final int d = 2;
   public static final int e = 0;
   private static final int[] q = new int[]{0};
   private static final int[] r = new int[]{2, 1};
   private static final int[] s = new int[]{1};
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = 3;
   public static final int i = 4;
   public static final int j = 200;
   public static final int k = 2;
   protected hi<cax> l = hi.a(3, cax.b);
   int t;
   int u;
   int v;
   int w;
   protected final bww m = new bww() {
      @Override
      public int a(int $$0) {
         switch($$0) {
            case 0:
               return csx.this.t;
            case 1:
               return csx.this.u;
            case 2:
               return csx.this.v;
            case 3:
               return csx.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch($$0) {
            case 0:
               csx.this.t = $$1;
               break;
            case 1:
               csx.this.u = $$1;
               break;
            case 2:
               csx.this.v = $$1;
               break;
            case 3:
               csx.this.w = $$1;
         }

      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<abb> x = new Object2IntOpenHashMap();
   private final cdq.a<bac, ? extends cdb> y;

   protected csx(ctk<?> $$0, gt $$1, cvo $$2, cds<? extends cdb> $$3) {
      super($$0, $$1, $$2);
      this.y = cdq.b($$3);
   }

   public static Map<cat, Integer> f() {
      Map<cat, Integer> $$0 = Maps.newLinkedHashMap();
      a($$0, caz.oJ, 20000);
      a($$0, cju.hz, 16000);
      a($$0, caz.qo, 2400);
      a($$0, caz.mS, 1600);
      a($$0, caz.mT, 1600);
      a($$0, aks.q, 300);
      a($$0, aks.b, 300);
      a($$0, aks.h, 300);
      a($$0, aks.i, 150);
      a($$0, aks.l, 300);
      a($$0, aks.k, 300);
      a($$0, cju.dd, 300);
      a($$0, cju.iX, 300);
      a($$0, cju.iW, 300);
      a($$0, cju.iY, 300);
      a($$0, cju.ja, 300);
      a($$0, cju.iZ, 300);
      a($$0, cju.jb, 300);
      a($$0, cju.eo, 300);
      a($$0, cju.iR, 300);
      a($$0, cju.iQ, 300);
      a($$0, cju.iS, 300);
      a($$0, cju.iU, 300);
      a($$0, cju.iT, 300);
      a($$0, cju.iV, 300);
      a($$0, cju.aL, 300);
      a($$0, cju.bX, 300);
      a($$0, cju.mL, 300);
      a($$0, cju.dc, 300);
      a($$0, cju.cg, 300);
      a($$0, cju.fW, 300);
      a($$0, cju.cl, 300);
      a($$0, cju.ga, 300);
      a($$0, aks.B, 300);
      a($$0, caz.mQ, 300);
      a($$0, caz.pe, 300);
      a($$0, cju.cx, 300);
      a($$0, aks.al, 200);
      a($$0, caz.ni, 200);
      a($$0, caz.nh, 200);
      a($$0, caz.nl, 200);
      a($$0, caz.nk, 200);
      a($$0, caz.nj, 200);
      a($$0, aks.g, 200);
      a($$0, aks.ai, 1200);
      a($$0, aks.a, 100);
      a($$0, aks.d, 100);
      a($$0, caz.nL, 100);
      a($$0, aks.n, 100);
      a($$0, caz.nM, 100);
      a($$0, aks.f, 67);
      a($$0, cju.kQ, 4001);
      a($$0, caz.tM, 300);
      a($$0, cju.lK, 50);
      a($$0, cju.bi, 100);
      a($$0, cju.mD, 50);
      a($$0, cju.mE, 300);
      a($$0, cju.mF, 300);
      a($$0, cju.mI, 300);
      a($$0, cju.mJ, 300);
      a($$0, cju.mM, 300);
      a($$0, cju.nN, 300);
      a($$0, cju.qh, 100);
      a($$0, cju.qi, 100);
      a($$0, cju.V, 300);
      return $$0;
   }

   private static boolean b(cat $$0) {
      return $$0.k().a(aks.ac);
   }

   private static void a(Map<cat, Integer> $$0, akz<cat> $$1, int $$2) {
      for(hc<cat> $$3 : hm.Y.d($$1)) {
         if (!b($$3.a())) {
            $$0.put($$3.a(), $$2);
         }
      }

   }

   private static void a(Map<cat, Integer> $$0, cgw $$1, int $$2) {
      cat $$3 = $$1.l();
      if (b($$3)) {
         if (ab.aL) {
            throw (IllegalStateException)ad.c(
               new IllegalStateException(
                  "A developer tried to explicitly make fire resistant item " + $$3.m(null).getString() + " a furnace fuel. That will not work!"
               )
            );
         }
      } else {
         $$0.put($$3, $$2);
      }
   }

   private boolean i() {
      return this.t > 0;
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.l = hi.a(this.b(), cax.b);
      bad.b($$0, this.l);
      this.t = $$0.g("BurnTime");
      this.v = $$0.g("CookTime");
      this.w = $$0.g("CookTimeTotal");
      this.u = this.a(this.l.get(1));
      pj $$1 = $$0.p("RecipesUsed");

      for(String $$2 : $$1.d()) {
         this.x.put(new abb($$2), $$1.h($$2));
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("BurnTime", (short)this.t);
      $$0.a("CookTime", (short)this.v);
      $$0.a("CookTimeTotal", (short)this.w);
      bad.a($$0, this.l);
      pj $$1 = new pj();
      this.x.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), $$2));
      $$0.a("RecipesUsed", (qc)$$1);
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, csx $$3) {
      boolean $$4 = $$3.i();
      boolean $$5 = false;
      if ($$3.i()) {
         --$$3.t;
      }

      cax $$6 = $$3.l.get(1);
      boolean $$7 = !$$3.l.get(0).b();
      boolean $$8 = !$$6.b();
      if ($$3.i() || $$8 && $$7) {
         cdp<?> $$9;
         if ($$7) {
            $$9 = (cdp)$$3.y.a($$3, $$0).orElse(null);
         } else {
            $$9 = null;
         }

         int $$11 = $$3.O_();
         if (!$$3.i() && a($$9, $$3.l, $$11)) {
            $$3.t = $$3.a($$6);
            $$3.u = $$3.t;
            if ($$3.i()) {
               $$5 = true;
               if ($$8) {
                  cat $$12 = $$6.c();
                  $$6.g(1);
                  if ($$6.b()) {
                     cat $$13 = $$12.s();
                     $$3.l.set(1, $$13 == null ? cax.b : new cax($$13));
                  }
               }
            }
         }

         if ($$3.i() && a($$9, $$3.l, $$11)) {
            ++$$3.v;
            if ($$3.v == $$3.w) {
               $$3.v = 0;
               $$3.w = a($$0, $$3);
               if (b($$9, $$3.l, $$11)) {
                  $$3.a($$9);
               }

               $$5 = true;
            }
         } else {
            $$3.v = 0;
         }
      } else if (!$$3.i() && $$3.v > 0) {
         $$3.v = ami.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.i()) {
         $$5 = true;
         $$2 = $$2.a(cio.b, Boolean.valueOf($$3.i()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }

   }

   private static boolean a(@Nullable cdp<?> $$0, hi<cax> $$1, int $$2) {
      if (!$$1.get(0).b() && $$0 != null) {
         cax $$3 = $$0.c();
         if ($$3.b()) {
            return false;
         } else {
            cax $$4 = $$1.get(2);
            if ($$4.b()) {
               return true;
            } else if (!$$4.a($$3)) {
               return false;
            } else if ($$4.K() < $$2 && $$4.K() < $$4.f()) {
               return true;
            } else {
               return $$4.K() < $$3.f();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(@Nullable cdp<?> $$0, hi<cax> $$1, int $$2) {
      if ($$0 != null && a($$0, $$1, $$2)) {
         cax $$3 = $$1.get(0);
         cax $$4 = $$0.c();
         cax $$5 = $$1.get(2);
         if ($$5.b()) {
            $$1.set(2, $$4.o());
         } else if ($$5.a($$4.c())) {
            $$5.f(1);
         }

         if ($$3.a(cju.aC.l()) && !$$1.get(1).b() && $$1.get(1).a(caz.oH)) {
            $$1.set(1, new cax(caz.oI));
         }

         $$3.g(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(cax $$0) {
      if ($$0.b()) {
         return 0;
      } else {
         cat $$1 = $$0.c();
         return f().getOrDefault($$1, 0);
      }
   }

   private static int a(cgx $$0, csx $$1) {
      return $$1.y.a($$1, $$0).map(cdb::e).orElse(200);
   }

   public static boolean b(cax $$0) {
      return f().containsKey($$0.c());
   }

   @Override
   public int[] a(gy $$0) {
      if ($$0 == gy.a) {
         return r;
      } else {
         return $$0 == gy.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cax $$1, @Nullable gy $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cax $$1, gy $$2) {
      if ($$2 == gy.a && $$0 == 1) {
         return $$1.a(caz.oI) || $$1.a(caz.oH);
      } else {
         return true;
      }
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   public boolean c() {
      for(cax $$0 : this.l) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cax a(int $$0) {
      return this.l.get($$0);
   }

   @Override
   public cax a(int $$0, int $$1) {
      return bad.a(this.l, $$0, $$1);
   }

   @Override
   public cax b(int $$0) {
      return bad.a(this.l, $$0);
   }

   @Override
   public void a(int $$0, cax $$1) {
      cax $$2 = this.l.get($$0);
      boolean $$3 = !$$1.b() && $$1.a($$2) && cax.a($$1, $$2);
      this.l.set($$0, $$1);
      if ($$1.K() > this.O_()) {
         $$1.e(this.O_());
      }

      if ($$0 == 0 && !$$3) {
         this.w = a(this.n, this);
         this.v = 0;
         this.e();
      }

   }

   @Override
   public boolean a(buc $$0) {
      if (this.n.c_(this.o) != this) {
         return false;
      } else {
         return $$0.h((double)this.o.u() + 0.5, (double)this.o.v() + 0.5, (double)this.o.w() + 0.5) <= 64.0;
      }
   }

   @Override
   public boolean b(int $$0, cax $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cax $$2 = this.l.get(1);
         return b($$1) || $$1.a(caz.oH) && !$$2.a(caz.oH);
      }
   }

   @Override
   public void a() {
      this.l.clear();
   }

   @Override
   public void a(@Nullable cdp<?> $$0) {
      if ($$0 != null) {
         abb $$1 = $$0.f();
         this.x.addTo($$1, 1);
      }

   }

   @Nullable
   @Override
   public cdp<?> d() {
      return null;
   }

   @Override
   public void b(buc $$0) {
   }

   public void a(agh $$0) {
      List<cdp<?>> $$1 = this.a($$0.x(), $$0.cY());
      $$0.a($$1);
      this.x.clear();
   }

   public List<cdp<?>> a(agg $$0, dwq $$1) {
      List<cdp<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.x.object2IntEntrySet().iterator();

      while(var4.hasNext()) {
         Entry<abb> $$3 = (Entry)var4.next();
         $$0.q().a((abb)$$3.getKey()).ifPresent($$4 -> {
            $$2.add($$4);
            a($$0, $$1, $$3.getIntValue(), ((cdb)$$4).b());
         });
      }

      return $$2;
   }

   private static void a(agg $$0, dwq $$1, int $$2, float $$3) {
      int $$4 = ami.d((float)$$2 * $$3);
      float $$5 = ami.h((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         ++$$4;
      }

      bbt.a($$0, $$1, $$4);
   }

   @Override
   public void a(bug $$0) {
      for(cax $$1 : this.l) {
         $$0.b($$1);
      }

   }
}
