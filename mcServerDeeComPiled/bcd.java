public class bcd extends bbn {
   private static final String b = "data";
   private pj c = new pj();

   public bcd(bbr<?> $$0, cgx $$1) {
      super($$0, $$1);
      this.Q = true;
   }

   @Override
   public void k() {
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(pj $$0) {
      this.c = $$0.p("data");
   }

   @Override
   protected void b(pj $$0) {
      $$0.a("data", (qc)this.c.g());
   }

   @Override
   public tc<?> S() {
      throw new IllegalStateException("Markers should never be sent");
   }

   @Override
   protected void m(bbn $$0) {
      $$0.p();
   }

   @Override
   public dqb c_() {
      return dqb.d;
   }
}
