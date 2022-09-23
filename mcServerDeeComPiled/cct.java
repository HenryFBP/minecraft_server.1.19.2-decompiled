import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cct {
   public static final int a = 20;
   private static final List<cct.a<ccs>> b = Lists.newArrayList();
   private static final List<cct.a<cat>> c = Lists.newArrayList();
   private static final List<cdm> d = Lists.newArrayList();
   private static final Predicate<cax> e = $$0 -> {
      for(cdm $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cax $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cax $$0) {
      int $$1 = 0;

      for(int $$2 = c.size(); $$1 < $$2; ++$$1) {
         if (((cct.a)c.get($$1)).b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cax $$0) {
      int $$1 = 0;

      for(int $$2 = b.size(); $$1 < $$2; ++$$1) {
         if (((cct.a)b.get($$1)).b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ccs $$0) {
      int $$1 = 0;

      for(int $$2 = b.size(); $$1 < $$2; ++$$1) {
         if (((cct.a)b.get($$1)).c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cax $$0, cax $$1) {
      if (!e.test($$0)) {
         return false;
      } else {
         return b($$0, $$1) || c($$0, $$1);
      }
   }

   protected static boolean b(cax $$0, cax $$1) {
      cat $$2 = $$0.c();
      int $$3 = 0;

      for(int $$4 = c.size(); $$3 < $$4; ++$$3) {
         cct.a<cat> $$5 = (cct.a)c.get($$3);
         if ($$5.a == $$2 && $$5.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cax $$0, cax $$1) {
      ccs $$2 = ccu.d($$0);
      int $$3 = 0;

      for(int $$4 = b.size(); $$3 < $$4; ++$$3) {
         cct.a<ccs> $$5 = (cct.a)b.get($$3);
         if ($$5.a == $$2 && $$5.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cax d(cax $$0, cax $$1) {
      if (!$$1.b()) {
         ccs $$2 = ccu.d($$1);
         cat $$3 = $$1.c();
         int $$4 = 0;

         for(int $$5 = c.size(); $$4 < $$5; ++$$4) {
            cct.a<cat> $$6 = (cct.a)c.get($$4);
            if ($$6.a == $$3 && $$6.b.a($$0)) {
               return ccu.a(new cax($$6.c), $$2);
            }
         }

         $$4 = 0;

         for(int $$8 = b.size(); $$4 < $$8; ++$$4) {
            cct.a<ccs> $$9 = (cct.a)b.get($$4);
            if ($$9.a == $$2 && $$9.b.a($$0)) {
               return ccu.a(new cax($$3), $$9.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(caz.qs);
      a(caz.ti);
      a(caz.tl);
      a(caz.qs, caz.nQ, caz.ti);
      a(caz.ti, caz.th, caz.tl);
      a(ccv.b, caz.qB, ccv.c);
      a(ccv.b, caz.qp, ccv.c);
      a(ccv.b, caz.sz, ccv.c);
      a(ccv.b, caz.qw, ccv.c);
      a(ccv.b, caz.qu, ccv.c);
      a(ccv.b, caz.pJ, ccv.c);
      a(ccv.b, caz.qx, ccv.c);
      a(ccv.b, caz.ph, ccv.d);
      a(ccv.b, caz.kK, ccv.c);
      a(ccv.b, caz.qr, ccv.e);
      a(ccv.e, caz.sh, ccv.f);
      a(ccv.f, caz.kK, ccv.g);
      a(ccv.f, caz.qv, ccv.h);
      a(ccv.g, caz.qv, ccv.i);
      a(ccv.h, caz.kK, ccv.i);
      a(ccv.e, caz.qx, ccv.m);
      a(ccv.m, caz.kK, ccv.n);
      a(ccv.e, caz.sz, ccv.j);
      a(ccv.j, caz.kK, ccv.k);
      a(ccv.j, caz.ph, ccv.l);
      a(ccv.j, caz.qv, ccv.r);
      a(ccv.k, caz.qv, ccv.s);
      a(ccv.r, caz.kK, ccv.s);
      a(ccv.r, caz.ph, ccv.t);
      a(ccv.e, caz.mM, ccv.u);
      a(ccv.u, caz.kK, ccv.v);
      a(ccv.u, caz.ph, ccv.w);
      a(ccv.o, caz.qv, ccv.r);
      a(ccv.p, caz.qv, ccv.s);
      a(ccv.e, caz.pJ, ccv.o);
      a(ccv.o, caz.kK, ccv.p);
      a(ccv.o, caz.ph, ccv.q);
      a(ccv.e, caz.pl, ccv.x);
      a(ccv.x, caz.kK, ccv.y);
      a(ccv.e, caz.qB, ccv.z);
      a(ccv.z, caz.ph, ccv.A);
      a(ccv.z, caz.qv, ccv.B);
      a(ccv.A, caz.qv, ccv.C);
      a(ccv.B, caz.ph, ccv.C);
      a(ccv.D, caz.qv, ccv.B);
      a(ccv.E, caz.qv, ccv.B);
      a(ccv.F, caz.qv, ccv.C);
      a(ccv.e, caz.qu, ccv.D);
      a(ccv.D, caz.kK, ccv.E);
      a(ccv.D, caz.ph, ccv.F);
      a(ccv.e, caz.qp, ccv.G);
      a(ccv.G, caz.kK, ccv.H);
      a(ccv.G, caz.ph, ccv.I);
      a(ccv.e, caz.qw, ccv.J);
      a(ccv.J, caz.kK, ccv.K);
      a(ccv.J, caz.ph, ccv.L);
      a(ccv.b, caz.qv, ccv.M);
      a(ccv.M, caz.kK, ccv.N);
      a(ccv.e, caz.tJ, ccv.P);
      a(ccv.P, caz.kK, ccv.Q);
   }

   private static void a(cat $$0, cat $$1, cat $$2) {
      if (!($$0 instanceof cbl)) {
         throw new IllegalArgumentException("Expected a potion, got: " + hm.Y.b($$0));
      } else if (!($$2 instanceof cbl)) {
         throw new IllegalArgumentException("Expected a potion, got: " + hm.Y.b($$2));
      } else {
         c.add(new cct.a<>($$0, cdm.a($$1), $$2));
      }
   }

   private static void a(cat $$0) {
      if (!($$0 instanceof cbl)) {
         throw new IllegalArgumentException("Expected a potion, got: " + hm.Y.b($$0));
      } else {
         d.add(cdm.a($$0));
      }
   }

   private static void a(ccs $$0, cat $$1, ccs $$2) {
      b.add(new cct.a<>($$0, cdm.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cdm b;
      final T c;

      public a(T $$0, cdm $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
