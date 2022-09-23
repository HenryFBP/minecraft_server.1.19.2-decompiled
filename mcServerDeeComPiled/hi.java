import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class hi<E> extends AbstractList<E> {
   private final List<E> a;
   @Nullable
   private final E b;

   public static <E> hi<E> a() {
      return new hi<>(Lists.newArrayList(), (E)null);
   }

   public static <E> hi<E> a(int $$0) {
      return new hi<>(Lists.newArrayListWithCapacity($$0), (E)null);
   }

   public static <E> hi<E> a(int $$0, E $$1) {
      Validate.notNull($$1);
      Object[] $$2 = new Object[$$0];
      Arrays.fill($$2, $$1);
      return new hi<>(Arrays.asList($$2), $$1);
   }

   @SafeVarargs
   public static <E> hi<E> a(E $$0, E... $$1) {
      return new hi<>(Arrays.asList($$1), $$0);
   }

   protected hi(List<E> $$0, @Nullable E $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nonnull
   public E get(int $$0) {
      return (E)this.a.get($$0);
   }

   public E set(int $$0, E $$1) {
      Validate.notNull($$1);
      return (E)this.a.set($$0, $$1);
   }

   public void add(int $$0, E $$1) {
      Validate.notNull($$1);
      this.a.add($$0, $$1);
   }

   public E remove(int $$0) {
      return (E)this.a.remove($$0);
   }

   public int size() {
      return this.a.size();
   }

   public void clear() {
      if (this.b == null) {
         super.clear();
      } else {
         for(int $$0 = 0; $$0 < this.size(); ++$$0) {
            this.set($$0, this.b);
         }
      }

   }
}
