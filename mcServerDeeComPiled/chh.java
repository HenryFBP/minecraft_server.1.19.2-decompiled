import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class chh {
   private final Long2ObjectMap<List<agh>> a = new Long2ObjectOpenHashMap();
   private final Map<agh, chh.a> b = Maps.newHashMap();
   private final aft c;

   public chh(aft $$0) {
      this.c = $$0;
   }

   private List<agh> a(cge $$0) {
      return (List<agh>)this.a.computeIfAbsent($$0.a(), $$1 -> this.c.e($$0));
   }

   public void a(cge $$0, bcf $$1) {
      for(agh $$2 : this.a($$0)) {
         ((chh.a)this.b.computeIfAbsent($$2, $$0x -> new chh.a())).a($$1);
      }

   }

   public boolean a(bcf $$0, cge $$1) {
      for(agh $$2 : this.a($$1)) {
         chh.a $$3 = (chh.a)this.b.get($$2);
         if ($$3 == null || $$3.b($$0)) {
            return true;
         }
      }

      return false;
   }

   static class a {
      private final Object2IntMap<bcf> a = new Object2IntOpenHashMap(bcf.values().length);

      public void a(bcf $$0) {
         this.a.computeInt($$0, ($$0x, $$1) -> $$1 == null ? 1 : $$1 + 1);
      }

      public boolean b(bcf $$0) {
         return this.a.getOrDefault($$0, 0) < $$0.b();
      }
   }
}
