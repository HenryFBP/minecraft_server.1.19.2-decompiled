import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@FunctionalInterface
public interface rh {
   rh a = ($$0, $$1) -> CompletableFuture.completedFuture($$1);

   CompletableFuture<rq> decorate(@Nullable agh var1, rq var2);

   default CompletableFuture<sd> decorate(@Nullable agh $$0, sd $$1) {
      return $$1.b().a() ? CompletableFuture.completedFuture($$1) : this.decorate($$0, $$1.c()).thenApply($$1::a);
   }

   static sd attachIfNotDecorated(sd $$0, rq $$1) {
      return !$$0.b().a() ? $$0.a($$1) : $$0;
   }
}
