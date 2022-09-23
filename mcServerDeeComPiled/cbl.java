import java.util.List;
import javax.annotation.Nullable;

public class cbl extends cat {
   private static final int a = 32;

   public cbl(cat.a $$0) {
      super($$0);
   }

   @Override
   public cax Q_() {
      return ccu.a(super.Q_(), ccv.b);
   }

   @Override
   public cax a(cax $$0, cgx $$1, bcc $$2) {
      buc $$3 = $$2 instanceof buc ? (buc)$$2 : null;
      if ($$3 instanceof agh) {
         aj.z.a((agh)$$3, $$0);
      }

      if (!$$1.y) {
         for(bbg $$5 : ccu.a($$0)) {
            if ($$5.b().a()) {
               $$5.b().a($$3, $$3, $$2, $$5.d(), 1.0);
            } else {
               $$2.b(new bbg($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(akg.c.b(this));
         if (!$$3.fB().d) {
            $$0.g(1);
         }
      }

      if ($$3 == null || !$$3.fB().d) {
         if ($$0.b()) {
            return new cax(caz.qt);
         }

         if ($$3 != null) {
            $$3.fA().e(new cax(caz.qt));
         }
      }

      $$2.a(czv.m);
      return $$0;
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      buc $$3 = $$0.o();
      cax $$4 = $$0.n();
      cvo $$5 = $$1.a_($$2);
      if ($$0.k() != gy.a && $$5.a(akl.bP) && ccu.d($$4) == ccv.b) {
         $$1.a(null, $$2, ajw.hs, ajx.h, 1.0F, 1.0F);
         $$3.a($$0.p(), cay.a($$4, $$3, new cax(caz.qt)));
         $$3.b(akg.c.b($$4.c()));
         if (!$$1.y) {
            agg $$6 = (agg)$$1;

            for(int $$7 = 0; $$7 < 5; ++$$7) {
               $$6.a(io.af, (double)$$2.u() + $$1.w.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.w.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, ajw.bR, ajx.e, 1.0F, 1.0F);
         $$1.a(null, czv.z, $$2);
         $$1.b($$2, cju.qq.m());
         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   @Override
   public int b(cax $$0) {
      return 32;
   }

   @Override
   public ccn c(cax $$0) {
      return ccn.c;
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      return cay.a($$0, $$1, $$2);
   }

   @Override
   public String j(cax $$0) {
      return ccu.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      ccu.a($$0, $$2, 1.0F);
   }

   @Override
   public boolean i(cax $$0) {
      return super.i($$0) || !ccu.a($$0).isEmpty();
   }

   @Override
   public void a(bzj $$0, hi<cax> $$1) {
      if (this.a($$0)) {
         for(ccs $$2 : hm.Z) {
            if ($$2 != ccv.a) {
               $$1.add(ccu.a(new cax(this), $$2));
            }
         }
      }

   }
}
