import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class bcx<E extends bcc> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<bcx<E>>> b;
   private static final int c = 20;
   private final Map<bku<?>, Optional<? extends bkt<?>>> d = Maps.newHashMap();
   private final Map<blz<? extends bly<? super E>>, bly<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<bvn, Set<bdo<? super E>>>> f = Maps.newTreeMap();
   private bvp g = bvp.c;
   private final Map<bvn, Set<Pair<bku<?>, bkv>>> h = Maps.newHashMap();
   private final Map<bvn, Set<bku<?>>> i = Maps.newHashMap();
   private Set<bvn> j = Sets.newHashSet();
   private final Set<bvn> k = Sets.newHashSet();
   private bvn l = bvn.b;
   private long m = -9999L;

   public static <E extends bcc> bcx.b<E> a(Collection<? extends bku<?>> $$0, Collection<? extends blz<? extends bly<? super E>>> $$1) {
      return new bcx.b<>($$0, $$1);
   }

   public static <E extends bcc> Codec<bcx<E>> b(final Collection<? extends bku<?>> $$0, final Collection<? extends blz<? extends bly<? super E>>> $$1) {
      final MutableObject<Codec<bcx<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<bcx<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> hm.ar.b($$0xx)).stream()).map($$1xx -> $$0.createString($$1xx.toString()));
               }
      
               public <T> DataResult<bcx<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<bcx.a<?>>>> $$2 = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<bku<?>> $$3x = hm.ar.p().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends bcx.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<bcx.a<?>> $$3 = (ImmutableList)((DataResult)$$2.getValue())
                     .resultOrPartial(bcx.a::error)
                     .map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new bcx($$0, $$1, $$3, $$2::getValue));
               }
      
               private <T, U> DataResult<bcx.a<U>> a(bku<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return ((DataResult)$$0.a().map(DataResult::success).orElseGet(() -> DataResult.error("No codec for memory: " + $$0)))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new bcx.a<>($$0, Optional.of($$1xxx)));
               }
      
               public <T> RecordBuilder<T> a(bcx<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.i().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<bcx<E>>)$$2.getValue();
   }

   public bcx(
      Collection<? extends bku<?>> $$0, Collection<? extends blz<? extends bly<? super E>>> $$1, ImmutableList<bcx.a<?>> $$2, Supplier<Codec<bcx<E>>> $$3
   ) {
      this.b = $$3;

      for(bku<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for(blz<? extends bly<? super E>> $$5 : $$1) {
         this.e.put($$5, $$5.a());
      }

      for(bly<? super E> $$6 : this.e.values()) {
         for(bku<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while(var11.hasNext()) {
         bcx.a<?> $$8 = (bcx.a)var11.next();
         $$8.a(this);
      }

   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return ((Codec)this.b.get()).encodeStart($$0, this);
   }

   Stream<bcx.a<?>> i() {
      return this.d.entrySet().stream().map($$0 -> bcx.a.a((bku)$$0.getKey(), (Optional<? extends bkt<?>>)$$0.getValue()));
   }

   public boolean a(bku<?> $$0) {
      return this.a($$0, bkv.a);
   }

   public <U> void b(bku<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(bku<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(bku<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(bkt.a($$1, $$2)));
   }

   public <U> void a(bku<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(bkt::a));
   }

   <U> void b(bku<U> $$0, Optional<? extends bkt<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a(((bkt)$$1.get()).c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }

   }

   public <U> Optional<U> c(bku<U> $$0) {
      Optional<? extends bkt<?>> $$1 = (Optional)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(bkt::c);
      }
   }

   public <U> long d(bku<U> $$0) {
      Optional<? extends bkt<?>> $$1 = (Optional)this.d.get($$0);
      return $$1.map(bkt::b).orElse(0L);
   }

   @Deprecated
   @ang
   public Map<bku<?>, Optional<? extends bkt<?>>> a() {
      return this.d;
   }

   public <U> boolean b(bku<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(bku<?> $$0, bkv $$1) {
      Optional<? extends bkt<?>> $$2 = (Optional)this.d.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         return $$1 == bkv.c || $$1 == bkv.a && $$2.isPresent() || $$1 == bkv.b && !$$2.isPresent();
      }
   }

   public bvp b() {
      return this.g;
   }

   public void a(bvp $$0) {
      this.g = $$0;
   }

   public void a(Set<bvn> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @ang
   public Set<bvn> c() {
      return this.k;
   }

   @Deprecated
   @ang
   public List<bdo<? super E>> d() {
      List<bdo<? super E>> $$0 = new ObjectArrayList();

      for(Map<bvn, Set<bdo<? super E>>> $$1 : this.f.values()) {
         for(Set<bdo<? super E>> $$2 : $$1.values()) {
            for(bdo<? super E> $$3 : $$2) {
               if ($$3.a() == bdo.a.b) {
                  $$0.add($$3);
               }
            }
         }
      }

      return $$0;
   }

   public void e() {
      this.d(this.l);
   }

   public Optional<bvn> f() {
      for(bvn $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(bvn $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.e();
      }

   }

   private void d(bvn $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(bvn $$0) {
      for(bvn $$1 : this.k) {
         if ($$1 != $$0) {
            Set<bku<?>> $$2 = (Set)this.i.get($$1);
            if ($$2 != null) {
               for(bku<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }

   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         bvn $$2 = this.b().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }

   }

   public void a(List<bvn> $$0) {
      for(bvn $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }

   }

   public void b(bvn $$0) {
      this.l = $$0;
   }

   public void a(bvn $$0, int $$1, ImmutableList<? extends bdo<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(bvn $$0, int $$1, ImmutableList<? extends bdo<? super E>> $$2, bku<?> $$3) {
      Set<Pair<bku<?>, bkv>> $$4 = ImmutableSet.of(Pair.of($$3, bkv.a));
      Set<bku<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(bvn $$0, ImmutableList<? extends Pair<Integer, ? extends bdo<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(bvn $$0, ImmutableList<? extends Pair<Integer, ? extends bdo<? super E>>> $$1, Set<Pair<bku<?>, bkv>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(bvn $$0, ImmutableList<? extends Pair<Integer, ? extends bdo<? super E>>> $$1, Set<Pair<bku<?>, bkv>> $$2, Set<bku<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while(var5.hasNext()) {
         Pair<Integer, ? extends bdo<? super E>> $$4 = (Pair)var5.next();
         ((Set)((Map)this.f.computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())).computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet()))
            .add((bdo)$$4.getSecond());
      }

   }

   @VisibleForTesting
   public void g() {
      this.f.clear();
   }

   public boolean c(bvn $$0) {
      return this.k.contains($$0);
   }

   public bcx<E> h() {
      bcx<E> $$0 = new bcx<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for(Entry<bku<?>, Optional<? extends bkt<?>>> $$1 : this.d.entrySet()) {
         bku<?> $$2 = (bku)$$1.getKey();
         if (((Optional)$$1.getValue()).isPresent()) {
            $$0.d.put($$2, (Optional)$$1.getValue());
         }
      }

      return $$0;
   }

   public void a(agg $$0, E $$1) {
      this.j();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(agg $$0, E $$1) {
      for(bly<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }

   }

   private void j() {
      for(Entry<bku<?>, Optional<? extends bkt<?>>> $$0 : this.d.entrySet()) {
         if (((Optional)$$0.getValue()).isPresent()) {
            bkt<?> $$1 = (bkt)((Optional)$$0.getValue()).get();
            if ($$1.d()) {
               this.b((bku)$$0.getKey());
            }

            $$1.a();
         }
      }

   }

   public void b(agg $$0, E $$1) {
      long $$2 = $$1.s.U();

      for(bdo<? super E> $$3 : this.d()) {
         $$3.g($$0, $$1, $$2);
      }

   }

   private void d(agg $$0, E $$1) {
      long $$2 = $$0.U();

      for(Map<bvn, Set<bdo<? super E>>> $$3 : this.f.values()) {
         for(Entry<bvn, Set<bdo<? super E>>> $$4 : $$3.entrySet()) {
            bvn $$5 = (bvn)$$4.getKey();
            if (this.k.contains($$5)) {
               for(bdo<? super E> $$7 : (Set)$$4.getValue()) {
                  if ($$7.a() == bdo.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }

   }

   private void e(agg $$0, E $$1) {
      long $$2 = $$0.U();

      for(bdo<? super E> $$3 : this.d()) {
         $$3.f($$0, $$1, $$2);
      }

   }

   private boolean f(bvn $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for(Pair<bku<?>, bkv> $$1 : (Set)this.h.get($$0)) {
            bku<?> $$2 = (bku)$$1.getFirst();
            bkv $$3 = (bkv)$$1.getSecond();
            if (!this.a($$2, $$3)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(Object $$0) {
      return $$0 instanceof Collection && ((Collection)$$0).isEmpty();
   }

   ImmutableList<? extends Pair<Integer, ? extends bdo<? super E>>> a(int $$0, ImmutableList<? extends bdo<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends bdo<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while(var5.hasNext()) {
         bdo<? super E> $$4 = (bdo)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final bku<U> a;
      private final Optional<? extends bkt<U>> b;

      static <U> bcx.a<U> a(bku<U> $$0, Optional<? extends bkt<?>> $$1) {
         return new bcx.a<>($$0, $$1);
      }

      a(bku<U> $$0, Optional<? extends bkt<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(bcx<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(hm.ar.p().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends bcc> {
      private final Collection<? extends bku<?>> a;
      private final Collection<? extends blz<? extends bly<? super E>>> b;
      private final Codec<bcx<E>> c;

      b(Collection<? extends bku<?>> $$0, Collection<? extends blz<? extends bly<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = bcx.b($$0, $$1);
      }

      public bcx<E> a(Dynamic<?> $$0) {
         return (bcx<E>)this.c.parse($$0).resultOrPartial(bcx.a::error).orElseGet(() -> new bcx(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
