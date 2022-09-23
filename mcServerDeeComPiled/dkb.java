import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dkb extends dkj {
   public static final Codec<dkb> a = RecordCodecBuilder.create($$0 -> $$0.group(djj.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dkb::new));
   private final djj c;

   private dkb(djj $$0) {
      this.c = $$0;
   }

   public static dkb a(djj $$0) {
      return new dkb($$0);
   }

   public static dkb a(dbl $$0, dbl $$1) {
      return a(djm.a($$0, $$1));
   }

   public static dkb b(dbl $$0, dbl $$1) {
      return a(djl.a($$0, $$1));
   }

   @Override
   public Stream<gt> a_(dkh $$0, amn $$1, gt $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dkk<?> b() {
      return dkk.l;
   }
}
