import java.util.EnumSet;

public class bjf extends bip {
   private final bce a;
   private bcc b;
   private int c;

   public bjf(bce $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
   }

   @Override
   public boolean a() {
      bcc $$0 = this.a.G();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean b() {
      if (!this.b.bo()) {
         return false;
      } else if (this.a.f(this.b) > 225.0) {
         return false;
      } else {
         return !this.a.D().l() || this.a();
      }
   }

   @Override
   public void d() {
      this.b = null;
      this.a.D().n();
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      this.a.z().a(this.b, 30.0F, 30.0F);
      double $$0 = (double)(this.a.cW() * 2.0F * this.a.cW() * 2.0F);
      double $$1 = this.a.h(this.b.df(), this.b.dh(), this.b.dl());
      double $$2 = 0.8;
      if ($$1 > $$0 && $$1 < 16.0) {
         $$2 = 1.33;
      } else if ($$1 < 225.0) {
         $$2 = 0.6;
      }

      this.a.D().a(this.b, $$2);
      this.c = Math.max(this.c - 1, 0);
      if (!($$1 > $$0)) {
         if (this.c <= 0) {
            this.c = 20;
            this.a.z(this.b);
         }
      }
   }
}
