import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bgv {
   private static final float a = 0.4F;

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> a(bts $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bgj(0.8F)),
         Pair.of(0, new ben()),
         Pair.of(0, new bev(45, 90)),
         Pair.of(0, new bgx()),
         Pair.of(0, new bgy()),
         Pair.of(0, new bfh()),
         Pair.of(0, new bfs()),
         Pair.of(0, new bgr($$0.b(), bku.c)),
         Pair.of(0, new bgr($$0.c(), bku.d)),
         Pair.of(1, new bez()),
         Pair.of(2, new bfb($$0)),
         Pair.of(3, new beu($$1)),
         new Pair[]{
            Pair.of(5, new bej($$1, false, 4)),
            Pair.of(6, new bdh($$0.c(), bku.c, bku.d, true, Optional.empty())),
            Pair.of(7, new beh($$1)),
            Pair.of(8, new bhb($$1)),
            Pair.of(10, new bdh($$0x -> $$0x.a(bmw.n), bku.b, false, Optional.of((byte)14))),
            Pair.of(10, new bdh($$0x -> $$0x.a(bmw.o), bku.e, true, Optional.of((byte)14))),
            Pair.of(10, new bdk()),
            Pair.of(10, new bfi())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> b(bts $$0, float $$1) {
      bha $$2;
      if ($$0 == bts.g) {
         $$2 = new bgz();
      } else {
         $$2 = new bha();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bfm(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(new bgg(bku.c, 0.4F, 4), 2),
                  Pair.of(new bgh(bku.c, 0.4F, 1, 10), 5),
                  Pair.of(new bgi(bku.f, $$1, 1, 6, bku.c), 5),
                  Pair.of(new bek(), $$0 == bts.g ? 2 : 5),
                  Pair.of(new bgq(), $$0 == bts.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bfx(400, 1600)),
         Pair.of(10, new bfr(bbr.bn, 4)),
         Pair.of(2, new bfv(bku.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bed(100)),
         Pair.of(99, new bgp())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new bez(80, 120)),
         a(),
         Pair.of(5, new bfa()),
         Pair.of(
            5,
            new bfm(
               ImmutableMap.of(bku.i, bkv.b),
               ImmutableList.of(
                  Pair.of(bem.a(bbr.aZ, 8, bku.q, $$0, 2), 2),
                  Pair.of(bem.a(bbr.l, 8, bku.q, $$0, 2), 1),
                  Pair.of(new bgt($$0), 1),
                  Pair.of(new bfw($$0, 2), 1),
                  Pair.of(new beo($$0), 2),
                  Pair.of(new bdx(20, 40), 2)
               )
            )
         ),
         Pair.of(99, new bgp())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> c(bts $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, new bfv(bku.b, $$1, 1, 150, 1200)),
         Pair.of(3, new bgr($$0x -> $$0x.a(bmw.n), bku.b)),
         Pair.of(3, new bfz()),
         Pair.of(
            5,
            new bfm(
               ImmutableMap.of(bku.b, bkv.b),
               ImmutableList.of(Pair.of(new bfo($$1), 1), Pair.of(new bel($$1), 4), Pair.of(new beg($$1, 4), 2), Pair.of(new bdx(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, new bgp())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> d(bts $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, new bfm(ImmutableList.of(Pair.of(new bgg(bku.e, 0.4F, 40), 2), Pair.of(new bga(), 2)))),
         Pair.of(10, new bfx(400, 1600)),
         Pair.of(10, new bfr(bbr.bn, 4)),
         Pair.of(2, new bfv(bku.e, $$1, 6, 100, 200)),
         Pair.of(3, new bed(100)),
         Pair.of(3, new bgr($$0x -> $$0x.a(bmw.o), bku.e)),
         Pair.of(3, new bec(ImmutableMap.of(), ImmutableSet.of(bku.q), bec.a.a, bec.b.a, ImmutableList.of(Pair.of(new bgk(), 1)))),
         a(),
         Pair.of(99, new bgp())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> e(bts $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bfm(
               ImmutableList.of(
                  Pair.of(bem.a(bbr.aZ, 8, bku.q, $$1, 2), 2),
                  Pair.of(new bem<>(bbr.aZ, 8, bbk::g, bbk::g, bku.r, $$1, 2), 1),
                  Pair.of(bem.a(bbr.l, 8, bku.q, $$1, 2), 1),
                  Pair.of(new bgt($$1), 1),
                  Pair.of(new bfw($$1, 2), 1),
                  Pair.of(new beo($$1), 1),
                  Pair.of(new bdx(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bed(100)),
         Pair.of(3, new bfr(bbr.bn, 4)),
         Pair.of(3, new bfx(400, 1600)),
         Pair.of(3, new bec(ImmutableMap.of(), ImmutableSet.of(bku.q), bec.a.a, bec.b.a, ImmutableList.of(Pair.of(new bgk(), 1)))),
         Pair.of(3, new bec(ImmutableMap.of(), ImmutableSet.of(bku.r), bec.a.a, bec.b.a, ImmutableList.of(Pair.of(new bgw(), 1)))),
         a(),
         Pair.of(99, new bgp())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> f(bts $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, new bgu()), Pair.of(1, bft.b(bku.A, $$2, 6, false)), Pair.of(1, bft.b(bku.y, $$2, 6, false)), Pair.of(3, new bgt($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> g(bts $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bfk()),
         Pair.of(0, new bfm(ImmutableList.of(Pair.of(new bfv(bku.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(new bgt($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, new bfj())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> h(bts $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bfm(ImmutableList.of(Pair.of(new bef($$1), 5), Pair.of(new bgs($$1 * 1.1F), 2)))),
         Pair.of(0, new bdr(600, 600)),
         Pair.of(2, new beq(24, $$1 * 1.4F)),
         b(),
         Pair.of(99, new bfj())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bdo<? super btp>>> i(bts $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, new bfq(15, 3)), Pair.of(1, new bep(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bdo<bcc>> a() {
      return Pair.of(
         5,
         new bfm(
            ImmutableList.of(
               Pair.of(new bfp(bbr.l, 8.0F), 8),
               Pair.of(new bfp(bbr.aZ, 8.0F), 2),
               Pair.of(new bfp(bbr.bn, 8.0F), 2),
               Pair.of(new bfp(bcf.b, 8.0F), 1),
               Pair.of(new bfp(bcf.f, 8.0F), 1),
               Pair.of(new bfp(bcf.d, 8.0F), 1),
               Pair.of(new bfp(bcf.e, 8.0F), 1),
               Pair.of(new bfp(bcf.g, 8.0F), 1),
               Pair.of(new bfp(bcf.a, 8.0F), 1),
               Pair.of(new bdx(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bdo<bcc>> b() {
      return Pair.of(5, new bfm(ImmutableList.of(Pair.of(new bfp(bbr.aZ, 8.0F), 2), Pair.of(new bfp(bbr.bn, 8.0F), 2), Pair.of(new bdx(30, 60), 8))));
   }
}
