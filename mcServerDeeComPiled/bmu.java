import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class bmu {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<bmt> b = new Short2ObjectOpenHashMap();
   private final Map<hc<bmv>, Set<bmt>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public static Codec<bmu> a(Runnable $$0) {
      return RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     RecordCodecBuilder.point($$0),
                     Codec.BOOL.optionalFieldOf("Valid", false).forGetter($$0xx -> $$0xx.e),
                     bmt.a($$0).listOf().fieldOf("Records").forGetter($$0xx -> ImmutableList.copyOf($$0xx.b.values()))
                  )
                  .apply($$1, bmu::new)
         )
         .orElseGet(ad.a("Failed to read POI section: ", a::error), () -> new bmu($$0, false, ImmutableList.of()));
   }

   public bmu(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   private bmu(Runnable $$0, boolean $$1, List<bmt> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public Stream<bmt> a(Predicate<hc<bmv>> $$0, bms.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((hc)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(gt $$0, hc<bmv> $$1) {
      if (this.a(new bmt($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.e().map($$0x -> $$0x.a().toString()).orElse("[unregistered]"), $$0);
         this.d.run();
      }

   }

   private boolean a(bmt $$0) {
      gt $$1 = $$0.f();
      hc<bmv> $$2 = $$0.g();
      short $$3 = hq.b($$1);
      bmt $$4 = (bmt)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.g())) {
            return false;
         }

         ad.a("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      ((Set)this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet())).add($$0);
      return true;
   }

   public void a(gt $$0) {
      bmt $$1 = (bmt)this.b.remove(hq.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         ((Set)this.c.get($$1.g())).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::g), LogUtils.defer($$1::f));
         this.d.run();
      }
   }

   @Deprecated
   @ang
   public int b(gt $$0) {
      return this.e($$0).map(bmt::a).orElse(0);
   }

   public boolean c(gt $$0) {
      bmt $$1 = (bmt)this.b.get(hq.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ad.c(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.c();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(gt $$0, Predicate<hc<bmv>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<hc<bmv>> d(gt $$0) {
      return this.e($$0).map(bmt::g);
   }

   private Optional<bmt> e(gt $$0) {
      return Optional.ofNullable((bmt)this.b.get(hq.b($$0)));
   }

   public void a(Consumer<BiConsumer<gt, hc<bmv>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<bmt> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.b();
         $$0.accept((BiConsumer)($$1x, $$2) -> {
            short $$3 = hq.b($$1x);
            bmt $$4 = (bmt)$$1.computeIfAbsent($$3, $$2x -> new bmt($$1x, $$2, this.d));
            this.a($$4);
         });
         this.e = true;
         this.d.run();
      }

   }

   private void b() {
      this.b.clear();
      this.c.clear();
   }

   boolean a() {
      return this.e;
   }
}
