import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;

public class czu implements czw {
   private final List<czx> b = Lists.newArrayList();
   private final Set<czx> c = Sets.newHashSet();
   private final List<czx> d = Lists.newArrayList();
   private boolean e;
   private final agg f;

   public czu(agg $$0) {
      this.f = $$0;
   }

   @Override
   public boolean a() {
      return this.b.isEmpty();
   }

   @Override
   public void a(czx $$0) {
      if (this.e) {
         this.d.add($$0);
      } else {
         this.b.add($$0);
      }

      xl.a(this.f, $$0);
   }

   @Override
   public void b(czx $$0) {
      if (this.e) {
         this.c.add($$0);
      } else {
         this.b.remove($$0);
      }

   }

   @Override
   public boolean a(czv $$0, dwq $$1, czv.a $$2, BiConsumer<czx, dwq> $$3) {
      this.e = true;
      boolean $$4 = false;

      try {
         Iterator<czx> $$5 = this.b.iterator();

         while($$5.hasNext()) {
            czx $$6 = (czx)$$5.next();
            if (this.c.remove($$6)) {
               $$5.remove();
            } else {
               Optional<dwq> $$7 = a(this.f, $$1, $$6);
               if ($$7.isPresent()) {
                  $$3.accept($$6, (dwq)$$7.get());
                  $$4 = true;
               }
            }
         }
      } finally {
         this.e = false;
      }

      if (!this.d.isEmpty()) {
         this.b.addAll(this.d);
         this.d.clear();
      }

      if (!this.c.isEmpty()) {
         this.b.removeAll(this.c);
         this.c.clear();
      }

      return $$4;
   }

   private static Optional<dwq> a(agg $$0, dwq $$1, czx $$2) {
      Optional<dwq> $$3 = $$2.a().a($$0);
      if ($$3.isEmpty()) {
         return Optional.empty();
      } else {
         double $$4 = ((dwq)$$3.get()).g($$1);
         int $$5 = $$2.b() * $$2.b();
         return $$4 > (double)$$5 ? Optional.empty() : $$3;
      }
   }
}
