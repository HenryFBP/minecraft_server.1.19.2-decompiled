import java.util.Map;
import java.util.Optional;

public class dks {
   public static final aba<dkr> a = a("normal");
   public static final aba<dkr> b = a("flat");
   public static final aba<dkr> c = a("large_biomes");
   public static final aba<dkr> d = a("amplified");
   public static final aba<dkr> e = a("single_biome_surface");
   public static final aba<dkr> f = a("debug_all_block_states");

   public static hc<dkr> a(hm<dkr> $$0) {
      return new dks.a($$0).a();
   }

   private static aba<dkr> a(String $$0) {
      return aba.a(hm.aU, new abb($$0));
   }

   public static Optional<aba<dkr>> a(dbm $$0) {
      cxk $$1 = $$0.e();
      if ($$1 instanceof dam) {
         return Optional.of(b);
      } else {
         return $$1 instanceof dai ? Optional.of(f) : Optional.empty();
      }
   }

   public static dbm a(hn $$0, long $$1, boolean $$2, boolean $$3) {
      return $$0.d(hm.aU).h(a).a().a($$1, $$2, $$3);
   }

   public static dbm a(hn $$0, long $$1) {
      return a($$0, $$1, true, false);
   }

   public static dbm a(hn $$0) {
      return a($$0, amn.a().g());
   }

   public static dbm b(hn $$0) {
      return a($$0, (long)"North Carolina".hashCode(), true, true);
   }

   public static cyv c(hn $$0) {
      return $$0.d(hm.aU).h(a).a().b();
   }

   static class a {
      private final hm<dkr> a;
      private final hm<cyu> b;
      private final hm<cht> c;
      private final hm<dlh> d;
      private final hm<daw> e;
      private final hm<dpa.a> f;
      private final hc<cyu> g;
      private final hc<cyu> h;
      private final hc<daw> i;
      private final cyv j;
      private final hc<cyu> k;
      private final hc<daw> l;
      private final cyv m;

      a(hm<dkr> $$0) {
         this.b = iw.b;
         this.c = iw.j;
         this.d = iw.g;
         this.e = iw.m;
         this.f = iw.k;
         this.g = this.b.c(cys.a);
         this.h = this.b.c(cys.b);
         this.i = this.e.c(daw.f);
         this.j = new cyv(this.h, new dau(this.d, this.f, cig.a.a.a(this.c), this.i));
         this.k = this.b.c(cys.c);
         this.l = this.e.c(daw.g);
         this.m = new cyv(this.k, new dau(this.d, this.f, new cii(this.c), this.l));
         this.a = $$0;
      }

      private cyv a(cxk $$0) {
         return new cyv(this.g, $$0);
      }

      private cyv a(chx $$0, hc<daw> $$1) {
         return this.a(new dau(this.d, this.f, $$0, $$1));
      }

      private dkr a(cyv $$0) {
         return new dkr(Map.of(cyv.b, $$0, cyv.c, this.j, cyv.d, this.m));
      }

      private hc<dkr> a(aba<dkr> $$0, cyv $$1) {
         return iw.a(this.a, $$0, this.a($$1));
      }

      public hc<dkr> a() {
         cig $$0 = cig.a.b.a(this.c);
         hc<daw> $$1 = this.e.c(daw.c);
         this.a(dks.a, this.a($$0, $$1));
         hc<daw> $$2 = this.e.c(daw.d);
         this.a(dks.c, this.a($$0, $$2));
         hc<daw> $$3 = this.e.c(daw.e);
         this.a(dks.d, this.a($$0, $$3));
         this.a(dks.e, this.a(new cie(this.c.c(cia.b)), $$1));
         this.a(dks.b, this.a(new dam(this.d, djf.a(this.c, this.d))));
         return this.a(dks.f, this.a(new dai(this.d, this.c)));
      }
   }
}
