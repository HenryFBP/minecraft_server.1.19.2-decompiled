import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import jdk.jfr.consumer.RecordedEvent;

public final class axw {
   private final axw.a a;
   private final List<Pair<axw.b, axw.a>> b;
   private final Duration c;

   public axw(Duration $$0, List<Pair<axw.b, axw.a>> $$1) {
      this.c = $$0;
      this.a = (axw.a)$$1.stream().map(Pair::getSecond).reduce(axw.a::a).orElseGet(() -> new axw.a(0L, 0L));
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, axw.a.c)).limit(10L).toList();
   }

   public double a() {
      return (double)this.a.a / (double)this.c.getSeconds();
   }

   public double b() {
      return (double)this.a.b / (double)this.c.getSeconds();
   }

   public long c() {
      return this.a.a;
   }

   public long d() {
      return this.a.b;
   }

   public List<Pair<axw.b, axw.a>> e() {
      return this.b;
   }

   public static record a(long a, long b) {
      final long a;
      final long b;
      static final Comparator<axw.a> c = Comparator.comparing(axw.a::b).thenComparing(axw.a::a).reversed();

      axw.a a(axw.a $$0) {
         return new axw.a(this.a + $$0.a, this.b + $$0.b);
      }
   }

   public static record b(td a, int b, int c) {
      private static final Map<axw.b, String> d;

      public String a() {
         return (String)d.getOrDefault(this, "unknown");
      }

      public static axw.b a(RecordedEvent $$0) {
         return new axw.b($$0.getEventType().getName().equals("minecraft.PacketSent") ? td.b : td.a, $$0.getInt("protocolId"), $$0.getInt("packetId"));
      }

      public td b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      static {
         Builder<axw.b, String> $$0 = ImmutableMap.builder();

         for(qw $$1 : qw.values()) {
            for(td $$2 : td.values()) {
               Int2ObjectMap<Class<? extends tc<?>>> $$3 = $$1.a($$2);
               $$3.forEach(($$3x, $$4) -> $$0.put(new axw.b($$2, $$1.a(), $$3x), $$4.getSimpleName()));
            }
         }

         d = $$0.build();
      }
   }
}
