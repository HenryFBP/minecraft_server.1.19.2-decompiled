public class btz {
   public boolean a;
   public boolean b;
   public boolean c;
   public boolean d;
   public boolean e = true;
   private float f = 0.05F;
   private float g = 0.1F;

   public void a(pj $$0) {
      pj $$1 = new pj();
      $$1.a("invulnerable", this.a);
      $$1.a("flying", this.b);
      $$1.a("mayfly", this.c);
      $$1.a("instabuild", this.d);
      $$1.a("mayBuild", this.e);
      $$1.a("flySpeed", this.f);
      $$1.a("walkSpeed", this.g);
      $$0.a("abilities", (qc)$$1);
   }

   public void b(pj $$0) {
      if ($$0.b("abilities", 10)) {
         pj $$1 = $$0.p("abilities");
         this.a = $$1.q("invulnerable");
         this.b = $$1.q("flying");
         this.c = $$1.q("mayfly");
         this.d = $$1.q("instabuild");
         if ($$1.b("flySpeed", 99)) {
            this.f = $$1.j("flySpeed");
            this.g = $$1.j("walkSpeed");
         }

         if ($$1.b("mayBuild", 1)) {
            this.e = $$1.q("mayBuild");
         }
      }

   }

   public float a() {
      return this.f;
   }

   public void a(float $$0) {
      this.f = $$0;
   }

   public float b() {
      return this.g;
   }

   public void b(float $$0) {
      this.g = $$0;
   }
}
