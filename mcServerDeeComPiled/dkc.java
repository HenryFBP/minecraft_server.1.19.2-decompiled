import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dkc extends dkj {
   public static final Codec<dkc> a = RecordCodecBuilder.create($$0 -> $$0.group(dar.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dkc::new));
   private final dar.a c;

   private dkc(dar.a $$0) {
      this.c = $$0;
   }

   public static dkc a(dar.a $$0) {
      return new dkc($$0);
   }

   @Override
   public Stream<gt> a_(dkh $$0, amn $$1, gt $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new gt($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dkk<?> b() {
      return dkk.k;
   }
}
