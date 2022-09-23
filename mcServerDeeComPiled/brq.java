import java.util.function.Predicate;

public abstract class brq extends bcl implements bri {
   protected brq(bbr<? extends brq> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public ajx cR() {
      return ajx.f;
   }

   @Override
   public void w_() {
      this.ew();
      this.fN();
      super.w_();
   }

   protected void fN() {
      float $$0 = this.bg();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }

   }

   @Override
   protected boolean Q() {
      return true;
   }

   @Override
   protected ajv aG() {
      return ajw.jy;
   }

   @Override
   protected ajv aH() {
      return ajw.jx;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.jv;
   }

   @Override
   protected ajv x_() {
      return ajw.ju;
   }

   @Override
   public bcc.a en() {
      return new bcc.a(ajw.jw, ajw.jt);
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return -$$1.z($$0);
   }

   public static boolean a(chm $$0, gt $$1, amn $$2) {
      if ($$0.a(chg.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         cyu $$3 = $$0.q_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(chg.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.D().X() ? $$0.c($$1, 10) : $$0.D($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bbr<? extends brq> $$0, chm $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.ag() != bag.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bbr<? extends brq> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.ag() != bag.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bdc.a fO() {
      return bce.w().a(bdd.f);
   }

   @Override
   public boolean dM() {
      return true;
   }

   @Override
   protected boolean dN() {
      return true;
   }

   public boolean e(buc $$0) {
      return true;
   }

   @Override
   public cax h(cax $$0) {
      if ($$0.c() instanceof cbm) {
         Predicate<cax> $$1 = ((cbm)$$0.c()).e();
         cax $$2 = cbm.a(this, $$1);
         return $$2.b() ? new cax(caz.mR) : $$2;
      } else {
         return cax.b;
      }
   }
}
