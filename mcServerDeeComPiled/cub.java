import java.util.Arrays;
import java.util.Optional;

public class cub extends cti {
   public static final String a = "target";
   public static final String b = "pool";
   public static final String c = "joint";
   public static final String d = "name";
   public static final String e = "final_state";
   private abb f = new abb("empty");
   private abb g = new abb("empty");
   private aba<dmk> h = aba.a(hm.aQ, new abb("empty"));
   private cub.a i = cub.a.a;
   private String j = "minecraft:air";

   public cub(gt $$0, cvo $$1) {
      super(ctk.E, $$0, $$1);
   }

   public abb c() {
      return this.f;
   }

   public abb d() {
      return this.g;
   }

   public aba<dmk> f() {
      return this.h;
   }

   @Override
   public String g() {
      return this.j;
   }

   public cub.a i() {
      return this.i;
   }

   public void a(abb $$0) {
      this.f = $$0;
   }

   public void b(abb $$0) {
      this.g = $$0;
   }

   public void a(aba<dmk> $$0) {
      this.h = $$0;
   }

   public void a(String $$0) {
      this.j = $$0;
   }

   public void a(cub.a $$0) {
      this.i = $$0;
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("name", this.f.toString());
      $$0.a("target", this.g.toString());
      $$0.a("pool", this.h.a().toString());
      $$0.a("final_state", this.j);
      $$0.a("joint", this.i.c());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.f = new abb($$0.l("name"));
      this.g = new abb($$0.l("target"));
      this.h = aba.a(hm.aQ, new abb($$0.l("pool")));
      this.j = $$0.l("final_state");
      this.i = (cub.a)cub.a.a($$0.l("joint")).orElseGet(() -> cnl.h(this.q()).o().d() ? cub.a.b : cub.a.a);
   }

   public tn j() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   public void a(agg $$0, int $$1, boolean $$2) {
      gt $$3 = this.p().a(((ha)this.q().c(cnl.a)).a());
      hm<dmk> $$4 = $$0.s().d(hm.aQ);
      hc<dmk> $$5 = $$4.h(this.h);
      dme.a($$0, $$5, this.g, $$1, $$3, $$2);
   }

   public static enum a implements amw {
      a("rollable"),
      b("aligned");

      private final String c;

      private a(String $$0) {
         this.c = $$0;
      }

      @Override
      public String c() {
         return this.c;
      }

      public static Optional<cub.a> a(String $$0) {
         return Arrays.stream(values()).filter($$1 -> $$1.c().equals($$0)).findFirst();
      }

      public rq a() {
         return rq.c("jigsaw_block.joint." + this.c);
      }
   }
}
