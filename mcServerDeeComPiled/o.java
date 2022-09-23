import java.util.Objects;

@FunctionalInterface
public interface o {
   boolean test(char var1);

   default o and(o $$0) {
      Objects.requireNonNull($$0);
      return $$1 -> this.test($$1) && $$0.test($$1);
   }

   default o negate() {
      return $$0 -> !this.test($$0);
   }

   default o or(o $$0) {
      Objects.requireNonNull($$0);
      return $$1 -> this.test($$1) || $$0.test($$1);
   }
}
