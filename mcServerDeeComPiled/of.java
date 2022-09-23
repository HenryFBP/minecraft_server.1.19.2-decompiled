import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class of {
   private static final Logger a = LogUtils.getLogger();
   private final gt b;
   final agg c;
   private final op d;
   private final int e;
   private final List<oj> f;
   private final List<Pair<oe, Collection<oj>>> g;
   private final gt.a h;

   public of(Collection<oe> $$0, gt $$1, cpw $$2, agg $$3, op $$4, int $$5) {
      this.h = $$1.i();
      this.b = $$1;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
      this.g = (List)$$0.stream().map($$2x -> {
         Collection<oj> $$3x = (Collection)$$2x.b().stream().map($$2xx -> new oj($$2xx, $$2, $$3)).collect(ImmutableList.toImmutableList());
         return Pair.of($$2x, $$3x);
      }).collect(ImmutableList.toImmutableList());
      this.f = (List)this.g.stream().flatMap($$0x -> ((Collection)$$0x.getSecond()).stream()).collect(ImmutableList.toImmutableList());
   }

   public List<oj> a() {
      return this.f;
   }

   public void b() {
      this.a(0);
   }

   void a(final int $$0) {
      if ($$0 < this.g.size()) {
         Pair<oe, Collection<oj>> $$1 = (Pair)this.g.get($$0);
         final oe $$2 = (oe)$$1.getFirst();
         Collection<oj> $$3 = (Collection)$$1.getSecond();
         Map<oj, gt> $$4 = this.a($$3);
         String $$5 = $$2.a();
         a.info("Running test batch '{}' ({} tests)...", $$5, $$3.size());
         $$2.a(this.c);
         final ou $$6 = new ou();
         $$3.forEach($$6::a);
         $$6.a(new ok() {
            private void a() {
               if ($$6.i()) {
                  $$2.b(of.this.c);
                  of.this.a($$0 + 1);
               }

            }

            @Override
            public void a(oj $$0x) {
            }

            @Override
            public void b(oj $$0x) {
               this.a();
            }

            @Override
            public void c(oj $$0x) {
               this.a();
            }
         });
         $$3.forEach($$1x -> {
            gt $$2x = (gt)$$4.get($$1x);
            om.a($$1x, $$2x, this.d);
         });
      }
   }

   private Map<oj, gt> a(Collection<oj> $$0) {
      Map<oj, gt> $$1 = Maps.newHashMap();
      int $$2 = 0;
      dwl $$3 = new dwl(this.h);

      for(oj $$4 : $$0) {
         gt $$5 = new gt(this.h);
         cuo $$6 = ow.a($$4.t(), $$5, $$4.u(), 2, this.c, true);
         dwl $$7 = ow.a($$6);
         $$4.a($$6.p());
         $$1.put($$4, new gt(this.h));
         $$3 = $$3.b($$7);
         this.h.e((int)$$7.b() + 5, 0, 0);
         if ($$2++ % this.e == this.e - 1) {
            this.h.e(0, 0, (int)$$3.d() + 6);
            this.h.p(this.b.u());
            $$3 = new dwl(this.h);
         }
      }

      return $$1;
   }
}
