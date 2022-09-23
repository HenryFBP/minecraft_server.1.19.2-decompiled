import java.util.EnumSet;

public class bkl extends bko {
   private final bcw a;
   private bcc b;
   private int c;

   public bkl(bcw $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bip.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.q() && !this.a.fL()) {
         bcc $$0 = this.a.fK();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.dR();
            int $$1 = $$0.dS();
            return $$1 != this.c && this.a(this.b, bmf.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bcc $$0 = this.a.fK();
      if ($$0 != null) {
         this.c = $$0.dS();
      }

      super.c();
   }
}
