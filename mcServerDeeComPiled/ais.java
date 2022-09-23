import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class ais<S> implements aii {
   private static final int c = 2;
   private static final int d = 2;
   private static final int e = 1;
   protected final CompletableFuture<anf> a = new CompletableFuture();
   protected CompletableFuture<List<S>> b;
   final Set<aig> f;
   private final int g;
   private int h;
   private int i;
   private final AtomicInteger j = new AtomicInteger();
   private final AtomicInteger k = new AtomicInteger();

   public static ais<Void> a(aim $$0, List<aig> $$1, Executor $$2, Executor $$3, CompletableFuture<anf> $$4) {
      return new ais($$2, $$3, $$0, $$1, ($$1x, $$2x, $$3x, $$4x, $$5) -> $$3x.a($$1x, $$2x, aww.a, aww.a, $$2, $$5), $$4);
   }

   protected ais(Executor $$0, final Executor $$1, aim $$2, List<aig> $$3, ais.a<S> $$4, CompletableFuture<anf> $$5) {
      this.g = $$3.size();
      this.j.incrementAndGet();
      $$5.thenRun(this.k::incrementAndGet);
      List<CompletableFuture<S>> $$6 = Lists.newArrayList();
      CompletableFuture<?> $$7 = $$5;
      this.f = Sets.newHashSet($$3);

      for(final aig $$8 : $$3) {
         final CompletableFuture<?> $$9 = $$7;
         CompletableFuture<S> $$10 = $$4.create(new aig.a() {
            @Override
            public <T> CompletableFuture<T> a(T $$0) {
               $$1.execute(() -> {
                  ais.this.f.remove($$8);
                  if (ais.this.f.isEmpty()) {
                     ais.this.a.complete(anf.a);
                  }

               });
               return ais.this.a.thenCombine($$9, ($$1xx, $$2) -> $$0);
            }
         }, $$2, $$8, $$1x -> {
            this.j.incrementAndGet();
            $$0.execute(() -> {
               $$1x.run();
               this.k.incrementAndGet();
            });
         }, $$1x -> {
            ++this.h;
            $$1.execute(() -> {
               $$1x.run();
               ++this.i;
            });
         });
         $$6.add($$10);
         $$7 = $$10;
      }

      this.b = ad.c($$6);
   }

   @Override
   public CompletableFuture<?> a() {
      return this.b;
   }

   @Override
   public float b() {
      int $$0 = this.g - this.f.size();
      float $$1 = (float)(this.k.get() * 2 + this.i * 2 + $$0 * 1);
      float $$2 = (float)(this.j.get() * 2 + this.h * 2 + this.g * 1);
      return $$1 / $$2;
   }

   public static aii a(aim $$0, List<aig> $$1, Executor $$2, Executor $$3, CompletableFuture<anf> $$4, boolean $$5) {
      return (aii)($$5 ? new aih($$0, $$1, $$2, $$3, $$4) : a($$0, $$1, $$2, $$3, $$4));
   }

   protected interface a<S> {
      CompletableFuture<S> create(aig.a var1, aim var2, aig var3, Executor var4, Executor var5);
   }
}
