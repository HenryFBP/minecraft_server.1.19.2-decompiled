public class bid extends bjc {
   private final bnh g;

   public bid(bnh $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.q() && !this.g.fL() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(cha $$0, gt $$1) {
      if (!$$0.x($$1.b())) {
         return false;
      } else {
         cvo $$2 = $$0.a_($$1);
         if ($$2.a(cju.cg)) {
            return ctn.a($$0, $$1) < 1;
         } else {
            return $$2.a(cju.co) && $$2.c(cmp.b) ? true : $$2.a(akl.N, $$0x -> $$0x.d(cjm.a).map($$0xx -> $$0xx != cwc.a).orElse(true));
         }
      }
   }
}
