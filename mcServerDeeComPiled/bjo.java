import java.util.EnumSet;

public class bjo<T extends brq & bru> extends bip {
   private final T a;
   private final double b;
   private int c;
   private final float d;
   private int e = -1;
   private int f;
   private boolean g;
   private boolean h;
   private int i = -1;

   public bjo(T $$0, double $$1, int $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3 * $$3;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
   }

   public void c(int $$0) {
      this.c = $$0;
   }

   @Override
   public boolean a() {
      return this.a.G() == null ? false : this.h();
   }

   protected boolean h() {
      return this.a.b(caz.mQ);
   }

   @Override
   public boolean b() {
      return (this.a() || !this.a.D().l()) && this.h();
   }

   @Override
   public void c() {
      super.c();
      this.a.u(true);
   }

   @Override
   public void d() {
      super.d();
      this.a.u(false);
      this.f = 0;
      this.e = -1;
      this.a.eZ();
   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      bcc $$0 = this.a.G();
      if ($$0 != null) {
         double $$1 = this.a.h($$0.df(), $$0.dh(), $$0.dl());
         boolean $$2 = this.a.E().a($$0);
         boolean $$3 = this.f > 0;
         if ($$2 != $$3) {
            this.f = 0;
         }

         if ($$2) {
            ++this.f;
         } else {
            --this.f;
         }

         if (!($$1 > (double)this.d) && this.f >= 20) {
            this.a.D().n();
            ++this.i;
         } else {
            this.a.D().a($$0, this.b);
            this.i = -1;
         }

         if (this.i >= 20) {
            if ((double)this.a.dQ().i() < 0.3) {
               this.g = !this.g;
            }

            if ((double)this.a.dQ().i() < 0.3) {
               this.h = !this.h;
            }

            this.i = 0;
         }

         if (this.i > -1) {
            if ($$1 > (double)(this.d * 0.75F)) {
               this.h = false;
            } else if ($$1 < (double)(this.d * 0.25F)) {
               this.h = true;
            }

            this.a.A().a(this.h ? -0.5F : 0.5F, this.g ? 0.5F : -0.5F);
            this.a.a($$0, 30.0F, 30.0F);
         } else {
            this.a.z().a($$0, 30.0F, 30.0F);
         }

         if (this.a.eT()) {
            if (!$$2 && this.f < -60) {
               this.a.eZ();
            } else if ($$2) {
               int $$4 = this.a.eX();
               if ($$4 >= 20) {
                  this.a.eZ();
                  this.a.a($$0, bzc.a($$4));
                  this.e = this.c;
               }
            }
         } else if (--this.e <= 0 && this.f >= -60) {
            this.a.c(buv.a(this.a, caz.mQ));
         }

      }
   }
}
