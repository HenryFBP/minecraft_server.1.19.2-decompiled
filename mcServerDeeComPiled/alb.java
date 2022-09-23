import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class alb implements aig {
   private static final Map<aba<? extends hm<?>>, String> a = Map.of(
      hm.h, "tags/blocks", hm.j, "tags/entity_types", hm.f, "tags/fluids", hm.x, "tags/game_events", hm.k, "tags/items"
   );
   private final hn b;
   private List<alb.a<?>> c = List.of();

   public alb(hn $$0) {
      this.b = $$0;
   }

   public List<alb.a<?>> a() {
      return this.c;
   }

   public static String a(aba<? extends hm<?>> $$0) {
      String $$1 = (String)a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(aig.a $$0, aim $$1, awz $$2, awz $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends alb.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf((CompletableFuture[])$$6.toArray($$0x -> new CompletableFuture[$$0x]))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = (List)$$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<alb.a<T>> a(aim $$0, Executor $$1, hn.d<T> $$2) {
      aba<? extends hm<T>> $$3 = $$2.a();
      hm<T> $$4 = $$2.b();
      ala<hc<T>> $$5 = new ala<>($$2x -> $$4.b(aba.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new alb.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aba<? extends hm<T>> a, Map<abb, Collection<hc<T>>> b) {
   }
}
