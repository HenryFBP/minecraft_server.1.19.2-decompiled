import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Function;

public final class dmu extends dlb {
   public static final int d = 128;
   public static final Codec<dmu> e = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  a($$0),
                  dmk.b.fieldOf("start_pool").forGetter($$0x -> $$0x.f),
                  abb.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.g),
                  Codec.intRange(0, 7).fieldOf("size").forGetter($$0x -> $$0x.h),
                  djj.c.fieldOf("start_height").forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.j),
                  dar.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.k),
                  Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.l)
               )
               .apply($$0, dmu::new)
      )
      .flatXmap(f(), f())
      .codec();
   private final hc<dmk> f;
   private final Optional<abb> g;
   private final int h;
   private final djj i;
   private final boolean j;
   private final Optional<dar.a> k;
   private final int l;

   private static Function<dmu, DataResult<dmu>> f() {
      return $$0 -> {
         int $$1 = switch($$0.d()) {
            case a -> 0;
            case b, c, d -> 12;
            default -> throw new IncompatibleClassChangeError();
         };
         return $$0.l + $$1 > 128 ? DataResult.error("Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
      };
   }

   public dmu(dlb.c $$0, hc<dmk> $$1, Optional<abb> $$2, int $$3, djj $$4, boolean $$5, Optional<dar.a> $$6, int $$7) {
      super($$0);
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
   }

   public dmu(dlb.c $$0, hc<dmk> $$1, int $$2, djj $$3, boolean $$4, dar.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80);
   }

   public dmu(dlb.c $$0, hc<dmk> $$1, int $$2, djj $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      cge $$1 = $$0.h();
      int $$2 = this.i.a($$0.f(), new dbn($$0.b(), $$0.i()));
      gt $$3 = new gt($$1.d(), $$2, $$1.e());
      mm.a();
      return dme.a($$0, this.f, this.g, this.h, $$3, this.j, this.k, this.l);
   }

   @Override
   public dlk<?> e() {
      return dlk.f;
   }
}
