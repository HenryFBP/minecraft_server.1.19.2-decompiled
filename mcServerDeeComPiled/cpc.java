import java.util.Optional;

public class cpc extends cjt implements cjy {
   private static final float a = 0.083333336F;
   private static final float b = 0.9F;
   private static final float c = 1.5F;
   private static final float d = 2.5F;
   private static final dxj e = dxg.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double f = 4.0;
   private static final double g = 7.0;

   public cpc(cvn.c $$0) {
      super($$0);
   }

   @Override
   public boolean a(cvo $$0, cvo $$1, gy $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public dxj b_(cvo $$0, cgd $$1, gt $$2) {
      return dxg.a();
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!($$3 instanceof bcc) || $$3.db().a(this)) {
         $$3.a($$0, new dwq(0.9F, 1.5, 0.9F));
         if ($$1.y) {
            amn $$4 = $$1.r_();
            boolean $$5 = $$3.M != $$3.df() || $$3.O != $$3.dl();
            if ($$5 && $$4.h()) {
               $$1.a(
                  io.aD,
                  $$3.df(),
                  (double)($$2.v() + 1),
                  $$3.dl(),
                  (double)(ami.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ami.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.y) {
         if ($$3.bH() && ($$1.W().b(cgt.c) || $$3 instanceof buc) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }

   }

   @Override
   public void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bcc $$5) {
         bcc.a $$7 = $$5.en();
         ajv $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      if ($$3 instanceof dxa $$4) {
         bbn $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.L > 2.5F) {
               return e;
            }

            boolean $$6 = $$5 instanceof bqu;
            if ($$6 || a($$5) && $$3.a(dxg.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return dxg.a();
   }

   @Override
   public dxj b(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return dxg.a();
   }

   public static boolean a(bbn $$0) {
      if ($$0.ad().a(akn.f)) {
         return true;
      } else {
         return $$0 instanceof bcc ? ((bcc)$$0).c(bbs.c).a(caz.nX) : false;
      }
   }

   @Override
   public cax c(cgy $$0, gt $$1, cvo $$2) {
      $$0.a($$1, cju.a.m(), 11);
      if (!$$0.k_()) {
         $$0.c(2001, $$1, cjt.i($$2));
      }

      return new cax(caz.oK);
   }

   @Override
   public Optional<ajv> X_() {
      return Optional.of(ajw.ck);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return true;
   }
}
