import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface hn {
   Logger a = LogUtils.getLogger();
   Map<aba<? extends hm<?>>, hn.c<?>> b = ad.a((Supplier<Map<aba<? extends hm<?>>, hn.c<?>>>)(() -> {
      Builder<aba<? extends hm<?>>, hn.c<?>> $$0 = ImmutableMap.builder();
      a($$0, hm.O, cyu.h, cyu.h);
      a($$0, hm.aR, cht.a, cht.b);
      a($$0, hm.aK, dcs.a);
      a($$0, hm.aL, ddg.a);
      a($$0, hm.aM, dkg.a);
      a($$0, hm.aN, dlb.a);
      a($$0, hm.aO, dlh.a);
      a($$0, hm.aP, dos.m);
      a($$0, hm.aQ, dmk.a);
      a($$0, hm.aJ, daw.a);
      a($$0, hm.aS, dpa.a.a);
      a($$0, hm.aT, dak.b);
      a($$0, hm.bI, rm.a, rm.a);
      a($$0, hm.aU, dkr.a);
      a($$0, hm.aV, djd.a);
      return $$0.build();
   }));
   Codec<hn> c = i();
   Supplier<hn.a> d = Suppliers.memoize(() -> e().f());

   <E> Optional<hm<E>> a(aba<? extends hm<? extends E>> var1);

   default <E> hm<E> b(aba<? extends hm<? extends E>> $$0) {
      return (hm<E>)this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   default <E> Optional<? extends hm<E>> c(aba<? extends hm<? extends E>> $$0) {
      Optional<? extends hm<E>> $$1 = this.a($$0);
      return $$1.isPresent() ? $$1 : hm.d.b($$0.a());
   }

   default <E> hm<E> d(aba<? extends hm<? extends E>> $$0) {
      return (hm<E>)this.c($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   private static <E> void a(Builder<aba<? extends hm<?>>, hn.c<?>> $$0, aba<? extends hm<E>> $$1, Codec<E> $$2) {
      $$0.put($$1, new hn.c<E>($$1, $$2, null));
   }

   private static <E> void a(Builder<aba<? extends hm<?>>, hn.c<?>> $$0, aba<? extends hm<E>> $$1, Codec<E> $$2, Codec<E> $$3) {
      $$0.put($$1, new hn.c<E>($$1, $$2, $$3));
   }

   static Iterable<hn.c<?>> a() {
      return b.values();
   }

   Stream<hn.d<?>> b();

   private static Stream<hn.d<Object>> h() {
      return hm.d.g().map(hn.d::a);
   }

   default Stream<hn.d<?>> c() {
      return Stream.concat(this.b(), h());
   }

   default Stream<hn.d<?>> d() {
      return Stream.concat(this.j(), h());
   }

   private static <E> Codec<hn> i() {
      Codec<aba<? extends hm<E>>> $$0 = abb.a.xmap(aba::a, aba::a);
      Codec<hm<E>> $$1 = $$0.partialDispatch(
         "type", $$0x -> DataResult.success($$0x.n()), $$0x -> f($$0x).map($$1x -> ho.a($$0x, Lifecycle.experimental(), $$1x))
      );
      UnboundedMapCodec<? extends aba<? extends hm<?>>, ? extends hm<?>> $$2 = Codec.unboundedMap($$0, $$1);
      return a($$2);
   }

   private static <K extends aba<? extends hm<?>>, V extends hm<?>> Codec<hn> a(UnboundedMapCodec<K, V> $$0) {
      return $$0.xmap(hn.b::new, $$0x -> (Map)$$0x.j().collect(ImmutableMap.toImmutableMap($$0xx -> $$0xx.a(), $$0xx -> $$0xx.b())));
   }

   private Stream<hn.d<?>> j() {
      return this.b().filter($$0 -> ((hn.c)b.get($$0.a)).a());
   }

   private static <E> DataResult<? extends Codec<E>> f(aba<? extends hm<E>> $$0) {
      return (DataResult<? extends Codec<E>>)Optional.ofNullable((hn.c)b.get($$0))
         .map($$0x -> $$0x.d())
         .map(DataResult::success)
         .orElseGet(() -> DataResult.error("Unknown or not serializable registry: " + $$0));
   }

   private static Map<aba<? extends hm<?>>, ? extends ht<?>> k() {
      return (Map<aba<? extends hm<?>>, ? extends ht<?>>)b.keySet().stream().collect(Collectors.toMap(Function.identity(), hn::e));
   }

   private static hn.e l() {
      return new hn.f(k());
   }

   static hn.a a(final hm<? extends hm<?>> $$0) {
      return new hn.a() {
         @Override
         public <T> Optional<hm<T>> a(aba<? extends hm<? extends T>> $$0x) {
            hm<hm<T>> $$1 = $$0;
            return $$1.f($$0);
         }

         @Override
         public Stream<hn.d<?>> b() {
            return $$0.f().stream().map(hn.d::a);
         }
      };
   }

   static hn.e e() {
      hn.e $$0 = l();
      aaz.b $$1 = new aaz.b();

      for(Entry<aba<? extends hm<?>>, hn.c<?>> $$2 : b.entrySet()) {
         a($$1, (hn.c)$$2.getValue());
      }

      aay.a(JsonOps.INSTANCE, $$0, $$1);
      return $$0;
   }

   private static <E> void a(aaz.b $$0, hn.c<E> $$1) {
      aba<? extends hm<E>> $$2 = $$1.b();
      hm<E> $$3 = iw.q.d($$2);

      for(Entry<aba<E>, E> $$4 : $$3.f()) {
         aba<E> $$5 = (aba)$$4.getKey();
         E $$6 = (E)$$4.getValue();
         $$0.a(iw.q, $$5, $$1.c(), $$3.a($$6), $$6, $$3.d($$6));
      }

   }

   static void a(hn.e $$0, DynamicOps<JsonElement> $$1, aax $$2) {
      aax.a $$3 = $$2.a($$0);

      for(hn.c<?> $$4 : b.values()) {
         a($$1, $$3, $$4);
      }

   }

   private static <E> void a(DynamicOps<JsonElement> $$0, aax.a $$1, hn.c<E> $$2) {
      DataResult<? extends hm<E>> $$3 = $$1.a($$2.b(), $$2.c(), $$0);
      $$3.error().ifPresent($$0x -> {
         throw new JsonParseException("Error loading registry data: " + $$0x.message());
      });
   }

   static hn a(Dynamic<?> $$0) {
      return new hn.b(
         (Map<? extends aba<? extends hm<?>>, ? extends hm<?>>)b.keySet().stream().collect(Collectors.toMap(Function.identity(), $$1 -> a($$1, $$0)))
      );
   }

   static <E> hm<E> a(aba<? extends hm<? extends E>> $$0, Dynamic<?> $$1) {
      return (hm<E>)aay.b($$0)
         .codec()
         .parse($$1)
         .resultOrPartial(ad.a($$0 + " registry: ", a::error))
         .orElseThrow(() -> new IllegalStateException("Failed to get " + $$0 + " registry"));
   }

   static <E> ht<?> e(aba<? extends hm<?>> $$0) {
      return new hh<>($$0, Lifecycle.stable(), null);
   }

   default hn.a f() {
      return new hn.b(this.b().map(hn.d::c));
   }

   default Lifecycle g() {
      return (Lifecycle)this.b().map($$0 -> $$0.b.c()).reduce(Lifecycle.stable(), Lifecycle::add);
   }

   public interface a extends hn {
      @Override
      default hn.a f() {
         return this;
      }
   }

   public static final class b implements hn.a {
      private final Map<? extends aba<? extends hm<?>>, ? extends hm<?>> e;

      public b(Map<? extends aba<? extends hm<?>>, ? extends hm<?>> $$0) {
         this.e = Map.copyOf($$0);
      }

      b(Stream<hn.d<?>> $$0) {
         this.e = (Map)$$0.collect(ImmutableMap.toImmutableMap(hn.d::a, hn.d::b));
      }

      @Override
      public <E> Optional<hm<E>> a(aba<? extends hm<? extends E>> $$0) {
         return Optional.ofNullable((hm)this.e.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<hn.d<?>> b() {
         return this.e.entrySet().stream().map(hn.d::a);
      }
   }

   public static record c<E>(aba<? extends hm<E>> a, Codec<E> b, @Nullable Codec<E> c) {
      public boolean a() {
         return this.c != null;
      }

      public aba<? extends hm<E>> b() {
         return this.a;
      }

      public Codec<E> c() {
         return this.b;
      }

      @Nullable
      public Codec<E> d() {
         return this.c;
      }
   }

   public static record d<T>(aba<? extends hm<T>> a, hm<T> b) {
      final aba<? extends hm<T>> a;
      final hm<T> b;

      private static <T, R extends hm<? extends T>> hn.d<T> a(Entry<? extends aba<? extends hm<?>>, R> $$0) {
         return a((aba<? extends hm<?>>)$$0.getKey(), (hm<?>)$$0.getValue());
      }

      private static <T> hn.d<T> a(hc.c<? extends hm<? extends T>> $$0) {
         return a($$0.g(), $$0.a());
      }

      private static <T> hn.d<T> a(aba<? extends hm<?>> $$0, hm<?> $$1) {
         return new hn.d<>($$0, $$1);
      }

      private hn.d<T> c() {
         return new hn.d<>(this.a, this.b.k());
      }
   }

   public interface e extends hn {
      <E> Optional<ht<E>> f(aba<? extends hm<? extends E>> var1);

      default <E> ht<E> g(aba<? extends hm<? extends E>> $$0) {
         return (ht<E>)this.f($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
      }
   }

   public static final class f implements hn.e {
      private final Map<? extends aba<? extends hm<?>>, ? extends ht<?>> e;

      f(Map<? extends aba<? extends hm<?>>, ? extends ht<?>> $$0) {
         this.e = $$0;
      }

      @Override
      public <E> Optional<hm<E>> a(aba<? extends hm<? extends E>> $$0) {
         return Optional.ofNullable((ht)this.e.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public <E> Optional<ht<E>> f(aba<? extends hm<? extends E>> $$0) {
         return Optional.ofNullable((ht)this.e.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<hn.d<?>> b() {
         return this.e.entrySet().stream().map(hn.d::a);
      }
   }
}
