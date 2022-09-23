import javax.annotation.Nullable;

public class clp extends cjt {
   public static final cwi a = cnf.aD;
   public static final cwf b = cwe.u;
   public static final cwm<cwj> c = cwe.bf;
   public static final cwf d = cwe.w;
   public static final cwm<cwk> e = cwe.ae;
   protected static final float f = 3.0F;
   protected static final dxj g = cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final dxj h = cjt.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final dxj i = cjt.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final dxj j = cjt.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);

   protected clp(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)).a(c, cwj.a).a(d, Boolean.valueOf(false)).a(e, cwk.b));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      gy $$4 = $$0.c(a);
      boolean $$5 = !$$0.c(b);
      boolean $$6 = $$0.c(c) == cwj.b;
      switch($$4) {
         case f:
         default:
            return $$5 ? j : ($$6 ? h : g);
         case d:
            return $$5 ? g : ($$6 ? j : i);
         case e:
            return $$5 ? i : ($$6 ? g : h);
         case c:
            return $$5 ? h : ($$6 ? i : j);
      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      cwk $$6 = $$0.c(e);
      if ($$1.o() != gy.a.b || $$6 == cwk.b != ($$1 == gy.b)) {
         return $$6 == cwk.b && $$1 == gy.a && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(e) != $$6 ? $$0.a(a, (gy)$$2.c(a)).a(b, (Boolean)$$2.c(b)).a(c, (cwj)$$2.c(c)).a(d, (Boolean)$$2.c(d)) : cju.a.m();
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$0.y && $$3.f()) {
         clr.b($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      switch($$3) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   private int b() {
      return this.aF == dpz.K ? 1011 : 1012;
   }

   private int q() {
      return this.aF == dpz.K ? 1005 : 1006;
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      gt $$1 = $$0.a();
      cgx $$2 = $$0.q();
      if ($$1.v() < $$2.ah() - 1 && $$2.a_($$1.b()).a($$0)) {
         boolean $$3 = $$2.r($$1) || $$2.r($$1.b());
         return this.m().a(a, $$0.g()).a(c, this.b($$0)).a(d, Boolean.valueOf($$3)).a(b, Boolean.valueOf($$3)).a(e, cwk.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      $$0.a($$1.b(), $$2.a(e, cwk.a), 3);
   }

   private cwj b(ccx $$0) {
      cgd $$1 = $$0.q();
      gt $$2 = $$0.a();
      gy $$3 = $$0.g();
      gt $$4 = $$2.b();
      gy $$5 = $$3.i();
      gt $$6 = $$2.a($$5);
      cvo $$7 = $$1.a_($$6);
      gt $$8 = $$4.a($$5);
      cvo $$9 = $$1.a_($$8);
      gy $$10 = $$3.h();
      gt $$11 = $$2.a($$10);
      cvo $$12 = $$1.a_($$11);
      gt $$13 = $$4.a($$10);
      cvo $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(e) == cwk.b;
      boolean $$17 = $$12.a(this) && $$12.c(e) == cwk.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            dwq $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5))
               ? cwj.a
               : cwj.b;
         } else {
            return cwj.a;
         }
      } else {
         return cwj.b;
      }
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if (this.aF == dpz.K) {
         return baj.d;
      } else {
         $$0 = $$0.a(b);
         $$1.a($$2, $$0, 10);
         $$1.a($$3, $$0.c(b) ? this.q() : this.b(), $$2, 0);
         $$1.a($$3, this.h($$0) ? czv.h : czv.d, $$2);
         return baj.a($$1.y);
      }
   }

   public boolean h(cvo $$0) {
      return $$0.c(b);
   }

   public void a(@Nullable bbn $$0, cgx $$1, cvo $$2, gt $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(b) != $$4) {
         $$1.a($$3, $$2.a(b, Boolean.valueOf($$4)), 10);
         this.a($$1, $$3, $$4);
         $$1.a($$0, $$4 ? czv.h : czv.d, $$3);
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      boolean $$6 = $$1.r($$2) || $$1.r($$2.a($$0.c(e) == cwk.b ? gy.b : gy.a));
      if (!this.m().a($$3) && $$6 != $$0.c(d)) {
         if ($$6 != $$0.c(b)) {
            this.a($$1, $$2, $$6);
            $$1.a(null, $$6 ? czv.h : czv.d, $$2);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
      }

   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      cvo $$4 = $$1.a_($$3);
      return $$0.c(e) == cwk.b ? $$4.d($$1, $$3, gy.b) : $$4.a(this);
   }

   private void a(cgx $$0, gt $$1, boolean $$2) {
      $$0.a(null, $$2 ? this.q() : this.b(), $$1, 0);
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$1 == coh.a ? $$0 : $$0.a($$1.a($$0.c(a))).a(c);
   }

   @Override
   public long a(cvo $$0, gt $$1) {
      return ami.c($$1.u(), $$1.c($$0.c(e) == cwk.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(e, a, b, c, d);
   }

   public static boolean a(cgx $$0, gt $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(cvo $$0) {
      return $$0.b() instanceof clp && ($$0.d() == dpz.z || $$0.d() == dpz.A);
   }
}
