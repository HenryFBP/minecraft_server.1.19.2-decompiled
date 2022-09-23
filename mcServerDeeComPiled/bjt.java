import java.util.EnumSet;

public class bjt extends bip {
   private final bcw a;

   public bjt(bcw $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bip.a.c, bip.a.a));
   }

   @Override
   public boolean b() {
      return this.a.fL();
   }

   @Override
   public boolean a() {
      if (!this.a.q()) {
         return false;
      } else if (this.a.aU()) {
         return false;
      } else if (!this.a.aw()) {
         return false;
      } else {
         bcc $$0 = this.a.fK();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f((bbn)$$0) < 144.0 && $$0.dR() != null ? false : this.a.fL();
         }
      }
   }

   @Override
   public void c() {
      this.a.D().n();
      this.a.x(true);
   }

   @Override
   public void d() {
      this.a.x(false);
   }
}
