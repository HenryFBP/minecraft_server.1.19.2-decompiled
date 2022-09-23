import java.util.Arrays;

public class cvi extends clm {
   public static final cwm<cwq> b = cwe.bh;
   public static final cwf c = cwe.x;
   public static final float d = 4.0F;
   protected static final dxj e = cjt.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final dxj f = cjt.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final dxj g = cjt.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final dxj h = cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final dxj i = cjt.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final dxj j = cjt.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float k = 2.0F;
   protected static final float l = 6.0F;
   protected static final float m = 10.0F;
   protected static final dxj n = cjt.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final dxj E = cjt.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final dxj F = cjt.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final dxj G = cjt.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final dxj H = cjt.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final dxj I = cjt.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final dxj J = cjt.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final dxj K = cjt.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final dxj L = cjt.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final dxj M = cjt.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final dxj N = cjt.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final dxj O = cjt.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final dxj[] P = a(true);
   private static final dxj[] Q = a(false);

   private static dxj[] a(boolean $$0) {
      return (dxj[])Arrays.stream(gy.values()).map($$1 -> a($$1, $$0)).toArray($$0x -> new dxj[$$0x]);
   }

   private static dxj a(gy $$0, boolean $$1) {
      switch($$0) {
         case a:
         default:
            return dxg.a(j, $$1 ? K : E);
         case b:
            return dxg.a(i, $$1 ? J : n);
         case c:
            return dxg.a(h, $$1 ? M : G);
         case d:
            return dxg.a(g, $$1 ? L : F);
         case e:
            return dxg.a(f, $$1 ? O : I);
         case f:
            return dxg.a(e, $$1 ? N : H);
      }
   }

   public cvi(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, cwq.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return ($$0.c(c) ? P : Q)[((gy)$$0.c(a)).ordinal()];
   }

   private boolean a(cvo $$0, cvo $$1) {
      cjt $$2 = $$0.c(b) == cwq.a ? cju.bl : cju.be;
      return $$1.a($$2) && $$1.c(cvh.b) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$0.y && $$3.fB().d) {
         gt $$4 = $$1.a(((gy)$$2.c(a)).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gt $$5 = $$2.a(((gy)$$0.c(a)).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }

      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      cvo $$3 = $$1.a_($$2.a(((gy)$$0.c(a)).g()));
      return this.a($$0, $$3) || $$3.a(cju.bD) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if ($$0.a((cha)$$1, $$2)) {
         $$1.a($$2.a(((gy)$$0.c(a)).g()), $$3, $$4);
      }

   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax($$2.c(b) == cwq.b ? cju.be : cju.bl);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
