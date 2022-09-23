public class bph extends bip {
   private final bpg a;

   public bph(bpg $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.s.a(this.a.df(), this.a.dh(), this.a.dl(), 10.0);
   }

   @Override
   public void e() {
      agg $$0 = (agg)this.a.s;
      bah $$1 = $$0.d_(this.a.da());
      this.a.v(false);
      this.a.w(true);
      this.a.b_(0);
      bcb $$2 = bbr.X.a((cgx)$$0);
      $$2.c(this.a.df(), this.a.dh(), this.a.dl());
      $$2.a(true);
      $$0.b($$2);
      bry $$3 = this.a($$1, this.a);
      $$3.k(this.a);
      $$0.a_($$3);

      for(int $$4 = 0; $$4 < 3; ++$$4) {
         bpa $$5 = this.a($$1);
         bry $$6 = this.a($$1, $$5);
         $$6.k($$5);
         $$5.i(this.a.dQ().a(0.0, 1.1485), 0.0, this.a.dQ().a(0.0, 1.1485));
         $$0.a_($$5);
      }

   }

   private bpa a(bah $$0) {
      bpg $$1 = bbr.aF.a(this.a.s);
      $$1.a((agg)this.a.s, $$0, bcg.k, null, null);
      $$1.e(this.a.df(), this.a.dh(), this.a.dl());
      $$1.W = 60;
      $$1.fp();
      $$1.w(true);
      $$1.b_(0);
      return $$1;
   }

   private bry a(bah $$0, bpa $$1) {
      bry $$2 = bbr.aE.a($$1.s);
      $$2.a((agg)$$1.s, $$0, bcg.k, null, null);
      $$2.e($$1.df(), $$1.dh(), $$1.dl());
      $$2.W = 60;
      $$2.fp();
      if ($$2.c(bbs.f).b()) {
         $$2.a(bbs.f, new cax(caz.oc));
      }

      $$2.a(bbs.a, cet.a($$2.dQ(), this.a($$2.ez()), (int)(5.0F + $$0.d() * (float)$$2.dQ().a(18)), false));
      $$2.a(bbs.f, cet.a($$2.dQ(), this.a($$2.c(bbs.f)), (int)(5.0F + $$0.d() * (float)$$2.dQ().a(18)), false));
      return $$2;
   }

   private cax a(cax $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
