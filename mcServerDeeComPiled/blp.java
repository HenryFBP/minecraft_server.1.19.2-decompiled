import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class blp extends bly<bce> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public blp() {
      super(20);
   }

   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.w);
   }

   protected void a(agg $$0, bce $$1) {
      if ($$1.y_()) {
         this.f = 0;
         this.g = $$0.U() + (long)$$0.r_().a(20);
         bms $$2 = $$0.x();
         Predicate<gt> $$3 = $$0x -> {
            long $$1x = $$0x.a();
            if (this.e.containsKey($$1x)) {
               return false;
            } else if (++this.f >= 5) {
               return false;
            } else {
               this.e.put($$1x, this.g + 40L);
               return true;
            }
         };
         Set<Pair<hc<bmv>, gt>> $$4 = (Set)$$2.b($$0x -> $$0x.a(bmw.n), $$3, $$1.da(), 48, bms.b.c).collect(Collectors.toSet());
         dql $$5 = bdh.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            gt $$6 = $$5.m();
            Optional<hc<bmv>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dy().a(bku.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }

      }
   }
}
