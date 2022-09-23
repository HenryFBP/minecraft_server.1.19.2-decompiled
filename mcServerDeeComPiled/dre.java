public class dre {
   private final gt a;
   private final int b;
   private final int c;

   public dre(gt $$0, int $$1, int $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static dre a(pj $$0) {
      gt $$1 = pv.b($$0.p("Pos"));
      int $$2 = $$0.h("Rotation");
      int $$3 = $$0.h("EntityId");
      return new dre($$1, $$2, $$3);
   }

   public pj a() {
      pj $$0 = new pj();
      $$0.a("Pos", (qc)pv.a(this.a));
      $$0.a("Rotation", this.b);
      $$0.a("EntityId", this.c);
      return $$0;
   }

   public gt b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public String e() {
      return a(this.a);
   }

   public static String a(gt $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
