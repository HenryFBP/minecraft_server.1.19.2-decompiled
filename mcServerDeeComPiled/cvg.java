import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class cvg extends cjg {
   public static final cwi a = cvi.a;
   public static final cwm<cwq> b = cvi.b;

   public cvg(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, cwq.a));
   }

   @Nullable
   @Override
   public cti a(gt $$0, cvo $$1) {
      return null;
   }

   public static cti a(gt $$0, cvo $$1, cvo $$2, gy $$3, boolean $$4, boolean $$5) {
      return new cvk($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return a($$2, ctk.j, cvk::a);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         cti $$5 = $$1.c_($$2);
         if ($$5 instanceof cvk) {
            ((cvk)$$5).j();
         }

      }
   }

   @Override
   public void a(cgy $$0, gt $$1, cvo $$2) {
      gt $$3 = $$1.a(((gy)$$2.c(a)).g());
      cvo $$4 = $$0.a_($$3);
      if ($$4.b() instanceof cvh && $$4.c(cvh.b)) {
         $$0.a($$3, false);
      }

   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if (!$$1.y && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return baj.b;
      } else {
         return baj.d;
      }
   }

   @Override
   public List<cax> a(cvo $$0, dsd.a $$1) {
      cvk $$2 = this.a($$1.a(), new gt($$1.a(dul.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return dxg.a();
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      cvk $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : dxg.a();
   }

   @Nullable
   private cvk a(cgd $$0, gt $$1) {
      cti $$2 = $$0.c_($$1);
      return $$2 instanceof cvk ? (cvk)$$2 : null;
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return cax.b;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
