import java.util.Optional;

public record vf(sd a, rm.b b) implements tc<tf> {
   public vf(qx $$0) {
      this(new sd($$0), new rm.b($$0));
   }

   @Override
   public void a(qx $$0) {
      this.a.a($$0);
      this.b.a($$0);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   @Override
   public boolean a() {
      return true;
   }

   public Optional<rm.a> a(hn $$0) {
      return this.b.a($$0);
   }

   public sd b() {
      return this.a;
   }

   public rm.b c() {
      return this.b;
   }
}
