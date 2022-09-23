import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class cpn extends cru {
   public static final cwf a = cwe.r;
   private static final Map<cgd, List<cpn.a>> e = new WeakHashMap();
   public static final int b = 60;
   public static final int c = 8;
   public static final int d = 160;
   private static final int f = 2;

   protected cpn(cvn.c $$0) {
      super($$0, ii.b);
      this.k(this.D.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      for(gy $$5 : gy.values()) {
         $$1.a($$2.a($$5), this);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4) {
         for(gy $$5 : gy.values()) {
            $$1.a($$2.a($$5), this);
         }

      }
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(a) && gy.b != $$3 ? 15 : 0;
   }

   protected boolean a(cgx $$0, gt $$1, cvo $$2) {
      return $$0.a($$1.c(), gy.a);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<cpn.a> $$5 = (List)e.get($$1);

      while($$5 != null && !$$5.isEmpty() && $$1.U() - ((cpn.a)$$5.get(0)).b > 60L) {
         $$5.remove(0);
      }

      if ($$0.c(a)) {
         if ($$4) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
            if (a($$1, $$2, true)) {
               $$1.c(1502, $$2, 0);
               $$1.a($$2, $$1.a_($$2).b(), 160);
            }
         }
      } else if (!$$4 && !a($$1, $$2, false)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if ($$0.c(a) == this.a($$1, $$2, $$0) && !$$1.K().b($$2, this)) {
         $$1.a($$2, this, 2);
      }

   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$3 == gy.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(a)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   private static boolean a(cgx $$0, gt $$1, boolean $$2) {
      List<cpn.a> $$3 = (List)e.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new cpn.a($$1.h(), $$0.U()));
      }

      int $$4 = 0;

      for(int $$5 = 0; $$5 < $$3.size(); ++$$5) {
         cpn.a $$6 = (cpn.a)$$3.get($$5);
         if ($$6.a.equals($$1) && ++$$4 >= 8) {
            return true;
         }
      }

      return false;
   }

   public static class a {
      final gt a;
      final long b;

      public a(gt $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
