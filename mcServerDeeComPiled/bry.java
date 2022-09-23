public class bry extends bqz {
   private static final aaj<Boolean> c = aam.a(bry.class, aal.i);
   public static final String b = "StrayConversionTime";
   private int d;
   private int e;

   public bry(bbr<? extends bry> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.ai().a(c, false);
   }

   public boolean fK() {
      return this.ai().a(c);
   }

   public void v(boolean $$0) {
      this.Y.b(c, $$0);
   }

   @Override
   public boolean fJ() {
      return this.fK();
   }

   @Override
   public void k() {
      if (!this.s.y && this.bo() && !this.fA()) {
         if (this.fK()) {
            --this.e;
            if (this.e < 0) {
               this.fL();
            }
         } else if (this.al) {
            ++this.d;
            if (this.d >= 140) {
               this.a(300);
            }
         } else {
            this.d = -1;
         }
      }

      super.k();
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.fK() ? this.e : -1);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.a($$0.h("StrayConversionTime"));
      }

   }

   private void a(int $$0) {
      this.e = $$0;
      this.Y.b(c, true);
   }

   protected void fL() {
      this.a(bbr.aN, true);
      if (!this.aM()) {
         this.s.a(null, 1048, this.da(), 0);
      }

   }

   @Override
   public boolean do() {
      return false;
   }

   @Override
   protected ajv r() {
      return ajw.sH;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.sS;
   }

   @Override
   protected ajv x_() {
      return ajw.sJ;
   }

   @Override
   ajv q() {
      return ajw.sU;
   }

   @Override
   protected void a(baw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bbn $$3 = $$0.m();
      if ($$3 instanceof brc $$4 && $$4.fK()) {
         $$4.fL();
         this.a(caz.si);
      }

   }
}
