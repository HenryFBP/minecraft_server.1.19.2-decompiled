import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class chu {
   private static final Logger c = LogUtils.getLogger();
   public static final chu a = new chu(ImmutableMap.of(), ImmutableList.of());
   public static final MapCodec<chu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.simpleMap(dan.a.c, dcs.c.promotePartial(ad.a("Carver: ", c::error)), amw.a(dan.a.values())).fieldOf("carvers").forGetter($$0x -> $$0x.d),
               dkg.d.promotePartial(ad.a("Features: ", c::error)).fieldOf("features").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, chu::new)
   );
   private final Map<dan.a, he<dcs<?>>> d;
   private final List<he<dkg>> e;
   private final Supplier<List<ddg<?, ?>>> f;
   private final Supplier<Set<dkg>> g;

   chu(Map<dan.a, he<dcs<?>>> $$0, List<he<dkg>> $$1) {
      this.d = $$0;
      this.e = $$1;
      this.f = Suppliers.memoize(
         () -> (List)$$1.stream().flatMap(he::a).map(hc::a).flatMap(dkg::a).filter($$0xx -> $$0xx.b() == ddt.h).collect(ImmutableList.toImmutableList())
      );
      this.g = Suppliers.memoize(() -> (Set)$$1.stream().flatMap(he::a).map(hc::a).collect(Collectors.toSet()));
   }

   public Iterable<hc<dcs<?>>> a(dan.a $$0) {
      return (Iterable<hc<dcs<?>>>)Objects.requireNonNullElseGet((Iterable)this.d.get($$0), List::of);
   }

   public List<ddg<?, ?>> a() {
      return (List<ddg<?, ?>>)this.f.get();
   }

   public List<he<dkg>> b() {
      return this.e;
   }

   public boolean a(dkg $$0) {
      return ((Set)this.g.get()).contains($$0);
   }

   public static class a {
      private final Map<dan.a, List<hc<dcs<?>>>> a = Maps.newLinkedHashMap();
      private final List<List<hc<dkg>>> b = Lists.newArrayList();

      public chu.a a(dan.b $$0, hc<dkg> $$1) {
         return this.a($$0.ordinal(), $$1);
      }

      public chu.a a(int $$0, hc<dkg> $$1) {
         this.a($$0);
         ((List)this.b.get($$0)).add($$1);
         return this;
      }

      public chu.a a(dan.a $$0, hc<? extends dcs<?>> $$1) {
         ((List)this.a.computeIfAbsent($$0, $$0x -> Lists.newArrayList())).add(hc.a($$1));
         return this;
      }

      private void a(int $$0) {
         while(this.b.size() <= $$0) {
            this.b.add(Lists.newArrayList());
         }

      }

      public chu a() {
         return new chu(
            (Map<dan.a, he<dcs<?>>>)this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> he.a((List)$$0.getValue()))),
            (List<he<dkg>>)this.b.stream().map(he::a).collect(ImmutableList.toImmutableList())
         );
      }
   }
}
