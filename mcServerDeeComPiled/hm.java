import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class hm<T> implements Keyable, hf<T> {
   private static final Logger bR = LogUtils.getLogger();
   private static final Map<abb, Supplier<?>> bS = Maps.newLinkedHashMap();
   public static final abb b = new abb("root");
   protected static final ht<ht<?>> c = new hh<>(a("root"), Lifecycle.experimental(), null);
   public static final hm<? extends hm<?>> d = c;
   public static final aba<hm<ajv>> e = a("sound_event");
   public static final aba<hm<dpu>> f = a("fluid");
   public static final aba<hm<bbe>> g = a("mob_effect");
   public static final aba<hm<cjt>> h = a("block");
   public static final aba<hm<cer>> i = a("enchantment");
   public static final aba<hm<bbr<?>>> j = a("entity_type");
   public static final aba<hm<cat>> k = a("item");
   public static final aba<hm<ccs>> l = a("potion");
   public static final aba<hm<in<?>>> m = a("particle_type");
   public static final aba<hm<ctk<?>>> n = a("block_entity_type");
   public static final aba<hm<bqr>> o = a("painting_variant");
   public static final aba<hm<abb>> p = a("custom_stat");
   public static final aba<hm<cxn>> q = a("chunk_status");
   public static final aba<hm<doo<?>>> r = a("rule_test");
   public static final aba<hm<doh<?>>> s = a("pos_rule_test");
   public static final aba<hm<bxq<?>>> t = a("menu");
   public static final aba<hm<cds<?>>> u = a("recipe_type");
   public static final aba<hm<cdr<?>>> v = a("recipe_serializer");
   public static final aba<hm<bcy>> w = a("attribute");
   public static final aba<hm<czv>> x = a("game_event");
   public static final aba<hm<czz<?>>> y = a("position_source_type");
   public static final aba<hm<akf<?>>> z = a("stat_type");
   public static final aba<hm<btu>> A = a("villager_type");
   public static final aba<hm<bts>> B = a("villager_profession");
   public static final aba<hm<bmv>> C = a("point_of_interest_type");
   public static final aba<hm<bku<?>>> D = a("memory_module_type");
   public static final aba<hm<blz<?>>> E = a("sensor_type");
   public static final aba<hm<bvp>> F = a("schedule");
   public static final aba<hm<bvn>> G = a("activity");
   public static final aba<hm<dsw>> H = a("loot_pool_entry_type");
   public static final aba<hm<dtp>> I = a("loot_function_type");
   public static final aba<hm<duy>> J = a("loot_condition_type");
   public static final aba<hm<dvr>> K = a("loot_number_provider_type");
   public static final aba<hm<dvk>> L = a("loot_nbt_provider_type");
   public static final aba<hm<dvz>> M = a("loot_score_provider_type");
   public static final aba<hm<gf<?, ?>>> N = a("command_argument_type");
   public static final aba<hm<cyu>> O = a("dimension_type");
   public static final aba<hm<cgx>> P = a("dimension");
   public static final aba<hm<cyv>> Q = a("dimension");
   public static final gx<czv> R = a(x, "step", czv::c, $$0 -> czv.R);
   public static final hm<ajv> S = a(e, $$0 -> ajw.kc);
   public static final gx<dpu> T = a(f, "empty", dpu::l, $$0 -> dpw.a);
   public static final hm<bbe> U = a(g, $$0 -> bbi.z);
   public static final gx<cjt> V = a(h, "air", cjt::p, $$0 -> cju.a);
   public static final hm<cer> W = a(i, $$0 -> cev.x);
   public static final gx<bbr<?>> X = a(j, "pig", bbr::q, $$0 -> bbr.aq);
   public static final gx<cat> Y = a(k, "air", cat::k, $$0 -> caz.a);
   public static final gx<ccs> Z = a(l, "empty", $$0 -> ccv.a);
   public static final hm<in<?>> aa = a(m, $$0 -> io.c);
   public static final hm<ctk<?>> ab = a(n, $$0 -> ctk.a);
   public static final gx<bqr> ac = a(o, "kebab", bqs::a);
   public static final hm<abb> ad = a(p, $$0 -> akg.E);
   public static final gx<cxn> ae = a(q, "empty", $$0 -> cxn.c);
   public static final hm<doo<?>> af = a(r, $$0 -> doo.a);
   public static final hm<doh<?>> ag = a(s, $$0 -> doh.a);
   public static final hm<bxq<?>> ah = a(t, $$0 -> bxq.h);
   public static final hm<cds<?>> ai = a(u, $$0 -> cds.a);
   public static final hm<cdr<?>> aj = a(v, $$0 -> cdr.b);
   public static final hm<bcy> ak = a(w, $$0 -> bdd.k);
   public static final hm<czz<?>> al = a(y, $$0 -> czz.a);
   public static final hm<gf<?, ?>> am = a(N, gg::a);
   public static final hm<akf<?>> an = a(z, $$0 -> akg.c);
   public static final gx<btu> ao = a(A, "plains", $$0 -> btu.c);
   public static final gx<bts> ap = a(B, "none", $$0 -> (T)bts.b);
   public static final hm<bmv> aq = a(C, bmw::a);
   public static final gx<bku<?>> ar = a(D, "dummy", $$0 -> bku.a);
   public static final gx<blz<?>> as = a(E, "dummy", $$0 -> blz.a);
   public static final hm<bvp> at = a(F, $$0 -> bvp.c);
   public static final hm<bvn> au = a(G, $$0 -> bvn.b);
   public static final hm<dsw> av = a(H, $$0 -> dst.a);
   public static final hm<dtp> aw = a(I, $$0 -> dtq.b);
   public static final hm<duy> ax = a(J, $$0 -> duz.a);
   public static final hm<dvr> ay = a(K, $$0 -> dvt.a);
   public static final hm<dvk> az = a(L, $$0 -> dvm.b);
   public static final hm<dvz> aA = a(M, $$0 -> dwb.b);
   public static final aba<hm<azn<?>>> aB = a("float_provider_type");
   public static final hm<azn<?>> aC = a(aB, $$0 -> azn.a);
   public static final aba<hm<azp<?>>> aD = a("int_provider_type");
   public static final hm<azp<?>> aE = a(aD, $$0 -> azp.a);
   public static final aba<hm<djk<?>>> aF = a("height_provider_type");
   public static final hm<djk<?>> aG = a(aF, $$0 -> djk.a);
   public static final aba<hm<dbx<?>>> aH = a("block_predicate_type");
   public static final hm<dbx<?>> aI = a(aH, $$0 -> dbx.k);
   public static final aba<hm<daw>> aJ = a("worldgen/noise_settings");
   public static final aba<hm<dcs<?>>> aK = a("worldgen/configured_carver");
   public static final aba<hm<ddg<?, ?>>> aL = a("worldgen/configured_feature");
   public static final aba<hm<dkg>> aM = a("worldgen/placed_feature");
   public static final aba<hm<dlb>> aN = a("worldgen/structure");
   public static final aba<hm<dlh>> aO = a("worldgen/structure_set");
   public static final aba<hm<dor>> aP = a("worldgen/processor_list");
   public static final aba<hm<dmk>> aQ = a("worldgen/template_pool");
   public static final aba<hm<cht>> aR = a("worldgen/biome");
   public static final aba<hm<dpa.a>> aS = a("worldgen/noise");
   public static final aba<hm<dak>> aT = a("worldgen/density_function");
   public static final aba<hm<dkr>> aU = a("worldgen/world_preset");
   public static final aba<hm<djd>> aV = a("worldgen/flat_level_generator_preset");
   public static final aba<hm<dcu<?>>> aW = a("worldgen/carver");
   public static final hm<dcu<?>> aX = a(aW, $$0 -> dcu.a);
   public static final aba<hm<ddt<?>>> aY = a("worldgen/feature");
   public static final hm<ddt<?>> aZ = a(aY, $$0 -> ddt.J);
   public static final aba<hm<dlz<?>>> ba = a("worldgen/structure_placement");
   public static final hm<dlz<?>> bb = a(ba, $$0 -> dlz.a);
   public static final aba<hm<dls>> bc = a("worldgen/structure_piece");
   public static final hm<dls> bd = a(bc, $$0 -> dls.c);
   public static final aba<hm<dlk<?>>> be = a("worldgen/structure_type");
   public static final hm<dlk<?>> bf = a(be, $$0 -> dlk.f);
   public static final aba<hm<dkk<?>>> bg = a("worldgen/placement_modifier_type");
   public static final hm<dkk<?>> bh = a(bg, $$0 -> dkk.f);
   public static final aba<hm<dhx<?>>> bi = a("worldgen/block_state_provider_type");
   public static final aba<hm<dhj<?>>> bj = a("worldgen/foliage_placer_type");
   public static final aba<hm<diz<?>>> bk = a("worldgen/trunk_placer_type");
   public static final aba<hm<dio<?>>> bl = a("worldgen/tree_decorator_type");
   public static final aba<hm<dhv<?>>> bm = a("worldgen/root_placer_type");
   public static final aba<hm<dgz<?>>> bn = a("worldgen/feature_size_type");
   public static final aba<hm<Codec<? extends chx>>> bo = a("worldgen/biome_source");
   public static final aba<hm<Codec<? extends cxk>>> bp = a("worldgen/chunk_generator");
   public static final aba<hm<Codec<? extends dbi.f>>> bq = a("worldgen/material_condition");
   public static final aba<hm<Codec<? extends dbi.o>>> br = a("worldgen/material_rule");
   public static final aba<hm<Codec<? extends dak>>> bs = a("worldgen/density_function_type");
   public static final aba<hm<dos<?>>> bt = a("worldgen/structure_processor");
   public static final aba<hm<dmj<?>>> bu = a("worldgen/structure_pool_element");
   public static final hm<dhx<?>> bv = a(bi, $$0 -> dhx.a);
   public static final hm<dhj<?>> bw = a(bj, $$0 -> dhj.a);
   public static final hm<diz<?>> bx = a(bk, $$0 -> diz.a);
   public static final hm<dhv<?>> by = a(bm, $$0 -> dhv.a);
   public static final hm<dio<?>> bz = a(bl, $$0 -> dio.b);
   public static final hm<dgz<?>> bA = a(bn, $$0 -> dgz.a);
   public static final hm<Codec<? extends chx>> bB = a(bo, Lifecycle.stable(), chy::a);
   public static final hm<Codec<? extends cxk>> bC = a(bp, Lifecycle.stable(), cxl::a);
   public static final hm<Codec<? extends dbi.f>> bD = a(bq, dbi.f::a);
   public static final hm<Codec<? extends dbi.o>> bE = a(br, dbi.o::a);
   public static final hm<Codec<? extends dak>> bF = a(bs, dal::a);
   public static final hm<dos<?>> bG = a(bt, $$0 -> dos.a);
   public static final hm<dmj<?>> bH = a(bu, $$0 -> dmj.d);
   public static final aba<hm<rm>> bI = a("chat_type");
   public static final aba<hm<bni>> bJ = a("cat_variant");
   public static final hm<bni> bK = a(bJ, $$0 -> (T)bni.b);
   public static final aba<hm<bnp>> bL = a("frog_variant");
   public static final hm<bnp> bM = a(bL, $$0 -> (T)bnp.a);
   public static final aba<hm<csz>> bN = a("banner_pattern");
   public static final hm<csz> bO = a(bN, cta::a);
   public static final aba<hm<caq>> bP = a("instrument");
   public static final hm<caq> bQ = a(bP, cas::a);
   private final aba<? extends hm<T>> bT;
   private final Lifecycle bU;

   private static <T> aba<hm<T>> a(String $$0) {
      return aba.a(new abb($$0));
   }

   public static <T extends hm<?>> void a(hm<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.d().isEmpty()) {
            ad.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof gx) {
            abb $$2 = ((gx)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }

      });
   }

   private static <T> hm<T> a(aba<? extends hm<T>> $$0, hm.a<T> $$1) {
      return a($$0, Lifecycle.experimental(), $$1);
   }

   private static <T> gx<T> a(aba<? extends hm<T>> $$0, String $$1, hm.a<T> $$2) {
      return a($$0, $$1, Lifecycle.experimental(), $$2);
   }

   private static <T> gx<T> a(aba<? extends hm<T>> $$0, String $$1, Function<T, hc.c<T>> $$2, hm.a<T> $$3) {
      return a($$0, $$1, Lifecycle.experimental(), $$2, $$3);
   }

   private static <T> hm<T> a(aba<? extends hm<T>> $$0, Lifecycle $$1, hm.a<T> $$2) {
      return a($$0, new hh<>($$0, $$1, null), $$2, $$1);
   }

   private static <T> hm<T> a(aba<? extends hm<T>> $$0, Lifecycle $$1, Function<T, hc.c<T>> $$2, hm.a<T> $$3) {
      return a($$0, new hh<>($$0, $$1, $$2), $$3, $$1);
   }

   private static <T> gx<T> a(aba<? extends hm<T>> $$0, String $$1, Lifecycle $$2, hm.a<T> $$3) {
      return a($$0, new gx<>($$1, $$0, $$2, null), $$3, $$2);
   }

   private static <T> gx<T> a(aba<? extends hm<T>> $$0, String $$1, Lifecycle $$2, Function<T, hc.c<T>> $$3, hm.a<T> $$4) {
      return a($$0, new gx<>($$1, $$0, $$2, $$3), $$4, $$2);
   }

   private static <T, R extends ht<T>> R a(aba<? extends hm<T>> $$0, R $$1, hm.a<T> $$2, Lifecycle $$3) {
      abb $$4 = $$0.a();
      bS.put($$4, (Supplier)() -> $$2.run($$1));
      c.a($$0, $$1, $$3);
      return $$1;
   }

   protected hm(aba<? extends hm<T>> $$0, Lifecycle $$1) {
      abd.a((Supplier<String>)(() -> "registry " + $$0));
      this.bT = $$0;
      this.bU = $$1;
   }

   public static void m() {
      for(hm<?> $$0 : d) {
         $$0.k();
      }

   }

   public aba<? extends hm<T>> n() {
      return this.bT;
   }

   public Lifecycle o() {
      return this.bU;
   }

   public String toString() {
      return "Registry[" + this.bT + " (" + this.bU + ")]";
   }

   public Codec<T> p() {
      Codec<T> $$0 = abb.a
         .flatXmap(
            $$0x -> (DataResult)Optional.ofNullable(this.a($$0x))
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown registry key in " + this.bT + ": " + $$0x)),
            $$0x -> (DataResult)this.c((T)$$0x)
                  .map(aba::a)
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown registry element in " + this.bT + ":" + $$0x))
         );
      Codec<T> $$1 = alq.a($$0x -> this.c((T)$$0x).isPresent() ? this.a((T)$$0x) : -1, this::a, -1);
      return alq.a(alq.b($$0, $$1), this::d, $$0x -> this.bU);
   }

   public Codec<hc<T>> q() {
      Codec<hc<T>> $$0 = abb.a
         .flatXmap(
            $$0x -> (DataResult)this.b(aba.a(this.bT, $$0x))
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown registry key in " + this.bT + ": " + $$0x)),
            $$0x -> (DataResult)$$0x.e()
                  .map(aba::a)
                  .map(DataResult::success)
                  .orElseGet(() -> DataResult.error("Unknown registry element in " + this.bT + ":" + $$0x))
         );
      return alq.a($$0, $$0x -> this.d((T)$$0x.a()), $$0x -> this.bU);
   }

   public <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.d().stream().map($$1 -> $$0.createString($$1.toString()));
   }

   @Nullable
   public abstract abb b(T var1);

   public abstract Optional<aba<T>> c(T var1);

   @Override
   public abstract int a(@Nullable T var1);

   @Nullable
   public abstract T a(@Nullable aba<T> var1);

   @Nullable
   public abstract T a(@Nullable abb var1);

   public abstract Lifecycle d(T var1);

   public abstract Lifecycle c();

   public Optional<T> b(@Nullable abb $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   public Optional<T> f(@Nullable aba<T> $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   public T g(aba<T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.bT + ": " + $$0);
      } else {
         return $$1;
      }
   }

   public abstract Set<abb> d();

   public abstract Set<Entry<aba<T>, T>> f();

   public abstract Set<aba<T>> e();

   public abstract Optional<hc<T>> a(amn var1);

   public Stream<T> r() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   public abstract boolean c(abb var1);

   public abstract boolean e(aba<T> var1);

   public static <T> T a(hm<? super T> $$0, String $$1, T $$2) {
      return a($$0, new abb($$1), $$2);
   }

   public static <V, T extends V> T a(hm<V> $$0, abb $$1, T $$2) {
      return a($$0, aba.a($$0.bT, $$1), $$2);
   }

   public static <V, T extends V> T a(hm<V> $$0, aba<V> $$1, T $$2) {
      ((ht)$$0).a($$1, (V)$$2, Lifecycle.stable());
      return $$2;
   }

   public static <V, T extends V> T a(hm<V> $$0, int $$1, String $$2, T $$3) {
      ((ht)$$0).a($$1, aba.a($$0.bT, new abb($$2)), (V)$$3, Lifecycle.stable());
      return $$3;
   }

   public abstract hm<T> k();

   public abstract hc<T> c(aba<T> var1);

   public abstract DataResult<hc<T>> d(aba<T> var1);

   public abstract hc.c<T> e(T var1);

   public abstract Optional<hc<T>> c(int var1);

   public abstract Optional<hc<T>> b(aba<T> var1);

   public hc<T> h(aba<T> $$0) {
      return (hc<T>)this.b($$0).orElseThrow(() -> new IllegalStateException("Missing key in " + this.bT + ": " + $$0));
   }

   public abstract Stream<hc.c<T>> g();

   public abstract Optional<he.c<T>> c(akz<T> var1);

   public Iterable<hc<T>> d(akz<T> $$0) {
      return (Iterable<hc<T>>)DataFixUtils.orElse(this.c($$0), List.of());
   }

   public abstract he.c<T> b(akz<T> var1);

   public abstract Stream<Pair<akz<T>, he.c<T>>> h();

   public abstract Stream<akz<T>> i();

   public abstract boolean a(akz<T> var1);

   public abstract void l();

   public abstract void a(Map<akz<T>, List<hc<T>>> var1);

   public hf<hc<T>> s() {
      return new hf<hc<T>>() {
         public int a(hc<T> $$0) {
            return hm.this.a($$0.a());
         }

         @Nullable
         public hc<T> c(int $$0) {
            return (hc<T>)hm.this.c($$0).orElse(null);
         }

         @Override
         public int b() {
            return hm.this.b();
         }

         public Iterator<hc<T>> iterator() {
            return hm.this.g().map($$0 -> $$0).iterator();
         }
      };
   }

   static {
      iw.a();
      bS.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            bR.error("Unable to bootstrap registry '{}'", $$0);
         }

      });
      a(c);
   }

   @FunctionalInterface
   interface a<T> {
      T run(hm<T> var1);
   }
}
