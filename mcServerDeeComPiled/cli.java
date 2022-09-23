import javax.annotation.Nullable;

public class cli extends cjg {
   public static final cwo a = cwe.aT;
   public static final cwf b = cwe.p;
   protected static final dxj c = cjt.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   public cli(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return c;
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(a);
   }

   private static void d(cvo $$0, cgx $$1, gt $$2) {
      int $$3 = $$1.a(chg.a, $$2) - $$1.o_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(b);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ami.b($$4));
      }

      $$3 = ami.a($$3, 0, 15);
      if ($$0.c(a) != $$3) {
         $$1.a($$2, $$0.a(a, Integer.valueOf($$3)), 3);
      }

   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$3.fN()) {
         if ($$1.y) {
            return baj.a;
         } else {
            cvo $$6 = $$0.a(b);
            $$1.a($$2, $$6, 4);
            $$1.a(czv.c, $$2, czv.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return baj.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return !$$0.y && $$0.q_().g() ? a($$2, ctk.p, cli::a) : null;
   }

   private static void a(cgx $$0, gt $$1, cvo $$2, ctt $$3) {
      if ($$0.U() % 20L == 0L) {
         d($$2, $$0, $$1);
      }

   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }
}
