public class cey extends cer {
   public cey(cer.a $$0, bbs... $$1) {
      super($$0, ces.b, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 10;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public int a() {
      return 2;
   }

   public static void a(bcc $$0, cgx $$1, gt $$2, int $$3) {
      if ($$0.aw()) {
         cvo $$4 = cju.ju.m();
         float $$5 = (float)Math.min(16, 2 + $$3);
         gt.a $$6 = new gt.a();

         for(gt $$7 : gt.a($$2.a((double)(-$$5), -1.0, (double)(-$$5)), $$2.a((double)$$5, -1.0, (double)$$5))) {
            if ($$7.a($$0.cY(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               cvo $$8 = $$1.a_($$6);
               if ($$8.h()) {
                  cvo $$9 = $$1.a_($$7);
                  if ($$9.d() == dpz.j && $$9.c(cnz.a) == 0 && $$4.a((cha)$$1, $$7) && $$1.a($$4, $$7, dwv.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cju.ju, ami.a($$0.dQ(), 60, 120));
                  }
               }
            }
         }

      }
   }

   @Override
   public boolean a(cer $$0) {
      return super.a($$0) && $$0 != cev.i;
   }
}
