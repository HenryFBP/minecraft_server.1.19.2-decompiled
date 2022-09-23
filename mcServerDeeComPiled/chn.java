import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record chn(pj d, Optional<chn.a> e) {
   public static final Codec<chn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(pj.a.fieldOf("entity").forGetter($$0x -> $$0x.d), chn.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, chn::new)
   );
   public static final Codec<ayt<chn>> b = ayt.a(a);
   public static final String c = "minecraft:pig";

   public chn() {
      this(ad.a(new pj(), $$0 -> $$0.a("id", "minecraft:pig")), Optional.empty());
   }

   public chn(pj $$0, Optional<chn.a> $$1) {
      abb $$2 = abb.a($$0.l("id"));
      $$0.a("id", $$2 != null ? $$2.toString() : "minecraft:pig");
      this.d = $$0;
      this.e = $$1;
   }

   public pj a() {
      return this.d;
   }

   public Optional<chn.a> b() {
      return this.e;
   }

   public pj c() {
      return this.d;
   }

   public Optional<chn.a> d() {
      return this.e;
   }

   public static record a(amb<Integer> b, amb<Integer> c) {
      private static final amb<Integer> d = new amb(0, 15);
      public static final Codec<chn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  amb.a.optionalFieldOf("block_light_limit", d).flatXmap(chn.a::a, chn.a::a).forGetter($$0x -> $$0x.b),
                  amb.a.optionalFieldOf("sky_light_limit", d).flatXmap(chn.a::a, chn.a::a).forGetter($$0x -> $$0x.c)
               )
               .apply($$0, chn.a::new)
      );

      private static DataResult<amb<Integer>> a(amb<Integer> $$0) {
         return !d.a($$0) ? DataResult.error("Light values must be withing range " + d) : DataResult.success($$0);
      }

      public amb<Integer> a() {
         return this.b;
      }

      public amb<Integer> b() {
         return this.c;
      }
   }
}
