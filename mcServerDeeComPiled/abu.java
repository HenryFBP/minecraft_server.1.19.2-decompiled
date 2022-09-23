import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public record abu(aid a, abk b, hn.a c, drw d) implements AutoCloseable {
   public static CompletableFuture<abu> a(abt.a $$0, abt.d<drw> $$1, Executor $$2, Executor $$3) {
      return abt.a($$0, $$1, abu::new, $$2, $$3);
   }

   public void close() {
      this.a.close();
   }
}
