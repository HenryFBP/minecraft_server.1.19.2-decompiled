import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record sd(sh c, rz d, sf e, Optional<rq> f, rt g) {
   public static final Duration a = Duration.ofMinutes(5L);
   public static final Duration b = a.plus(Duration.ofMinutes(2L));

   public sd(qx $$0) {
      this(new sh($$0), new rz($$0), new sf($$0), $$0.b(qx::j), rt.a($$0));
   }

   public static sd a(ri $$0) {
      return a(sa.a(), $$0);
   }

   public static sd a(sa $$0, ri $$1) {
      sf $$2 = new sf($$1, $$0.d(), $$0.e(), rw.a);
      sh $$3 = new sh(null, $$0.c());
      return new sd($$3, rz.a, $$2, Optional.empty(), rt.b);
   }

   public void a(qx $$0) {
      this.c.a($$0);
      this.d.a($$0);
      this.e.a($$0);
      $$0.a(this.f, qx::a);
      rt.a($$0, this.g);
   }

   public sd a(rq $$0) {
      Optional<rq> $$1 = !this.b().c().equals($$0) ? Optional.of($$0) : Optional.empty();
      return new sd(this.c, this.d, this.e, $$1, this.g);
   }

   public sd a() {
      return this.f.isPresent() ? new sd(this.c, this.d, this.e, Optional.empty(), this.g) : this;
   }

   public sd a(rt $$0) {
      return this.g.equals($$0) ? this : new sd(this.c, this.d, this.e, this.f, $$0);
   }

   public sd a(boolean $$0) {
      return this.a($$0 ? this.g : rt.b);
   }

   public boolean a(amp $$0) {
      return this.d.a($$0, this.c, this.e);
   }

   public boolean a(buf $$0) {
      amp $$1 = $$0.a();
      return this.a($$1);
   }

   public boolean a(rl $$0) {
      buf $$1 = $$0.c();
      return $$1 != null && this.a($$1);
   }

   public ri b() {
      return this.e.b();
   }

   public rq c() {
      return (rq)this.l().orElse(this.b().c());
   }

   public Instant d() {
      return this.e.c();
   }

   public long e() {
      return this.e.d();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.d().plus(a));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.d().plus(b));
   }

   public sa f() {
      return new sa(this.c.b(), this.d(), this.e());
   }

   @Nullable
   public rw.a g() {
      sa $$0 = this.f();
      return !this.d.a() && !$$0.b() ? new rw.a($$0.c(), this.d) : null;
   }

   public boolean a(UUID $$0) {
      return !this.d.a() && this.c.b().equals($$0);
   }

   public boolean h() {
      return this.g.b();
   }

   public sh i() {
      return this.c;
   }

   public rz j() {
      return this.d;
   }

   public sf k() {
      return this.e;
   }

   public Optional<rq> l() {
      return this.f;
   }

   public rt m() {
      return this.g;
   }
}
