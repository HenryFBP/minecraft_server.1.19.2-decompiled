import java.util.Optional;

public class cjr extends cnf implements cjv, cql {
   private static final cwf e = cwe.C;
   private static final int f = 6;
   protected static final dxj a = cjt.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final dxj b = cjt.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final dxj c = cjt.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final dxj d = cjt.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   protected cjr(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(e, Boolean.valueOf(false)).a(aD, gy.c));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch((gy)$$0.c(aD)) {
         case d:
            return b;
         case c:
         default:
            return a;
         case e:
            return d;
         case f:
            return c;
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(e, aD);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(e) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      cvo $$4 = $$1.a_($$3);
      cvo $$5 = $$1.a_($$2.b());
      return ($$4.a(this) || $$4.a(akl.bn)) && ($$5.a(this) || $$5.a(cju.ql));
   }

   protected static boolean a(cgy $$0, gt $$1, dpv $$2, gy $$3) {
      cvo $$4 = cju.qm.m().a(e, Boolean.valueOf($$2.a(dpw.c))).a(aD, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if (($$1 == gy.a || $$1 == gy.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(e)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }

   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      Optional<gt> $$4 = n.a($$0, $$1, $$2.b(), gy.b, cju.ql);
      if (!$$4.isPresent()) {
         return false;
      } else {
         gt $$5 = ((gt)$$4.get()).b();
         cvo $$6 = $$0.a_($$5);
         return cjq.a($$0, $$5, $$6);
      }
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      Optional<gt> $$4 = n.a($$0, $$2, $$3.b(), gy.b, cju.ql);
      if ($$4.isPresent()) {
         gt $$5 = (gt)$$4.get();
         gt $$6 = $$5.b();
         gy $$7 = $$3.c(aD);
         a($$0, $$5, $$0.b_($$5), $$7);
         cjq.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(cju.ql);
   }
}
