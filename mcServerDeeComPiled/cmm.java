import com.google.common.annotations.VisibleForTesting;

public class cmm extends cjt {
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 3600;
   private static final int e = 12000;
   protected static final dxj a = cjt.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int f = 3600;
   private static int g = 12000;

   public cmm(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return a($$1, $$2.c());
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.r_()));
   }

   private static int a(amn $$0) {
      return $$0.b(f, g);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return !this.a($$0, $$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cgx)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if ($$3.ad().equals(bbr.E)) {
         this.a($$1, $$2);
      }

   }

   private static boolean a(cgd $$0, gt $$1) {
      dpv $$2 = $$0.b_($$1);
      dpv $$3 = $$0.b_($$1.b());
      return $$2.a() == dpw.c && $$3.a() == dpw.a;
   }

   private void a(agg $$0, gt $$1, amn $$2) {
      this.a((cgx)$$0, $$1);
      $$0.a(null, $$1, ajw.gS, ajx.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cgx $$0, gt $$1) {
      $$0.b($$1, false);
   }

   private void b(agg $$0, gt $$1, amn $$2) {
      int $$3 = $$2.b(2, 6);

      for(int $$4 = 1; $$4 <= $$3; ++$$4) {
         bot $$5 = bbr.aP.a((cgx)$$0);
         double $$6 = (double)$$1.u() + this.b($$2);
         double $$7 = (double)$$1.w() + this.b($$2);
         int $$8 = $$2.b(1, 361);
         $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
         $$5.fp();
         $$0.b($$5);
      }

   }

   private double b(amn $$0) {
      double $$1 = (double)(bot.c / 2.0F);
      return ami.a($$0.j(), $$1, 1.0 - $$1);
   }

   @VisibleForTesting
   public static void a(int $$0, int $$1) {
      f = $$0;
      g = $$1;
   }

   @VisibleForTesting
   public static void b() {
      f = 3600;
      g = 12000;
   }
}
