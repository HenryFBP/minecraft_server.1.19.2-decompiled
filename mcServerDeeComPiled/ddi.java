import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ddi extends ddt<dge> {
   public ddi(Codec<dge> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dge> $$0) {
      amn $$1 = $$0.d();
      chp $$2 = $$0.b();
      gt $$3 = $$0.e();
      Optional<cjt> $$4 = hm.V.c(akl.al).flatMap($$1x -> $$1x.a($$1)).map(hc::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, ((cjt)$$4.get()).m());
   }

   protected abstract boolean a(cgy var1, amn var2, gt var3, cvo var4);

   protected boolean b(cgy $$0, amn $$1, gt $$2, cvo $$3) {
      gt $$4 = $$2.b();
      cvo $$5 = $$0.a_($$2);
      if (($$5.a(cju.C) || $$5.a(akl.ao)) && $$0.a_($$4).a(cju.C)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            hm.V.c(akl.ao).flatMap($$1x -> $$1x.a($$1)).map(hc::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cju.lG.m().a(cqh.b, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for(gy $$6 : gy.c.a) {
            if ($$1.i() < 0.2F) {
               gt $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cju.C)) {
                  hm.V.c(akl.am).flatMap($$1x -> $$1x.a($$1)).map(hc::a).ifPresent($$3x -> {
                     cvo $$4x = $$3x.m();
                     if ($$4x.b(cjf.a)) {
                        $$4x = $$4x.a(cjf.a, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
