import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dng extends dlb {
   public static final Codec<dng> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a($$0),
               dng.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dng::new)
   );
   public final dng.a e;
   public final float f;
   public final float g;

   public dng(dlb.c $$0, dng.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      return a($$0, dar.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(dlt $$0, dlb.a $$1) {
      gt $$2 = new gt($$1.h().d(), 90, $$1.h().e());
      cpw $$3 = cpw.a($$1.f());
      dnf.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public dlk<?> e() {
      return dlk.k;
   }

   public static enum a implements amw {
      a("warm"),
      b("cold");

      public static final Codec<dng.a> c = amw.a(dng.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      public String a() {
         return this.d;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
