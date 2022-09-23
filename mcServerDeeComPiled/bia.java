import java.util.EnumSet;

public class bia extends bip {
   private final bcl a;

   public bia(bcl $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ca() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean D_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<gt> $$0 = gt.b(
         ami.b(this.a.df() - 1.0), this.a.dg(), ami.b(this.a.dl() - 1.0), ami.b(this.a.df() + 1.0), ami.b(this.a.dh() + 8.0), ami.b(this.a.dl() + 1.0)
      );
      gt $$1 = null;

      for(gt $$2 : $$0) {
         if (this.a(this.a.s, $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = new gt(this.a.df(), this.a.dh() + 8.0, this.a.dl());
      }

      this.a.D().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new dwq((double)this.a.bo, (double)this.a.bp, (double)this.a.bq));
      this.a.a(bci.a, this.a.dd());
   }

   private boolean a(cha $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cju.lO)) && $$2.a($$0, $$1, dqm.a);
   }
}
