import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class dfh extends ddt<dgv> {
   public dfh(Codec<dgv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dgv> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      dgv $$3 = $$0.f();
      amn $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if (!$$5.isPresent()) {
         return false;
      } else {
         gt $$6 = $$2.h($$5.getAsInt());
         hs $$7 = new hs($$3.c, $$3.c, $$3.c);
         dwl $$8 = new dwl($$6.b($$7), $$6.a($$7));
         return gt.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, cju.jv.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(chp $$0, gt $$1, dgv $$2) {
      Predicate<cvo> $$3 = $$0x -> $$0x.a(cju.C);
      Predicate<cvo> $$4 = $$0x -> !$$0x.a(cju.C);
      Optional<dah> $$5 = dah.a($$0, $$1, $$2.b, $$3, $$4);
      return (OptionalInt)$$5.map(dah::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(chp $$0, gt $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.c())) {
         for(gy $$2 : gy.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(cgy $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      return $$2.a(cju.C) || $$2.h();
   }
}
