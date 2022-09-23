public abstract class bog extends bcl {
   protected bog(bbr<? extends bog> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.j, 0.0F);
   }

   @Override
   public boolean dB() {
      return true;
   }

   @Override
   public bch ey() {
      return bch.e;
   }

   @Override
   public boolean a(cha $$0) {
      return $$0.f(this);
   }

   @Override
   public int J() {
      return 120;
   }

   @Override
   public int dO() {
      return 1 + this.s.w.a(3);
   }

   protected void a(int $$0) {
      if (this.bo() && !this.aU()) {
         this.i($$0 - 1);
         if (this.ca() == -20) {
            this.i(0);
            this.a(baw.h, 2.0F);
         }
      } else {
         this.i(300);
      }

   }

   @Override
   public void an() {
      int $$0 = this.ca();
      super.an();
      this.a($$0);
   }

   @Override
   public boolean cr() {
      return false;
   }

   @Override
   public boolean a(buc $$0) {
      return false;
   }

   public static boolean c(bbr<? extends bog> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      int $$5 = $$1.m_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.c()).a(akp.a) && $$1.a_($$3.b()).a(cju.C);
   }
}
