import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface dsn {
   dsn a = ($$0, $$1) -> false;
   dsn b = ($$0, $$1) -> true;

   boolean expand(dsd var1, Consumer<dsu> var2);

   default dsn and(dsn $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
   }

   default dsn or(dsn $$0) {
      Objects.requireNonNull($$0);
      return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
   }
}
