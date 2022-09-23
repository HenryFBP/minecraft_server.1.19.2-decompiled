import java.util.List;

public class bzb extends cat {
   public bzb(cat.a $$0) {
      super($$0);
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      List<bbm> $$3 = $$0.a(bbm.class, $$1.cy().g(2.0), $$0x -> $$0x != null && $$0x.bo() && $$0x.t() instanceof bpp);
      cax $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bbm $$5 = (bbm)$$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.df(), $$1.dh(), $$1.dl(), ajw.bT, ajx.g, 1.0F, 1.0F);
         $$0.a($$1, czv.y, $$1.cY());
         return bak.a(this.a($$4, $$1, new cax(caz.th)), $$0.k_());
      } else {
         dwo $$6 = a($$0, $$1, cgg.b.b);
         if ($$6.c() == dwo.a.a) {
            return bak.c($$4);
         } else {
            if ($$6.c() == dwo.a.b) {
               gt $$7 = ((dwm)$$6).a();
               if (!$$0.a($$1, $$7)) {
                  return bak.c($$4);
               }

               if ($$0.b_($$7).a(akp.a)) {
                  $$0.a($$1, $$1.df(), $$1.dh(), $$1.dl(), ajw.bS, ajx.g, 1.0F, 1.0F);
                  $$0.a($$1, czv.y, $$7);
                  return bak.a(this.a($$4, $$1, ccu.a(new cax(caz.qs), ccv.b)), $$0.k_());
               }
            }

            return bak.c($$4);
         }
      }
   }

   protected cax a(cax $$0, buc $$1, cax $$2) {
      $$1.b(akg.c.b(this));
      return cay.a($$0, $$1, $$2);
   }
}
