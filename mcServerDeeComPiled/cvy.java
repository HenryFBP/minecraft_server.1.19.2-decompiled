import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvy implements Predicate<cvo> {
   public static final Predicate<cvo> a = $$0 -> true;
   private final cvp<cjt, cvo> b;
   private final Map<cwr<?>, Predicate<Object>> c = Maps.newHashMap();

   private cvy(cvp<cjt, cvo> $$0) {
      this.b = $$0;
   }

   public static cvy a(cjt $$0) {
      return new cvy($$0.k());
   }

   public boolean a(@Nullable cvo $$0) {
      if ($$0 != null && $$0.b().equals(this.b.c())) {
         if (this.c.isEmpty()) {
            return true;
         } else {
            for(Entry<cwr<?>, Predicate<Object>> $$1 : this.c.entrySet()) {
               if (!this.a($$0, (cwr)$$1.getKey(), (Predicate<Object>)$$1.getValue())) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   protected <T extends Comparable<T>> boolean a(cvo $$0, cwr<T> $$1, Predicate<Object> $$2) {
      T $$3 = $$0.c($$1);
      return $$2.test($$3);
   }

   public <V extends Comparable<V>> cvy a(cwr<V> $$0, Predicate<Object> $$1) {
      if (!this.b.d().contains($$0)) {
         throw new IllegalArgumentException(this.b + " cannot support property " + $$0);
      } else {
         this.c.put($$0, $$1);
         return this;
      }
   }
}
