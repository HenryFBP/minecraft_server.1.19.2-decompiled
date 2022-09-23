import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ain extends aig {
   @Override
   default CompletableFuture<Void> a(aig.a $$0, aim $$1, awz $$2, awz $$3, Executor $$4, Executor $$5) {
      return $$0.a(anf.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aim var1);
}
