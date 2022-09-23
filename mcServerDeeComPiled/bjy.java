public class bjy extends bip {
   private final bcl a;

   public bjy(bcl $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.aw() && !this.a.s.b_(this.a.da()).a(akp.a);
   }

   @Override
   public void c() {
      gt $$0 = null;

      for(gt $$2 : gt.b(
         ami.b(this.a.df() - 2.0), ami.b(this.a.dh() - 2.0), ami.b(this.a.dl() - 2.0), ami.b(this.a.df() + 2.0), this.a.dg(), ami.b(this.a.dl() + 2.0)
      )) {
         if (this.a.s.b_($$2).a(akp.a)) {
            $$0 = $$2;
            break;
         }
      }

      if ($$0 != null) {
         this.a.A().a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
      }

   }
}
