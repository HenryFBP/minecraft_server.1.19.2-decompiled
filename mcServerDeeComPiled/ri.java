import java.util.Objects;

public record ri(String a, rq b) {
   public ri(String $$0) {
      this($$0, rq.b($$0));
   }

   public boolean a() {
      return !this.b.equals(rq.b(this.a));
   }

   public static ri a(qx $$0) {
      String $$1 = $$0.e(256);
      rq $$2 = $$0.c(qx::j);
      return new ri($$1, (rq)Objects.requireNonNullElse($$2, rq.b($$1)));
   }

   public static void a(qx $$0, ri $$1) {
      $$0.a($$1.b(), 256);
      rq $$2 = $$1.a() ? $$1.c() : null;
      $$0.a($$2, qx::a);
   }

   public String b() {
      return this.a;
   }

   public rq c() {
      return this.b;
   }
}
