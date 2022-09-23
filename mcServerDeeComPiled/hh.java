import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class hh<T> extends ht<T> {
   private static final Logger bR = LogUtils.getLogger();
   private final ObjectList<hc.c<T>> bS = new ObjectArrayList(256);
   private final Object2IntMap<T> bT = ad.a(new Object2IntOpenCustomHashMap(ad.l()), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<abb, hc.c<T>> bU = new HashMap();
   private final Map<aba<T>, hc.c<T>> bV = new HashMap();
   private final Map<T, hc.c<T>> bW = new IdentityHashMap();
   private final Map<T, Lifecycle> bX = new IdentityHashMap();
   private Lifecycle bY;
   private volatile Map<akz<T>, he.c<T>> bZ = new IdentityHashMap();
   private boolean ca;
   @Nullable
   private final Function<T, hc.c<T>> cb;
   @Nullable
   private Map<T, hc.c<T>> cc;
   @Nullable
   private List<hc.c<T>> cd;
   private int ce;

   public hh(aba<? extends hm<T>> $$0, Lifecycle $$1, @Nullable Function<T, hc.c<T>> $$2) {
      super($$0, $$1);
      this.bY = $$1;
      this.cb = $$2;
      if ($$2 != null) {
         this.cc = new IdentityHashMap();
      }

   }

   private List<hc.c<T>> a() {
      if (this.cd == null) {
         this.cd = this.bS.stream().filter(Objects::nonNull).toList();
      }

      return this.cd;
   }

   private void i(aba<T> $$0) {
      if (this.ca) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public hc<T> a(int $$0, aba<T> $$1, T $$2, Lifecycle $$3) {
      return this.a($$0, $$1, $$2, $$3, true);
   }

   private hc<T> a(int $$0, aba<T> $$1, T $$2, Lifecycle $$3, boolean $$4) {
      this.i($$1);
      Validate.notNull($$1);
      Validate.notNull($$2);
      this.bS.size(Math.max(this.bS.size(), $$0 + 1));
      this.bT.put($$2, $$0);
      this.cd = null;
      if ($$4 && this.bV.containsKey($$1)) {
         ad.a("Adding duplicate key '" + $$1 + "' to registry");
      }

      if (this.bW.containsKey($$2)) {
         ad.a("Adding duplicate value '" + $$2 + "' to registry");
      }

      this.bX.put($$2, $$3);
      this.bY = this.bY.add($$3);
      if (this.ce <= $$0) {
         this.ce = $$0 + 1;
      }

      hc.c<T> $$5;
      if (this.cb != null) {
         $$5 = (hc.c)this.cb.apply($$2);
         hc.c<T> $$6 = (hc.c)this.bV.put($$1, $$5);
         if ($$6 != null && $$6 != $$5) {
            throw new IllegalStateException("Invalid holder present for key " + $$1);
         }
      } else {
         $$5 = (hc.c)this.bV.computeIfAbsent($$1, $$0x -> hc.c.a(this, $$0x));
      }

      this.bU.put($$1.a(), $$5);
      this.bW.put($$2, $$5);
      $$5.a($$1, $$2);
      this.bS.set($$0, $$5);
      return $$5;
   }

   @Override
   public hc<T> a(aba<T> $$0, T $$1, Lifecycle $$2) {
      return this.a(this.ce, $$0, $$1, $$2);
   }

   @Override
   public hc<T> a(OptionalInt $$0, aba<T> $$1, T $$2, Lifecycle $$3) {
      this.i($$1);
      Validate.notNull($$1);
      Validate.notNull($$2);
      hc<T> $$4 = (hc)this.bV.get($$1);
      T $$5 = $$4 != null && $$4.b() ? $$4.a() : null;
      int $$6;
      if ($$5 == null) {
         $$6 = $$0.orElse(this.ce);
      } else {
         $$6 = this.bT.getInt($$5);
         if ($$0.isPresent() && $$0.getAsInt() != $$6) {
            throw new IllegalStateException("ID mismatch");
         }

         this.bX.remove($$5);
         this.bT.removeInt($$5);
         this.bW.remove($$5);
      }

      return this.a($$6, $$1, $$2, $$3, false);
   }

   @Nullable
   @Override
   public abb b(T $$0) {
      hc.c<T> $$1 = (hc.c)this.bW.get($$0);
      return $$1 != null ? $$1.g().a() : null;
   }

   @Override
   public Optional<aba<T>> c(T $$0) {
      return Optional.ofNullable((hc.c)this.bW.get($$0)).map(hc.c::g);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.bT.getInt($$0);
   }

   @Nullable
   @Override
   public T a(@Nullable aba<T> $$0) {
      return a((hc.c<T>)this.bV.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return $$0 >= 0 && $$0 < this.bS.size() ? a((hc.c<T>)this.bS.get($$0)) : null;
   }

   @Override
   public Optional<hc<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.bS.size() ? Optional.ofNullable((hc)this.bS.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<hc<T>> b(aba<T> $$0) {
      return Optional.ofNullable((hc)this.bV.get($$0));
   }

   @Override
   public hc<T> c(aba<T> $$0) {
      return (hc<T>)this.bV.computeIfAbsent($$0, $$0x -> {
         if (this.cb != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.i($$0x);
            return hc.c.a(this, $$0x);
         }
      });
   }

   @Override
   public DataResult<hc<T>> d(aba<T> $$0) {
      hc.c<T> $$1 = (hc.c)this.bV.get($$0);
      if ($$1 == null) {
         if (this.cb != null) {
            return DataResult.error("This registry can't create new holders without value (requested key: " + $$0 + ")");
         }

         if (this.ca) {
            return DataResult.error("Registry is already frozen (requested key: " + $$0 + ")");
         }

         $$1 = hc.c.a(this, $$0);
         this.bV.put($$0, $$1);
      }

      return DataResult.success($$1);
   }

   @Override
   public int b() {
      return this.bV.size();
   }

   @Override
   public Lifecycle d(T $$0) {
      return (Lifecycle)this.bX.get($$0);
   }

   @Override
   public Lifecycle c() {
      return this.bY;
   }

   public Iterator<T> iterator() {
      return Iterators.transform(this.a().iterator(), hc::a);
   }

   @Nullable
   @Override
   public T a(@Nullable abb $$0) {
      hc.c<T> $$1 = (hc.c)this.bU.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable hc.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<abb> d() {
      return Collections.unmodifiableSet(this.bU.keySet());
   }

   @Override
   public Set<aba<T>> e() {
      return Collections.unmodifiableSet(this.bV.keySet());
   }

   @Override
   public Set<Entry<aba<T>, T>> f() {
      return Collections.unmodifiableSet(Maps.transformValues(this.bV, hc::a).entrySet());
   }

   @Override
   public Stream<hc.c<T>> g() {
      return this.a().stream();
   }

   @Override
   public boolean a(akz<T> $$0) {
      return this.bZ.containsKey($$0);
   }

   @Override
   public Stream<Pair<akz<T>, he.c<T>>> h() {
      return this.bZ.entrySet().stream().map($$0 -> Pair.of((akz)$$0.getKey(), (he.c)$$0.getValue()));
   }

   @Override
   public he.c<T> b(akz<T> $$0) {
      he.c<T> $$1 = (he.c)this.bZ.get($$0);
      if ($$1 == null) {
         $$1 = this.e($$0);
         Map<akz<T>, he.c<T>> $$2 = new IdentityHashMap(this.bZ);
         $$2.put($$0, $$1);
         this.bZ = $$2;
      }

      return $$1;
   }

   private he.c<T> e(akz<T> $$0) {
      return new he.c<>(this, $$0);
   }

   @Override
   public Stream<akz<T>> i() {
      return this.bZ.keySet().stream();
   }

   @Override
   public boolean j() {
      return this.bV.isEmpty();
   }

   @Override
   public Optional<hc<T>> a(amn $$0) {
      return ad.b(this.a(), $$0).map(hc::a);
   }

   @Override
   public boolean c(abb $$0) {
      return this.bU.containsKey($$0);
   }

   @Override
   public boolean e(aba<T> $$0) {
      return this.bV.containsKey($$0);
   }

   @Override
   public hm<T> k() {
      this.ca = true;
      List<abb> $$0 = this.bV.entrySet().stream().filter($$0x -> !((hc.c)$$0x.getValue()).b()).map($$0x -> ((aba)$$0x.getKey()).a()).sorted().toList();
      if (!$$0.isEmpty()) {
         throw new IllegalStateException("Unbound values in registry " + this.n() + ": " + $$0);
      } else {
         if (this.cc != null) {
            List<hc.c<T>> $$1 = this.cc.values().stream().filter($$0x -> !$$0x.b()).toList();
            if (!$$1.isEmpty()) {
               throw new IllegalStateException("Some intrusive holders were not added to registry: " + $$1);
            }

            this.cc = null;
         }

         return this;
      }
   }

   @Override
   public hc.c<T> e(T $$0) {
      if (this.cb == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else if (!this.ca && this.cc != null) {
         return (hc.c<T>)this.cc.computeIfAbsent($$0, $$0x -> hc.c.a(this, (T)$$0x));
      } else {
         throw new IllegalStateException("Registry is already frozen");
      }
   }

   @Override
   public Optional<he.c<T>> c(akz<T> $$0) {
      return Optional.ofNullable((he.c)this.bZ.get($$0));
   }

   @Override
   public void a(Map<akz<T>, List<hc<T>>> $$0) {
      Map<hc.c<T>, List<akz<T>>> $$1 = new IdentityHashMap();
      this.bV.values().forEach($$1x -> $$1.put($$1x, new ArrayList()));
      $$0.forEach(($$1x, $$2x) -> {
         for(hc<T> $$3x : $$2x) {
            if (!$$3x.a(this)) {
               throw new IllegalStateException("Can't create named set " + $$1x + " containing value " + $$3x + " from outside registry " + this);
            }

            if (!($$3x instanceof hc.c)) {
               throw new IllegalStateException("Found direct holder " + $$3x + " value in tag " + $$1x);
            }

            hc.c<T> $$4 = (hc.c)$$3x;
            ((List)$$1.get($$4)).add($$1x);
         }

      });
      Set<akz<T>> $$2 = Sets.difference(this.bZ.keySet(), $$0.keySet());
      if (!$$2.isEmpty()) {
         bR.warn(
            "Not all defined tags for registry {} are present in data pack: {}",
            this.n(),
            $$2.stream().map($$0x -> $$0x.b().toString()).sorted().collect(Collectors.joining(", "))
         );
      }

      Map<akz<T>, he.c<T>> $$3 = new IdentityHashMap(this.bZ);
      $$0.forEach(($$1x, $$2x) -> ((he.c)$$3.computeIfAbsent($$1x, this::e)).b($$2x));
      $$1.forEach(hc.c::a);
      this.bZ = $$3;
   }

   @Override
   public void l() {
      this.bZ.values().forEach($$0 -> $$0.b(List.of()));
      this.bV.values().forEach($$0 -> $$0.a(Set.of()));
   }
}
