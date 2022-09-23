import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;

public class dgc implements dfx {
   public static final Codec<dgc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hm.V.p().fieldOf("block").flatXmap(dgc::a, DataResult::success).orElse((cok)cju.en).forGetter($$0x -> $$0x.b),
               Codec.intRange(1, 64).fieldOf("search_range").orElse(10).forGetter($$0x -> $$0x.c),
               Codec.BOOL.fieldOf("can_place_on_floor").orElse(false).forGetter($$0x -> $$0x.d),
               Codec.BOOL.fieldOf("can_place_on_ceiling").orElse(false).forGetter($$0x -> $$0x.e),
               Codec.BOOL.fieldOf("can_place_on_wall").orElse(false).forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_spreading").orElse(0.5F).forGetter($$0x -> $$0x.g),
               ho.a(hm.h).fieldOf("can_be_placed_on").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dgc::new)
   );
   public final cok b;
   public final int c;
   public final boolean d;
   public final boolean e;
   public final boolean f;
   public final float g;
   public final he<cjt> h;
   private final ObjectArrayList<gy> i;

   private static DataResult<cok> a(cjt $$0) {
      return $$0 instanceof cok $$1 ? DataResult.success($$1) : DataResult.error("Growth block should be a multiface block");
   }

   public dgc(cok $$0, int $$1, boolean $$2, boolean $$3, boolean $$4, float $$5, he<cjt> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = new ObjectArrayList(6);
      if ($$3) {
         this.i.add(gy.b);
      }

      if ($$2) {
         this.i.add(gy.a);
      }

      if ($$4) {
         gy.c.a.forEach(this.i::add);
      }

   }

   public List<gy> a(amn $$0, gy $$1) {
      return ad.a(this.i.stream().filter($$1x -> $$1x != $$1), $$0);
   }

   public List<gy> a(amn $$0) {
      return ad.a(this.i, $$0);
   }
}
