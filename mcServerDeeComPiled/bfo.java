import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class bfo extends bdo<bcc> {
   private static final int a = 40;
   private static final int d = 5;
   private static final int e = 20;
   private static final int f = 4;
   private final float g;
   private final Long2LongMap h = new Long2LongOpenHashMap();
   private int i;
   private long j;

   public bfo(float $$0) {
      super(ImmutableMap.of(bku.m, bkv.b, bku.b, bkv.b));
      this.g = $$0;
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      if ($$0.U() - this.j < 20L) {
         return false;
      } else {
         bcl $$2 = (bcl)$$1;
         bms $$3 = $$0.x();
         Optional<gt> $$4 = $$3.d($$0x -> $$0x.a(bmw.n), $$1.da(), 48, bms.b.c);
         return $$4.isPresent() && !(((gt)$$4.get()).j($$2.da()) <= 4.0);
      }
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      this.i = 0;
      this.j = $$0.U() + (long)$$0.r_().a(20);
      bcl $$3 = (bcl)$$1;
      bms $$4 = $$0.x();
      Predicate<gt> $$5 = $$0x -> {
         long $$1x = $$0x.a();
         if (this.h.containsKey($$1x)) {
            return false;
         } else if (++this.i >= 5) {
            return false;
         } else {
            this.h.put($$1x, this.j + 40L);
            return true;
         }
      };
      Set<Pair<hc<bmv>, gt>> $$6 = (Set)$$4.b($$0x -> $$0x.a(bmw.n), $$5, $$1.da(), 48, bms.b.c).collect(Collectors.toSet());
      dql $$7 = bdh.a($$3, $$6);
      if ($$7 != null && $$7.j()) {
         gt $$8 = $$7.m();
         Optional<hc<bmv>> $$9 = $$4.c($$8);
         if ($$9.isPresent()) {
            $$1.dy().a(bku.m, new bkx($$8, this.g, 1));
            xl.c($$0, $$8);
         }
      } else if (this.i < 5) {
         this.h.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.j);
      }

   }
}
