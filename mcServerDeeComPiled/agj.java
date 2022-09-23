import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class agj extends dpm implements AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private final azc<Runnable> e;
   private final ObjectList<Pair<agj.a, Runnable>> f = new ObjectArrayList();
   private final aft g;
   private final azb<afv.a<Runnable>> h;
   private volatile int i = 5;
   private final AtomicBoolean j = new AtomicBoolean();

   public agj(cxv $$0, aft $$1, boolean $$2, azc<Runnable> $$3, azb<afv.a<Runnable>> $$4) {
      super($$0, true, $$2);
      this.g = $$1;
      this.h = $$4;
      this.e = $$3;
   }

   public void close() {
   }

   @Override
   public int a(int $$0, boolean $$1, boolean $$2) {
      throw (UnsupportedOperationException)ad.c(new UnsupportedOperationException("Ran automatically on a different thread!"));
   }

   @Override
   public void a(gt $$0, int $$1) {
      throw (UnsupportedOperationException)ad.c(new UnsupportedOperationException("Ran automatically on a different thread!"));
   }

   @Override
   public void a(gt $$0) {
      gt $$1 = $$0.h();
      this.a(hq.a($$0.u()), hq.a($$0.w()), agj.a.b, ad.a((Runnable)(() -> super.a($$1)), (Supplier<String>)(() -> "checkBlock " + $$1)));
   }

   protected void a(cge $$0) {
      this.a($$0.e, $$0.f, () -> 0, agj.a.a, ad.a((Runnable)(() -> {
         super.b($$0, false);
         super.a($$0, false);

         for(int $$1 = this.c(); $$1 < this.d(); ++$$1) {
            super.a(chg.b, hq.a($$0, $$1), null, true);
            super.a(chg.a, hq.a($$0, $$1), null, true);
         }

         for(int $$2 = this.c.aj(); $$2 < this.c.ak(); ++$$2) {
            super.a(hq.a($$0, $$2), true);
         }

      }), (Supplier<String>)(() -> "updateChunkStatus " + $$0 + " true")));
   }

   @Override
   public void a(hq $$0, boolean $$1) {
      this.a($$0.a(), $$0.c(), () -> 0, agj.a.a, ad.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "updateSectionStatus " + $$0 + " " + $$1)));
   }

   @Override
   public void a(cge $$0, boolean $$1) {
      this.a($$0.e, $$0.f, agj.a.a, ad.a((Runnable)(() -> super.a($$0, $$1)), (Supplier<String>)(() -> "enableLight " + $$0 + " " + $$1)));
   }

   @Override
   public void a(chg $$0, hq $$1, @Nullable cxo $$2, boolean $$3) {
      this.a($$1.a(), $$1.c(), () -> 0, agj.a.a, ad.a((Runnable)(() -> super.a($$0, $$1, $$2, $$3)), (Supplier<String>)(() -> "queueData " + $$1)));
   }

   private void a(int $$0, int $$1, agj.a $$2, Runnable $$3) {
      this.a($$0, $$1, this.g.c(cge.c($$0, $$1)), $$2, $$3);
   }

   private void a(int $$0, int $$1, IntSupplier $$2, agj.a $$3, Runnable $$4) {
      this.h.a(afv.a((Runnable)(() -> {
         this.f.add(Pair.of($$3, $$4));
         if (this.f.size() >= this.i) {
            this.e();
         }

      }), cge.c($$0, $$1), $$2));
   }

   @Override
   public void b(cge $$0, boolean $$1) {
      this.a($$0.e, $$0.f, () -> 0, agj.a.a, ad.a((Runnable)(() -> super.b($$0, $$1)), (Supplier<String>)(() -> "retainData " + $$0)));
   }

   public CompletableFuture<cxj> a(cxj $$0) {
      cge $$1 = $$0.f();
      return CompletableFuture.supplyAsync(ad.a((Supplier)(() -> {
         super.b($$1, true);
         return $$0;
      }), (Supplier<String>)(() -> "retainData: " + $$1)), $$1x -> this.a($$1.e, $$1.f, agj.a.a, $$1x));
   }

   public CompletableFuture<cxj> a(cxj $$0, boolean $$1) {
      cge $$2 = $$0.f();
      $$0.b(false);
      this.a($$2.e, $$2.f, agj.a.a, ad.a((Runnable)(() -> {
         cxu[] $$3 = $$0.d();

         for(int $$4 = 0; $$4 < $$0.ai(); ++$$4) {
            cxu $$5 = $$3[$$4];
            if (!$$5.c()) {
               int $$6 = this.c.g($$4);
               super.a(hq.a($$2, $$6), false);
            }
         }

         super.a($$2, true);
         if (!$$1) {
            $$0.n().forEach($$1xx -> super.a($$1xx, $$0.h($$1xx)));
         }

      }), (Supplier<String>)(() -> "lightChunk " + $$2 + " " + $$1)));
      return CompletableFuture.supplyAsync(() -> {
         $$0.b(true);
         super.b($$2, false);
         this.g.c($$2);
         return $$0;
      }, $$1x -> this.a($$2.e, $$2.f, agj.a.b, $$1x));
   }

   public void a() {
      if ((!this.f.isEmpty() || super.A_()) && this.j.compareAndSet(false, true)) {
         this.e.a((Runnable)() -> {
            this.e();
            this.j.set(false);
         });
      }

   }

   private void e() {
      int $$0 = Math.min(this.f.size(), this.i);
      ObjectListIterator<Pair<agj.a, Runnable>> $$1 = this.f.iterator();

      int $$2;
      for($$2 = 0; $$1.hasNext() && $$2 < $$0; ++$$2) {
         Pair<agj.a, Runnable> $$3 = (Pair)$$1.next();
         if ($$3.getFirst() == agj.a.a) {
            ((Runnable)$$3.getSecond()).run();
         }
      }

      $$1.back($$2);
      super.a(Integer.MAX_VALUE, true, true);

      for(int var5 = 0; $$1.hasNext() && var5 < $$0; ++var5) {
         Pair<agj.a, Runnable> $$4 = (Pair)$$1.next();
         if ($$4.getFirst() == agj.a.b) {
            ((Runnable)$$4.getSecond()).run();
         }

         $$1.remove();
      }

   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static enum a {
      a,
      b;
   }
}
