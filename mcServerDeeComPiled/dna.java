import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dna extends dlb {
   public static final ayx<cif.c> d = ayx.a(
      new cif.c(bbr.i, 10, 2, 3), new cif.c(bbr.bm, 5, 4, 4), new cif.c(bbr.bf, 8, 5, 5), new cif.c(bbr.aE, 2, 5, 5), new cif.c(bbr.aa, 3, 4, 4)
   );
   public static final Codec<dna> e = a(dna::new);

   public dna(dlb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      cge $$1 = $$0.h();
      gt $$2 = new gt($$1.d(), 64, $$1.e());
      return Optional.of(new dlb.b($$2, (Consumer<dlt>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dlt $$0, dlb.a $$1) {
      dmz.q $$2 = new dmz.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dlf> $$3 = $$2.d;

      while(!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dlf $$5 = (dlf)$$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dlk<?> e() {
      return dlk.d;
   }
}
