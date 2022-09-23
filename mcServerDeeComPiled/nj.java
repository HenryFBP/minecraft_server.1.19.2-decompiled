import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class nj {
   public static final hc<ddg<dec, ?>> a = ne.a("crimson_fungus", ddt.V, new dec(cju.nh.m(), cju.nd.m(), cju.jw.m(), cju.nj.m(), false));
   public static final hc<ddg<dec, ?>> b = ne.a("crimson_fungus_planted", ddt.V, new dec(cju.nh.m(), cju.nd.m(), cju.jw.m(), cju.nj.m(), true));
   public static final hc<ddg<dec, ?>> c = ne.a("warped_fungus", ddt.V, new dec(cju.mY.m(), cju.mU.m(), cju.na.m(), cju.nj.m(), false));
   public static final hc<ddg<dec, ?>> d = ne.a("warped_fungus_planted", ddt.V, new dec(cju.mY.m(), cju.mU.m(), cju.na.m(), cju.nj.m(), true));
   public static final hc<ddg<dfz, ?>> e = ne.a(
      "huge_brown_mushroom",
      ddt.s,
      new dfz(
         dhw.a(cju.eb.m().a(cng.e, Boolean.valueOf(true)).a(cng.f, Boolean.valueOf(false))),
         dhw.a(cju.ed.m().a(cng.e, Boolean.valueOf(false)).a(cng.f, Boolean.valueOf(false))),
         3
      )
   );
   public static final hc<ddg<dfz, ?>> f = ne.a(
      "huge_red_mushroom",
      ddt.r,
      new dfz(dhw.a(cju.ec.m().a(cng.f, Boolean.valueOf(false))), dhw.a(cju.ed.m().a(cng.e, Boolean.valueOf(false)).a(cng.f, Boolean.valueOf(false))), 2)
   );
   private static final dik J = new dik(0.002F);
   private static final dik K = new dik(0.01F);
   private static final dik L = new dik(0.02F);
   private static final dik M = new dik(0.05F);
   private static final dik N = new dik(1.0F);
   public static final hc<ddg<dgt, ?>> g = ne.a("oak", ddt.g, a().c());
   public static final hc<ddg<dgt, ?>> h = ne.a(
      "dark_oak",
      ddt.g,
      new dgt.a(dhw.a(cju.T), new dis(6, 2, 1), dhw.a(cju.ax), new dhg(azl.a(0), azl.a(0)), new dha(1, 1, 0, 1, 2, OptionalInt.empty())).a().c()
   );
   public static final hc<ddg<dgt, ?>> i = ne.a("birch", ddt.g, b().c());
   public static final hc<ddg<dgt, ?>> j = ne.a(
      "acacia", ddt.g, new dgt.a(dhw.a(cju.S), new diu(5, 2, 2), dhw.a(cju.aw), new dhd(azl.a(2), azl.a(0)), new dhb(1, 0, 2)).a().c()
   );
   public static final hc<ddg<dgt, ?>> k = ne.a(
      "spruce", ddt.g, new dgt.a(dhw.a(cju.P), new dix(5, 2, 1), dhw.a(cju.at), new dho(azu.a(2, 3), azu.a(0, 2), azu.a(1, 2)), new dhb(2, 0, 2)).a().c()
   );
   public static final hc<ddg<dgt, ?>> l = ne.a(
      "pine", ddt.g, new dgt.a(dhw.a(cju.P), new dix(6, 4, 0), dhw.a(cju.at), new dhm(azl.a(1), azl.a(1), azu.a(3, 4)), new dhb(2, 0, 2)).a().c()
   );
   public static final hc<ddg<dgt, ?>> m = ne.a("jungle_tree", ddt.g, d().a(ImmutableList.of(new dil(0.2F), dip.b, new dim(0.25F))).a().c());
   public static final hc<ddg<dgt, ?>> n = ne.a("fancy_oak", ddt.g, e().c());
   public static final hc<ddg<dgt, ?>> o = ne.a("jungle_tree_no_vine", ddt.g, d().a().c());
   public static final hc<ddg<dgt, ?>> p = ne.a(
      "mega_jungle_tree",
      ddt.g,
      new dgt.a(dhw.a(cju.R), new diw(10, 2, 19), dhw.a(cju.av), new dhk(azl.a(2), azl.a(0), 2), new dhb(1, 1, 2))
         .a(ImmutableList.of(dip.b, new dim(0.25F)))
         .c()
   );
   public static final hc<ddg<dgt, ?>> q = ne.a(
      "mega_spruce",
      ddt.g,
      new dgt.a(dhw.a(cju.P), new div(13, 2, 14), dhw.a(cju.at), new dhl(azl.a(0), azl.a(0), azu.a(13, 17)), new dhb(1, 1, 2))
         .a(ImmutableList.of(new dii(dhw.a(cju.l))))
         .c()
   );
   public static final hc<ddg<dgt, ?>> r = ne.a(
      "mega_pine",
      ddt.g,
      new dgt.a(dhw.a(cju.P), new div(13, 2, 14), dhw.a(cju.at), new dhl(azl.a(0), azl.a(0), azu.a(3, 7)), new dhb(1, 1, 2))
         .a(ImmutableList.of(new dii(dhw.a(cju.l))))
         .c()
   );
   public static final hc<ddg<dgt, ?>> s = ne.a("super_birch_bees_0002", ddt.g, c().a(ImmutableList.of(J)).c());
   public static final hc<ddg<dgt, ?>> t = ne.a("super_birch_bees", ddt.g, c().a(ImmutableList.of(N)).c());
   public static final hc<ddg<dgt, ?>> u = ne.a("swamp_oak", ddt.g, a(cju.O, cju.as, 5, 3, 0, 3).a(ImmutableList.of(new dim(0.25F))).c());
   public static final hc<ddg<dgt, ?>> v = ne.a(
      "jungle_bush", ddt.g, new dgt.a(dhw.a(cju.R), new dix(1, 0, 0), dhw.a(cju.as), new dhf(azl.a(2), azl.a(1), 2), new dhb(0, 0, 0)).c()
   );
   public static final hc<ddg<dgt, ?>> w = ne.a(
      "azalea_tree",
      ddt.g,
      new dgt.a(
            dhw.a(cju.O),
            new dir(4, 2, 0, 3, azu.a(1, 2)),
            new dig(ayt.<cvo>a().a(cju.az.m(), 3).a(cju.aA.m(), 1)),
            new dhn(azl.a(3), azl.a(0), azl.a(2), 50),
            new dhb(1, 0, 1)
         )
         .a(dhw.a(cju.qp))
         .b()
         .c()
   );
   public static final hc<ddg<dgt, ?>> x = ne.a(
      "mangrove",
      ddt.g,
      new dgt.a(
            dhw.a(cju.U),
            new dja(2, 1, 4, azu.a(1, 4), 0.5F, azu.a(0, 1), hm.V.b(akl.bQ)),
            dhw.a(cju.ay),
            new dhn(azl.a(3), azl.a(0), azl.a(2), 70),
            Optional.of(
               new dht(
                  azu.a(1, 3),
                  dhw.a(cju.V),
                  Optional.of(new dhr(dhw.a(cju.qj), 0.5F)),
                  new dhs(hm.V.b(akl.bR), he.a(cjt::p, cju.qq, cju.W), dhw.a(cju.W), 8, 15, 0.2F)
               )
            ),
            new dhb(2, 0, 2)
         )
         .a(List.of(new dim(0.125F), new dij(0.14F, 1, 0, new dic(dhw.a(cju.A.m().a(coe.c, Boolean.valueOf(true))), coe.a, azu.a(0, 4)), 2, List.of(gy.a)), K))
         .a()
         .c()
   );
   public static final hc<ddg<dgt, ?>> y = ne.a(
      "tall_mangrove",
      ddt.g,
      new dgt.a(
            dhw.a(cju.U),
            new dja(4, 1, 9, azu.a(1, 6), 0.5F, azu.a(0, 1), hm.V.b(akl.bQ)),
            dhw.a(cju.ay),
            new dhn(azl.a(3), azl.a(0), azl.a(2), 70),
            Optional.of(
               new dht(
                  azu.a(3, 7),
                  dhw.a(cju.V),
                  Optional.of(new dhr(dhw.a(cju.qj), 0.5F)),
                  new dhs(hm.V.b(akl.bR), he.a(cjt::p, cju.qq, cju.W), dhw.a(cju.W), 8, 15, 0.2F)
               )
            ),
            new dhb(3, 0, 2)
         )
         .a(List.of(new dim(0.125F), new dij(0.14F, 1, 0, new dic(dhw.a(cju.A.m().a(coe.c, Boolean.valueOf(true))), coe.a, azu.a(0, 4)), 2, List.of(gy.a)), K))
         .a()
         .c()
   );
   public static final hc<ddg<dgt, ?>> z = ne.a("oak_bees_0002", ddt.g, a().a(List.of(J)).c());
   public static final hc<ddg<dgt, ?>> A = ne.a("oak_bees_002", ddt.g, a().a(List.of(L)).c());
   public static final hc<ddg<dgt, ?>> B = ne.a("oak_bees_005", ddt.g, a().a(List.of(M)).c());
   public static final hc<ddg<dgt, ?>> C = ne.a("birch_bees_0002", ddt.g, b().a(List.of(J)).c());
   public static final hc<ddg<dgt, ?>> D = ne.a("birch_bees_002", ddt.g, b().a(List.of(L)).c());
   public static final hc<ddg<dgt, ?>> E = ne.a("birch_bees_005", ddt.g, b().a(List.of(M)).c());
   public static final hc<ddg<dgt, ?>> F = ne.a("fancy_oak_bees_0002", ddt.g, e().a(List.of(J)).c());
   public static final hc<ddg<dgt, ?>> G = ne.a("fancy_oak_bees_002", ddt.g, e().a(List.of(L)).c());
   public static final hc<ddg<dgt, ?>> H = ne.a("fancy_oak_bees_005", ddt.g, e().a(List.of(M)).c());
   public static final hc<ddg<dgt, ?>> I = ne.a("fancy_oak_bees", ddt.g, e().a(List.of(N)).c());

   private static dgt.a a(cjt $$0, cjt $$1, int $$2, int $$3, int $$4, int $$5) {
      return new dgt.a(dhw.a($$0), new dix($$2, $$3, $$4), dhw.a($$1), new dhe(azl.a($$5), azl.a(0), 3), new dhb(1, 0, 1));
   }

   private static dgt.a a() {
      return a(cju.O, cju.as, 4, 2, 0, 2).a();
   }

   private static dgt.a b() {
      return a(cju.Q, cju.au, 5, 2, 0, 2).a();
   }

   private static dgt.a c() {
      return a(cju.Q, cju.au, 5, 2, 6, 2).a();
   }

   private static dgt.a d() {
      return a(cju.R, cju.av, 4, 8, 0, 2);
   }

   private static dgt.a e() {
      return new dgt.a(dhw.a(cju.O), new dit(3, 11, 0), dhw.a(cju.as), new dhh(azl.a(2), azl.a(4), 4), new dhb(0, 0, 0, OptionalInt.of(4))).a();
   }
}
