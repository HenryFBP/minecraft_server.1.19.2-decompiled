import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class afv implements afs.d, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final Map<azb<?>, afu<? extends Function<azb<anf>, ?>>> b;
   private final Set<azb<?>> c;
   private final azc<aze.b> d;

   public afv(List<azb<?>> $$0, Executor $$1, int $$2) {
      this.b = (Map)$$0.stream().collect(Collectors.toMap(Function.identity(), $$1x -> new afu($$1x.bo() + "_queue", $$2)));
      this.c = Sets.newHashSet($$0);
      this.d = new azc<>(new aze.a(4), $$1, "sorter");
   }

   public boolean a() {
      return this.d.c() || this.b.values().stream().anyMatch(afu::b);
   }

   public static <T> afv.a<T> a(Function<azb<anf>, T> $$0, long $$1, IntSupplier $$2) {
      return new afv.a<>($$0, $$1, $$2);
   }

   public static afv.a<Runnable> a(Runnable $$0, long $$1, IntSupplier $$2) {
      return new afv.a($$1x -> () -> {
            $$0.run();
            $$1x.a(anf.a);
         }, $$1, $$2);
   }

   public static afv.a<Runnable> a(afs $$0, Runnable $$1) {
      return a($$1, $$0.j().a(), $$0::l);
   }

   public static <T> afv.a<T> a(afs $$0, Function<azb<anf>, T> $$1) {
      return a($$1, $$0.j().a(), $$0::l);
   }

   public static afv.b a(Runnable $$0, long $$1, boolean $$2) {
      return new afv.b($$0, $$1, $$2);
   }

   public <T> azb<afv.a<T>> a(azb<T> $$0, boolean $$1) {
      return (azb<afv.a<T>>)this.d.b($$2 -> new aze.b(0, () -> {
            this.b($$0);
            $$2.a(azb.a("chunk priority sorter around " + $$0.bo(), $$2xx -> this.a($$0, $$2xx.a, $$2xx.b, $$2xx.c, $$1)));
         })).join();
   }

   public azb<afv.b> a(azb<Runnable> $$0) {
      return (azb<afv.b>)this.d
         .b($$1 -> new aze.b(0, () -> $$1.a(azb.a("chunk priority sorter around " + $$0.bo(), $$1xx -> this.a($$0, $$1xx.b, $$1xx.a, $$1xx.c)))))
         .join();
   }

   @Override
   public void onLevelChange(cge $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.d.a(new aze.b(0, () -> {
         int $$4 = $$1.getAsInt();
         this.b.values().forEach($$3xx -> $$3xx.a($$4, $$0, $$2));
         $$3.accept($$2);
      }));
   }

   private <T> void a(azb<T> $$0, long $$1, Runnable $$2, boolean $$3) {
      this.d.a(new aze.b(1, () -> {
         afu<Function<azb<anf>, T>> $$4 = this.b($$0);
         $$4.a($$1, $$3);
         if (this.c.remove($$0)) {
            this.a($$4, $$0);
         }

         $$2.run();
      }));
   }

   private <T> void a(azb<T> $$0, Function<azb<anf>, T> $$1, long $$2, IntSupplier $$3, boolean $$4) {
      this.d.a(new aze.b(2, () -> {
         afu<Function<azb<anf>, T>> $$5 = this.b($$0);
         int $$6 = $$3.getAsInt();
         $$5.a(Optional.of($$1), $$2, $$6);
         if ($$4) {
            $$5.a(Optional.empty(), $$2, $$6);
         }

         if (this.c.remove($$0)) {
            this.a($$5, $$0);
         }

      }));
   }

   private <T> void a(afu<Function<azb<anf>, T>> $$0, azb<T> $$1) {
      this.d.a(new aze.b(3, () -> {
         Stream<Either<Function<azb<anf>, T>, Runnable>> $$2 = $$0.a();
         if ($$2 == null) {
            this.c.add($$1);
         } else {
            CompletableFuture.allOf((CompletableFuture[])$$2.map($$1xx -> (CompletableFuture)$$1xx.map($$1::b, $$0xxx -> {
                  $$0xxx.run();
                  return CompletableFuture.completedFuture(anf.a);
               })).toArray($$0xx -> new CompletableFuture[$$0xx])).thenAccept($$2x -> this.a($$0, $$1));
         }

      }));
   }

   private <T> afu<Function<azb<anf>, T>> b(azb<T> $$0) {
      afu<? extends Function<azb<anf>, ?>> $$1 = (afu)this.b.get($$0);
      if ($$1 == null) {
         throw (IllegalArgumentException)ad.c((T)(new IllegalArgumentException("No queue for: " + $$0)));
      } else {
         return $$1;
      }
   }

   @VisibleForTesting
   public String b() {
      return (String)this.b
            .entrySet()
            .stream()
            .map(
               $$0 -> ((azb)$$0.getKey()).bo()
                     + "=["
                     + (String)((afu)$$0.getValue()).c().stream().map($$0x -> $$0x + ":" + new cge($$0x)).collect(Collectors.joining(","))
                     + "]"
            )
            .collect(Collectors.joining(","))
         + ", s="
         + this.c.size();
   }

   public void close() {
      this.b.keySet().forEach(azb::close);
   }

   public static final class a<T> {
      final Function<azb<anf>, T> a;
      final long b;
      final IntSupplier c;

      a(Function<azb<anf>, T> $$0, long $$1, IntSupplier $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   public static final class b {
      final Runnable a;
      final long b;
      final boolean c;

      b(Runnable $$0, long $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
