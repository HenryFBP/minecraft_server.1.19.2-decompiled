import com.mojang.serialization.Codec;
import java.util.Optional;

public class dep extends ddt<dgg> {
   public dep(Codec<dgg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgg> $$0) {
      cgy $$1 = $$0.b();
      gt $$2 = $$0.e();
      amn $$3 = $$0.d();
      dgg $$4 = $$0.f();
      Optional<gy> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gt $$6 = $$2.a(((gy)$$5.get()).g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && ddp.c($$1.a_($$2.a((gy)$$5.get()))) ? 2 : 1;
         ddp.a($$1, $$2, (gy)$$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<gy> a(cgy $$0, gt $$1, amn $$2) {
      boolean $$3 = ddp.b($$0.a_($$1.b()));
      boolean $$4 = ddp.b($$0.a_($$1.c()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? gy.a : gy.b);
      } else if ($$3) {
         return Optional.of(gy.a);
      } else {
         return $$4 ? Optional.of(gy.b) : Optional.empty();
      }
   }

   private static void a(cgy $$0, amn $$1, gt $$2, dgg $$3) {
      ddp.c($$0, $$2);

      for(gy $$4 : gy.c.a) {
         if (!($$1.i() > $$3.c)) {
            gt $$5 = $$2.a($$4);
            ddp.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               gt $$6 = $$5.a(gy.b($$1));
               ddp.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  gt $$7 = $$6.a(gy.b($$1));
                  ddp.c($$0, $$7);
               }
            }
         }
      }

   }
}
