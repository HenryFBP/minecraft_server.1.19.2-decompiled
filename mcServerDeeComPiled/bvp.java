import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class bvp {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final bvp c = a("empty").a(0, bvn.b).a();
   public static final bvp d = a("simple").a(5000, bvn.c).a(11000, bvn.e).a();
   public static final bvp e = a("villager_baby").a(10, bvn.b).a(3000, bvn.d).a(6000, bvn.b).a(10000, bvn.d).a(12000, bvn.e).a();
   public static final bvp f = a("villager_default").a(10, bvn.b).a(2000, bvn.c).a(9000, bvn.f).a(11000, bvn.b).a(12000, bvn.e).a();
   private final Map<bvn, bvr> g = Maps.newHashMap();

   protected static bvq a(String $$0) {
      bvp $$1 = hm.a(hm.at, $$0, new bvp());
      return new bvq($$1);
   }

   protected void a(bvn $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new bvr());
      }

   }

   protected bvr b(bvn $$0) {
      return (bvr)this.g.get($$0);
   }

   protected List<bvr> c(bvn $$0) {
      return (List<bvr>)this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public bvn a(int $$0) {
      return (bvn)this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)((bvr)$$1.getValue()).a($$0))).map(Entry::getKey).orElse(bvn.b);
   }
}
