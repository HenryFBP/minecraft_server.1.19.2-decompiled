import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record daw(daz j, cvo k, cvo l, dax m, dbi.o n, List<cic.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<daw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               daz.a.fieldOf("noise").forGetter(daw::f),
               cvo.b.fieldOf("default_block").forGetter(daw::g),
               cvo.b.fieldOf("default_fluid").forGetter(daw::h),
               dax.a.fieldOf("noise_router").forGetter(daw::i),
               dbi.o.b.fieldOf("surface_rule").forGetter(daw::j),
               cic.d.a.listOf().fieldOf("spawn_target").forGetter(daw::k),
               Codec.INT.fieldOf("sea_level").forGetter(daw::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(daw::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(daw::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(daw::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(daw::n)
            )
            .apply($$0, daw::new)
   );
   public static final Codec<hc<daw>> b = aav.a(hm.aJ, a);
   public static final aba<daw> c = aba.a(hm.aJ, new abb("overworld"));
   public static final aba<daw> d = aba.a(hm.aJ, new abb("large_biomes"));
   public static final aba<daw> e = aba.a(hm.aJ, new abb("amplified"));
   public static final aba<daw> f = aba.a(hm.aJ, new abb("nether"));
   public static final aba<daw> g = aba.a(hm.aJ, new abb("end"));
   public static final aba<daw> h = aba.a(hm.aJ, new abb("caves"));
   public static final aba<daw> i = aba.a(hm.aJ, new abb("floating_islands"));

   @Deprecated
   public boolean a() {
      return this.q;
   }

   public boolean b() {
      return this.r;
   }

   public boolean c() {
      return this.s;
   }

   public dbo.a d() {
      return this.t ? dbo.a.a : dbo.a.b;
   }

   private static hc<daw> a(hm<daw> $$0, aba<daw> $$1, daw $$2) {
      return iw.a($$0, $$1.a(), $$2);
   }

   public static hc<daw> a(hm<daw> $$0) {
      a($$0, c, a(false, false));
      a($$0, d, a(false, true));
      a($$0, e, a(true, false));
      a($$0, f, p());
      a($$0, g, o());
      a($$0, h, q());
      return a($$0, i, r());
   }

   private static daw o() {
      return new daw(daz.d, cju.eG.m(), cju.a.m(), day.e(iw.l), ms.c(), List.of(), 0, true, false, false, true);
   }

   private static daw p() {
      return new daw(daz.c, cju.df.m(), cju.D.m(), day.b(iw.l), ms.b(), List.of(), 32, false, false, false, true);
   }

   private static daw a(boolean $$0, boolean $$1) {
      return new daw(daz.b, cju.b.m(), cju.C.m(), day.a(iw.l, $$1, $$0), ms.a(), new cih().a(), 63, false, true, true, false);
   }

   private static daw q() {
      return new daw(daz.e, cju.b.m(), cju.C.m(), day.c(iw.l), ms.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static daw r() {
      return new daw(daz.f, cju.b.m(), cju.C.m(), day.d(iw.l), ms.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static daw e() {
      return new daw(daz.b, cju.b.m(), cju.a.m(), day.a(), ms.d(), List.of(), 63, true, false, false, false);
   }

   public daz f() {
      return this.j;
   }

   public cvo g() {
      return this.k;
   }

   public cvo h() {
      return this.l;
   }

   public dax i() {
      return this.m;
   }

   public dbi.o j() {
      return this.n;
   }

   public List<cic.d> k() {
      return this.o;
   }

   public int l() {
      return this.p;
   }

   public boolean m() {
      return this.r;
   }

   public boolean n() {
      return this.t;
   }
}
