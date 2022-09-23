import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dkd extends dkj {
   private static final dkd c = new dkd();
   public static final Codec<dkd> a = Codec.unit(() -> c);

   public static dkd a() {
      return c;
   }

   @Override
   public Stream<gt> a_(dkh $$0, amn $$1, gt $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gt($$3, $$2.v(), $$4));
   }

   @Override
   public dkk<?> b() {
      return dkk.m;
   }
}
