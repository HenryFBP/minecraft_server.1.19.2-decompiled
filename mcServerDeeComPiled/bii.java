import java.util.EnumSet;
import javax.annotation.Nullable;

public class bii extends bip {
   protected final bcl a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final cgx f;

   public bii(bcl $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.s;
      this.a(EnumSet.of(bip.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.G() != null) {
         return false;
      } else if (!this.f.M()) {
         return false;
      } else if (!this.a.bH()) {
         return false;
      } else if (!this.f.g(this.a.da())) {
         return false;
      } else {
         return !this.a.c(bbs.f).b() ? false : this.h();
      }
   }

   protected boolean h() {
      dwq $$0 = this.i();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0.c;
         this.c = $$0.d;
         this.d = $$0.e;
         return true;
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

   @Nullable
   protected dwq i() {
      amn $$0 = this.a.dQ();
      gt $$1 = this.a.da();

      for(int $$2 = 0; $$2 < 10; ++$$2) {
         gt $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.g($$3) && this.a.f($$3) < 0.0F) {
            return dwq.c($$3);
         }
      }

      return null;
   }
}
