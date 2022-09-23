import java.util.List;

public record ub(ub.a a, List<String> b) implements tc<tf> {
   public ub(qx $$0) {
      this($$0.a(ub.a.class), $$0.a(qx::q));
   }

   @Override
   public void a(qx $$0) {
      $$0.a((Enum<?>)this.a);
      $$0.a(this.b, qx::a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public ub.a b() {
      return this.a;
   }

   public List<String> c() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
