import java.util.Optional;
import java.util.UUID;

public record zx(String a, Optional<buf.a> b, Optional<UUID> c) implements tc<zv> {
   public zx(qx $$0) {
      this($$0.e(16), $$0.b(buf.a::new), $$0.b(qx::m));
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a, 16);
      $$0.a(this.b, ($$1, $$2) -> $$2.a($$0));
      $$0.a(this.c, qx::a);
   }

   public void a(zv $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.a;
   }

   public Optional<buf.a> c() {
      return this.b;
   }

   public Optional<UUID> d() {
      return this.c;
   }
}
