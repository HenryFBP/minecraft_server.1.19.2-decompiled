import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class hg<T> implements hf<T> {
   private int b;
   private final Object2IntMap<T> c;
   private final List<T> d;

   public hg() {
      this(512);
   }

   public hg(int $$0) {
      this.d = Lists.newArrayListWithExpectedSize($$0);
      this.c = new Object2IntOpenCustomHashMap($$0, ad.l());
      this.c.defaultReturnValue(-1);
   }

   public void a(T $$0, int $$1) {
      this.c.put($$0, $$1);

      while(this.d.size() <= $$1) {
         this.d.add(null);
      }

      this.d.set($$1, $$0);
      if (this.b <= $$1) {
         this.b = $$1 + 1;
      }

   }

   public void b(T $$0) {
      this.a($$0, this.b);
   }

   @Override
   public int a(T $$0) {
      return this.c.getInt($$0);
   }

   @Nullable
   @Override
   public final T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.d.size() ? this.d.get($$0) : null);
   }

   public Iterator<T> iterator() {
      return Iterators.filter(this.d.iterator(), Objects::nonNull);
   }

   public boolean c(int $$0) {
      return this.a($$0) != null;
   }

   @Override
   public int b() {
      return this.c.size();
   }
}
