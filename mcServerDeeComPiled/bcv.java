import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bcv {
   private static final Map<bbr<?>, bcv.a> a = Maps.newHashMap();

   private static <T extends bce> void a(bbr<T> $$0, bcv.c $$1, dar.a $$2, bcv.b<T> $$3) {
      bcv.a $$4 = (bcv.a)a.put($$0, new bcv.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + hm.X.b($$0));
      }
   }

   public static bcv.c a(bbr<?> $$0) {
      bcv.a $$1 = (bcv.a)a.get($$0);
      return $$1 == null ? bcv.c.c : $$1.b;
   }

   public static dar.a b(@Nullable bbr<?> $$0) {
      bcv.a $$1 = (bcv.a)a.get($$0);
      return $$1 == null ? dar.a.f : $$1.a;
   }

   public static <T extends bbn> boolean a(bbr<T> $$0, chm $$1, bcg $$2, gt $$3, amn $$4) {
      bcv.a $$5 = (bcv.a)a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bbr.f, bcv.c.b, dar.a.f, bol::a);
      a(bbr.o, bcv.c.b, dar.a.f, bog::c);
      a(bbr.r, bcv.c.b, dar.a.f, bog::c);
      a(bbr.u, bcv.c.b, dar.a.f, bre::a);
      a(bbr.N, bcv.c.b, dar.a.f, brm::b);
      a(bbr.aw, bcv.c.b, dar.a.f, bog::c);
      a(bbr.az, bcv.c.b, dar.a.f, bog::c);
      a(bbr.aM, bcv.c.b, dar.a.f, bog::c);
      a(bbr.aW, bcv.c.b, dar.a.f, boe::b);
      a(bbr.g, bcv.c.a, dar.a.f, bmz::b);
      a(bbr.i, bcv.c.a, dar.a.f, brq::c);
      a(bbr.m, bcv.c.a, dar.a.f, brq::b);
      a(bbr.n, bcv.c.a, dar.a.f, bne::b);
      a(bbr.p, bcv.c.a, dar.a.f, bne::b);
      a(bbr.q, bcv.c.a, dar.a.f, brq::b);
      a(bbr.s, bcv.c.a, dar.a.f, bne::b);
      a(bbr.y, bcv.c.a, dar.a.f, brq::b);
      a(bbr.z, bcv.c.a, dar.a.f, brh::b);
      a(bbr.x, bcv.c.a, dar.a.f, bce::a);
      a(bbr.H, bcv.c.a, dar.a.f, boq::c);
      a(bbr.I, bcv.c.a, dar.a.f, brk::b);
      a(bbr.J, bcv.c.a, dar.a.f, brq::b);
      a(bbr.L, bcv.c.b, dar.a.f, bbv::a);
      a(bbr.M, bcv.c.a, dar.a.f, bow::c);
      a(bbr.P, bcv.c.a, dar.a.f, bne::b);
      a(bbr.Q, bcv.c.a, dar.a.f, brn::a);
      a(bbr.S, bcv.c.a, dar.a.f, bce::a);
      a(bbr.Y, bcv.c.a, dar.a.f, bne::b);
      a(bbr.aa, bcv.c.a, dar.a.f, brp::b);
      a(bbr.ak, bcv.c.a, dar.a.f, bnr::c);
      a(bbr.aj, bcv.c.a, dar.a.f, bne::b);
      a(bbr.al, bcv.c.a, dar.a.e, bns::c);
      a(bbr.ao, bcv.c.a, dar.a.e, bnu::c);
      a(bbr.aq, bcv.c.a, dar.a.f, bne::b);
      a(bbr.O, bcv.c.a, dar.a.f, bsm::c);
      a(bbr.ar, bcv.c.a, dar.a.f, bss::b);
      a(bbr.at, bcv.c.a, dar.a.f, brr::b);
      a(bbr.au, bcv.c.a, dar.a.f, bnw::c);
      a(bbr.ax, bcv.c.a, dar.a.f, bny::c);
      a(bbr.aA, bcv.c.a, dar.a.f, bne::b);
      a(bbr.aD, bcv.c.a, dar.a.f, brx::b);
      a(bbr.aE, bcv.c.a, dar.a.f, brq::b);
      a(bbr.aF, bcv.c.a, dar.a.f, bne::b);
      a(bbr.aG, bcv.c.a, dar.a.f, brz::c);
      a(bbr.aI, bcv.c.a, dar.a.f, bce::a);
      a(bbr.aL, bcv.c.a, dar.a.f, brq::b);
      a(bbr.aN, bcv.c.a, dar.a.f, bsc::a);
      a(bbr.aO, bcv.c.d, dar.a.f, bsd::c);
      a(bbr.aX, bcv.c.a, dar.a.f, bof::c);
      a(bbr.aZ, bcv.c.a, dar.a.f, bce::a);
      a(bbr.bd, bcv.c.a, dar.a.f, brq::b);
      a(bbr.be, bcv.c.a, dar.a.f, brq::b);
      a(bbr.bf, bcv.c.a, dar.a.f, brq::b);
      a(bbr.bh, bcv.c.a, dar.a.f, boh::c);
      a(bbr.bj, bcv.c.a, dar.a.f, brq::b);
      a(bbr.bk, bcv.c.a, dar.a.f, bne::b);
      a(bbr.bm, bcv.c.a, dar.a.f, bsl::b);
      a(bbr.bl, bcv.c.a, dar.a.f, brq::b);
      a(bbr.l, bcv.c.a, dar.a.f, bne::b);
      a(bbr.v, bcv.c.b, dar.a.f, brm::b);
      a(bbr.A, bcv.c.c, dar.a.f, brq::b);
      a(bbr.G, bcv.c.c, dar.a.f, bno::c);
      a(bbr.R, bcv.c.c, dar.a.f, brq::b);
      a(bbr.an, bcv.c.c, dar.a.f, bne::b);
      a(bbr.ap, bcv.c.c, dar.a.f, bce::a);
      a(bbr.ay, bcv.c.c, dar.a.f, brq::b);
      a(bbr.aB, bcv.c.c, dar.a.f, bce::a);
      a(bbr.aV, bcv.c.c, dar.a.f, bne::b);
      a(bbr.aY, bcv.c.c, dar.a.f, brq::b);
      a(bbr.ba, bcv.c.c, dar.a.f, brq::b);
      a(bbr.bb, bcv.c.c, dar.a.f, bce::a);
      a(bbr.bc, bcv.c.c, dar.a.f, bce::a);
   }

   static class a {
      final dar.a a;
      final bcv.c b;
      final bcv.b<?> c;

      public a(dar.a $$0, bcv.c $$1, bcv.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bbn> {
      boolean test(bbr<T> var1, chm var2, bcg var3, gt var4, amn var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
