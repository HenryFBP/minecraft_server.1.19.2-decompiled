import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class dct extends dcr {
   public dct(Codec<dcq> $$0) {
      super($$0);
      this.h = ImmutableSet.of(dpw.e, dpw.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(amn $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(dcp $$0, dcq $$1, cxj $$2, Function<gt, hc<cht>> $$3, cxi $$4, gt.a $$5, gt.a $$6, dad $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         cvo $$9;
         if ($$5.v() <= $$0.a() + 31) {
            $$9 = g.g();
         } else {
            $$9 = e;
         }

         $$2.a($$5, $$9, false);
         return true;
      } else {
         return false;
      }
   }
}
