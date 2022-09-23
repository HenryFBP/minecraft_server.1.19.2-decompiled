import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class czi {
   private Int2ObjectMap<bbn> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bbn> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bbn> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while($$1.hasNext()) {
            Entry<bbn> $$0 = (Entry)$$1.next();
            this.b.put($$0.getIntKey(), (bbn)$$0.getValue());
         }

         Int2ObjectMap<bbn> $$1 = this.a;
         this.a = this.b;
         this.b = $$1;
      }

   }

   public void a(bbn $$0) {
      this.a();
      this.a.put($$0.ae(), $$0);
   }

   public void b(bbn $$0) {
      this.a();
      this.a.remove($$0.ae());
   }

   public boolean c(bbn $$0) {
      return this.a.containsKey($$0.ae());
   }

   public void a(Consumer<bbn> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while(var2.hasNext()) {
               bbn $$1 = (bbn)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }

      }
   }
}
