import java.util.List;
import javax.annotation.Nullable;

public class clv extends cjg {
   protected static final dxj a = cjt.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<gt> b = gt.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(gt::h).toList();

   protected clv(cvn.c $$0) {
      super($$0);
   }

   public static boolean a(cgx $$0, gt $$1, gt $$2) {
      return $$0.a_($$1.a($$2)).a(cju.bX) && $$0.x($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2));
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      super.a($$0, $$1, $$2, $$3);

      for(gt $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               io.t,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }

   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return $$0.y ? a($$2, ctk.l, ctw::a) : null;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return baj.b;
      }
   }

   @Nullable
   @Override
   public bam b(cvo $$0, cgx $$1, gt $$2) {
      cti $$3 = $$1.c_($$2);
      if ($$3 instanceof ctw) {
         rq $$4 = ((ban)$$3).C_();
         return new bap(($$2x, $$3x, $$4x) -> new bxe($$2x, $$3x, bwx.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if ($$4.z()) {
         cti $$5 = $$0.c_($$1);
         if ($$5 instanceof ctw) {
            ((ctw)$$5).a($$4.x());
         }
      }

   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
