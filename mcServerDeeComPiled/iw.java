import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class iw {
   private static final Logger r = LogUtils.getLogger();
   private static final Map<abb, Supplier<? extends hc<?>>> s = Maps.newLinkedHashMap();
   private static final ht<ht<?>> t = new hh<>(aba.a(new abb("root")), Lifecycle.experimental(), null);
   public static final hm<? extends hm<?>> a = t;
   public static final hm<cyu> b = a(hm.O, mi::a);
   public static final hm<dcs<?>> c = a(hm.aK, $$0 -> mg.a);
   public static final hm<ddg<?, ?>> d = a(hm.aL, ne::a);
   public static final hm<dkg> e = a(hm.aM, nt::a);
   public static final hm<dlb> f = a(hm.aN, mr::a);
   public static final hm<dlh> g = a(hm.aO, mq::a);
   public static final hm<dor> h = a(hm.aP, $$0 -> mn.b);
   public static final hm<dmk> i = a(hm.aQ, mm::a);
   public static final hm<cht> j = a(hm.aR, mw::a);
   public static final hm<dpa.a> k = a(hm.aS, mj::a);
   public static final hm<dak> l = a(hm.aT, day::a);
   public static final hm<daw> m = a(hm.aJ, daw::a);
   public static final hm<dkr> n = a(hm.aU, dks::a);
   public static final hm<djd> o = a(hm.aV, dje::a);
   public static final hm<rm> p = a(hm.bI, rm::a);
   public static final hn q = hn.a(a);

   private static <T> hm<T> a(aba<? extends hm<T>> $$0, iw.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> hm<T> a(aba<? extends hm<T>> $$0, Lifecycle $$1, iw.a<T> $$2) {
      return a($$0, new hh<>($$0, $$1, null), $$2, $$1);
   }

   private static <T, R extends ht<T>> R a(aba<? extends hm<T>> $$0, R $$1, iw.a<T> $$2, Lifecycle $$3) {
      abb $$4 = $$0.a();
      s.put($$4, (Supplier)() -> $$2.run($$1));
      t.a($$0, $$1, $$3);
      return $$1;
   }

   public static <V extends T, T> hc<V> a(hm<T> $$0, String $$1, V $$2) {
      return a($$0, new abb($$1), (T)$$2);
   }

   public static <T> hc<T> b(hm<T> $$0, String $$1, T $$2) {
      return a($$0, new abb($$1), $$2);
   }

   public static <T> hc<T> a(hm<T> $$0, abb $$1, T $$2) {
      return a($$0, aba.a($$0.n(), $$1), $$2);
   }

   public static <T> hc<T> a(hm<T> $$0, aba<T> $$1, T $$2) {
      return ((ht)$$0).a($$1, $$2, Lifecycle.stable());
   }

   public static void a() {
   }

   static {
      s.forEach(($$0, $$1) -> {
         if (!((hc)$$1.get()).b()) {
            r.error("Unable to bootstrap registry '{}'", $$0);
         }

      });
      hm.a(t);
   }

   @FunctionalInterface
   interface a<T> {
      hc<? extends T> run(hm<T> var1);
   }
}
