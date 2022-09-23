import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dkl extends dkj {
   public static final Codec<dkl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azo.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), azo.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dkl::new)
   );
   private final azo c;
   private final azo d;

   public static dkl a(azo $$0, azo $$1) {
      return new dkl($$0, $$1);
   }

   public static dkl a(azo $$0) {
      return new dkl(azl.a(0), $$0);
   }

   public static dkl b(azo $$0) {
      return new dkl($$0, azl.a(0));
   }

   private dkl(azo $$0, azo $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gt> a_(dkh $$0, amn $$1, gt $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gt($$3, $$4, $$5));
   }

   @Override
   public dkk<?> b() {
      return dkk.n;
   }
}
