import java.util.EnumSet;

public class biv extends bip {
   private final bce a;
   private bcc b;
   private final float c;

   public biv(bce $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bip.a.c, bip.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.bJ()) {
         return false;
      } else {
         this.b = this.a.G();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.f(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else if (!this.a.aw()) {
               return false;
            } else {
               return this.a.dQ().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.aw();
   }

   @Override
   public void c() {
      dwq $$0 = this.a.dd();
      dwq $$1 = new dwq(this.b.df() - this.a.df(), 0.0, this.b.dl() - this.a.dl());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.n($$1.c, (double)this.c, $$1.e);
   }
}
