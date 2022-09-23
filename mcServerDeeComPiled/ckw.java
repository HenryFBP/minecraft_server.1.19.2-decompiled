import java.util.List;
import javax.annotation.Nullable;

public class ckw extends cll implements cmb {
   public static final cwm<cwh> a = cwe.be;

   public ckw(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(aD, gy.c).a(c, Boolean.valueOf(false)).a(a, cwh.a));
   }

   @Override
   protected int g(cvo $$0) {
      return 2;
   }

   @Override
   protected int b(cgd $$0, gt $$1, cvo $$2) {
      cti $$3 = $$0.c_($$1);
      return $$3 instanceof ctq ? ((ctq)$$3).c() : 0;
   }

   private int e(cgx $$0, gt $$1, cvo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.b((cha)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(a) == cwh.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cgx $$0, gt $$1, cvo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.b((cha)$$0, $$1, $$2);
         if ($$3 > $$4) {
            return true;
         } else {
            return $$3 == $$4 && $$2.c(a) == cwh.a;
         }
      }
   }

   @Override
   protected int b(cgx $$0, gt $$1, cvo $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      gy $$4 = $$2.c(aD);
      gt $$5 = $$1.a($$4);
      cvo $$6 = $$0.a_($$5);
      if ($$6.k()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         bqo $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.C(), $$6.k() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private bqo a(cgx $$0, gy $$1, gt $$2) {
      List<bqo> $$3 = $$0.a(
         bqo.class,
         new dwl((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cv() == $$1
      );
      return $$3.size() == 1 ? (bqo)$$3.get(0) : null;
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if (!$$3.fB().e) {
         return baj.d;
      } else {
         $$0 = $$0.a(a);
         float $$6 = $$0.c(a) == cwh.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, ajw.dm, ajx.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return baj.a($$1.y);
      }
   }

   @Override
   protected void c(cgx $$0, gt $$1, cvo $$2) {
      if (!$$0.K().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         cti $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof ctq ? ((ctq)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            dye $$6 = this.c($$0, $$1, $$2) ? dye.c : dye.d;
            $$0.a($$1, this, 2, $$6);
         }

      }
   }

   private void f(cgx $$0, gt $$1, cvo $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      cti $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof ctq $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(a) == cwh.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(c, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(c, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }

   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(cvo $$0, cgx $$1, gt $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cti $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctq($$0, $$1);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(aD, a, c);
   }
}
