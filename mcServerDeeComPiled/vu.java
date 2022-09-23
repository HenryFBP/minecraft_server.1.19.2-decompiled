import java.util.Optional;
import javax.annotation.Nullable;

public class vu implements tc<tf> {
   private final Optional<rq> a;
   private final Optional<String> b;
   private final boolean c;
   private final boolean d;

   public vu(@Nullable rq $$0, @Nullable String $$1, boolean $$2, boolean $$3) {
      this.a = Optional.ofNullable($$0);
      this.b = Optional.ofNullable($$1);
      this.c = $$2;
      this.d = $$3;
   }

   public vu(qx $$0) {
      this.a = $$0.b(qx::j);
      this.b = $$0.b(qx::q);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a, qx::a);
      $$0.a(this.b, qx::a);
      $$0.writeBoolean(this.c);
      $$0.writeBoolean(this.d);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public Optional<rq> b() {
      return this.a;
   }

   public Optional<String> c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
