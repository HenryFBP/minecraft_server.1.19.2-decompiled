import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class cse extends cjt implements cql {
   public static final cwf a = cwe.K;
   public static final cwm<cwz> b = cwe.W;
   public static final cwm<cwz> c = cwe.X;
   public static final cwm<cwz> d = cwe.Y;
   public static final cwm<cwz> e = cwe.Z;
   public static final cwf f = cwe.C;
   private final Map<cvo, dxj> g;
   private final Map<cvo, dxj> h;
   private static final int i = 3;
   private static final int j = 14;
   private static final int k = 4;
   private static final int l = 1;
   private static final int m = 7;
   private static final int n = 9;
   private static final dxj E = cjt.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final dxj F = cjt.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final dxj G = cjt.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final dxj H = cjt.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final dxj I = cjt.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public cse(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(true)).a(c, cwz.a).a(b, cwz.a).a(d, cwz.a).a(e, cwz.a).a(f, Boolean.valueOf(false)));
      this.g = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.h = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static dxj a(dxj $$0, cwz $$1, dxj $$2, dxj $$3) {
      if ($$1 == cwz.c) {
         return dxg.a($$0, $$3);
      } else {
         return $$1 == cwz.b ? dxg.a($$0, $$2) : $$0;
      }
   }

   private Map<cvo, dxj> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      dxj $$10 = cjt.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      dxj $$11 = cjt.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      dxj $$12 = cjt.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      dxj $$13 = cjt.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      dxj $$14 = cjt.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      dxj $$15 = cjt.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      dxj $$16 = cjt.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      dxj $$17 = cjt.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      dxj $$18 = cjt.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<cvo, dxj> $$19 = ImmutableMap.builder();

      for(Boolean $$20 : a.a()) {
         for(cwz $$21 : b.a()) {
            for(cwz $$22 : c.a()) {
               for(cwz $$23 : e.a()) {
                  for(cwz $$24 : d.a()) {
                     dxj $$25 = dxg.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = dxg.a($$25, $$10);
                     }

                     cvo $$26 = this.m().a(a, $$20).a(b, $$21).a(e, $$23).a(c, $$22).a(d, $$24);
                     $$19.put($$26.a(f, Boolean.valueOf(false)), $$25);
                     $$19.put($$26.a(f, Boolean.valueOf(true)), $$25);
                  }
               }
            }
         }
      }

      return $$19.build();
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)this.g.get($$0);
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)this.h.get($$0);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }

   private boolean a(cvo $$0, boolean $$1, gy $$2) {
      cjt $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cmh && cmh.a($$0, $$2);
      return $$0.a(akl.H) || !j($$0) && $$1 || $$3 instanceof cnk || $$4;
   }

   @Override
   public cvo a(ccx $$0) {
      cha $$1 = $$0.q();
      gt $$2 = $$0.a();
      dpv $$3 = $$0.q().b_($$0.a());
      gt $$4 = $$2.d();
      gt $$5 = $$2.g();
      gt $$6 = $$2.e();
      gt $$7 = $$2.f();
      gt $$8 = $$2.b();
      cvo $$9 = $$1.a_($$4);
      cvo $$10 = $$1.a_($$5);
      cvo $$11 = $$1.a_($$6);
      cvo $$12 = $$1.a_($$7);
      cvo $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, gy.d), gy.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, gy.e), gy.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, gy.c), gy.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, gy.f), gy.f);
      cvo $$18 = this.m().a(f, Boolean.valueOf($$3.a() == dpw.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      if ($$1 == gy.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == gy.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(cvo $$0, cwr<cwz> $$1) {
      return $$0.c($$1) != cwz.a;
   }

   private static boolean a(dxj $$0, dxj $$1) {
      return !dxg.c($$1, $$0, dwu.e);
   }

   private cvo a(cha $$0, cvo $$1, gt $$2, cvo $$3) {
      boolean $$4 = a($$1, c);
      boolean $$5 = a($$1, b);
      boolean $$6 = a($$1, d);
      boolean $$7 = a($$1, e);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private cvo a(cha $$0, gt $$1, cvo $$2, gt $$3, cvo $$4, gy $$5) {
      gy $$6 = $$5.g();
      boolean $$7 = $$5 == gy.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$8 = $$5 == gy.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, b);
      boolean $$9 = $$5 == gy.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$10 = $$5 == gy.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      gt $$11 = $$1.b();
      cvo $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private cvo a(cha $$0, cvo $$1, gt $$2, cvo $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      dxj $$8 = $$3.k($$0, $$2).a(gy.a);
      cvo $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(a, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(cvo $$0, cvo $$1, dxj $$2) {
      boolean $$3 = $$1.b() instanceof cse && $$1.c(a);
      if ($$3) {
         return true;
      } else {
         cwz $$4 = $$0.c(c);
         cwz $$5 = $$0.c(d);
         cwz $$6 = $$0.c(b);
         cwz $$7 = $$0.c(e);
         boolean $$8 = $$5 == cwz.a;
         boolean $$9 = $$7 == cwz.a;
         boolean $$10 = $$6 == cwz.a;
         boolean $$11 = $$4 == cwz.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == cwz.c && $$5 == cwz.c || $$6 == cwz.c && $$7 == cwz.c;
            if ($$13) {
               return false;
            } else {
               return $$1.a(akl.aF) || a($$2, E);
            }
         }
      }
   }

   private cvo a(cvo $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, dxj $$5) {
      return $$0.a(c, this.a($$1, $$5, F)).a(b, this.a($$2, $$5, I)).a(d, this.a($$3, $$5, G)).a(e, this.a($$4, $$5, H));
   }

   private cwz a(boolean $$0, dxj $$1, dxj $$2) {
      if ($$0) {
         return a($$1, $$2) ? cwz.c : cwz.b;
      } else {
         return cwz.a;
      }
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(f) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return !$$0.c(f);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, c, b, e, d, f);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      switch($$1) {
         case c:
            return $$0.a(c, (cwz)$$0.c(d)).a(b, (cwz)$$0.c(e)).a(d, (cwz)$$0.c(c)).a(e, (cwz)$$0.c(b));
         case d:
            return $$0.a(c, (cwz)$$0.c(b)).a(b, (cwz)$$0.c(d)).a(d, (cwz)$$0.c(e)).a(e, (cwz)$$0.c(c));
         case b:
            return $$0.a(c, (cwz)$$0.c(e)).a(b, (cwz)$$0.c(c)).a(d, (cwz)$$0.c(b)).a(e, (cwz)$$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      switch($$1) {
         case b:
            return $$0.a(c, (cwz)$$0.c(d)).a(d, (cwz)$$0.c(c));
         case c:
            return $$0.a(b, (cwz)$$0.c(e)).a(e, (cwz)$$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
