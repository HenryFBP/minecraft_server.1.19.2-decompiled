import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dnm extends dlb {
   public static final Codec<dnm> d = a(dnm::new);

   public dnm(dlb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      return Optional.of(new dlb.b($$0.h().l(), (Consumer<dlt>)($$1 -> a($$1, $$0))));
   }

   private static void a(dlt $$0, dlb.a $$1) {
      int $$2 = 0;

      dnl.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         dnl.a();
         $$3 = new dnl.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<dlf> $$4 = $$3.c;

         while(!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            dlf $$6 = (dlf)$$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while($$0.c() || $$3.b == null);

   }

   @Override
   public dlk<?> e() {
      return dlk.n;
   }
}
