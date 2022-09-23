import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dje {
   public static final aba<djd> a = a("classic_flat");
   public static final aba<djd> b = a("tunnelers_dream");
   public static final aba<djd> c = a("water_world");
   public static final aba<djd> d = a("overworld");
   public static final aba<djd> e = a("snowy_kingdom");
   public static final aba<djd> f = a("bottomless_pit");
   public static final aba<djd> g = a("desert");
   public static final aba<djd> h = a("redstone_ready");
   public static final aba<djd> i = a("the_void");

   public static hc<djd> a(hm<djd> $$0) {
      return new dje.a($$0).a();
   }

   private static aba<djd> a(String $$0) {
      return aba.a(hm.aV, new abb($$0));
   }

   static class a {
      private final hm<djd> a;
      private final hm<cht> b = iw.j;
      private final hm<dlh> c = iw.g;

      a(hm<djd> $$0) {
         this.a = $$0;
      }

      private hc<djd> a(aba<djd> $$0, cgw $$1, aba<cht> $$2, Set<aba<dlh>> $$3, boolean $$4, boolean $$5, djc... $$6) {
         he.a<dlh> $$7 = he.a((List)$$3.stream().flatMap($$0x -> this.c.b($$0x).stream()).collect(Collectors.toList()));
         djf $$8 = new djf(Optional.of($$7), this.b);
         if ($$4) {
            $$8.a();
         }

         if ($$5) {
            $$8.b();
         }

         for(int $$9 = $$6.length - 1; $$9 >= 0; --$$9) {
            $$8.e().add($$6[$$9]);
         }

         $$8.b(this.b.c($$2));
         return iw.a(this.a, $$0, new djd($$1.l().k(), $$8));
      }

      public hc<djd> a() {
         this.a(dje.a, cju.i, cia.b, ImmutableSet.of(dku.a), false, false, new djc(1, cju.i), new djc(2, cju.j), new djc(1, cju.B));
         this.a(dje.b, cju.b, cia.t, ImmutableSet.of(dku.j, dku.r), true, false, new djc(1, cju.i), new djc(5, cju.j), new djc(230, cju.b), new djc(1, cju.B));
         this.a(
            dje.c,
            caz.oI,
            cia.S,
            ImmutableSet.of(dku.m, dku.l, dku.g),
            false,
            false,
            new djc(90, cju.C),
            new djc(5, cju.G),
            new djc(5, cju.j),
            new djc(5, cju.b),
            new djc(64, cju.qr),
            new djc(1, cju.B)
         );
         this.a(
            dje.d,
            cju.bg,
            cia.b,
            ImmutableSet.of(dku.a, dku.j, dku.f, dku.k, dku.r),
            true,
            true,
            new djc(1, cju.i),
            new djc(3, cju.j),
            new djc(59, cju.b),
            new djc(1, cju.B)
         );
         this.a(
            dje.e,
            cju.cW,
            cia.d,
            ImmutableSet.of(dku.a, dku.c),
            false,
            false,
            new djc(1, cju.cW),
            new djc(1, cju.i),
            new djc(3, cju.j),
            new djc(59, cju.b),
            new djc(1, cju.B)
         );
         this.a(dje.f, caz.nP, cia.b, ImmutableSet.of(dku.a), false, false, new djc(1, cju.i), new djc(3, cju.j), new djc(2, cju.m));
         this.a(
            dje.g,
            cju.E,
            cia.f,
            ImmutableSet.of(dku.a, dku.b, dku.j, dku.r),
            true,
            false,
            new djc(8, cju.E),
            new djc(52, cju.aI),
            new djc(3, cju.b),
            new djc(1, cju.B)
         );
         this.a(dje.h, caz.kK, cia.f, ImmutableSet.of(), false, false, new djc(116, cju.aI), new djc(3, cju.b), new djc(1, cju.B));
         return this.a(dje.i, cju.gU, cia.a, ImmutableSet.of(), true, false, new djc(1, cju.a));
      }
   }
}
