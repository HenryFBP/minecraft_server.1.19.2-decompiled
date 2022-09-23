import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

public class axn {
   private Instant a = Instant.EPOCH;
   private Instant b = Instant.EPOCH;
   private final List<axs> c = Lists.newArrayList();
   private final List<axt> d = Lists.newArrayList();
   private final Map<axw.b, axn.a> e = Maps.newHashMap();
   private final Map<axw.b, axn.a> f = Maps.newHashMap();
   private final List<axu> g = Lists.newArrayList();
   private final List<axu> h = Lists.newArrayList();
   private int i;
   private Duration j = Duration.ZERO;
   private final List<axv> k = Lists.newArrayList();
   private final List<axx> l = Lists.newArrayList();
   private final List<axy> m = Lists.newArrayList();
   @Nullable
   private Duration n = null;

   private axn(Stream<RecordedEvent> $$0) {
      this.a($$0);
   }

   public static axo a(Path $$0) {
      try {
         final RecordingFile $$1 = new RecordingFile($$0);

         axo var4;
         try {
            Iterator<RecordedEvent> $$2 = new Iterator<RecordedEvent>() {
               public boolean hasNext() {
                  return $$1.hasMoreEvents();
               }

               public RecordedEvent a() {
                  if (!this.hasNext()) {
                     throw new NoSuchElementException();
                  } else {
                     try {
                        return $$1.readEvent();
                     } catch (IOException var2) {
                        throw new UncheckedIOException(var2);
                     }
                  }
               }
            };
            Stream<RecordedEvent> $$3 = StreamSupport.stream(Spliterators.spliteratorUnknownSize($$2, 1297), false);
            var4 = new axn($$3).a();
         } catch (Throwable var6) {
            try {
               $$1.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         $$1.close();
         return var4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private axo a() {
      Duration $$0 = Duration.between(this.a, this.b);
      return new axo(
         this.a,
         this.b,
         $$0,
         this.n,
         this.m,
         this.d,
         axv.a($$0, this.k, this.j, this.i),
         axx.a(this.l),
         a($$0, this.e),
         a($$0, this.f),
         axu.a($$0, this.g),
         axu.a($$0, this.h),
         this.c
      );
   }

   private void a(Stream<RecordedEvent> $$0) {
      $$0.forEach($$0x -> {
         if ($$0x.getEndTime().isAfter(this.b) || this.b.equals(Instant.EPOCH)) {
            this.b = $$0x.getEndTime();
         }

         if ($$0x.getStartTime().isBefore(this.a) || this.a.equals(Instant.EPOCH)) {
            this.a = $$0x.getStartTime();
         }

         String var2 = $$0x.getEventType().getName();
         switch(var2) {
            case "minecraft.ChunkGeneration":
               this.c.add(axs.a($$0x));
               break;
            case "minecraft.LoadWorld":
               this.n = $$0x.getDuration();
               break;
            case "minecraft.ServerTickTime":
               this.m.add(axy.a($$0x));
               break;
            case "minecraft.PacketReceived":
               this.a($$0x, $$0x.getInt("bytes"), this.e);
               break;
            case "minecraft.PacketSent":
               this.a($$0x, $$0x.getInt("bytes"), this.f);
               break;
            case "jdk.ThreadAllocationStatistics":
               this.l.add(axx.a($$0x));
               break;
            case "jdk.GCHeapSummary":
               this.k.add(axv.a($$0x));
               break;
            case "jdk.CPULoad":
               this.d.add(axt.a($$0x));
               break;
            case "jdk.FileWrite":
               this.a($$0x, this.g, "bytesWritten");
               break;
            case "jdk.FileRead":
               this.a($$0x, this.h, "bytesRead");
               break;
            case "jdk.GarbageCollection":
               ++this.i;
               this.j = this.j.plus($$0x.getDuration());
         }

      });
   }

   private void a(RecordedEvent $$0, int $$1, Map<axw.b, axn.a> $$2) {
      ((axn.a)$$2.computeIfAbsent(axw.b.a($$0), $$0x -> new axn.a())).a($$1);
   }

   private void a(RecordedEvent $$0, List<axu> $$1, String $$2) {
      $$1.add(new axu($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
   }

   private static axw a(Duration $$0, Map<axw.b, axn.a> $$1) {
      List<Pair<axw.b, axw.a>> $$2 = $$1.entrySet().stream().map($$0x -> Pair.of((axw.b)$$0x.getKey(), ((axn.a)$$0x.getValue()).a())).toList();
      return new axw($$0, $$2);
   }

   public static final class a {
      private long a;
      private long b;

      public void a(int $$0) {
         this.b += (long)$$0;
         ++this.a;
      }

      public axw.a a() {
         return new axw.a(this.a, this.b);
      }
   }
}
