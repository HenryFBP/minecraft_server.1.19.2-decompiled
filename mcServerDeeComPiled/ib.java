public class ib extends ia {
   @Override
   protected cax a(gu $$0, cax $$1) {
      cgx $$2 = $$0.g();
      if (!$$2.k_()) {
         gt $$3 = $$0.d().a($$0.e().c(clo.a));
         this.a(a((agg)$$2, $$3) || b((agg)$$2, $$3));
         if (this.a() && $$1.a(1, $$2.r_(), null)) {
            $$1.e(0);
         }
      }

      return $$1;
   }

   private static boolean a(agg $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      if ($$2.a(akl.ax, $$0x -> $$0x.b(cjn.b) && $$0x.b() instanceof cjn)) {
         int $$3 = $$2.c(cjn.b);
         if ($$3 >= 5) {
            $$0.a(null, $$1, ajw.bs, ajx.e, 1.0F, 1.0F);
            cjn.a($$0, $$1);
            ((cjn)$$2.b()).a($$0, $$2, $$1, null, ctf.b.b);
            $$0.a(null, czv.O, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean b(agg $$0, gt $$1) {
      for(bcc $$3 : $$0.a(bcc.class, new dwl($$1), bbq.f)) {
         if ($$3 instanceof bcs $$4 && $$4.a()) {
            $$4.a(ajx.e);
            $$0.a(null, czv.O, $$1);
            return true;
         }
      }

      return false;
   }
}
