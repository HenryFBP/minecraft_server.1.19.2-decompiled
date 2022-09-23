import java.util.EnumSet;

public class bjd extends bip {
   private final bcl a;
   private double b;
   private double c;
   private double d;
   private final double e;

   public bjd(bcl $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.a(EnumSet.of(bip.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.fs()) {
         return false;
      } else {
         dwq $$0 = bmj.a(this.a, 16, 7, dwq.c(this.a.ft()), (float) (Math.PI / 2));
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.c;
            this.c = $$0.d;
            this.d = $$0.e;
            return true;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.D().l();
   }

   @Override
   public void c() {
      this.a.D().a(this.b, this.c, this.d, this.e);
   }
}
