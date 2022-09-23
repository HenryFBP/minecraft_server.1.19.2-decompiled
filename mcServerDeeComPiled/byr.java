public class byr extends cat {
   public byr(cat.a $$0) {
      super($$0);
   }

   @Override
   public baj a(ccz $$0) {
      gy $$1 = $$0.k();
      if ($$1 == gy.a) {
         return baj.e;
      } else {
         cgx $$2 = $$0.q();
         ccx $$3 = new ccx($$0);
         gt $$4 = $$3.a();
         cax $$5 = $$0.n();
         dwq $$6 = dwq.c($$4);
         dwl $$7 = bbr.d.m().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof agg $$8) {
               bql $$9 = bbr.d.b($$8, $$5.u(), null, $$0.o(), $$4, bcg.m, true, true);
               if ($$9 == null) {
                  return baj.e;
               }

               float $$10 = (float)ami.d((ami.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$9.b($$9.df(), $$9.dh(), $$9.dl(), $$10, 0.0F);
               this.a($$9, $$2.w);
               $$8.a_($$9);
               $$2.a(null, $$9.df(), $$9.dh(), $$9.dl(), ajw.an, ajx.e, 0.75F, 0.8F);
               $$9.a(czv.s, $$0.o());
            }

            $$5.g(1);
            return baj.a($$2.y);
         } else {
            return baj.e;
         }
      }
   }

   private void a(bql $$0, amn $$1) {
      hp $$2 = $$0.u();
      float $$3 = $$1.i() * 5.0F;
      float $$4 = $$1.i() * 20.0F - 10.0F;
      hp $$5 = new hp($$2.b() + $$3, $$2.c() + $$4, $$2.d());
      $$0.a($$5);
      $$2 = $$0.w();
      $$3 = $$1.i() * 10.0F - 5.0F;
      $$5 = new hp($$2.b(), $$2.c() + $$3, $$2.d());
      $$0.b($$5);
   }
}
