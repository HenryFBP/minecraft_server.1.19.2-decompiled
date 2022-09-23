import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bfa extends bdo<bcl> {
   private static final int a = 20;
   private static final int d = 8;
   private static final float e = 0.6F;
   private static final float f = 0.6F;
   private static final int g = 5;
   private static final int h = 10;

   public bfa() {
      super(ImmutableMap.of(bku.i, bkv.a, bku.m, bkv.b, bku.n, bkv.c, bku.q, bkv.c));
   }

   protected boolean a(agg $$0, bcl $$1) {
      return $$0.r_().a(10) == 0 && this.e($$1);
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      bcc $$3 = this.b((bcc)$$1);
      if ($$3 != null) {
         this.a($$0, $$1, $$3);
      } else {
         Optional<bcc> $$4 = this.b($$1);
         if ($$4.isPresent()) {
            a($$1, (bcc)$$4.get());
         } else {
            this.a($$1).ifPresent($$1x -> a($$1, $$1x));
         }
      }
   }

   private void a(agg $$0, bcl $$1, bcc $$2) {
      for(int $$3 = 0; $$3 < 10; ++$$3) {
         dwq $$4 = bmm.a($$1, 20, 8);
         if ($$4 != null && $$0.b(new gt($$4))) {
            $$1.dy().a(bku.m, new bkx($$4, 0.6F, 0));
            return;
         }
      }

   }

   private static void a(bcl $$0, bcc $$1) {
      bcx<?> $$2 = $$0.dy();
      $$2.a(bku.q, $$1);
      $$2.a(bku.n, new bdy($$1, true));
      $$2.a(bku.m, new bkx(new bdy($$1, false), 0.6F, 1));
   }

   private Optional<bcc> a(bcl $$0) {
      return this.d($$0).stream().findAny();
   }

   private Optional<bcc> b(bcl $$0) {
      Map<bcc, Integer> $$1 = this.c($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> $$0x.getValue() > 0 && $$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private Map<bcc, Integer> c(bcl $$0) {
      Map<bcc, Integer> $$1 = Maps.newHashMap();
      this.d($$0).stream().filter(this::c).forEach($$1x -> $$1.compute(this.a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private List<bcc> d(bcl $$0) {
      return (List<bcc>)$$0.dy().c(bku.i).get();
   }

   private bcc a(bcc $$0) {
      return (bcc)$$0.dy().c(bku.q).get();
   }

   @Nullable
   private bcc b(bcc $$0) {
      return (bcc)((List)$$0.dy().c(bku.i).get()).stream().filter($$1 -> this.a($$0, $$1)).findAny().orElse(null);
   }

   private boolean c(bcc $$0) {
      return $$0.dy().c(bku.q).isPresent();
   }

   private boolean a(bcc $$0, bcc $$1) {
      return $$1.dy().c(bku.q).filter($$1x -> $$1x == $$0).isPresent();
   }

   private boolean e(bcl $$0) {
      return $$0.dy().a(bku.i);
   }
}
