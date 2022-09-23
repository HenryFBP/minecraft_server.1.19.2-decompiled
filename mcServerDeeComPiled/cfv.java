public class cfv {
   private final cax a;
   private final cax b;
   private final cax c;
   private int d;
   private final int e;
   private boolean f = true;
   private int g;
   private int h;
   private float i;
   private int j = 1;

   public cfv(pj $$0) {
      this.a = cax.a($$0.p("buy"));
      this.b = cax.a($$0.p("buyB"));
      this.c = cax.a($$0.p("sell"));
      this.d = $$0.h("uses");
      if ($$0.b("maxUses", 99)) {
         this.e = $$0.h("maxUses");
      } else {
         this.e = 4;
      }

      if ($$0.b("rewardExp", 1)) {
         this.f = $$0.q("rewardExp");
      }

      if ($$0.b("xp", 3)) {
         this.j = $$0.h("xp");
      }

      if ($$0.b("priceMultiplier", 5)) {
         this.i = $$0.j("priceMultiplier");
      }

      this.g = $$0.h("specialPrice");
      this.h = $$0.h("demand");
   }

   public cfv(cax $$0, cax $$1, int $$2, int $$3, float $$4) {
      this($$0, cax.b, $$1, $$2, $$3, $$4);
   }

   public cfv(cax $$0, cax $$1, cax $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public cfv(cax $$0, cax $$1, cax $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public cfv(cax $$0, cax $$1, cax $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.j = $$5;
      this.i = $$6;
      this.h = $$7;
   }

   public cax a() {
      return this.a;
   }

   public cax b() {
      int $$0 = this.a.K();
      cax $$1 = this.a.o();
      int $$2 = Math.max(0, ami.d((float)($$0 * this.h) * this.i));
      $$1.e(ami.a($$0 + $$2 + this.g, 1, this.a.c().m()));
      return $$1;
   }

   public cax c() {
      return this.b;
   }

   public cax d() {
      return this.c;
   }

   public void e() {
      this.h = this.h + this.d - (this.e - this.d);
   }

   public cax f() {
      return this.c.o();
   }

   public int g() {
      return this.d;
   }

   public void h() {
      this.d = 0;
   }

   public int i() {
      return this.e;
   }

   public void j() {
      ++this.d;
   }

   public int k() {
      return this.h;
   }

   public void a(int $$0) {
      this.g += $$0;
   }

   public void l() {
      this.g = 0;
   }

   public int m() {
      return this.g;
   }

   public void b(int $$0) {
      this.g = $$0;
   }

   public float n() {
      return this.i;
   }

   public int o() {
      return this.j;
   }

   public boolean p() {
      return this.d >= this.e;
   }

   public void q() {
      this.d = this.e;
   }

   public boolean r() {
      return this.d > 0;
   }

   public boolean s() {
      return this.f;
   }

   public pj t() {
      pj $$0 = new pj();
      $$0.a("buy", (qc)this.a.b(new pj()));
      $$0.a("sell", (qc)this.c.b(new pj()));
      $$0.a("buyB", (qc)this.b.b(new pj()));
      $$0.a("uses", this.d);
      $$0.a("maxUses", this.e);
      $$0.a("rewardExp", this.f);
      $$0.a("xp", this.j);
      $$0.a("priceMultiplier", this.i);
      $$0.a("specialPrice", this.g);
      $$0.a("demand", this.h);
      return $$0;
   }

   public boolean a(cax $$0, cax $$1) {
      return this.c($$0, this.b()) && $$0.K() >= this.b().K() && this.c($$1, this.b) && $$1.K() >= this.b.K();
   }

   private boolean c(cax $$0, cax $$1) {
      if ($$1.b() && $$0.b()) {
         return true;
      } else {
         cax $$2 = $$0.o();
         if ($$2.c().o()) {
            $$2.b($$2.j());
         }

         return cax.c($$2, $$1) && (!$$1.t() || $$2.t() && pv.a($$1.u(), $$2.u(), false));
      }
   }

   public boolean b(cax $$0, cax $$1) {
      if (!this.a($$0, $$1)) {
         return false;
      } else {
         $$0.g(this.b().K());
         if (!this.c().b()) {
            $$1.g(this.c().K());
         }

         return true;
      }
   }
}
