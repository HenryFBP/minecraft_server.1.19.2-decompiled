import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record bts(String q, Predicate<hc<bmv>> r, Predicate<hc<bmv>> s, ImmutableSet<cat> t, ImmutableSet<cjt> u, @Nullable ajv v) {
   public static final Predicate<hc<bmv>> a = $$0 -> $$0.a(aku.a);
   public static final bts b = a("none", bmv.a, a, null);
   public static final bts c = a("armorer", bmw.a, ajw.vM);
   public static final bts d = a("butcher", bmw.b, ajw.vN);
   public static final bts e = a("cartographer", bmw.c, ajw.vO);
   public static final bts f = a("cleric", bmw.d, ajw.vP);
   public static final bts g = a("farmer", bmw.e, ImmutableSet.of(caz.nS, caz.nR, caz.tf, caz.pH), ImmutableSet.of(cju.cn), ajw.vQ);
   public static final bts h = a("fisherman", bmw.f, ajw.vR);
   public static final bts i = a("fletcher", bmw.g, ajw.vS);
   public static final bts j = a("leatherworker", bmw.h, ajw.vT);
   public static final bts k = a("librarian", bmw.i, ajw.vU);
   public static final bts l = a("mason", bmw.j, ajw.vV);
   public static final bts m = a("nitwit", bmv.a, bmv.a, null);
   public static final bts n = a("shepherd", bmw.k, ajw.vW);
   public static final bts o = a("toolsmith", bmw.l, ajw.vX);
   public static final bts p = a("weaponsmith", bmw.m, ajw.vY);

   public String toString() {
      return this.q;
   }

   private static bts a(String $$0, aba<bmv> $$1, @Nullable ajv $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static bts a(String $$0, Predicate<hc<bmv>> $$1, Predicate<hc<bmv>> $$2, @Nullable ajv $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static bts a(String $$0, aba<bmv> $$1, ImmutableSet<cat> $$2, ImmutableSet<cjt> $$3, @Nullable ajv $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static bts a(String $$0, Predicate<hc<bmv>> $$1, Predicate<hc<bmv>> $$2, ImmutableSet<cat> $$3, ImmutableSet<cjt> $$4, @Nullable ajv $$5) {
      return hm.a(hm.ap, new abb($$0), new bts($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<hc<bmv>> b() {
      return this.r;
   }

   public Predicate<hc<bmv>> c() {
      return this.s;
   }

   public ImmutableSet<cat> d() {
      return this.t;
   }

   public ImmutableSet<cjt> e() {
      return this.u;
   }

   @Nullable
   public ajv f() {
      return this.v;
   }
}
