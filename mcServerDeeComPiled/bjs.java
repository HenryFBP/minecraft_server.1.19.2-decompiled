import java.util.EnumSet;

public class bjs extends bip {
   private final bpa a;
   private final double b;
   private double c;
   private double d;
   private double e;

   public bjs(bpa $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bip.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fS() && this.a.bJ()) {
         dwq $$0 = bmj.a(this.a, 5, 4);
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.c;
            this.d = $$0.d;
            this.e = $$0.e;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.a.D().a(this.c, this.d, this.e, this.b);
   }

   @Override
   public boolean b() {
      return !this.a.fS() && !this.a.D().l() && this.a.bJ();
   }

   @Override
   public void e() {
      if (!this.a.fS() && this.a.dQ().a(this.a(50)) == 0) {
         bbn $$0 = (bbn)this.a.cI().get(0);
         if ($$0 == null) {
            return;
         }

         if ($$0 instanceof buc) {
            int $$1 = this.a.fY();
            int $$2 = this.a.gf();
            if ($$2 > 0 && this.a.dQ().a($$2) < $$1) {
               this.a.g((buc)$$0);
               return;
            }

            this.a.v(5);
         }

         this.a.bv();
         this.a.gi();
         this.a.s.a(this.a, (byte)6);
      }

   }
}
