import javax.annotation.Nullable;

public class cla extends cjt {
   private final cjt a;

   public cla(cjt $$0, cvn.c $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.a.m(), 2);
      }

   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.r_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(cgd $$0, gt $$1) {
      for(gy $$2 : gy.values()) {
         dpv $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(akp.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().r_().a(40));
      }

      return this.m();
   }
}
