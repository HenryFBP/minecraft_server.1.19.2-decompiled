import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class alx implements amy {
   private static final Logger c = LogUtils.getLogger();
   private CompletableFuture<?> d = CompletableFuture.completedFuture(null);
   private final Executor e;

   public alx(Executor $$0) {
      this.e = $$0;
   }

   @Override
   public void append(amy.a $$0) {
      this.d = this.d.thenComposeAsync($$1 -> (CompletionStage)$$0.get(), this.e).exceptionally($$0x -> {
         if ($$0x instanceof CompletionException $$1) {
            $$0x = $$1.getCause();
         }

         if ($$0x instanceof CancellationException $$2) {
            throw $$2;
         } else {
            c.error("Chain link failed, continuing to next one", $$0x);
            return null;
         }
      });
   }
}
