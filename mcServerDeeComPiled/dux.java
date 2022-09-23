import java.util.function.Predicate;

public interface dux extends dse, Predicate<dsd> {
   duy a();

   @FunctionalInterface
   public interface a {
      dux build();

      default dux.a invert() {
         return duu.a(this);
      }

      default dun.a or(dux.a $$0) {
         return dun.a(this, $$0);
      }
   }
}
