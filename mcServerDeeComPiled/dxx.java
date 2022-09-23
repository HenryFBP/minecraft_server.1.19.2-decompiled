import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class dxx<T> implements dxw<T> {
   private static final Comparator<dxv<?>> a = ($$0, $$1) -> dya.b.compare($$0.b(), $$1.b());
   private final LongPredicate b;
   private final Supplier<awz> c;
   private final Long2ObjectMap<dxv<T>> d = new Long2ObjectOpenHashMap();
   private final Long2LongMap e = ad.a(new Long2LongOpenHashMap(), $$0x -> $$0x.defaultReturnValue(Long.MAX_VALUE));
   private final Queue<dxv<T>> f = new PriorityQueue(a);
   private final Queue<dya<T>> g = new ArrayDeque();
   private final List<dya<T>> h = new ArrayList();
   private final Set<dya<?>> i = new ObjectOpenCustomHashSet(dya.c);
   private final BiConsumer<dxv<T>, dya<T>> j = ($$0x, $$1x) -> {
      if ($$1x.equals($$0x.b())) {
         this.b($$1x);
      }

   };

   public dxx(LongPredicate $$0, Supplier<awz> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cge $$0, dxv<T> $$1) {
      long $$2 = $$0.a();
      this.d.put($$2, $$1);
      dya<T> $$3 = $$1.b();
      if ($$3 != null) {
         this.e.put($$2, $$3.c());
      }

      $$1.a(this.j);
   }

   public void a(cge $$0) {
      long $$1 = $$0.a();
      dxv<T> $$2 = (dxv)this.d.remove($$1);
      this.e.remove($$1);
      if ($$2 != null) {
         $$2.a(null);
      }

   }

   @Override
   public void a(dya<T> $$0) {
      long $$1 = cge.a($$0.b());
      dxv<T> $$2 = (dxv)this.d.get($$1);
      if ($$2 == null) {
         ad.c((T)(new IllegalStateException("Trying to schedule tick in not loaded position " + $$0.b())));
      } else {
         $$2.a($$0);
      }
   }

   public void a(long $$0, int $$1, BiConsumer<gt, T> $$2) {
      awz $$3 = (awz)this.c.get();
      $$3.a("collect");
      this.a($$0, $$1, $$3);
      $$3.b("run");
      $$3.a("ticksToRun", this.g.size());
      this.a($$2);
      $$3.b("cleanup");
      this.c();
      $$3.c();
   }

   private void a(long $$0, int $$1, awz $$2) {
      this.a($$0);
      $$2.a("containersToTick", this.f.size());
      this.a($$0, $$1);
      this.b();
   }

   private void a(long $$0) {
      ObjectIterator<Entry> $$1 = Long2LongMaps.fastIterator(this.e);

      while($$1.hasNext()) {
         Entry $$2 = (Entry)$$1.next();
         long $$3 = $$2.getLongKey();
         long $$4 = $$2.getLongValue();
         if ($$4 <= $$0) {
            dxv<T> $$5 = (dxv)this.d.get($$3);
            if ($$5 == null) {
               $$1.remove();
            } else {
               dya<T> $$6 = $$5.b();
               if ($$6 == null) {
                  $$1.remove();
               } else if ($$6.c() > $$0) {
                  $$2.setValue($$6.c());
               } else if (this.b.test($$3)) {
                  $$1.remove();
                  this.f.add($$5);
               }
            }
         }
      }

   }

   private void a(long $$0, int $$1) {
      dxv<T> $$2;
      while(this.a($$1) && ($$2 = (dxv)this.f.poll()) != null) {
         dya<T> $$3 = $$2.c();
         this.c($$3);
         this.a(this.f, $$2, $$0, $$1);
         dya<T> $$4 = $$2.b();
         if ($$4 != null) {
            if ($$4.c() <= $$0 && this.a($$1)) {
               this.f.add($$2);
            } else {
               this.b($$4);
            }
         }
      }

   }

   private void b() {
      for(dxv<T> $$0 : this.f) {
         this.b($$0.b());
      }

   }

   private void b(dya<T> $$0) {
      this.e.put(cge.a($$0.b()), $$0.c());
   }

   private void a(Queue<dxv<T>> $$0, dxv<T> $$1, long $$2, int $$3) {
      if (this.a($$3)) {
         dxv<T> $$4 = (dxv)$$0.peek();
         dya<T> $$5 = $$4 != null ? $$4.b() : null;

         while(this.a($$3)) {
            dya<T> $$6 = $$1.b();
            if ($$6 == null || $$6.c() > $$2 || $$5 != null && dya.b.compare($$6, $$5) > 0) {
               break;
            }

            $$1.c();
            this.c($$6);
         }

      }
   }

   private void c(dya<T> $$0) {
      this.g.add($$0);
   }

   private boolean a(int $$0) {
      return this.g.size() < $$0;
   }

   private void a(BiConsumer<gt, T> $$0) {
      while(!this.g.isEmpty()) {
         dya<T> $$1 = (dya)this.g.poll();
         if (!this.i.isEmpty()) {
            this.i.remove($$1);
         }

         this.h.add($$1);
         $$0.accept($$1.b(), $$1.a());
      }

   }

   private void c() {
      this.g.clear();
      this.f.clear();
      this.h.clear();
      this.i.clear();
   }

   @Override
   public boolean a(gt $$0, T $$1) {
      dxv<T> $$2 = (dxv)this.d.get(cge.a($$0));
      return $$2 != null && $$2.a($$0, $$1);
   }

   @Override
   public boolean b(gt $$0, T $$1) {
      this.d();
      return this.i.contains(dya.a($$1, $$0));
   }

   private void d() {
      if (this.i.isEmpty() && !this.g.isEmpty()) {
         this.i.addAll(this.g);
      }

   }

   private void a(dkt $$0, dxx.a<T> $$1) {
      int $$2 = hq.a((double)$$0.g());
      int $$3 = hq.a((double)$$0.i());
      int $$4 = hq.a((double)$$0.j());
      int $$5 = hq.a((double)$$0.l());

      for(int $$6 = $$2; $$6 <= $$4; ++$$6) {
         for(int $$7 = $$3; $$7 <= $$5; ++$$7) {
            long $$8 = cge.c($$6, $$7);
            dxv<T> $$9 = (dxv)this.d.get($$8);
            if ($$9 != null) {
               $$1.accept($$8, $$9);
            }
         }
      }

   }

   public void a(dkt $$0) {
      Predicate<dya<T>> $$1 = $$1x -> $$0.b($$1x.b());
      this.a($$0, ($$1x, $$2) -> {
         dya<T> $$3 = $$2.b();
         $$2.a($$1);
         dya<T> $$4 = $$2.b();
         if ($$4 != $$3) {
            if ($$4 != null) {
               this.b($$4);
            } else {
               this.e.remove($$1x);
            }
         }

      });
      this.h.removeIf($$1);
      this.g.removeIf($$1);
   }

   public void a(dkt $$0, hs $$1) {
      List<dya<T>> $$2 = new ArrayList();
      Predicate<dya<T>> $$3 = $$1x -> $$0.b($$1x.b());
      this.h.stream().filter($$3).forEach($$2::add);
      this.g.stream().filter($$3).forEach($$2::add);
      this.a($$0, ($$2x, $$3x) -> $$3x.d().filter($$3).forEach($$2::add));
      LongSummaryStatistics $$4 = $$2.stream().mapToLong(dya::e).summaryStatistics();
      long $$5 = $$4.getMin();
      long $$6 = $$4.getMax();
      $$2.forEach($$3x -> this.a(new dya<>((T)$$3x.a(), $$3x.b().a($$1), $$3x.c(), $$3x.d(), $$3x.e() - $$5 + $$6 + 1L)));
   }

   @Override
   public int a() {
      return this.d.values().stream().mapToInt(dyc::a).sum();
   }

   @FunctionalInterface
   interface a<T> {
      void accept(long var1, dxv<T> var3);
   }
}
