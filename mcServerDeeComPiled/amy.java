import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.slf4j.Logger;

@FunctionalInterface
public interface amy {
   Logger a = LogUtils.getLogger();
   amy b = $$0 -> ((CompletableFuture)$$0.get()).exceptionally($$0x -> {
         a.error("Task failed", $$0x);
         return null;
      });

   void append(amy.a var1);

   public interface a extends Supplier<CompletableFuture<?>> {
   }
}
