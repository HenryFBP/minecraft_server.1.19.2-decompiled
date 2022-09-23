public class crr extends cjt {
   private static final cwo a = cwe.aT;
   private static final int b = 20;
   private static final int c = 8;

   public crr(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      int $$4 = a((cgy)$$0, $$1, $$2, (bbn)$$3);
      bbn $$5 = $$3.x();
      if ($$5 instanceof agh $$6) {
         $$6.a(akg.aE);
         aj.L.a($$6, $$3, $$2.e(), $$4);
      }

   }

   private static int a(cgy $$0, cvo $$1, dwm $$2, bbn $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof bui ? 20 : 8;
      if (!$$0.K().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(dwm $$0, dwq $$1) {
      gy $$2 = $$0.b();
      double $$3 = Math.abs(ami.g($$1.c) - 0.5);
      double $$4 = Math.abs(ami.g($$1.d) - 0.5);
      double $$5 = Math.abs(ami.g($$1.e) - 0.5);
      gy.a $$6 = $$2.o();
      double $$7;
      if ($$6 == gy.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == gy.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ami.e(15.0 * ami.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cgy $$0, cvo $$1, int $$2, gt $$3, int $$4) {
      $$0.a($$3, $$1.a(a, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(a) != 0) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 3);
      }

   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(a);
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$1.k_() && !$$0.a($$3.b())) {
         if ($$0.c(a) > 0 && !$$1.K().a($$2, this)) {
            $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 18);
         }

      }
   }
}
