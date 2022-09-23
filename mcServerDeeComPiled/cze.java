import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cze<T extends czc> {
   private static final Logger a = LogUtils.getLogger();
   private final Int2ObjectMap<T> b = new Int2ObjectLinkedOpenHashMap();
   private final Map<UUID, T> c = Maps.newHashMap();

   public <U extends T> void a(czj<T, U> $$0, Consumer<U> $$1) {
      ObjectIterator var3 = this.b.values().iterator();

      while(var3.hasNext()) {
         T $$2 = (T)var3.next();
         U $$3 = (U)$$0.a($$2);
         if ($$3 != null) {
            $$1.accept($$3);
         }
      }

   }

   public Iterable<T> a() {
      return Iterables.unmodifiableIterable(this.b.values());
   }

   public void a(T $$0) {
      UUID $$1 = $$0.co();
      if (this.c.containsKey($$1)) {
         a.warn("Duplicate entity UUID {}: {}", $$1, $$0);
      } else {
         this.c.put($$1, $$0);
         this.b.put($$0.ae(), $$0);
      }
   }

   public void b(T $$0) {
      this.c.remove($$0.co());
      this.b.remove($$0.ae());
   }

   @Nullable
   public T a(int $$0) {
      return (T)this.b.get($$0);
   }

   @Nullable
   public T a(UUID $$0) {
      return (T)this.c.get($$0);
   }

   public int b() {
      return this.c.size();
   }
}
