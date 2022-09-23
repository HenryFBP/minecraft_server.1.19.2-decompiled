import javax.annotation.Nullable;

public class cnh extends cna {
   public cnh(cvn.c $$0) {
      super($$0);
   }

   @Override
   public void a(cgx $$0, buc $$1, gt $$2, cvo $$3, @Nullable cti $$4, cax $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cet.a(cev.v, $$5) == 0) {
         if ($$0.q_().i()) {
            $$0.a($$2, false);
            return;
         }

         dpz $$6 = $$0.a_($$2.c()).d();
         if ($$6.c() || $$6.a()) {
            $$0.b($$2, cju.C.m());
         }
      }

   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.a(chg.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }

   }

   protected void d(cvo $$0, cgx $$1, gt $$2) {
      if ($$1.q_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, cju.C.m());
         $$1.a($$2, cju.C, $$2);
      }
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.a;
   }
}
