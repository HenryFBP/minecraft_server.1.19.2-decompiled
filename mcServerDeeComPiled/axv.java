import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;

public record axv(Instant a, long b, axv.b c) {
   public static axv a(RecordedEvent $$0) {
      return new axv($$0.getStartTime(), $$0.getLong("heapUsed"), $$0.getString("when").equalsIgnoreCase("before gc") ? axv.b.a : axv.b.b);
   }

   public static axv.a a(Duration $$0, List<axv> $$1, Duration $$2, int $$3) {
      return new axv.a($$0, $$2, $$3, a($$1));
   }

   private static double a(List<axv> $$0) {
      long $$1 = 0L;
      Map<axv.b, List<axv>> $$2 = (Map)$$0.stream().collect(Collectors.groupingBy($$0x -> $$0x.c));
      List<axv> $$3 = (List)$$2.get(axv.b.a);
      List<axv> $$4 = (List)$$2.get(axv.b.b);

      for(int $$5 = 1; $$5 < $$3.size(); ++$$5) {
         axv $$6 = (axv)$$3.get($$5);
         axv $$7 = (axv)$$4.get($$5 - 1);
         $$1 += $$6.b - $$7.b;
      }

      Duration $$8 = Duration.between(((axv)$$0.get(1)).a, ((axv)$$0.get($$0.size() - 1)).a);
      return (double)$$1 / (double)$$8.getSeconds();
   }

   public static record a(Duration a, Duration b, int c, double d) {
      public float a() {
         return (float)this.b.toMillis() / (float)this.a.toMillis();
      }

      public Duration b() {
         return this.a;
      }

      public Duration c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      public double e() {
         return this.d;
      }
   }

   static enum b {
      a,
      b;
   }
}
