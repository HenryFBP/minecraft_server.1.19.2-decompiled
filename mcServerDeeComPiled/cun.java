import javax.annotation.Nullable;

public class cun extends cti {
   private final cfz a = new cfz() {
      @Override
      public void a(cgx $$0, gt $$1, int $$2) {
         $$0.a($$1, cju.ce, $$2, 0);
      }

      @Override
      public void a(@Nullable cgx $$0, gt $$1, chn $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            cvo $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }

      }
   };

   public cun(gt $$0, cvo $$1) {
      super(ctk.i, $$0, $$1);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, cun $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cgx $$0, gt $$1, cvo $$2, cun $$3) {
      $$3.a.a((agg)$$0, $$1);
   }

   public tn c() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      pj $$0 = this.o();
      $$0.r("SpawnPotentials");
      return $$0;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean u() {
      return true;
   }

   public cfz d() {
      return this.a;
   }
}
