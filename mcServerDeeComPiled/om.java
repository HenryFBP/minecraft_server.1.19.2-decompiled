import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class om {
   private static final int e = 100;
   public static final int a = 2;
   public static final int b = 5;
   public static final int c = 6;
   public static final int d = 8;

   public static void a(oj $$0, gt $$1, op $$2) {
      $$0.a();
      $$2.a($$0);
      $$0.a(new ov($$0, $$2, $$1));
      $$0.a($$1, 2);
   }

   public static Collection<oj> a(Collection<oe> $$0, gt $$1, cpw $$2, agg $$3, op $$4, int $$5) {
      of $$6 = new of($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.b();
      return $$6.a();
   }

   public static Collection<oj> b(Collection<pa> $$0, gt $$1, cpw $$2, agg $$3, op $$4, int $$5) {
      return a(a($$0), $$1, $$2, $$3, $$4, $$5);
   }

   public static Collection<oe> a(Collection<pa> $$0) {
      Map<String, List<pa>> $$1 = (Map)$$0.stream().collect(Collectors.groupingBy(pa::e));
      return (Collection<oe>)$$1.entrySet().stream().flatMap($$0x -> {
         String $$1x = (String)$$0x.getKey();
         Consumer<agg> $$2 = ol.c($$1x);
         Consumer<agg> $$3 = ol.d($$1x);
         MutableInt $$4 = new MutableInt();
         Collection<pa> $$5 = (Collection)$$0x.getValue();
         return Streams.stream(Iterables.partition($$5, 100)).map($$4x -> new oe($$1x + ":" + $$4.incrementAndGet(), ImmutableList.copyOf($$4x), $$2, $$3));
      }).collect(ImmutableList.toImmutableList());
   }

   public static void a(agg $$0, gt $$1, op $$2, int $$3) {
      $$2.a();
      gt $$4 = $$1.b(-$$3, 0, -$$3);
      gt $$5 = $$1.b($$3, 0, $$3);
      gt.b($$4, $$5).filter($$1x -> $$0.a_($$1x).a(cju.nL)).forEach($$1x -> {
         cuo $$2x = (cuo)$$0.c_($$1x);
         gt $$3x = $$2x.p();
         dkt $$4x = ow.b($$2x);
         ow.a($$4x, $$3x.v(), $$0);
      });
   }

   public static void a(agg $$0) {
      xl.a($$0);
   }
}
