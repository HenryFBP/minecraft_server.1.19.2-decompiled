public class cle extends cjt {
   private static final rq a = rq.c("container.crafting");

   protected cle(cvn.c $$0) {
      super($$0);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(akg.an);
         return baj.b;
      }
   }

   @Override
   public bam b(cvo $$0, cgx $$1, gt $$2) {
      return new bap(($$2x, $$3, $$4) -> new bxb($$2x, $$3, bwx.a($$1, $$2)), a);
   }
}
