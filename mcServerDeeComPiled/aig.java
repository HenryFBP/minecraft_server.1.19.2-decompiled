import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aig {
   CompletableFuture<Void> a(aig.a var1, aim var2, awz var3, awz var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
