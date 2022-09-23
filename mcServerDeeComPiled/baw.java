import javax.annotation.Nullable;

public class baw {
   public static final baw a = new baw("inFire").n().s();
   public static final baw b = new baw("lightningBolt");
   public static final baw c = new baw("onFire").n().s();
   public static final baw d = new baw("lava").s();
   public static final baw e = new baw("hotFloor").s();
   public static final baw f = new baw("inWall").n();
   public static final baw g = new baw("cramming").n();
   public static final baw h = new baw("drown").n();
   public static final baw i = new baw("starve").n().q();
   public static final baw j = new baw("cactus");
   public static final baw k = new baw("fall").n().C();
   public static final baw l = new baw("flyIntoWall").n();
   public static final baw m = new baw("outOfWorld").n().p();
   public static final baw n = new baw("generic").n();
   public static final baw o = new baw("magic").n().A();
   public static final baw p = new baw("wither").n();
   public static final baw q = new baw("anvil").o();
   public static final baw r = new baw("fallingBlock").o();
   public static final baw s = new baw("dragonBreath").n();
   public static final baw t = new baw("dryout");
   public static final baw u = new baw("sweetBerryBush");
   public static final baw v = new baw("freeze").n();
   public static final baw w = new baw("fallingStalactite").o();
   public static final baw x = new baw("stalagmite").n().C();
   private boolean z;
   private boolean A;
   private boolean B;
   private boolean C;
   private boolean D;
   private float E = 0.1F;
   private boolean F;
   private boolean G;
   private boolean H;
   private boolean I;
   private boolean J;
   private boolean K;
   private boolean L;
   public final String y;

   public static baw b(bcc $$0) {
      return new bax("sting", $$0);
   }

   public static baw c(bcc $$0) {
      return new bax("mob", $$0);
   }

   public static baw a(bbn $$0, @Nullable bcc $$1) {
      return new bay("mob", $$0, $$1);
   }

   public static baw a(buc $$0) {
      return new bax("player", $$0);
   }

   public static baw a(bui $$0, @Nullable bbn $$1) {
      return new bay("arrow", $$0, $$1).c();
   }

   public static baw a(bbn $$0, @Nullable bbn $$1) {
      return new bay("trident", $$0, $$1).c();
   }

   public static baw a(bup $$0, @Nullable bbn $$1) {
      return new bay("fireworks", $$0, $$1).e();
   }

   public static baw a(buo $$0, @Nullable bbn $$1) {
      return $$1 == null ? new bay("onFire", $$0, $$0).s().c() : new bay("fireball", $$0, $$1).s().c();
   }

   public static baw a(bvh $$0, bbn $$1) {
      return new bay("witherSkull", $$0, $$1).c();
   }

   public static baw b(bbn $$0, @Nullable bbn $$1) {
      return new bay("thrown", $$0, $$1).c();
   }

   public static baw c(bbn $$0, @Nullable bbn $$1) {
      return new bay("indirectMagic", $$0, $$1).n().A();
   }

   public static baw a(bbn $$0) {
      return new bax("thorns", $$0).F().A();
   }

   public static baw a(@Nullable cgp $$0) {
      return d($$0 != null ? $$0.d() : null);
   }

   public static baw d(@Nullable bcc $$0) {
      return $$0 != null ? new bax("explosion.player", $$0).x().e() : new baw("explosion").x().e();
   }

   public static baw b(bbn $$0) {
      return new bax("sonic_boom", $$0).n().r().A();
   }

   public static baw a() {
      return new bas();
   }

   public String toString() {
      return "DamageSource (" + this.y + ")";
   }

   public boolean b() {
      return this.G;
   }

   public baw c() {
      this.G = true;
      return this;
   }

   public boolean d() {
      return this.J;
   }

   public baw e() {
      this.J = true;
      return this;
   }

   public boolean f() {
      return this.A;
   }

   public boolean g() {
      return this.z;
   }

   public float h() {
      return this.E;
   }

   public boolean i() {
      return this.B;
   }

   public boolean j() {
      return this.C;
   }

   public boolean k() {
      return this.D;
   }

   protected baw(String $$0) {
      this.y = $$0;
   }

   @Nullable
   public bbn l() {
      return this.m();
   }

   @Nullable
   public bbn m() {
      return null;
   }

   protected baw n() {
      this.A = true;
      this.E = 0.0F;
      return this;
   }

   protected baw o() {
      this.z = true;
      return this;
   }

   protected baw p() {
      this.B = true;
      return this;
   }

   protected baw q() {
      this.C = true;
      this.E = 0.0F;
      return this;
   }

   protected baw r() {
      this.D = true;
      return this;
   }

   protected baw s() {
      this.F = true;
      return this;
   }

   public baw t() {
      this.L = true;
      return this;
   }

   public rq a(bcc $$0) {
      bcc $$1 = $$0.es();
      String $$2 = "death.attack." + this.y;
      String $$3 = $$2 + ".player";
      return $$1 != null ? rq.a($$3, $$0.C_(), $$1.C_()) : rq.a($$2, $$0.C_());
   }

   public boolean u() {
      return this.F;
   }

   public boolean v() {
      return this.L;
   }

   public String w() {
      return this.y;
   }

   public baw x() {
      this.H = true;
      return this;
   }

   public boolean y() {
      return this.H;
   }

   public boolean z() {
      return this.I;
   }

   public baw A() {
      this.I = true;
      return this;
   }

   public boolean B() {
      return this.K;
   }

   public baw C() {
      this.K = true;
      return this;
   }

   public boolean D() {
      bbn $$0 = this.m();
      return $$0 instanceof buc && ((buc)$$0).fB().d;
   }

   @Nullable
   public dwq E() {
      return null;
   }
}
