import java.util.List;

public class ne {
   public static hc<? extends ddg<?, ?>> a(hm<ddg<?, ?>> $$0) {
      List<hc<? extends ddg<?, ?>>> $$1 = List.of(nb.g, nc.n, nd.d, nf.p, ng.d, nh.L, ni.a, nj.w, nk.M);
      return ad.a($$1, amn.a());
   }

   private static dbw a(List<cjt> $$0) {
      dbw $$1;
      if (!$$0.isEmpty()) {
         $$1 = dbw.a(dbw.c, dbw.a(gy.a.q(), $$0));
      } else {
         $$1 = dbw.c;
      }

      return $$1;
   }

   public static dgk a(int $$0, hc<dkg> $$1) {
      return new dgk($$0, 7, 3, $$1);
   }

   public static <FC extends dfx, F extends ddt<FC>> dgk a(F $$0, FC $$1, List<cjt> $$2, int $$3) {
      return a($$3, nt.a($$0, $$1, a($$2)));
   }

   public static <FC extends dfx, F extends ddt<FC>> dgk a(F $$0, FC $$1, List<cjt> $$2) {
      return a($$0, $$1, $$2, 96);
   }

   public static <FC extends dfx, F extends ddt<FC>> dgk a(F $$0, FC $$1) {
      return a($$0, $$1, List.of(), 96);
   }

   public static hc<ddg<dge, ?>> a(String $$0, ddt<dge> $$1) {
      return a($$0, $$1, dfx.m);
   }

   public static <FC extends dfx, F extends ddt<FC>> hc<ddg<FC, ?>> a(String $$0, F $$1, FC $$2) {
      return iw.a(iw.d, $$0, new ddg($$1, $$2));
   }
}
