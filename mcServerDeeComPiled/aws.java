import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;

public class aws implements awx {
   private static final long a = Duration.ofMillis(100L).toNanos();
   private static final Logger c = LogUtils.getLogger();
   private final List<String> d = Lists.newArrayList();
   private final LongList e = new LongArrayList();
   private final Map<String, aws.a> f = Maps.newHashMap();
   private final IntSupplier g;
   private final LongSupplier h;
   private final long i;
   private final int j;
   private String k = "";
   private boolean l;
   @Nullable
   private aws.a m;
   private final boolean n;
   private final Set<Pair<String, ayd>> o = new ObjectArraySet();

   public aws(LongSupplier $$0, IntSupplier $$1, boolean $$2) {
      this.i = $$0.getAsLong();
      this.h = $$0;
      this.j = $$1.getAsInt();
      this.g = $$1;
      this.n = $$2;
   }

   @Override
   public void a() {
      if (this.l) {
         c.error("Profiler tick already started - missing endTick()?");
      } else {
         this.l = true;
         this.k = "";
         this.d.clear();
         this.a("root");
      }
   }

   @Override
   public void b() {
      if (!this.l) {
         c.error("Profiler tick already ended - missing startTick()?");
      } else {
         this.c();
         this.l = false;
         if (!this.k.isEmpty()) {
            c.error("Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?", LogUtils.defer(() -> awy.b(this.k)));
         }

      }
   }

   @Override
   public void a(String $$0) {
      if (!this.l) {
         c.error("Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?", $$0);
      } else {
         if (!this.k.isEmpty()) {
            this.k = this.k + "\u001e";
         }

         this.k = this.k + $$0;
         this.d.add(this.k);
         this.e.add(ad.c());
         this.m = null;
      }
   }

   @Override
   public void a(Supplier<String> $$0) {
      this.a((String)$$0.get());
   }

   @Override
   public void a(ayd $$0) {
      this.o.add(Pair.of(this.k, $$0));
   }

   @Override
   public void c() {
      if (!this.l) {
         c.error("Cannot pop from profiler if profiler tick hasn't started - missing startTick()?");
      } else if (this.e.isEmpty()) {
         c.error("Tried to pop one too many times! Mismatched push() and pop()?");
      } else {
         long $$0 = ad.c();
         long $$1 = this.e.removeLong(this.e.size() - 1);
         this.d.remove(this.d.size() - 1);
         long $$2 = $$0 - $$1;
         aws.a $$3 = this.f();
         $$3.c += $$2;
         ++$$3.d;
         $$3.a = Math.max($$3.a, $$2);
         $$3.b = Math.min($$3.b, $$2);
         if (this.n && $$2 > a) {
            c.warn("Something's taking too long! '{}' took aprox {} ms", LogUtils.defer(() -> awy.b(this.k)), LogUtils.defer(() -> (double)$$2 / 1000000.0));
         }

         this.k = this.d.isEmpty() ? "" : (String)this.d.get(this.d.size() - 1);
         this.m = null;
      }
   }

   @Override
   public void b(String $$0) {
      this.c();
      this.a($$0);
   }

   @Override
   public void b(Supplier<String> $$0) {
      this.c();
      this.a($$0);
   }

   private aws.a f() {
      if (this.m == null) {
         this.m = (aws.a)this.f.computeIfAbsent(this.k, $$0 -> new aws.a());
      }

      return this.m;
   }

   @Override
   public void a(String $$0, int $$1) {
      this.f().e.addTo($$0, (long)$$1);
   }

   @Override
   public void a(Supplier<String> $$0, int $$1) {
      this.f().e.addTo((String)$$0.get(), (long)$$1);
   }

   @Override
   public awy d() {
      return new awv(this.f, this.i, this.j, this.h.getAsLong(), this.g.getAsInt());
   }

   @Nullable
   @Override
   public aws.a c(String $$0) {
      return (aws.a)this.f.get($$0);
   }

   @Override
   public Set<Pair<String, ayd>> e() {
      return this.o;
   }

   public static class a implements axa {
      long a = Long.MIN_VALUE;
      long b = Long.MAX_VALUE;
      long c;
      long d;
      final Object2LongOpenHashMap<String> e = new Object2LongOpenHashMap();

      @Override
      public long a() {
         return this.c;
      }

      @Override
      public long b() {
         return this.a;
      }

      @Override
      public long c() {
         return this.d;
      }

      @Override
      public Object2LongMap<String> d() {
         return Object2LongMaps.unmodifiable(this.e);
      }
   }
}
