public class gv implements gu {
   private final agg a;
   private final gt b;

   public gv(agg $$0, gt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public agg g() {
      return this.a;
   }

   @Override
   public double a() {
      return (double)this.b.u() + 0.5;
   }

   @Override
   public double b() {
      return (double)this.b.v() + 0.5;
   }

   @Override
   public double c() {
      return (double)this.b.w() + 0.5;
   }

   @Override
   public gt d() {
      return this.b;
   }

   @Override
   public cvo e() {
      return this.a.a_(this.b);
   }

   @Override
   public <T extends cti> T f() {
      return (T)this.a.c_(this.b);
   }
}
