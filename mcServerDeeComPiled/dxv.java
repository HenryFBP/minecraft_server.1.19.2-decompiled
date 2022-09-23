import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dxv<T> implements dyb<T>, dyd<T> {
   private final Queue<dya<T>> a = new PriorityQueue(dya.a);
   @Nullable
   private List<dxz<T>> b;
   private final Set<dya<?>> c = new ObjectOpenCustomHashSet(dya.c);
   @Nullable
   private BiConsumer<dxv<T>, dya<T>> d;

   public dxv() {
   }

   public dxv(List<dxz<T>> $$0) {
      this.b = $$0;

      for(dxz<T> $$1 : $$0) {
         this.c.add(dya.a($$1.a(), $$1.b()));
      }

   }

   public void a(@Nullable BiConsumer<dxv<T>, dya<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public dya<T> b() {
      return (dya<T>)this.a.peek();
   }

   @Nullable
   public dya<T> c() {
      dya<T> $$0 = (dya)this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(dya<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }

   }

   private void b(dya<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }

   }

   @Override
   public boolean a(gt $$0, T $$1) {
      return this.c.contains(dya.a($$1, $$0));
   }

   public void a(Predicate<dya<T>> $$0) {
      Iterator<dya<T>> $$1 = this.a.iterator();

      while($$1.hasNext()) {
         dya<T> $$2 = (dya)$$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }

   }

   public Stream<dya<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public pp a(long $$0, Function<T, String> $$1) {
      pp $$2 = new pp();
      if (this.b != null) {
         for(dxz<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for(dya<T> $$4 : this.a) {
         $$2.add(dxz.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for(dxz<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> dxv<T> a(pp $$0, Function<String, Optional<T>> $$1, cge $$2) {
      Builder<dxz<T>> $$3 = ImmutableList.builder();
      dxz.a($$0, $$1, $$2, $$3::add);
      return new dxv<>($$3.build());
   }
}
