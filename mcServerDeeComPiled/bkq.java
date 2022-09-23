import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bkq {
   public static final int a = 2;
   private final Map<UUID, bkq.a> b = Maps.newHashMap();

   @ang
   public Map<UUID, Object2IntMap<bkr>> a() {
      Map<UUID, Object2IntMap<bkr>> $$0 = Maps.newHashMap();
      this.b.keySet().forEach($$1 -> {
         bkq.a $$2 = (bkq.a)this.b.get($$1);
         $$0.put($$1, $$2.a);
      });
      return $$0;
   }

   public void b() {
      Iterator<bkq.a> $$0 = this.b.values().iterator();

      while($$0.hasNext()) {
         bkq.a $$1 = (bkq.a)$$0.next();
         $$1.a();
         if ($$1.b()) {
            $$0.remove();
         }
      }

   }

   private Stream<bkq.b> c() {
      return this.b.entrySet().stream().flatMap($$0 -> ((bkq.a)$$0.getValue()).a((UUID)$$0.getKey()));
   }

   private Collection<bkq.b> a(amn $$0, int $$1) {
      List<bkq.b> $$2 = (List)this.c().collect(Collectors.toList());
      if ($$2.isEmpty()) {
         return Collections.emptyList();
      } else {
         int[] $$3 = new int[$$2.size()];
         int $$4 = 0;

         for(int $$5 = 0; $$5 < $$2.size(); ++$$5) {
            bkq.b $$6 = (bkq.b)$$2.get($$5);
            $$4 += Math.abs($$6.a());
            $$3[$$5] = $$4 - 1;
         }

         Set<bkq.b> $$7 = Sets.newIdentityHashSet();

         for(int $$8 = 0; $$8 < $$1; ++$$8) {
            int $$9 = $$0.a($$4);
            int $$10 = Arrays.binarySearch($$3, $$9);
            $$7.add((bkq.b)$$2.get($$10 < 0 ? -$$10 - 1 : $$10));
         }

         return $$7;
      }
   }

   private bkq.a a(UUID $$0) {
      return (bkq.a)this.b.computeIfAbsent($$0, $$0x -> new bkq.a());
   }

   public void a(bkq $$0, amn $$1, int $$2) {
      Collection<bkq.b> $$3 = $$0.a($$1, $$2);
      $$3.forEach($$0x -> {
         int $$1x = $$0x.f - $$0x.e.m;
         if ($$1x >= 2) {
            this.a($$0x.d).a.mergeInt($$0x.e, $$1x, bkq::a);
         }

      });
   }

   public int a(UUID $$0, Predicate<bkr> $$1) {
      bkq.a $$2 = (bkq.a)this.b.get($$0);
      return $$2 != null ? $$2.a($$1) : 0;
   }

   public long a(bkr $$0, DoublePredicate $$1) {
      return this.b.values().stream().filter($$2 -> $$1.test((double)($$2.a.getOrDefault($$0, 0) * $$0.j))).count();
   }

   public void a(UUID $$0, bkr $$1, int $$2) {
      bkq.a $$3 = this.a($$0);
      $$3.a.mergeInt($$1, $$2, ($$1x, $$2x) -> this.a($$1, $$1x, $$2x));
      $$3.a($$1);
      if ($$3.b()) {
         this.b.remove($$0);
      }

   }

   public void b(UUID $$0, bkr $$1, int $$2) {
      this.a($$0, $$1, -$$2);
   }

   public void a(UUID $$0, bkr $$1) {
      bkq.a $$2 = (bkq.a)this.b.get($$0);
      if ($$2 != null) {
         $$2.b($$1);
         if ($$2.b()) {
            this.b.remove($$0);
         }
      }

   }

   public void a(bkr $$0) {
      Iterator<bkq.a> $$1 = this.b.values().iterator();

      while($$1.hasNext()) {
         bkq.a $$2 = (bkq.a)$$1.next();
         $$2.b($$0);
         if ($$2.b()) {
            $$1.remove();
         }
      }

   }

   public <T> Dynamic<T> a(DynamicOps<T> $$0) {
      return new Dynamic($$0, $$0.createList(this.c().map($$1 -> $$1.a($$0)).map(Dynamic::getValue)));
   }

   public void a(Dynamic<?> $$0) {
      $$0.asStream().map(bkq.b::a).flatMap($$0x -> $$0x.result().stream()).forEach($$0x -> this.a($$0x.d).a.put($$0x.e, $$0x.f));
   }

   private static int a(int $$0, int $$1) {
      return Math.max($$0, $$1);
   }

   private int a(bkr $$0, int $$1, int $$2) {
      int $$3 = $$1 + $$2;
      return $$3 > $$0.k ? Math.max($$0.k, $$1) : $$3;
   }

   static class a {
      final Object2IntMap<bkr> a = new Object2IntOpenHashMap();

      public int a(Predicate<bkr> $$0) {
         return this.a
            .object2IntEntrySet()
            .stream()
            .filter($$1 -> $$0.test((bkr)$$1.getKey()))
            .mapToInt($$0x -> $$0x.getIntValue() * ((bkr)$$0x.getKey()).j)
            .sum();
      }

      public Stream<bkq.b> a(UUID $$0) {
         return this.a.object2IntEntrySet().stream().map($$1 -> new bkq.b($$0, (bkr)$$1.getKey(), $$1.getIntValue()));
      }

      public void a() {
         ObjectIterator<Entry<bkr>> $$0 = this.a.object2IntEntrySet().iterator();

         while($$0.hasNext()) {
            Entry<bkr> $$1 = (Entry)$$0.next();
            int $$2 = $$1.getIntValue() - ((bkr)$$1.getKey()).l;
            if ($$2 < 2) {
               $$0.remove();
            } else {
               $$1.setValue($$2);
            }
         }

      }

      public boolean b() {
         return this.a.isEmpty();
      }

      public void a(bkr $$0) {
         int $$1 = this.a.getInt($$0);
         if ($$1 > $$0.k) {
            this.a.put($$0, $$0.k);
         }

         if ($$1 < 2) {
            this.b($$0);
         }

      }

      public void b(bkr $$0) {
         this.a.removeInt($$0);
      }
   }

   static class b {
      public static final String a = "Target";
      public static final String b = "Type";
      public static final String c = "Value";
      public final UUID d;
      public final bkr e;
      public final int f;

      public b(UUID $$0, bkr $$1, int $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public int a() {
         return this.f * this.e.j;
      }

      public String toString() {
         return "GossipEntry{target=" + this.d + ", type=" + this.e + ", value=" + this.f + "}";
      }

      public <T> Dynamic<T> a(DynamicOps<T> $$0) {
         return new Dynamic(
            $$0,
            $$0.createMap(
               ImmutableMap.of(
                  $$0.createString("Target"),
                  hr.a.encodeStart($$0, this.d).result().orElseThrow(RuntimeException::new),
                  $$0.createString("Type"),
                  $$0.createString(this.e.i),
                  $$0.createString("Value"),
                  $$0.createInt(this.f)
               )
            )
         );
      }

      public static DataResult<bkq.b> a(Dynamic<?> $$0) {
         return DataResult.unbox(
            DataResult.instance()
               .group($$0.get("Target").read(hr.a), $$0.get("Type").asString().map(bkr::a), $$0.get("Value").asNumber().map(Number::intValue))
               .apply(DataResult.instance(), bkq.b::new)
         );
      }
   }
}
