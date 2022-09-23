import java.util.List;

public class nt {
   public static final dkj a = dkc.a(dar.a.e);
   public static final dkj b = dkc.a(dar.a.c);
   public static final dkj c = dkc.a(dar.a.a);
   public static final dkj d = dkc.a(dar.a.d);
   public static final dkj e = dkb.a(dbl.a(), dbl.b());
   public static final dkj f = dkb.a(dbl.b(10), dbl.c(10));
   public static final dkj g = dkb.a(dbl.b(8), dbl.c(8));
   public static final dkj h = dkb.a(dbl.b(4), dbl.c(4));
   public static final dkj i = dkb.a(dbl.a(), dbl.a(256));

   public static hc<dkg> a(hm<dkg> $$0) {
      List<hc<dkg>> $$1 = List.of(nn.k, no.k, np.c, nq.f, nr.d, ns.I, nu.f, nv.at, nw.a);
      return ad.a($$1, amn.a());
   }

   public static hc<dkg> a(String $$0, hc<? extends ddg<?, ?>> $$1, List<dkj> $$2) {
      return iw.b(iw.e, $$0, new dkg(hc.a($$1), List.copyOf($$2)));
   }

   public static hc<dkg> a(String $$0, hc<? extends ddg<?, ?>> $$1, dkj... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static dkj a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         ayt<azo> $$4 = ayt.<azo>a().a(azl.a($$0), (int)$$3 - 1).a(azl.a($$0 + $$2), 1).a();
         return djz.a(new azv($$4));
      }
   }

   public static dki a() {
      return djv.a(dbw.c);
   }

   public static djv a(cjt $$0) {
      return djv.a(dbw.a($$0.m(), gt.b));
   }

   public static hc<dkg> a(hc<? extends ddg<?, ?>> $$0, dkj... $$1) {
      return hc.a(new dkg(hc.a($$0), List.of($$1)));
   }

   public static <FC extends dfx, F extends ddt<FC>> hc<dkg> a(F $$0, FC $$1, dkj... $$2) {
      return a(hc.a(new ddg($$0, $$1)), $$2);
   }

   public static <FC extends dfx, F extends ddt<FC>> hc<dkg> a(F $$0, FC $$1) {
      return a($$0, $$1, dbw.c);
   }

   public static <FC extends dfx, F extends ddt<FC>> hc<dkg> a(F $$0, FC $$1, dbw $$2) {
      return a($$0, $$1, djv.a($$2));
   }
}
