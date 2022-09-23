import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class jw {
   final Consumer<jz> b;
   final BiConsumer<abb, Supplier<JsonElement>> c;
   private final Consumer<cat> d;
   final List<cjt> e = ImmutableList.of(cju.dI, cju.dN, cju.gW);
   final Map<cjt, jw.c> f = ImmutableMap.builder().put(cju.b, jw::a).put(cju.qr, jw::c).put(cju.dU, jw::b).build();
   final Map<cjt, kp> g = ImmutableMap.builder()
      .put(cju.aI, kp.t.get(cju.aI))
      .put(cju.in, kp.t.get(cju.in))
      .put(cju.iN, kp.a(kn.a(cju.aI, "_top")))
      .put(cju.iP, kp.a(kn.a(cju.in, "_top")))
      .put(cju.aK, kp.c.get(cju.aI).a($$0x -> $$0x.a(ko.i, kn.C(cju.aK))))
      .put(cju.ip, kp.c.get(cju.in).a($$0x -> $$0x.a(ko.i, kn.C(cju.ip))))
      .put(cju.ge, kp.c.get(cju.ge))
      .put(cju.iO, kp.a(kn.a(cju.ge, "_bottom")))
      .put(cju.oc, kp.u.get(cju.oc))
      .put(cju.qr, kp.u.get(cju.qr))
      .put(cju.gf, kp.c.get(cju.gf).a($$0x -> $$0x.a(ko.i, kn.C(cju.gf))))
      .put(cju.aJ, kp.c.get(cju.aJ).a($$0x -> {
         $$0x.a(ko.d, kn.a(cju.aI, "_top"));
         $$0x.a(ko.i, kn.C(cju.aJ));
      }))
      .put(cju.io, kp.c.get(cju.io).a($$0x -> {
         $$0x.a(ko.d, kn.a(cju.in, "_top"));
         $$0x.a(ko.i, kn.C(cju.io));
      }))
      .build();
   static final Map<iv.b, BiConsumer<jw.b, cjt>> h = ImmutableMap.builder()
      .put(iv.b.a, jw.b::a)
      .put(iv.b.e, jw.b::j)
      .put(iv.b.b, jw.b::i)
      .put(iv.b.c, jw.b::i)
      .put(iv.b.f, jw.b::c)
      .put(iv.b.g, jw.b::d)
      .put(iv.b.h, jw.b::f)
      .put(iv.b.i, jw.b::g)
      .put(iv.b.j, jw.b::h)
      .put(iv.b.k, jw.b::e)
      .put(iv.b.m, jw.b::k)
      .put(iv.b.n, jw.b::b)
      .build();
   public static final List<Pair<cwf, Function<abb, kf>>> a = List.of(
      Pair.of(cwe.M, (Function)$$0 -> kf.a().a(kg.c, $$0)),
      Pair.of(cwe.N, (Function)$$0 -> kf.a().a(kg.c, $$0).a(kg.b, kg.a.b).a(kg.d, true)),
      Pair.of(cwe.O, (Function)$$0 -> kf.a().a(kg.c, $$0).a(kg.b, kg.a.c).a(kg.d, true)),
      Pair.of(cwe.P, (Function)$$0 -> kf.a().a(kg.c, $$0).a(kg.b, kg.a.d).a(kg.d, true)),
      Pair.of(cwe.K, (Function)$$0 -> kf.a().a(kg.c, $$0).a(kg.a, kg.a.d).a(kg.d, true)),
      Pair.of(cwe.L, (Function)$$0 -> kf.a().a(kg.c, $$0).a(kg.a, kg.a.b).a(kg.d, true))
   );

   private static jz a(cjt $$0, abb $$1, kn $$2, BiConsumer<abb, Supplier<JsonElement>> $$3) {
      abb $$4 = km.d.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static jz b(cjt $$0, abb $$1, kn $$2, BiConsumer<abb, Supplier<JsonElement>> $$3) {
      abb $$4 = km.e.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static jz c(cjt $$0, abb $$1, kn $$2, BiConsumer<abb, Supplier<JsonElement>> $$3) {
      abb $$4 = km.h.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public jw(Consumer<jz> $$0, BiConsumer<abb, Supplier<JsonElement>> $$1, Consumer<cat> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   void a(cjt $$0) {
      this.d.accept($$0.l());
   }

   void a(cjt $$0, abb $$1) {
      this.c.accept(kk.a($$0.l()), new kj($$1));
   }

   private void a(cat $$0, abb $$1) {
      this.c.accept(kk.a($$0), new kj($$1));
   }

   void a(cat $$0) {
      km.aW.a(kk.a($$0), kn.b($$0), this.c);
   }

   private void b(cjt $$0) {
      cat $$1 = $$0.l();
      if ($$1 != caz.a) {
         km.aW.a(kk.a($$1), kn.B($$0), this.c);
      }

   }

   private void a(cjt $$0, String $$1) {
      cat $$2 = $$0.l();
      km.aW.a(kk.a($$2), kn.k(kn.a($$0, $$1)), this.c);
   }

   private static kd b() {
      return kd.a(cwe.S).a(gy.f, kf.a().a(kg.b, kg.a.b)).a(gy.d, kf.a().a(kg.b, kg.a.c)).a(gy.e, kf.a().a(kg.b, kg.a.d)).a(gy.c, kf.a());
   }

   private static kd c() {
      return kd.a(cwe.S).a(gy.d, kf.a()).a(gy.e, kf.a().a(kg.b, kg.a.b)).a(gy.c, kf.a().a(kg.b, kg.a.c)).a(gy.f, kf.a().a(kg.b, kg.a.d));
   }

   private static kd d() {
      return kd.a(cwe.S).a(gy.f, kf.a()).a(gy.d, kf.a().a(kg.b, kg.a.b)).a(gy.e, kf.a().a(kg.b, kg.a.c)).a(gy.c, kf.a().a(kg.b, kg.a.d));
   }

   private static kd e() {
      return kd.a(cwe.Q)
         .a(gy.a, kf.a().a(kg.a, kg.a.b))
         .a(gy.b, kf.a().a(kg.a, kg.a.d))
         .a(gy.c, kf.a())
         .a(gy.d, kf.a().a(kg.b, kg.a.c))
         .a(gy.e, kf.a().a(kg.b, kg.a.d))
         .a(gy.f, kf.a().a(kg.b, kg.a.b));
   }

   private static kc b(cjt $$0, abb $$1) {
      return kc.a($$0, a($$1));
   }

   private static kf[] a(abb $$0) {
      return new kf[]{kf.a().a(kg.c, $$0), kf.a().a(kg.c, $$0).a(kg.b, kg.a.b), kf.a().a(kg.c, $$0).a(kg.b, kg.a.c), kf.a().a(kg.c, $$0).a(kg.b, kg.a.d)};
   }

   private static kc a(cjt $$0, abb $$1, abb $$2) {
      return kc.a($$0, kf.a().a(kg.c, $$1), kf.a().a(kg.c, $$2), kf.a().a(kg.c, $$1).a(kg.b, kg.a.c), kf.a().a(kg.c, $$2).a(kg.b, kg.a.c));
   }

   private static kd a(cwf $$0, abb $$1, abb $$2) {
      return kd.a($$0).a(true, kf.a().a(kg.c, $$1)).a(false, kf.a().a(kg.c, $$2));
   }

   private void c(cjt $$0) {
      abb $$1 = kp.a.create($$0, this.c);
      abb $$2 = kp.b.create($$0, this.c);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void d(cjt $$0) {
      abb $$1 = kp.a.create($$0, this.c);
      this.b.accept(b($$0, $$1));
   }

   static jz b(cjt $$0, abb $$1, abb $$2) {
      return kc.a($$0)
         .a(kd.a(cwe.w).a(false, kf.a().a(kg.c, $$1)).a(true, kf.a().a(kg.c, $$2)))
         .a(
            kd.a(cwe.U, cwe.S)
               .a(cwa.a, gy.f, kf.a().a(kg.b, kg.a.b))
               .a(cwa.a, gy.e, kf.a().a(kg.b, kg.a.d))
               .a(cwa.a, gy.d, kf.a().a(kg.b, kg.a.c))
               .a(cwa.a, gy.c, kf.a())
               .a(cwa.b, gy.f, kf.a().a(kg.b, kg.a.b).a(kg.a, kg.a.b).a(kg.d, true))
               .a(cwa.b, gy.e, kf.a().a(kg.b, kg.a.d).a(kg.a, kg.a.b).a(kg.d, true))
               .a(cwa.b, gy.d, kf.a().a(kg.b, kg.a.c).a(kg.a, kg.a.b).a(kg.d, true))
               .a(cwa.b, gy.c, kf.a().a(kg.a, kg.a.b).a(kg.d, true))
               .a(cwa.c, gy.f, kf.a().a(kg.b, kg.a.d).a(kg.a, kg.a.c))
               .a(cwa.c, gy.e, kf.a().a(kg.b, kg.a.b).a(kg.a, kg.a.c))
               .a(cwa.c, gy.d, kf.a().a(kg.a, kg.a.c))
               .a(cwa.c, gy.c, kf.a().a(kg.b, kg.a.c).a(kg.a, kg.a.c))
         );
   }

   private static kd.d<gy, cwk, cwj, Boolean> a(kd.d<gy, cwk, cwj, Boolean> $$0, cwk $$1, abb $$2, abb $$3, abb $$4, abb $$5) {
      return $$0.a(gy.f, $$1, cwj.a, false, kf.a().a(kg.c, $$2))
         .a(gy.d, $$1, cwj.a, false, kf.a().a(kg.c, $$2).a(kg.b, kg.a.b))
         .a(gy.e, $$1, cwj.a, false, kf.a().a(kg.c, $$2).a(kg.b, kg.a.c))
         .a(gy.c, $$1, cwj.a, false, kf.a().a(kg.c, $$2).a(kg.b, kg.a.d))
         .a(gy.f, $$1, cwj.b, false, kf.a().a(kg.c, $$4))
         .a(gy.d, $$1, cwj.b, false, kf.a().a(kg.c, $$4).a(kg.b, kg.a.b))
         .a(gy.e, $$1, cwj.b, false, kf.a().a(kg.c, $$4).a(kg.b, kg.a.c))
         .a(gy.c, $$1, cwj.b, false, kf.a().a(kg.c, $$4).a(kg.b, kg.a.d))
         .a(gy.f, $$1, cwj.a, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b))
         .a(gy.d, $$1, cwj.a, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.c))
         .a(gy.e, $$1, cwj.a, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.d))
         .a(gy.c, $$1, cwj.a, true, kf.a().a(kg.c, $$3))
         .a(gy.f, $$1, cwj.b, true, kf.a().a(kg.c, $$5).a(kg.b, kg.a.d))
         .a(gy.d, $$1, cwj.b, true, kf.a().a(kg.c, $$5))
         .a(gy.e, $$1, cwj.b, true, kf.a().a(kg.c, $$5).a(kg.b, kg.a.b))
         .a(gy.c, $$1, cwj.b, true, kf.a().a(kg.c, $$5).a(kg.b, kg.a.c));
   }

   private static jz a(cjt $$0, abb $$1, abb $$2, abb $$3, abb $$4, abb $$5, abb $$6, abb $$7, abb $$8) {
      return kc.a($$0).a(a(a(kd.a(cwe.S, cwe.ae, cwe.bf, cwe.u), cwk.b, $$1, $$2, $$3, $$4), cwk.a, $$5, $$6, $$7, $$8));
   }

   static jz c(cjt $$0, abb $$1, abb $$2) {
      return kb.a($$0)
         .a(kf.a().a(kg.c, $$1))
         .a(ka.a().a(cwe.M, true), kf.a().a(kg.c, $$2).a(kg.d, true))
         .a(ka.a().a(cwe.N, true), kf.a().a(kg.c, $$2).a(kg.b, kg.a.b).a(kg.d, true))
         .a(ka.a().a(cwe.O, true), kf.a().a(kg.c, $$2).a(kg.b, kg.a.c).a(kg.d, true))
         .a(ka.a().a(cwe.P, true), kf.a().a(kg.c, $$2).a(kg.b, kg.a.d).a(kg.d, true));
   }

   static jz a(cjt $$0, abb $$1, abb $$2, abb $$3) {
      return kb.a($$0)
         .a(ka.a().a(cwe.K, true), kf.a().a(kg.c, $$1))
         .a(ka.a().a(cwe.X, cwz.b), kf.a().a(kg.c, $$2).a(kg.d, true))
         .a(ka.a().a(cwe.W, cwz.b), kf.a().a(kg.c, $$2).a(kg.b, kg.a.b).a(kg.d, true))
         .a(ka.a().a(cwe.Y, cwz.b), kf.a().a(kg.c, $$2).a(kg.b, kg.a.c).a(kg.d, true))
         .a(ka.a().a(cwe.Z, cwz.b), kf.a().a(kg.c, $$2).a(kg.b, kg.a.d).a(kg.d, true))
         .a(ka.a().a(cwe.X, cwz.c), kf.a().a(kg.c, $$3).a(kg.d, true))
         .a(ka.a().a(cwe.W, cwz.c), kf.a().a(kg.c, $$3).a(kg.b, kg.a.b).a(kg.d, true))
         .a(ka.a().a(cwe.Y, cwz.c), kf.a().a(kg.c, $$3).a(kg.b, kg.a.c).a(kg.d, true))
         .a(ka.a().a(cwe.Z, cwz.c), kf.a().a(kg.c, $$3).a(kg.b, kg.a.d).a(kg.d, true));
   }

   static jz a(cjt $$0, abb $$1, abb $$2, abb $$3, abb $$4) {
      return kc.a($$0, kf.a().a(kg.d, true))
         .a(c())
         .a(
            kd.a(cwe.q, cwe.u)
               .a(false, false, kf.a().a(kg.c, $$2))
               .a(true, false, kf.a().a(kg.c, $$4))
               .a(false, true, kf.a().a(kg.c, $$1))
               .a(true, true, kf.a().a(kg.c, $$3))
         );
   }

   static jz b(cjt $$0, abb $$1, abb $$2, abb $$3) {
      return kc.a($$0)
         .a(
            kd.a(cwe.S, cwe.af, cwe.bj)
               .a(gy.f, cwn.b, cww.a, kf.a().a(kg.c, $$2))
               .a(gy.e, cwn.b, cww.a, kf.a().a(kg.c, $$2).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.d, cwn.b, cww.a, kf.a().a(kg.c, $$2).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.c, cwn.b, cww.a, kf.a().a(kg.c, $$2).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.f, cwn.b, cww.e, kf.a().a(kg.c, $$3))
               .a(gy.e, cwn.b, cww.e, kf.a().a(kg.c, $$3).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.d, cwn.b, cww.e, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.c, cwn.b, cww.e, kf.a().a(kg.c, $$3).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.f, cwn.b, cww.d, kf.a().a(kg.c, $$3).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.e, cwn.b, cww.d, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.d, cwn.b, cww.d, kf.a().a(kg.c, $$3))
               .a(gy.c, cwn.b, cww.d, kf.a().a(kg.c, $$3).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.f, cwn.b, cww.c, kf.a().a(kg.c, $$1))
               .a(gy.e, cwn.b, cww.c, kf.a().a(kg.c, $$1).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.d, cwn.b, cww.c, kf.a().a(kg.c, $$1).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.c, cwn.b, cww.c, kf.a().a(kg.c, $$1).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.f, cwn.b, cww.b, kf.a().a(kg.c, $$1).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.e, cwn.b, cww.b, kf.a().a(kg.c, $$1).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.d, cwn.b, cww.b, kf.a().a(kg.c, $$1))
               .a(gy.c, cwn.b, cww.b, kf.a().a(kg.c, $$1).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.f, cwn.a, cww.a, kf.a().a(kg.c, $$2).a(kg.a, kg.a.c).a(kg.d, true))
               .a(gy.e, cwn.a, cww.a, kf.a().a(kg.c, $$2).a(kg.a, kg.a.c).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.d, cwn.a, cww.a, kf.a().a(kg.c, $$2).a(kg.a, kg.a.c).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.c, cwn.a, cww.a, kf.a().a(kg.c, $$2).a(kg.a, kg.a.c).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.f, cwn.a, cww.e, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.e, cwn.a, cww.e, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.d, cwn.a, cww.e, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.c, cwn.a, cww.e, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.d, true))
               .a(gy.f, cwn.a, cww.d, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.d, true))
               .a(gy.e, cwn.a, cww.d, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.d, cwn.a, cww.d, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.c, cwn.a, cww.d, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.f, cwn.a, cww.c, kf.a().a(kg.c, $$1).a(kg.a, kg.a.c).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.e, cwn.a, cww.c, kf.a().a(kg.c, $$1).a(kg.a, kg.a.c).a(kg.b, kg.a.d).a(kg.d, true))
               .a(gy.d, cwn.a, cww.c, kf.a().a(kg.c, $$1).a(kg.a, kg.a.c).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.c, cwn.a, cww.c, kf.a().a(kg.c, $$1).a(kg.a, kg.a.c).a(kg.d, true))
               .a(gy.f, cwn.a, cww.b, kf.a().a(kg.c, $$1).a(kg.a, kg.a.c).a(kg.d, true))
               .a(gy.e, cwn.a, cww.b, kf.a().a(kg.c, $$1).a(kg.a, kg.a.c).a(kg.b, kg.a.c).a(kg.d, true))
               .a(gy.d, cwn.a, cww.b, kf.a().a(kg.c, $$1).a(kg.a, kg.a.c).a(kg.b, kg.a.b).a(kg.d, true))
               .a(gy.c, cwn.a, cww.b, kf.a().a(kg.c, $$1).a(kg.a, kg.a.c).a(kg.b, kg.a.d).a(kg.d, true))
         );
   }

   private static jz c(cjt $$0, abb $$1, abb $$2, abb $$3) {
      return kc.a($$0)
         .a(
            kd.a(cwe.S, cwe.af, cwe.u)
               .a(gy.c, cwn.b, false, kf.a().a(kg.c, $$2))
               .a(gy.d, cwn.b, false, kf.a().a(kg.c, $$2).a(kg.b, kg.a.c))
               .a(gy.f, cwn.b, false, kf.a().a(kg.c, $$2).a(kg.b, kg.a.b))
               .a(gy.e, cwn.b, false, kf.a().a(kg.c, $$2).a(kg.b, kg.a.d))
               .a(gy.c, cwn.a, false, kf.a().a(kg.c, $$1))
               .a(gy.d, cwn.a, false, kf.a().a(kg.c, $$1).a(kg.b, kg.a.c))
               .a(gy.f, cwn.a, false, kf.a().a(kg.c, $$1).a(kg.b, kg.a.b))
               .a(gy.e, cwn.a, false, kf.a().a(kg.c, $$1).a(kg.b, kg.a.d))
               .a(gy.c, cwn.b, true, kf.a().a(kg.c, $$3))
               .a(gy.d, cwn.b, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.c))
               .a(gy.f, cwn.b, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b))
               .a(gy.e, cwn.b, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.d))
               .a(gy.c, cwn.a, true, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.c))
               .a(gy.d, cwn.a, true, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.a))
               .a(gy.f, cwn.a, true, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.d))
               .a(gy.e, cwn.a, true, kf.a().a(kg.c, $$3).a(kg.a, kg.a.c).a(kg.b, kg.a.b))
         );
   }

   private static jz d(cjt $$0, abb $$1, abb $$2, abb $$3) {
      return kc.a($$0)
         .a(
            kd.a(cwe.S, cwe.af, cwe.u)
               .a(gy.c, cwn.b, false, kf.a().a(kg.c, $$2))
               .a(gy.d, cwn.b, false, kf.a().a(kg.c, $$2))
               .a(gy.f, cwn.b, false, kf.a().a(kg.c, $$2))
               .a(gy.e, cwn.b, false, kf.a().a(kg.c, $$2))
               .a(gy.c, cwn.a, false, kf.a().a(kg.c, $$1))
               .a(gy.d, cwn.a, false, kf.a().a(kg.c, $$1))
               .a(gy.f, cwn.a, false, kf.a().a(kg.c, $$1))
               .a(gy.e, cwn.a, false, kf.a().a(kg.c, $$1))
               .a(gy.c, cwn.b, true, kf.a().a(kg.c, $$3))
               .a(gy.d, cwn.b, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.c))
               .a(gy.f, cwn.b, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b))
               .a(gy.e, cwn.b, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.d))
               .a(gy.c, cwn.a, true, kf.a().a(kg.c, $$3))
               .a(gy.d, cwn.a, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.c))
               .a(gy.f, cwn.a, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b))
               .a(gy.e, cwn.a, true, kf.a().a(kg.c, $$3).a(kg.b, kg.a.d))
         );
   }

   static kc c(cjt $$0, abb $$1) {
      return kc.a($$0, kf.a().a(kg.c, $$1));
   }

   private static kd f() {
      return kd.a(cwe.J).a(gy.a.b, kf.a()).a(gy.a.c, kf.a().a(kg.a, kg.a.b)).a(gy.a.a, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.b));
   }

   static jz d(cjt $$0, abb $$1) {
      return kc.a($$0, kf.a().a(kg.c, $$1)).a(f());
   }

   private void e(cjt $$0, abb $$1) {
      this.b.accept(d($$0, $$1));
   }

   private void a(cjt $$0, kp.a $$1) {
      abb $$2 = $$1.create($$0, this.c);
      this.b.accept(d($$0, $$2));
   }

   private void b(cjt $$0, kp.a $$1) {
      abb $$2 = $$1.create($$0, this.c);
      this.b.accept(kc.a($$0, kf.a().a(kg.c, $$2)).a(b()));
   }

   static jz d(cjt $$0, abb $$1, abb $$2) {
      return kc.a($$0)
         .a(
            kd.a(cwe.J)
               .a(gy.a.b, kf.a().a(kg.c, $$1))
               .a(gy.a.c, kf.a().a(kg.c, $$2).a(kg.a, kg.a.b))
               .a(gy.a.a, kf.a().a(kg.c, $$2).a(kg.a, kg.a.b).a(kg.b, kg.a.b))
         );
   }

   private void a(cjt $$0, kp.a $$1, kp.a $$2) {
      abb $$3 = $$1.create($$0, this.c);
      abb $$4 = $$2.create($$0, this.c);
      this.b.accept(d($$0, $$3, $$4));
   }

   private abb a(cjt $$0, String $$1, kl $$2, Function<abb, kn> $$3) {
      return $$2.a($$0, $$1, (kn)$$3.apply(kn.a($$0, $$1)), this.c);
   }

   static jz e(cjt $$0, abb $$1, abb $$2) {
      return kc.a($$0).a(a(cwe.w, $$2, $$1));
   }

   static jz e(cjt $$0, abb $$1, abb $$2, abb $$3) {
      return kc.a($$0).a(kd.a(cwe.bi).a(cwv.b, kf.a().a(kg.c, $$1)).a(cwv.a, kf.a().a(kg.c, $$2)).a(cwv.c, kf.a().a(kg.c, $$3)));
   }

   private void e(cjt $$0) {
      this.c($$0, kp.a);
   }

   private void c(cjt $$0, kp.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.c)));
   }

   private void a(cjt $$0, kn $$1, kl $$2) {
      abb $$3 = $$2.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$3));
   }

   private jw.b f(cjt $$0) {
      kp $$1 = (kp)this.g.getOrDefault($$0, kp.a.get($$0));
      return new jw.b($$1.b()).a($$0, $$1.a());
   }

   void g(cjt $$0) {
      kn $$1 = kn.p($$0);
      abb $$2 = km.q.a($$0, $$1, this.c);
      abb $$3 = km.r.a($$0, $$1, this.c);
      abb $$4 = km.s.a($$0, $$1, this.c);
      abb $$5 = km.t.a($$0, $$1, this.c);
      abb $$6 = km.u.a($$0, $$1, this.c);
      abb $$7 = km.v.a($$0, $$1, this.c);
      abb $$8 = km.w.a($$0, $$1, this.c);
      abb $$9 = km.x.a($$0, $$1, this.c);
      this.a($$0.l());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void h(cjt $$0) {
      kn $$1 = kn.b($$0);
      abb $$2 = km.V.a($$0, $$1, this.c);
      abb $$3 = km.W.a($$0, $$1, this.c);
      abb $$4 = km.X.a($$0, $$1, this.c);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void i(cjt $$0) {
      kn $$1 = kn.b($$0);
      abb $$2 = km.S.a($$0, $$1, this.c);
      abb $$3 = km.T.a($$0, $$1, this.c);
      abb $$4 = km.U.a($$0, $$1, this.c);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void g() {
      this.a(cju.ql);
      abb $$0 = kk.a(cju.ql);
      abb $$1 = kk.a(cju.ql, "_partial_tilt");
      abb $$2 = kk.a(cju.ql, "_full_tilt");
      this.b
         .accept(
            kc.a(cju.ql)
               .a(b())
               .a(kd.a(cwe.bm).a(cwy.a, kf.a().a(kg.c, $$0)).a(cwy.b, kf.a().a(kg.c, $$0)).a(cwy.c, kf.a().a(kg.c, $$1)).a(cwy.d, kf.a().a(kg.c, $$2)))
         );
   }

   private jw.e j(cjt $$0) {
      return new jw.e(kn.l($$0));
   }

   private void k(cjt $$0) {
      this.a($$0, $$0);
   }

   private void a(cjt $$0, cjt $$1) {
      this.b.accept(c($$0, kk.a($$1)));
   }

   private void a(cjt $$0, jw.d $$1) {
      this.b($$0);
      this.b($$0, $$1);
   }

   private void a(cjt $$0, jw.d $$1, kn $$2) {
      this.b($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cjt $$0, jw.d $$1) {
      kn $$2 = kn.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(cjt $$0, jw.d $$1, kn $$2) {
      abb $$3 = $$1.a().a($$0, $$2, this.c);
      this.b.accept(c($$0, $$3));
   }

   private void a(cjt $$0, cjt $$1, jw.d $$2) {
      this.a($$0, $$2);
      kn $$3 = kn.d($$0);
      abb $$4 = $$2.b().a($$1, $$3, this.c);
      this.b.accept(c($$1, $$4));
   }

   private void b(cjt $$0, cjt $$1) {
      kp $$2 = kp.k.get($$0);
      abb $$3 = $$2.a($$0, this.c);
      this.b.accept(c($$0, $$3));
      abb $$4 = km.aj.a($$1, $$2.b(), this.c);
      this.b.accept(kc.a($$1, kf.a().a(kg.c, $$4)).a(b()));
      this.b($$0);
   }

   private void c(cjt $$0, cjt $$1) {
      this.a($$0.l());
      kn $$2 = kn.g($$0);
      kn $$3 = kn.a($$0, $$1);
      abb $$4 = km.av.a($$1, $$3, this.c);
      this.b
         .accept(
            kc.a($$1, kf.a().a(kg.c, $$4))
               .a(kd.a(cwe.S).a(gy.e, kf.a()).a(gy.d, kf.a().a(kg.b, kg.a.d)).a(gy.c, kf.a().a(kg.b, kg.a.b)).a(gy.f, kf.a().a(kg.b, kg.a.c)))
         );
      this.b.accept(kc.a($$0).a(kd.a(cwe.av).a($$2x -> kf.a().a(kg.c, km.au[$$2x].a($$0, $$2, this.c)))));
   }

   private void a(cjt $$0, cjt $$1, cjt $$2, cjt $$3, cjt $$4, cjt $$5, cjt $$6, cjt $$7) {
      this.a($$0, jw.d.b);
      this.a($$1, jw.d.b);
      this.e($$2);
      this.e($$3);
      this.b($$4, $$6);
      this.b($$5, $$7);
   }

   private void c(cjt $$0, jw.d $$1) {
      this.a($$0, "_top");
      abb $$2 = this.a($$0, "_top", $$1.a(), kn::c);
      abb $$3 = this.a($$0, "_bottom", $$1.a(), kn::c);
      this.f($$0, $$2, $$3);
   }

   private void h() {
      this.a(cju.hB, "_front");
      abb $$0 = kk.a(cju.hB, "_top");
      abb $$1 = this.a(cju.hB, "_bottom", jw.d.b.a(), kn::c);
      this.f(cju.hB, $$0, $$1);
   }

   private void i() {
      abb $$0 = this.a(cju.bk, "_top", km.aL, kn::a);
      abb $$1 = this.a(cju.bk, "_bottom", km.aL, kn::a);
      this.f(cju.bk, $$0, $$1);
   }

   private void j() {
      this.a(cju.qn);
      abb $$0 = kk.a(cju.qn, "_top");
      abb $$1 = kk.a(cju.qn, "_bottom");
      this.b.accept(kc.a(cju.qn).a(b()).a(kd.a(cwe.ae).a(cwk.b, kf.a().a(kg.c, $$1)).a(cwk.a, kf.a().a(kg.c, $$0))));
   }

   private void f(cjt $$0, abb $$1, abb $$2) {
      this.b.accept(kc.a($$0).a(kd.a(cwe.ae).a(cwk.b, kf.a().a(kg.c, $$2)).a(cwk.a, kf.a().a(kg.c, $$1))));
   }

   private void l(cjt $$0) {
      kn $$1 = kn.e($$0);
      kn $$2 = kn.e(kn.a($$0, "_corner"));
      abb $$3 = km.ad.a($$0, $$1, this.c);
      abb $$4 = km.ae.a($$0, $$2, this.c);
      abb $$5 = km.af.a($$0, $$1, this.c);
      abb $$6 = km.ag.a($$0, $$1, this.c);
      this.b($$0);
      this.b
         .accept(
            kc.a($$0)
               .a(
                  kd.a(cwe.ag)
                     .a(cws.a, kf.a().a(kg.c, $$3))
                     .a(cws.b, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b))
                     .a(cws.c, kf.a().a(kg.c, $$5).a(kg.b, kg.a.b))
                     .a(cws.d, kf.a().a(kg.c, $$6).a(kg.b, kg.a.b))
                     .a(cws.e, kf.a().a(kg.c, $$5))
                     .a(cws.f, kf.a().a(kg.c, $$6))
                     .a(cws.g, kf.a().a(kg.c, $$4))
                     .a(cws.h, kf.a().a(kg.c, $$4).a(kg.b, kg.a.b))
                     .a(cws.i, kf.a().a(kg.c, $$4).a(kg.b, kg.a.c))
                     .a(cws.j, kf.a().a(kg.c, $$4).a(kg.b, kg.a.d))
               )
         );
   }

   private void m(cjt $$0) {
      abb $$1 = this.a($$0, "", km.ad, kn::e);
      abb $$2 = this.a($$0, "", km.af, kn::e);
      abb $$3 = this.a($$0, "", km.ag, kn::e);
      abb $$4 = this.a($$0, "_on", km.ad, kn::e);
      abb $$5 = this.a($$0, "_on", km.af, kn::e);
      abb $$6 = this.a($$0, "_on", km.ag, kn::e);
      kd $$7 = kd.a(cwe.w, cwe.ah).a(($$6x, $$7x) -> {
         switch($$7x) {
            case a:
               return kf.a().a(kg.c, $$6x ? $$4 : $$1);
            case b:
               return kf.a().a(kg.c, $$6x ? $$4 : $$1).a(kg.b, kg.a.b);
            case c:
               return kf.a().a(kg.c, $$6x ? $$5 : $$2).a(kg.b, kg.a.b);
            case d:
               return kf.a().a(kg.c, $$6x ? $$6 : $$3).a(kg.b, kg.a.b);
            case e:
               return kf.a().a(kg.c, $$6x ? $$5 : $$2);
            case f:
               return kf.a().a(kg.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.b($$0);
      this.b.accept(kc.a($$0).a($$7));
   }

   private jw.a a(abb $$0, cjt $$1) {
      return new jw.a($$0, $$1);
   }

   private jw.a d(cjt $$0, cjt $$1) {
      return new jw.a(kk.a($$0), $$1);
   }

   private void a(cjt $$0, cat $$1) {
      abb $$2 = km.L.a($$0, kn.a($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void f(cjt $$0, abb $$1) {
      abb $$2 = km.L.a($$0, kn.h($$1), this.c);
      this.b.accept(c($$0, $$2));
   }

   private void e(cjt $$0, cjt $$1) {
      this.e($$0);
      abb $$2 = kp.i.get($$0).a($$1, this.c);
      this.b.accept(c($$1, $$2));
   }

   private void a(kp.a $$0, cjt... $$1) {
      for(cjt $$2 : $$1) {
         abb $$3 = $$0.create($$2, this.c);
         this.b.accept(b($$2, $$3));
      }

   }

   private void b(kp.a $$0, cjt... $$1) {
      for(cjt $$2 : $$1) {
         abb $$3 = $$0.create($$2, this.c);
         this.b.accept(kc.a($$2, kf.a().a(kg.c, $$3)).a(c()));
      }

   }

   private void f(cjt $$0, cjt $$1) {
      this.e($$0);
      kn $$2 = kn.b($$0, $$1);
      abb $$3 = km.ap.a($$1, $$2, this.c);
      abb $$4 = km.aq.a($$1, $$2, this.c);
      abb $$5 = km.ar.a($$1, $$2, this.c);
      abb $$6 = km.an.a($$1, $$2, this.c);
      abb $$7 = km.ao.a($$1, $$2, this.c);
      cat $$8 = $$1.l();
      km.aW.a(kk.a($$8), kn.B($$0), this.c);
      this.b
         .accept(
            kb.a($$1)
               .a(kf.a().a(kg.c, $$3))
               .a(ka.a().a(cwe.M, true), kf.a().a(kg.c, $$4))
               .a(ka.a().a(cwe.N, true), kf.a().a(kg.c, $$4).a(kg.b, kg.a.b))
               .a(ka.a().a(cwe.O, true), kf.a().a(kg.c, $$5))
               .a(ka.a().a(cwe.P, true), kf.a().a(kg.c, $$5).a(kg.b, kg.a.b))
               .a(ka.a().a(cwe.M, false), kf.a().a(kg.c, $$6))
               .a(ka.a().a(cwe.N, false), kf.a().a(kg.c, $$7))
               .a(ka.a().a(cwe.O, false), kf.a().a(kg.c, $$7).a(kg.b, kg.a.b))
               .a(ka.a().a(cwe.P, false), kf.a().a(kg.c, $$6).a(kg.b, kg.a.d))
         );
   }

   private void n(cjt $$0) {
      kn $$1 = kn.v($$0);
      abb $$2 = km.as.a($$0, $$1, this.c);
      abb $$3 = this.a($$0, "_conditional", km.as, $$1x -> $$1.c(ko.i, $$1x));
      this.b.accept(kc.a($$0).a(a(cwe.c, $$3, $$2)).a(e()));
   }

   private void o(cjt $$0) {
      abb $$1 = kp.m.create($$0, this.c);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<kf> a(int $$0) {
      String $$1 = "_age" + $$0;
      return (List<kf>)IntStream.range(1, 5).mapToObj($$1x -> kf.a().a(kg.c, kk.a(cju.lK, $$1x + $$1))).collect(Collectors.toList());
   }

   private void k() {
      this.a(cju.lK);
      this.b
         .accept(
            kb.a(cju.lK)
               .a(ka.a().a(cwe.aq, 0), this.a(0))
               .a(ka.a().a(cwe.aq, 1), this.a(1))
               .a(ka.a().a(cwe.bl, cwb.b), kf.a().a(kg.c, kk.a(cju.lK, "_small_leaves")))
               .a(ka.a().a(cwe.bl, cwb.c), kf.a().a(kg.c, kk.a(cju.lK, "_large_leaves")))
         );
   }

   private kd l() {
      return kd.a(cwe.Q)
         .a(gy.a, kf.a().a(kg.a, kg.a.c))
         .a(gy.b, kf.a())
         .a(gy.c, kf.a().a(kg.a, kg.a.b))
         .a(gy.d, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.c))
         .a(gy.e, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.d))
         .a(gy.f, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.b));
   }

   private void m() {
      abb $$0 = kn.a(cju.mF, "_top_open");
      this.b
         .accept(
            kc.a(cju.mF)
               .a(this.l())
               .a(
                  kd.a(cwe.u)
                     .a(false, kf.a().a(kg.c, kp.e.create(cju.mF, this.c)))
                     .a(true, kf.a().a(kg.c, kp.e.get(cju.mF).a($$1 -> $$1.a(ko.f, $$0)).a(cju.mF, "_open", this.c)))
               )
         );
   }

   private static <T extends Comparable<T>> kd a(cwr<T> $$0, T $$1, abb $$2, abb $$3) {
      kf $$4 = kf.a().a(kg.c, $$2);
      kf $$5 = kf.a().a(kg.c, $$3);
      return kd.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(cjt $$0, Function<cjt, kn> $$1) {
      kn $$2 = ((kn)$$1.apply($$0)).b(ko.i, ko.c);
      kn $$3 = $$2.c(ko.g, kn.a($$0, "_front_honey"));
      abb $$4 = km.l.a($$0, $$2, this.c);
      abb $$5 = km.l.a($$0, "_honey", $$3, this.c);
      this.b.accept(kc.a($$0).a(b()).a(a(cwe.aN, 5, $$5, $$4)));
   }

   private void a(cjt $$0, cwr<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<abb> $$3 = new Int2ObjectOpenHashMap();
         kd $$4 = kd.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            abb $$5 = (abb)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, km.aw, kn::g));
            return kf.a().a(kg.c, $$5);
         });
         this.a($$0.l());
         this.b.accept(kc.a($$0).a($$4));
      }
   }

   private void n() {
      abb $$0 = kk.a(cju.mO, "_floor");
      abb $$1 = kk.a(cju.mO, "_ceiling");
      abb $$2 = kk.a(cju.mO, "_wall");
      abb $$3 = kk.a(cju.mO, "_between_walls");
      this.a(caz.uf);
      this.b
         .accept(
            kc.a(cju.mO)
               .a(
                  kd.a(cwe.S, cwe.V)
                     .a(gy.c, cwd.a, kf.a().a(kg.c, $$0))
                     .a(gy.d, cwd.a, kf.a().a(kg.c, $$0).a(kg.b, kg.a.c))
                     .a(gy.f, cwd.a, kf.a().a(kg.c, $$0).a(kg.b, kg.a.b))
                     .a(gy.e, cwd.a, kf.a().a(kg.c, $$0).a(kg.b, kg.a.d))
                     .a(gy.c, cwd.b, kf.a().a(kg.c, $$1))
                     .a(gy.d, cwd.b, kf.a().a(kg.c, $$1).a(kg.b, kg.a.c))
                     .a(gy.f, cwd.b, kf.a().a(kg.c, $$1).a(kg.b, kg.a.b))
                     .a(gy.e, cwd.b, kf.a().a(kg.c, $$1).a(kg.b, kg.a.d))
                     .a(gy.c, cwd.c, kf.a().a(kg.c, $$2).a(kg.b, kg.a.d))
                     .a(gy.d, cwd.c, kf.a().a(kg.c, $$2).a(kg.b, kg.a.b))
                     .a(gy.f, cwd.c, kf.a().a(kg.c, $$2))
                     .a(gy.e, cwd.c, kf.a().a(kg.c, $$2).a(kg.b, kg.a.c))
                     .a(gy.d, cwd.d, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b))
                     .a(gy.c, cwd.d, kf.a().a(kg.c, $$3).a(kg.b, kg.a.d))
                     .a(gy.f, cwd.d, kf.a().a(kg.c, $$3))
                     .a(gy.e, cwd.d, kf.a().a(kg.c, $$3).a(kg.b, kg.a.c))
               )
         );
   }

   private void o() {
      this.b
         .accept(
            kc.a(cju.mK, kf.a().a(kg.c, kk.a(cju.mK)))
               .a(
                  kd.a(cwe.U, cwe.S)
                     .a(cwa.a, gy.c, kf.a())
                     .a(cwa.a, gy.f, kf.a().a(kg.b, kg.a.b))
                     .a(cwa.a, gy.d, kf.a().a(kg.b, kg.a.c))
                     .a(cwa.a, gy.e, kf.a().a(kg.b, kg.a.d))
                     .a(cwa.b, gy.c, kf.a().a(kg.a, kg.a.b))
                     .a(cwa.b, gy.f, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.b))
                     .a(cwa.b, gy.d, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.c))
                     .a(cwa.b, gy.e, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.d))
                     .a(cwa.c, gy.d, kf.a().a(kg.a, kg.a.c))
                     .a(cwa.c, gy.e, kf.a().a(kg.a, kg.a.c).a(kg.b, kg.a.b))
                     .a(cwa.c, gy.c, kf.a().a(kg.a, kg.a.c).a(kg.b, kg.a.c))
                     .a(cwa.c, gy.f, kf.a().a(kg.a, kg.a.c).a(kg.b, kg.a.d))
               )
         );
   }

   private void d(cjt $$0, kp.a $$1) {
      abb $$2 = $$1.create($$0, this.c);
      abb $$3 = kn.a($$0, "_front_on");
      abb $$4 = $$1.get($$0).a($$1x -> $$1x.a(ko.g, $$3)).a($$0, "_on", this.c);
      this.b.accept(kc.a($$0).a(a(cwe.r, $$4, $$2)).a(b()));
   }

   private void a(cjt... $$0) {
      abb $$1 = kk.a("campfire_off");

      for(cjt $$2 : $$0) {
         abb $$3 = km.aD.a($$2, kn.A($$2), this.c);
         this.a($$2.l());
         this.b.accept(kc.a($$2).a(a(cwe.r, $$3, $$1)).a(c()));
      }

   }

   private void p(cjt $$0) {
      abb $$1 = km.aU.a($$0, kn.k($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void q(cjt $$0) {
      abb $$1 = km.aV.a($$0, kn.k($$0), this.c);
      this.b.accept(c($$0, $$1));
   }

   private void p() {
      kn $$0 = kn.a(kn.C(cju.bX), kn.C(cju.n));
      abb $$1 = km.f.a(cju.bX, $$0, this.c);
      this.b.accept(c(cju.bX, $$1));
   }

   private void q() {
      this.a(caz.kK);
      this.b
         .accept(
            kb.a(cju.ch)
               .a(
                  ka.b(
                     ka.a().a(cwe.ab, cwt.c).a(cwe.aa, cwt.c).a(cwe.ac, cwt.c).a(cwe.ad, cwt.c),
                     ka.a().a(cwe.ab, cwt.b, cwt.a).a(cwe.aa, cwt.b, cwt.a),
                     ka.a().a(cwe.aa, cwt.b, cwt.a).a(cwe.ac, cwt.b, cwt.a),
                     ka.a().a(cwe.ac, cwt.b, cwt.a).a(cwe.ad, cwt.b, cwt.a),
                     ka.a().a(cwe.ad, cwt.b, cwt.a).a(cwe.ab, cwt.b, cwt.a)
                  ),
                  kf.a().a(kg.c, kk.a("redstone_dust_dot"))
               )
               .a(ka.a().a(cwe.ab, cwt.b, cwt.a), kf.a().a(kg.c, kk.a("redstone_dust_side0")))
               .a(ka.a().a(cwe.ac, cwt.b, cwt.a), kf.a().a(kg.c, kk.a("redstone_dust_side_alt0")))
               .a(ka.a().a(cwe.aa, cwt.b, cwt.a), kf.a().a(kg.c, kk.a("redstone_dust_side_alt1")).a(kg.b, kg.a.d))
               .a(ka.a().a(cwe.ad, cwt.b, cwt.a), kf.a().a(kg.c, kk.a("redstone_dust_side1")).a(kg.b, kg.a.d))
               .a(ka.a().a(cwe.ab, cwt.a), kf.a().a(kg.c, kk.a("redstone_dust_up")))
               .a(ka.a().a(cwe.aa, cwt.a), kf.a().a(kg.c, kk.a("redstone_dust_up")).a(kg.b, kg.a.b))
               .a(ka.a().a(cwe.ac, cwt.a), kf.a().a(kg.c, kk.a("redstone_dust_up")).a(kg.b, kg.a.c))
               .a(ka.a().a(cwe.ad, cwt.a), kf.a().a(kg.c, kk.a("redstone_dust_up")).a(kg.b, kg.a.d))
         );
   }

   private void r() {
      this.a(caz.kO);
      this.b
         .accept(
            kc.a(cju.fZ)
               .a(c())
               .a(
                  kd.a(cwe.be, cwe.w)
                     .a(cwh.a, false, kf.a().a(kg.c, kk.a(cju.fZ)))
                     .a(cwh.a, true, kf.a().a(kg.c, kk.a(cju.fZ, "_on")))
                     .a(cwh.b, false, kf.a().a(kg.c, kk.a(cju.fZ, "_subtract")))
                     .a(cwh.b, true, kf.a().a(kg.c, kk.a(cju.fZ, "_on_subtract")))
               )
         );
   }

   private void s() {
      kn $$0 = kn.a(cju.iM);
      kn $$1 = kn.a(kn.a(cju.iz, "_side"), $$0.a(ko.f));
      abb $$2 = km.M.a(cju.iz, $$1, this.c);
      abb $$3 = km.N.a(cju.iz, $$1, this.c);
      abb $$4 = km.f.b(cju.iz, "_double", $$1, this.c);
      this.b.accept(e(cju.iz, $$2, $$3, $$4));
      this.b.accept(c(cju.iM, km.c.a(cju.iM, $$0, this.c)));
   }

   private void t() {
      this.a(caz.qy);
      this.b
         .accept(
            kb.a(cju.ez)
               .a(kf.a().a(kg.c, kn.C(cju.ez)))
               .a(ka.a().a(cwe.k, true), kf.a().a(kg.c, kn.a(cju.ez, "_bottle0")))
               .a(ka.a().a(cwe.l, true), kf.a().a(kg.c, kn.a(cju.ez, "_bottle1")))
               .a(ka.a().a(cwe.m, true), kf.a().a(kg.c, kn.a(cju.ez, "_bottle2")))
               .a(ka.a().a(cwe.k, false), kf.a().a(kg.c, kn.a(cju.ez, "_empty0")))
               .a(ka.a().a(cwe.l, false), kf.a().a(kg.c, kn.a(cju.ez, "_empty1")))
               .a(ka.a().a(cwe.m, false), kf.a().a(kg.c, kn.a(cju.ez, "_empty2")))
         );
   }

   private void r(cjt $$0) {
      abb $$1 = km.aQ.a($$0, kn.b($$0), this.c);
      abb $$2 = kk.a("mushroom_block_inside");
      this.b
         .accept(
            kb.a($$0)
               .a(ka.a().a(cwe.M, true), kf.a().a(kg.c, $$1))
               .a(ka.a().a(cwe.N, true), kf.a().a(kg.c, $$1).a(kg.b, kg.a.b).a(kg.d, true))
               .a(ka.a().a(cwe.O, true), kf.a().a(kg.c, $$1).a(kg.b, kg.a.c).a(kg.d, true))
               .a(ka.a().a(cwe.P, true), kf.a().a(kg.c, $$1).a(kg.b, kg.a.d).a(kg.d, true))
               .a(ka.a().a(cwe.K, true), kf.a().a(kg.c, $$1).a(kg.a, kg.a.d).a(kg.d, true))
               .a(ka.a().a(cwe.L, true), kf.a().a(kg.c, $$1).a(kg.a, kg.a.b).a(kg.d, true))
               .a(ka.a().a(cwe.M, false), kf.a().a(kg.c, $$2))
               .a(ka.a().a(cwe.N, false), kf.a().a(kg.c, $$2).a(kg.b, kg.a.b).a(kg.d, false))
               .a(ka.a().a(cwe.O, false), kf.a().a(kg.c, $$2).a(kg.b, kg.a.c).a(kg.d, false))
               .a(ka.a().a(cwe.P, false), kf.a().a(kg.c, $$2).a(kg.b, kg.a.d).a(kg.d, false))
               .a(ka.a().a(cwe.K, false), kf.a().a(kg.c, $$2).a(kg.a, kg.a.d).a(kg.d, false))
               .a(ka.a().a(cwe.L, false), kf.a().a(kg.c, $$2).a(kg.a, kg.a.b).a(kg.d, false))
         );
      this.a($$0, kp.a.createWithSuffix($$0, "_inventory", this.c));
   }

   private void u() {
      this.a(caz.pK);
      this.b
         .accept(
            kc.a(cju.dq)
               .a(
                  kd.a(cwe.ay)
                     .a(0, kf.a().a(kg.c, kk.a(cju.dq)))
                     .a(1, kf.a().a(kg.c, kk.a(cju.dq, "_slice1")))
                     .a(2, kf.a().a(kg.c, kk.a(cju.dq, "_slice2")))
                     .a(3, kf.a().a(kg.c, kk.a(cju.dq, "_slice3")))
                     .a(4, kf.a().a(kg.c, kk.a(cju.dq, "_slice4")))
                     .a(5, kf.a().a(kg.c, kk.a(cju.dq, "_slice5")))
                     .a(6, kf.a().a(kg.c, kk.a(cju.dq, "_slice6")))
               )
         );
   }

   private void v() {
      kn $$0 = new kn()
         .a(ko.c, kn.a(cju.mI, "_side3"))
         .a(ko.o, kn.C(cju.s))
         .a(ko.n, kn.a(cju.mI, "_top"))
         .a(ko.j, kn.a(cju.mI, "_side3"))
         .a(ko.l, kn.a(cju.mI, "_side3"))
         .a(ko.k, kn.a(cju.mI, "_side1"))
         .a(ko.m, kn.a(cju.mI, "_side2"));
      this.b.accept(c(cju.mI, km.a.a(cju.mI, $$0, this.c)));
   }

   private void w() {
      kn $$0 = new kn()
         .a(ko.c, kn.a(cju.mM, "_front"))
         .a(ko.o, kn.a(cju.mM, "_bottom"))
         .a(ko.n, kn.a(cju.mM, "_top"))
         .a(ko.j, kn.a(cju.mM, "_front"))
         .a(ko.k, kn.a(cju.mM, "_front"))
         .a(ko.l, kn.a(cju.mM, "_side"))
         .a(ko.m, kn.a(cju.mM, "_side"));
      this.b.accept(c(cju.mM, km.a.a(cju.mM, $$0, this.c)));
   }

   private void a(cjt $$0, cjt $$1, BiFunction<cjt, cjt, kn> $$2) {
      kn $$3 = (kn)$$2.apply($$0, $$1);
      this.b.accept(c($$0, km.a.a($$0, $$3, this.c)));
   }

   private void x() {
      kn $$0 = kn.j(cju.de);
      this.b.accept(c(cju.de, kk.a(cju.de)));
      this.a(cju.do, $$0);
      this.a(cju.dp, $$0);
   }

   private void a(cjt $$0, kn $$1) {
      abb $$2 = km.k.a($$0, $$1.c(ko.g, kn.C($$0)), this.c);
      this.b.accept(kc.a($$0, kf.a().a(kg.c, $$2)).a(b()));
   }

   private void y() {
      this.a(caz.qz);
      this.k(cju.eA);
      this.b.accept(c(cju.eC, km.aT.a(cju.eC, kn.j(kn.a(cju.D, "_still")), this.c)));
      this.b
         .accept(
            kc.a(cju.eB)
               .a(
                  kd.a(cns.e)
                     .a(1, kf.a().a(kg.c, km.aR.a(cju.eB, "_level1", kn.j(kn.a(cju.C, "_still")), this.c)))
                     .a(2, kf.a().a(kg.c, km.aS.a(cju.eB, "_level2", kn.j(kn.a(cju.C, "_still")), this.c)))
                     .a(3, kf.a().a(kg.c, km.aT.a(cju.eB, "_full", kn.j(kn.a(cju.C, "_still")), this.c)))
               )
         );
      this.b
         .accept(
            kc.a(cju.eD)
               .a(
                  kd.a(cns.e)
                     .a(1, kf.a().a(kg.c, km.aR.a(cju.eD, "_level1", kn.j(kn.C(cju.pn)), this.c)))
                     .a(2, kf.a().a(kg.c, km.aS.a(cju.eD, "_level2", kn.j(kn.C(cju.pn)), this.c)))
                     .a(3, kf.a().a(kg.c, km.aT.a(cju.eD, "_full", kn.j(kn.C(cju.pn)), this.c)))
               )
         );
   }

   private void z() {
      kn $$0 = kn.b(cju.jk);
      abb $$1 = km.al.a(cju.jk, $$0, this.c);
      abb $$2 = this.a(cju.jk, "_dead", km.al, $$1x -> $$0.c(ko.b, $$1x));
      this.b.accept(kc.a(cju.jk).a(a(cwe.au, 5, $$2, $$1)));
   }

   private void s(cjt $$0) {
      kn $$1 = new kn().a(ko.f, kn.a(cju.co, "_top")).a(ko.i, kn.a(cju.co, "_side")).a(ko.g, kn.a($$0, "_front"));
      kn $$2 = new kn().a(ko.i, kn.a(cju.co, "_top")).a(ko.g, kn.a($$0, "_front_vertical"));
      abb $$3 = km.k.a($$0, $$1, this.c);
      abb $$4 = km.m.a($$0, $$2, this.c);
      this.b
         .accept(
            kc.a($$0)
               .a(
                  kd.a(cwe.Q)
                     .a(gy.a, kf.a().a(kg.c, $$4).a(kg.a, kg.a.c))
                     .a(gy.b, kf.a().a(kg.c, $$4))
                     .a(gy.c, kf.a().a(kg.c, $$3))
                     .a(gy.f, kf.a().a(kg.c, $$3).a(kg.b, kg.a.b))
                     .a(gy.d, kf.a().a(kg.c, $$3).a(kg.b, kg.a.c))
                     .a(gy.e, kf.a().a(kg.c, $$3).a(kg.b, kg.a.d))
               )
         );
   }

   private void A() {
      abb $$0 = kk.a(cju.eF);
      abb $$1 = kk.a(cju.eF, "_filled");
      this.b.accept(kc.a(cju.eF).a(kd.a(cwe.h).a(false, kf.a().a(kg.c, $$0)).a(true, kf.a().a(kg.c, $$1))).a(c()));
   }

   private void B() {
      abb $$0 = kk.a(cju.jj, "_side");
      abb $$1 = kk.a(cju.jj, "_noside");
      abb $$2 = kk.a(cju.jj, "_noside1");
      abb $$3 = kk.a(cju.jj, "_noside2");
      abb $$4 = kk.a(cju.jj, "_noside3");
      this.b
         .accept(
            kb.a(cju.jj)
               .a(ka.a().a(cwe.M, true), kf.a().a(kg.c, $$0))
               .a(ka.a().a(cwe.N, true), kf.a().a(kg.c, $$0).a(kg.b, kg.a.b).a(kg.d, true))
               .a(ka.a().a(cwe.O, true), kf.a().a(kg.c, $$0).a(kg.b, kg.a.c).a(kg.d, true))
               .a(ka.a().a(cwe.P, true), kf.a().a(kg.c, $$0).a(kg.b, kg.a.d).a(kg.d, true))
               .a(ka.a().a(cwe.K, true), kf.a().a(kg.c, $$0).a(kg.a, kg.a.d).a(kg.d, true))
               .a(ka.a().a(cwe.L, true), kf.a().a(kg.c, $$0).a(kg.a, kg.a.b).a(kg.d, true))
               .a(ka.a().a(cwe.M, false), kf.a().a(kg.c, $$1).a(kg.e, 2), kf.a().a(kg.c, $$2), kf.a().a(kg.c, $$3), kf.a().a(kg.c, $$4))
               .a(
                  ka.a().a(cwe.N, false),
                  kf.a().a(kg.c, $$2).a(kg.b, kg.a.b).a(kg.d, true),
                  kf.a().a(kg.c, $$3).a(kg.b, kg.a.b).a(kg.d, true),
                  kf.a().a(kg.c, $$4).a(kg.b, kg.a.b).a(kg.d, true),
                  kf.a().a(kg.c, $$1).a(kg.e, 2).a(kg.b, kg.a.b).a(kg.d, true)
               )
               .a(
                  ka.a().a(cwe.O, false),
                  kf.a().a(kg.c, $$3).a(kg.b, kg.a.c).a(kg.d, true),
                  kf.a().a(kg.c, $$4).a(kg.b, kg.a.c).a(kg.d, true),
                  kf.a().a(kg.c, $$1).a(kg.e, 2).a(kg.b, kg.a.c).a(kg.d, true),
                  kf.a().a(kg.c, $$2).a(kg.b, kg.a.c).a(kg.d, true)
               )
               .a(
                  ka.a().a(cwe.P, false),
                  kf.a().a(kg.c, $$4).a(kg.b, kg.a.d).a(kg.d, true),
                  kf.a().a(kg.c, $$1).a(kg.e, 2).a(kg.b, kg.a.d).a(kg.d, true),
                  kf.a().a(kg.c, $$2).a(kg.b, kg.a.d).a(kg.d, true),
                  kf.a().a(kg.c, $$3).a(kg.b, kg.a.d).a(kg.d, true)
               )
               .a(
                  ka.a().a(cwe.K, false),
                  kf.a().a(kg.c, $$1).a(kg.e, 2).a(kg.a, kg.a.d).a(kg.d, true),
                  kf.a().a(kg.c, $$4).a(kg.a, kg.a.d).a(kg.d, true),
                  kf.a().a(kg.c, $$2).a(kg.a, kg.a.d).a(kg.d, true),
                  kf.a().a(kg.c, $$3).a(kg.a, kg.a.d).a(kg.d, true)
               )
               .a(
                  ka.a().a(cwe.L, false),
                  kf.a().a(kg.c, $$4).a(kg.a, kg.a.b).a(kg.d, true),
                  kf.a().a(kg.c, $$3).a(kg.a, kg.a.b).a(kg.d, true),
                  kf.a().a(kg.c, $$2).a(kg.a, kg.a.b).a(kg.d, true),
                  kf.a().a(kg.c, $$1).a(kg.e, 2).a(kg.a, kg.a.b).a(kg.d, true)
               )
         );
   }

   private void C() {
      this.b
         .accept(
            kb.a(cju.nN)
               .a(kf.a().a(kg.c, kn.C(cju.nN)))
               .a(ka.a().a(cwe.aL, 1), kf.a().a(kg.c, kn.a(cju.nN, "_contents1")))
               .a(ka.a().a(cwe.aL, 2), kf.a().a(kg.c, kn.a(cju.nN, "_contents2")))
               .a(ka.a().a(cwe.aL, 3), kf.a().a(kg.c, kn.a(cju.nN, "_contents3")))
               .a(ka.a().a(cwe.aL, 4), kf.a().a(kg.c, kn.a(cju.nN, "_contents4")))
               .a(ka.a().a(cwe.aL, 5), kf.a().a(kg.c, kn.a(cju.nN, "_contents5")))
               .a(ka.a().a(cwe.aL, 6), kf.a().a(kg.c, kn.a(cju.nN, "_contents6")))
               .a(ka.a().a(cwe.aL, 7), kf.a().a(kg.c, kn.a(cju.nN, "_contents7")))
               .a(ka.a().a(cwe.aL, 8), kf.a().a(kg.c, kn.a(cju.nN, "_contents_ready")))
         );
   }

   private void t(cjt $$0) {
      this.a($$0);
      this.b.accept(kc.a($$0, kf.a().a(kg.c, km.Z.a($$0, kn.c($$0), this.c))).a(this.l()));
   }

   private void D() {
      this.t(cju.pj);
      this.t(cju.pi);
      this.t(cju.ph);
      this.t(cju.pg);
   }

   private void E() {
      this.a(cju.qc);
      kd.b<gy, cwl> $$0 = kd.a(cwe.bn, cwe.bo);

      for(cwl $$1 : cwl.values()) {
         $$0.a(gy.b, $$1, this.a(gy.b, $$1));
      }

      for(cwl $$2 : cwl.values()) {
         $$0.a(gy.a, $$2, this.a(gy.a, $$2));
      }

      this.b.accept(kc.a(cju.qc).a($$0));
   }

   private kf a(gy $$0, cwl $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      kn $$3 = kn.c(kn.a(cju.qc, $$2));
      return kf.a().a(kg.c, km.Y.a(cju.qc, $$2, $$3, this.c));
   }

   private void u(cjt $$0) {
      kn $$1 = new kn().a(ko.e, kn.C(cju.df)).a(ko.f, kn.C($$0)).a(ko.i, kn.a($$0, "_side"));
      this.b.accept(c($$0, km.j.a($$0, $$1, this.c)));
   }

   private void F() {
      abb $$0 = kn.a(cju.ga, "_side");
      kn $$1 = new kn().a(ko.f, kn.a(cju.ga, "_top")).a(ko.i, $$0);
      kn $$2 = new kn().a(ko.f, kn.a(cju.ga, "_inverted_top")).a(ko.i, $$0);
      this.b
         .accept(
            kc.a(cju.ga)
               .a(kd.a(cwe.p).a(false, kf.a().a(kg.c, km.am.a(cju.ga, $$1, this.c))).a(true, kf.a().a(kg.c, km.am.a(kk.a(cju.ga, "_inverted"), $$2, this.c))))
         );
   }

   private void v(cjt $$0) {
      this.b.accept(kc.a($$0, kf.a().a(kg.c, kk.a($$0))).a(this.l()));
   }

   private void G() {
      cjt $$0 = cju.qb;
      abb $$1 = kk.a($$0, "_on");
      abb $$2 = kk.a($$0);
      this.b.accept(kc.a($$0, kf.a().a(kg.c, kk.a($$0))).a(this.l()).a(a(cwe.w, $$1, $$2)));
   }

   private void H() {
      kn $$0 = new kn().a(ko.B, kn.C(cju.j)).a(ko.f, kn.C(cju.cn));
      kn $$1 = new kn().a(ko.B, kn.C(cju.j)).a(ko.f, kn.a(cju.cn, "_moist"));
      abb $$2 = km.ax.a(cju.cn, $$0, this.c);
      abb $$3 = km.ax.a(kn.a(cju.cn, "_moist"), $$1, this.c);
      this.b.accept(kc.a(cju.cn).a(a(cwe.aQ, 7, $$3, $$2)));
   }

   private List<abb> w(cjt $$0) {
      abb $$1 = km.ay.a(kk.a($$0, "_floor0"), kn.r($$0), this.c);
      abb $$2 = km.ay.a(kk.a($$0, "_floor1"), kn.s($$0), this.c);
      return ImmutableList.of($$1, $$2);
   }

   private List<abb> x(cjt $$0) {
      abb $$1 = km.az.a(kk.a($$0, "_side0"), kn.r($$0), this.c);
      abb $$2 = km.az.a(kk.a($$0, "_side1"), kn.s($$0), this.c);
      abb $$3 = km.aA.a(kk.a($$0, "_side_alt0"), kn.r($$0), this.c);
      abb $$4 = km.aA.a(kk.a($$0, "_side_alt1"), kn.s($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<abb> y(cjt $$0) {
      abb $$1 = km.aB.a(kk.a($$0, "_up0"), kn.r($$0), this.c);
      abb $$2 = km.aB.a(kk.a($$0, "_up1"), kn.s($$0), this.c);
      abb $$3 = km.aC.a(kk.a($$0, "_up_alt0"), kn.r($$0), this.c);
      abb $$4 = km.aC.a(kk.a($$0, "_up_alt1"), kn.s($$0), this.c);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<kf> a(List<abb> $$0, UnaryOperator<kf> $$1) {
      return (List<kf>)$$0.stream().map($$0x -> kf.a().a(kg.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void I() {
      ka $$0 = ka.a().a(cwe.M, false).a(cwe.N, false).a(cwe.O, false).a(cwe.P, false).a(cwe.K, false);
      List<abb> $$1 = this.w(cju.cc);
      List<abb> $$2 = this.x(cju.cc);
      List<abb> $$3 = this.y(cju.cc);
      this.b
         .accept(
            kb.a(cju.cc)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(ka.b(ka.a().a(cwe.M, true), $$0), a($$2, $$0x -> $$0x))
               .a(ka.b(ka.a().a(cwe.N, true), $$0), a($$2, $$0x -> $$0x.a(kg.b, kg.a.b)))
               .a(ka.b(ka.a().a(cwe.O, true), $$0), a($$2, $$0x -> $$0x.a(kg.b, kg.a.c)))
               .a(ka.b(ka.a().a(cwe.P, true), $$0), a($$2, $$0x -> $$0x.a(kg.b, kg.a.d)))
               .a(ka.a().a(cwe.K, true), a($$3, $$0x -> $$0x))
         );
   }

   private void J() {
      List<abb> $$0 = this.w(cju.cd);
      List<abb> $$1 = this.x(cju.cd);
      this.b
         .accept(
            kb.a(cju.cd)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(kg.b, kg.a.b)))
               .a(a($$1, $$0x -> $$0x.a(kg.b, kg.a.c)))
               .a(a($$1, $$0x -> $$0x.a(kg.b, kg.a.d)))
         );
   }

   private void z(cjt $$0) {
      abb $$1 = kp.o.create($$0, this.c);
      abb $$2 = kp.p.create($$0, this.c);
      this.a($$0.l());
      this.b.accept(kc.a($$0).a(a(cwe.j, $$2, $$1)));
   }

   private void K() {
      kn $$0 = kn.a(kn.a(cju.W, "_side"), kn.a(cju.W, "_top"));
      abb $$1 = km.f.a(cju.W, $$0, this.c);
      this.b.accept(d(cju.W, $$1));
   }

   private void L() {
      this.a(caz.M);
      cjt $$0 = cju.A;
      kd.b<Boolean, Integer> $$1 = kd.a(coe.c, coe.a);
      abb $$2 = kk.a($$0);

      for(int $$3 = 0; $$3 <= 4; ++$$3) {
         abb $$4 = kk.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, kf.a().a(kg.c, $$4));
         $$1.a(false, $$3, kf.a().a(kg.c, $$2));
      }

      this.b.accept(kc.a(cju.A).a($$1));
   }

   private void M() {
      this.b
         .accept(
            kc.a(cju.ju)
               .a(
                  kd.a(cwe.as)
                     .a(0, kf.a().a(kg.c, this.a(cju.ju, "_0", km.c, kn::b)))
                     .a(1, kf.a().a(kg.c, this.a(cju.ju, "_1", km.c, kn::b)))
                     .a(2, kf.a().a(kg.c, this.a(cju.ju, "_2", km.c, kn::b)))
                     .a(3, kf.a().a(kg.c, this.a(cju.ju, "_3", km.c, kn::b)))
               )
         );
   }

   private void N() {
      abb $$0 = kn.C(cju.j);
      kn $$1 = new kn().a(ko.e, $$0).b(ko.e, ko.c).a(ko.f, kn.a(cju.i, "_top")).a(ko.i, kn.a(cju.i, "_snow"));
      kf $$2 = kf.a().a(kg.c, km.j.a(cju.i, "_snow", $$1, this.c));
      this.a(cju.i, kk.a(cju.i), $$2);
      abb $$3 = kp.e.get(cju.es).a($$1x -> $$1x.a(ko.e, $$0)).a(cju.es, this.c);
      this.a(cju.es, $$3, $$2);
      abb $$4 = kp.e.get(cju.l).a($$1x -> $$1x.a(ko.e, $$0)).a(cju.l, this.c);
      this.a(cju.l, $$4, $$2);
   }

   private void a(cjt $$0, abb $$1, kf $$2) {
      List<kf> $$3 = Arrays.asList(a($$1));
      this.b.accept(kc.a($$0).a(kd.a(cwe.z).a(true, $$2).a(false, $$3)));
   }

   private void O() {
      this.a(caz.pq);
      this.b
         .accept(
            kc.a(cju.eJ)
               .a(
                  kd.a(cwe.ar)
                     .a(0, kf.a().a(kg.c, kk.a(cju.eJ, "_stage0")))
                     .a(1, kf.a().a(kg.c, kk.a(cju.eJ, "_stage1")))
                     .a(2, kf.a().a(kg.c, kk.a(cju.eJ, "_stage2")))
               )
               .a(c())
         );
   }

   private void P() {
      this.b.accept(b(cju.jq, kk.a(cju.jq)));
   }

   private void g(cjt $$0, cjt $$1) {
      kn $$2 = kn.b($$1);
      abb $$3 = km.J.a($$0, $$2, this.c);
      abb $$4 = km.K.a($$0, $$2, this.c);
      this.b.accept(kc.a($$0).a(a(cwe.aT, 1, $$4, $$3)));
   }

   private void Q() {
      abb $$0 = kk.a(cju.gd);
      abb $$1 = kk.a(cju.gd, "_side");
      this.a(caz.kU);
      this.b
         .accept(
            kc.a(cju.gd)
               .a(
                  kd.a(cwe.R)
                     .a(gy.a, kf.a().a(kg.c, $$0))
                     .a(gy.c, kf.a().a(kg.c, $$1))
                     .a(gy.f, kf.a().a(kg.c, $$1).a(kg.b, kg.a.b))
                     .a(gy.d, kf.a().a(kg.c, $$1).a(kg.b, kg.a.c))
                     .a(gy.e, kf.a().a(kg.c, $$1).a(kg.b, kg.a.d))
               )
         );
   }

   private void h(cjt $$0, cjt $$1) {
      abb $$2 = kk.a($$0);
      this.b.accept(kc.a($$1, kf.a().a(kg.c, $$2)));
      this.a($$1, $$2);
   }

   private void R() {
      abb $$0 = kk.a(cju.ee, "_post_ends");
      abb $$1 = kk.a(cju.ee, "_post");
      abb $$2 = kk.a(cju.ee, "_cap");
      abb $$3 = kk.a(cju.ee, "_cap_alt");
      abb $$4 = kk.a(cju.ee, "_side");
      abb $$5 = kk.a(cju.ee, "_side_alt");
      this.b
         .accept(
            kb.a(cju.ee)
               .a(kf.a().a(kg.c, $$0))
               .a(ka.a().a(cwe.M, false).a(cwe.N, false).a(cwe.O, false).a(cwe.P, false), kf.a().a(kg.c, $$1))
               .a(ka.a().a(cwe.M, true).a(cwe.N, false).a(cwe.O, false).a(cwe.P, false), kf.a().a(kg.c, $$2))
               .a(ka.a().a(cwe.M, false).a(cwe.N, true).a(cwe.O, false).a(cwe.P, false), kf.a().a(kg.c, $$2).a(kg.b, kg.a.b))
               .a(ka.a().a(cwe.M, false).a(cwe.N, false).a(cwe.O, true).a(cwe.P, false), kf.a().a(kg.c, $$3))
               .a(ka.a().a(cwe.M, false).a(cwe.N, false).a(cwe.O, false).a(cwe.P, true), kf.a().a(kg.c, $$3).a(kg.b, kg.a.b))
               .a(ka.a().a(cwe.M, true), kf.a().a(kg.c, $$4))
               .a(ka.a().a(cwe.N, true), kf.a().a(kg.c, $$4).a(kg.b, kg.a.b))
               .a(ka.a().a(cwe.O, true), kf.a().a(kg.c, $$5))
               .a(ka.a().a(cwe.P, true), kf.a().a(kg.c, $$5).a(kg.b, kg.a.b))
         );
      this.b(cju.ee);
   }

   private void A(cjt $$0) {
      this.b.accept(kc.a($$0, kf.a().a(kg.c, kk.a($$0))).a(b()));
   }

   private void S() {
      abb $$0 = kk.a(cju.cH);
      abb $$1 = kk.a(cju.cH, "_on");
      this.b(cju.cH);
      this.b
         .accept(
            kc.a(cju.cH)
               .a(a(cwe.w, $$0, $$1))
               .a(
                  kd.a(cwe.U, cwe.S)
                     .a(cwa.c, gy.c, kf.a().a(kg.a, kg.a.c).a(kg.b, kg.a.c))
                     .a(cwa.c, gy.f, kf.a().a(kg.a, kg.a.c).a(kg.b, kg.a.d))
                     .a(cwa.c, gy.d, kf.a().a(kg.a, kg.a.c))
                     .a(cwa.c, gy.e, kf.a().a(kg.a, kg.a.c).a(kg.b, kg.a.b))
                     .a(cwa.a, gy.c, kf.a())
                     .a(cwa.a, gy.f, kf.a().a(kg.b, kg.a.b))
                     .a(cwa.a, gy.d, kf.a().a(kg.b, kg.a.c))
                     .a(cwa.a, gy.e, kf.a().a(kg.b, kg.a.d))
                     .a(cwa.b, gy.c, kf.a().a(kg.a, kg.a.b))
                     .a(cwa.b, gy.f, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.b))
                     .a(cwa.b, gy.d, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.c))
                     .a(cwa.b, gy.e, kf.a().a(kg.a, kg.a.b).a(kg.b, kg.a.d))
               )
         );
   }

   private void T() {
      this.b(cju.et);
      this.b.accept(b(cju.et, kk.a(cju.et)));
   }

   private void U() {
      this.b(cju.qV);
      this.b.accept(c(cju.qV, kk.a(cju.qV)));
   }

   private void V() {
      this.b.accept(kc.a(cju.dn).a(kd.a(cwe.I).a(gy.a.a, kf.a().a(kg.c, kk.a(cju.dn, "_ns"))).a(gy.a.c, kf.a().a(kg.c, kk.a(cju.dn, "_ew")))));
   }

   private void W() {
      abb $$0 = kp.a.create(cju.df, this.c);
      this.b
         .accept(
            kc.a(
               cju.df,
               kf.a().a(kg.c, $$0),
               kf.a().a(kg.c, $$0).a(kg.a, kg.a.b),
               kf.a().a(kg.c, $$0).a(kg.a, kg.a.c),
               kf.a().a(kg.c, $$0).a(kg.a, kg.a.d),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.b),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.b).a(kg.a, kg.a.b),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.b).a(kg.a, kg.a.c),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.b).a(kg.a, kg.a.d),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.c),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.c).a(kg.a, kg.a.b),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.c).a(kg.a, kg.a.c),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.c).a(kg.a, kg.a.d),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.d),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.d).a(kg.a, kg.a.b),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.d).a(kg.a, kg.a.c),
               kf.a().a(kg.c, $$0).a(kg.b, kg.a.d).a(kg.a, kg.a.d)
            )
         );
   }

   private void X() {
      abb $$0 = kk.a(cju.jA);
      abb $$1 = kk.a(cju.jA, "_on");
      this.b.accept(kc.a(cju.jA).a(a(cwe.w, $$1, $$0)).a(e()));
   }

   private void Y() {
      kn $$0 = new kn().a(ko.e, kn.a(cju.bl, "_bottom")).a(ko.i, kn.a(cju.bl, "_side"));
      abb $$1 = kn.a(cju.bl, "_top_sticky");
      abb $$2 = kn.a(cju.bl, "_top");
      kn $$3 = $$0.c(ko.E, $$1);
      kn $$4 = $$0.c(ko.E, $$2);
      abb $$5 = kk.a(cju.bl, "_base");
      this.a(cju.bl, $$5, $$4);
      this.a(cju.be, $$5, $$3);
      abb $$6 = km.j.a(cju.bl, "_inventory", $$0.c(ko.f, $$2), this.c);
      abb $$7 = km.j.a(cju.be, "_inventory", $$0.c(ko.f, $$1), this.c);
      this.a(cju.bl, $$6);
      this.a(cju.be, $$7);
   }

   private void a(cjt $$0, abb $$1, kn $$2) {
      abb $$3 = km.aI.a($$0, $$2, this.c);
      this.b.accept(kc.a($$0).a(a(cwe.g, $$1, $$3)).a(e()));
   }

   private void Z() {
      kn $$0 = new kn().a(ko.F, kn.a(cju.bl, "_top")).a(ko.i, kn.a(cju.bl, "_side"));
      kn $$1 = $$0.c(ko.E, kn.a(cju.bl, "_top_sticky"));
      kn $$2 = $$0.c(ko.E, kn.a(cju.bl, "_top"));
      this.b
         .accept(
            kc.a(cju.bm)
               .a(
                  kd.a(cwe.x, cwe.bh)
                     .a(false, cwq.a, kf.a().a(kg.c, km.aJ.a(cju.bl, "_head", $$2, this.c)))
                     .a(false, cwq.b, kf.a().a(kg.c, km.aJ.a(cju.bl, "_head_sticky", $$1, this.c)))
                     .a(true, cwq.a, kf.a().a(kg.c, km.aK.a(cju.bl, "_head_short", $$2, this.c)))
                     .a(true, cwq.b, kf.a().a(kg.c, km.aK.a(cju.bl, "_head_short_sticky", $$1, this.c)))
               )
               .a(e())
         );
   }

   private void aa() {
      abb $$0 = kk.a(cju.po, "_inactive");
      abb $$1 = kk.a(cju.po, "_active");
      this.a(cju.po, $$0);
      this.b.accept(kc.a(cju.po).a(kd.a(cwe.bp).a($$2 -> kf.a().a(kg.c, $$2 == cwu.b ? $$1 : $$0))));
   }

   private void ab() {
      abb $$0 = km.bi.a(cju.ps, kn.a(false), this.c);
      abb $$1 = km.bi.a(cju.ps, "_can_summon", kn.a(true), this.c);
      this.a(cju.ps, $$0);
      this.b.accept(kc.a(cju.ps).a(a(cwe.H, $$1, $$0)));
   }

   private void ac() {
      abb $$0 = kk.a(cju.mD, "_stable");
      abb $$1 = kk.a(cju.mD, "_unstable");
      this.a(cju.mD, $$0);
      this.b.accept(kc.a(cju.mD).a(a(cwe.b, $$1, $$0)));
   }

   private void ad() {
      abb $$0 = this.a(cju.qe, "", km.Z, kn::c);
      abb $$1 = this.a(cju.qe, "_lit", km.Z, kn::c);
      this.b.accept(kc.a(cju.qe).a(a(cwe.E, $$1, $$0)));
      abb $$2 = this.a(cju.qf, "", km.Z, kn::c);
      abb $$3 = this.a(cju.qf, "_lit", km.Z, kn::c);
      this.b.accept(kc.a(cju.qf).a(a(cwe.E, $$3, $$2)));
   }

   private void ae() {
      abb $$0 = kp.a.create(cju.eI, this.c);
      abb $$1 = this.a(cju.eI, "_on", km.c, kn::b);
      this.b.accept(kc.a(cju.eI).a(a(cwe.r, $$1, $$0)));
   }

   private void i(cjt $$0, cjt $$1) {
      kn $$2 = kn.u($$0);
      this.b.accept(c($$0, km.aG.a($$0, $$2, this.c)));
      this.b.accept(kc.a($$1, kf.a().a(kg.c, km.aH.a($$1, $$2, this.c))).a(d()));
      this.b($$0);
      this.a($$1);
   }

   private void af() {
      kn $$0 = kn.u(cju.cT);
      kn $$1 = kn.i(kn.a(cju.cT, "_off"));
      abb $$2 = km.aG.a(cju.cT, $$0, this.c);
      abb $$3 = km.aG.a(cju.cT, "_off", $$1, this.c);
      this.b.accept(kc.a(cju.cT).a(a(cwe.r, $$2, $$3)));
      abb $$4 = km.aH.a(cju.cU, $$0, this.c);
      abb $$5 = km.aH.a(cju.cU, "_off", $$1, this.c);
      this.b.accept(kc.a(cju.cU).a(a(cwe.r, $$4, $$5)).a(d()));
      this.b(cju.cT);
      this.a(cju.cU);
   }

   private void ag() {
      this.a(caz.kN);
      this.b.accept(kc.a(cju.dr).a(kd.a(cwe.aA, cwe.s, cwe.w).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return kf.a().a(kg.c, kn.a(cju.dr, $$3.toString()));
      })).a(c()));
   }

   private void ah() {
      this.a(caz.ck);
      this.b
         .accept(
            kc.a(cju.lG)
               .a(
                  kd.a(cwe.aS, cwe.C)
                     .a(1, false, Arrays.asList(a(kk.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(kk.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(kk.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(kk.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(kk.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(kk.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(kk.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(kk.a("four_sea_pickles"))))
               )
         );
   }

   private void ai() {
      kn $$0 = kn.a(cju.cW);
      abb $$1 = km.c.a(cju.cY, $$0, this.c);
      this.b.accept(kc.a(cju.cW).a(kd.a(cwe.aF).a($$1x -> kf.a().a(kg.c, $$1x < 8 ? kk.a(cju.cW, "_height" + $$1x * 2) : $$1))));
      this.a(cju.cW, kk.a(cju.cW, "_height2"));
      this.b.accept(c(cju.cY, $$1));
   }

   private void aj() {
      this.b.accept(kc.a(cju.mN, kf.a().a(kg.c, kk.a(cju.mN))).a(b()));
   }

   private void ak() {
      abb $$0 = kp.a.create(cju.nL, this.c);
      this.a(cju.nL, $$0);
      this.b.accept(kc.a(cju.nL).a(kd.a(cwe.bk).a($$0x -> kf.a().a(kg.c, this.a(cju.nL, "_" + $$0x.c(), km.c, kn::b)))));
   }

   private void al() {
      this.a(caz.ui);
      this.b.accept(kc.a(cju.mT).a(kd.a(cwe.as).a($$0 -> kf.a().a(kg.c, this.a(cju.mT, "_stage" + $$0, km.Z, kn::c)))));
   }

   private void am() {
      this.a(caz.nO);
      this.b
         .accept(
            kc.a(cju.eP)
               .a(
                  kd.a(cwe.a, cwe.N, cwe.M, cwe.O, cwe.P)
                     .a(false, false, false, false, false, kf.a().a(kg.c, kk.a(cju.eP, "_ns")))
                     .a(false, true, false, false, false, kf.a().a(kg.c, kk.a(cju.eP, "_n")).a(kg.b, kg.a.b))
                     .a(false, false, true, false, false, kf.a().a(kg.c, kk.a(cju.eP, "_n")))
                     .a(false, false, false, true, false, kf.a().a(kg.c, kk.a(cju.eP, "_n")).a(kg.b, kg.a.c))
                     .a(false, false, false, false, true, kf.a().a(kg.c, kk.a(cju.eP, "_n")).a(kg.b, kg.a.d))
                     .a(false, true, true, false, false, kf.a().a(kg.c, kk.a(cju.eP, "_ne")))
                     .a(false, true, false, true, false, kf.a().a(kg.c, kk.a(cju.eP, "_ne")).a(kg.b, kg.a.b))
                     .a(false, false, false, true, true, kf.a().a(kg.c, kk.a(cju.eP, "_ne")).a(kg.b, kg.a.c))
                     .a(false, false, true, false, true, kf.a().a(kg.c, kk.a(cju.eP, "_ne")).a(kg.b, kg.a.d))
                     .a(false, false, true, true, false, kf.a().a(kg.c, kk.a(cju.eP, "_ns")))
                     .a(false, true, false, false, true, kf.a().a(kg.c, kk.a(cju.eP, "_ns")).a(kg.b, kg.a.b))
                     .a(false, true, true, true, false, kf.a().a(kg.c, kk.a(cju.eP, "_nse")))
                     .a(false, true, false, true, true, kf.a().a(kg.c, kk.a(cju.eP, "_nse")).a(kg.b, kg.a.b))
                     .a(false, false, true, true, true, kf.a().a(kg.c, kk.a(cju.eP, "_nse")).a(kg.b, kg.a.c))
                     .a(false, true, true, false, true, kf.a().a(kg.c, kk.a(cju.eP, "_nse")).a(kg.b, kg.a.d))
                     .a(false, true, true, true, true, kf.a().a(kg.c, kk.a(cju.eP, "_nsew")))
                     .a(true, false, false, false, false, kf.a().a(kg.c, kk.a(cju.eP, "_attached_ns")))
                     .a(true, false, true, false, false, kf.a().a(kg.c, kk.a(cju.eP, "_attached_n")))
                     .a(true, false, false, true, false, kf.a().a(kg.c, kk.a(cju.eP, "_attached_n")).a(kg.b, kg.a.c))
                     .a(true, true, false, false, false, kf.a().a(kg.c, kk.a(cju.eP, "_attached_n")).a(kg.b, kg.a.b))
                     .a(true, false, false, false, true, kf.a().a(kg.c, kk.a(cju.eP, "_attached_n")).a(kg.b, kg.a.d))
                     .a(true, true, true, false, false, kf.a().a(kg.c, kk.a(cju.eP, "_attached_ne")))
                     .a(true, true, false, true, false, kf.a().a(kg.c, kk.a(cju.eP, "_attached_ne")).a(kg.b, kg.a.b))
                     .a(true, false, false, true, true, kf.a().a(kg.c, kk.a(cju.eP, "_attached_ne")).a(kg.b, kg.a.c))
                     .a(true, false, true, false, true, kf.a().a(kg.c, kk.a(cju.eP, "_attached_ne")).a(kg.b, kg.a.d))
                     .a(true, false, true, true, false, kf.a().a(kg.c, kk.a(cju.eP, "_attached_ns")))
                     .a(true, true, false, false, true, kf.a().a(kg.c, kk.a(cju.eP, "_attached_ns")).a(kg.b, kg.a.b))
                     .a(true, true, true, true, false, kf.a().a(kg.c, kk.a(cju.eP, "_attached_nse")))
                     .a(true, true, false, true, true, kf.a().a(kg.c, kk.a(cju.eP, "_attached_nse")).a(kg.b, kg.a.b))
                     .a(true, false, true, true, true, kf.a().a(kg.c, kk.a(cju.eP, "_attached_nse")).a(kg.b, kg.a.c))
                     .a(true, true, true, false, true, kf.a().a(kg.c, kk.a(cju.eP, "_attached_nse")).a(kg.b, kg.a.d))
                     .a(true, true, true, true, true, kf.a().a(kg.c, kk.a(cju.eP, "_attached_nsew")))
               )
         );
   }

   private void an() {
      this.b(cju.eO);
      this.b.accept(kc.a(cju.eO).a(kd.a(cwe.a, cwe.w).a(($$0, $$1) -> kf.a().a(kg.c, kn.a(cju.eO, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private abb a(int $$0, String $$1, kn $$2) {
      switch($$0) {
         case 1:
            return km.aM.a(kk.a($$1 + "turtle_egg"), $$2, this.c);
         case 2:
            return km.aN.a(kk.a("two_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 3:
            return km.aO.a(kk.a("three_" + $$1 + "turtle_eggs"), $$2, this.c);
         case 4:
            return km.aP.a(kk.a("four_" + $$1 + "turtle_eggs"), $$2, this.c);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private abb a(Integer $$0, Integer $$1) {
      switch($$1) {
         case 0:
            return this.a($$0.intValue(), "", kn.b(kn.C(cju.kR)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", kn.b(kn.a(cju.kR, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", kn.b(kn.a(cju.kR, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void ao() {
      this.a(caz.jt);
      this.b.accept(kc.a(cju.kR).a(kd.a(cwe.aD, cwe.aE).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void B(cjt $$0) {
      this.b($$0);
      abb $$1 = kk.a($$0);
      kb $$2 = kb.a($$0);
      ka.c $$3 = ad.a(ka.a(), $$1x -> a.stream().map(Pair::getFirst).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }

         }));

      for(Pair<cwf, Function<abb, kf>> $$4 : a) {
         cwf $$5 = (cwf)$$4.getFirst();
         Function<abb, kf> $$6 = (Function)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(ka.a().a($$5, true), (kf)$$6.apply($$1));
            $$2.a($$3, (kf)$$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void ap() {
      abb $$0 = kn.a(cju.pr, "_bottom");
      kn $$1 = new kn().a(ko.e, $$0).a(ko.f, kn.a(cju.pr, "_top")).a(ko.i, kn.a(cju.pr, "_side"));
      kn $$2 = new kn().a(ko.e, $$0).a(ko.f, kn.a(cju.pr, "_top_bloom")).a(ko.i, kn.a(cju.pr, "_side_bloom"));
      abb $$3 = km.j.a(cju.pr, "", $$1, this.c);
      abb $$4 = km.j.a(cju.pr, "_bloom", $$2, this.c);
      this.b.accept(kc.a(cju.pr).a(kd.a(cwe.F).a($$2x -> kf.a().a(kg.c, $$2x ? $$4 : $$3))));
      this.a(caz.fq, $$3);
   }

   private void aq() {
      this.b.accept(c(cju.jv, km.c.a(cju.jv, kn.b(kk.a("magma")), this.c)));
   }

   private void C(cjt $$0) {
      this.c($$0, kp.l);
      km.aZ.a(kk.a($$0.l()), kn.q($$0), this.c);
   }

   private void b(cjt $$0, cjt $$1, jw.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void j(cjt $$0, cjt $$1) {
      km.ba.a(kk.a($$0.l()), kn.q($$1), this.c);
   }

   private void ar() {
      abb $$0 = kk.a(cju.b);
      abb $$1 = kk.a(cju.b, "_mirrored");
      this.b.accept(a(cju.dV, $$0, $$1));
      this.a(cju.dV, $$0);
   }

   private void as() {
      abb $$0 = kk.a(cju.qr);
      abb $$1 = kk.a(cju.qr, "_mirrored");
      this.b.accept(a(cju.qL, $$0, $$1).a(f()));
      this.a(cju.qL, $$0);
   }

   private void k(cjt $$0, cjt $$1) {
      this.a($$0, jw.d.b);
      kn $$2 = kn.d(kn.a($$0, "_pot"));
      abb $$3 = jw.d.b.b().a($$1, $$2, this.c);
      this.b.accept(c($$1, $$3));
   }

   private void at() {
      abb $$0 = kn.a(cju.nW, "_bottom");
      abb $$1 = kn.a(cju.nW, "_top_off");
      abb $$2 = kn.a(cju.nW, "_top");
      abb[] $$3 = new abb[5];

      for(int $$4 = 0; $$4 < 5; ++$$4) {
         kn $$5 = new kn().a(ko.e, $$0).a(ko.f, $$4 == 0 ? $$1 : $$2).a(ko.i, kn.a(cju.nW, "_side" + $$4));
         $$3[$$4] = km.j.a(cju.nW, "_" + $$4, $$5, this.c);
      }

      this.b.accept(kc.a(cju.nW).a(kd.a(cwe.aZ).a($$1x -> kf.a().a(kg.c, $$3[$$1x]))));
      this.a(caz.uG, $$3[0]);
   }

   private kf a(ha $$0, kf $$1) {
      switch($$0) {
         case b:
            return $$1.a(kg.a, kg.a.b);
         case c:
            return $$1.a(kg.a, kg.a.b).a(kg.b, kg.a.c);
         case d:
            return $$1.a(kg.a, kg.a.b).a(kg.b, kg.a.d);
         case a:
            return $$1.a(kg.a, kg.a.b).a(kg.b, kg.a.b);
         case f:
            return $$1.a(kg.a, kg.a.d).a(kg.b, kg.a.c);
         case g:
            return $$1.a(kg.a, kg.a.d);
         case h:
            return $$1.a(kg.a, kg.a.d).a(kg.b, kg.a.b);
         case e:
            return $$1.a(kg.a, kg.a.d).a(kg.b, kg.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(kg.b, kg.a.c);
         case i:
            return $$1.a(kg.b, kg.a.d);
         case j:
            return $$1.a(kg.b, kg.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void au() {
      abb $$0 = kn.a(cju.nM, "_top");
      abb $$1 = kn.a(cju.nM, "_bottom");
      abb $$2 = kn.a(cju.nM, "_side");
      abb $$3 = kn.a(cju.nM, "_lock");
      kn $$4 = new kn().a(ko.o, $$2).a(ko.m, $$2).a(ko.l, $$2).a(ko.c, $$0).a(ko.j, $$0).a(ko.k, $$1).a(ko.n, $$3);
      abb $$5 = km.b.a(cju.nM, $$4, this.c);
      this.b.accept(kc.a(cju.nM, kf.a().a(kg.c, $$5)).a(kd.a(cwe.T).a($$0x -> this.a($$0x, kf.a()))));
   }

   private void av() {
      cjt $$0 = cju.n;
      abb $$1 = kk.a($$0);
      kp $$2 = kp.a.get($$0);
      cjt $$3 = cju.iC;
      abb $$4 = km.M.a($$3, $$2.b(), this.c);
      abb $$5 = km.N.a($$3, $$2.b(), this.c);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   public void a() {
      iu.a().filter(iv::c).forEach($$0 -> this.f($$0.a()).a($$0));
      this.f(cju.pC).a(iu.t).a(cju.pS).a(iu.v);
      this.f(cju.pB).a(iu.x).a(cju.pR).a(iu.z);
      this.f(cju.pA).a(iu.B).a(cju.pQ).a(iu.D);
      this.f(cju.pz).a(iu.F).a(cju.pP).a(iu.H);
      this.k(cju.a);
      this.a(cju.lN, cju.a);
      this.a(cju.lM, cju.a);
      this.k(cju.eV);
      this.k(cju.cZ);
      this.a(cju.lO, cju.C);
      this.k(cju.eH);
      this.k(cju.kQ);
      this.k(cju.ey);
      this.k(cju.eY);
      this.a(caz.sb);
      this.k(cju.nR);
      this.k(cju.C);
      this.k(cju.D);
      this.k(cju.gT);
      this.a(caz.eZ);
      this.l(cju.ox, cju.oO);
      this.l(cju.oy, cju.oP);
      this.l(cju.oz, cju.oQ);
      this.l(cju.oA, cju.oR);
      this.l(cju.oB, cju.oS);
      this.l(cju.oC, cju.oT);
      this.l(cju.oD, cju.oU);
      this.l(cju.oE, cju.oV);
      this.l(cju.oF, cju.oW);
      this.l(cju.oG, cju.oX);
      this.l(cju.oH, cju.oY);
      this.l(cju.oI, cju.oZ);
      this.l(cju.oJ, cju.pa);
      this.l(cju.oK, cju.pb);
      this.l(cju.oL, cju.pc);
      this.l(cju.oM, cju.pd);
      this.l(cju.ow, cju.oN);
      this.k(cju.lL);
      this.k(cju.fx);
      this.k(cju.pn);
      this.k(cju.qg);
      this.p(cju.qh);
      this.p(cju.qi);
      this.q(cju.qQ);
      this.q(cju.qR);
      this.ad();
      this.e(cju.qk, cju.qj);
      this.a(cju.gU, caz.gF);
      this.a(caz.gF);
      this.aw();
      this.a(cju.jz, caz.if);
      this.a(caz.if);
      this.f(cju.bD, kn.a(cju.bl, "_side"));
      this.e(cju.L);
      this.e(cju.M);
      this.e(cju.hz);
      this.e(cju.ci);
      this.e(cju.cj);
      this.e(cju.ck);
      this.e(cju.eL);
      this.e(cju.eM);
      this.e(cju.eQ);
      this.e(cju.H);
      this.e(cju.N);
      this.e(cju.I);
      this.e(cju.bT);
      this.e(cju.J);
      this.e(cju.K);
      this.e(cju.bU);
      this.c(cju.nU, kp.c);
      this.e(cju.nT);
      this.e(cju.aE);
      this.e(cju.aF);
      this.e(cju.aG);
      this.e(cju.gc);
      this.e(cju.cR);
      this.e(cju.cS);
      this.e(cju.gb);
      this.e(cju.on);
      this.e(cju.lH);
      this.e(cju.da);
      this.e(cju.k);
      this.e(cju.nV);
      this.e(cju.eG);
      this.e(cju.dm);
      this.e(cju.G);
      this.e(cju.nS);
      this.e(cju.cX);
      this.c(cju.dc, kp.f);
      this.c(cju.ob, kp.c);
      this.c(cju.eh, kp.c);
      this.k(cju.V);
      this.k(cju.ff);
      this.e(cju.jw);
      this.e(cju.aL);
      this.e(cju.hA);
      this.e(cju.bZ);
      this.e(cju.ov);
      this.e(cju.hg);
      this.e(cju.nj);
      this.e(cju.dg);
      this.e(cju.dh);
      this.e(cju.ce);
      this.e(cju.aB);
      this.c(cju.bj, kp.q);
      this.a(caz.cj);
      this.c(cju.bW, kp.e);
      this.c(cju.nO, kp.c);
      this.e(cju.na);
      this.e(cju.aC);
      this.e(cju.pe);
      this.e(cju.pf);
      this.e(cju.pl);
      this.e(cju.pk);
      this.e(cju.qd);
      this.e(cju.qN);
      this.e(cju.qO);
      this.e(cju.qP);
      this.c(cju.pp);
      this.av();
      this.e(cju.px);
      this.e(cju.py);
      this.e(cju.pw);
      this.e(cju.pv);
      this.e(cju.pu);
      this.e(cju.pt);
      this.h(cju.pw, cju.pL);
      this.h(cju.pv, cju.pN);
      this.h(cju.pu, cju.pM);
      this.h(cju.pt, cju.pO);
      this.g(cju.fX, cju.bT);
      this.g(cju.fY, cju.bU);
      this.D();
      this.p();
      this.t();
      this.u();
      this.a(cju.mR, cju.mS);
      this.v();
      this.y();
      this.z();
      this.B();
      this.C();
      this.F();
      this.A();
      this.v(cju.ji);
      this.G();
      this.H();
      this.I();
      this.J();
      this.M();
      this.N();
      this.O();
      this.P();
      this.o();
      this.Q();
      this.R();
      this.S();
      this.T();
      this.V();
      this.W();
      this.X();
      this.Y();
      this.Z();
      this.ac();
      this.af();
      this.ae();
      this.ag();
      this.ah();
      this.w();
      this.ai();
      this.aj();
      this.ak();
      this.al();
      this.am();
      this.an();
      this.ao();
      this.B(cju.em);
      this.B(cju.en);
      this.B(cju.pq);
      this.aq();
      this.au();
      this.aa();
      this.ab();
      this.U();
      this.L();
      this.K();
      this.A(cju.cx);
      this.b(cju.cx);
      this.A(cju.mL);
      this.g();
      this.A(cju.qm);
      this.i(cju.ca, cju.cb);
      this.i(cju.dk, cju.dl);
      this.a(cju.cl, cju.n, kn::c);
      this.a(cju.mJ, cju.p, kn::d);
      this.u(cju.nh);
      this.u(cju.mY);
      this.s(cju.aH);
      this.s(cju.gj);
      this.z(cju.mP);
      this.z(cju.mQ);
      this.e(cju.ef, kk.a(cju.ef));
      this.a(cju.di, kp.c);
      this.a(cju.dj, kp.c);
      this.e(cju.qM);
      this.a(cju.jy, kp.c);
      this.d(cju.j);
      this.d(cju.qp);
      this.d(cju.E);
      this.d(cju.F);
      this.c(cju.B);
      this.c(cju.qW, kp.e);
      this.a(cju.hh, kp.c, kp.d);
      this.a(cju.jm, kp.r, kp.s);
      this.a(cju.gg, kp.r, kp.s);
      this.a(cju.qS, kp.c, kp.d);
      this.a(cju.qT, kp.c, kp.d);
      this.a(cju.qU, kp.c, kp.d);
      this.b(cju.mE, kp.h);
      this.x();
      this.a(cju.nP, kn::w);
      this.a(cju.nQ, kn::y);
      this.a(cju.jp, cwe.as, 0, 1, 2, 3);
      this.a(cju.fy, cwe.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cju.ex, cwe.as, 0, 1, 1, 2);
      this.a(cju.fz, cwe.av, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(cju.cm, cwe.av, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(kk.a("banner"), cju.n)
         .a(km.bb, cju.hH, cju.hI, cju.hJ, cju.hK, cju.hL, cju.hM, cju.hN, cju.hO, cju.hP, cju.hQ, cju.hR, cju.hS, cju.hT, cju.hU, cju.hV, cju.hW)
         .b(cju.hX, cju.hY, cju.hZ, cju.ia, cju.ib, cju.ic, cju.id, cju.ie, cju.if, cju.ig, cju.ih, cju.ii, cju.ij, cju.ik, cju.il, cju.im);
      this.a(kk.a("bed"), cju.n)
         .b(cju.aM, cju.aN, cju.aO, cju.aP, cju.aQ, cju.aR, cju.aS, cju.aT, cju.aU, cju.aV, cju.aW, cju.aX, cju.aY, cju.aZ, cju.ba, cju.bb);
      this.j(cju.aM, cju.bn);
      this.j(cju.aN, cju.bo);
      this.j(cju.aO, cju.bp);
      this.j(cju.aP, cju.bq);
      this.j(cju.aQ, cju.br);
      this.j(cju.aR, cju.bs);
      this.j(cju.aS, cju.bt);
      this.j(cju.aT, cju.bu);
      this.j(cju.aU, cju.bv);
      this.j(cju.aV, cju.bw);
      this.j(cju.aW, cju.bx);
      this.j(cju.aX, cju.by);
      this.j(cju.aY, cju.bz);
      this.j(cju.aZ, cju.bA);
      this.j(cju.ba, cju.bB);
      this.j(cju.bb, cju.bC);
      this.a(kk.a("skull"), cju.dg).a(km.bc, cju.fP, cju.fN, cju.fL, cju.fH, cju.fJ).a(cju.fR).b(cju.fQ, cju.fS, cju.fO, cju.fM, cju.fI, cju.fK);
      this.C(cju.jB);
      this.C(cju.jC);
      this.C(cju.jD);
      this.C(cju.jE);
      this.C(cju.jF);
      this.C(cju.jG);
      this.C(cju.jH);
      this.C(cju.jI);
      this.C(cju.jJ);
      this.C(cju.jK);
      this.C(cju.jL);
      this.C(cju.jM);
      this.C(cju.jN);
      this.C(cju.jO);
      this.C(cju.jP);
      this.C(cju.jQ);
      this.C(cju.jR);
      this.c(cju.lI, kp.l);
      this.a(cju.lI);
      this.a(kk.a("chest"), cju.n).b(cju.cg, cju.fW);
      this.a(kk.a("ender_chest"), cju.bZ).b(cju.eN);
      this.d(cju.eE, cju.bZ).a(cju.eE, cju.jr);
      this.e(cju.az);
      this.e(cju.aA);
      this.e(cju.ki);
      this.e(cju.kj);
      this.e(cju.kk);
      this.e(cju.kl);
      this.e(cju.km);
      this.e(cju.kn);
      this.e(cju.ko);
      this.e(cju.kp);
      this.e(cju.kq);
      this.e(cju.kr);
      this.e(cju.ks);
      this.e(cju.kt);
      this.e(cju.ku);
      this.e(cju.kv);
      this.e(cju.kw);
      this.e(cju.kx);
      this.a(kp.a, cju.ky, cju.kz, cju.kA, cju.kB, cju.kC, cju.kD, cju.kE, cju.kF, cju.kG, cju.kH, cju.kI, cju.kJ, cju.kK, cju.kL, cju.kM, cju.kN);
      this.e(cju.hy);
      this.e(cju.gk);
      this.e(cju.gl);
      this.e(cju.gm);
      this.e(cju.gn);
      this.e(cju.go);
      this.e(cju.gp);
      this.e(cju.gq);
      this.e(cju.gr);
      this.e(cju.gs);
      this.e(cju.gt);
      this.e(cju.gu);
      this.e(cju.gv);
      this.e(cju.gw);
      this.e(cju.gx);
      this.e(cju.gy);
      this.e(cju.gz);
      this.e(cju.pm);
      this.f(cju.aD, cju.eg);
      this.f(cju.ds, cju.gA);
      this.f(cju.dt, cju.gB);
      this.f(cju.du, cju.gC);
      this.f(cju.dv, cju.gD);
      this.f(cju.dw, cju.gE);
      this.f(cju.dx, cju.gF);
      this.f(cju.dy, cju.gG);
      this.f(cju.dz, cju.gH);
      this.f(cju.dA, cju.gI);
      this.f(cju.dB, cju.gJ);
      this.f(cju.dC, cju.gK);
      this.f(cju.dD, cju.gL);
      this.f(cju.dE, cju.gM);
      this.f(cju.dF, cju.gN);
      this.f(cju.dG, cju.gO);
      this.f(cju.dH, cju.gP);
      this.b(kp.j, cju.jS, cju.jT, cju.jU, cju.jV, cju.jW, cju.jX, cju.jY, cju.jZ, cju.ka, cju.kb, cju.kc, cju.kd, cju.ke, cju.kf, cju.kg, cju.kh);
      this.e(cju.bn, cju.hi);
      this.e(cju.bo, cju.hj);
      this.e(cju.bp, cju.hk);
      this.e(cju.bq, cju.hl);
      this.e(cju.br, cju.hm);
      this.e(cju.bs, cju.hn);
      this.e(cju.bt, cju.ho);
      this.e(cju.bu, cju.hp);
      this.e(cju.bv, cju.hq);
      this.e(cju.bw, cju.hr);
      this.e(cju.bx, cju.hs);
      this.e(cju.by, cju.ht);
      this.e(cju.bz, cju.hu);
      this.e(cju.bA, cju.hv);
      this.e(cju.bB, cju.hw);
      this.e(cju.bC, cju.hx);
      this.e(cju.qq);
      this.e(cju.dT);
      this.a(cju.bh, cju.fg, jw.d.a);
      this.a(cju.bE, cju.fh, jw.d.b);
      this.a(cju.bF, cju.fi, jw.d.b);
      this.a(cju.bG, cju.fj, jw.d.b);
      this.a(cju.bH, cju.fk, jw.d.b);
      this.a(cju.bI, cju.fl, jw.d.b);
      this.a(cju.bJ, cju.fm, jw.d.b);
      this.a(cju.bK, cju.fn, jw.d.b);
      this.a(cju.bL, cju.fo, jw.d.b);
      this.a(cju.bM, cju.fp, jw.d.b);
      this.a(cju.bN, cju.fq, jw.d.b);
      this.a(cju.bO, cju.fr, jw.d.b);
      this.a(cju.bQ, cju.fs, jw.d.b);
      this.a(cju.bP, cju.ft, jw.d.b);
      this.a(cju.bS, cju.fu, jw.d.b);
      this.a(cju.bR, cju.fv, jw.d.b);
      this.a(cju.bi, cju.fw, jw.d.b);
      this.E();
      this.r(cju.eb);
      this.r(cju.ec);
      this.r(cju.ed);
      this.a(cju.bg, jw.d.a);
      this.b(cju.db, jw.d.a);
      this.a(caz.cY);
      this.b(cju.kO, cju.kP, jw.d.a);
      this.a(caz.cZ);
      this.a(cju.kP);
      this.b(cju.qo, jw.d.b);
      this.a(cju.qo);
      this.a(cju.qf);
      this.b(cju.nk, cju.nl, jw.d.b);
      this.b(cju.nm, cju.nn, jw.d.b);
      this.a(cju.nk, "_plant");
      this.a(cju.nl);
      this.a(cju.nm, "_plant");
      this.a(cju.nn);
      this.a(cju.lJ, jw.d.a, kn.c(kn.a(cju.lK, "_stage0")));
      this.k();
      this.a(cju.bf, jw.d.b);
      this.c(cju.hC, jw.d.b);
      this.c(cju.hD, jw.d.b);
      this.c(cju.hE, jw.d.b);
      this.c(cju.hF, jw.d.a);
      this.c(cju.hG, jw.d.a);
      this.h();
      this.i();
      this.j();
      this.a(cju.lh, cju.lc, cju.kX, cju.kS, cju.lr, cju.lm, cju.lB, cju.lw);
      this.a(cju.li, cju.ld, cju.kY, cju.kT, cju.ls, cju.ln, cju.lC, cju.lx);
      this.a(cju.lj, cju.le, cju.kZ, cju.kU, cju.lt, cju.lo, cju.lD, cju.ly);
      this.a(cju.lk, cju.lf, cju.la, cju.kV, cju.lu, cju.lp, cju.lE, cju.lz);
      this.a(cju.ll, cju.lg, cju.lb, cju.kW, cju.lv, cju.lq, cju.lF, cju.lA);
      this.c(cju.el, cju.ej);
      this.c(cju.ek, cju.ei);
      this.j(cju.U).c(cju.U).a(cju.ak);
      this.j(cju.ad).c(cju.ad).a(cju.ar);
      this.c(cju.ay, kp.n);
      this.j(cju.S).c(cju.S).a(cju.ai);
      this.j(cju.aa).c(cju.aa).a(cju.ap);
      this.a(cju.y, cju.fd, jw.d.b);
      this.c(cju.aw, kp.n);
      this.j(cju.Q).c(cju.Q).a(cju.ag);
      this.j(cju.Y).c(cju.Y).a(cju.an);
      this.a(cju.w, cju.fb, jw.d.b);
      this.c(cju.au, kp.n);
      this.j(cju.O).c(cju.O).a(cju.ae);
      this.j(cju.ac).c(cju.ac).a(cju.al);
      this.a(cju.u, cju.eZ, jw.d.b);
      this.c(cju.as, kp.n);
      this.j(cju.P).c(cju.P).a(cju.af);
      this.j(cju.X).c(cju.X).a(cju.am);
      this.a(cju.v, cju.fa, jw.d.b);
      this.c(cju.at, kp.n);
      this.j(cju.T).c(cju.T).a(cju.aj);
      this.j(cju.ab).c(cju.ab).a(cju.aq);
      this.a(cju.z, cju.fe, jw.d.b);
      this.c(cju.ax, kp.n);
      this.j(cju.R).c(cju.R).a(cju.ah);
      this.j(cju.Z).c(cju.Z).a(cju.ao);
      this.a(cju.x, cju.fc, jw.d.b);
      this.c(cju.av, kp.n);
      this.j(cju.nd).b(cju.nd).a(cju.nf);
      this.j(cju.ne).b(cju.ne).a(cju.ng);
      this.a(cju.ni, cju.nX, jw.d.b);
      this.k(cju.no, cju.nZ);
      this.j(cju.mU).b(cju.mU).a(cju.mW);
      this.j(cju.mV).b(cju.mV).a(cju.mX);
      this.a(cju.mZ, cju.nY, jw.d.b);
      this.k(cju.nb, cju.oa);
      this.b(cju.nc, jw.d.b);
      this.a(caz.cV);
      this.g(cju.cJ);
      this.i(cju.gW);
      this.s();
      this.l(cju.cy);
      this.m(cju.bc);
      this.m(cju.bd);
      this.m(cju.gi);
      this.r();
      this.n(cju.eU);
      this.n(cju.js);
      this.n(cju.jt);
      this.o(cju.fT);
      this.o(cju.fU);
      this.o(cju.fV);
      this.m();
      this.n();
      this.d(cju.co, kp.g);
      this.d(cju.mH, kp.g);
      this.d(cju.mG, kp.h);
      this.q();
      this.at();
      this.ap();
      this.h(cju.dS, cju.ea);
      this.h(cju.m, cju.dW);
      this.h(cju.dR, cju.dZ);
      this.h(cju.dQ, cju.dY);
      this.ar();
      this.h(cju.dP, cju.dX);
      this.as();
      cbz.i().forEach($$0 -> this.a($$0, kk.b("template_spawn_egg")));
   }

   private void aw() {
      this.a(cju.gV);
      kd.a<Integer> $$0 = kd.a(cwe.aP);

      for(int $$1 = 0; $$1 < 16; ++$$1) {
         String $$2 = String.format(Locale.ROOT, "_%02d", $$1);
         abb $$3 = kn.a(caz.gG, $$2);
         $$0.a($$1, kf.a().a(kg.c, km.L.a(cju.gV, $$2, kn.h($$3), this.c)));
         km.aW.a(kk.a(caz.gG, $$2), kn.k($$3), this.c);
      }

      this.b.accept(kc.a(cju.gV).a($$0));
   }

   private void l(cjt $$0, cjt $$1) {
      this.a($$0.l());
      kn $$2 = kn.b(kn.C($$0));
      kn $$3 = kn.b(kn.a($$0, "_lit"));
      abb $$4 = km.bd.a($$0, "_one_candle", $$2, this.c);
      abb $$5 = km.be.a($$0, "_two_candles", $$2, this.c);
      abb $$6 = km.bf.a($$0, "_three_candles", $$2, this.c);
      abb $$7 = km.bg.a($$0, "_four_candles", $$2, this.c);
      abb $$8 = km.bd.a($$0, "_one_candle_lit", $$3, this.c);
      abb $$9 = km.be.a($$0, "_two_candles_lit", $$3, this.c);
      abb $$10 = km.bf.a($$0, "_three_candles_lit", $$3, this.c);
      abb $$11 = km.bg.a($$0, "_four_candles_lit", $$3, this.c);
      this.b
         .accept(
            kc.a($$0)
               .a(
                  kd.a(cwe.az, cwe.r)
                     .a(1, false, kf.a().a(kg.c, $$4))
                     .a(2, false, kf.a().a(kg.c, $$5))
                     .a(3, false, kf.a().a(kg.c, $$6))
                     .a(4, false, kf.a().a(kg.c, $$7))
                     .a(1, true, kf.a().a(kg.c, $$8))
                     .a(2, true, kf.a().a(kg.c, $$9))
                     .a(3, true, kf.a().a(kg.c, $$10))
                     .a(4, true, kf.a().a(kg.c, $$11))
               )
         );
      abb $$12 = km.bh.a($$1, kn.a($$0, false), this.c);
      abb $$13 = km.bh.a($$1, "_lit", kn.a($$0, true), this.c);
      this.b.accept(kc.a($$1).a(a(cwe.r, $$13, $$12)));
   }

   class a {
      private final abb b;

      public a(abb $$0, cjt $$1) {
         this.b = km.L.a($$0, kn.q($$1), jw.this.c);
      }

      public jw.a a(cjt... $$0) {
         for(cjt $$1 : $$0) {
            jw.this.b.accept(jw.c($$1, this.b));
         }

         return this;
      }

      public jw.a b(cjt... $$0) {
         for(cjt $$1 : $$0) {
            jw.this.a($$1);
         }

         return this.a($$0);
      }

      public jw.a a(kl $$0, cjt... $$1) {
         for(cjt $$2 : $$1) {
            $$0.a(kk.a($$2.l()), kn.q($$2), jw.this.c);
         }

         return this.a($$1);
      }
   }

   class b {
      private final kn b;
      private final Map<kl, abb> c = Maps.newHashMap();
      @Nullable
      private iv d;
      @Nullable
      private abb e;

      public b(kn $$0) {
         this.b = $$0;
      }

      public jw.b a(cjt $$0, kl $$1) {
         this.e = $$1.a($$0, this.b, jw.this.c);
         if (jw.this.f.containsKey($$0)) {
            jw.this.b.accept(((jw.c)jw.this.f.get($$0)).create($$0, this.e, this.b, jw.this.c));
         } else {
            jw.this.b.accept(jw.c($$0, this.e));
         }

         return this;
      }

      public jw.b a(cjt... $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            for(cjt $$1 : $$0) {
               jw.this.b.accept(jw.c($$1, this.e));
               jw.this.a($$1, this.e);
            }

            return this;
         }
      }

      public jw.b a(cjt $$0) {
         abb $$1 = km.n.a($$0, this.b, jw.this.c);
         abb $$2 = km.o.a($$0, this.b, jw.this.c);
         jw.this.b.accept(jw.b($$0, $$1, $$2));
         abb $$3 = km.p.a($$0, this.b, jw.this.c);
         jw.this.a($$0, $$3);
         return this;
      }

      public jw.b b(cjt $$0) {
         abb $$1 = km.B.a($$0, this.b, jw.this.c);
         abb $$2 = km.C.a($$0, this.b, jw.this.c);
         abb $$3 = km.D.a($$0, this.b, jw.this.c);
         jw.this.b.accept(jw.a($$0, $$1, $$2, $$3));
         abb $$4 = km.E.a($$0, this.b, jw.this.c);
         jw.this.a($$0, $$4);
         return this;
      }

      public jw.b c(cjt $$0) {
         abb $$1 = km.y.a($$0, this.b, jw.this.c);
         abb $$2 = km.z.a($$0, this.b, jw.this.c);
         jw.this.b.accept(jw.c($$0, $$1, $$2));
         abb $$3 = km.A.a($$0, this.b, jw.this.c);
         jw.this.a($$0, $$3);
         return this;
      }

      public jw.b d(cjt $$0) {
         abb $$1 = km.G.a($$0, this.b, jw.this.c);
         abb $$2 = km.F.a($$0, this.b, jw.this.c);
         abb $$3 = km.I.a($$0, this.b, jw.this.c);
         abb $$4 = km.H.a($$0, this.b, jw.this.c);
         jw.this.b.accept(jw.a($$0, $$1, $$2, $$3, $$4));
         return this;
      }

      public jw.b e(cjt $$0) {
         abb $$1 = km.J.a($$0, this.b, jw.this.c);
         abb $$2 = km.K.a($$0, this.b, jw.this.c);
         jw.this.b.accept(jw.e($$0, $$1, $$2));
         return this;
      }

      public jw.b f(cjt $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            cjt $$1 = (cjt)this.d.b().get(iv.b.o);
            abb $$2 = km.L.a($$0, this.b, jw.this.c);
            jw.this.b.accept(jw.c($$0, $$2));
            jw.this.b.accept(jw.c($$1, $$2));
            jw.this.a($$0.l());
            jw.this.a($$1);
            return this;
         }
      }

      public jw.b g(cjt $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            abb $$1 = this.a(km.M, $$0);
            abb $$2 = this.a(km.N, $$0);
            jw.this.b.accept(jw.e($$0, $$1, $$2, this.e));
            jw.this.a($$0, $$1);
            return this;
         }
      }

      public jw.b h(cjt $$0) {
         abb $$1 = this.a(km.Q, $$0);
         abb $$2 = this.a(km.P, $$0);
         abb $$3 = this.a(km.R, $$0);
         jw.this.b.accept(jw.b($$0, $$1, $$2, $$3));
         jw.this.a($$0, $$2);
         return this;
      }

      private jw.b i(cjt $$0) {
         kp $$1 = (kp)jw.this.g.getOrDefault($$0, kp.a.get($$0));
         jw.this.b.accept(jw.c($$0, $$1.a($$0, jw.this.c)));
         return this;
      }

      private jw.b j(cjt $$0) {
         jw.this.g($$0);
         return this;
      }

      private void k(cjt $$0) {
         if (jw.this.e.contains($$0)) {
            jw.this.i($$0);
         } else {
            jw.this.h($$0);
         }

      }

      private abb a(kl $$0, cjt $$1) {
         return (abb)this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, jw.this.c));
      }

      public jw.b a(iv $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            BiConsumer<jw.b, cjt> $$2 = (BiConsumer)jw.h.get($$0x);
            if ($$2 != null) {
               $$2.accept(this, $$1);
            }

         });
         return this;
      }
   }

   @FunctionalInterface
   interface c {
      jz create(cjt var1, abb var2, kn var3, BiConsumer<abb, Supplier<JsonElement>> var4);
   }

   static enum d {
      a,
      b;

      public kl a() {
         return this == a ? km.aa : km.Z;
      }

      public kl b() {
         return this == a ? km.ac : km.ab;
      }
   }

   class e {
      private final kn b;

      public e(kn $$0) {
         this.b = $$0;
      }

      public jw.e a(cjt $$0) {
         kn $$1 = this.b.c(ko.d, this.b.a(ko.i));
         abb $$2 = km.f.a($$0, $$1, jw.this.c);
         jw.this.b.accept(jw.d($$0, $$2));
         return this;
      }

      public jw.e b(cjt $$0) {
         abb $$1 = km.f.a($$0, this.b, jw.this.c);
         jw.this.b.accept(jw.d($$0, $$1));
         return this;
      }

      public jw.e c(cjt $$0) {
         abb $$1 = km.f.a($$0, this.b, jw.this.c);
         abb $$2 = km.g.a($$0, this.b, jw.this.c);
         jw.this.b.accept(jw.d($$0, $$1, $$2));
         return this;
      }
   }
}
