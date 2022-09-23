import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class drf extends drb {
   public static final String a = "idcounts";
   private final Object2IntMap<String> b = new Object2IntOpenHashMap();

   public drf() {
      this.b.defaultReturnValue(-1);
   }

   public static drf b(pj $$0) {
      drf $$1 = new drf();

      for(String $$2 : $$0.d()) {
         if ($$0.b($$2, 99)) {
            $$1.b.put($$2, $$0.h($$2));
         }
      }

      return $$1;
   }

   @Override
   public pj a(pj $$0) {
      ObjectIterator var2 = this.b.object2IntEntrySet().iterator();

      while(var2.hasNext()) {
         Entry<String> $$1 = (Entry)var2.next();
         $$0.a((String)$$1.getKey(), $$1.getIntValue());
      }

      return $$0;
   }

   public int a() {
      int $$0 = this.b.getInt("map") + 1;
      this.b.put("map", $$0);
      this.b();
      return $$0;
   }
}
