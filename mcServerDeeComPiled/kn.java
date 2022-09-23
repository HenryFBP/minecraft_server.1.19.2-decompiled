import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class kn {
   private final Map<ko, abb> a = Maps.newHashMap();
   private final Set<ko> b = Sets.newHashSet();

   public kn a(ko $$0, abb $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public kn b(ko $$0, abb $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<ko> a() {
      return this.b.stream();
   }

   public kn a(ko $$0, ko $$1) {
      this.a.put($$1, (abb)this.a.get($$0));
      return this;
   }

   public kn b(ko $$0, ko $$1) {
      this.a.put($$1, (abb)this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public abb a(ko $$0) {
      for(ko $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         abb $$2 = (abb)this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public kn c(ko $$0, abb $$1) {
      kn $$2 = new kn();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static kn a(cjt $$0) {
      abb $$1 = C($$0);
      return b($$1);
   }

   public static kn b(cjt $$0) {
      abb $$1 = C($$0);
      return a($$1);
   }

   public static kn a(abb $$0) {
      return new kn().a(ko.b, $$0);
   }

   public static kn b(abb $$0) {
      return new kn().a(ko.a, $$0);
   }

   public static kn c(cjt $$0) {
      return d(ko.p, C($$0));
   }

   public static kn c(abb $$0) {
      return d(ko.p, $$0);
   }

   public static kn d(cjt $$0) {
      return d(ko.q, C($$0));
   }

   public static kn d(abb $$0) {
      return d(ko.q, $$0);
   }

   public static kn e(cjt $$0) {
      return d(ko.s, C($$0));
   }

   public static kn e(abb $$0) {
      return d(ko.s, $$0);
   }

   public static kn f(cjt $$0) {
      return d(ko.t, C($$0));
   }

   public static kn f(abb $$0) {
      return d(ko.t, $$0);
   }

   public static kn g(cjt $$0) {
      return d(ko.y, C($$0));
   }

   public static kn a(cjt $$0, cjt $$1) {
      return new kn().a(ko.y, C($$0)).a(ko.z, C($$1));
   }

   public static kn h(cjt $$0) {
      return d(ko.u, C($$0));
   }

   public static kn i(cjt $$0) {
      return d(ko.x, C($$0));
   }

   public static kn g(abb $$0) {
      return d(ko.A, $$0);
   }

   public static kn b(cjt $$0, cjt $$1) {
      return new kn().a(ko.v, C($$0)).a(ko.w, a($$1, "_top"));
   }

   public static kn d(ko $$0, abb $$1) {
      return new kn().a($$0, $$1);
   }

   public static kn j(cjt $$0) {
      return new kn().a(ko.i, a($$0, "_side")).a(ko.d, a($$0, "_top"));
   }

   public static kn k(cjt $$0) {
      return new kn().a(ko.i, a($$0, "_side")).a(ko.f, a($$0, "_top"));
   }

   public static kn l(cjt $$0) {
      return new kn().a(ko.i, C($$0)).a(ko.d, a($$0, "_top"));
   }

   public static kn a(abb $$0, abb $$1) {
      return new kn().a(ko.i, $$0).a(ko.d, $$1);
   }

   public static kn m(cjt $$0) {
      return new kn().a(ko.i, a($$0, "_side")).a(ko.f, a($$0, "_top")).a(ko.e, a($$0, "_bottom"));
   }

   public static kn n(cjt $$0) {
      abb $$1 = C($$0);
      return new kn().a(ko.r, $$1).a(ko.i, $$1).a(ko.f, a($$0, "_top")).a(ko.e, a($$0, "_bottom"));
   }

   public static kn o(cjt $$0) {
      abb $$1 = C($$0);
      return new kn().a(ko.r, $$1).a(ko.i, $$1).a(ko.d, a($$0, "_top"));
   }

   public static kn b(abb $$0, abb $$1) {
      return new kn().a(ko.f, $$0).a(ko.e, $$1);
   }

   public static kn p(cjt $$0) {
      return new kn().a(ko.f, a($$0, "_top")).a(ko.e, a($$0, "_bottom"));
   }

   public static kn q(cjt $$0) {
      return new kn().a(ko.c, C($$0));
   }

   public static kn h(abb $$0) {
      return new kn().a(ko.c, $$0);
   }

   public static kn r(cjt $$0) {
      return new kn().a(ko.C, a($$0, "_0"));
   }

   public static kn s(cjt $$0) {
      return new kn().a(ko.C, a($$0, "_1"));
   }

   public static kn t(cjt $$0) {
      return new kn().a(ko.D, C($$0));
   }

   public static kn u(cjt $$0) {
      return new kn().a(ko.G, C($$0));
   }

   public static kn i(abb $$0) {
      return new kn().a(ko.G, $$0);
   }

   public static kn a(cat $$0) {
      return new kn().a(ko.c, c($$0));
   }

   public static kn v(cjt $$0) {
      return new kn().a(ko.i, a($$0, "_side")).a(ko.g, a($$0, "_front")).a(ko.h, a($$0, "_back"));
   }

   public static kn w(cjt $$0) {
      return new kn().a(ko.i, a($$0, "_side")).a(ko.g, a($$0, "_front")).a(ko.f, a($$0, "_top")).a(ko.e, a($$0, "_bottom"));
   }

   public static kn x(cjt $$0) {
      return new kn().a(ko.i, a($$0, "_side")).a(ko.g, a($$0, "_front")).a(ko.f, a($$0, "_top"));
   }

   public static kn y(cjt $$0) {
      return new kn().a(ko.i, a($$0, "_side")).a(ko.g, a($$0, "_front")).a(ko.d, a($$0, "_end"));
   }

   public static kn z(cjt $$0) {
      return new kn().a(ko.f, a($$0, "_top"));
   }

   public static kn c(cjt $$0, cjt $$1) {
      return new kn()
         .a(ko.c, a($$0, "_front"))
         .a(ko.o, C($$1))
         .a(ko.n, a($$0, "_top"))
         .a(ko.j, a($$0, "_front"))
         .a(ko.l, a($$0, "_side"))
         .a(ko.k, a($$0, "_side"))
         .a(ko.m, a($$0, "_front"));
   }

   public static kn d(cjt $$0, cjt $$1) {
      return new kn()
         .a(ko.c, a($$0, "_front"))
         .a(ko.o, C($$1))
         .a(ko.n, a($$0, "_top"))
         .a(ko.j, a($$0, "_front"))
         .a(ko.k, a($$0, "_front"))
         .a(ko.l, a($$0, "_side"))
         .a(ko.m, a($$0, "_side"));
   }

   public static kn A(cjt $$0) {
      return new kn().a(ko.I, a($$0, "_log_lit")).a(ko.C, a($$0, "_fire"));
   }

   public static kn a(cjt $$0, boolean $$1) {
      return new kn()
         .a(ko.c, a(cju.dq, "_side"))
         .a(ko.e, a(cju.dq, "_bottom"))
         .a(ko.f, a(cju.dq, "_top"))
         .a(ko.i, a(cju.dq, "_side"))
         .a(ko.J, a($$0, $$1 ? "_lit" : ""));
   }

   public static kn j(abb $$0) {
      return new kn()
         .a(ko.c, a(cju.eA, "_side"))
         .a(ko.i, a(cju.eA, "_side"))
         .a(ko.f, a(cju.eA, "_top"))
         .a(ko.e, a(cju.eA, "_bottom"))
         .a(ko.K, a(cju.eA, "_inner"))
         .a(ko.L, $$0);
   }

   public static kn a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new kn()
         .a(ko.c, a(cju.ps, "_bottom"))
         .a(ko.i, a(cju.ps, "_side"))
         .a(ko.f, a(cju.ps, "_top"))
         .a(ko.M, a(cju.ps, $$1 + "_inner_top"))
         .a(ko.e, a(cju.ps, "_bottom"));
   }

   public static kn b(cat $$0) {
      return new kn().a(ko.H, c($$0));
   }

   public static kn B(cjt $$0) {
      return new kn().a(ko.H, C($$0));
   }

   public static kn k(abb $$0) {
      return new kn().a(ko.H, $$0);
   }

   public static abb C(cjt $$0) {
      abb $$1 = hm.V.b($$0);
      return new abb($$1.b(), "block/" + $$1.a());
   }

   public static abb a(cjt $$0, String $$1) {
      abb $$2 = hm.V.b($$0);
      return new abb($$2.b(), "block/" + $$2.a() + $$1);
   }

   public static abb c(cat $$0) {
      abb $$1 = hm.Y.b($$0);
      return new abb($$1.b(), "item/" + $$1.a());
   }

   public static abb a(cat $$0, String $$1) {
      abb $$2 = hm.Y.b($$0);
      return new abb($$2.b(), "item/" + $$2.a() + $$1);
   }
}
