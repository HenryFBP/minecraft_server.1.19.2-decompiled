import java.util.EnumSet;

public class bjx extends bip {
   private final btk a;

   public bjx(btk $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bip.a.c, bip.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bo()) {
         return false;
      } else if (this.a.aR()) {
         return false;
      } else if (!this.a.aw()) {
         return false;
      } else if (this.a.D) {
         return false;
      } else {
         buc $$0 = this.a.fK();
         if ($$0 == null) {
            return false;
         } else if (this.a.f($$0) > 16.0) {
            return false;
         } else {
            return $$0.bU != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.D().n();
   }

   @Override
   public void d() {
      this.a.e(null);
   }
}
