import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class bmw {
   public static final aba<bmv> a = a("armorer");
   public static final aba<bmv> b = a("butcher");
   public static final aba<bmv> c = a("cartographer");
   public static final aba<bmv> d = a("cleric");
   public static final aba<bmv> e = a("farmer");
   public static final aba<bmv> f = a("fisherman");
   public static final aba<bmv> g = a("fletcher");
   public static final aba<bmv> h = a("leatherworker");
   public static final aba<bmv> i = a("librarian");
   public static final aba<bmv> j = a("mason");
   public static final aba<bmv> k = a("shepherd");
   public static final aba<bmv> l = a("toolsmith");
   public static final aba<bmv> m = a("weaponsmith");
   public static final aba<bmv> n = a("home");
   public static final aba<bmv> o = a("meeting");
   public static final aba<bmv> p = a("beehive");
   public static final aba<bmv> q = a("bee_nest");
   public static final aba<bmv> r = a("nether_portal");
   public static final aba<bmv> s = a("lodestone");
   public static final aba<bmv> t = a("lightning_rod");
   private static final Set<cvo> v = (Set<cvo>)ImmutableList.of(
         cju.ba, cju.bb, cju.aX, cju.aY, cju.aV, cju.aT, cju.aZ, cju.aP, cju.aU, cju.aR, cju.aO, cju.aN, new cjt[]{cju.aS, cju.aW, cju.aM, cju.aQ}
      )
      .stream()
      .flatMap($$0 -> $$0.k().a().stream())
      .filter($$0 -> $$0.c(cjm.a) == cwc.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<cvo> w = (Set<cvo>)ImmutableList.of(cju.eA, cju.eC, cju.eB, cju.eD)
      .stream()
      .flatMap($$0 -> $$0.k().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<cvo, hc<bmv>> x = Maps.newHashMap();
   protected static final Set<cvo> u = new ObjectOpenHashSet(x.keySet());

   private static Set<cvo> a(cjt $$0) {
      return ImmutableSet.copyOf($$0.k().a());
   }

   private static aba<bmv> a(String $$0) {
      return aba.a(hm.C, new abb($$0));
   }

   private static bmv a(hm<bmv> $$0, aba<bmv> $$1, Set<cvo> $$2, int $$3, int $$4) {
      bmv $$5 = new bmv($$2, $$3, $$4);
      hm.a($$0, $$1, $$5);
      a($$0.h($$1));
      return $$5;
   }

   private static void a(hc<bmv> $$0) {
      ((bmv)$$0.a()).a().forEach($$1 -> {
         hc<bmv> $$2 = (hc)x.put($$1, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ad.c(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1)));
         }
      });
   }

   public static Optional<hc<bmv>> a(cvo $$0) {
      return Optional.ofNullable((hc)x.get($$0));
   }

   public static bmv a(hm<bmv> $$0) {
      a($$0, a, a(cju.mH), 1, 1);
      a($$0, b, a(cju.mG), 1, 1);
      a($$0, c, a(cju.mI), 1, 1);
      a($$0, d, a(cju.ez), 1, 1);
      a($$0, e, a(cju.nN), 1, 1);
      a($$0, f, a(cju.mF), 1, 1);
      a($$0, g, a(cju.mJ), 1, 1);
      a($$0, h, w, 1, 1);
      a($$0, i, a(cju.mL), 1, 1);
      a($$0, j, a(cju.mN), 1, 1);
      a($$0, k, a(cju.mE), 1, 1);
      a($$0, l, a(cju.mM), 1, 1);
      a($$0, m, a(cju.mK), 1, 1);
      a($$0, n, v, 1, 1);
      a($$0, o, a(cju.mO), 32, 6);
      a($$0, p, a(cju.nQ), 0, 1);
      a($$0, q, a(cju.nP), 0, 1);
      a($$0, r, a(cju.dn), 0, 1);
      a($$0, s, a(cju.ob), 0, 1);
      return a($$0, t, a(cju.qb), 0, 1);
   }
}
