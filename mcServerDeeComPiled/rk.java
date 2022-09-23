import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public class rk {
   private final AtomicReference<rk.a> a = new AtomicReference();
   @Nullable
   private CompletableFuture<?> b;

   public void a() {
      if (this.b != null && this.b.isDone()) {
         this.b = null;
      }

      if (this.b == null) {
         this.b();
      }

   }

   private void b() {
      rk.a $$0 = (rk.a)this.a.getAndSet(null);
      if ($$0 != null) {
         this.b = $$0.run();
      }

   }

   public void a(rk.a $$0) {
      this.a.set($$0);
   }

   @FunctionalInterface
   public interface a {
      CompletableFuture<?> run();
   }
}
