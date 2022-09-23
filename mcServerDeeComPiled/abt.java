import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.minecraft.server.MinecraftServer;

public class abt {
   public static <D, R> CompletableFuture<R> a(abt.a $$0, abt.d<D> $$1, abt.c<D, R> $$2, Executor $$3, Executor $$4) {
      try {
         Pair<cgl, aid> $$5 = $$0.a.a();
         aid $$6 = (aid)$$5.getSecond();
         Pair<D, hn.a> $$7 = $$1.get($$6, (cgl)$$5.getFirst());
         D $$8 = (D)$$7.getFirst();
         hn.a $$9 = (hn.a)$$7.getSecond();
         return abk.a($$6, $$9, $$0.b(), $$0.c(), $$3, $$4).whenComplete(($$1x, $$2x) -> {
            if ($$2x != null) {
               $$6.close();
            }

         }).thenApplyAsync($$4x -> {
            $$4x.a($$9);
            return $$2.create($$6, $$4x, $$9, $$8);
         }, $$4);
      } catch (Exception var10) {
         return CompletableFuture.failedFuture(var10);
      }
   }

   public static record a(abt.b a, ds.a b, int c) {
      final abt.b a;
   }

   public static record b(ahy a, cgl b, boolean c) {
      public Pair<cgl, aid> a() {
         cgl $$0 = MinecraftServer.a(this.a, this.b, this.c);
         List<ahl> $$1 = this.a.f();
         aid $$2 = new aif(ahm.b, $$1);
         return Pair.of($$0, $$2);
      }

      public ahy b() {
         return this.a;
      }

      public cgl c() {
         return this.b;
      }

      public boolean d() {
         return this.c;
      }
   }

   @FunctionalInterface
   public interface c<D, R> {
      R create(aid var1, abk var2, hn.a var3, D var4);
   }

   @FunctionalInterface
   public interface d<D> {
      Pair<D, hn.a> get(aim var1, cgl var2);
   }
}
