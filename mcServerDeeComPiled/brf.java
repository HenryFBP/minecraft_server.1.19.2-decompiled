import java.util.List;

public class brf extends brm {
   public static final float b = bbr.v.k() / bbr.N.k();
   private static final int e = 1200;
   private static final int bX = 50;
   private static final int bY = 6000;
   private static final int bZ = 2;
   private static final int ca = 1200;

   public brf(bbr<? extends brf> $$0, cgx $$1) {
      super($$0, $$1);
      this.fp();
      if (this.d != null) {
         this.d.c(400);
      }

   }

   public static bdc.a n() {
      return brm.fJ().a(bdd.d, 0.3F).a(bdd.f, 8.0).a(bdd.a, 80.0);
   }

   @Override
   public int q() {
      return 60;
   }

   @Override
   protected ajv r() {
      return this.aU() ? ajw.fi : ajw.fj;
   }

   @Override
   protected ajv c(baw $$0) {
      return this.aU() ? ajw.fo : ajw.fp;
   }

   @Override
   protected ajv x_() {
      return this.aU() ? ajw.fl : ajw.fm;
   }

   @Override
   protected ajv t() {
      return ajw.fn;
   }

   @Override
   protected void T() {
      super.T();
      if ((this.S + this.ae()) % 1200 == 0) {
         bbg $$0 = new bbg(bbi.d, 6000, 2);
         List<agh> $$1 = bbh.a((agg)this.s, this, this.cY(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.b.a(new uj(uj.k, this.aM() ? 0.0F : 1.0F)));
      }

      if (!this.fw()) {
         this.a(this.da(), 16);
      }

   }
}
