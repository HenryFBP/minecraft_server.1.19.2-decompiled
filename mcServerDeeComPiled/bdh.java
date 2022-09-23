import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bdh extends bdo<bcl> {
   private static final int d = 5;
   private static final int e = 20;
   public static final int a = 48;
   private final Predicate<hc<bmv>> f;
   private final bku<hb> g;
   private final boolean h;
   private final Optional<Byte> i;
   private long j;
   private final Long2ObjectMap<bdh.a> k = new Long2ObjectOpenHashMap();

   public bdh(Predicate<hc<bmv>> $$0, bku<hb> $$1, bku<hb> $$2, boolean $$3, Optional<Byte> $$4) {
      super(a($$1, $$2));
      this.f = $$0;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
   }

   public bdh(Predicate<hc<bmv>> $$0, bku<hb> $$1, boolean $$2, Optional<Byte> $$3) {
      this($$0, $$1, $$1, $$2, $$3);
   }

   private static ImmutableMap<bku<?>, bkv> a(bku<hb> $$0, bku<hb> $$1) {
      Builder<bku<?>, bkv> $$2 = ImmutableMap.builder();
      $$2.put($$0, bkv.b);
      if ($$1 != $$0) {
         $$2.put($$1, bkv.b);
      }

      return $$2.build();
   }

   protected boolean a(agg $$0, bcl $$1) {
      if (this.h && $$1.y_()) {
         return false;
      } else if (this.j == 0L) {
         this.j = $$1.s.U() + (long)$$0.w.a(20);
         return false;
      } else {
         return $$0.U() >= this.j;
      }
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      this.j = $$2 + 20L + (long)$$0.r_().a(20);
      bms $$3 = $$0.x();
      this.k.long2ObjectEntrySet().removeIf($$1x -> !((bdh.a)$$1x.getValue()).b($$2));
      Predicate<gt> $$4 = $$1x -> {
         bdh.a $$2x = (bdh.a)this.k.get($$1x.a());
         if ($$2x == null) {
            return true;
         } else if (!$$2x.c($$2)) {
            return false;
         } else {
            $$2x.a($$2);
            return true;
         }
      };
      Set<Pair<hc<bmv>, gt>> $$5 = (Set)$$3.c(this.f, $$4, $$1.da(), 48, bms.b.a).limit(5L).collect(Collectors.toSet());
      dql $$6 = a($$1, $$5);
      if ($$6 != null && $$6.j()) {
         gt $$7 = $$6.m();
         $$3.c($$7).ifPresent($$4x -> {
            $$3.a(this.f, ($$1xx, $$2xx) -> $$2xx.equals($$7), $$7, 1);
            $$1.dy().a(this.g, hb.a($$0.ab(), $$7));
            this.i.ifPresent($$2xx -> $$0.a($$1, $$2xx));
            this.k.clear();
            xl.c($$0, $$7);
         });
      } else {
         for(Pair<hc<bmv>, gt> $$8 : $$5) {
            this.k.computeIfAbsent(((gt)$$8.getSecond()).a(), $$2x -> new bdh.a($$1.s.w, $$2));
         }
      }

   }

   @Nullable
   public static dql a(bce $$0, Set<Pair<hc<bmv>, gt>> $$1) {
      if ($$1.isEmpty()) {
         return null;
      } else {
         Set<gt> $$2 = new HashSet();
         int $$3 = 1;

         for(Pair<hc<bmv>, gt> $$4 : $$1) {
            $$3 = Math.max($$3, ((bmv)((hc)$$4.getFirst()).a()).c());
            $$2.add((gt)$$4.getSecond());
         }

         return $$0.D().a($$2, $$3);
      }
   }

   static class a {
      private static final int a = 40;
      private static final int b = 80;
      private static final int c = 400;
      private final amn d;
      private long e;
      private long f;
      private int g;

      a(amn $$0, long $$1) {
         this.d = $$0;
         this.a($$1);
      }

      public void a(long $$0) {
         this.e = $$0;
         int $$1 = this.g + this.d.a(40) + 40;
         this.g = Math.min($$1, 400);
         this.f = $$0 + (long)this.g;
      }

      public boolean b(long $$0) {
         return $$0 - this.e < 400L;
      }

      public boolean c(long $$0) {
         return $$0 >= this.f;
      }

      public String toString() {
         return "RetryMarker{, previousAttemptAt=" + this.e + ", nextScheduledAttemptAt=" + this.f + ", currentDelay=" + this.g + "}";
      }
   }
}
