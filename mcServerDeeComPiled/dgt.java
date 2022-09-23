import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class dgt implements dfx {
   public static final Codec<dgt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhw.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               diy.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               dhw.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               dhi.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               dhu.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               dhw.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               dgy.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               din.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dgt::new)
   );
   public final dhw b;
   public final dhw c;
   public final diy d;
   public final dhw e;
   public final dhi f;
   public final Optional<dhu> g;
   public final dgy h;
   public final List<din> i;
   public final boolean j;
   public final boolean k;

   protected dgt(dhw $$0, diy $$1, dhw $$2, dhi $$3, Optional<dhu> $$4, dhw $$5, dgy $$6, List<din> $$7, boolean $$8, boolean $$9) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.c = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }

   public static class a {
      public final dhw a;
      private final diy c;
      public final dhw b;
      private final dhi d;
      private final Optional<dhu> e;
      private dhw f;
      private final dgy g;
      private List<din> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(dhw $$0, diy $$1, dhw $$2, dhi $$3, Optional<dhu> $$4, dgy $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = dhw.a(cju.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(dhw $$0, diy $$1, dhw $$2, dhi $$3, dgy $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public dgt.a a(dhw $$0) {
         this.f = $$0;
         return this;
      }

      public dgt.a a(List<din> $$0) {
         this.h = $$0;
         return this;
      }

      public dgt.a a() {
         this.i = true;
         return this;
      }

      public dgt.a b() {
         this.j = true;
         return this;
      }

      public dgt c() {
         return new dgt(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
