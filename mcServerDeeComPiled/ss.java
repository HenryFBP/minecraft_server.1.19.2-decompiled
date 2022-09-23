import java.util.Optional;

public record ss(String b) implements rr {
   @Override
   public <T> Optional<T> a(ru.a<T> $$0) {
      return $$0.accept(this.b);
   }

   @Override
   public <T> Optional<T> a(ru.b<T> $$0, sj $$1) {
      return $$0.accept($$1, this.b);
   }

   public String toString() {
      return "literal{" + this.b + "}";
   }

   public String a() {
      return this.b;
   }
}
