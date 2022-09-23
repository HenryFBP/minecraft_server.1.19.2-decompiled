import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dfw implements dfx {
   public static final Codec<dfw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gt.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dfw::new)
   );
   private final Optional<gt> b;
   private final boolean c;

   private dfw(Optional<gt> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dfw a(gt $$0, boolean $$1) {
      return new dfw(Optional.of($$0), $$1);
   }

   public static dfw a() {
      return new dfw(Optional.empty(), false);
   }

   public Optional<gt> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
