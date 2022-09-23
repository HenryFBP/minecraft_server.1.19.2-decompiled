import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.Optional;

public class byt extends bzm {
   protected static final Map<cjt, cjt> a = new Builder()
      .put(cju.ae, cju.al)
      .put(cju.O, cju.ac)
      .put(cju.aj, cju.aq)
      .put(cju.T, cju.ab)
      .put(cju.ai, cju.ap)
      .put(cju.S, cju.aa)
      .put(cju.ag, cju.an)
      .put(cju.Q, cju.Y)
      .put(cju.ah, cju.ao)
      .put(cju.R, cju.Z)
      .put(cju.af, cju.am)
      .put(cju.P, cju.X)
      .put(cju.mU, cju.mV)
      .put(cju.mW, cju.mX)
      .put(cju.nd, cju.ne)
      .put(cju.nf, cju.ng)
      .put(cju.ak, cju.ar)
      .put(cju.U, cju.ad)
      .build();

   protected byt(cch $$0, float $$1, float $$2, cat.a $$3) {
      super($$1, $$2, $$0, akl.bp, $$3);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      buc $$3 = $$0.o();
      cvo $$4 = $$1.a_($$2);
      Optional<cvo> $$5 = this.b($$4);
      Optional<cvo> $$6 = csj.b($$4);
      Optional<cvo> $$7 = Optional.ofNullable((cjt)((BiMap)cao.b.get()).get($$4.b())).map($$1x -> $$1x.l($$4));
      cax $$8 = $$0.n();
      Optional<cvo> $$9 = Optional.empty();
      if ($$5.isPresent()) {
         $$1.a($$3, $$2, ajw.ar, ajx.e, 1.0F, 1.0F);
         $$9 = $$5;
      } else if ($$6.isPresent()) {
         $$1.a($$3, $$2, ajw.as, ajx.e, 1.0F, 1.0F);
         $$1.a($$3, 3005, $$2, 0);
         $$9 = $$6;
      } else if ($$7.isPresent()) {
         $$1.a($$3, $$2, ajw.at, ajx.e, 1.0F, 1.0F);
         $$1.a($$3, 3004, $$2, 0);
         $$9 = $$7;
      }

      if ($$9.isPresent()) {
         if ($$3 instanceof agh) {
            aj.M.a((agh)$$3, $$2, $$8);
         }

         $$1.a($$2, (cvo)$$9.get(), 11);
         $$1.a(czv.c, $$2, czv.a.a($$3, (cvo)$$9.get()));
         if ($$3 != null) {
            $$8.a(1, $$3, $$1x -> $$1x.d($$0.p()));
         }

         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   private Optional<cvo> b(cvo $$0) {
      return Optional.ofNullable((cjt)a.get($$0.b())).map($$1 -> $$1.m().a(cpv.g, (gy.a)$$0.c(cpv.g)));
   }
}
