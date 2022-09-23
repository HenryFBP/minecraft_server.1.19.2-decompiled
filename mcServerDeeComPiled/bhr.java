import java.util.Optional;

public class bhr implements bho {
   protected final bce a;
   protected float b;
   protected float c;
   protected int d;
   protected double e;
   protected double f;
   protected double g;

   public bhr(bce $$0) {
      this.a = $$0;
   }

   public void a(dwq $$0) {
      this.a($$0.c, $$0.d, $$0.e);
   }

   public void a(bbn $$0) {
      this.a($$0.df(), b($$0), $$0.dl());
   }

   public void a(bbn $$0, float $$1, float $$2) {
      this.a($$0.df(), b($$0), $$0.dl(), $$1, $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      this.a($$0, $$1, $$2, (float)this.a.fn(), (float)this.a.U());
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = 2;
   }

   public void a() {
      if (this.c()) {
         this.a.p(0.0F);
      }

      if (this.d > 0) {
         --this.d;
         this.i().ifPresent($$0 -> this.a.aZ = this.a(this.a.aZ, $$0, this.b));
         this.h().ifPresent($$0 -> this.a.p(this.a(this.a.ds(), $$0, this.c)));
      } else {
         this.a.aZ = this.a(this.a.aZ, this.a.aX, 10.0F);
      }

      this.b();
   }

   protected void b() {
      if (!this.a.D().l()) {
         this.a.aZ = ami.c(this.a.aZ, this.a.aX, (float)this.a.V());
      }

   }

   protected boolean c() {
      return true;
   }

   public boolean d() {
      return this.d > 0;
   }

   public double e() {
      return this.e;
   }

   public double f() {
      return this.f;
   }

   public double g() {
      return this.g;
   }

   protected Optional<Float> h() {
      double $$0 = this.e - this.a.df();
      double $$1 = this.f - this.a.dj();
      double $$2 = this.g - this.a.dl();
      double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$3) > 1.0E-5F) ? Optional.empty() : Optional.of((float)(-(ami.d($$1, $$3) * 180.0F / (float)Math.PI)));
   }

   protected Optional<Float> i() {
      double $$0 = this.e - this.a.df();
      double $$1 = this.g - this.a.dl();
      return !(Math.abs($$1) > 1.0E-5F) && !(Math.abs($$0) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(ami.d($$1, $$0) * 180.0F / (float)Math.PI) - 90.0F);
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = ami.c($$0, $$1);
      float $$4 = ami.a($$3, -$$2, $$2);
      return $$0 + $$4;
   }

   private static double b(bbn $$0) {
      return $$0 instanceof bcc ? $$0.dj() : ($$0.cy().b + $$0.cy().e) / 2.0;
   }
}
