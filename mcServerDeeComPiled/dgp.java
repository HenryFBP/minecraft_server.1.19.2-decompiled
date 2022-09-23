import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgp(dhw b) implements dfx {
   public static final Codec<dgp> a = RecordCodecBuilder.create($$0 -> $$0.group(dhw.a.fieldOf("to_place").forGetter($$0x -> $$0x.b)).apply($$0, dgp::new));

   public dhw a() {
      return this.b;
   }
}
