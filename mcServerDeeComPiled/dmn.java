import com.mojang.serialization.Codec;
import java.util.Optional;

public class dmn extends dlb {
   public static final Codec<dmn> d = a(dmn::new);

   public dmn(dlb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      return a($$0, dar.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dlt $$0, dlb.a $$1) {
      gt $$2 = new gt($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dmm.a($$2));
   }

   @Override
   public dlk<?> e() {
      return dlk.a;
   }
}
