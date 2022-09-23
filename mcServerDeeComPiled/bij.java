import java.util.EnumSet;

public class bij extends bip {
   private final bce a;

   public bij(bce $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bip.a.c));
      $$0.D().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aR() && this.a.b(akp.a) > this.a.cV() || this.a.bf();
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.dQ().i() < 0.8F) {
         this.a.C().a();
      }

   }
}
