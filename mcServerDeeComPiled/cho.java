import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cho {
   private final cgy a;
   private final dbm b;
   private final dlc c;

   public cho(cgy $$0, dbm $$1, dlc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cho a(agn $$0) {
      if ($$0.D() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.D() + ", region: " + $$0);
      } else {
         return new cho($$0, this.b, this.c);
      }
   }

   public List<dlj> a(cge $$0, Predicate<dlb> $$1) {
      Map<dlb, LongSet> $$2 = this.a.a($$0.e, $$0.f, cxn.e).h();
      Builder<dlj> $$3 = ImmutableList.builder();

      for(Entry<dlb, LongSet> $$4 : $$2.entrySet()) {
         dlb $$5 = (dlb)$$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, (LongSet)$$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dlj> a(hq $$0, dlb $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), cxn.e).b($$1);
      Builder<dlj> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dlb $$0, LongSet $$1, Consumer<dlj> $$2) {
      LongIterator var4 = $$1.iterator();

      while(var4.hasNext()) {
         long $$3 = var4.next();
         hq $$4 = hq.a(new cge($$3), this.a.aj());
         dlj $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), cxn.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }

   }

   @Nullable
   public dlj a(hq $$0, dlb $$1, cye $$2) {
      return $$2.a($$1);
   }

   public void a(hq $$0, dlb $$1, dlj $$2, cye $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hq $$0, dlb $$1, long $$2, cye $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.b();
   }

   public dlj a(gt $$0, dlb $$1) {
      for(dlj $$2 : this.a(hq.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dlj.b;
   }

   public dlj a(gt $$0, aba<dlb> $$1) {
      dlb $$2 = this.b().d(hm.aN).a($$1);
      return $$2 == null ? dlj.b : this.b($$0, $$2);
   }

   public dlj a(gt $$0, akz<dlb> $$1) {
      hm<dlb> $$2 = this.b().d(hm.aN);

      for(dlj $$3 : this.a(new cge($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dlj.b;
   }

   public dlj b(gt $$0, dlb $$1) {
      for(dlj $$2 : this.a(hq.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dlj.b;
   }

   public boolean a(gt $$0, dlj $$1) {
      for(dlf $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gt $$0) {
      hq $$1 = hq.a($$0);
      return this.a.a($$1.a(), $$1.c(), cxn.e).w();
   }

   public Map<dlb, LongSet> b(gt $$0) {
      hq $$1 = hq.a($$0);
      return this.a.a($$1.a(), $$1.c(), cxn.e).h();
   }

   public dld a(cge $$0, dlb $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dlj $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public hn b() {
      return this.a.s();
   }
}
