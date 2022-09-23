import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.LongSerializationPolicy;
import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;

public class axq {
   private static final String b = "bytesPerSecond";
   private static final String c = "count";
   private static final String d = "durationNanosTotal";
   private static final String e = "totalBytes";
   private static final String f = "countPerSecond";
   final Gson a = new GsonBuilder().setPrettyPrinting().setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).create();

   public String a(axo $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("startedEpoch", $$0.c().toEpochMilli());
      $$1.addProperty("endedEpoch", $$0.d().toEpochMilli());
      $$1.addProperty("durationMs", $$0.e().toMillis());
      Duration $$2 = $$0.f();
      if ($$2 != null) {
         $$1.addProperty("worldGenDurationMs", $$2.toMillis());
      }

      $$1.add("heap", this.a($$0.i()));
      $$1.add("cpuPercent", this.c($$0.h()));
      $$1.add("network", this.c($$0));
      $$1.add("fileIO", this.b($$0));
      $$1.add("serverTick", this.b($$0.g()));
      $$1.add("threadAllocation", this.a($$0.j()));
      $$1.add("chunkGen", this.a($$0.a()));
      return this.a.toJson($$1);
   }

   private JsonElement a(axv.a $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("allocationRateBytesPerSecond", $$0.e());
      $$1.addProperty("gcCount", $$0.d());
      $$1.addProperty("gcOverHeadPercent", $$0.a());
      $$1.addProperty("gcTotalDurationMs", $$0.c().toMillis());
      return $$1;
   }

   private JsonElement a(List<Pair<cxn, ayb<axs>>> $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("durationNanosTotal", $$0.stream().mapToDouble($$0x -> (double)((ayb)$$0x.getSecond()).f().toNanos()).sum());
      JsonArray $$2 = ad.a(new JsonArray(), $$1x -> $$1.add("status", $$1x));

      for(Pair<cxn, ayb<axs>> $$3 : $$0) {
         ayb<axs> $$4 = (ayb)$$3.getSecond();
         JsonObject $$5 = ad.a(new JsonObject(), $$2::add);
         $$5.addProperty("state", ((cxn)$$3.getFirst()).d());
         $$5.addProperty("count", $$4.d());
         $$5.addProperty("durationNanosTotal", $$4.f().toNanos());
         $$5.addProperty("durationNanosAvg", $$4.f().toNanos() / (long)$$4.d());
         JsonObject $$6 = ad.a(new JsonObject(), $$1x -> $$5.add("durationNanosPercentiles", $$1x));
         $$4.e().forEach(($$1x, $$2x) -> $$6.addProperty("p" + $$1x, $$2x));
         Function<axs, JsonElement> $$7 = $$0x -> {
            JsonObject $$1x = new JsonObject();
            $$1x.addProperty("durationNanos", $$0x.a().toNanos());
            $$1x.addProperty("level", $$0x.e());
            $$1x.addProperty("chunkPosX", $$0x.b().e);
            $$1x.addProperty("chunkPosZ", $$0x.b().f);
            $$1x.addProperty("worldPosX", $$0x.c().c());
            $$1x.addProperty("worldPosZ", $$0x.c().d());
            return $$1x;
         };
         $$5.add("fastest", (JsonElement)$$7.apply($$4.a()));
         $$5.add("slowest", (JsonElement)$$7.apply($$4.b()));
         $$5.add("secondSlowest", (JsonElement)($$4.c() != null ? (JsonElement)$$7.apply($$4.c()) : JsonNull.INSTANCE));
      }

      return $$1;
   }

   private JsonElement a(axx.a $$0) {
      JsonArray $$1 = new JsonArray();
      $$0.a().forEach(($$1x, $$2) -> $$1.add(ad.a(new JsonObject(), $$2x -> {
            $$2x.addProperty("thread", $$1x);
            $$2x.addProperty("bytesPerSecond", $$2);
         })));
      return $$1;
   }

   private JsonElement b(List<axy> $$0) {
      if ($$0.isEmpty()) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$1 = new JsonObject();
         double[] $$2 = $$0.stream().mapToDouble($$0x -> (double)$$0x.b().toNanos() / 1000000.0).toArray();
         DoubleSummaryStatistics $$3 = DoubleStream.of($$2).summaryStatistics();
         $$1.addProperty("minMs", $$3.getMin());
         $$1.addProperty("averageMs", $$3.getAverage());
         $$1.addProperty("maxMs", $$3.getMax());
         Map<Integer, Double> $$4 = axg.a($$2);
         $$4.forEach(($$1x, $$2x) -> $$1.addProperty("p" + $$1x, $$2x));
         return $$1;
      }
   }

   private JsonElement b(axo $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("write", this.a($$0.m()));
      $$1.add("read", this.a($$0.n()));
      return $$1;
   }

   private JsonElement a(axu.a $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("totalBytes", $$0.a());
      $$1.addProperty("count", $$0.c());
      $$1.addProperty("bytesPerSecond", $$0.b());
      $$1.addProperty("countPerSecond", $$0.d());
      JsonArray $$2 = new JsonArray();
      $$1.add("topContributors", $$2);
      $$0.f().forEach($$1x -> {
         JsonObject $$2x = new JsonObject();
         $$2.add($$2x);
         $$2x.addProperty("path", (String)$$1x.getFirst());
         $$2x.addProperty("totalBytes", (Number)$$1x.getSecond());
      });
      return $$1;
   }

   private JsonElement c(axo $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.add("sent", this.a($$0.l()));
      $$1.add("received", this.a($$0.k()));
      return $$1;
   }

   private JsonElement a(axw $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("totalBytes", $$0.d());
      $$1.addProperty("count", $$0.c());
      $$1.addProperty("bytesPerSecond", $$0.b());
      $$1.addProperty("countPerSecond", $$0.a());
      JsonArray $$2 = new JsonArray();
      $$1.add("topContributors", $$2);
      $$0.e().forEach($$1x -> {
         JsonObject $$2x = new JsonObject();
         $$2.add($$2x);
         axw.b $$3 = (axw.b)$$1x.getFirst();
         axw.a $$4 = (axw.a)$$1x.getSecond();
         $$2x.addProperty("protocolId", $$3.c());
         $$2x.addProperty("packetId", $$3.d());
         $$2x.addProperty("packetName", $$3.a());
         $$2x.addProperty("totalBytes", $$4.b());
         $$2x.addProperty("count", $$4.a());
      });
      return $$1;
   }

   private JsonElement c(List<axt> $$0) {
      JsonObject $$1 = new JsonObject();
      BiFunction<List<axt>, ToDoubleFunction<axt>, JsonObject> $$2 = ($$0x, $$1x) -> {
         JsonObject $$2x = new JsonObject();
         DoubleSummaryStatistics $$3 = $$0x.stream().mapToDouble($$1x).summaryStatistics();
         $$2x.addProperty("min", $$3.getMin());
         $$2x.addProperty("average", $$3.getAverage());
         $$2x.addProperty("max", $$3.getMax());
         return $$2x;
      };
      $$1.add("jvm", (JsonElement)$$2.apply($$0, axt::a));
      $$1.add("userJvm", (JsonElement)$$2.apply($$0, axt::b));
      $$1.add("system", (JsonElement)$$2.apply($$0, axt::c));
      return $$1;
   }
}
