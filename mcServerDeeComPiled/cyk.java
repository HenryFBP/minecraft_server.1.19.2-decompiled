import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class cyk implements czf<bbn> {
   private static final Logger b = LogUtils.getLogger();
   private static final String c = "Entities";
   private static final String d = "Position";
   private final agg e;
   private final cyl f;
   private final LongSet g = new LongOpenHashSet();
   private final azc<Runnable> h;
   protected final DataFixer a;

   public cyk(agg $$0, Path $$1, DataFixer $$2, boolean $$3, Executor $$4) {
      this.e = $$0;
      this.a = $$2;
      this.h = azc.a($$4, "entity-deserializer");
      this.f = new cyl($$1, $$3, "entities");
   }

   @Override
   public CompletableFuture<cza<bbn>> a(cge $$0) {
      return this.g.contains($$0.a()) ? CompletableFuture.completedFuture(b($$0)) : this.f.a($$0).thenApplyAsync($$1 -> {
         if ($$1.isEmpty()) {
            this.g.add($$0.a());
            return b($$0);
         } else {
            try {
               cge $$2 = b((pj)$$1.get());
               if (!Objects.equals($$0, $$2)) {
                  b.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{$$0, $$0, $$2});
               }
            } catch (Exception var6) {
               b.warn("Failed to parse chunk {} position info", $$0, var6);
            }

            pj $$4 = this.c((pj)$$1.get());
            pp $$5 = $$4.c("Entities", 10);
            List<bbn> $$6 = (List)bbr.a($$5, this.e).collect(ImmutableList.toImmutableList());
            return new cza($$0, $$6);
         }
      }, this.h::a);
   }

   private static cge b(pj $$0) {
      int[] $$1 = $$0.n("Position");
      return new cge($$1[0], $$1[1]);
   }

   private static void a(pj $$0, cge $$1) {
      $$0.a("Position", (qc)(new pn(new int[]{$$1.e, $$1.f})));
   }

   private static cza<bbn> b(cge $$0) {
      return new cza<>($$0, ImmutableList.of());
   }

   @Override
   public void a(cza<bbn> $$0) {
      cge $$1 = $$0.a();
      if ($$0.c()) {
         if (this.g.add($$1.a())) {
            this.f.a($$1, null);
         }

      } else {
         pp $$2 = new pp();
         $$0.b().forEach($$1x -> {
            pj $$2x = new pj();
            if ($$1x.e($$2x)) {
               $$2.add($$2x);
            }

         });
         pj $$3 = new pj();
         $$3.a("DataVersion", ab.b().getWorldVersion());
         $$3.a("Entities", (qc)$$2);
         a($$3, $$1);
         this.f.a($$1, $$3).exceptionally($$1x -> {
            b.error("Failed to store chunk {}", $$1, $$1x);
            return null;
         });
         this.g.remove($$1.a());
      }
   }

   @Override
   public void a(boolean $$0) {
      this.f.a($$0).join();
      this.h.a();
   }

   private pj c(pj $$0) {
      int $$1 = a($$0);
      return pv.a(this.a, ani.l, $$0, $$1);
   }

   public static int a(pj $$0) {
      return $$0.b("DataVersion", 99) ? $$0.h("DataVersion") : -1;
   }

   @Override
   public void close() throws IOException {
      this.f.close();
   }
}
