public class cah extends cat implements cco {
   public cah(cat.a $$0) {
      super($$0);
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      if ($$1.cn != null) {
         if (!$$0.y) {
            int $$4 = $$1.cn.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.df(), $$1.dh(), $$1.dl(), ajw.gq, ajx.g, 1.0F, 0.4F / ($$0.r_().i() * 0.4F + 0.8F));
         $$1.a(czv.C);
      } else {
         $$0.a(null, $$1.df(), $$1.dh(), $$1.dl(), ajw.gs, ajx.g, 0.5F, 0.4F / ($$0.r_().i() * 0.4F + 0.8F));
         if (!$$0.y) {
            int $$5 = cet.c($$3);
            int $$6 = cet.b($$3);
            $$0.b(new buq($$1, $$0, $$6, $$5));
         }

         $$1.b(akg.c.b(this));
         $$1.a(czv.D);
      }

      return bak.a($$3, $$0.k_());
   }

   @Override
   public int c() {
      return 1;
   }
}
