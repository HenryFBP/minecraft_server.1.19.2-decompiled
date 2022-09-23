import java.util.EnumSet;

public class bic extends bjc {
   private final bnh g;

   public bic(bnh $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(bip.a.c, bip.a.a));
   }

   @Override
   public boolean a() {
      return this.g.q() && !this.g.fL() && !this.g.fT() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   protected int a(bcl $$0) {
      return 40;
   }

   @Override
   public void d() {
      super.d();
      this.g.z(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(false);
      if (!this.m()) {
         this.g.z(false);
      } else if (!this.g.fT()) {
         this.g.z(true);
      }

   }

   @Override
   protected boolean a(cha $$0, gt $$1) {
      return $$0.x($$1.b()) && $$0.a_($$1).a(akl.N);
   }
}
