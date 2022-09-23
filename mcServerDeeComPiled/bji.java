import java.util.EnumSet;
import javax.annotation.Nullable;

public class bji extends bip {
   public static final int a = 1;
   protected final bcl b;
   protected final double c;
   protected double d;
   protected double e;
   protected double f;
   protected boolean g;

   public bji(bcl $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bip.a.a));
   }

   @Override
   public boolean a() {
      if (!this.h()) {
         return false;
      } else {
         if (this.b.bH()) {
            gt $$0 = this.a(this.b.s, this.b, 5);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.b.dR() != null || this.b.dp() || this.b.bH();
   }

   protected boolean i() {
      dwq $$0 = bmj.a(this.b, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.d = $$0.c;
         this.e = $$0.d;
         this.f = $$0.e;
         return true;
      }
   }

   public boolean k() {
      return this.g;
   }

   @Override
   public void c() {
      this.b.D().a(this.d, this.e, this.f, this.c);
      this.g = true;
   }

   @Override
   public void d() {
      this.g = false;
   }

   @Override
   public boolean b() {
      return !this.b.D().l();
   }

   @Nullable
   protected gt a(cgd $$0, bbn $$1, int $$2) {
      gt $$3 = $$1.da();
      return !$$0.a_($$3).k($$0, $$3).b() ? null : (gt)gt.a($$1.da(), $$2, 1, $$1x -> $$0.b_($$1x).a(akp.a)).orElse(null);
   }
}
