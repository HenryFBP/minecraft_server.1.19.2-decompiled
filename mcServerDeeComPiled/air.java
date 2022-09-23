import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class air<T> implements aig {
   @Override
   public final CompletableFuture<Void> a(aig.a $$0, aim $$1, awz $$2, awz $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aim var1, awz var2);

   protected abstract void a(T var1, aim var2, awz var3);
}
