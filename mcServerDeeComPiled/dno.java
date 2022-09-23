import com.mojang.serialization.Codec;
import java.util.Optional;

public class dno extends dlb {
   public static final Codec<dno> d = a(dno::new);

   public dno(dlb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      return a($$0, dar.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dlt $$0, dlb.a $$1) {
      $$0.a(new dnn($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dlk<?> e() {
      return dlk.o;
   }
}
