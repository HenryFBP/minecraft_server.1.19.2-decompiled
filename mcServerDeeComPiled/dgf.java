import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dgf implements dfx {
   public static final Codec<dgf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.list(dgf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dgf::new)
   );
   public final List<dgf.a> b;
   public final int c;
   public final float d;

   public dgf(List<dgf.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public dgf(List<dgf.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public dgf(don $$0, cvo $$1, int $$2, float $$3) {
      this(ImmutableList.of(new dgf.a($$0, $$1)), $$2, $$3);
   }

   public dgf(don $$0, cvo $$1, int $$2) {
      this(ImmutableList.of(new dgf.a($$0, $$1)), $$2, 0.0F);
   }

   public static dgf.a a(don $$0, cvo $$1) {
      return new dgf.a($$0, $$1);
   }

   public static class a {
      public static final Codec<dgf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(don.c.fieldOf("target").forGetter($$0x -> $$0x.b), cvo.b.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, dgf.a::new)
      );
      public final don b;
      public final cvo c;

      a(don $$0, cvo $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
