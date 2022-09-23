import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class abn implements aig {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ".mcfunction";
   private static final int c = "functions/".length();
   private static final int d = ".mcfunction".length();
   private volatile Map<abb, dm> e = ImmutableMap.of();
   private final ala<dm> f = new ala<>(this::a, "tags/functions");
   private volatile Map<abb, Collection<dm>> g = Map.of();
   private final int h;
   private final CommandDispatcher<dr> i;

   public Optional<dm> a(abb $$0) {
      return Optional.ofNullable((dm)this.e.get($$0));
   }

   public Map<abb, dm> a() {
      return this.e;
   }

   public Collection<dm> b(abb $$0) {
      return (Collection<dm>)this.g.getOrDefault($$0, List.of());
   }

   public Iterable<abb> b() {
      return this.g.keySet();
   }

   public abn(int $$0, CommandDispatcher<dr> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public CompletableFuture<Void> a(aig.a $$0, aim $$1, awz $$2, awz $$3, Executor $$4, Executor $$5) {
      CompletableFuture<Map<abb, List<ala.a>>> $$6 = CompletableFuture.supplyAsync(() -> this.f.a($$1), $$4);
      CompletableFuture<Map<abb, CompletableFuture<dm>>> $$7 = CompletableFuture.supplyAsync(
            () -> $$1.b("functions", $$0xx -> $$0xx.a().endsWith(".mcfunction")), $$4
         )
         .thenCompose($$1x -> {
            Map<abb, CompletableFuture<dm>> $$2x = Maps.newHashMap();
            dr $$3x = new dr(dq.a, dwq.b, dwp.a, null, this.h, "", rp.a, null, null);
   
            for(Entry<abb, aik> $$4x : $$1x.entrySet()) {
               abb $$5x = (abb)$$4x.getKey();
               String $$6x = $$5x.a();
               abb $$7x = new abb($$5x.b(), $$6x.substring(c, $$6x.length() - d));
               $$2x.put($$7x, CompletableFuture.supplyAsync(() -> {
                  List<String> $$3xx = a((aik)$$4x.getValue());
                  return dm.a($$7x, this.i, $$3x, $$3xx);
               }, $$4));
            }
   
            CompletableFuture<?>[] $$8 = (CompletableFuture[])$$2x.values().toArray(new CompletableFuture[0]);
            return CompletableFuture.allOf($$8).handle(($$1xx, $$2xx) -> $$2x);
         });
      return $$6.thenCombine($$7, Pair::of).thenCompose($$0::a).thenAcceptAsync($$0x -> {
         Map<abb, CompletableFuture<dm>> $$1x = (Map)$$0x.getSecond();
         Builder<abb, dm> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
               if ($$3x != null) {
                  a.error("Failed to load function {}", $$1xx, $$3x);
               } else {
                  $$2x.put($$1xx, $$2xxx);
               }

               return null;
            }).join());
         this.e = $$2x.build();
         this.g = this.f.a((Map<abb, List<ala.a>>)$$0x.getFirst());
      }, $$5);
   }

   private static List<String> a(aik $$0) {
      try {
         BufferedReader $$1 = $$0.c();

         List var2;
         try {
            var2 = $$1.lines().toList();
         } catch (Throwable var5) {
            if ($$1 != null) {
               try {
                  $$1.close();
               } catch (Throwable var4) {
                  var5.addSuppressed(var4);
               }
            }

            throw var5;
         }

         if ($$1 != null) {
            $$1.close();
         }

         return var2;
      } catch (IOException var6) {
         throw new CompletionException(var6);
      }
   }
}
