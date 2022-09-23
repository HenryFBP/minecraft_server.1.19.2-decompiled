import javax.annotation.Nullable;

public class cri extends cjt {
   private static final rq c = rq.c("container.stonecutter");
   public static final cwi a = cnf.aD;
   protected static final dxj b = cjt.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public cri(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c));
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.g().g());
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if ($$1.y) {
         return baj.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(akg.ay);
         return baj.b;
      }
   }

   @Nullable
   @Override
   public bam b(cvo $$0, cgx $$1, gt $$2) {
      return new bap(($$2x, $$3, $$4) -> new byh($$2x, $$3, bwx.a($$1, $$2)), c);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return b;
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
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
      $$0.a(a);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
