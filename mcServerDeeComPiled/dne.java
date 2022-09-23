import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dne extends dlb {
   public static final Codec<dne> d = a(dne::new);

   public dne(dlb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for(hc<cht> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().c())) {
         if (!$$4.a(akk.V)) {
            return Optional.empty();
         }
      }

      return a($$0, dar.a.c, $$1x -> a($$1x, $$0));
   }

   private static dlf a(cge $$0, dbo $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      gy $$4 = gy.c.a.a($$1);
      return new dnd.h($$1, $$2, $$3, $$4);
   }

   private static void a(dlt $$0, dlb.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dlq a(cge $$0, long $$1, dlq $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dbo $$3 = new dbo(new das(dbg.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dlf $$4 = (dlf)$$2.c().get(0);
         dkt $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         gy $$8 = gy.c.a.a($$3);
         gy $$9 = (gy)Objects.requireNonNullElse($$4.i(), $$8);
         dlf $$10 = new dnd.h($$3, $$6, $$7, $$9);
         dlt $$11 = new dlt();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dlk<?> e() {
      return dlk.j;
   }
}
