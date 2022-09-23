import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class cpl extends cjt {
   public static final cwm<cwt> a = cwe.ab;
   public static final cwm<cwt> b = cwe.aa;
   public static final cwm<cwt> c = cwe.ac;
   public static final cwm<cwt> d = cwe.ad;
   public static final cwo e = cwe.aT;
   public static final Map<gy, cwm<cwt>> f = Maps.newEnumMap(ImmutableMap.of(gy.c, a, gy.f, b, gy.d, c, gy.e, d));
   protected static final int g = 1;
   protected static final int h = 3;
   protected static final int i = 13;
   protected static final int j = 3;
   protected static final int k = 13;
   private static final dxj l = cjt.a(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<gy, dxj> m = Maps.newEnumMap(
      ImmutableMap.of(
         gy.c,
         cjt.a(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         gy.d,
         cjt.a(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         gy.f,
         cjt.a(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         gy.e,
         cjt.a(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<gy, dxj> n = Maps.newEnumMap(
      ImmutableMap.of(
         gy.c,
         dxg.a((dxj)m.get(gy.c), cjt.a(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         gy.d,
         dxg.a((dxj)m.get(gy.d), cjt.a(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         gy.f,
         dxg.a((dxj)m.get(gy.f), cjt.a(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         gy.e,
         dxg.a((dxj)m.get(gy.e), cjt.a(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private static final Map<cvo, dxj> E = Maps.newHashMap();
   private static final dwq[] F = ad.a(new dwq[16], $$0 -> {
      for(int $$1 = 0; $$1 <= 15; ++$$1) {
         float $$2 = (float)$$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = ami.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = ami.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = new dwq((double)$$3, (double)$$4, (double)$$5);
      }

   });
   private static final float G = 0.2F;
   private final cvo H;
   private boolean I = true;

   public cpl(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, cwt.c).a(b, cwt.c).a(c, cwt.c).a(d, cwt.c).a(e, Integer.valueOf(0)));
      this.H = this.m().a(a, cwt.b).a(b, cwt.b).a(c, cwt.b).a(d, cwt.b);
      UnmodifiableIterator var2 = this.k().a().iterator();

      while(var2.hasNext()) {
         cvo $$1 = (cvo)var2.next();
         if ($$1.c(e) == 0) {
            E.put($$1, this.n($$1));
         }
      }

   }

   private dxj n(cvo $$0) {
      dxj $$1 = l;

      for(gy $$2 : gy.c.a) {
         cwt $$3 = $$0.c((cwr<cwt>)f.get($$2));
         if ($$3 == cwt.b) {
            $$1 = dxg.a($$1, (dxj)m.get($$2));
         } else if ($$3 == cwt.a) {
            $$1 = dxg.a($$1, (dxj)n.get($$2));
         }
      }

      return $$1;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return (dxj)E.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public cvo a(ccx $$0) {
      return this.a($$0.q(), this.H, $$0.a());
   }

   private cvo a(cgd $$0, cvo $$1, gt $$2) {
      boolean $$3 = p($$1);
      $$1 = this.b($$0, this.m().a(e, (Integer)$$1.c(e)), $$2);
      if ($$3 && p($$1)) {
         return $$1;
      } else {
         boolean $$4 = ((cwt)$$1.c(a)).a();
         boolean $$5 = ((cwt)$$1.c(c)).a();
         boolean $$6 = ((cwt)$$1.c(b)).a();
         boolean $$7 = ((cwt)$$1.c(d)).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.a(d, cwt.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.a(b, cwt.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.a(a, cwt.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.a(c, cwt.b);
         }

         return $$1;
      }
   }

   private cvo b(cgd $$0, cvo $$1, gt $$2) {
      boolean $$3 = !$$0.a_($$2.b()).g($$0, $$2);

      for(gy $$4 : gy.c.a) {
         if (!((cwt)$$1.c((cwr)f.get($$4))).a()) {
            cwt $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.a((cwr)f.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$1 == gy.a) {
         return $$0;
      } else if ($$1 == gy.b) {
         return this.a($$3, $$0, $$4);
      } else {
         cwt $$6 = this.a($$3, $$4, $$1);
         return $$6.a() == ((cwt)$$0.c((cwr)f.get($$1))).a() && !o($$0)
            ? $$0.a((cwr)f.get($$1), $$6)
            : this.a($$3, this.H.a(e, (Integer)$$0.c(e)).a((cwr)f.get($$1), $$6), $$4);
      }
   }

   private static boolean o(cvo $$0) {
      return ((cwt)$$0.c(a)).a() && ((cwt)$$0.c(c)).a() && ((cwt)$$0.c(b)).a() && ((cwt)$$0.c(d)).a();
   }

   private static boolean p(cvo $$0) {
      return !((cwt)$$0.c(a)).a() && !((cwt)$$0.c(c)).a() && !((cwt)$$0.c(b)).a() && !((cwt)$$0.c(d)).a();
   }

   @Override
   public void a(cvo $$0, cgy $$1, gt $$2, int $$3, int $$4) {
      gt.a $$5 = new gt.a();

      for(gy $$6 : gy.c.a) {
         cwt $$7 = $$0.c((cwr<cwt>)f.get($$6));
         if ($$7 != cwt.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(gy.a);
            cvo $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               gt $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$9), $$5, $$9, $$3, $$4);
            }

            $$5.a($$2, $$6).c(gy.b);
            cvo $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               gt $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$1.a_($$11), $$5, $$11, $$3, $$4);
            }
         }
      }

   }

   private cwt a(cgd $$0, gt $$1, gy $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.b()).g($$0, $$1));
   }

   private cwt a(cgd $$0, gt $$1, gy $$2, boolean $$3) {
      gt $$4 = $$1.a($$2);
      cvo $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = this.b($$0, $$4, $$5);
         if ($$6 && h($$0.a_($$4.b()))) {
            if ($$5.d($$0, $$4, $$2.g())) {
               return cwt.a;
            }

            return cwt.b;
         }
      }

      return !a($$5, $$2) && ($$5.g($$0, $$4) || !h($$0.a_($$4.c()))) ? cwt.c : cwt.b;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      cvo $$4 = $$1.a_($$3);
      return this.b($$1, $$3, $$4);
   }

   private boolean b(cgd $$0, gt $$1, cvo $$2) {
      return $$2.d($$0, $$1, gy.b) || $$2.a(cju.gd);
   }

   private void a(cgx $$0, gt $$1, cvo $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$2.c(e) != $$3) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.a(e, Integer.valueOf($$3)), 2);
         }

         Set<gt> $$4 = Sets.newHashSet();
         $$4.add($$1);

         for(gy $$5 : gy.values()) {
            $$4.add($$1.a($$5));
         }

         for(gt $$6 : $$4) {
            $$0.a($$6, this);
         }
      }

   }

   private int a(cgx $$0, gt $$1) {
      this.I = false;
      int $$2 = $$0.s($$1);
      this.I = true;
      int $$3 = 0;
      if ($$2 < 15) {
         for(gy $$4 : gy.c.a) {
            gt $$5 = $$1.a($$4);
            cvo $$6 = $$0.a_($$5);
            $$3 = Math.max($$3, this.q($$6));
            gt $$7 = $$1.b();
            if ($$6.g($$0, $$5) && !$$0.a_($$7).g($$0, $$7)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.b())));
            } else if (!$$6.g($$0, $$5)) {
               $$3 = Math.max($$3, this.q($$0.a_($$5.c())));
            }
         }
      }

      return Math.max($$2, $$3 - 1);
   }

   private int q(cvo $$0) {
      return $$0.a(this) ? $$0.c(e) : 0;
   }

   private void b(cgx $$0, gt $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for(gy $$2 : gy.values()) {
            $$0.a($$1.a($$2), this);
         }

      }
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.y) {
         this.a($$1, $$2, $$0);

         for(gy $$5 : gy.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (!$$1.y) {
            for(gy $$5 : gy.values()) {
               $$1.a($$2.a($$5), this);
            }

            this.a($$1, $$2, $$0);
            this.c($$1, $$2);
         }
      }
   }

   private void c(cgx $$0, gt $$1) {
      for(gy $$2 : gy.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for(gy $$3 : gy.c.a) {
         gt $$4 = $$1.a($$3);
         if ($$0.a_($$4).g($$0, $$4)) {
            this.b($$0, $$4.b());
         } else {
            this.b($$0, $$4.c());
         }
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if (!$$1.y) {
         if ($$0.a((cha)$$1, $$2)) {
            this.a($$1, $$2, $$0);
         } else {
            c($$0, $$1, $$2);
            $$1.a($$2, false);
         }

      }
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return !this.I ? 0 : $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      if (this.I && $$3 != gy.a) {
         int $$4 = $$0.c(e);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != gy.b && !((cwt)this.a($$1, $$0, $$2).c((cwr)f.get($$3.g()))).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean h(cvo $$0) {
      return a($$0, null);
   }

   protected static boolean a(cvo $$0, @Nullable gy $$1) {
      if ($$0.a(cju.ch)) {
         return true;
      } else if ($$0.a(cju.dr)) {
         gy $$2 = $$0.c(cpq.aD);
         return $$2 == $$1 || $$2.g() == $$1;
      } else if ($$0.a(cju.jA)) {
         return $$1 == $$0.c(cow.a);
      } else {
         return $$0.j() && $$1 != null;
      }
   }

   @Override
   public boolean f_(cvo $$0) {
      return this.I;
   }

   public static int b(int $$0) {
      dwq $$1 = F[$$0];
      return ami.f((float)$$1.a(), (float)$$1.b(), (float)$$1.c());
   }

   private void a(cgx $$0, amn $$1, gt $$2, dwq $$3, gy $$4, gy $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + (double)(0.4375F * (float)$$4.j()) + (double)($$10 * (float)$$5.j());
         double $$12 = 0.5 + (double)(0.4375F * (float)$$4.k()) + (double)($$10 * (float)$$5.k());
         double $$13 = 0.5 + (double)(0.4375F * (float)$$4.l()) + (double)($$10 * (float)$$5.l());
         $$0.a(new ii(new k($$3), 1.0F), (double)$$2.u() + $$11, (double)$$2.v() + $$12, (double)$$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      int $$4 = $$0.c(e);
      if ($$4 != 0) {
         for(gy $$5 : gy.c.a) {
            cwt $$6 = $$0.c((cwr<cwt>)f.get($$5));
            switch($$6) {
               case a:
                  this.a($$1, $$3, $$2, F[$$4], $$5, gy.b, -0.5F, 0.5F);
               case b:
                  this.a($$1, $$3, $$2, F[$$4], gy.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  this.a($$1, $$3, $$2, F[$$4], gy.a, $$5, 0.0F, 0.3F);
            }
         }

      }
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      switch($$1) {
         case c:
            return $$0.a(a, (cwt)$$0.c(c)).a(b, (cwt)$$0.c(d)).a(c, (cwt)$$0.c(a)).a(d, (cwt)$$0.c(b));
         case d:
            return $$0.a(a, (cwt)$$0.c(b)).a(b, (cwt)$$0.c(c)).a(c, (cwt)$$0.c(d)).a(d, (cwt)$$0.c(a));
         case b:
            return $$0.a(a, (cwt)$$0.c(d)).a(b, (cwt)$$0.c(a)).a(c, (cwt)$$0.c(b)).a(d, (cwt)$$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      switch($$1) {
         case b:
            return $$0.a(a, (cwt)$$0.c(c)).a(c, (cwt)$$0.c(a));
         case c:
            return $$0.a(b, (cwt)$$0.c(d)).a(d, (cwt)$$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c, d, e);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if (!$$3.fB().e) {
         return baj.d;
      } else {
         if (o($$0) || p($$0)) {
            cvo $$6 = o($$0) ? this.m() : this.H;
            $$6 = $$6.a(e, (Integer)$$0.c(e));
            $$6 = this.a($$1, $$6, $$2);
            if ($$6 != $$0) {
               $$1.a($$2, $$6, 3);
               this.a($$1, $$2, $$0, $$6);
               return baj.a;
            }
         }

         return baj.d;
      }
   }

   private void a(cgx $$0, gt $$1, cvo $$2, cvo $$3) {
      for(gy $$4 : gy.c.a) {
         gt $$5 = $$1.a($$4);
         if (((cwt)$$2.c((cwr)f.get($$4))).a() != ((cwt)$$3.c((cwr)f.get($$4))).a() && $$0.a_($$5).g($$0, $$5)) {
            $$0.a($$5, $$3.b(), $$4.g());
         }
      }

   }
}
