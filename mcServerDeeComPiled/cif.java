import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cif {
   private static final Logger d = LogUtils.getLogger();
   private static final float e = 0.1F;
   public static final ayx<cif.c> a = ayx.c();
   public static final cif b = new cif.a().a();
   public static final MapCodec<cif> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 0.9999999F).optionalFieldOf("creature_spawn_probability", 0.1F).forGetter($$0x -> $$0x.f),
               Codec.simpleMap(bcf.i, ayx.c(cif.c.a).promotePartial(ad.a("Spawn data: ", d::error)), amw.a(bcf.values()))
                  .fieldOf("spawners")
                  .forGetter($$0x -> $$0x.g),
               Codec.simpleMap(hm.X.p(), cif.b.a, hm.X).fieldOf("spawn_costs").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cif::new)
   );
   private final float f;
   private final Map<bcf, ayx<cif.c>> g;
   private final Map<bbr<?>, cif.b> h;

   cif(float $$0, Map<bcf, ayx<cif.c>> $$1, Map<bbr<?>, cif.b> $$2) {
      this.f = $$0;
      this.g = ImmutableMap.copyOf($$1);
      this.h = ImmutableMap.copyOf($$2);
   }

   public ayx<cif.c> a(bcf $$0) {
      return (ayx<cif.c>)this.g.getOrDefault($$0, a);
   }

   @Nullable
   public cif.b a(bbr<?> $$0) {
      return (cif.b)this.h.get($$0);
   }

   public float a() {
      return this.f;
   }

   public static class a {
      private final Map<bcf, List<cif.c>> a = (Map<bcf, List<cif.c>>)Stream.of(bcf.values())
         .collect(ImmutableMap.toImmutableMap($$0 -> $$0, $$0 -> Lists.newArrayList()));
      private final Map<bbr<?>, cif.b> b = Maps.newLinkedHashMap();
      private float c = 0.1F;

      public cif.a a(bcf $$0, cif.c $$1) {
         ((List)this.a.get($$0)).add($$1);
         return this;
      }

      public cif.a a(bbr<?> $$0, double $$1, double $$2) {
         this.b.put($$0, new cif.b($$2, $$1));
         return this;
      }

      public cif.a a(float $$0) {
         this.c = $$0;
         return this;
      }

      public cif a() {
         return new cif(
            this.c,
            (Map<bcf, ayx<cif.c>>)this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ayx.a((List)$$0.getValue()))),
            ImmutableMap.copyOf(this.b)
         );
      }
   }

   public static class b {
      public static final Codec<cif.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.DOUBLE.fieldOf("energy_budget").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("charge").forGetter($$0x -> $$0x.c))
               .apply($$0, cif.b::new)
      );
      private final double b;
      private final double c;

      b(double $$0, double $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public double a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }
   }

   public static class c extends ayv.a {
      public static final Codec<cif.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hm.X.p().fieldOf("type").forGetter($$0x -> $$0x.b),
                  ayu.a.fieldOf("weight").forGetter(ayv.a::a),
                  Codec.INT.fieldOf("minCount").forGetter($$0x -> $$0x.c),
                  Codec.INT.fieldOf("maxCount").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cif.c::new)
      );
      public final bbr<?> b;
      public final int c;
      public final int d;

      public c(bbr<?> $$0, int $$1, int $$2, int $$3) {
         this($$0, ayu.a($$1), $$2, $$3);
      }

      public c(bbr<?> $$0, ayu $$1, int $$2, int $$3) {
         super($$1);
         this.b = $$0.f() == bcf.h ? bbr.aq : $$0;
         this.c = $$2;
         this.d = $$3;
      }

      public String toString() {
         return bbr.a(this.b) + "*(" + this.c + "-" + this.d + "):" + this.a();
      }
   }
}
