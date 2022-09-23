import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

public class akf<T> implements Iterable<akd<T>> {
   private final hm<T> a;
   private final Map<T, akd<T>> b = new IdentityHashMap();
   @Nullable
   private rq c;

   public akf(hm<T> $$0) {
      this.a = $$0;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public akd<T> a(T $$0, ake $$1) {
      return (akd<T>)this.b.computeIfAbsent($$0, $$1x -> new akd<>(this, (T)$$1x, $$1));
   }

   public hm<T> a() {
      return this.a;
   }

   public Iterator<akd<T>> iterator() {
      return this.b.values().iterator();
   }

   public akd<T> b(T $$0) {
      return this.a($$0, ake.b);
   }

   public String b() {
      return "stat_type." + hm.an.b(this).toString().replace(':', '.');
   }

   public rq c() {
      if (this.c == null) {
         this.c = rq.c(this.b());
      }

      return this.c;
   }
}
