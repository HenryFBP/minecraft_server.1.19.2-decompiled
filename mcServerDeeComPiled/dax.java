import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dax(dak b, dak c, dak d, dak e, dak f, dak g, dak h, dak i, dak j, dak k, dak l, dak m, dak n, dak o, dak p) {
   public static final Codec<dax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dax::a),
               a("fluid_level_floodedness", dax::b),
               a("fluid_level_spread", dax::c),
               a("lava", dax::d),
               a("temperature", dax::e),
               a("vegetation", dax::f),
               a("continents", dax::g),
               a("erosion", dax::h),
               a("depth", dax::i),
               a("ridges", dax::j),
               a("initial_density_without_jaggedness", dax::k),
               a("final_density", dax::l),
               a("vein_toggle", dax::m),
               a("vein_ridged", dax::n),
               a("vein_gap", dax::o)
            )
            .apply($$0, dax::new)
   );

   private static RecordCodecBuilder<dax, dak> a(String $$0, Function<dax, dak> $$1) {
      return dak.d.fieldOf($$0).forGetter($$1);
   }

   public dax a(dak.f $$0) {
      return new dax(
         this.b.a($$0),
         this.c.a($$0),
         this.d.a($$0),
         this.e.a($$0),
         this.f.a($$0),
         this.g.a($$0),
         this.h.a($$0),
         this.i.a($$0),
         this.j.a($$0),
         this.k.a($$0),
         this.l.a($$0),
         this.m.a($$0),
         this.n.a($$0),
         this.o.a($$0),
         this.p.a($$0)
      );
   }

   public dak a() {
      return this.b;
   }

   public dak b() {
      return this.c;
   }

   public dak c() {
      return this.d;
   }

   public dak d() {
      return this.e;
   }

   public dak e() {
      return this.f;
   }

   public dak f() {
      return this.g;
   }

   public dak g() {
      return this.h;
   }

   public dak h() {
      return this.i;
   }

   public dak i() {
      return this.j;
   }

   public dak j() {
      return this.k;
   }

   public dak k() {
      return this.l;
   }

   public dak l() {
      return this.m;
   }

   public dak m() {
      return this.n;
   }

   public dak n() {
      return this.o;
   }

   public dak o() {
      return this.p;
   }
}
