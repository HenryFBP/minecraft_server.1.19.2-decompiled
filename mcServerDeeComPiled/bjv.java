import java.util.EnumSet;
import javax.annotation.Nullable;

public class bjv extends bip {
   private final brc a;
   @Nullable
   private bcc b;

   public bjv(brc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bip.a.a));
   }

   @Override
   public boolean a() {
      bcc $$0 = this.a.G();
      return this.a.q() > 0 || $$0 != null && this.a.f((bbn)$$0) < 9.0;
   }

   @Override
   public void c() {
      this.a.D().n();
      this.b = this.a.G();
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      if (this.b == null) {
         this.a.a(-1);
      } else if (this.a.f((bbn)this.b) > 49.0) {
         this.a.a(-1);
      } else if (!this.a.E().a(this.b)) {
         this.a.a(-1);
      } else {
         this.a.a(1);
      }
   }
}
