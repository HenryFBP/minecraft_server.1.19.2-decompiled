import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dny extends doq {
   public static final Codec<dny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ho.a(hm.h).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, dny::new)
   );
   private Optional<he<cjt>> b;
   private final float c;

   public dny(akz<cjt> $$0, float $$1) {
      this(Optional.of(hm.V.b($$0)), $$1);
   }

   public dny(float $$0) {
      this(Optional.empty(), $$0);
   }

   private dny(Optional<he<cjt>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      amn $$6 = $$5.b($$4.a);
      return (!this.b.isPresent() || $$3.b.a((he<cjt>)this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected dos<?> a() {
      return dos.b;
   }
}
