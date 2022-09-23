import javax.annotation.Nullable;

public class cnm extends cjg {
   public static final cwf a = cwe.n;

   protected cnm(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      pj $$5 = byx.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(a, Boolean.valueOf(true)), 2);
      }

   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$0.c(a)) {
         this.a($$1, $$2);
         $$0 = $$0.a(a, Boolean.valueOf(false));
         $$1.a(czv.F, $$2, czv.a.a($$0));
         $$1.a($$2, $$0, 2);
         $$1.a(czv.c, $$2, czv.a.a($$3, $$0));
         return baj.a($$1.y);
      } else {
         return baj.d;
      }
   }

   public void a(@Nullable bbn $$0, cgy $$1, gt $$2, cvo $$3, cax $$4) {
      cti $$5 = $$1.c_($$2);
      if ($$5 instanceof cuc $$6) {
         $$6.a($$4.o());
         $$6.d();
         $$1.a($$2, $$3.a(a, Boolean.valueOf(true)), 2);
         $$1.a(czv.c, $$2, czv.a.a($$0, $$3));
      }

   }

   private void a(cgx $$0, gt $$1) {
      if (!$$0.y) {
         cti $$2 = $$0.c_($$1);
         if ($$2 instanceof cuc) {
            cuc $$3 = (cuc)$$2;
            cax $$4 = $$3.c();
            if (!$$4.b()) {
               $$0.c(1010, $$1, 0);
               $$3.a();
               float $$5 = 0.7F;
               double $$6 = (double)($$0.w.i() * 0.7F) + 0.15F;
               double $$7 = (double)($$0.w.i() * 0.7F) + 0.060000002F + 0.6;
               double $$8 = (double)($$0.w.i() * 0.7F) + 0.15F;
               cax $$9 = $$4.o();
               bqv $$10 = new bqv($$0, (double)$$1.u() + $$6, (double)$$1.v() + $$7, (double)$$1.w() + $$8, $$9);
               $$10.o();
               $$0.b($$10);
            }
         }
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.a($$1, $$2);
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cuc($$0, $$1);
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      cti $$3 = $$1.c_($$2);
      if ($$3 instanceof cuc) {
         cat $$4 = ((cuc)$$3).c().c();
         if ($$4 instanceof cbo) {
            return ((cbo)$$4).i();
         }
      }

      return 0;
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return $$1.c(a) ? a($$2, ctk.e, cuc::a) : null;
   }
}
