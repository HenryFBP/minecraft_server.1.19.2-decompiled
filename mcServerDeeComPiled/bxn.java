public class bxn extends bwm {
   private static final int o = 1;
   private static final int p = 1;
   public static final int k = 1;
   public static final int l = 2;
   public static final int m = 3;
   public static final int n = 100;
   private final bac q;
   private final bww r;

   public bxn(int $$0) {
      this($$0, new bao(1), new byc(1));
   }

   public bxn(int $$0, bac $$1, bww $$2) {
      super(bxq.q, $$0);
      a($$1, 1);
      a($$2, 1);
      this.q = $$1;
      this.r = $$2;
      this.a(new byd($$1, 0, 0, 0) {
         @Override
         public void d() {
            super.d();
            bxn.this.a(this.d);
         }
      });
      this.a($$2);
   }

   @Override
   public boolean b(buc $$0, int $$1) {
      if ($$1 >= 100) {
         int $$2 = $$1 - 100;
         this.a(0, $$2);
         return true;
      } else {
         switch($$1) {
            case 1:
               int $$4 = this.r.a(0);
               this.a(0, $$4 - 1);
               return true;
            case 2:
               int $$3 = this.r.a(0);
               this.a(0, $$3 + 1);
               return true;
            case 3:
               if (!$$0.fN()) {
                  return false;
               }

               cax $$5 = this.q.b(0);
               this.q.e();
               if (!$$0.fA().e($$5)) {
                  $$0.a($$5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public cax a(buc $$0, int $$1) {
      return cax.b;
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public boolean a(buc $$0) {
      return this.q.a($$0);
   }

   public cax l() {
      return this.q.a(0);
   }

   public int m() {
      return this.r.a(0);
   }
}
