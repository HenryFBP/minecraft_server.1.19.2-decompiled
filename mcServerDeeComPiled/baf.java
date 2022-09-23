public class baf {
   public static void a(cgx $$0, gt $$1, bac $$2) {
      a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
   }

   public static void a(cgx $$0, bbn $$1, bac $$2) {
      a($$0, $$1.df(), $$1.dh(), $$1.dl(), $$2);
   }

   private static void a(cgx $$0, double $$1, double $$2, double $$3, bac $$4) {
      for(int $$5 = 0; $$5 < $$4.b(); ++$$5) {
         a($$0, $$1, $$2, $$3, $$4.a($$5));
      }

   }

   public static void a(cgx $$0, gt $$1, hi<cax> $$2) {
      $$2.forEach($$2x -> a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2x));
   }

   public static void a(cgx $$0, double $$1, double $$2, double $$3, cax $$4) {
      double $$5 = (double)bbr.T.k();
      double $$6 = 1.0 - $$5;
      double $$7 = $$5 / 2.0;
      double $$8 = Math.floor($$1) + $$0.w.j() * $$6 + $$7;
      double $$9 = Math.floor($$2) + $$0.w.j() * $$6;
      double $$10 = Math.floor($$3) + $$0.w.j() * $$6 + $$7;

      while(!$$4.b()) {
         bqv $$11 = new bqv($$0, $$8, $$9, $$10, $$4.a($$0.w.a(21) + 10));
         float $$12 = 0.05F;
         $$11.n($$0.w.a(0.0, 0.11485000171139836), $$0.w.a(0.2, 0.11485000171139836), $$0.w.a(0.0, 0.11485000171139836));
         $$0.b($$11);
      }

   }
}
